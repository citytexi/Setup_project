plugins {
    id("com.android.library")
    id("kotlin-android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.mediaproject.data"
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
    kotlinOptions {
        jvmTarget = AppConfig.jvmTarget
    }
}

dependencies {
    
    implementation(project(":domain"))

    implementation(KTX.KTX)
    implementation(AndroidX.MATERIAL)
    implementation(AndroidX.APP_COMPAT)
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    implementation(Hilt.HILT)
    kapt(Hilt.HILT_COMPILE)
    implementation(Retrofit.RETROFIT)
    implementation(Retrofit.RETROFIT_GSON)
    implementation(OkHttp.OKHTTP)
    implementation(OkHttp.OKHTTP_LOGGING)
    implementation(Coroutine.COROUTINE_CORE)
    implementation(Coroutine.COROUTINE_ANDROID)

}