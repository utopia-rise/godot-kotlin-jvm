package godot.tools.common.constants

import com.squareup.kotlinpoet.MemberName

object KotlinFunctions {
    const val listOf = "listOf"
    const val trimIndent = "trimIndent"
}

object GodotFunctions {
    const val notification = "_notification"
    const val toGodotName = "toGodotName"
    const val asCachedStringName = "asCachedStringName"
    const val asCallable = "asCallable"
}

val KOTLIN_LIST_OF = MemberName(kotlinCollectionsPackage, KotlinFunctions.listOf)
val TO_GODOT_NAME_UTIL_FUNCTION = MemberName(godotCorePackage, GodotFunctions.toGodotName)
val AS_CALLABLE_UTIL_FUNCTION = MemberName(godotCorePackage, GodotFunctions.asCallable)
