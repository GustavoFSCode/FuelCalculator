<h1 align="center"> FuelCalculator </h1>

<p align="center">
An Android fuel cost calculator built with Kotlin and XML. <br/>
</p>

<br>

<p align="center">
  <img alt="FuelCalculator banner showing the application's five screens" src=".github/banner-fuelcalculator.png" width="100%">
</p>

## 🚀 Technologies

This project was developed with the following technologies and tools:

- Kotlin
- XML
- Android SDK
- Material Components
- Gradle
- Android Studio

## 💻 Project

**FuelCalculator** is an Android application that estimates a trip's fuel cost based on travel distance, the vehicle's average fuel economy, and the price per liter.

Input is divided into steps, with a separate screen for each measurement. At the end, the application displays a summary of the entered values and the estimated trip cost.

The project was developed to practice Android development with **Kotlin** and interface design with **XML**.

### Features and applied concepts

- **Step-by-step input:** screens for distance, average fuel economy, and fuel price, using Activities and Intents for navigation and data passing.
- **Input validation:** checks for empty, invalid, or non-positive values.
- **Decimal precision:** a custom input filter limits entered values to two decimal places.
- **Trip summary:** displays distance, fuel economy, price per liter, and estimated cost, with formatted numeric values.
- **New calculation:** an option to return to the initial screen and start another simulation.
- **XML interface:** ConstraintLayout, custom visual resources, and Material Components themes and components.

## ▶️ Running the project

### Prerequisites

- [Git](https://git-scm.com/)
- Android Studio compatible with the project's Gradle and Android Gradle Plugin versions
- Android SDK Platform 36.1
- JDK 21 for the Gradle daemon, as configured in `gradle/gradle-daemon-jvm.properties`
- An emulator or physical device running Android 7.0 (API 24) or later

### Cloning the repository

```bash
git clone https://github.com/GustavoFSCode/FuelCalculator.git
cd FuelCalculator
```

### Running with Android Studio

1. Open the `FuelCalculator` folder in Android Studio.
2. Wait for Gradle sync to finish and install any requested SDK components.
3. Create and start an emulator in **Device Manager**, or connect a physical device with **USB debugging** enabled.
4. Select the device and click **Run ▶**.

### Running from the terminal

With the JDK and Android SDK configured and an emulator running or a device connected, run the following command from the project root:

**Windows — PowerShell:**

```powershell
.\gradlew.bat installDebug
```

**Linux or macOS:**

```bash
chmod +x gradlew
./gradlew installDebug
```

After installation, open **FuelCalculator** from the device's app list.

You can also run these commands in the VS Code or Cursor terminal, provided your Android environment is configured.
