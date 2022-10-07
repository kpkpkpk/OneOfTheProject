import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.DetektCreateBaselineTask
import io.gitlab.arturbosch.detekt.extensions.DetektExtension

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.detekt)
    id("com.android.application") version "7.2.1" apply false
    id("com.android.library") version "7.2.1" apply false
    id("org.jetbrains.kotlin.android") version "1.7.10" apply false
}
allprojects {

    apply(plugin = "io.gitlab.arturbosch.detekt")

    dependencies {
        /**using rootProject.project instead of
         * simple libs because gradle don't fix problem with access
         * see: https://github.com/gradle/gradle/issues/16634#issuecomment-809345790
         **/
        detektPlugins(rootProject.project.libs.util.detektPlugin)
        detektPlugins(rootProject.project.libs.util.detektFormatting)
    }
    tasks.withType<Detekt>().configureEach {
        jvmTarget = JavaVersion.VERSION_11.toString()
        setSource(files("src"))
        exclude("**/androidTest/**")
        exclude("**/assets/**")
        exclude("**/res/**")
        exclude("**/test/**")
        exclude("**/test-ui-*/**")
        reports {
            html.required.set(true)
            html.outputLocation.set(file("${buildDir}/reports/detekt-results.html"))
        }
    }
    tasks.withType<DetektCreateBaselineTask>().configureEach {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    configure<DetektExtension> {
        toolVersion = rootProject.project.libs.versions.detekt.get()
        buildUponDefaultConfig = true
        autoCorrect = true
    }
}
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
