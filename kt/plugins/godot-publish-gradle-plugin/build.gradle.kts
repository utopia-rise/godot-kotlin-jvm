
plugins {
    alias(libs.plugins.kotlin.jvm)
    `java-gradle-plugin`
}

kotlin {
    jvmToolchain(17)
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
