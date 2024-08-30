package godot.intellij.plugin.extension

import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.godotUtilPackage
import godot.tools.common.constants.signalPackage
import org.jetbrains.kotlin.idea.base.utils.fqname.fqName
import org.jetbrains.kotlin.js.descriptorUtils.getKotlinTypeFqName

import org.jetbrains.kotlin.types.KotlinType
import org.jetbrains.kotlin.types.typeUtil.supertypes

fun KotlinType?.isSignal(): Boolean {
    if (this == null) return false
    return if (getKotlinTypeFqName(false) == "$signalPackage.${GodotKotlinJvmTypes.signal}") {
        true
    } else {
        supertypes()
            .any { supertype ->
                supertype.getKotlinTypeFqName(false) == "$signalPackage.${GodotKotlinJvmTypes.signal}"
            }
    }
}



fun KotlinType.isCoreType(): Boolean = getKotlinTypeFqName(false)
    .removeSuffix("?") == "$godotCorePackage.${GodotTypes.coreType}"
    || supertypes().any { supertype -> supertype.isCoreType() }


fun KotlinType.isGodotPrimitive(): Boolean = when (this.fqName?.asString()) {
    Int::class.qualifiedName,
    "$godotUtilPackage.${GodotKotlinJvmTypes.naturalT}",
    Long::class.qualifiedName,
    Float::class.qualifiedName,
    "$godotUtilPackage.${GodotKotlinJvmTypes.realT}",
    Double::class.qualifiedName,
    Boolean::class.qualifiedName,
    Byte::class.qualifiedName,
    Short::class.qualifiedName,
    String::class.qualifiedName -> true
    else -> false
}
