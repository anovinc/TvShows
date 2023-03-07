object Dependencies {

  object Android {
    const val core = "androidx.core:core-ktx:1.7.0"
  }

  object Compose {
    // BOM manages versions of all Compose libraries, so declaring them manually is not necessary
    const val bom = "androidx.compose:compose-bom:2023.01.00"
    const val material = "androidx.compose.material:material"
    const val uiTooling = "androidx.compose.ui:ui-tooling"
    const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview"

    const val activity = "androidx.activity:activity-compose:1.6.1"
  }

  object Test {
    const val junit = "junit:junit:4.13.2"
    const val androidJunit = "androidx.test.ext:junit:1.1.5"
    const val androidEspresso = "androidx.test.espresso:espresso-core:3.5.1"
  }

}