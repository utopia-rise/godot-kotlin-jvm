// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.MethodStringName0
import godot.core.Transform3D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.TRANSFORM3D
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic

/**
 * Once added to the scene tree and enabled using [makeCurrent], this node will override the
 * location sounds are heard from. This can be used to listen from a location different from the
 * [Camera3D].
 */
@GodotBaseType
public open class AudioListener3D : Node3D() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(76, scriptIndex)
  }

  /**
   * Enables the listener. This will override the current camera's listener.
   */
  public final fun makeCurrent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.makeCurrentPtr, NIL)
  }

  /**
   * Disables the listener to use the current camera's listener instead.
   */
  public final fun clearCurrent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearCurrentPtr, NIL)
  }

  /**
   * Returns `true` if the listener was made current using [makeCurrent], `false` otherwise.
   *
   * **Note:** There may be more than one AudioListener3D marked as "current" in the scene tree, but
   * only the one that was made current last will be used.
   */
  public final fun isCurrent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCurrentPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the listener's global orthonormalized [Transform3D].
   */
  public final fun getListenerTransform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getListenerTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  public companion object {
    @JvmStatic
    public val makeCurrentName: MethodStringName0<AudioListener3D, Unit> =
        MethodStringName0<AudioListener3D, Unit>("make_current")

    @JvmStatic
    public val clearCurrentName: MethodStringName0<AudioListener3D, Unit> =
        MethodStringName0<AudioListener3D, Unit>("clear_current")

    @JvmStatic
    public val isCurrentName: MethodStringName0<AudioListener3D, Boolean> =
        MethodStringName0<AudioListener3D, Boolean>("is_current")

    @JvmStatic
    public val getListenerTransformName: MethodStringName0<AudioListener3D, Transform3D> =
        MethodStringName0<AudioListener3D, Transform3D>("get_listener_transform")
  }

  public object MethodBindings {
    internal val makeCurrentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioListener3D", "make_current", 3218959716)

    internal val clearCurrentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioListener3D", "clear_current", 3218959716)

    internal val isCurrentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioListener3D", "is_current", 36873697)

    internal val getListenerTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioListener3D", "get_listener_transform", 3229777777)
  }
}
