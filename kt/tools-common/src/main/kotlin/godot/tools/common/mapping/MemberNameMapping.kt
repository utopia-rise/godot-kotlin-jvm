package godot.tools.common.mapping

object MemberNameMapping {
    object KotlinNameToJavaName {
        object GodotApi {
            val functions = mapOf(
                "getClass" to "getGodotClass",
                "wait" to "waitFor"
            )
        }
    }
}
