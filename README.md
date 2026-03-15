# 📸 LiveAt500px

An Android application that connects to the **500px photography platform API** to display a live, browsable feed of stunning photography from around the world.

## 📱 Features

- **Live photo feed** — Browse real-time photos from 500px directly on your Android device
- **Tablet support** — Responsive layout optimized for both phones and tablets
- **Clean architecture** — Structured with MVC pattern for maintainable code
- **Custom library integration** — Uses TheCheeseLibrary for enhanced UI components

## 🛠️ Tech Stack

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=flat-square&logo=android&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=flat-square&logo=gradle&logoColor=white)

- **Language:** Java
- **Platform:** Android (phone & tablet)
- **Build System:** Gradle
- **API:** 500px REST API

## 📂 Project Structure

```
LiveAt500px/
├── app/                    # Main Android application module
├── TheCheesLibrary/        # Custom UI library module
├── gradle/wrapper/         # Gradle wrapper configuration
├── build.gradle            # Project build configuration
└── gradle.properties       # Project properties
```

## 🚀 Getting Started

### Prerequisites
- Android Studio (Arctic Fox or newer)
- Android SDK (API 21+)
- A valid [500px API key](https://500px.com/developer)

### Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/mitsuphap/LiveAt500px.git
   ```

2. Open the project in **Android Studio**

3. Add your 500px API key to the project configuration

4. Build and run on an emulator or physical device

## 📖 About

This project was built to practice Android development fundamentals including REST API integration, RecyclerView with custom adapters, and responsive multi-device layout design.

---

Made with ❤️ by [Sky (Sitanan) Mitsuphap](https://github.com/mitsuphap)
