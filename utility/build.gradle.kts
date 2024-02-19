plugins {
    `android-library`
    `kotlin-android`
    id("maven-publish")
}

apply<MainGradlePlugin>()

android {
    namespace = "com.foss.utility"
    buildFeatures {
        buildConfig = true
    }
}

dependencies {
    implementation("androidx.annotation:annotation-jvm:1.7.1")
    Dependencies.coreKtx
    Dependencies.appCompat
}

publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = "com.github.deadman00069"
            artifactId = "utility"
            version = PublishingConfig.utilityVersion
            afterEvaluate {
                from(components["release"])
            }
        }
    }
}