package godot.entrygenerator.extension

import godot.entrygenerator.model.GODOT_BASE_TYPE_ANNOTATION
import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.resolve.descriptorUtil.getAllSuperclassesWithoutAny
import org.jetbrains.kotlin.resolve.descriptorUtil.getSuperClassNotAny
import org.jetbrains.kotlin.types.asSimpleType

fun ClassDescriptor.getSuperTypeNameAsString(): String {
    return this
        .typeConstructor
        .supertypes
        .first()
        .asSimpleType()
        .getJetTypeFqName(false)
}

fun ClassDescriptor.getUserDefinedSuperclass(): ClassDescriptor? {
    return getSuperClassNotAny()
        ?.let { superClass ->
            val isGodotBaseClass = superClass
                .annotations
                .mapNotNull { it.fqName?.asString() }
                .contains(GODOT_BASE_TYPE_ANNOTATION)

            if (isGodotBaseClass) {
                null
            } else {
                superClass
            }
        }
}

fun ClassDescriptor.getGodotBaseSimpleClassName(): String {
    return requireNotNull(
        getAllSuperclassesWithoutAny()
            .firstOrNull() { superClassDescriptor ->
                superClassDescriptor
                    .annotations
                    .mapNotNull { it.fqName?.asString() }
                    .contains(GODOT_BASE_TYPE_ANNOTATION)
            }
            ?.fqNameSafe
            ?.asString()
            ?.substringAfterLast(".")
    ) {
        "Class $fqNameSafe does not inherit a godot base class"
    }
}
