package godot.tools.common.constants

import com.squareup.kotlinpoet.MemberName

object KotlinFunctions {
    const val listOf = "listOf"
    const val trimIndent = "trimIndent"
}

object GodotFunctions {
    const val notification = "_notification"
    const val camelToSnakeCase = "camelToSnakeCase"
    const val asStringName = "asStringName"
    const val asCallable = "asCallable"
}

val KOTLIN_LIST_OF = MemberName(kotlinCollectionsPackage, KotlinFunctions.listOf)
val CAMEL_TO_SNAKE_CASE_UTIL_FUNCTION = MemberName(godotUtilPackage, GodotFunctions.camelToSnakeCase)
val AS_STRING_NAME_UTIL_FUNCTION = MemberName(godotCorePackage, GodotFunctions.asStringName)
val AS_CALLABLE_UTIL_FUNCTION = MemberName(callablePackage, GodotFunctions.asCallable)