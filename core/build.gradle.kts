plugins {
    `android-library`
    `kotlin-android`
    id("maven-publish")
}

apply<MainGradlePlugin>()

android {
    namespace = "com.foss.core"

    buildFeatures {
        buildConfig = true
    }

    publishing {
        publishing {
            singleVariant("release") {
                withSourcesJar()
                withJavadocJar()
            }
        }
    }
}

dependencies {

    //Need below three in every module
    Dependencies.coreKtx
    Dependencies.appCompat
    hilt()
    hiltTesting()
    retrofit()
    timber()
    dataStore()
    moshi()

}

publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = "com.github.deadman00069"
            artifactId = "core"
            version = "2.0.4"
            afterEvaluate {
                from(components["release"])
            }
        }
    }
}