package godot.annotation.processor.classgraph.extensions

import godot.annotation.Export
import godot.annotation.RegisterSignal
import godot.annotation.processor.classgraph.ProcessorSettings
import godot.annotation.processor.classgraph.models.TypeDescriptor
import godot.registration.model.RegisteredProperty
import godot.registration.model.RegisteredSignal
import godot.registration.model.hint.property.EnumHint
import godot.registration.model.hint.property.EnumHintStringHint
import godot.registration.model.hint.property.EnumListHintStringHint
import godot.registration.model.hint.property.PropertyHint
import io.github.classgraph.AnnotationInfo
import io.github.classgraph.ClassInfo
import io.github.classgraph.FieldInfo
import io.github.classgraph.MethodInfo

fun FieldInfo.mapToRegisteredProperty(settings: ProcessorSettings, classInfo: ClassInfo): RegisteredProperty {
    val typeDescriptor = TypeDescriptor(this, classInfo)

    val hints = collectPropertyHints(classInfo, typeDescriptor)

    val isExported = hasAnnotation(Export::class.java, classInfo)
    val isMutable = !this.isFinal
    val isOverridee = this.isOverridee

    val getterFqName = if (classInfo.isScala) {
        getGetter(classInfo).fqName.replace("$", ".")
    } else {
        null
    }

    val setterFqName = if (classInfo.isScala) {
        val fqName = getSetter(classInfo).fqName
        val split = fqName.split("$")
        "${split.dropLast(1).joinToString(".")}$${split.last()}"
    } else {
        null
    }

    return RegisteredProperty(
        fqName = fqName.replace("$", "."),
        type = typeDescriptor.getMappedPropertyType(settings),
        getterFqName = getterFqName,
        setterFqName = setterFqName,
        isMutable = isMutable,
        isLateinit = typeDescriptor.isLateInit,
        isOverridee = isOverridee,
        isExported = isExported,
        hints = hints,
    )
}

/** Collects the explicit hint annotations plus the implicit enum hints derived from the property type. */
private fun FieldInfo.collectPropertyHints(classInfo: ClassInfo, typeDescriptor: TypeDescriptor): List<PropertyHint> {
    val hints = getAnnotations(classInfo)
        .mapNotNull { it.toPropertyHint(this) }
        .toMutableList()

    val fieldType = this.typeDescriptor?.toString() ?: throw IllegalStateException("Type cannot be null")

    if (!typeDescriptor.isPrimitive) {
        val typeClassInfo = typeDescriptor.typeClassInfo

        if (hints.none { it is EnumHint } && typeClassInfo.isEnum) {
            hints.add(
                EnumHintStringHint(
                    enumValueNames = typeClassInfo.fieldInfo
                        .filter { it.isEnum }
                        .map { it.name }
                )
            )
        }

        // Collection of enums -> list-style enum hint.
        if (hints.none { it is EnumHint } &&
            (fieldType.startsWith("kotlin.collections") || fieldType.isJavaCollectionDescriptor())
        ) {
            val containedTypeDeclaration = typeDescriptor.typeArguments.firstOrNull()?.typeClassInfo
            if (containedTypeDeclaration?.isEnum == true) {
                hints.add(
                    EnumListHintStringHint(
                        enumValueNames = containedTypeDeclaration.fieldInfo
                            .filter { it.isEnum }
                            .map { it.name }
                    )
                )
            }
        }
    }

    return hints.toList()
}

private const val signalParametersName = "parameters"

@Suppress("UNCHECKED_CAST")
fun FieldInfo.mapFieldToRegisteredSignal(settings: ProcessorSettings, classInfo: ClassInfo): RegisteredSignal {
    val typeDescriptor = when {
        classInfo.isScala -> TypeDescriptor(getGetter(classInfo))
        name.endsWith(DELEGATE_SUFFIX) -> TypeDescriptor(getGetter(classInfo))
        else -> TypeDescriptor(this, classInfo)
    }

    val type = typeDescriptor.getMappedType(settings)

    val parameterValues = getAnnotations(classInfo)
        .first { it.classInfo.name == RegisterSignal::class.java.name }
        .parameterValues

    return RegisteredSignal(
        fqName = fqName.replace("$", "."),
        type = type,
        parameterTypes = type.genericArguments,
        parameterNames = (parameterValues.getValue(signalParametersName) as Array<String>).toList(),
        isFunctionReference = classInfo.isScala,
        isOverridee = isOverridee,
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


fun FieldInfo.toGetterName(): String =
    if (isKotlinBooleanIsProperty()) name else "get${capitalizedName()}"

fun FieldInfo.toSetterName(): String =
    if (isKotlinBooleanIsProperty()) "set${name.removePrefix("is")}" else "set${capitalizedName()}"

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

private fun FieldInfo.isKotlinBooleanIsProperty(): Boolean {
    if (!name.startsWith("is") || name.length <= 2 || !name[2].isUpperCase()) {
        return false
    }

    return typeDescriptor.toString() in setOf("boolean", "java.lang.Boolean", "kotlin.Boolean")
}

private fun String.isJavaCollectionDescriptor(): Boolean = startsWith("java.util.")
