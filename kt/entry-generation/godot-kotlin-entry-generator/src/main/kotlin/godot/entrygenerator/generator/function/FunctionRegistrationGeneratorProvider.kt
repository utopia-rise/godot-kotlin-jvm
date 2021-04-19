package godot.entrygenerator.generator.function

import godot.entrygenerator.EntryGenerationType

object FunctionRegistrationGeneratorProvider {

    fun provide(generationType: EntryGenerationType): FunctionRegistrationGenerator {
        return when(generationType) {
            EntryGenerationType.KOTLIN_NATIVE -> KotlinNativeFunctionRegistrationGenerator()
            EntryGenerationType.JVM -> JvmFunctionRegistrationGenerator()
        }
    }
}
