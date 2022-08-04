object Compose {
    const val version = "1.2.0"

    const val foundation = "androidx.compose.foundation:foundation:$version"
    const val liveData = "androidx.compose.runtime:runtime-livedata:$version"
    const val material = "androidx.compose.material:material:$version"
    const val materialIcons = "androidx.compose.material:material-icons-core:$version"
    const val materialIconsExtended = "androidx.compose.material:material-icons-extended:$version"
    const val materialThemeAdapter = "com.google.android.material:compose-theme-adapter:$version"
    const val ui = "androidx.compose.ui:ui:$version"
    const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview:$version"

    private const val material3Version = "1.0.0-alpha15"

    const val material3 = "androidx.compose.material3:material3:$material3Version"
    const val material3WindowSizeClass = "androidx.compose.material3:material3-window-size-class:$material3Version"

    private const val material3ThemeAdapterVersion = "1.0.15"

    const val material3ThemeAdapter = "com.google.android.material:compose-theme-adapter-3:$material3ThemeAdapterVersion"
}

object ComposeTest {
    const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4:${Compose.version}"
}

object ComposeDebug {
    const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:${Compose.version}"
    const val uiTooling = "androidx.compose.ui:ui-tooling:${Compose.version}"
}