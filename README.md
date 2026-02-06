# Kevorin KMP Library 🚀

>⚠️ Status: Under Active Development<br>
>This library is currently evolving. APIs and features may change until the first stable release.


**Kevorin** is a collection of **Kotlin Multiplatform utility modules** designed to help Android & KMP developers build apps **faster, cleaner, and with less boilerplate**.

---

## ⚙️ Installation

Add dependencies in your **shared KMP module**:

```kotlin
dependencies {
    implementation("io.github.amit-kundu-io:kevorin-datetime:1.0.0")
}
```

---

## 📦 Modules (Click to Open)


<details>
<summary><strong>🕒 DateTime Module</strong></summary>

### Features

* Date formatting
* Timestamp → readable date
* Time difference calculation
* Relative time (e.g., “2 min ago”)
# Kevorin DateTime

Simple **Kotlin Multiplatform** library for formatting **Date** and **Time**.

---

## Dependency

Add to your shared module:

```kotlin
dependencies {
    implementation("io.github.amit-kundu-io:kevorin-datetime:1.0.0")
}
```

---

## Usage

### Format Date

```kotlin
val date = KevorinDateFormat.format(
    epoch = 1770283029,
    format = KevorinDate.DD_MMM_YYYY
)
```

### Format Time

```kotlin
val time = KevorinTimeFormat.format(
    epoch = 1770283029,
    format = TimeFormat.HH_MM_A
)
```

---

## Compose Example

```kotlin
@Composable
fun DateTimeSample() {
    Column {
        Text(KevorinDateFormat.format(1770283029, KevorinDate.DD_MMM_YYYY))
        Text(KevorinTimeFormat.format(1770283029, TimeFormat.HH_MM_A))
    }
}
```

---

## Available Functions

### Date Formats

| Function      | Example Output       |
| ------------- | -------------------- |
| ISO_DATE      | 2026-01-10           |
| ISO_DATE_TIME | 2026-01-10 14:30:25  |
| ISO_UTC       | 2026-01-10T14:30:25Z |
| DD_MM_YYYY    | 10-01-2026           |
| MM_DD_YYYY    | 01-10-2026           |
| YYYY_MM_DD    | 2026-01-10           |
| DD_MMM_YYYY   | 10 Jan 2026          |
| DD_MMMM_YYYY  | 10 January 2026      |
| MMM_DD_YYYY   | Jan 10, 2026         |
| MMMM_DD_YYYY  | January 10, 2026     |
| MMM_DD        | Jan 10               |
| MMMM_DD       | January 10           |

### Time Formats

| Function   | Example Output |
| ---------- | -------------- |
| HH_MM      | 14:30          |
| HH_MM_SS   | 14:30:25       |
| HH_MM_A    | 02:30 PM       |
| HH_MM_SS_A | 02:30:25 PM    |
| RELATIVE   | 2 min ago      |         |


</details>


## 👨‍💻 Author

**Amit Kundu**
