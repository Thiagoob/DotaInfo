apply {
    from("$rootDir/library-build.gradle")
}

plugins {
//    kotlin("jvm") version Kotlin.version
    kotlin(KotlinPlugins.serialization) version Kotlin.version
}

dependencies {
    "implementation"(project(Modules.heroDomain))

    "implementation"(Ktor.android)
    "implementation"(Ktor.clientSerialization)
    "implementation"(Ktor.contentNegotiation)
    "implementation"(Ktor.core)
    "implementation"(Ktor.serializationJson)
}