package godot.entrygenerator.generator.property.typehint.primitives

import godot.entrygenerator.EntryGenerationType
import godot.entrygenerator.generator.property.typehint.PropertyTypeHintGenerator
import org.jetbrains.kotlin.descriptors.PropertyDescriptor

object PrimitivesTypeHintGeneratorProvider {
    fun provide(entryGenerationType: EntryGenerationType, propertyDescriptor: PropertyDescriptor): PropertyTypeHintGenerator {
        return when(entryGenerationType) {
            EntryGenerationType.KOTLIN_NATIVE -> KotlinNativePrimitivesTypeHintGenerator(propertyDescriptor)
            EntryGenerationType.JVM -> JvmPrimitivesTypeHintGenerator(propertyDescriptor)
        }
    }
}
