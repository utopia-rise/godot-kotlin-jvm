// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
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
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Abstract base class for 3D game objects affected by physics.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/physics/physics_introduction.html]($DOCS_URL/tutorials/physics/physics_introduction.html)
 *
 * [godot.PhysicsBody3D] is an abstract base class for 3D game objects affected by physics. All 3D physics bodies inherit from it.
 *
 * **Warning:** With a non-uniform scale, this node will likely not behave as expected. It is advised to keep its scale the same on all axes and adjust its collision shape(s) instead.
 */
@GodotBaseType
public open class PhysicsBody3D internal constructor() : CollisionObject3D() {
  /**
   * Lock the body's linear movement in the X axis.
   */
  public var axisLockLinearX: Boolean
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_GET_AXIS_LOCK, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_SET_AXIS_LOCK, NIL)
    }

  /**
   * Lock the body's linear movement in the Y axis.
   */
  public var axisLockLinearY: Boolean
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_GET_AXIS_LOCK, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_SET_AXIS_LOCK, NIL)
    }

  /**
   * Lock the body's linear movement in the Z axis.
   */
  public var axisLockLinearZ: Boolean
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_GET_AXIS_LOCK, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_SET_AXIS_LOCK, NIL)
    }

  /**
   * Lock the body's rotation in the X axis.
   */
  public var axisLockAngularX: Boolean
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_GET_AXIS_LOCK, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_SET_AXIS_LOCK, NIL)
    }

  /**
   * Lock the body's rotation in the Y axis.
   */
  public var axisLockAngularY: Boolean
    get() {
      TransferContext.writeArguments(LONG to 16L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_GET_AXIS_LOCK, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 16L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_SET_AXIS_LOCK, NIL)
    }

  /**
   * Lock the body's rotation in the Z axis.
   */
  public var axisLockAngularZ: Boolean
    get() {
      TransferContext.writeArguments(LONG to 32L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_GET_AXIS_LOCK, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 32L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_SET_AXIS_LOCK, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICSBODY3D, scriptIndex)
    return true
  }

  /**
   * Moves the body along the vector [motion]. In order to be frame rate independent in [godot.Node.PhysicsProcess] or [godot.Node.Process], [motion] should be computed using `delta`.
   *
   * The body will stop if it collides. Returns a [godot.KinematicCollision3D], which contains information about the collision when stopped, or when touching another body along the motion.
   *
   * If [testOnly] is `true`, the body does not move but the would-be collision information is given.
   *
   * [safeMargin] is the extra margin used for collision recovery (see [godot.CharacterBody3D.safeMargin] for more details).
   *
   * If [recoveryAsCollision] is `true`, any depenetration from the recovery phase is also reported as a collision; this is used e.g. by [godot.CharacterBody3D] for improving floor detection during floor snapping.
   *
   * [maxCollisions] allows to retrieve more than one collision result.
   */
  @JvmOverloads
  public fun moveAndCollide(
    motion: Vector3,
    testOnly: Boolean = false,
    safeMargin: Float = 0.001f,
    recoveryAsCollision: Boolean = false,
    maxCollisions: Int = 1,
  ): KinematicCollision3D? {
    TransferContext.writeArguments(VECTOR3 to motion, BOOL to testOnly, DOUBLE to safeMargin.toDouble(), BOOL to recoveryAsCollision, LONG to maxCollisions.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_MOVE_AND_COLLIDE,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as KinematicCollision3D?)
  }

  /**
   * Checks for collisions without moving the body. In order to be frame rate independent in [godot.Node.PhysicsProcess] or [godot.Node.Process], [motion] should be computed using `delta`.
   *
   * Virtually sets the node's position, scale and rotation to that of the given [godot.Transform3D], then tries to move the body along the vector [motion]. Returns `true` if a collision would stop the body from moving along the whole path.
   *
   * [collision] is an optional object of type [godot.KinematicCollision3D], which contains additional information about the collision when stopped, or when touching another body along the motion.
   *
   * [safeMargin] is the extra margin used for collision recovery (see [godot.CharacterBody3D.safeMargin] for more details).
   *
   * If [recoveryAsCollision] is `true`, any depenetration from the recovery phase is also reported as a collision; this is useful for checking whether the body would *touch* any other bodies.
   *
   * [maxCollisions] allows to retrieve more than one collision result.
   */
  @JvmOverloads
  public fun testMove(
    from: Transform3D,
    motion: Vector3,
    collision: KinematicCollision3D? = null,
    safeMargin: Float = 0.001f,
    recoveryAsCollision: Boolean = false,
    maxCollisions: Int = 1,
  ): Boolean {
    TransferContext.writeArguments(TRANSFORM3D to from, VECTOR3 to motion, OBJECT to collision, DOUBLE to safeMargin.toDouble(), BOOL to recoveryAsCollision, LONG to maxCollisions.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_TEST_MOVE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns an array of nodes that were added as collision exceptions for this body.
   */
  public fun getCollisionExceptions(): VariantArray<PhysicsBody3D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_GET_COLLISION_EXCEPTIONS, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PhysicsBody3D>)
  }

  /**
   * Adds a body to the list of bodies that this body can't collide with.
   */
  public fun addCollisionExceptionWith(body: Node): Unit {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_ADD_COLLISION_EXCEPTION_WITH, NIL)
  }

  /**
   * Removes a body from the list of bodies that this body can't collide with.
   */
  public fun removeCollisionExceptionWith(body: Node): Unit {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSBODY3D_REMOVE_COLLISION_EXCEPTION_WITH, NIL)
  }

  public companion object
}
