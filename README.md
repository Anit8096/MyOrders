# MyOrders - Android App

A native Android application built with **Kotlin + Jetpack Compose** that displays a "My Orders" screen with a clean, modern UI. Developed as part of the **OceanX Agency Mobile Application Developer Internship** assignment.

---

## 📱 Features

- **My Orders Screen** — Displays a list of past/current orders with status and details
- **Tab Sections** — Filter orders by status (e.g. Active, Completed, Cancelled)
- **Search Bar** — Search through orders easily
- **Bottom Navigation** — Smooth tab-based navigation with click effects
- **MVVM Architecture** — Clean separation of concerns using ViewModel + Repository
- **Dependency Injection** — Koin for DI via `AppModule`

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Kotlin |
| UI | Jetpack Compose + Material 3 |
| Architecture | MVVM |
| DI | Koin 4.2.1 |
| Navigation | Navigation Compose 2.9.8 (Nav3) |
| State Management | ViewModel + StateFlow |
| Serialization | kotlinx-serialization-json |
| Build System | Gradle (Kotlin DSL) |
| Min SDK | 24 |
| Compile / Target SDK | 36 |
| Java / JVM Target | 17 |

---

## 📂 Project Structure

```
com.oceanx.myorders
├── data
│   ├── model
│   │   └── Order.kt               # Order data model
│   └── repository
│       └── OrderRepository.kt     # Data source / repository
│
├── di
│   └── AppModule.kt               # Koin dependency injection module
│
├── navigation
│   ├── AppNavHost.kt              # Navigation graph (Nav3)
│   └── NavRoutes.kt               # Serializable route objects
│
├── ui
│   ├── components
│   │   ├── BottomNavBar.kt        # Bottom navigation bar composable
│   │   ├── OrderCard.kt           # Individual order card composable
│   │   ├── SearchBar.kt           # Search bar composable
│   │   ├── TabSection.kt          # Order filter tabs composable
│   │   └── TopSection.kt          # Top header composable
│   ├── screen
│   │   └── OrdersScreen.kt        # Main orders screen
│   ├── theme                      # App theme, colors, typography
│   └── viewmodel
│       └── OrdersViewModel.kt     # ViewModel for orders screen
│
├── MainActivity.kt
└── MyOrdersApp.kt                 # Koin Application class
```

---

## 🚀 Getting Started

### Prerequisites

- Android Studio (Meerkat or later recommended)
- Android SDK 36
- Kotlin 2.x
- JDK 17

### Installation

1. Clone the repository:
```bash
   git clone https://github.com/Anit8096/MyOrders.git
```

2. Open the project in **Android Studio**

3. Let Gradle sync and resolve all dependencies

4. Run on an emulator or physical device (API 24+)

---

## 🏗️ Architecture

This app follows **MVVM (Model-View-ViewModel)** architecture:

```
UI (Compose Screens & Components)
        ↕
ViewModel (OrdersViewModel)
        ↕
Repository (OrderRepository)
        ↕
Data Model (Order)
```

Dependency injection is handled by **Koin**, with modules defined in `AppModule.kt` and initialized in `MyOrdersApp`.

---

## 📸 Screenshots

> *(Add screenshots here)*

---

## 🎥 Demo

> *(Add screen recording link here)*

---

## 👤 Author

**Anit Bani** — [@Anit8096](https://github.com/Anit8096)

---

## 📋 Assignment Context

Built as part of the **OceanX Agency Mobile Application Developer Internship** selection process. The objective was to replicate a "My Orders" UI reference screen using native Android development with Kotlin.
