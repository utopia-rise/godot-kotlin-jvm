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
    compileOnly("com.utopia-rise:common:$fullGodotKotlinJvmVersion")
    compileOnly(project(":godot-internal-library"))
    compileOnly(project(":godot-core-library"))
}

tasks {
    compileKotlin {
        dependsOn(":godot-library:generateAPI")
    }

    // here so the sourcesJar task has an explicit dependency on the generateApi task. Needed since gradle 8
    withType<Jar> {
        dependsOn(":godot-library:generateAPI")
    }
}

val targetSuffix = if (isRelease) "release" else "debug"

publishing {
    publications {
        @Suppress("UNUSED_VARIABLE")
        val godotLibraryPublication by creating(MavenPublication::class) {
            pom {
                name.set("${project.name}-$targetSuffix")
                description.set("Contains godot api as kotlin classes and jvm cpp interaction code.")
            }
            artifactId = "godot-api-library-$targetSuffix"
            description = "Contains godot generated api as kotlin classes and jvm cpp interaction code."
            artifact(tasks.jar)
            artifact(tasks.getByName("sourcesJar"))
            artifact(tasks.getByName("javadocJar"))
        }
    }
}
