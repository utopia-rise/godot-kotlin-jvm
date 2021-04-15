plugins {
    `kotlin-dsl`
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

gradlePlugin {
    plugins {
        create("godotPublishPlugin") {
            id = "com.utopia-rise.godot-publish"
            displayName = "Gradle plugin for publishing godot kotlin jvm to maven central"
            implementationClass = "publish.mavencentral.PublishToMavenCentralPlugin"
        }
    }
    isAutomatedPublishing = false
}

dependencies {
    implementation(kotlin("gradle-plugin", version = "1.4.32"))
    implementation("com.squareup:kotlinpoet:1.5.0")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.11.0")
}
