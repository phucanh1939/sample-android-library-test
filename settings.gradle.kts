pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            url = uri("https://maven.pkg.github.com/phucanh1939/sample-android-library")
            credentials {
                username = providers.gradleProperty("gpr.usr").getOrNull() ?: System.getenv("GITHUB_USERNAME")
                password = providers.gradleProperty("gpr.key").getOrNull() ?: System.getenv("GITHUB_TOKEN")
            }
        }
        google()
        mavenCentral()
    }
}

rootProject.name = "SampleAndroidLibraryTest"
include(":app")
