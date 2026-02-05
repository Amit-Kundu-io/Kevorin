# Kevorin DateTime

Kevorin DateTime is a **Kotlin Multiplatform** date and time formatting library that works on:

* Android
* iOS
* Desktop (JVM)

It provides a simple and unified API to format **dates**, **times**, and **relative time** across all supported platforms.

---

# ✨ Features

* Kotlin Multiplatform support (Android, iOS, Desktop)
* Multiple international **date formats**
* 12‑hour and 24‑hour **time formats**
* **Relative time** support ("5 min ago", "Yesterday", etc.)
* Works directly from **commonMain** (no platform code required)

---

# 📦 Installation

Add the dependency to your **shared module**:

```kotlin
dependencies {
    implementation("com.kevorin:kevorin-datetime:1.0.0")
}
```

---

# 🚀 Usage

## Format Date

```kotlin
val formattedDate = KevorinDateFormat.format(
    epochSeconds = 13132132,
    format = KevorinDate.DD_MMM_YYYY
)
```

## Format Time

```kotlin
val formattedTime = KevorinTimeFormat.format(
    millis = 123132132132,
    format = TimeFormat.HH_MM_A
)
```

---

# 🖼 Compose Multiplatform Example

```kotlin
@Composable
fun DateTimeSample() {
    Column {
        Text(text = KevorinDateFormat.format(13132132, KevorinDate.DD_MMM_YYYY))
        Text(text = KevorinTimeFormat.format(123132132132, TimeFormat.HH_MM_A))
    }
}
```

This code works on:

* Android
* iOS
* Desktop

---

# 📅 Available Date Formats

| Format        | Example              |
| ------------- | -------------------- |
| ISO_DATE      | 2026-01-10           |
| ISO_DATE_TIME | 2026-01-10 14:30:25  |
| ISO_UTC       | 2026-01-10T14:30:25Z |
| DD_MM_YYYY    | 10-01-2026           |
| MM_DD_YYYY    | 01-10-2026           |
| YYYY_MM_DD    | 2026-01-10           |
| DD_MMM_YYYY   | 10 Jan 2026          |
| MMM_DD_YYYY   | Jan 10, 2026         |

---

# ⏰ Available Time Formats

| Format     | Example     |
| ---------- | ----------- |
| HH_MM      | 14:30       |
| HH_MM_SS   | 14:30:25    |
| HH_MM_A    | 02:30 PM    |
| HH_MM_SS_A | 02:30:25 PM |
| RELATIVE   | 5 min ago   |

---

# 🛠 Requirements

| Platform | Minimum Version     |
| -------- | ------------------- |
| Android  | API 29 (Android 10) |
| iOS      | iOS 13+             |
| Desktop  | JVM 11+             |

---

# 📚 Project Structure

```
composeApp/
 ├── commonMain      # Shared Kotlin code
 ├── androidMain     # Android specific
 ├── iosMain         # iOS specific
 └── jvmMain         # Desktop specific
```

---

# 👨‍💻 Author

**Amit Kundu**
Android & Kotlin Multiplatform Developer

---

# 📄 License

```
MIT License
```

---

# 🚧 Upcoming Features (Roadmap)

Kevorin DateTime is currently focused on **Date & Time formatting**.
More powerful features will be added in future releases:

### 🔜 Planned Additions

* Duration formatting ("2h 15m", "3 days")
* Date difference utilities (days between, age calculator, etc.)
* Time zone conversion support
* Localization & multi-language month/day names
* Calendar utilities (week start, leap year, etc.)
* Parsing string → date/time
* Compose UI ready **Date/Time picker helpers**
* Relative time improvements ("Just now", "Last week", etc.)

---

# ⭐ Vision

The goal of **Kevorin** is to become a complete **Kotlin Multiplatform Date, Time & Calendar toolkit** that works consistently across:

* Android
* iOS
* Desktop
* Future Kotlin platforms

---

If you like this project, consider giving it a ⭐ on GitHub to support development.
