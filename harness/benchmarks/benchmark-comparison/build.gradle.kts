plugins {
    kotlin("jvm") version "1.9.23"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.9.0"
    `java-gradle-plugin`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
}

gradlePlugin {
    plugins {
        register("compareBenchmarkData") {
            id = "com.utopia-rise.compare-benchmark-data"
            implementationClass = "godot.CompareBenchmarkData"
        }
    }
}
