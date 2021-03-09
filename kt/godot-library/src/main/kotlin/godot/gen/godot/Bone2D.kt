// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.TRANSFORM2D
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
open class Bone2D : Node2D() {
  /**
   * Length of the bone's representation drawn in the editor's viewport in pixels.
   */
  open var defaultLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONE2D_GET_DEFAULT_LENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONE2D_SET_DEFAULT_LENGTH, NIL)
    }

  /**
   * Rest transform of the bone. You can reset the node's transforms to this value using [applyRest].
   */
  open var rest: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONE2D_GET_REST, TRANSFORM2D)
      return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
    }
    set(value) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONE2D_SET_REST, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_BONE2D)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun rest(schedule: Transform2D.() -> Unit): Transform2D = rest.apply{
      schedule(this)
      rest = this
  }


  /**
   * Stores the node's current transforms in [rest].
   */
  open fun applyRest() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONE2D_APPLY_REST, NIL)
  }

  /**
   * Returns the node's index as part of the entire skeleton. See [godot.Skeleton2D].
   */
  open fun getIndexInSkeleton(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONE2D_GET_INDEX_IN_SKELETON, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the node's [rest] `Transform2D` if it doesn't have a parent, or its rest pose relative to its parent.
   */
  open fun getSkeletonRest(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONE2D_GET_SKELETON_REST,
        TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }
}
