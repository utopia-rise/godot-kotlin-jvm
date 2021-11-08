// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
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
import kotlin.Unit

/**
 * A [godot.Camera] that includes collision.
 *
 * This node extends [godot.Camera] to add collisions with [godot.Area] and/or [godot.PhysicsBody] nodes. The camera cannot move through colliding objects.
 */
@GodotBaseType
public open class ClippedCamera : Camera() {
  /**
   * If `true`, the camera stops on contact with [godot.Area]s.
   */
  public open var clipToAreas: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_GET_CLIP_TO_AREAS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_SET_CLIP_TO_AREAS,
          NIL)
    }

  /**
   * If `true`, the camera stops on contact with [godot.PhysicsBody]s.
   */
  public open var clipToBodies: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_GET_CLIP_TO_BODIES,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_SET_CLIP_TO_BODIES,
          NIL)
    }

  /**
   * The camera's collision mask. Only objects in at least one collision layer matching the mask will be detected. See [godot.Collision layers and masks](https://docs.godotengine.org/en/3.4/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public open var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_GET_COLLISION_MASK,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_SET_COLLISION_MASK,
          NIL)
    }

  /**
   * The camera's collision margin. The camera can't get closer than this distance to a colliding object.
   */
  public open var margin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_GET_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_SET_MARGIN, NIL)
    }

  /**
   * The camera's process callback. See [enum ProcessMode].
   */
  public open var processMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_GET_PROCESS_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_SET_PROCESS_MODE,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CLIPPEDCAMERA)
  }

  /**
   * Adds a collision exception so the camera does not collide with the specified node.
   */
  public open fun addException(node: Object): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_ADD_EXCEPTION, NIL)
  }

  /**
   * Adds a collision exception so the camera does not collide with the specified [RID].
   */
  public open fun addExceptionRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_ADD_EXCEPTION_RID,
        NIL)
  }

  /**
   * Removes all collision exceptions.
   */
  public open fun clearExceptions(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_CLEAR_EXCEPTIONS, NIL)
  }

  /**
   * Returns the distance the camera has been offset due to a collision.
   */
  public open fun getClipOffset(): Double {
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
  public open fun getCollisionMaskBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_GET_COLLISION_MASK_BIT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes a collision exception with the specified node.
   */
  public open fun removeException(node: Object): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_REMOVE_EXCEPTION, NIL)
  }

  /**
   * Removes a collision exception with the specified [RID].
   */
  public open fun removeExceptionRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_REMOVE_EXCEPTION_RID,
        NIL)
  }

  /**
   * Sets the specified bit index to the `value`.
   *
   * **Note:** Bit indices range from 0-19.
   */
  public open fun setCollisionMaskBit(bit: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CLIPPEDCAMERA_SET_COLLISION_MASK_BIT, NIL)
  }

  public enum class ProcessMode(
    id: Long
  ) {
    /**
     * The camera updates with the `_physics_process` callback.
     */
    CLIP_PROCESS_PHYSICS(0),
    /**
     * The camera updates with the `_process` callback.
     */
    CLIP_PROCESS_IDLE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * The camera updates with the `_process` callback.
     */
    public final const val CLIP_PROCESS_IDLE: Long = 1

    /**
     * The camera updates with the `_physics_process` callback.
     */
    public final const val CLIP_PROCESS_PHYSICS: Long = 0
  }
}
