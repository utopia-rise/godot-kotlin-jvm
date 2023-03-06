plugins {
    id("com.utopia-rise.godot-kotlin-jvm")
}

repositories {
    mavenCentral()
}

godot {
    classPrefix.set("FQNL")
    registrationFileBaseDir.set(projectDir.resolve("fqnLibraryScripts").also { it.mkdirs() })
    isRegistrationFileHierarchyEnabled.set(true)
    isFqNameRegistrationEnabled.set(true)
}
