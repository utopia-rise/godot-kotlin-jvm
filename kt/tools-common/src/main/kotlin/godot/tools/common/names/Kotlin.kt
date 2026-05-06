@file:Suppress("unused")

package godot.tools.common.names

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName

object Kotlin {
    @Suppress("NOTHING_TO_INLINE")
    private inline fun reflectionName(simpleName: String) = ClassName(kotlinReflectPackage, simpleName)

    val suppress = ClassName(kotlinPackage, "Suppress")
    val enum = ClassName(kotlinPackage, "Enum")
    val set = ClassName(kotlinCollectionsPackage, "Set")
    val mutableSet = ClassName(kotlinCollectionsPackage, "MutableSet")
    val listOf = MemberName(kotlinCollectionsPackage, "listOf")
    val trimIndent = MemberName(kotlinTextPackage, "trimIndent")
    val kCallable = reflectionName("KCallable")
    val kProperty = reflectionName("KProperty")
    val readOnlyProperty = ClassName("kotlin.properties", "ReadOnlyProperty")

    fun kFunction(argCount: Int) = reflectionName("KFunction$argCount")

    fun isCollectionsType(fqName: String) = fqName.contains(kotlinCollectionsPackage)
}
