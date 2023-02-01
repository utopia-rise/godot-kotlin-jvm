plugins {
    `kotlin-dsl`
}

buildscript {
    repositories {
        mavenCentral()
    }
}
repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("gradle-plugin", version = "1.7.20"))
}
