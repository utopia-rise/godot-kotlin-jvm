plugins {
    `kotlin-dsl`
}

buildscript {
    repositories {
        jcenter()
        gradlePluginPortal()
    }
}
repositories {
    jcenter()
    gradlePluginPortal()
}

dependencies {
    implementation(kotlin("gradle-plugin", version = "1.4.20"))
    implementation("com.squareup:kotlinpoet:1.5.0")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.11.0")
}
