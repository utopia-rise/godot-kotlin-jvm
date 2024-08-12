// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
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
 * By changing various properties of this object, such as the motion, you can configure the
 * parameters for [PhysicsServer3D.bodyTestMotion].
 */
@GodotBaseType
public open class PhysicsTestMotionParameters3D : RefCounted() {
  /**
   * Transform in global space where the motion should start. Usually set to
   * [Node3D.globalTransform] for the current body's transform.
   */
  @CoreTypeLocalCopy
  public var from: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFromPtr, TRANSFORM3D)
      return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFromPtr, NIL)
    }

  /**
   * Motion vector to define the length and direction of the motion to test.
   */
  @CoreTypeLocalCopy
  public var motion: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMotionPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMotionPtr, NIL)
    }

  /**
   * Increases the size of the shapes involved in the collision detection.
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

  /**
   * Maximum number of returned collisions, between `1` and `32`. Always returns the deepest
   * detected collisions.
   */
  public var maxCollisions: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxCollisionsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxCollisionsPtr, NIL)
    }

  /**
   * If set to `true`, shapes of type [PhysicsServer3D.SHAPE_SEPARATION_RAY] are used to detect
   * collisions and can stop the motion. Can be useful when snapping to the ground.
   * If set to `false`, shapes of type [PhysicsServer3D.SHAPE_SEPARATION_RAY] are only used for
   * separation when overlapping with other bodies. That's the main use for separation ray shapes.
   */
  public var collideSeparationRay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCollideSeparationRayEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollideSeparationRayEnabledPtr, NIL)
    }

  /**
   * Optional array of body [RID] to exclude from collision. Use [CollisionObject3D.getRid] to get
   * the [RID] associated with a [CollisionObject3D]-derived node.
   */
  public var excludeBodies: VariantArray<RID>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExcludeBodiesPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setExcludeBodiesPtr, NIL)
    }

  /**
   * Optional array of object unique instance ID to exclude from collision. See
   * [Object.getInstanceId].
   */
  public var excludeObjects: VariantArray<Long>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExcludeObjectsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Long>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setExcludeObjectsPtr, NIL)
    }

  /**
   * If set to `true`, any depenetration from the recovery phase is reported as a collision; this is
   * used e.g. by [CharacterBody3D] for improving floor detection during floor snapping.
   * If set to `false`, only collisions resulting from the motion are reported, which is generally
   * the desired behavior.
   */
  public var recoveryAsCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRecoveryAsCollisionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRecoveryAsCollisionEnabledPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICSTESTMOTIONPARAMETERS3D, scriptIndex)
    return true
  }

  /**
   * Transform in global space where the motion should start. Usually set to
   * [Node3D.globalTransform] for the current body's transform.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = physicstestmotionparameters3d.from
   * //Your changes
   * physicstestmotionparameters3d.from = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun fromMutate(block: Transform3D.() -> Unit): Transform3D = from.apply{
      block(this)
      from = this
  }


  /**
   * Motion vector to define the length and direction of the motion to test.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = physicstestmotionparameters3d.motion
   * //Your changes
   * physicstestmotionparameters3d.motion = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun motionMutate(block: Vector3.() -> Unit): Vector3 = motion.apply{
      block(this)
      motion = this
  }


  public companion object

  internal object MethodBindings {
    public val getFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters3D", "get_from")

    public val setFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters3D", "set_from")

    public val getMotionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters3D", "get_motion")

    public val setMotionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters3D", "set_motion")

    public val getMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters3D", "get_margin")

    public val setMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters3D", "set_margin")

    public val getMaxCollisionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters3D", "get_max_collisions")

    public val setMaxCollisionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters3D", "set_max_collisions")

    public val isCollideSeparationRayEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters3D", "is_collide_separation_ray_enabled")

    public val setCollideSeparationRayEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters3D", "set_collide_separation_ray_enabled")

    public val getExcludeBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters3D", "get_exclude_bodies")

    public val setExcludeBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters3D", "set_exclude_bodies")

    public val getExcludeObjectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters3D", "get_exclude_objects")

    public val setExcludeObjectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters3D", "set_exclude_objects")

    public val isRecoveryAsCollisionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters3D", "is_recovery_as_collision_enabled")

    public val setRecoveryAsCollisionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionParameters3D", "set_recovery_as_collision_enabled")
  }
}
