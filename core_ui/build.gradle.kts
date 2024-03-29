plugins {
    `android-library`
    `kotlin-android`
    id("maven-publish")
}

apply<MainGradlePlugin>()

android {
    namespace = "com.foss.core_ui"

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeCompiler
    }
}

dependencies {
    //Need below three in every module
    Dependencies.coreKtx
    Dependencies.appCompat
    compose()
    composeNavigation()
    core()
}

publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = "com.github.deadman00069"
            artifactId = "core_ui"
            version = PublishingConfig.coreUIVersion
            afterEvaluate {
                from(components["release"])
            }
        }
    }
}