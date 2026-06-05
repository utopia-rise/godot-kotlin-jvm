package godot.registration.model.types

import godot.registration.model.ext.isRefCounted
import godot.registration.model.RegisteredFunction
import godot.registration.model.RegisteredProperty
import godot.registration.model.RegisteredSignal

/**
 * A built-in Godot base class that a registered class ultimately derives from (e.g. `Node`, `Resource`).
 *
 * One of the three parent sources of a registered class. Unlike a [ScriptClass] or
 * a [ScriptInterface], it carries **no registered members** — Godot already knows these types, so there is
 * nothing to register or hoist (all member lists are empty). Its only role is to identify the native base
 * to extend. As a [GodotClass], its [supertypes] are themselves Godot classes (at most one).
 */
class GodotBaseClass(
    override val fqName: String,
    override val parent: GodotBaseClass? = null,
) : SourceClass(fqName), GodotClass {
    override val interfaces: List<ScriptFamily> = emptyList()
    override val signals: List<RegisteredSignal> = emptyList()
    override val properties: List<RegisteredProperty> = emptyList()
    override val functions: List<RegisteredFunction> = emptyList()
    override val allAncestry: List<ScriptFamily>
        get() = flattenedAncestry(parent = parent)
    override val baseGodotClass: String = this.fqName
    override val inheritsRefCounted: Boolean = isRefCounted()
}
