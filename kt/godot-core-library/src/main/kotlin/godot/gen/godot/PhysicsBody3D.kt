// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.TRANSFORM3D
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * [PhysicsBody3D] is an abstract base class for 3D game objects affected by physics. All 3D physics
 * bodies inherit from it.
 * **Warning:** With a non-uniform scale, this node will likely not behave as expected. It is
 * advised to keep its scale the same on all axes and adjust its collision shape(s) instead.
 */
@GodotBaseType
public open class PhysicsBody3D internal constructor() : CollisionObject3D() {
  /**
   * Lock the body's linear movement in the X axis.
   */
  public final inline var axisLockLinearX: Boolean
    @JvmName("axisLockLinearXProperty")
    get() = getAxisLock(PhysicsServer3D.BodyAxis.BODY_AXIS_LINEAR_X)
    @JvmName("axisLockLinearXProperty")
    set(`value`) {
      setAxisLock(PhysicsServer3D.BodyAxis.BODY_AXIS_LINEAR_X, value)
    }

  /**
   * Lock the body's linear movement in the Y axis.
   */
  public final inline var axisLockLinearY: Boolean
    @JvmName("axisLockLinearYProperty")
    get() = getAxisLock(PhysicsServer3D.BodyAxis.BODY_AXIS_LINEAR_Y)
    @JvmName("axisLockLinearYProperty")
    set(`value`) {
      setAxisLock(PhysicsServer3D.BodyAxis.BODY_AXIS_LINEAR_Y, value)
    }

  /**
   * Lock the body's linear movement in the Z axis.
   */
  public final inline var axisLockLinearZ: Boolean
    @JvmName("axisLockLinearZProperty")
    get() = getAxisLock(PhysicsServer3D.BodyAxis.BODY_AXIS_LINEAR_Z)
    @JvmName("axisLockLinearZProperty")
    set(`value`) {
      setAxisLock(PhysicsServer3D.BodyAxis.BODY_AXIS_LINEAR_Z, value)
    }

  /**
   * Lock the body's rotation in the X axis.
   */
  public final inline var axisLockAngularX: Boolean
    @JvmName("axisLockAngularXProperty")
    get() = getAxisLock(PhysicsServer3D.BodyAxis.BODY_AXIS_ANGULAR_X)
    @JvmName("axisLockAngularXProperty")
    set(`value`) {
      setAxisLock(PhysicsServer3D.BodyAxis.BODY_AXIS_ANGULAR_X, value)
    }

  /**
   * Lock the body's rotation in the Y axis.
   */
  public final inline var axisLockAngularY: Boolean
    @JvmName("axisLockAngularYProperty")
    get() = getAxisLock(PhysicsServer3D.BodyAxis.BODY_AXIS_ANGULAR_Y)
    @JvmName("axisLockAngularYProperty")
    set(`value`) {
      setAxisLock(PhysicsServer3D.BodyAxis.BODY_AXIS_ANGULAR_Y, value)
    }

