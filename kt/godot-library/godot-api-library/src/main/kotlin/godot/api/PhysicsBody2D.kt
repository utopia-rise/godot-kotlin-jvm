// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.TRANSFORM2D
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * [PhysicsBody2D] is an abstract base class for 2D game objects affected by physics. All 2D physics
 * bodies inherit from it.
 */
@GodotBaseType
public open class PhysicsBody2D internal constructor() : CollisionObject2D() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(462, scriptIndex)
  }

  /**
   * Moves the body along the vector [motion]. In order to be frame rate independent in
   * [Node.PhysicsProcess] or [Node.Process], [motion] should be computed using `delta`.
   *
   * Returns a [KinematicCollision2D], which contains information about the collision when stopped,
   * or when touching another body along the motion.
   *
   * If [testOnly] is `true`, the body does not move but the would-be collision information is
   * given.
   *
   * [safeMargin] is the extra margin used for collision recovery (see [CharacterBody2D.safeMargin]
   * for more details).
   *
   * If [recoveryAsCollision] is `true`, any depenetration from the recovery phase is also reported
   * as a collision; this is used e.g. by [CharacterBody2D] for improving floor detection during floor
   * snapping.
   */
  @JvmOverloads
  public final fun moveAndCollide(
    motion: Vector2,
    testOnly: Boolean = false,
    safeMargin: Float = 0.08f,
    recoveryAsCollision: Boolean = false,
  ): KinematicCollision2D? {
    TransferContext.writeArguments(VECTOR2 to motion, BOOL to testOnly, DOUBLE to safeMargin.toDouble(), BOOL to recoveryAsCollision)
    TransferContext.callMethod(ptr, MethodBindings.moveAndCollidePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as KinematicCollision2D?)
  }

  /**
   * Checks for collisions without moving the body. In order to be frame rate independent in
   * [Node.PhysicsProcess] or [Node.Process], [motion] should be computed using `delta`.
   *
   * Virtually sets the node's position, scale and rotation to that of the given [Transform2D], then
   * tries to move the body along the vector [motion]. Returns `true` if a collision would stop the
   * body from moving along the whole path.
   *
   * [collision] is an optional object of type [KinematicCollision2D], which contains additional
   * information about the collision when stopped, or when touching another body along the motion.
   *
   * [safeMargin] is the extra margin used for collision recovery (see [CharacterBody2D.safeMargin]
   * for more details).
   *
   * If [recoveryAsCollision] is `true`, any depenetration from the recovery phase is also reported
   * as a collision; this is useful for checking whether the body would *touch* any other bodies.
   */
  @JvmOverloads
  public final fun testMove(
    from: Transform2D,
    motion: Vector2,
    collision: KinematicCollision2D? = null,
    safeMargin: Float = 0.08f,
    recoveryAsCollision: Boolean = false,
  ): Boolean {
    TransferContext.writeArguments(TRANSFORM2D to from, VECTOR2 to motion, OBJECT to collision, DOUBLE to safeMargin.toDouble(), BOOL to recoveryAsCollision)
    TransferContext.callMethod(ptr, MethodBindings.testMovePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the gravity vector computed from all sources that can affect the body, including all
   * gravity overrides from [Area2D] nodes and the global world gravity.
   */
  public final fun getGravity(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGravityPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns an array of nodes that were added as collision exceptions for this body.
   */
  public final fun getCollisionExceptions(): VariantArray<PhysicsBody2D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionExceptionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<PhysicsBody2D>)
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

  public object MethodBindings {
    internal val moveAndCollidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody2D", "move_and_collide", 3681923724)

    internal val testMovePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody2D", "test_move", 3324464701)

    internal val getGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody2D", "get_gravity", 3341600327)

    internal val getCollisionExceptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody2D", "get_collision_exceptions", 2915620761)

    internal val addCollisionExceptionWithPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody2D", "add_collision_exception_with", 1078189570)

    internal val removeCollisionExceptionWithPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody2D", "remove_collision_exception_with", 1078189570)
  }
}
