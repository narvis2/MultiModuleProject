plugins {
    id("com.android.library")
    kotlin("android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = ConfigData.COMPILE_SDK_VERSION
    buildToolsVersion = ConfigData.BUILD_TOOLS_VERSION

    defaultConfig {
        minSdk = ConfigData.MIN_SDK_VERSION
        targetSdk = ConfigData.TARGET_SDK_VERSION
        versionCode = ConfigData.VERSION_CODE
        versionName = ConfigData.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
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

    implementation(Dependencies.kotlin.KOTLIN_STDLIB)
    implementation(Dependencies.androidX.core)
    implementation(Dependencies.androidX.appCompat)
    implementation(Dependencies.material)
    implementation(Dependencies.test.junit)
    implementation(Dependencies.androidTest.junit)
    implementation(Dependencies.androidTest.espresso)

    // Hilt
    implementation(Dependencies.hilt.android)
    kapt(Dependencies.hilt.compiler)
    // paging
    implementation(Dependencies.androidX.paging.runtime)
    testImplementation(Dependencies.androidX.paging.common)
    // Coroutine
    implementation(Dependencies.kotlin.coroutineCore)
    implementation(Dependencies.kotlin.coroutineAndroid)
    // Gson
    implementation(Dependencies.gson)
    // Retrofit
    implementation(Dependencies.retrofit)
    implementation(Dependencies.retrofit.gsonConverter)
    // OkHttp
    implementation(Dependencies.okHttp)
    implementation(Dependencies.okHttp.loggingInterceptor)
    // joda
    implementation(Dependencies.joda)

    implementation(project(":domain"))
}
kapt {
    correctErrorTypes = true
}