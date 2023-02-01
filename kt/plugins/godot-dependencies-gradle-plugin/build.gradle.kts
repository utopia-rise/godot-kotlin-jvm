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
        create("godotDependenciesPlugin") {
            id = "com.utopia-rise.godot-dependenices"
            displayName = "Gradle plugin for central dependency version management"
            implementationClass = "godot.dependencies.gradle.DependenciesPlugin"
        }
    }
    isAutomatedPublishing = false
}

dependencies {
    implementation(kotlin("gradle-plugin", version = "1.7.20"))
}
