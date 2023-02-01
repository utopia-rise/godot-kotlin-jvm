import godot.dependencies.gradle.DependenciesVersions
import godot.dependencies.gradle.fullGodotKotlinJvmVersion

plugins {
    `kotlin-dsl`
    id("org.ajoberstar.grgit") version "4.1.1"
    id("com.utopia-rise.godot-publish")
    id("com.utopia-rise.godot-dependenices")
}

// the version is not inherited from the root build.gradle.kts as this here is a separate gradle project. Hence, we set it
// through the godot-dependenices plugin
version = fullGodotKotlinJvmVersion

buildscript {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}
repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(kotlin("gradle-plugin", version = "1.7.20"))
    implementation("com.squareup:kotlinpoet:${DependenciesVersions.kotlinPoetVersion}")
}

publishing {
    publications {
        @Suppress("UNUSED_VARIABLE") val godotToolsCommonGenerator by creating(MavenPublication::class) {
            pom {
                name.set(project.name)
                description.set("Godot common module for all tools.")
            }
            artifactId = project.name
            description = "Godot common module for all tools."
            from(components.getByName("java"))
        }
    }
}
