// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Transform2D
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.TRANSFORM2D
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A joint used with [godot.Skeleton2D] to control and animate other nodes.
 *
 * A hierarchy of [godot.Bone2D]s can be bound to a [godot.Skeleton2D] to control and animate other [godot.Node2D] nodes.
 *
 * You can use [godot.Bone2D] and [godot.Skeleton2D] nodes to animate 2D meshes created with the [godot.Polygon2D] UV editor.
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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_BONE2D, scriptIndex)
    return true
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
   * When set to `true`, the [godot.Bone2D] node will attempt to automatically calculate the bone angle and length using the first child [godot.Bone2D] node, if one exists. If none exist, the [godot.Bone2D] cannot automatically calculate these values and will print a warning.
   */
  public fun setAutocalculateLengthAndAngle(autoCalculate: Boolean): Unit {
    TransferContext.writeArguments(BOOL to autoCalculate)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_BONE2D_SET_AUTOCALCULATE_LENGTH_AND_ANGLE, NIL)
  }

  /**
   * Returns whether this [godot.Bone2D] is going to autocalculate its length and bone angle using its first [godot.Bone2D] child node, if one exists. If there are no [godot.Bone2D] children, then it cannot autocalculate these values and will print a warning.
   */
  public fun getAutocalculateLengthAndAngle(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_BONE2D_GET_AUTOCALCULATE_LENGTH_AND_ANGLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the length of the bone in the [godot.Bone2D].
   */
  public fun setLength(length: Double): Unit {
    TransferContext.writeArguments(DOUBLE to length)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONE2D_SET_LENGTH, NIL)
  }

  /**
   * Returns the length of the bone in the [godot.Bone2D] node.
   */
  public fun getLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONE2D_GET_LENGTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the bone angle for the [godot.Bone2D]. This is typically set to the rotation from the [godot.Bone2D] to a child [godot.Bone2D] node.
   *
   * **Note:** **Note:** This is different from the [godot.Bone2D]'s rotation. The bone's angle is the rotation of the bone shown by the gizmo, which is unaffected by the [godot.Bone2D]'s [godot.Node2D.transform].
   */
  public fun setBoneAngle(angle: Double): Unit {
    TransferContext.writeArguments(DOUBLE to angle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONE2D_SET_BONE_ANGLE, NIL)
  }

  /**
   * Returns the angle of the bone in the [godot.Bone2D].
   *
   * **Note:** This is different from the [godot.Bone2D]'s rotation. The bone's angle is the rotation of the bone shown by the gizmo, which is unaffected by the [godot.Bone2D]'s [godot.Node2D.transform].
   */
  public fun getBoneAngle(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONE2D_GET_BONE_ANGLE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public companion object
}
