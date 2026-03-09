package godot.annotation.processor.classgraph.extensions

import godot.annotation.processor.classgraph.Context
import godot.annotation.processor.classgraph.Settings
import godot.annotation.processor.classgraph.constants.JVM_OBJECT
import godot.annotation.processor.classgraph.models.TypeDescriptor
import godot.entrygenerator.model.Type
import io.github.classgraph.ClassInfo
import io.github.classgraph.ClassRefTypeSignature
import io.github.classgraph.TypeArgument

fun TypeArgument.getType(settings: Settings): Type {
    val descriptor = TypeDescriptor(this)
    return descriptor.getMappedType(settings)
}

private fun ClassRefTypeSignature.getMappedType(settings: Settings): Type {
    return if (fullyQualifiedClassName == JVM_OBJECT) {
        getJavaLangObjectType(settings)
    } else {
        Context.scanResult.getClassInfo(fullyQualifiedClassName).mapToType(
            typeArguments,
            settings
        )
    }
}

internal val TypeArgument.typeClassInfo: ClassInfo
    get() = Context.scanResult.getClassInfo(typeSignature.toString())