  /**
   * Lock the body's rotation in the Z axis.
   */
  public final inline var axisLockAngularZ: Boolean
    @JvmName("axisLockAngularZProperty")
    get() = getAxisLock(PhysicsServer3D.BodyAxis.BODY_AXIS_ANGULAR_Z)
    @JvmName("axisLockAngularZProperty")
    set(`value`) {
      setAxisLock(PhysicsServer3D.BodyAxis.BODY_AXIS_ANGULAR_Z, value)
    }

  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_PHYSICSBODY3D, this, scriptIndex)
  }

  /**
   * Moves the body along the vector [motion]. In order to be frame rate independent in
   * [Node.PhysicsProcess] or [Node.Process], [motion] should be computed using `delta`.
   * The body will stop if it collides. Returns a [KinematicCollision3D], which contains information
   * about the collision when stopped, or when touching another body along the motion.
   * If [testOnly] is `true`, the body does not move but the would-be collision information is
   * given.
   * [safeMargin] is the extra margin used for collision recovery (see [CharacterBody3D.safeMargin]
   * for more details).
   * If [recoveryAsCollision] is `true`, any depenetration from the recovery phase is also reported
   * as a collision; this is used e.g. by [CharacterBody3D] for improving floor detection during floor
   * snapping.
   * [maxCollisions] allows to retrieve more than one collision result.
   */
  @JvmOverloads
  public final fun moveAndCollide(
    motion: Vector3,
    testOnly: Boolean = false,
    safeMargin: Float = 0.001f,
    recoveryAsCollision: Boolean = false,
    maxCollisions: Int = 1,
  ): KinematicCollision3D? {
    TransferContext.writeArguments(VECTOR3 to motion, BOOL to testOnly, DOUBLE to safeMargin.toDouble(), BOOL to recoveryAsCollision, LONG to maxCollisions.toLong())
    TransferContext.callMethod(ptr, MethodBindings.moveAndCollidePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as KinematicCollision3D?)
  }

  /**
   * Checks for collisions without moving the body. In order to be frame rate independent in
   * [Node.PhysicsProcess] or [Node.Process], [motion] should be computed using `delta`.
   * Virtually sets the node's position, scale and rotation to that of the given [Transform3D], then
   * tries to move the body along the vector [motion]. Returns `true` if a collision would stop the
   * body from moving along the whole path.
   * [collision] is an optional object of type [KinematicCollision3D], which contains additional
   * information about the collision when stopped, or when touching another body along the motion.
   * [safeMargin] is the extra margin used for collision recovery (see [CharacterBody3D.safeMargin]
   * for more details).
   * If [recoveryAsCollision] is `true`, any depenetration from the recovery phase is also reported
   * as a collision; this is useful for checking whether the body would *touch* any other bodies.
   * [maxCollisions] allows to retrieve more than one collision result.
   */
  @JvmOverloads
  public final fun testMove(
    from: Transform3D,
    motion: Vector3,
    collision: KinematicCollision3D? = null,
    safeMargin: Float = 0.001f,
    recoveryAsCollision: Boolean = false,
    maxCollisions: Int = 1,
  ): Boolean {
    TransferContext.writeArguments(TRANSFORM3D to from, VECTOR3 to motion, OBJECT to collision, DOUBLE to safeMargin.toDouble(), BOOL to recoveryAsCollision, LONG to maxCollisions.toLong())
    TransferContext.callMethod(ptr, MethodBindings.testMovePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the gravity vector computed from all sources that can affect the body, including all
   * gravity overrides from [Area3D] nodes and the global world gravity.
   */
  public final fun getGravity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGravityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Locks or unlocks the specified linear or rotational [axis] depending on the value of [lock].
   */
  public final fun setAxisLock(axis: PhysicsServer3D.BodyAxis, lock: Boolean): Unit {
    TransferContext.writeArguments(LONG to axis.id, BOOL to lock)
    TransferContext.callMethod(ptr, MethodBindings.setAxisLockPtr, NIL)
  }

  /**
   * Returns `true` if the specified linear or rotational [axis] is locked.
   */
  public final fun getAxisLock(axis: PhysicsServer3D.BodyAxis): Boolean {
    TransferContext.writeArguments(LONG to axis.id)
    TransferContext.callMethod(ptr, MethodBindings.getAxisLockPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns an array of nodes that were added as collision exceptions for this body.
   */
  public final fun getCollisionExceptions(): VariantArray<PhysicsBody3D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionExceptionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<PhysicsBody3D>)
  }

  /**
   * Adds a body to the list of bodies that this body can't collide with.
   */
  public final fun addCollisionExceptionWith(body: Node?): Unit {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(ptr, MethodBindings.addCollisionExceptionWithPtr, NIL)
  }

  /**
   * Removes a body from the list of bodies that this body can't collide with.
   */
  public final fun removeCollisionExceptionWith(body: Node?): Unit {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(ptr, MethodBindings.removeCollisionExceptionWithPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val moveAndCollidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody3D", "move_and_collide", 3208792678)

    public val testMovePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody3D", "test_move", 2481691619)

    public val getGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody3D", "get_gravity", 3360562783)

    public val setAxisLockPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody3D", "set_axis_lock", 1787895195)

    public val getAxisLockPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody3D", "get_axis_lock", 2264617709)

    public val getCollisionExceptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody3D", "get_collision_exceptions", 2915620761)

    public val addCollisionExceptionWithPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody3D", "add_collision_exception_with", 1078189570)

    public val removeCollisionExceptionWithPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody3D", "remove_collision_exception_with", 1078189570)
  }
}
