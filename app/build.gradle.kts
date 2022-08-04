plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("kotlin-parcelize")
}

android {
    compileSdk = Android.compileSdk

    buildFeatures {
        compose = true
    }

    defaultConfig {
        applicationId = Android.appId
        minSdk = Android.minSdk
        targetSdk = Android.targetSdk
        versionCode = Android.versionCode
        versionName = Android.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Compose.version
    }
}

dependencies {
    implementation(Activity.compose)
    implementation(AppCompat.core)
    implementation(Compose.foundation)
    implementation(Compose.material3)
    implementation(Compose.ui)
    implementation(Compose.uiToolingPreview)
    implementation(Core.ktx)
    implementation(Hilt.android)
    implementation(Kotlin.stdLib)
    implementation(Material.core)

    testImplementation(JUnit.core)

    debugImplementation(ComposeDebug.uiTestManifest)
    debugImplementation(ComposeDebug.uiTooling)
}