// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.TRANSFORM2D
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Joint used with [godot.Skeleton2D] to control and animate other nodes.
 *
 * Use a hierarchy of `Bone2D` bound to a [godot.Skeleton2D] to control, and animate other [godot.Node2D] nodes.
 *
 * You can use `Bone2D` and `Skeleton2D` nodes to animate 2D meshes created with the Polygon 2D UV editor.
 *
 * Each bone has a [rest] transform that you can reset to with [applyRest]. These rest poses are relative to the bone's parent.
 *
 * If in the editor, you can set the rest pose of an entire skeleton using a menu option, from the code, you need to iterate over the bones to set their individual rest poses.
 */
@GodotBaseType
public open class Bone2D : Node2D() {
  /**
   * Rest transform of the bone. You can reset the node's transforms to this value using [applyRest].
   */
  public var rest: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONE2D_GET_REST, TRANSFORM2D)
      return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONE2D_SET_REST, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_BONE2D)
  }

  /**
   * Stores the node's current transforms in [rest].
   */
  public fun applyRest(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONE2D_APPLY_REST, NIL)
  }

  /**
   * Returns the node's [rest] `Transform2D` if it doesn't have a parent, or its rest pose relative to its parent.
   */
  public fun getSkeletonRest(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONE2D_GET_SKELETON_REST,
        TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Returns the node's index as part of the entire skeleton. See [godot.Skeleton2D].
   */
  public fun getIndexInSkeleton(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONE2D_GET_INDEX_IN_SKELETON, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Deprecated. Please use `set_length` instead.
   */
  public fun setDefaultLength(defaultLength: Double): Unit {
    TransferContext.writeArguments(DOUBLE to defaultLength)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONE2D_SET_DEFAULT_LENGTH, NIL)
  }

  /**
   * Deprecated. Please use  `get_length` instead.
   */
  public fun getDefaultLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONE2D_GET_DEFAULT_LENGTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * When set to `true`, the `Bone2D` node will attempt to automatically calculate the bone angle and length using the first child `Bone2D` node, if one exists. If none exist, the `Bone2D` cannot automatically calculate these values and will print a warning.
   */
  public fun setAutocalculateLengthAndAngle(autoCalculate: Boolean): Unit {
    TransferContext.writeArguments(BOOL to autoCalculate)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_BONE2D_SET_AUTOCALCULATE_LENGTH_AND_ANGLE, NIL)
  }

  /**
   * Returns whether this `Bone2D` node is going to autocalculate its length and bone angle using its first `Bone2D` child node, if one exists. If there are no `Bone2D` children, then it cannot autocalculate these values and will print a warning.
   */
  public fun getAutocalculateLengthAndAngle(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_BONE2D_GET_AUTOCALCULATE_LENGTH_AND_ANGLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the length of the bone in the `Bone2D` node.
   */
  public fun setLength(length: Double): Unit {
    TransferContext.writeArguments(DOUBLE to length)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONE2D_SET_LENGTH, NIL)
  }

  /**
   * Returns the length of the bone in the `Bone2D` node.
   */
  public fun getLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONE2D_GET_LENGTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the bone angle for the `Bone2D` node. This is typically set to the rotation from the `Bone2D` node to a child `Bone2D` node.
   *
   * **Note:** This is different from the `Bone2D`'s rotation. The bone angle is the rotation of the bone shown by the `Bone2D` gizmo, and because `Bone2D` bones are based on positions, this can vary from the actual rotation of the `Bone2D` node.
   */
  public fun setBoneAngle(angle: Double): Unit {
    TransferContext.writeArguments(DOUBLE to angle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONE2D_SET_BONE_ANGLE, NIL)
  }

  /**
   * Returns the angle of the bone in the `Bone2D` node.
   *
   * **Note:** This is different from the `Bone2D`'s rotation. The bone angle is the rotation of the bone shown by the `Bone2D` gizmo, and because `Bone2D` bones are based on positions, this can vary from the actual rotation of the `Bone2D` node.
   */
  public fun getBoneAngle(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONE2D_GET_BONE_ANGLE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public companion object
}
