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
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.TRANSFORM2D
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_PHYSICSTESTMOTIONPARAMETERS2D_INDEX: Int = 429

/**
 * By changing various properties of this object, such as the motion, you can configure the
 * parameters for [PhysicsServer2D.bodyTestMotion].
 */
@GodotBaseType
public open class PhysicsTestMotionParameters2D : RefCounted() {
  /**
   * Transform in global space where the motion should start. Usually set to
   * [Node2D.globalTransform] for the current body's transform.
   */
  @CoreTypeLocalCopy
  public final inline var from: Transform2D
    @JvmName("fromProperty")
    get() = getFrom()
    @JvmName("fromProperty")
    set(`value`) {
      setFrom(value)
    }

  /**
   * Motion vector to define the length and direction of the motion to test.
   */
  @CoreTypeLocalCopy
  public final inline var motion: Vector2
    @JvmName("motionProperty")
    get() = getMotion()
    @JvmName("motionProperty")
    set(`value`) {
      setMotion(value)
    }

  /**
   * Increases the size of the shapes involved in the collision detection.
   */
  public final inline var margin: Float
    @JvmName("marginProperty")
    get() = getMargin()
    @JvmName("marginProperty")
    set(`value`) {
      setMargin(value)
    }

  /**
   * If set to `true`, shapes of type [PhysicsServer2D.SHAPE_SEPARATION_RAY] are used to detect
   * collisions and can stop the motion. Can be useful when snapping to the ground.
   * If set to `false`, shapes of type [PhysicsServer2D.SHAPE_SEPARATION_RAY] are only used for
   * separation when overlapping with other bodies. That's the main use for separation ray shapes.
   */
  public final inline var collideSeparationRay: Boolean
    @JvmName("collideSeparationRayProperty")
    get() = isCollideSeparationRayEnabled()
    @JvmName("collideSeparationRayProperty")
    set(`value`) {
      setCollideSeparationRayEnabled(value)
    }

  /**
   * Optional array of body [RID] to exclude from collision. Use [CollisionObject2D.getRid] to get
   * the [RID] associated with a [CollisionObject2D]-derived node.
   */
  public final inline var excludeBodies: VariantArray<RID>
    @JvmName("excludeBodiesProperty")
    get() = getExcludeBodies()
    @JvmName("excludeBodiesProperty")
    set(`value`) {
      setExcludeBodies(value)
    }

  /**
   * Optional array of object unique instance ID to exclude from collision. See
   * [Object.getInstanceId].
   */
  public final inline var excludeObjects: VariantArray<Long>
    @JvmName("excludeObjectsProperty")
    get() = getExcludeObjects()
    @JvmName("excludeObjectsProperty")
    set(`value`) {
      setExcludeObjects(value)
    }

  /**
   * If set to `true`, any depenetration from the recovery phase is reported as a collision; this is
   * used e.g. by [CharacterBody2D] for improving floor detection during floor snapping.
   * If set to `false`, only collisions resulting from the motion are reported, which is generally
   * the desired behavior.
   */
  public final inline var recoveryAsCollision: Boolean
    @JvmName("recoveryAsCollisionProperty")
    get() = isRecoveryAsCollisionEnabled()
    @JvmName("recoveryAsCollisionProperty")
    set(`value`) {
      setRecoveryAsCollisionEnabled(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_PHYSICSTESTMOTIONPARAMETERS2D_INDEX, scriptIndex)
  }

  /**
   * Transform in global space where the motion should start. Usually set to
   * [Node2D.globalTransform] for the current body's transform.
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
   * val myCoreType = physicstestmotionparameters2d.from
   * //Your changes
   * physicstestmotionparameters2d.from = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun fromMutate(block: Transform2D.() -> Unit): Transform2D = from.apply{
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
   * val myCoreType = physicstestmotionparameters2d.motion
   * //Your changes
   * physicstestmotionparameters2d.motion = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun motionMutate(block: Vector2.() -> Unit): Vector2 = motion.apply{
      block(this)
      motion = this
  }


  public final fun getFrom(): Transform2D {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFromPtr, TRANSFORM2D)
    return (Internals.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  public final fun setFrom(from: Transform2D): Unit {
    Internals.writeArguments(TRANSFORM2D to from)
    Internals.callMethod(rawPtr, MethodBindings.setFromPtr, NIL)
  }

  public final fun getMotion(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMotionPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setMotion(motion: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to motion)
    Internals.callMethod(rawPtr, MethodBindings.setMotionPtr, NIL)
  }

  public final fun getMargin(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMarginPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMargin(margin: Float): Unit {
    Internals.writeArguments(DOUBLE to margin.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setMarginPtr, NIL)
  }

  public final fun isCollideSeparationRayEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isCollideSeparationRayEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCollideSeparationRayEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setCollideSeparationRayEnabledPtr, NIL)
  }

  public final fun getExcludeBodies(): VariantArray<RID> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getExcludeBodiesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<RID>)
  }

  public final fun setExcludeBodies(excludeList: VariantArray<RID>): Unit {
    Internals.writeArguments(ARRAY to excludeList)
    Internals.callMethod(rawPtr, MethodBindings.setExcludeBodiesPtr, NIL)
  }

  public final fun getExcludeObjects(): VariantArray<Long> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getExcludeObjectsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Long>)
  }

  public final fun setExcludeObjects(excludeList: VariantArray<Long>): Unit {
    Internals.writeArguments(ARRAY to excludeList)
    Internals.callMethod(rawPtr, MethodBindings.setExcludeObjectsPtr, NIL)
  }

  public final fun isRecoveryAsCollisionEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isRecoveryAsCollisionEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setRecoveryAsCollisionEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setRecoveryAsCollisionEnabledPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val getFromPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionParameters2D", "get_from", 3814499831)

    public val setFromPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionParameters2D", "set_from", 2761652528)

    public val getMotionPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionParameters2D", "get_motion", 3341600327)

    public val setMotionPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionParameters2D", "set_motion", 743155724)

    public val getMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionParameters2D", "get_margin", 1740695150)

    public val setMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionParameters2D", "set_margin", 373806689)

    public val isCollideSeparationRayEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionParameters2D", "is_collide_separation_ray_enabled", 36873697)

    public val setCollideSeparationRayEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionParameters2D", "set_collide_separation_ray_enabled", 2586408642)

    public val getExcludeBodiesPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionParameters2D", "get_exclude_bodies", 3995934104)

    public val setExcludeBodiesPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionParameters2D", "set_exclude_bodies", 381264803)

    public val getExcludeObjectsPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionParameters2D", "get_exclude_objects", 3995934104)

    public val setExcludeObjectsPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionParameters2D", "set_exclude_objects", 381264803)

    public val isRecoveryAsCollisionEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionParameters2D", "is_recovery_as_collision_enabled", 36873697)

    public val setRecoveryAsCollisionEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionParameters2D", "set_recovery_as_collision_enabled", 2586408642)
  }
}
