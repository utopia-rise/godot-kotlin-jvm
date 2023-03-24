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
            id = "com.utopia-rise.godot-dependencies"
            displayName = "Gradle plugin for central dependency version management"
            implementationClass = "godot.dependencies.gradle.DependenciesPlugin"
        }
    }
    isAutomatedPublishing = false
}

dependencies {
    implementation(kotlin("gradle-plugin", version = "1.8.10"))
    implementation("org.ajoberstar.grgit:grgit-gradle:4.1.1")
}
