// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A 3D raycast that dynamically moves its children near the collision point.
 *
 * [godot.SpringArm3D] casts a ray or a shape along its Z axis and moves all its direct children to the collision point, with an optional margin. This is useful for 3rd person cameras that move closer to the player when inside a tight space (you may need to exclude the player's collider from the [godot.SpringArm3D]'s collision check.
 */
@GodotBaseType
public open class SpringArm3D : Node3D() {
  /**
   * The layers against which the collision check shall be done. See [godot.Collision layers and masks]($DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskPtr, NIL)
    }

  /**
   * The [godot.Shape3D] to use for the SpringArm3D.
   *
   * When the shape is set, the SpringArm3D will cast the [godot.Shape3D] on its z axis instead of performing a ray cast.
   */
  public var shape: Shape3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShapePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Shape3D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShapePtr, NIL)
    }

  /**
   * The maximum extent of the SpringArm3D. This is used as a length for both the ray and the shape cast used internally to calculate the desired position of the SpringArm3D's child nodes.
   *
   * To know more about how to perform a shape cast or a ray cast, please consult the [godot.PhysicsDirectSpaceState3D] documentation.
   */
  public var springLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLengthPtr, NIL)
    }

  /**
   * When the collision check is made, a candidate length for the SpringArm3D is given.
   *
   * The margin is then subtracted to this length and the translation is applied to the child objects of the SpringArm3D.
   *
   * This margin is useful for when the SpringArm3D has a [godot.Camera3D] as a child node: without the margin, the [godot.Camera3D] would be placed on the exact point of collision, while with the margin the [godot.Camera3D] would be placed close to the point of collision.
   */
  public var margin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMarginPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SPRINGARM3D, scriptIndex)
    return true
  }

  /**
   * Returns the spring arm's current length.
   */
  public fun getHitLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHitLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Adds the [godot.PhysicsBody3D] object with the given [RID] to the list of [godot.PhysicsBody3D] objects excluded from the collision check.
   */
  public fun addExcludedObject(RID: RID): Unit {
    TransferContext.writeArguments(_RID to RID)
    TransferContext.callMethod(rawPtr, MethodBindings.addExcludedObjectPtr, NIL)
  }

  /**
   * Removes the given [RID] from the list of [godot.PhysicsBody3D] objects excluded from the collision check.
   */
  public fun removeExcludedObject(RID: RID): Boolean {
    TransferContext.writeArguments(_RID to RID)
    TransferContext.callMethod(rawPtr, MethodBindings.removeExcludedObjectPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Clears the list of [godot.PhysicsBody3D] objects excluded from the collision check.
   */
  public fun clearExcludedObjects(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearExcludedObjectsPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val getHitLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "get_hit_length")

    public val setLengthPtr: VoidPtr = TypeManager.getMethodBindPtr("SpringArm3D", "set_length")

    public val getLengthPtr: VoidPtr = TypeManager.getMethodBindPtr("SpringArm3D", "get_length")

    public val setShapePtr: VoidPtr = TypeManager.getMethodBindPtr("SpringArm3D", "set_shape")

    public val getShapePtr: VoidPtr = TypeManager.getMethodBindPtr("SpringArm3D", "get_shape")

    public val addExcludedObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "add_excluded_object")

    public val removeExcludedObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "remove_excluded_object")

    public val clearExcludedObjectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "clear_excluded_objects")

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "set_collision_mask")

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "get_collision_mask")

    public val setMarginPtr: VoidPtr = TypeManager.getMethodBindPtr("SpringArm3D", "set_margin")

    public val getMarginPtr: VoidPtr = TypeManager.getMethodBindPtr("SpringArm3D", "get_margin")
  }
}
