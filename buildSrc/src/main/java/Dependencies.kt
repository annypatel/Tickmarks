@file:Suppress("SpellCheckingInspection")

object Versions {

    object Sdk {
        const val min = 21
        const val compile = 28
        const val target = 28
    }

    const val jacoco = "0.8.4"
}

object Kotlin {
    const val jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:_"
}

object Detekt {
    const val formatting = "io.gitlab.arturbosch.detekt:detekt-formatting:_"
}

object Rx {
    const val java = "io.reactivex.rxjava2:rxjava:_"
    const val kotlin = "io.reactivex.rxjava2:rxkotlin:_"
    const val android = "io.reactivex.rxjava2:rxandroid:_"
}

object Hilt {
    const val core = "com.google.dagger:hilt-core:_"
    const val android = "com.google.dagger:hilt-android:_"
    const val compiler = "com.google.dagger:hilt-android-compiler:_"

    object AndroidX {
        const val viewModel = "androidx.hilt:hilt-lifecycle-viewmodel:_"
        const val compiler = "androidx.hilt:hilt-compiler:_"
    }

    object Test {
        const val runtime = "com.google.dagger:hilt-android-testing:_"
    }
}

object OkHttp {
    const val client = "com.squareup.okhttp3:okhttp:_"
    const val logging = "com.squareup.okhttp3:logging-interceptor:_"
}

object Retrofit {
    const val client = "com.squareup.retrofit2:retrofit:_"
    const val adapterRxJava = "com.squareup.retrofit2:adapter-rxjava2:_"
}

object RetroCrawler {
    const val converterJspoon = "com.github.annypatel.retrocrawler:converter-jspoon:_"
    const val jspoon = "pl.droidsonroids:jspoon:_"
}

object AndroidX {
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:_"
    const val appcompat = "androidx.appcompat:appcompat:_"
    const val fragment = "androidx.fragment:fragment-ktx:_"

    object Test {
        const val junit = "androidx.test.ext:junit:_"
        const val core = "androidx.test:core-ktx:_"
        const val runner = "androidx.test:runner:_"
        const val espresso = "androidx.test.espresso:espresso-core:_"
    }
}

object Room {
    const val runtime = "androidx.room:room-runtime:_"
    const val compiler = "androidx.room:room-compiler:_"
    const val rx = "androidx.room:room-rxjava2:_"
}

object Google {
    const val material = "com.google.android.material:material:_"
}

object DataBinding {
    const val compiler = "androidx.databinding:databinding-compiler:_"
    const val lint = "com.github.annypatel.databinding:lint-checks:_"
}

object LeakCanary {
    const val android = "com.squareup.leakcanary:leakcanary-android:_"
    const val instrumentation = "com.squareup.leakcanary:leakcanary-android-instrumentation:_"
}

object Test {
    const val junit = "junit:junit:_"
    const val mockito = "com.nhaarman.mockitokotlin2:mockito-kotlin:_"
    const val mockitoInline = "org.mockito:mockito-inline:_"
    const val robolectric = "org.robolectric:robolectric:_"
    const val bindingMapper = "com.github.annypatel.databinding:binding-mapper:_"
    const val rxidler = "com.squareup.rx.idler:rx2-idler:_"
    const val okReplay = "com.airbnb.okreplay:espresso:_"
}
