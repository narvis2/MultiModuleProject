object BuildPlugins {
    val GRADLE_TOOLS by lazy { "com.android.tools.build:gradle:${Versions.GRADLE_TOOLS}" }
    val KOTLIN_PLUGINS by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN_VERSION}" }
    val NAVIGATION_SAVE_ARGS by lazy { "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.NAVIGATION}" }
    val DAGGER_HILT by lazy { "com.google.dagger:hilt-android-gradle-plugin:${Versions.HILT}" }
}
object Dependencies {

    val androidX = AndroidX
    val kotlin = Kotlin
    val test = Test
    val androidTest = AndroidTest
    val hilt = Hilt
    val retrofit = Retrofit()
    val okHttp = OkHttp()
    val glide = Glide
    val gson by lazy { "com.google.code.gson:gson:${Versions.GSON}" }

    val material by lazy { "com.google.android.material:material:1.4.0" }

    val joda by lazy { "net.danlew:android.joda:2.10.12.2" }

    object AndroidX {
        val lifecycle = Lifecycle

        val navigation = Navigation
        val core by lazy { "androidx.core:core-ktx:1.6.0" }
        val appCompat by lazy { "androidx.appcompat:appcompat:1.3.1" }

        val fragmentKtx by lazy { "androidx.fragment:fragment-ktx:${Versions.FRAGMENT_KTX}" }
        val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:2.1.1" }
        val refreshLayout by lazy { "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.REFRESH_LAYOUT}" }
        val recyclerSelection by lazy { "androidx.recyclerview:recyclerview-selection:${Versions.RECYCLER_SELECTION}" }

        val paging = Paging
        object Paging {
            val runtime by lazy { "androidx.paging:paging-runtime-ktx:${Versions.PAGING}" }
            val common by lazy { "androidx.paging:paging-common:${Versions.PAGING}" }
        }


        object Lifecycle {
            val viewModel by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFE_CYCLE}" }
            val liveData by lazy { "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIFE_CYCLE}" }
        }
        object Navigation {
            val fragment by lazy { "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION}" }
            val ui by lazy { "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION}" }
        }
    } // androidX
    object Hilt {
        val android by lazy { "com.google.dagger:hilt-android:${Versions.HILT}" }
        val compiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.HILT}" }
    }
    object Kotlin {
        val KOTLIN_STDLIB by lazy { "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN_VERSION}" }
        val coroutineCore by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINE_CORE}" }
        val coroutineAndroid by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINE_ANDROID}" }
    }

    class Retrofit(
        private val name: String = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    ) : CharSequence by name {
        val gsonConverter by lazy { "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}" }

        override fun toString(): String = name
    }

    class OkHttp(
        private val name: String = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP}"
    ) : CharSequence by name {
        val loggingInterceptor by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP}" }

        override fun toString(): String = name
    }

    object Glide {
        val glide by lazy { "com.github.bumptech.glide:glide:${Versions.GLIDE}" }
        val compiler by lazy { "com.github.bumptech.glide:compiler:${Versions.GLIDE}" }
    }

    object Test {
        val junit by lazy { "junit:junit:4.13.2" }
    }

    object AndroidTest {
        val junit by lazy { "androidx.test.ext:junit:1.1.3" }
        val espresso by lazy { "androidx.test.espresso:espresso-core:3.4.0" }
    }
}
