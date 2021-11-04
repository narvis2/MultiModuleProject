plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs.kotlin")
    id("kotlin-parcelize")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = ConfigData.COMPILE_SDK_VERSION
    buildToolsVersion = ConfigData.BUILD_TOOLS_VERSION

    defaultConfig {
        applicationId = "com.example.multimoduleproject"
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
    buildFeatures {
        dataBinding = true
        viewBinding = false
    }
}

dependencies {
    implementation(Dependencies.kotlin.KOTLIN_STDLIB)
    implementation(Dependencies.androidX.core)
    implementation(Dependencies.androidX.appCompat)
    implementation(Dependencies.androidX.constraintLayout)
    implementation(Dependencies.material)
    implementation(Dependencies.test.junit)
    implementation(Dependencies.androidTest.junit)
    implementation(Dependencies.androidTest.espresso)
    // Fragment KTX
    implementation(Dependencies.androidX.fragmentKtx)
    // Refresh Layout
    implementation(Dependencies.androidX.refreshLayout)
    // RecyclerView Selection
    implementation(Dependencies.androidX.recyclerSelection)
    // Lifecycle
    implementation(Dependencies.androidX.lifecycle.viewModel)
    implementation(Dependencies.androidX.lifecycle.liveData)
    // Hilt
    implementation(Dependencies.hilt.android)
    kapt(Dependencies.hilt.compiler)
    // Navigation
    implementation(Dependencies.androidX.navigation.fragment)
    implementation(Dependencies.androidX.navigation.ui)
    // Paging
    implementation(Dependencies.androidX.paging.runtime)
    testImplementation(Dependencies.androidX.paging.common)
    // Gson
    implementation(Dependencies.gson)
    // Retrofit
    implementation(Dependencies.retrofit)
    implementation(Dependencies.retrofit.gsonConverter)
    // OkHttp
    implementation(Dependencies.okHttp)
    implementation(Dependencies.okHttp.loggingInterceptor)
    // Glide
    implementation(Dependencies.glide.glide)
    implementation(Dependencies.glide.compiler)
    // Coroutine
    implementation(Dependencies.kotlin.coroutineCore)
    implementation(Dependencies.kotlin.coroutineAndroid)
    // Joda
    implementation(Dependencies.joda)
    implementation(project(":data"))
    implementation(project(":domain"))
}
kapt {
    correctErrorTypes = true
}