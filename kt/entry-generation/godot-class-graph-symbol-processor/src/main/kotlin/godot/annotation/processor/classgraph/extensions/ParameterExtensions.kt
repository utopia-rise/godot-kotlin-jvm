package godot.annotation.processor.classgraph.extensions

import godot.annotation.processor.classgraph.models.TypeDescriptor
import godot.entrygenerator.settings.Settings
import godot.entrygenerator.model.ValueParameter
import io.github.classgraph.MethodParameterInfo

fun MethodParameterInfo.mapToValueParameter(settings: Settings, index: Int): ValueParameter {
    val typeDescriptor = TypeDescriptor(this)
    val type = typeDescriptor.getMappedType(settings)
    return ValueParameter(
        name ?: "arg$index",
        type,
        type.arguments
    )
}
