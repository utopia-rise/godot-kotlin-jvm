package godot.annotation.processor.classgraph.extensions

import godot.annotation.processor.classgraph.Settings
import godot.annotation.processor.classgraph.constants.JVM_OBJECT
import godot.annotation.processor.classgraph.models.TypeDescriptor
import godot.entrygenerator.model.Type
import io.github.classgraph.ClassInfo
import io.github.classgraph.ClassRefTypeSignature
import io.github.classgraph.ScanResult
import io.github.classgraph.TypeArgument

context(ScanResult)
fun TypeArgument.getType(settings: Settings): Type {
    val descriptor = TypeDescriptor(this)
    return descriptor.getMappedType(settings)
}

context(ScanResult)
private fun ClassRefTypeSignature.getMappedType(settings: Settings): Type {
    return if (fullyQualifiedClassName == JVM_OBJECT) {
        getJavaLangObjectType(settings)
    } else {
        this@ScanResult.getClassInfo(fullyQualifiedClassName).mapToType(
            typeArguments,
            settings
        )
    }
}

context(ScanResult)
internal val TypeArgument.typeClassInfo: ClassInfo
    get() = this@ScanResult.getClassInfo(typeSignature.toString())
