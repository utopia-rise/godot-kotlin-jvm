package godot.intellij.plugin.extension

import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.godotUtilPackage
import godot.tools.common.constants.kotlinCollectionsPackage
import org.jetbrains.kotlin.analysis.api.KaSession
import org.jetbrains.kotlin.analysis.api.analyze
import org.jetbrains.kotlin.analysis.api.types.KaType
import org.jetbrains.kotlin.analysis.api.types.symbol
import org.jetbrains.kotlin.idea.codeinsight.utils.isEnum
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.psi.KtDeclaration

fun KtDeclaration.isType(classId: ClassId): Boolean {
    return analyze(this) {
        returnType.isClassType(classId)
    }
}

fun KtDeclaration.isOrInheritsType(classId: ClassId): Boolean {
    return analyze(this) {
        returnType.isOrInheritsType(classId, this)
    }
}

private fun KaType.isOrInheritsType(classId: ClassId, session: KaSession): Boolean {
    return with(session) {
        isClassType(classId) || allSupertypes.any { superType -> superType.isOrInheritsType(classId, session) }
    }
}

fun KtDeclaration.isCoreType(): Boolean {
    return analyze(this) {
        returnType.isCoreType(this)
    }
}

private fun KaType.isCoreType(session: KaSession): Boolean {
    return with(session) {
        isClassType(asClassId("$godotCorePackage.${GodotTypes.coreType}"))
            || allSupertypes.any { superType -> superType.isCoreType(session) }
    }
}

fun KtDeclaration.isSupportedJvmType(): Boolean {
    return analyze(this) { returnType.isSupportedJvmType(this) }
}

private fun KaType.isSupportedJvmType(session: KaSession): Boolean {
    return with(session) {
        isPrimitive
            || isStringType
            || isEnum()
            || symbol?.classId?.asFqNameString()?.startsWith(kotlinCollectionsPackage) == true
            || isArrayOrPrimitiveArray
            || isCharType
            || allSupertypes.any { superType -> superType.isSupportedJvmType(session) }
    }
}

fun KtDeclaration.isGodotPrimitive(): Boolean {
    return analyze(this) {
        returnType.isGodotPrimitive(this)
    }
}

private fun KaType.isGodotPrimitive(session: KaSession): Boolean {
    return with(session) {
        isIntType
            || isLongType
            || symbol?.classId?.asFqNameString()?.removeSuffix("?") == "$godotUtilPackage.${GodotKotlinJvmTypes.naturalT}"
            || isFloatType
            || isDoubleType
            || symbol?.classId?.asFqNameString()?.removeSuffix("?") == "$godotUtilPackage.${GodotKotlinJvmTypes.realT}"
            || isBooleanType
            || isShortType
            || isStringType
            || allSupertypes.any { superType -> superType.isGodotPrimitive(this) }
    }
}

fun KtDeclaration.isNullable(): Boolean {
    return analyze(this) {
        returnType.isMarkedNullable
    }
}
