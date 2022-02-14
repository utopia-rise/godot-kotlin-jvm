// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A resource that operates on bones in a [godot.Skeleton3D].
 *
 * This resource provides an interface that can be expanded so code that operates on bones in a [godot.Skeleton3D] can be mixed and matched together to create complex interactions.
 *
 * This is used to provide Godot with a flexible and powerful Inverse Kinematics solution that can be adapted for many different uses.
 */
@GodotBaseType
public open class SkeletonModification3D : Resource() {
  /**
   * When true, the modification's [_execute] function will be called by the [godot.SkeletonModificationStack3D].
   */
  public open var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3D_GET_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3D_SET_ENABLED, NIL)
    }

  /**
   * The execution mode for the modification. This tells the modification stack when to execute the modification. Some modifications have settings that are only available in certain execution modes.
   */
  public open var executionMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3D_GET_EXECUTION_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3D_SET_EXECUTION_MODE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION3D)
  }

  /**
   * Executes the given modification. This is where the modification performs whatever function it is designed to do.
   */
  public open fun _execute(delta: Double): Unit {
  }

  /**
   * Sets up the modification so it can be executed. This function should be called automatically by the [godot.SkeletonModificationStack3D] containing this modification.
   *
   * If you need to initialize a modification before use, this is the place to do it!
   */
  public open fun _setupModification(modificationStack: SkeletonModificationStack3D): Unit {
  }

  /**
   * Returns the [godot.SkeletonModificationStack3D] that this modification is bound to. Through the modification stack, you can access the Skeleton3D the modification is operating on.
   */
  public open fun getModificationStack(): SkeletonModificationStack3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3D_GET_MODIFICATION_STACK, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SkeletonModificationStack3D?
  }

  /**
   * Manually allows you to set the setup state of the modification. This function should only rarely be used, as the [godot.SkeletonModificationStack3D] the modification is bound to should handle setting the modification up.
   */
  public open fun setIsSetup(isSetup: Boolean): Unit {
    TransferContext.writeArguments(BOOL to isSetup)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3D_SET_IS_SETUP,
        NIL)
  }

  /**
   * Returns whether this modification has been successfully setup or not.
   */
  public open fun getIsSetup(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3D_GET_IS_SETUP,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Takes a angle and clamps it so it is within the passed-in `min` and `max` range. `invert` will inversely clamp the angle, clamping it to the range outside of the given bounds.
   */
  public open fun clampAngle(
    angle: Double,
    min: Double,
    max: Double,
    invert: Boolean
  ): Double {
    TransferContext.writeArguments(DOUBLE to angle, DOUBLE to min, DOUBLE to max, BOOL to invert)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3D_CLAMP_ANGLE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public companion object
}
