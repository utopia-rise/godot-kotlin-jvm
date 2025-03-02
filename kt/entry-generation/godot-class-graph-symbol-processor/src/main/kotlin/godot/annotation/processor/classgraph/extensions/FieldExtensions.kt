package godot.annotation.processor.classgraph.extensions

import godot.annotation.RegisterSignal
import godot.annotation.processor.classgraph.Settings
import godot.annotation.processor.classgraph.models.TypeDescriptor
import godot.entrygenerator.ext.hasAnnotation
import godot.entrygenerator.ext.isJavaCollection
import godot.entrygenerator.model.EnumAnnotation
import godot.entrygenerator.model.EnumHintStringAnnotation
import godot.entrygenerator.model.EnumListHintStringAnnotation
import godot.entrygenerator.model.PropertyAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.RegisteredSignal
import io.github.classgraph.AnnotationInfo
import io.github.classgraph.ClassInfo
import io.github.classgraph.FieldInfo
import io.github.classgraph.MethodInfo

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
        if (!annotations.hasAnnotation<EnumAnnotation>() &&
            (fieldType.startsWith("kotlin.collections") || fieldType.isJavaCollection())) {
            val containedTypeDeclaration = typeDescriptor.typeArguments.firstOrNull()?.typeClassInfo
            if (containedTypeDeclaration?.isEnum == true) {
                annotations.add(
                    EnumListHintStringAnnotation(
                        enumValueNames = containedTypeDeclaration.fieldInfo
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

    val getterFqName = if (classInfo.isScala) {
        getGetter(classInfo).fqdn.replace("$", ".")
    } else {
        null
    }

    val setterFqName = if (classInfo.isScala) {
        val fqdn = getSetter(classInfo).fqdn
        val split = fqdn.split("$")
        "${split.dropLast(1).joinToString(".")}$${split.last()}"
    } else {
        null
    }

    return RegisteredProperty(
        fqName = fqdn.replace("$", "."),
        type = typeDescriptor.getMappedPropertyType(settings),
        getterFqName = getterFqName,
        setterFqName = setterFqName,
        isMutable = isMutable,
        isLateinit = typeDescriptor.isLateInit,
        isOverridee = isOverridee,
        annotations = annotations.toList(),
        symbolProcessorSource = this
    )
}

private const val signalParametersName = "parameters"

fun FieldInfo.mapFieldToRegisteredSignal(settings: Settings, classInfo: ClassInfo): RegisteredSignal {
    val typeDescriptor = when {
        classInfo.isScala -> {
            val getter = getGetter(classInfo)
            TypeDescriptor(getter)
        }
        name.endsWith(DELEGATE_SUFFIX) -> {
            val methodInfo = getGetter(classInfo)
            TypeDescriptor(methodInfo)
        }
        else -> TypeDescriptor(this, classInfo)
    }

    val type = typeDescriptor.getMappedType(settings)

    val annotations = getAnnotations(classInfo)

    val parameterValues = annotations
        .first { it.classInfo.name == RegisterSignal::class.java.name }
        .parameterValues

    return RegisteredSignal(
        fqName = fqdn.replace("$", "."),
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
fun FieldInfo.toScalaSetterName(): String = "${name}_\$eq"
fun FieldInfo.toSyntheticAnnotations(): String = "${toGetterName()}\$annotations"

fun FieldInfo.getGetter(classInfo: ClassInfo): MethodInfo {
    val correspondingMethodName = if (classInfo.isScala) {
        name
    } else {
        toGetterName()
    }

    return classInfo
        .getMethodInfo(correspondingMethodName)
        .first { it.parameterInfo.isEmpty() }
}

fun FieldInfo.getSetter(classInfo: ClassInfo): MethodInfo {
    val correspondingMethodName = if (classInfo.isScala) {
        toScalaSetterName()
    } else {
        toSetterName()
    }

    return classInfo
        .getMethodInfo(correspondingMethodName)
        .first {
            it.parameterInfo.size == 1 &&
                it.parameterInfo.first().typeDescriptor == typeDescriptor
        }
}

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
