/**
 * To define plugins
 */
object BuildPlugins {
    val android by lazy { "com.android.tools.build:gradle:${Versions.gradlePlugin}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}" }
}

/**
 * To define dependencies
 */
object Deps {
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    val core by lazy { "androidx.core:core-ktx:${Versions.core}" }
    val activityCompose by lazy {"androidx.activity:activity-compose:${Versions.activityFragment}"}
    val fragment by lazy {"androidx.fragment:fragment-ktx:${Versions.activityFragment}"}
    val lifecycleRuntime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}" }
    val lifecycleViewmodelCompose by lazy { "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycle}" }
    val window by lazy { "androidx.window:window:${Versions.androidxWindow}" }
    val windowTesting by lazy { "androidx.window:window-testing:${Versions.androidxWindow}" }
    val navigationCompose by lazy { "androidx.navigation:navigation-compose:${Versions.androidxNavigation}" }
    val navigationTesting by lazy { "androidx.navigation:navigation-testing:${Versions.androidxNavigation}" }

    val testEspressoCore by lazy { "androidx.test.espresso:espresso-core:${Versions.espresso}" }
    val testEspressoWeb by lazy { "androidx.test.espresso:espresso-web:${Versions.espresso}" }

    val toolsBuildGradle by lazy { "com.android.tools.build:gradle:${Versions.gradlePlugin}" }
    val toolsLintLint by lazy { "com.android.tools.lint:lint:${Versions.lintMinCompose}" }
    val toolsLintApi by lazy { "com.android.tools.lint:lint-api:${Versions.lintMinCompose}" }
    val toolsLintTests by lazy { "com.android.tools.lint:lint-tests:${Versions.lintMinCompose}" }

    val timber by lazy { "com.jakewharton.timber:timber:${Versions.timber}" }
    val materialDesign by lazy { "com.google.android.material:material:${Versions.materialDesign}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}" }
    val junit by lazy { "junit:junit:${Versions.jUnit}" }

    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}" }
    val kotlinJdk8 by lazy { "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}" }
    val kotlinGradlePlugin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}" }

    val glide by lazy { "com.github.bumptech.glide:glide:${Versions.glide}" }
    val coilCoil by lazy { "io.coil-kt:coil:${Versions.coil}" }
    val coilGif by lazy { "io.coil-kt:coil-gif:${Versions.coil}" }
    val coilCompose by lazy { "io.coil-kt:coil-compose:${Versions.coil}" }

    val snapper by lazy {"dev.chrisbanes.snapper:snapper:${Versions.snapper}"}
    val composeUiUi by lazy{"androidx.compose.ui:ui:${Versions.compose}"}
    val composeUiUtil by lazy{"androidx.compose.ui:ui-util:${Versions.compose}"}
    val composeUiTooling by lazy{"androidx.compose.ui:ui-tooling:${Versions.compose}"}
    val composeUiToolingPreview by lazy{"androidx.compose.ui:ui-tooling-preview:${Versions.compose}"}
    val composeUiTestManifest by lazy{"androidx.compose.ui:ui-test-manifest:${Versions.compose}"}
    val composeFoundationFoundation by lazy{"androidx.compose.foundation:foundation:${Versions.compose}"}
    val composeFoundationLayout by lazy{"androidx.compose.foundation:foundation-layout:${Versions.compose}"}
    val composeMaterialMaterial by lazy{"androidx.compose.material:material:${Versions.compose}"}
    val composeMaterialIconsext by lazy{"androidx.compose.material:material-icons-extended:${Versions.compose}"}
    val composeAnimationAnimation by lazy{"androidx.compose.animation:animation:${Versions.compose}"}

    val androidGradleplugin by lazy{"com.android.tools.build:gradle:${Versions.gradlePlugin}"}

    val kotlinCoroutinesAndroid by lazy{"org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"}
    val kotlinCoroutinesTest by lazy{"org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"}

    val okhttpOkhttp by lazy{"com.squareup.okhttp3:okhttp:${Versions.okhttp}"}
    val okhttpMockwebserver by lazy{"com.squareup.okhttp3:mockwebserver:${Versions.okhttp}"}
    val squareupMockwebserver by lazy { "com.squareup.okhttp3:mockwebserver:${Versions.mockwebserver}" }
}