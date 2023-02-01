package godot.tools.common.constants

import com.squareup.kotlinpoet.MemberName

object KotlinFunctions {
    const val listOf = "listOf"
}

val KOTLIN_LIST_OF = MemberName(kotlinCollectionsPackage, KotlinFunctions.listOf)
