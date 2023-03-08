plugins {
    id("com.utopia-rise.godot-kotlin-jvm")
}

repositories {
    mavenCentral()
}

godot {
    classPrefix.set("FQNL")
    isRegistrationFileGenerationEnabled.set(false)
    isRegistrationFileHierarchyEnabled.set(true)
    isFqNameRegistrationEnabled.set(true)
}
