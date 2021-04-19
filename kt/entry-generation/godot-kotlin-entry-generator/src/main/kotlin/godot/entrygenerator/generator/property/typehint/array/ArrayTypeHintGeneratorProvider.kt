package godot.entrygenerator.generator.property.typehint.array

import godot.entrygenerator.EntryGenerationType
import godot.entrygenerator.generator.property.typehint.PropertyTypeHintGenerator
import org.jetbrains.kotlin.descriptors.PropertyDescriptor

object ArrayTypeHintGeneratorProvider {
    fun provide(entryGenerationType: EntryGenerationType, propertyDescriptor: PropertyDescriptor): PropertyTypeHintGenerator {
        return when(entryGenerationType) {
            EntryGenerationType.KOTLIN_NATIVE -> KotlinNativeArrayTypeHintGenerator(propertyDescriptor)
            EntryGenerationType.JVM -> JvmArrayTypeHintGenerator(propertyDescriptor)
        }
    }
}
