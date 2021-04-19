package godot.entrygenerator.generator.property.defaultvalue

import godot.entrygenerator.EntryGenerationType
import godot.entrygenerator.extension.isCompatibleList
import godot.entrygenerator.extension.isReference
import org.jetbrains.kotlin.builtins.KotlinBuiltIns
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.BindingContext

object DefaultValueExtractorProvider {

    fun provide(
        propertyDescriptor: PropertyDescriptor,
        bindingContext: BindingContext,
        entryGenerationType: EntryGenerationType
    ): DefaultValueExtractor {
        return when {
            propertyDescriptor.type.isReference(entryGenerationType) -> ResourceDefaultValueExtractor(
                propertyDescriptor,
                bindingContext,
                entryGenerationType
            )
            propertyDescriptor.type.isCompatibleList() -> ArrayDefaultValueExtractor(
                propertyDescriptor,
                bindingContext
            )
            KotlinBuiltIns.isSetOrNullableSet((propertyDescriptor.type)) -> EnumFlagDefaultValueExtractor(
                propertyDescriptor,
                bindingContext
            )
            else -> DefaultValueExtractor(
                propertyDescriptor,
                bindingContext
            )
        }
    }
}
