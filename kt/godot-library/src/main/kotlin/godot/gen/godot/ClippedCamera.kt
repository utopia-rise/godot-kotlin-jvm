// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType._RID
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

/**
 * A [godot.Camera] that includes collision.
 *
 * This node extends [godot.Camera] to add collisions with [godot.Area] and/or [godot.PhysicsBody] nodes. The camera cannot move through colliding objects.
 */
@GodotBaseType
open class ClippedCamera : Camera() {
  /**
   * If `true`, the camera stops on contact with [godot.Area]s.
   */
  open var clipToAreas: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_GET_CLIP_TO_AREAS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_SET_CLIP_TO_AREAS,
          NIL)
    }

  /**
   * If `true`, the camera stops on contact with [godot.PhysicsBody]s.
   */
  open var clipToBodies: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_GET_CLIP_TO_BODIES,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_SET_CLIP_TO_BODIES,
          NIL)
    }

  /**
   * The camera's collision mask. Only objects in at least one collision layer matching the mask will be detected. See [godot.Collision layers and masks](https://docs.godotengine.org/en/latest/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  open var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_GET_COLLISION_MASK,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_SET_COLLISION_MASK,
          NIL)
    }

  /**
   * The camera's collision margin. The camera can't get closer than this distance to a colliding object.
   */
  open var margin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_GET_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_SET_MARGIN, NIL)
    }

  /**
   * The camera's process callback. See [enum ProcessMode].
   */
  open var processMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_GET_PROCESS_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_SET_PROCESS_MODE,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_CLIPPEDCAMERA)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  /**
   * Adds a collision exception so the camera does not collide with the specified node.
   */
  open fun addException(node: Object) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_ADD_EXCEPTION, NIL)
  }

  /**
   * Adds a collision exception so the camera does not collide with the specified [RID].
   */
  open fun addExceptionRid(rid: RID) {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_ADD_EXCEPTION_RID,
        NIL)
  }

  /**
   * Removes all collision exceptions.
   */
  open fun clearExceptions() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_CLEAR_EXCEPTIONS, NIL)
  }

  /**
   * Returns the distance the camera has been offset due to a collision.
   */
  open fun getClipOffset(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_GET_CLIP_OFFSET,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns `true` if the specified bit index is on.
   *
   * **Note:** Bit indices range from 0-19.
   */
  open fun getCollisionMaskBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_GET_COLLISION_MASK_BIT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes a collision exception with the specified node.
   */
  open fun removeException(node: Object) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_REMOVE_EXCEPTION, NIL)
  }

  /**
   * Removes a collision exception with the specified [RID].
   */
  open fun removeExceptionRid(rid: RID) {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_REMOVE_EXCEPTION_RID,
        NIL)
  }

  /**
   * Sets the specified bit index to the `value`.
   *
   * **Note:** Bit indices range from 0-19.
   */
  open fun setCollisionMaskBit(bit: Long, value: Boolean) {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_SET_COLLISION_MASK_BIT, NIL)
  }

  enum class ProcessMode(
    id: Long
  ) {
    /**
     * The camera updates with the `_physics_process` callback.
     */
    CLIP_PROCESS_PHYSICS(0),

    /**
     * The camera updates with the `_process` callback.
     */
    CLIP_PROCESS_IDLE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * The camera updates with the `_process` callback.
     */
    final const val CLIP_PROCESS_IDLE: Long = 1

    /**
     * The camera updates with the `_physics_process` callback.
     */
    final const val CLIP_PROCESS_PHYSICS: Long = 0
  }
}
