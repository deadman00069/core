//Need below two plugins in every module
plugins {
    `android-library`
    `kotlin-android`
    id("com.google.dagger.hilt.android")
    kotlin("kapt")
}
apply<MainGradlePlugin>()


android {
    namespace = "com.foss.sample"

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeCompiler
    }
}

dependencies {
    implementation("com.google.firebase:firebase-auth:22.3.0")
    //Default dependencies
    Dependencies.coreKtx
    Dependencies.androidLifecycleRuntime
    compose()
    unitTesting()
    hilt()
    hiltTesting()
    retrofit()
    constraintLayout()
    coilImage()
    timber()
    composeNavigation()

    coreUI()
    core()
    authData()
    authDomain()
    authPresentation()
    utilities()
    home()
    settings()
    onboardingPresentation()

}