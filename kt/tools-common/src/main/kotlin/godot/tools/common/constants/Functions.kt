package godot.tools.common.constants

import com.squareup.kotlinpoet.MemberName

object KotlinFunctions {
    const val listOf = "listOf"
    const val mapOf = "mapOf"
    const val trimIndent = "trimIndent"
}

val KOTLIN_LIST_OF = MemberName(kotlinCollectionsPackage, KotlinFunctions.listOf)
val KOTLIN_MAP_OF = MemberName(kotlinCollectionsPackage, KotlinFunctions.mapOf)
