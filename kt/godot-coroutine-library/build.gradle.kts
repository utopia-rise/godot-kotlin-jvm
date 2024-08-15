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
    jvmToolchain(11)
}

java {
    withSourcesJar()
    withJavadocJar()
}

dependencies {
    // added here as a transitive dependency so the user can use reflection
    // we need to add it here so reflection is available where the code is loaded (Bootstrap.kt) otherwise it will not work
    api(kotlin("reflect", version = libs.versions.kotlin.get()))
    implementation("com.utopia-rise:tools-common:$fullGodotKotlinJvmVersion")
    testImplementation("junit", "junit", "4.12")
}

val targetSuffix = if (isRelease) "release" else "debug"

publishing {
    publications {
        @Suppress("UNUSED_VARIABLE")
        val godotCoroutineLibraryPublication by creating(MavenPublication::class) {
            pom {
                name.set("${project.name}-$targetSuffix")
                description.set("Godot library extension allowing the use of coroutines in a Godot context.")
            }
            artifactId = "godot-coroutine-library-$targetSuffix"
            description = "Godot library extension allowing the use of coroutines in a Godot context."
            artifact(tasks.jar)
            artifact(tasks.getByName("sourcesJar"))
            artifact(tasks.getByName("javadocJar"))
        }
    }
}
