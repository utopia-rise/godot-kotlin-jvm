plugins {
    id("com.utopia-rise.godot-kotlin-jvm")
}

repositories {
    mavenCentral()
}

godot {
    classPrefix.set("HL")
    isRegistrationFileGenerationEnabled.set(false)
    isRegistrationFileHierarchyEnabled.set(true)
}
