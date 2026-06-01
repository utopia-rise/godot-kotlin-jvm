package godot.annotation.processor.classgraph.extensions

import godot.annotation.processor.classgraph.Context
import godot.annotation.processor.classgraph.ProcessorSettings
import godot.annotation.processor.classgraph.models.TypeDescriptor
import godot.registration.model.types.Type
import io.github.classgraph.ClassInfo
import io.github.classgraph.TypeArgument

fun TypeArgument.getType(settings: ProcessorSettings): Type {
    val descriptor = TypeDescriptor(this)
    return descriptor.getMappedType(settings)
}

internal val TypeArgument.typeClassInfo: ClassInfo
    get() = requireNotNull(Context.getClassInfoOrNull(typeSignature.toString())) {
        "Could not resolve class info for type signature: ${typeSignature}"
    }
