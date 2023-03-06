plugins {
    id("com.utopia-rise.godot-kotlin-jvm")
}

repositories {
    mavenCentral()
}

godot {
    classPrefix.set("HL")
    registrationFileBaseDir.set(projectDir.resolve("hlLibraryScripts").also { it.mkdirs() })
    isRegistrationFileHierarchyEnabled.set(true)
}
