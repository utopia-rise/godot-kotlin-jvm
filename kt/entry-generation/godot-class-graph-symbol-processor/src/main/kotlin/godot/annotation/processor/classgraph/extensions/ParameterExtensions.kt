package godot.annotation.processor.classgraph.extensions

import godot.annotation.processor.classgraph.Settings
import godot.annotation.processor.classgraph.models.TypeDescriptor
import godot.entrygenerator.model.ValueParameter
import io.github.classgraph.MethodParameterInfo
import io.github.classgraph.ScanResult

context(ScanResult)
fun MethodParameterInfo.mapToValueParameter(settings: Settings): ValueParameter {
    val typeDescriptor = TypeDescriptor(this)
    return ValueParameter(
        name,
        typeDescriptor.getMappedType(settings),
        if (typeDescriptor.isPrimitive || typeDescriptor.isObject) {
            listOf()
        } else {
            typeDescriptor.typeClassInfo.getTypeParameters(settings)
        }
    )
}
