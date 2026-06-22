package godot.intellij.plugin.project

import godot.common.util.NaturalT
import godot.common.util.RealT
import godot.core.BitField
import godot.core.BitFieldBase
import godot.core.CoreType
import godot.tools.common.constants.isCollectionsType
import org.jetbrains.kotlin.analysis.api.KaSession
import org.jetbrains.kotlin.analysis.api.types.KaType
import org.jetbrains.kotlin.analysis.api.types.KaTypeNullability
import org.jetbrains.kotlin.analysis.api.types.symbol
import org.jetbrains.kotlin.idea.codeinsight.utils.isEnum
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.psi.KtDeclaration
import org.jetbrains.kotlin.scripting.resolve.classId

fun KtDeclaration.isType(classId: ClassId): Boolean {
    return withType { declarationType -> declarationType.isClassType(classId) }
}


fun KtDeclaration.isOrInheritsType(classId: ClassId): Boolean {
    return withType { declarationType -> declarationType.isOrInheritsType(classId, this) }
}


private fun KaType.isOrInheritsType(classId: ClassId, session: KaSession): Boolean {
    return with(session) {
        isClassType(classId) || allSupertypes.any { superType -> superType.isOrInheritsType(classId, session) }
    }
}

fun KtDeclaration.isCoreType(): Boolean {
    return withType { declarationType -> declarationType.isCoreType(this) }
}

private fun KaType.isCoreType(session: KaSession): Boolean {
    return with(session) {
        isClassType(CoreType::class.classId)
            || allSupertypes.any { superType -> superType.isCoreType(session) }
    }
}

fun KtDeclaration.isSupportedJvmType(): Boolean {
    return withType { declarationType -> declarationType.isSupportedJvmType(this) }
}

private fun KaType.isSupportedJvmType(session: KaSession): Boolean {
    return with(session) {
        isPrimitive
            || isStringType
            || isEnum()
            || isClassType(BitField::class.classId)
            || symbol?.classId?.asFqNameString()?.let(::isCollectionsType) == true
            || isArrayOrPrimitiveArray
            || isCharType
            || allSupertypes.any { superType -> superType.isSupportedJvmType(session) }
    }
}

fun KtDeclaration.isBitField(): Boolean {
    return withType { declarationType -> declarationType.isBitField(this) }
}

private fun KaType.isBitField(session: KaSession): Boolean {
    return with(session) {
        isClassType(BitField::class.classId)
            || isClassType(BitFieldBase::class.classId)
            || allSupertypes.any { superType -> superType.isBitField(session) }
    }
}

fun KtDeclaration.isGodotPrimitive(): Boolean {
    return withType { declarationType -> declarationType.isGodotPrimitive(this) }
}

private fun KaType.isGodotPrimitive(session: KaSession): Boolean {
    return with(session) {
        isIntType
            || isLongType
            || symbol?.classId?.asFqNameString()?.removeSuffix("?") == NaturalT::class.qualifiedName!!
            || isFloatType
            || isDoubleType
            || symbol?.classId?.asFqNameString()?.removeSuffix("?") == RealT::class.qualifiedName!!
            || isBooleanType
            || isShortType
            || isStringType
            || allSupertypes.any { superType -> superType.isGodotPrimitive(this) }
    }
}

fun KtDeclaration.isNullable(): Boolean {
    return withType { declarationType -> declarationType.nullability == KaTypeNullability.NULLABLE }
}
