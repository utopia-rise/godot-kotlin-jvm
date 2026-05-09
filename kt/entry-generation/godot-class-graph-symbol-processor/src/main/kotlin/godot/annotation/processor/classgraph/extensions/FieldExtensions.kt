package godot.annotation.processor.classgraph.extensions

import godot.annotation.ArgumentName
import godot.annotation.GodotBaseType
import godot.core.Signal
import godot.annotation.processor.classgraph.Context
import godot.annotation.processor.classgraph.models.TypeDescriptor
import godot.entrygenerator.ext.hasAnnotation
import godot.entrygenerator.ext.isJavaCollection
import godot.entrygenerator.model.EnumAnnotation
import godot.entrygenerator.model.EnumHintStringAnnotation
import godot.entrygenerator.model.EnumListHintStringAnnotation
import godot.entrygenerator.model.PropertyAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.RegisteredSignal
import godot.entrygenerator.settings.Settings
import io.github.classgraph.AnnotationInfo
import io.github.classgraph.ClassInfo
import io.github.classgraph.FieldInfo
import io.github.classgraph.MethodInfo

fun FieldInfo.mapToRegisteredProperty(settings: Settings, classInfo: ClassInfo): RegisteredProperty {
    // Map annotations
    val annotations = getAnnotations(classInfo)
        .mapNotNull { it.mapToGodotAnnotation(this, fqName) as? PropertyAnnotation }
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
                            .map { it.name }
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
                            .map { it.name }
                    )
                )
            }
        }
    }

    // Check modifiers
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
        annotations = annotations.toList(),
    )
}

private const val signalParametersName = "value"

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
        .firstOrNull { it.classInfo.name == ArgumentName::class.java.name }
        ?.parameterValues

    return RegisteredSignal(
        fqName = fqName.replace("$", "."),
        type = type,
        parameterTypes = type.arguments(),
        parameterNames = (
                parameterValues
                    ?.getValue(signalParametersName) as? Array<String>
                )?.toList() ?: emptyList(),
        isOverridee = isOverridee,
        isOpenOrAbstract = isSignalOpenOrAbstract,
        annotations = annotations.mapNotNull { it.mapToGodotAnnotation(this, fqName) as? PropertyAnnotation },
    )
}

private val FieldInfo.isSignalOpenOrAbstract: Boolean
    get() = classInfo.methodInfo
        .firstOrNull { it.name == toGetterName() && it.parameterInfo.isEmpty() }
        ?.let { !it.isFinal } ?: false

val ClassInfo.signalInfo: List<FieldInfo>
    get() {
        val declaredSignalNames = declaredFieldInfo
            .filter { it.isDirectSignalDeclaration(this) }
            .map { it.sanitizedName }
            .toSet()

        return fieldInfo.filter {
            it.isDirectSignalDeclaration(this) &&
                !it.classInfo.hasAnnotation(GodotBaseType::class.java) &&
                (it.classInfo == this || it.sanitizedName !in declaredSignalNames)
        }
    }

fun FieldInfo.isDirectSignalDeclaration(classInfo: ClassInfo): Boolean {
    val typeDescriptor = when {
        classInfo.isScala -> TypeDescriptor(getGetter(classInfo))
        name.endsWith(DELEGATE_SUFFIX) -> TypeDescriptor(getGetter(classInfo))
        else -> TypeDescriptor(this, classInfo)
    }

    if (typeDescriptor.isPrimitive || typeDescriptor.isVoid) {
        return false
    }

    val signalTypeClassInfo = typeDescriptor.typeClassInfoOrNull ?: return false
    return signalTypeClassInfo.name == Signal::class.java.name ||
        signalTypeClassInfo.extendsSuperclass(Signal::class.java)
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
    getAnnotations(classInfo).any { it.name == annotationClass.name }

fun FieldInfo.hasAnnotation(annotationName: String, classInfo: ClassInfo): Boolean =
    getAnnotations(classInfo).any { it.name == annotationName }


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

fun FieldInfo.getAnnotations(classInfo: ClassInfo): Collection<AnnotationInfo> = getDirectAnnotations(classInfo)
    .flatMap { annotation -> annotation.getAnnotationChain() }
    .distinctBy { annotation -> annotation.name }

private fun FieldInfo.getDirectAnnotations(classInfo: ClassInfo): Collection<AnnotationInfo> = classInfo
    .getMethodInfo(toSyntheticAnnotations())
    .firstOrNull()
    ?.annotationInfo ?: listOf<AnnotationInfo>()
    .union(annotationInfo)
    .distinctBy { annotation -> annotation.name }

private fun FieldInfo.capitalizedName(): String = sanitizedName
    .replaceFirstChar { char -> if (char.isLowerCase()) char.titlecase() else char.toString() }
