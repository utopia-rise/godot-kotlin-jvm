package godot.entrygenerator.generator.property.typehint.coretypes

import godot.entrygenerator.EntryGenerationType
import godot.entrygenerator.generator.property.typehint.PropertyTypeHintGenerator
import org.jetbrains.kotlin.descriptors.PropertyDescriptor

object CoreTypeTypeHintGeneratorProvider {
    fun provide(entryGenerationType: EntryGenerationType, propertyDescriptor: PropertyDescriptor): PropertyTypeHintGenerator {
        return when(entryGenerationType) {
            EntryGenerationType.KOTLIN_NATIVE -> KotlinNativeCoreTypeTypeHintGenerator(propertyDescriptor)
            EntryGenerationType.JVM -> JvmCoreTypeTypeHintGenerator(propertyDescriptor)
        }
    }
}
