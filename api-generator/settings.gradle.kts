

pluginManagement {
    includeBuild("../build-logic")
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
        google()
    }
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenLocal()
        mavenCentral()
        google()
    }

    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

plugins {
    // to automatically download the toolchain jdk if missing
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0" // https://plugins.gradle.org/plugin/org.gradle.toolchains.foojay-resolver-convention
}

includeBuild("../tools-common") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:tools-common")).using(project(":")) // assuming api-generator is the root project of api-generator/api-generator
    }
}
