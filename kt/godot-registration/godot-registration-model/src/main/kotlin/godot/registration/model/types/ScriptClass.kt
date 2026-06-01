package godot.registration.model.types

import godot.registration.model.RegisteredConstructor
import godot.registration.model.RegisteredFunction
import godot.registration.model.RegisteredProperty
import godot.registration.model.RegisteredSignal

/**
 * A user-authored script class (Kotlin/Java/Scala) in the type hierarchy — one of the three things a
 * registered Godot class is assembled from (alongside [ScriptInterface]
 * and [GodotBaseClass]).
 *
 * It carries the same information whether or not it is registered. [isRegistered] and [isAbstract] are
 * **independent** — abstract does not imply non-registered, because an abstract class can itself be
 * registered to Godot. The three valid states are:
 *  - `isRegistered = true,  isAbstract = false` — a normal registered class.
 *  - `isRegistered = true,  isAbstract = true`  — a registered abstract class (Godot knows it).
 *  - `isRegistered = false` (abstract or not)    — a non-registered intermediate parent. It appears only
 *    nested inside a registered subclass's [supertypes] (never in the processor's top-level output), and
 *    there may be several stacked between a registered class and its [GodotBaseClass].
 *
 * Why a non-registered class still needs full member/`supertypes` info — **hoisting**: Godot doesn't know a
 * non-registered class, so its registered members and the interfaces it implements must be pulled down onto
 * the nearest registered descendant. (A registered class — including an abstract one — registers itself, so
 * its members are not re-hoisted; a [GodotBaseClass] contributes nothing.)
 */
class ScriptClass(
    override val fqName: String,
    val customName: String?,
    val sourceProjectName: String,
    val isRegistered: Boolean = true,
    val isAbstract: Boolean = false,
    val isTool: Boolean = false,
    override val parent: GodotClass?,
    override val interfaces: List<ScriptFamily>,
    val constructors: List<RegisteredConstructor>,
    override val signals: List<RegisteredSignal>,
    override val properties: List<RegisteredProperty>,
    override val functions: List<RegisteredFunction>,
) : Type(fqName, TypeKind.CLASS, isNullable = false), GodotClass {
    override val allAncestry: List<ScriptFamily> by lazy(LazyThreadSafetyMode.NONE) {
        flattenedAncestry(parent = parent, interfaces = interfaces)
    }

    // Empty when the parent chain never reaches a GodotBaseClass; a model check flags that case.
    override val baseGodotClass: String = parent?.baseGodotClass ?: ""
    override val inheritsRefCounted: Boolean = parent?.inheritsRefCounted ?: false
}
