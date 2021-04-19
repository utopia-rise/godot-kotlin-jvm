package godot.entrygenerator.filebuilder

import godot.entrygenerator.EntryGenerationType
import org.jetbrains.kotlin.resolve.BindingContext

object EntryFileBuilderProvider {

    fun provideMainEntryFileBuilder(generationType: EntryGenerationType, bindingContext: BindingContext): EntryFileBuilder {
        return when(generationType) {
            EntryGenerationType.KOTLIN_NATIVE -> KotlinNativeEntryFileBuilder(bindingContext)
            EntryGenerationType.JVM -> JvmEntryFileBuilder(bindingContext)
        }
    }
}
