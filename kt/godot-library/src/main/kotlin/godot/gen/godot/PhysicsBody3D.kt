// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for all objects affected by physics in 3D space.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/physics/physics_introduction.html]($DOCS_URL/tutorials/physics/physics_introduction.html)
 *
 * PhysicsBody3D is an abstract base class for implementing a physics body. All *Body types inherit from it.
 */
@GodotBaseType
public open abstract class PhysicsBody3D : CollisionObject3D() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHYSICSBODY3D)
  }

  /**
   * Moves the body along the vector `distance`. In order to be frame rate independent in [godot.Node.PhysicsProcess] or [godot.Node.Process], `distance` should be computed using `delta`.
   *
   * The body will stop if it collides. Returns a [godot.KinematicCollision3D], which contains information about the collision when stopped, or when touching another body along the motion.
   *
   * If `test_only` is `true`, the body does not move but the would-be collision information is given.
   *
   * `safe_margin` is the extra margin used for collision recovery (see [godot.CharacterBody3D.collision/safeMargin] for more details).
   *
   * `max_collisions` allows to retrieve more than one collision result.
   */
  public open fun moveAndCollide(
    distance: Vector3,
    testOnly: Boolean = false,
    safeMargin: Double = 0.001,
    maxCollisions: Long = 1
  ): KinematicCollision3D? {
    TransferContext.writeArguments(VECTOR3 to distance, BOOL to testOnly, DOUBLE to safeMargin, LONG
        to maxCollisions)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_MOVE_AND_COLLIDE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as KinematicCollision3D?
  }

  /**
   * Checks for collisions without moving the body. In order to be frame rate independent in [godot.Node.PhysicsProcess] or [godot.Node.Process], `distance` should be computed using `delta`.
   *
   * Virtually sets the node's position, scale and rotation to that of the given [godot.Transform3D], then tries to move the body along the vector `distance`. Returns `true` if a collision would stop the body from moving along the whole path.
   *
   * `collision` is an optional object of type [godot.KinematicCollision3D], which contains additional information about the collision when stopped, or when touching another body along the motion.
   *
   * `safe_margin` is the extra margin used for collision recovery (see [godot.CharacterBody3D.collision/safeMargin] for more details).
   *
   * `max_collisions` allows to retrieve more than one collision result.
   */
  public open fun testMove(
    from: Transform3D,
    distance: Vector3,
    collision: KinematicCollision3D? = null,
    safeMargin: Double = 0.001,
    maxCollisions: Long = 1
  ): Boolean {
    TransferContext.writeArguments(TRANSFORM3D to from, VECTOR3 to distance, OBJECT to collision,
        DOUBLE to safeMargin, LONG to maxCollisions)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_TEST_MOVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Locks or unlocks the specified linear or rotational `axis` depending on the value of `lock`.
   */
  public open fun setAxisLock(axis: PhysicsServer3D.BodyAxis, lock: Boolean): Unit {
    TransferContext.writeArguments(LONG to axis.id, BOOL to lock)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_SET_AXIS_LOCK, NIL)
  }

  /**
   * Returns `true` if the specified linear or rotational `axis` is locked.
   */
  public open fun getAxisLock(axis: PhysicsServer3D.BodyAxis): Boolean {
    TransferContext.writeArguments(LONG to axis.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_GET_AXIS_LOCK, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns an array of nodes that were added as collision exceptions for this body.
   */
  public open fun getCollisionExceptions(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_GET_COLLISION_EXCEPTIONS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Adds a body to the list of bodies that this body can't collide with.
   */
  public open fun addCollisionExceptionWith(body: Node): Unit {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_ADD_COLLISION_EXCEPTION_WITH, NIL)
  }

  /**
   * Removes a body from the list of bodies that this body can't collide with.
   */
  public open fun removeCollisionExceptionWith(body: Node): Unit {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_REMOVE_COLLISION_EXCEPTION_WITH, NIL)
  }

  public companion object
}
