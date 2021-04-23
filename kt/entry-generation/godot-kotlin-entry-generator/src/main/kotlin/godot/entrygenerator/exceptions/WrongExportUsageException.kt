package godot.entrygenerator.exceptions

import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe

class WrongExportUsageException(
    propertyDescriptor: PropertyDescriptor,
) : Exception(
    "You marked the property ${propertyDescriptor.fqNameSafe} with @Export. Only types inheriting CoreTypes, godot.Reference or primitive types can be exported."
)
