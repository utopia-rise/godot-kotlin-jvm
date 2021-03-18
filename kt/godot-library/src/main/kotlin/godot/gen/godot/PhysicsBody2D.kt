// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * Base class for all objects affected by physics in 2D space.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/physics/physics_introduction.html](https://docs.godotengine.org/en/latest/tutorials/physics/physics_introduction.html)
 *
 * PhysicsBody2D is an abstract base class for implementing a physics body. All *Body2D types inherit from it.
 */
@GodotBaseType
open class PhysicsBody2D : CollisionObject2D() {
  /**
   * The physics layers this area is in.
   *
   * Collidable objects can exist in any of 32 different layers. These layers work like a tagging system, and are not visual. A collidable can use these layers to select with which objects it can collide, using the [collisionMask] property.
   *
   * A contact is detected if object A is in any of the layers that object B scans, or object B is in any layer scanned by object A. See [godot.Collision layers and masks](https://docs.godotengine.org/en/latest/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  open var collisionLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSBODY2D_GET_COLLISION_LAYER,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSBODY2D_SET_COLLISION_LAYER,
          NIL)
    }

  /**
   * The physics layers this area scans for collisions. See [godot.Collision layers and masks](https://docs.godotengine.org/en/latest/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  open var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSBODY2D_GET_COLLISION_MASK,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSBODY2D_SET_COLLISION_MASK,
          NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_PHYSICSBODY2D)

  open fun _getLayers(): Long {
    throw NotImplementedError("_get_layers is not implemented for PhysicsBody2D")
  }

  open fun _setLayers(mask: Long) {
  }

  /**
   * Adds a body to the list of bodies that this body can't collide with.
   */
  open fun addCollisionExceptionWith(body: Node) {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSBODY2D_ADD_COLLISION_EXCEPTION_WITH, NIL)
  }

  /**
   * Returns an array of nodes that were added as collision exceptions for this body.
   */
  open fun getCollisionExceptions(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSBODY2D_GET_COLLISION_EXCEPTIONS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns an individual bit on the [collisionLayer].
   */
  open fun getCollisionLayerBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSBODY2D_GET_COLLISION_LAYER_BIT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns an individual bit on the [collisionMask].
   */
  open fun getCollisionMaskBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSBODY2D_GET_COLLISION_MASK_BIT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes a body from the list of bodies that this body can't collide with.
   */
  open fun removeCollisionExceptionWith(body: Node) {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSBODY2D_REMOVE_COLLISION_EXCEPTION_WITH, NIL)
  }

  /**
   * Sets individual bits on the [collisionLayer] bitmask. Use this if you only need to change one layer's value.
   */
  open fun setCollisionLayerBit(bit: Long, value: Boolean) {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSBODY2D_SET_COLLISION_LAYER_BIT, NIL)
  }

  /**
   * Sets individual bits on the [collisionMask] bitmask. Use this if you only need to change one layer's value.
   */
  open fun setCollisionMaskBit(bit: Long, value: Boolean) {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSBODY2D_SET_COLLISION_MASK_BIT, NIL)
  }
}
