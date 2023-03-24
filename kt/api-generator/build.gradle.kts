import godot.dependencies.gradle.DependenciesVersions
import godot.dependencies.gradle.fullGodotKotlinJvmVersion

plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    id("com.utopia-rise.godot-dependencies")
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
    implementation(kotlin("gradle-plugin", version = DependenciesVersions.supportedKotlinVersion))
    implementation("com.utopia-rise:tools-common:$fullGodotKotlinJvmVersion")
    implementation("com.squareup:kotlinpoet:${DependenciesVersions.kotlinPoetVersion}")
    implementation("com.fasterxml.jackson.core:jackson-databind:${DependenciesVersions.jacksonDatabindVersion}")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:${DependenciesVersions.jacksonDataformatXmlVersion}")
}
