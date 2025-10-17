import versioninfo.fullGodotKotlinJvmVersion

plugins {
    alias(libs.plugins.kotlin.jvm)
    id("com.utopia-rise.godot-publish")
    id("com.utopia-rise.versioninfo")
    alias(libs.plugins.kotlinPreProcessors)
}

val isRelease = project.hasProperty("release")

kotlinDefinitions {
    definitionsObjectName.set("GodotJvmBuildConfig")
    define("DEBUG", !isRelease)
}

kotlin {
    jvmToolchain(libs.versions.toolchain.jvm.get().toInt())
}

java {
    withSourcesJar()
    withJavadocJar()
}

dependencies {
    // added here as a transitive dependency so the user can use reflection
    // we need to add it here so reflection is available where the code is loaded (Bootstrap.kt) otherwise it will not work
    api("com.utopia-rise:common:$fullGodotKotlinJvmVersion")
}

val targetSuffix = if (isRelease) "release" else "debug"

publishing {
    publications {
        @Suppress("UNUSED_VARIABLE", "unused")
        val godotInternalLibraryPublication by creating(MavenPublication::class) {
            pom {
                name.set("${project.name}-$targetSuffix")
                description.set("Contains internal utilities for the Godot kotlin libraries")
            }
            artifactId = "godot-internal-library-$targetSuffix"
            description = "Contains internal utilities for the Godot kotlin libraries"

            from(components["java"])
        }
    }
}
