object Hilt {
    const val version = "2.42"
    private const val hiltExtensionsVersion = "1.0.0"

    const val android = "com.google.dagger:hilt-android:$version"
    const val compiler = "com.google.dagger:hilt-compiler:$version"
    const val gradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:$version"

    const val extensionsCommon = "androidx.hilt:hilt-common:$hiltExtensionsVersion"
    const val extensionsCompiler = "androidx.hilt:hilt-compiler:$hiltExtensionsVersion"
    const val extensionsNavigation = "androidx.hilt:hilt-navigation:$hiltExtensionsVersion"
    const val extensionsNavigationCompose = "androidx.hilt:hilt-navigation-compose:$hiltExtensionsVersion"
    const val extensionsNavigationFragment = "androidx.hilt:hilt-navigation-fragment:$hiltExtensionsVersion"
    const val extensionsViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:$hiltExtensionsVersion"
    const val extensionsWorkManager = "androidx.hilt:hilt-work:$hiltExtensionsVersion"
}

object HiltTest {
    const val hiltAndroidTesting = "com.google.dagger:hilt-android-testing:${Hilt.version}"
}