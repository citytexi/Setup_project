plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.mediaproject.practiceproject"
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        applicationId = "com.mediaproject.practiceproject"
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

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
    implementation(project(":presentation"))
    implementation(project(":data"))
    implementation(project(":domain"))

    implementation(KTX.KTX)
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.4")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.0")
    implementation(Hilt.HILT)
    kapt(Hilt.HILT_COMPILE)
    implementation(Retrofit.RETROFIT)
    implementation(Retrofit.RETROFIT_GSON)
    implementation(OkHttp.OKHTTP)
    implementation(OkHttp.OKHTTP_LOGGING)
}