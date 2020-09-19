
plugins {
    kotlin("jvm") version "1.4.0"
    id("com.utopia-rise.godot-jvm") version "0.1.0-3.2"
}

repositories {
    jcenter()
}

dependencies {
    kapt("com.utopia-rise:godot-annotation-processor:${godot.utils.GodotBuildProperties.godotKotlinVersion}")
}