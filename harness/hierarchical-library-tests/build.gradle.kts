plugins {
    id("com.utopia-rise.godot-kotlin-jvm")
}

repositories {
    mavenCentral()
}

godot {
    classPrefix.set("HL")
    dummyFileBaseDir.set(projectDir.resolve("hlLibraryScripts").also { it.mkdirs() })
    isDummyFileHierarchyEnabled.set(true)
}
