plugins {
    `kotlin-dsl`
    id("org.ajoberstar.grgit") version "4.1.1"
    id("com.utopia-rise.godot-publish")
}

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
    implementation("com.squareup:kotlinpoet:1.10.2")
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
