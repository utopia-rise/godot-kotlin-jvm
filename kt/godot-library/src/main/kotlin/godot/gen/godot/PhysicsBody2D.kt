// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
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
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICSBODY2D, scriptIndex)
    return true
  }

  /**
   * Moves the body along the vector [param motion]. In order to be frame rate independent in
   * [Node.PhysicsProcess] or [Node.Process], [param motion] should be computed using `delta`.
   * Returns a [KinematicCollision2D], which contains information about the collision when stopped,
   * or when touching another body along the motion.
   * If [param test_only] is `true`, the body does not move but the would-be collision information
   * is given.
   * [param safe_margin] is the extra margin used for collision recovery (see
   * [CharacterBody2D.safeMargin] for more details).
   * If [param recovery_as_collision] is `true`, any depenetration from the recovery phase is also
   * reported as a collision; this is used e.g. by [CharacterBody2D] for improving floor detection
   * during floor snapping.
   */
  @JvmOverloads
  public fun moveAndCollide(
    motion: Vector2,
    testOnly: Boolean = false,
    safeMargin: Float = 0.08f,
    recoveryAsCollision: Boolean = false,
  ): KinematicCollision2D? {
    TransferContext.writeArguments(VECTOR2 to motion, BOOL to testOnly, DOUBLE to safeMargin.toDouble(), BOOL to recoveryAsCollision)
    TransferContext.callMethod(rawPtr, MethodBindings.moveAndCollidePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as KinematicCollision2D?)
  }

  /**
   * Checks for collisions without moving the body. In order to be frame rate independent in
   * [Node.PhysicsProcess] or [Node.Process], [param motion] should be computed using `delta`.
   * Virtually sets the node's position, scale and rotation to that of the given [Transform2D], then
   * tries to move the body along the vector [param motion]. Returns `true` if a collision would stop
   * the body from moving along the whole path.
   * [param collision] is an optional object of type [KinematicCollision2D], which contains
   * additional information about the collision when stopped, or when touching another body along the
   * motion.
   * [param safe_margin] is the extra margin used for collision recovery (see
   * [CharacterBody2D.safeMargin] for more details).
   * If [param recovery_as_collision] is `true`, any depenetration from the recovery phase is also
   * reported as a collision; this is useful for checking whether the body would *touch* any other
   * bodies.
   */
  @JvmOverloads
  public fun testMove(
    from: Transform2D,
    motion: Vector2,
    collision: KinematicCollision2D? = null,
    safeMargin: Float = 0.08f,
    recoveryAsCollision: Boolean = false,
  ): Boolean {
    TransferContext.writeArguments(TRANSFORM2D to from, VECTOR2 to motion, OBJECT to collision, DOUBLE to safeMargin.toDouble(), BOOL to recoveryAsCollision)
    TransferContext.callMethod(rawPtr, MethodBindings.testMovePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns an array of nodes that were added as collision exceptions for this body.
   */
  public fun getCollisionExceptions(): VariantArray<PhysicsBody2D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionExceptionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PhysicsBody2D>)
  }

  /**
   * Adds a body to the list of bodies that this body can't collide with.
   */
  public fun addCollisionExceptionWith(body: Node): Unit {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr, MethodBindings.addCollisionExceptionWithPtr, NIL)
  }

  /**
   * Removes a body from the list of bodies that this body can't collide with.
   */
  public fun removeCollisionExceptionWith(body: Node): Unit {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr, MethodBindings.removeCollisionExceptionWithPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val moveAndCollidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody2D", "move_and_collide")

    public val testMovePtr: VoidPtr = TypeManager.getMethodBindPtr("PhysicsBody2D", "test_move")

    public val getCollisionExceptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody2D", "get_collision_exceptions")

    public val addCollisionExceptionWithPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody2D", "add_collision_exception_with")

    public val removeCollisionExceptionWithPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsBody2D", "remove_collision_exception_with")
  }
}
