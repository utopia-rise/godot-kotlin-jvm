import godot.registrar.generator.settings.RegistrationFileLayoutMode

plugins {
    id("com.utopia-rise.godot-kotlin-jvm")
}

repositories {
    mavenCentral()
}

godot {
    registrationFilesDirectory.set(projectDir.resolve("scripts"))
    registrationFilesLayoutMode.set(RegistrationFileLayoutMode.HIERARCHICAL)
}
