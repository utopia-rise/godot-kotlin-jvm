package godot

import godot.core.KtVariant

/**
 * Used for variadic icalls.
 */
fun wrap(obj: Any?): KtVariant {
    if (obj == null) {
        return KtVariant(Unit)
    }
    return when (obj) {
        is Unit -> KtVariant(Unit)
        is Boolean -> KtVariant(obj)
        is Int -> KtVariant(obj.toLong())
        is Long -> KtVariant(obj)
        is Float -> KtVariant(obj.toDouble())
        is Double -> KtVariant(obj)
        is String -> KtVariant(obj)
        is KtVariant -> obj
        is Object -> KtVariant(obj)
        else -> throw UnsupportedOperationException("Can't convert type ${obj::class} to Variant")
    }
}