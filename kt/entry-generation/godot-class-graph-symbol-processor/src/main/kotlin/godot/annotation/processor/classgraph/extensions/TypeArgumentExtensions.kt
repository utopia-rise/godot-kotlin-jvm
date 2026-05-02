package godot.annotation.processor.classgraph.extensions

import godot.annotation.processor.classgraph.Context
import godot.annotation.processor.classgraph.constants.JVM_OBJECT
import godot.annotation.processor.classgraph.models.TypeDescriptor
import godot.entrygenerator.settings.Settings
import godot.entrygenerator.model.Type
import io.github.classgraph.ClassInfo
import io.github.classgraph.ClassRefTypeSignature
import io.github.classgraph.TypeArgument

fun TypeArgument.getType(settings: Settings): Type {
    val descriptor = TypeDescriptor(this)
    return descriptor.getMappedType(settings)
}

internal val TypeArgument.typeClassInfo: ClassInfo
    get() = requireNotNull(Context.getClassInfoOrNull(typeSignature.toString())) {
        "Could not resolve class info for type signature: ${typeSignature}"
    }
