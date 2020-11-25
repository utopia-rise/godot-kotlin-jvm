package godot

import godot.core.VariantType

/**
 * Used for variadic icalls.
 */
fun wrap(obj: Any?): Pair<VariantType, Any> {
    if (obj == null) {
        return VariantType.NIL to Unit
    }
    return when (obj) {
        is Unit -> VariantType.NIL to Unit
        is Boolean -> VariantType.BOOL to obj
        is Int -> VariantType.LONG to obj.toLong()
        is Long -> VariantType.LONG to obj
        is Float -> VariantType.DOUBLE to obj.toDouble()
        is Double -> VariantType.DOUBLE to obj
        is String -> VariantType.STRING to obj
        is Object -> VariantType.OBJECT to obj
        else -> throw UnsupportedOperationException("Can't convert type ${obj::class} to Variant")
    }
}