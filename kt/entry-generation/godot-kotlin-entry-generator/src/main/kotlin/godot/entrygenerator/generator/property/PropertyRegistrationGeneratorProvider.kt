package godot.entrygenerator.generator.property

import godot.entrygenerator.EntryGenerationType

object PropertyRegistrationGeneratorProvider {

    fun provide(entryGenerationType: EntryGenerationType): PropertyRegistrationGenerator {
        return when (entryGenerationType) {
            EntryGenerationType.KOTLIN_NATIVE -> KotlinNativePropertyRegistrationGenerator()
            EntryGenerationType.JVM -> JvmPropertyRegistrationGenerator()
        }
    }
}
