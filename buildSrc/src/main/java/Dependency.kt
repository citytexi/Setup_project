

object Versions {
    const val VERSION_KTX = "1.9.0"
    const val VERSION_NAV = "2.5.2"
    const val VERSION_LIFE = "2.6.0-alpha02"
    const val VERSION_ROOM = "2.4.3"
    const val VERSION_HILT = "2.43.2"
    const val VERSION_COROUTINE = "1.6.4"
    const val VERSION_RETROFIT = "2.9.0"
    const val VERSION_OKHTTP = "4.9.2"
    const val VERSION_GLIDE = "4.11.0"
}

object KTX {
    const val KTX = "androidx.core:core-ktx:${Versions.VERSION_KTX}"
}

object AndroidX {
    const val MATERIAL_JETPACK = "androidx.compose.material:material:1.3.0-beta02"
    const val MATERIAL = "com.google.android.material:material:1.6.1"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.1.4"
    const val APP_COMPAT = "androidx.appcompat:appcompat:1.5.1"
    const val LEGACY = "androidx.legacy:legacy-support-v4:1.0.0"
    const val ACTIVITY = "androidx.activity:activity-ktx:1.5.1"
    const val FRAGMENT = "androidx.fragment:fragment-ktx:1.5.2"
    const val DATASTORE = "androidx.datastore:datastore-preferences:1.0.0"
}

object Navigation {
    const val FRAGMENT_NAV = "androidx.navigation:navigation-fragment-ktx:${Versions.VERSION_NAV}"
    const val UI_NAV = "androidx.navigation:navigation-ui-ktx:${Versions.VERSION_NAV}"
    const val RUNTIME_NAV = "androidx.navigation:navigation-runtime-ktx:${Versions.VERSION_NAV}"
}

object Lifecycle {
    const val LIVEDATA_LIFE = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.VERSION_LIFE}"
    const val VIEWMODEL_LIFE = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.VERSION_LIFE}"
    const val RUNTIME_LIFE = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.VERSION_LIFE}"
}

object Room {
    const val ROOM_RUNTIME = "androidx.room:room-runtime:${Versions.VERSION_ROOM}"
    const val ROOM_KTX = "androidx.room:room-ktx:${Versions.VERSION_ROOM}"
    const val ROOM_COMPILE = "androidx.room:room-compiler:${Versions.VERSION_ROOM}"
}

object Hilt {
    const val HILT = "com.google.dagger:hilt-android:${Versions.VERSION_HILT}"
    const val HILT_COMPILE = "com.google.dagger:hilt-compiler:${Versions.VERSION_HILT}"
}

object Coroutine {
    const val COROUTINE_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.VERSION_COROUTINE}"
    const val COROUTINE_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.VERSION_COROUTINE}"
}

object Retrofit {
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.VERSION_RETROFIT}"
    const val RETROFIT_GSON = "com.squareup.retrofit2:converter-gson:${Versions.VERSION_RETROFIT}"
}

object OkHttp {
    const val OKHTTP = "com.squareup.okhttp3:okhttp:${Versions.VERSION_OKHTTP}"
    const val OKHTTP_LOGGING = "com.squareup.okhttp3:logging-interceptor:${Versions.VERSION_OKHTTP}"
}

object Glide {
    const val GLIDE = "com.github.bumptech.glide:glide:${Versions.VERSION_GLIDE}"
    const val GLIDE_COMPILE = "com.github.bumptech.glide:compiler:${Versions.VERSION_GLIDE}"
}

