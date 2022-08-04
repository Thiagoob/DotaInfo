plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = Android.compileSdk

    buildFeatures {
        compose = true
    }

    defaultConfig {
        minSdk = Android.minSdk
        targetSdk = Android.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
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