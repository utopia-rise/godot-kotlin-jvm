plugins {
    id("com.utopia-rise.godot-kotlin-jvm")
}

repositories {
    mavenCentral()
}

godot {
    classPrefix.set("FL")
    dummyFileBaseDir.set(projectDir.resolve("flLibraryScripts").also { it.mkdirs() })
    isDummyFileHierarchyEnabled.set(false)
}
