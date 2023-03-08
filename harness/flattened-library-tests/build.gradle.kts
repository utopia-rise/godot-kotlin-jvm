plugins {
    id("com.utopia-rise.godot-kotlin-jvm")
}

repositories {
    mavenCentral()
}

godot {
    classPrefix.set("FL")
    isRegistrationFileGenerationEnabled.set(false)
    isRegistrationFileHierarchyEnabled.set(false)
}
