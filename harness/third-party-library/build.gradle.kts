plugins {
    id("com.utopia-rise.godot-kotlin-jvm")
}

repositories {
    mavenCentral()
}

godot {
    isRegistrationFileGenerationEnabled.set(false)
}
