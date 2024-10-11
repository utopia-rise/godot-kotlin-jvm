// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Transform3D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.TRANSFORM3D
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_AUDIOLISTENER3D_INDEX: Int = 111

/**
 * Once added to the scene tree and enabled using [makeCurrent], this node will override the
 * location sounds are heard from. This can be used to listen from a location different from the
 * [Camera3D].
 */
@GodotBaseType
public open class AudioListener3D : Node3D() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_AUDIOLISTENER3D_INDEX, scriptIndex)
  }

  /**
   * Enables the listener. This will override the current camera's listener.
   */
  public final fun makeCurrent(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.makeCurrentPtr, NIL)
  }

  /**
   * Disables the listener to use the current camera's listener instead.
   */
  public final fun clearCurrent(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearCurrentPtr, NIL)
  }

  /**
   * Returns `true` if the listener was made current using [makeCurrent], `false` otherwise.
   * **Note:** There may be more than one AudioListener3D marked as "current" in the scene tree, but
   * only the one that was made current last will be used.
   */
  public final fun isCurrent(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isCurrentPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the listener's global orthonormalized [Transform3D].
   */
  public final fun getListenerTransform(): Transform3D {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getListenerTransformPtr, TRANSFORM3D)
    return (Internals.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  public companion object

  public object MethodBindings {
    internal val makeCurrentPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioListener3D", "make_current", 3218959716)

    internal val clearCurrentPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioListener3D", "clear_current", 3218959716)

    internal val isCurrentPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioListener3D", "is_current", 36873697)

    internal val getListenerTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioListener3D", "get_listener_transform", 3229777777)
  }
}
