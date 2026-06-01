package godot.registration.model.types

import godot.registration.model.RegisteredFunction
import godot.registration.model.RegisteredProperty
import godot.registration.model.RegisteredSignal

/**
 * A [Type] that is allowed to be a supertype ("parent") of a registered script class, and the carrier of
 * the registerable members (signals/properties/functions) found on that parent.
 *
 * Implemented by the three things a script class can inherit from:
 *  - [ScriptInterface] — an interface contributing its own registered functions,
 *  - [GodotBaseClass] — a built-in Godot base class (no members; Godot already knows them),
 *  - [ScriptClass] — a user script class, registered or not (see
 *    [ScriptClass.isRegistered]).
 *
 * All implementers are [Type]s, so [fqName]/[name] are satisfied by [Type]; [supertypes] lets the parent
 * chain be walked generically, and [signals]/[properties]/[functions] expose the members each parent
 * carries (any of which may be empty).
 */
sealed interface ScriptFamily {
    val fqName: String
    val name: String
    val interfaces: List<ScriptFamily>
    val signals: List<RegisteredSignal>
    val properties: List<RegisteredProperty>
    val functions: List<RegisteredFunction>
    val allAncestry: List<ScriptFamily>
}

internal fun ScriptFamily.flattenedAncestry(
    parent: GodotClass? = null,
    interfaces: List<ScriptFamily> = emptyList(),
): List<ScriptFamily> {
    val directAncestry = listOfNotNull(parent) + interfaces
    return (directAncestry + directAncestry.flatMap { family -> family.allAncestry })
        .distinctBy { family -> family.fqName }
}

interface GodotClass : ScriptFamily {
    val baseGodotClass: String

    // Nullable: the chain terminates at the root Godot class (whose parent is null).
    val parent: GodotClass?

    // True if this class's Godot base is RefCounted (or a subclass of it).
    val inheritsRefCounted: Boolean
}
