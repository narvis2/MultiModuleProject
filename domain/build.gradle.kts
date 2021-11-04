plugins {
    id ("java-library")
    id ("kotlin")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
    implementation(Dependencies.kotlin.KOTLIN_STDLIB)
    implementation(Dependencies.kotlin.coroutineCore)
    implementation(Dependencies.kotlin.coroutineAndroid)
}