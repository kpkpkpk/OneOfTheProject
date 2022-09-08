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

}
rootProject.name = "OneOfTheNewProject"
include(":app")
