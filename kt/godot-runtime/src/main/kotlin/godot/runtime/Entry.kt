package godot.runtime

import godot.core.Glue
import godot.core.Godot
import godot.core.KtVariantFactory

abstract class Entry {
    interface Context {
        val variantFactory: KtVariantFactory
        val registry: ClassRegistry
    }

    fun init(context: Context, glue: Glue) {
        Godot.delegate = glue
        context.init()
    }

    protected abstract fun Context.init()
}