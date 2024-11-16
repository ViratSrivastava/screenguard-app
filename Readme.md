# Screen Guard App

folder structure

```project-root/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   ├── <your_package_name>/
│   │   │   │   │   ├── MainActivity.kt
│   │   │   │   │   ├── DeviceAdmin.kt
│   │   │   │   │   ├── MonitoringService.kt
│   │   │   │   │   └── utils/
│   │   │   │   │       └── ImageUtils.kt
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   └── activity_main.xml
│   │   │   │   ├── xml/
│   │   │   │   │   └── device_admin.xml
│   │   │   │   ├── drawable/ (optional - for app icons or images)
│   │   │   │   └── values/
│   │   │   │       ├── strings.xml
│   │   │   │       └── colors.xml
│   │   │   ├── assets/
│   │   │   │   └── baby_face_detector.tflite (weights added here later)
│   │   │   ├── AndroidManifest.xml
│   │   │   └── kotlin/ (optional - if you use additional Kotlin files)
│   │   ├── test/ (optional - for unit tests)
│   │   ├── androidTest/ (optional - for UI tests)
│   ├── build.gradle (Module-specific Gradle file)
├── build.gradle (Project-level Gradle file)
├── settings.gradle
└── gradle/ (auto-generated by Android Studio)
```