plugins {
    id("com.utopia-rise.godot-kotlin-jvm")
}

repositories {
    mavenCentral()
}

godot {
    classPrefix.set("LibraryPrefix")
    dummyFileBaseDir.set(projectDir.resolve("anotherBaseDirThanConsumer").also { it.mkdirs() })
    isDummyFileHierarchyEnabled.set(true)
}
