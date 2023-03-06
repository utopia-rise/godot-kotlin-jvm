plugins {
    id("com.utopia-rise.godot-kotlin-jvm")
}

repositories {
    mavenCentral()
}

godot {
    classPrefix.set("FL")
    registrationFileBaseDir.set(projectDir.resolve("flLibraryScripts").also { it.mkdirs() })
    isRegistrationFileHierarchyEnabled.set(false)
}
