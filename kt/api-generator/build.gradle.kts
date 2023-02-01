plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
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
        create("apiGeneratorPlugin") {
            id = "com.utopia-rise.api-generator"
            implementationClass = "godot.gradle.ApiGeneratorPlugin"
        }
    }
}

dependencies {
    implementation(kotlin("gradle-plugin", version = "1.7.20"))
    implementation("com.utopia-rise:tools-common")
    implementation("com.squareup:kotlinpoet:1.10.2")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.11.0")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.10.1")
}
