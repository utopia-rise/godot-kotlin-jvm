package godot.entrygenerator.generator.signal

import godot.entrygenerator.EntryGenerationType

object SignalRegistrationGeneratorProvider {
    fun provide(entryGenerationType: EntryGenerationType): SignalRegistrationGenerator {
        return when(entryGenerationType) {
            EntryGenerationType.KOTLIN_NATIVE -> KotlinNativeSignalRegistrationGenerator()
            EntryGenerationType.JVM -> JvmSignalRegistrationGenerator()
        }
    }
}
