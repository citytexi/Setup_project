plugins {
    id("com.android.library")
    id("kotlin-parcelize")
    id("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    kotlin("kapt")
}

android {
    namespace = "com.mediaproject.practiceproject"
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            setProguardFiles(
                listOf(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures{
        dataBinding = true
        viewBinding = true
    }

    kotlinOptions {
        jvmTarget = AppConfig.jvmTarget
    }

}

dependencies {
    implementation(project(":data"))
    implementation(project(":domain"))

    implementation(KTX.KTX)
    implementation(AndroidX.MATERIAL)
    implementation(AndroidX.CONSTRAINT_LAYOUT)
    implementation(AndroidX.APP_COMPAT)
    implementation(AndroidX.LEGACY)
    implementation(AndroidX.ACTIVITY)
    implementation(AndroidX.FRAGMENT)
    implementation(AndroidX.DATASTORE)
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.4")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.0")
    implementation(Navigation.FRAGMENT_NAV)
    implementation(Navigation.UI_NAV)
    implementation(Navigation.RUNTIME_NAV)
    implementation(Lifecycle.LIVEDATA_LIFE)
    implementation(Lifecycle.VIEWMODEL_LIFE)
    implementation(Lifecycle.RUNTIME_LIFE)
    implementation(Hilt.HILT)
    kapt(Hilt.HILT_COMPILE)
    implementation (Coroutine.COROUTINE_ANDROID)
    implementation (Coroutine.COROUTINE_CORE)
    implementation (Retrofit.RETROFIT)
    implementation (Retrofit.RETROFIT_GSON)
    implementation (OkHttp.OKHTTP)
    implementation (OkHttp.OKHTTP_LOGGING)
    implementation (Coroutine.COROUTINE_CORE)
    implementation (Coroutine.COROUTINE_ANDROID)
}