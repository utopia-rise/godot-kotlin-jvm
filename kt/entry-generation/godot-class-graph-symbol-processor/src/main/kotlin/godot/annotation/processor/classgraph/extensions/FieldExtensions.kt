package godot.annotation.processor.classgraph.extensions

import godot.annotation.processor.classgraph.Settings
import godot.annotation.processor.classgraph.models.TypeDescriptor
import godot.entrygenerator.ext.hasAnnotation
import godot.entrygenerator.model.EnumAnnotation
import godot.entrygenerator.model.EnumHintStringAnnotation
import godot.entrygenerator.model.EnumListHintStringAnnotation
import godot.entrygenerator.model.PropertyAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.RegisteredSignal
import io.github.classgraph.ClassInfo
import io.github.classgraph.FieldInfo
import io.github.classgraph.ScanResult

context(ScanResult)
fun FieldInfo.mapToRegisteredProperty(settings: Settings): RegisteredProperty {
    // Map annotations
    val annotations = annotationInfo
        .mapNotNull { it.mapToGodotAnnotation(this) as? PropertyAnnotation }
        .toMutableList()

    // Handle enums and collections with enums
    val fieldType = this.typeDescriptor?.toString() ?: throw IllegalStateException("Type cannot be null")

    val typeDescriptor = TypeDescriptor(this)

    if (!typeDescriptor.isPrimitive) {
        val classInfo = typeDescriptor.typeClassInfo

        if (!annotations.hasAnnotation<EnumAnnotation>() && classInfo.isEnum) {
            annotations.add(
                EnumHintStringAnnotation(
                    enumValueNames = classInfo.fieldInfo
                        .filter { it.isEnum }
                        .map { it.name },
                    source = this
                )
            )
        }

        // Check if the property is a collection of enums
        if (!annotations.hasAnnotation<EnumAnnotation>() && fieldType.startsWith("kotlin.collections")) {
            val containingTypeDeclaration = classInfo.typeSignature.typeParameters.firstOrNull()?.typeClassInfo
            if (containingTypeDeclaration?.isEnum == true) {
                annotations.add(
                    EnumListHintStringAnnotation(
                        enumValueNames = containingTypeDeclaration.fieldInfo
                            .filter { it.isEnum }
                            .map { it.name },
                        source = this
                    )
                )
            }
        }
    }

    // Check modifiers
    val isMutable = !this.isFinal
    val isLateinit = this.annotationInfo.any { it.name == "kotlin.Lateinit" }
    val isOverridee = this.isOverridee

    return RegisteredProperty(
        fqName = fqdn,
        type = typeDescriptor.getMappedType(settings),
        isMutable = isMutable,
        isLateinit = isLateinit,
        isOverridee = isOverridee,
        annotations = annotations.toList(),
        symbolProcessorSource = this
    )
}

context(ScanResult)
fun FieldInfo.mapFieldToRegisteredSignal(settings: Settings): RegisteredSignal {
    val typeDescriptor = TypeDescriptor(this)
    val annotations = annotationInfo.mapNotNull { it.mapToGodotAnnotation(this) as? PropertyAnnotation }

    return RegisteredSignal(
        fqName = fqdn,
        type = typeDescriptor.getMappedType(settings),
        parameterTypes = typeDescriptor.typeClassInfo.getTypeParameters(settings),
        parameterNames = listOf(), //TODO: ClassGraph cannot parse expressions, if we want to use it we need to add parameters to the annotation
        isOverridee = isOverridee,
        annotations = annotations,
        symbolProcessorSource = this
    )
}

val FieldInfo.isOverridee: Boolean
    get() {
        return classInfo.methodInfo
            .filter {
                (it.name == toGetterName() || it.name == toSetterName())
            }
            .any { it.isOverridee }
    }

fun <T : Annotation> FieldInfo.hasAnnotation(annotationClass: Class<T>, classInfo: ClassInfo): Boolean =
    hasAnnotation(annotationClass) ||
        classInfo.methodInfo
            .any {
                it.hasAnnotation(annotationClass) && it.name == toSyntheticAnnotations()
            }

fun FieldInfo.toGetterName(): String = "get${capitalizedName()}"
fun FieldInfo.toSetterName(): String = "set${capitalizedName()}"
fun FieldInfo.toSyntheticAnnotations(): String = "${toGetterName()}\$annotations"

private fun FieldInfo.capitalizedName(): String =
    sanitizedName.replaceFirstChar { char -> if (char.isLowerCase()) char.titlecase() else char.toString() }
