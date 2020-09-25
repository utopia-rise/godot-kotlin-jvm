package godot

import godot.core.KtVariant

fun KtVariant.asObject() = asObject(::Object)