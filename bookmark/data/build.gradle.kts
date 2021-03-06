plugins {
    tickmarks_android_library
}

android {
    defaultConfig {
        javaCompileOptions.annotationProcessorOptions {
            arguments += mapOf("room.schemaLocation" to "$projectDir/schemas")
        }
    }
}

dependencies {
    implementation(project(":base:data"))
    implementation(project(":base:domain"))
    implementation(project(":bookmark:domain"))
    implementation(Retrofit.client)
    implementation(RetroCrawler.jspoon)
    implementation(Room.runtime)
    implementation(Room.rx)
    kapt(Room.compiler)

    testImplementation(project(":test:domain"))

    androidTestImplementation(AndroidX.Test.core)
    androidTestImplementation(AndroidX.Test.runner)
}
