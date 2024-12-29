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
    compileOnly(project(":godot-api-library"))
    compileOnly(project(":godot-core-library"))
    implementation("com.utopia-rise:common:$fullGodotKotlinJvmVersion")
}

tasks {
    // here so the sourcesJar task has an explicit dependency on the generateApi task. Needed since gradle 8
    getByName("sourcesJar") {
        dependsOn(":godot-api-library:sourcesJar")
    }
}

val targetSuffix = if (isRelease) "release" else "debug"

publishing {
    publications {
        @Suppress("UNUSED_VARIABLE")
        val godotCoroutineLibraryPublication by creating(MavenPublication::class) {
            pom {
                name.set("${project.name}-$targetSuffix")
                description.set("Godot library extension build on top of the base Godot API.")
            }
            artifactId = "godot-extension-library-$targetSuffix"
            description = "Godot library extension build on top of the base Godot API."
            artifact(tasks.jar)
            artifact(tasks.getByName("sourcesJar"))
            artifact(tasks.getByName("javadocJar"))
        }
    }
}
