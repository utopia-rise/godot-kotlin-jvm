// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A resource that operates on [godot.Bone2D] nodes in a [godot.Skeleton2D].
 *
 * This resource provides an interface that can be expanded so code that operates on [godot.Bone2D] nodes in a [godot.Skeleton2D] can be mixed and matched together to create complex interactions.
 *
 * This is used to provide Godot with a flexible and powerful Inverse Kinematics solution that can be adapted for many different uses.
 */
@GodotBaseType
public open class SkeletonModification2D : Resource() {
  /**
   * If `true`, the modification's [_execute] function will be called by the [godot.SkeletonModificationStack2D].
   */
  public var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2D_GET_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2D_SET_ENABLED, NIL)
    }

  /**
   * The execution mode for the modification. This tells the modification stack when to execute the modification. Some modifications have settings that are only available in certain execution modes.
   */
  public var executionMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2D_GET_EXECUTION_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2D_SET_EXECUTION_MODE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION2D, scriptIndex)
    return true
  }

  /**
   * Executes the given modification. This is where the modification performs whatever function it is designed to do.
   */
  public open fun _execute(delta: Double): Unit {
  }

  /**
   * Called when the modification is setup. This is where the modification performs initialization.
   */
  public open fun _setupModification(modificationStack: SkeletonModificationStack2D): Unit {
  }

  /**
   * Used for drawing **editor-only** modification gizmos. This function will only be called in the Godot editor and can be overridden to draw custom gizmos.
   *
   * **Note:** You will need to use the Skeleton2D from [godot.SkeletonModificationStack2D.getSkeleton] and it's draw functions, as the [godot.SkeletonModification2D] resource cannot draw on its own.
   */
  public open fun _drawEditorGizmo(): Unit {
  }

  /**
   * Returns the [godot.SkeletonModificationStack2D] that this modification is bound to. Through the modification stack, you can access the Skeleton2D the modification is operating on.
   */
  public fun getModificationStack(): SkeletonModificationStack2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2D_GET_MODIFICATION_STACK, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SkeletonModificationStack2D?
  }

  /**
   * Manually allows you to set the setup state of the modification. This function should only rarely be used, as the [godot.SkeletonModificationStack2D] the modification is bound to should handle setting the modification up.
   */
  public fun setIsSetup(isSetup: Boolean): Unit {
    TransferContext.writeArguments(BOOL to isSetup)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2D_SET_IS_SETUP,
        NIL)
  }

  /**
   * Returns whether this modification has been successfully setup or not.
   */
  public fun getIsSetup(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2D_GET_IS_SETUP,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Takes a angle and clamps it so it is within the passed-in [min] and [max] range. [invert] will inversely clamp the angle, clamping it to the range outside of the given bounds.
   */
  public fun clampAngle(
    angle: Double,
    min: Double,
    max: Double,
    invert: Boolean,
  ): Double {
    TransferContext.writeArguments(DOUBLE to angle, DOUBLE to min, DOUBLE to max, BOOL to invert)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2D_CLAMP_ANGLE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets whether this modification will call [_drawEditorGizmo] in the Godot editor to draw modification-specific gizmos.
   */
  public fun setEditorDrawGizmo(drawGizmo: Boolean): Unit {
    TransferContext.writeArguments(BOOL to drawGizmo)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2D_SET_EDITOR_DRAW_GIZMO, NIL)
  }

  /**
   * Returns whether this modification will call [_drawEditorGizmo] in the Godot editor to draw modification-specific gizmos.
   */
  public fun getEditorDrawGizmo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2D_GET_EDITOR_DRAW_GIZMO, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public companion object
}
