package godot.tools.common.constants

import com.squareup.kotlinpoet.MemberName

object KotlinFunctions {
    const val listOf = "listOf"
    const val trimIndent = "trimIndent"
}

object GodotFunctions {
    const val notification = "_notification"
}

val KOTLIN_LIST_OF = MemberName(kotlinCollectionsPackage, KotlinFunctions.listOf)
