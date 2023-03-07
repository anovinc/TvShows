
plugins {
  id("com.android.application")
  kotlin("android")
  kotlin("kapt")
  id("com.google.dagger.hilt.android")
}

android {
  namespace = "com.tvshows.app"
  compileSdk = 33

  defaultConfig {
    applicationId = "com.tvshows.app"
    minSdk = 28
    targetSdk = 33
    versionCode = 1
    versionName = "1.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    vectorDrawables {
      useSupportLibrary = true
    }
  }

  buildTypes {
    getByName("release") {
      isMinifyEnabled = false
      proguardFiles(
        getDefaultProguardFile("proguard-android-optimize.txt"),
        "proguard-rules.pro")
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
      targetCompatibility = JavaVersion.VERSION_1_8
  }
  kotlinOptions {
    jvmTarget = "1.8"
  }
  buildFeatures {
    compose=  true
  }
  composeOptions {
    kotlinCompilerExtensionVersion = Versions.kotlinCompilerExtension
  }
  packagingOptions {
    resources {
      excludes += "/META-INF/{AL2.0,LGPL2.1}"
    }
  }
}

dependencies {

  with(Dependencies.Android) {
    implementation(core)
  }

  with(Dependencies.Compose) {
    platform(bom).let {
      implementation(it)
      androidTestImplementation(it)
    }
    implementation(material)
    debugImplementation(uiTooling)
    implementation(uiToolingPreview)
    implementation(activity)
    implementation(navigation)
    implementation(hiltNavigation)
  }

  with(Dependencies.Test) {
    testImplementation(junit)
    androidTestImplementation(androidJunit)
    androidTestImplementation(androidEspresso)
  }

  with(Dependencies.Hilt) {
    implementation(android)
    kapt(kaptAndroidCompiler)
  }
}