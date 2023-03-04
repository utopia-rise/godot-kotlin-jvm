plugins {
    id("com.utopia-rise.godot-kotlin-jvm")
}

repositories {
    mavenCentral()
}

godot {
    classPrefix.set("FQNL")
    dummyFileBaseDir.set(projectDir.resolve("fqnLibraryScripts").also { it.mkdirs() })
    isDummyFileHierarchyEnabled.set(true)
    isFqNameRegistrationEnabled.set(true)
}
