import godot.entrygenerator.settings.RegistrationFileLayoutMode

plugins {
    id("com.utopia-rise.godot-kotlin-jvm")
}

repositories {
    mavenCentral()
}

godot {
    registrationFileBaseDir.set(projectDir.resolve("scripts"))
    registrationFileLayoutMode.set(RegistrationFileLayoutMode.HIERARCHICAL)
}
