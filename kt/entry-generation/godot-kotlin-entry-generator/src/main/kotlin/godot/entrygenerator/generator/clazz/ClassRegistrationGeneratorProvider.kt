package godot.entrygenerator.generator.clazz

import godot.entrygenerator.EntryGenerationType

object ClassRegistrationGeneratorProvider {

    fun provideClassRegistrationProvider(generationType: EntryGenerationType): ClassRegistrationGenerator {
        return when(generationType) {
            EntryGenerationType.KOTLIN_NATIVE -> KotlinNativeClassRegistrationGenerator()
            EntryGenerationType.JVM -> JvmClassRegistrationGenerator()
        }
    }
}