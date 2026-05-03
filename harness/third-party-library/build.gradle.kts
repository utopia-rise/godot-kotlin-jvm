plugins {
    id("com.utopia-rise.godot-kotlin-jvm")
}

repositories {
    mavenCentral()
}

group = "com.godot.tests"

godot {
    isLibrary.set(true)
}

