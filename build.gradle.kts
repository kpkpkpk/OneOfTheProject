import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.DetektCreateBaselineTask
import io.gitlab.arturbosch.detekt.extensions.DetektExtension

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.2.1" apply false
    id("com.android.library") version "7.2.1" apply false
    id("org.jetbrains.kotlin.android") version "1.7.10" apply false
    id("io.gitlab.arturbosch.detekt") version libs.versions.detekt
}
allprojects {

    apply(plugin = "io.gitlab.arturbosch.detekt")

    dependencies {
        detektPlugins("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.21.0")
        detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.21.0")
    }
    tasks.withType<Detekt>().configureEach {
        jvmTarget = "11"
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
        jvmTarget = "11"
    }

    configure<DetektExtension> {
        toolVersion = "1.21.0"
        buildUponDefaultConfig = true
        autoCorrect = true
    }
}
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
