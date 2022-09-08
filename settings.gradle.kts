pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    enableFeaturePreview("VERSION_CATALOGS")
/*
    defaultLibrariesExtensionName.set("libs")
    versionCatalogs {
        create("libs") {
            alias("lifecycle-runtime")
                .to("androidx.lifecycle:lifecycle-runtime:2.2.0")
            alias("lifecycle-viewmodel-ktx").to("androidx.lifecycle", "lifecycle-viewmodel-ktx")
                .version {
                    strictly("[2.2.0, 2.3.0[")
                    prefer("2.3.1")
                }
        }
    }

    in build.gradle.kts (App)
    implementation(libs.bundles.kotlin)
    implementation(libs.junit)
    implementation(libs.android.tools.lint.lint)
 play with previous line: type "libs." after that "android" and see at libs.versions.toml
 Project -> gradle -> libs.versions.toml
 https://github.com/google/accompanist/blob/main/gradle/libs.versions.toml
    */
}
rootProject.name = "OneOfTheNewProject"
include(":app")
