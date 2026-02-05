package org.amitkundu.kevorin

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.amitkundu.kevorin.date_time_demo.KevorinDateTimeDemoScreen

@Composable
@Preview
fun App() {
    MaterialTheme {
        Scaffold {
            Box(
                Modifier.padding(it)
            ) {
                KevorinDateTimeDemoScreen()
            }
        }

    }
}