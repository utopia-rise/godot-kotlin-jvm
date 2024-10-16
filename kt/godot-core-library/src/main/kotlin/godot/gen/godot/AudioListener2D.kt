// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Once added to the scene tree and enabled using [makeCurrent], this node will override the
 * location sounds are heard from. Only one [AudioListener2D] can be current. Using [makeCurrent] will
 * disable the previous [AudioListener2D].
 * If there is no active [AudioListener2D] in the current [Viewport], center of the screen will be
 * used as a hearing point for the audio. [AudioListener2D] needs to be inside [SceneTree] to function.
 */
@GodotBaseType
public open class AudioListener2D : Node2D() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_AUDIOLISTENER2D, scriptIndex)
  }

  /**
   * Makes the [AudioListener2D] active, setting it as the hearing point for the sounds. If there is
   * already another active [AudioListener2D], it will be disabled.
   * This method will have no effect if the [AudioListener2D] is not added to [SceneTree].
   */
  public final fun makeCurrent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.makeCurrentPtr, NIL)
  }

  /**
   * Disables the [AudioListener2D]. If it's not set as current, this method will have no effect.
   */
  public final fun clearCurrent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearCurrentPtr, NIL)
  }

  /**
   * Returns `true` if this [AudioListener2D] is currently active.
   */
  public final fun isCurrent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCurrentPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val makeCurrentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioListener2D", "make_current", 3218959716)

    public val clearCurrentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioListener2D", "clear_current", 3218959716)

    public val isCurrentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioListener2D", "is_current", 36873697)
  }
}
