package godot.intellij.plugin.project

import com.squareup.kotlinpoet.ClassName
import godot.tools.common.names.CoreType
import godot.tools.common.names.Kotlin
import godot.tools.common.names.Util
import godot.tools.common.names.qualifiedName
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

fun KtDeclaration.isType(className: ClassName): Boolean = isType(className.asClassId())

fun KtDeclaration.isOrInheritsType(classId: ClassId): Boolean {
    return analyze(this) {
        returnType.isOrInheritsType(classId, this)
    }
}

fun KtDeclaration.isOrInheritsType(className: ClassName): Boolean = isOrInheritsType(className.asClassId())

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
        isClassType(CoreType.coreType.asClassId())
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
            || symbol?.classId?.asFqNameString()?.let(Kotlin::isCollectionsType) == true
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
            || symbol?.classId?.asFqNameString()?.removeSuffix("?") == Util.naturalT.qualifiedName
            || isFloatType
            || isDoubleType
            || symbol?.classId?.asFqNameString()?.removeSuffix("?") == Util.realT.qualifiedName
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
