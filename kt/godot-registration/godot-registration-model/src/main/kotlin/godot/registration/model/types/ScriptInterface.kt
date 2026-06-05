package godot.registration.model.types

import godot.core.VariantParser
import godot.registration.model.RegisteredFunction
import godot.registration.model.RegisteredProperty
import godot.registration.model.RegisteredSignal

/**
 * An interface, sitting in a class's parent chain, that contributes its own registered [functions].
 *
 * One of the three parent sources of a registered class. Only [functions] are meaningful here; [signals]
 * and [properties] are always empty (an interface registers no signals or properties). An interface with
 * nothing to register is simply omitted from the hierarchy. Its functions are contributed to the registered
 * class that (directly or transitively) implements it — possibly hoisted down through a non-registered
 * [ScriptClass] intermediate.
 */
class ScriptInterface(
    override val fqName: String,
    override var interfaces: List<ScriptFamily> = emptyList(),
    override var functions: List<RegisteredFunction> = emptyList(),
) : Type(fqName, TypeKind.INTERFACE, isNullable = false), ScriptFamily {
    override val signals: List<RegisteredSignal> = emptyList()
    override val properties: List<RegisteredProperty> = emptyList()
    override val allAncestry: List<ScriptFamily> by lazy(LazyThreadSafetyMode.NONE) {
        flattenedAncestry(interfaces = interfaces)
    }
}
