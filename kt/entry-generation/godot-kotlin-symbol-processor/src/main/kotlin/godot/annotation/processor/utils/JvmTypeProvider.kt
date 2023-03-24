package godot.annotation.processor.utils

import godot.entrygenerator.model.JvmType

internal class JvmTypeProvider: (JvmType) -> Set<String> {
    override fun invoke(jvmType: JvmType): Set<String> {
        return when(jvmType) {
            JvmType.INT -> setOf(
                requireNotNull(Int::class.qualifiedName),
                requireNotNull(Short::class.qualifiedName),
            )
            JvmType.LONG -> setOf(
                requireNotNull(Long::class.qualifiedName),
            )
            JvmType.FLOAT -> setOf(
                requireNotNull(Float::class.qualifiedName),
            )
            JvmType.DOUBLE -> setOf(
                requireNotNull(Double::class.qualifiedName),
            )
            JvmType.BOOLEAN -> setOf(
                requireNotNull(Boolean::class.qualifiedName),
            )
            JvmType.STRING -> setOf(
                requireNotNull(String::class.qualifiedName),
            )
            JvmType.BYTE -> setOf(
                requireNotNull(Byte::class.qualifiedName),
            )
            JvmType.ANY -> setOf(
                requireNotNull(Any::class.qualifiedName),
            )
            JvmType.VOID -> setOf(
                requireNotNull(Unit::class.qualifiedName),
            )
        }
    }
}
