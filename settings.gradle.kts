pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MobileQuickLaunchKit"
include(":app")
include(":core")
include(":utility")
include(":core_ui")
include(":auth:auth_data")
include(":auth:auth_domain")
include(":auth:auth_presentation")
include(":shared")
include(":sample")
include(":home")
include(":settings")
include(":onboarding:onboarding_presentation")

