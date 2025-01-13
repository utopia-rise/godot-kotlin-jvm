package godot.annotation.processor.classgraph.extensions

import godot.annotation.processor.classgraph.Settings
import godot.annotation.processor.classgraph.constants.JVM_OBJECT
import godot.entrygenerator.model.Type
import io.github.classgraph.ClassRefTypeSignature
import io.github.classgraph.ScanResult
import io.github.classgraph.TypeArgument

context(ScanResult)
fun TypeArgument.getType(settings: Settings): Type {
    val typeSignature = typeSignature as ClassRefTypeSignature
    return typeSignature.getMappedType(settings)
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