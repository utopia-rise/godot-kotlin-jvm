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
 * A helper node, mostly used in 3rd person cameras.
 *
 * The SpringArm node is a node that casts a ray (or collision shape) along its z axis and moves all its direct children to the collision point, minus a margin.
 *
 * The most common use case for this is to make a 3rd person camera that reacts to collisions in the environment.
 *
 * The SpringArm will either cast a ray, or if a shape is given, it will cast the shape in the direction of its z axis.
 *
 * If you use the SpringArm as a camera controller for your player, you might need to exclude the player's collider from the SpringArm's collision check.
 */
@GodotBaseType
open class SpringArm : Spatial() {
  /**
   * The layers against which the collision check shall be done. See [godot.Collision layers and masks](https://docs.godotengine.org/en/latest/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  open var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_GET_COLLISION_MASK,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_SET_COLLISION_MASK, NIL)
    }

  /**
   * When the collision check is made, a candidate length for the SpringArm is given.
   *
   * The margin is then subtracted to this length and the translation is applied to the child objects of the SpringArm.
   *
   * This margin is useful for when the SpringArm has a [godot.Camera] as a child node: without the margin, the [godot.Camera] would be placed on the exact point of collision, while with the margin the [godot.Camera] would be placed close to the point of collision.
   */
  open var margin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_GET_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_SET_MARGIN, NIL)
    }

  /**
   * The [godot.Shape] to use for the SpringArm.
   *
   * When the shape is set, the SpringArm will cast the [godot.Shape] on its z axis instead of performing a ray cast.
   */
  open var shape: Shape?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_GET_SHAPE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Shape?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_SET_SHAPE, NIL)
    }

  /**
   * The maximum extent of the SpringArm. This is used as a length for both the ray and the shape cast used internally to calculate the desired position of the SpringArm's child nodes.
   *
   * To know more about how to perform a shape cast or a ray cast, please consult the [godot.PhysicsDirectSpaceState] documentation.
   */
  open var springLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_GET_SPRING_LENGTH,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_SET_SPRING_LENGTH, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_SPRINGARM, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Adds the [godot.PhysicsBody] object with the given [RID] to the list of [godot.PhysicsBody] objects excluded from the collision check.
   */
  open fun addExcludedObject(RID: RID) {
    TransferContext.writeArguments(_RID to RID)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_ADD_EXCLUDED_OBJECT, NIL)
  }

  /**
   * Clears the list of [godot.PhysicsBody] objects excluded from the collision check.
   */
  open fun clearExcludedObjects() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_CLEAR_EXCLUDED_OBJECTS,
        NIL)
  }

  /**
   * Returns the spring arm's current length.
   */
  open fun getHitLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_GET_HIT_LENGTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Removes the given [RID] from the list of [godot.PhysicsBody] objects excluded from the collision check.
   */
  open fun removeExcludedObject(RID: RID): Boolean {
    TransferContext.writeArguments(_RID to RID)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_REMOVE_EXCLUDED_OBJECT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }
}
