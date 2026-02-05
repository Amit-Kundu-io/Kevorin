package org.amitkundu.kevorin.date_time_demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.kevorin.datetime.date_format.KevorinDate
import com.kevorin.datetime.date_format.KevorinDateFormat
import com.kevorin.datetime.time_format.KevorinTimeFormat
import com.kevorin.datetime.time_format.TimeFormat

@Composable
fun KevorinDateTimeDemoScreen() {
    val sampleEpochSeconds : Long = 1770283029
    val sampleMillis : Long = 1770283029

    val dateFormats = listOf(
        "ISO_DATE" to KevorinDateFormat.format(sampleEpochSeconds, KevorinDate.ISO_DATE),
        "ISO_DATE_TIME" to KevorinDateFormat.format(sampleEpochSeconds, KevorinDate.ISO_DATE_TIME),
        "ISO_UTC" to KevorinDateFormat.format(sampleEpochSeconds, KevorinDate.ISO_UTC),
        "DD_MM_YYYY" to KevorinDateFormat.format(sampleEpochSeconds, KevorinDate.DD_MM_YYYY),
        "MM_DD_YYYY" to KevorinDateFormat.format(sampleEpochSeconds, KevorinDate.MM_DD_YYYY),
        "YYYY_MM_DD" to KevorinDateFormat.format(sampleEpochSeconds, KevorinDate.YYYY_MM_DD),
        "DD/MM/YYYY" to KevorinDateFormat.format(sampleEpochSeconds, KevorinDate.DD_MM_YYYY_SLASH),
        "MM/DD/YYYY" to KevorinDateFormat.format(sampleEpochSeconds, KevorinDate.MM_DD_YYYY_SLASH),
        "DD.MM.YYYY" to KevorinDateFormat.format(sampleEpochSeconds, KevorinDate.DD_MM_YYYY_DOT),
        "DD MMM YYYY" to KevorinDateFormat.format(sampleEpochSeconds, KevorinDate.DD_MMM_YYYY),
        "DD MMMM YYYY" to KevorinDateFormat.format(sampleEpochSeconds, KevorinDate.DD_MMMM_YYYY),
        "MMM DD, YYYY" to KevorinDateFormat.format(sampleEpochSeconds, KevorinDate.MMM_DD_YYYY),
        "MMMM DD, YYYY" to KevorinDateFormat.format(sampleEpochSeconds, KevorinDate.MMMM_DD_YYYY),
        "MMM DD" to KevorinDateFormat.format(sampleEpochSeconds, KevorinDate.MMM_DD),
        "MMMM DD" to KevorinDateFormat.format(sampleEpochSeconds, KevorinDate.MMMM_DD)
    )

    val timeFormats = listOf(
        "HH:mm" to KevorinTimeFormat.format(sampleMillis, TimeFormat.HH_MM),
        "HH:mm:ss" to KevorinTimeFormat.format(sampleMillis, TimeFormat.HH_MM_SS),
        "hh:mm a" to KevorinTimeFormat.format(sampleMillis, TimeFormat.HH_MM_A),
        "hh:mm:ss a" to KevorinTimeFormat.format(sampleMillis, TimeFormat.HH_MM_SS_A),
        "Relative" to KevorinTimeFormat.format(sampleMillis, TimeFormat.RELATIVE)
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Text(
                text = "Kevorin Date Formats",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold
            )
        }

        items(dateFormats) { (title, value) ->
            FormatCard(title = title, value = value)
        }

        item {
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Kevorin Time Formats",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold
            )
        }

        items(timeFormats) { (title, value) ->
            FormatCard(title = title, value = value)
        }
    }
}

@Composable
private fun FormatCard(title: String, value: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.primary,
                fontWeight = FontWeight.SemiBold
            )

            Text(
                text = value,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Medium
            )
        }
    }
}

