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
import kotlin.jvm.JvmName

/**
 * [SpringArm3D] casts a ray or a shape along its Z axis and moves all its direct children to the
 * collision point, with an optional margin. This is useful for 3rd person cameras that move closer to
 * the player when inside a tight space (you may need to exclude the player's collider from the
 * [SpringArm3D]'s collision check).
 */
@GodotBaseType
public open class SpringArm3D : Node3D() {
  /**
   * The layers against which the collision check shall be done. See
   * [url=$DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks]Collision
   * layers and masks[/url] in the documentation for more information.
   */
  public var collisionMask: Long
    @JvmName("collisionMaskProperty")
    get() = getCollisionMask()
    @JvmName("collisionMaskProperty")
    set(`value`) {
      setCollisionMask(value)
    }

  /**
   * The [Shape3D] to use for the SpringArm3D.
   * When the shape is set, the SpringArm3D will cast the [Shape3D] on its z axis instead of
   * performing a ray cast.
   */
  public var shape: Shape3D?
    @JvmName("shapeProperty")
    get() = getShape()
    @JvmName("shapeProperty")
    set(`value`) {
      setShape(value)
    }

  /**
   * The maximum extent of the SpringArm3D. This is used as a length for both the ray and the shape
   * cast used internally to calculate the desired position of the SpringArm3D's child nodes.
   * To know more about how to perform a shape cast or a ray cast, please consult the
   * [PhysicsDirectSpaceState3D] documentation.
   */
  public var springLength: Float
    @JvmName("springLengthProperty")
    get() = getLength()
    @JvmName("springLengthProperty")
    set(`value`) {
      setLength(value)
    }

  /**
   * When the collision check is made, a candidate length for the SpringArm3D is given.
   * The margin is then subtracted to this length and the translation is applied to the child
   * objects of the SpringArm3D.
   * This margin is useful for when the SpringArm3D has a [Camera3D] as a child node: without the
   * margin, the [Camera3D] would be placed on the exact point of collision, while with the margin the
   * [Camera3D] would be placed close to the point of collision.
   */
  public var margin: Float
    @JvmName("marginProperty")
    get() = getMargin()
    @JvmName("marginProperty")
    set(`value`) {
      setMargin(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SPRINGARM3D, scriptIndex)
  }

  /**
   * Returns the spring arm's current length.
   */
  public fun getHitLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHitLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setLength(length: Float): Unit {
    TransferContext.writeArguments(DOUBLE to length.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setLengthPtr, NIL)
  }

  public fun getLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setShape(shape: Shape3D?): Unit {
    TransferContext.writeArguments(OBJECT to shape)
    TransferContext.callMethod(rawPtr, MethodBindings.setShapePtr, NIL)
  }

  public fun getShape(): Shape3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getShapePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Shape3D?)
  }

  /**
   * Adds the [PhysicsBody3D] object with the given [RID] to the list of [PhysicsBody3D] objects
   * excluded from the collision check.
   */
  public fun addExcludedObject(RID: RID): Unit {
    TransferContext.writeArguments(_RID to RID)
    TransferContext.callMethod(rawPtr, MethodBindings.addExcludedObjectPtr, NIL)
  }

  /**
   * Removes the given [RID] from the list of [PhysicsBody3D] objects excluded from the collision
   * check.
   */
  public fun removeExcludedObject(RID: RID): Boolean {
    TransferContext.writeArguments(_RID to RID)
    TransferContext.callMethod(rawPtr, MethodBindings.removeExcludedObjectPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Clears the list of [PhysicsBody3D] objects excluded from the collision check.
   */
  public fun clearExcludedObjects(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearExcludedObjectsPtr, NIL)
  }

  public fun setCollisionMask(mask: Long): Unit {
    TransferContext.writeArguments(LONG to mask)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskPtr, NIL)
  }

  public fun getCollisionMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public fun setMargin(margin: Float): Unit {
    TransferContext.writeArguments(DOUBLE to margin.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setMarginPtr, NIL)
  }

  public fun getMargin(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMarginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val getHitLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "get_hit_length", 191475506)

    public val setLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "set_length", 373806689)

    public val getLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "get_length", 1740695150)

    public val setShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "set_shape", 1549710052)

    public val getShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "get_shape", 3214262478)

    public val addExcludedObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "add_excluded_object", 2722037293)

    public val removeExcludedObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "remove_excluded_object", 3521089500)

    public val clearExcludedObjectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "clear_excluded_objects", 3218959716)

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "set_collision_mask", 1286410249)

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "get_collision_mask", 2455072627)

    public val setMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "set_margin", 373806689)

    public val getMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringArm3D", "get_margin", 191475506)
  }
}
