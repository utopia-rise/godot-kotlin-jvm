// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
 * A helper node, mostly used in 3rd person cameras.
 *
 * The SpringArm3D node is a node that casts a ray (or collision shape) along its z axis and moves all its direct children to the collision point, minus a margin.
 *
 * The most common use case for this is to make a 3rd person camera that reacts to collisions in the environment.
 *
 * The SpringArm3D will either cast a ray, or if a shape is given, it will cast the shape in the direction of its z axis.
 *
 * If you use the SpringArm3D as a camera controller for your player, you might need to exclude the player's collider from the SpringArm3D's collision check.
 */
@GodotBaseType
public open class SpringArm3D : Node3D() {
  /**
   * The layers against which the collision check shall be done. See [godot.Collision layers and masks]($DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM3D_GET_COLLISION_MASK,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM3D_SET_COLLISION_MASK,
          NIL.ordinal)
    }

  /**
   * The [godot.Shape3D] to use for the SpringArm3D.
   *
   * When the shape is set, the SpringArm3D will cast the [godot.Shape3D] on its z axis instead of performing a ray cast.
   */
  public var shape: Shape3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM3D_GET_SHAPE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Shape3D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM3D_SET_SHAPE, NIL.ordinal)
    }

  /**
   * The maximum extent of the SpringArm3D. This is used as a length for both the ray and the shape cast used internally to calculate the desired position of the SpringArm3D's child nodes.
   *
   * To know more about how to perform a shape cast or a ray cast, please consult the [godot.PhysicsDirectSpaceState3D] documentation.
   */
  public var springLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM3D_GET_LENGTH, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM3D_SET_LENGTH, NIL.ordinal)
    }

  /**
   * When the collision check is made, a candidate length for the SpringArm3D is given.
   *
   * The margin is then subtracted to this length and the translation is applied to the child objects of the SpringArm3D.
   *
   * This margin is useful for when the SpringArm3D has a [godot.Camera3D] as a child node: without the margin, the [godot.Camera3D] would be placed on the exact point of collision, while with the margin the [godot.Camera3D] would be placed close to the point of collision.
   */
  public var margin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM3D_GET_MARGIN, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM3D_SET_MARGIN, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SPRINGARM3D)
  }

  /**
   * Returns the spring arm's current length.
   */
  public fun getHitLength(): Double {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM3D_GET_HIT_LENGTH,
        DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Adds the [godot.PhysicsBody3D] object with the given [RID] to the list of [godot.PhysicsBody3D] objects excluded from the collision check.
   */
  public fun addExcludedObject(RID: RID): Unit {
    TransferContext.writeArguments(_RID to RID)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM3D_ADD_EXCLUDED_OBJECT,
        NIL.ordinal)
  }

  /**
   * Removes the given [RID] from the list of [godot.PhysicsBody3D] objects excluded from the collision check.
   */
  public fun removeExcludedObject(RID: RID): Boolean {
    TransferContext.writeArguments(_RID to RID)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM3D_REMOVE_EXCLUDED_OBJECT,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Clears the list of [godot.PhysicsBody3D] objects excluded from the collision check.
   */
  public fun clearExcludedObjects(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM3D_CLEAR_EXCLUDED_OBJECTS,
        NIL.ordinal)
  }

  public companion object
}
