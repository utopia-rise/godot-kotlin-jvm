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
            implementationClass = "godot.publish.gradle.mavencentral.PublishToMavenCentralPlugin"
        }
    }
    isAutomatedPublishing = false
}

dependencies {
    implementation(kotlin("gradle-plugin", version = "1.7.20"))
}
