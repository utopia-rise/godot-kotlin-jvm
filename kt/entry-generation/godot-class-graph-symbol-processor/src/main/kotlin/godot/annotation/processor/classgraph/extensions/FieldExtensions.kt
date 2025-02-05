package godot.annotation.processor.classgraph.extensions

import godot.annotation.RegisterSignal
import godot.annotation.processor.classgraph.Settings
import godot.annotation.processor.classgraph.models.TypeDescriptor
import godot.entrygenerator.ext.hasAnnotation
import godot.entrygenerator.model.*
import io.github.classgraph.AnnotationInfo
import io.github.classgraph.AnnotationInfoList
import io.github.classgraph.ClassInfo
import io.github.classgraph.FieldInfo
import io.github.classgraph.MethodInfo
import io.github.classgraph.ScanResult

context(ScanResult)
fun FieldInfo.mapToRegisteredProperty(settings: Settings, classInfo: ClassInfo): RegisteredProperty {
    // Map annotations
    val annotations = getAnnotations(classInfo)
        .mapNotNull { it.mapToGodotAnnotation(this) as? PropertyAnnotation }
        .toMutableList()

    // Handle enums and collections with enums
    val fieldType = this.typeDescriptor?.toString() ?: throw IllegalStateException("Type cannot be null")

    val typeDescriptor = TypeDescriptor(this, classInfo)

    if (!typeDescriptor.isPrimitive) {
        val typeClassInfo = typeDescriptor.typeClassInfo

        if (!annotations.hasAnnotation<EnumAnnotation>() && typeClassInfo.isEnum) {
            annotations.add(
                EnumHintStringAnnotation(
                    enumValueNames = typeClassInfo.fieldInfo
                        .filter { it.isEnum }
                        .map { it.name },
                    source = this
                )
            )
        }

        // Check if the property is a collection of enums
        if (!annotations.hasAnnotation<EnumAnnotation>() && fieldType.startsWith("kotlin.collections")) {
            val containingTypeDeclaration = typeClassInfo.typeSignature.typeParameters.firstOrNull()?.typeClassInfo
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
    val isOverridee = this.isOverridee

    return RegisteredProperty(
        fqName = fqdn,
        type = typeDescriptor.getMappedPropertyType(settings),
        isMutable = isMutable,
        isLateinit = typeDescriptor.isLateInit,
        isOverridee = isOverridee,
        annotations = annotations.toList(),
        symbolProcessorSource = this
    )
}

private const val signalParametersName = "parameters"

context(ScanResult)
fun FieldInfo.mapFieldToRegisteredSignal(settings: Settings, classInfo: ClassInfo): RegisteredSignal {
    val typeDescriptor = if (name.endsWith(DELEGATE_SUFFIX)) {
        val methodInfo = getGetter(classInfo)
        TypeDescriptor(methodInfo)
    } else {
        TypeDescriptor(this, classInfo)
    }

    val type = typeDescriptor.getMappedType(settings)

    val annotations = getAnnotations(classInfo)

    val parameterValues = annotations
        .first { it.classInfo.name == RegisterSignal::class.java.name }
        .parameterValues
    return RegisteredSignal(
        fqName = fqdn,
        type = type,
        parameterTypes = type.arguments(),
        parameterNames = (
                parameterValues
                    .getValue(signalParametersName) as Array<String>
                ).toList(),
        isOverridee = isOverridee,
        annotations = annotations.mapNotNull { it.mapToGodotAnnotation(this) as? PropertyAnnotation },
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
                it.hasAnnotation(annotationClass) && (it.name == toSyntheticAnnotations() || it.name == toGetterName())
            }

fun FieldInfo.hasAnnotation(annotationName: String, classInfo: ClassInfo): Boolean =
    hasAnnotation(annotationName) ||
            classInfo.methodInfo
                .any {
                    it.hasAnnotation(annotationName) && (it.name == toSyntheticAnnotations() || it.name == toGetterName())
                }


fun FieldInfo.toGetterName(): String = "get${capitalizedName()}"
fun FieldInfo.toSetterName(): String = "set${capitalizedName()}"
fun FieldInfo.toSyntheticAnnotations(): String = "${toGetterName()}\$annotations"

fun FieldInfo.getGetter(classInfo: ClassInfo): MethodInfo = classInfo
    .getMethodInfo(toGetterName())
    .first { it.parameterInfo.isEmpty() }

fun FieldInfo.getAnnotations(classInfo: ClassInfo): Collection<AnnotationInfo> = classInfo
    .getMethodInfo(toSyntheticAnnotations())
    .firstOrNull()
    ?.annotationInfo ?: listOf<AnnotationInfo>()
    .union(
        annotationInfo
    )
    .distinct()

private fun FieldInfo.capitalizedName(): String = sanitizedName
    .replaceFirstChar { char -> if (char.isLowerCase()) char.titlecase() else char.toString() }
