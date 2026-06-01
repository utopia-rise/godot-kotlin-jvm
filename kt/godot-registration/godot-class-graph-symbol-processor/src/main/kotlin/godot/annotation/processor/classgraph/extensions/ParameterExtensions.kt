package godot.annotation.processor.classgraph.extensions

import godot.annotation.processor.classgraph.ProcessorSettings
import godot.annotation.processor.classgraph.models.TypeDescriptor
import godot.registration.model.ValueParameter
import io.github.classgraph.MethodParameterInfo

fun MethodParameterInfo.mapToValueParameter(settings: ProcessorSettings, index: Int): ValueParameter {
    val typeDescriptor = TypeDescriptor(this)
    return ValueParameter(
        name ?: "arg$index",
        typeDescriptor.getMappedType(settings),
    )
}
