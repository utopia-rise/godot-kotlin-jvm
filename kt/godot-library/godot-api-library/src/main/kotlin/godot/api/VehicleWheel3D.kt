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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A node used as a child of a [VehicleBody3D] parent to simulate the behavior of one of its wheels.
 * This node also acts as a collider to detect if the wheel is touching a surface.
 * **Note:** This class has known issues and isn't designed to provide realistic 3D vehicle physics.
 * If you want advanced vehicle physics, you may need to write your own physics integration using
 * another [PhysicsBody3D] class.
 */
@GodotBaseType
public open class VehicleWheel3D : Node3D() {
  /**
   * Accelerates the wheel by applying an engine force. The wheel is only sped up if it is in
   * contact with a surface. The [RigidBody3D.mass] of the vehicle has an effect on the acceleration of
   * the vehicle. For a vehicle with a mass set to 1000, try a value in the 25 - 50 range for
   * acceleration.
   * **Note:** The simulation does not take the effect of gears into account, you will need to add
   * logic for this if you wish to simulate gears.
   * A negative value will result in the wheel reversing.
   */
  public final inline var engineForce: Float
    @JvmName("engineForceProperty")
    get() = getEngineForce()
    @JvmName("engineForceProperty")
    set(`value`) {
      setEngineForce(value)
    }

  /**
   * Slows down the wheel by applying a braking force. The wheel is only slowed down if it is in
   * contact with a surface. The force you need to apply to adequately slow down your vehicle depends
   * on the [RigidBody3D.mass] of the vehicle. For a vehicle with a mass set to 1000, try a value in
   * the 25 - 30 range for hard braking.
   */
  public final inline var brake: Float
    @JvmName("brakeProperty")
    get() = getBrake()
    @JvmName("brakeProperty")
    set(`value`) {
      setBrake(value)
    }

  /**
   * The steering angle for the wheel, in radians. Setting this to a non-zero value will result in
   * the vehicle turning when it's moving.
   */
  public final inline var steering: Float
    @JvmName("steeringProperty")
    get() = getSteering()
    @JvmName("steeringProperty")
    set(`value`) {
      setSteering(value)
    }

  /**
   * If `true`, this wheel transfers engine force to the ground to propel the vehicle forward. This
   * value is used in conjunction with [VehicleBody3D.engineForce] and ignored if you are using the
   * per-wheel [engineForce] value instead.
   */
  public final inline var useAsTraction: Boolean
    @JvmName("useAsTractionProperty")
    get() = isUsedAsTraction()
    @JvmName("useAsTractionProperty")
    set(`value`) {
      setUseAsTraction(value)
    }

  /**
   * If `true`, this wheel will be turned when the car steers. This value is used in conjunction
   * with [VehicleBody3D.steering] and ignored if you are using the per-wheel [steering] value instead.
   */
  public final inline var useAsSteering: Boolean
    @JvmName("useAsSteeringProperty")
    get() = isUsedAsSteering()
    @JvmName("useAsSteeringProperty")
    set(`value`) {
      setUseAsSteering(value)
    }

  /**
   * This value affects the roll of your vehicle. If set to 1.0 for all wheels, your vehicle will
   * resist body roll, while a value of 0.0 will be prone to rolling over.
   */
  public final inline var wheelRollInfluence: Float
    @JvmName("wheelRollInfluenceProperty")
    get() = getRollInfluence()
    @JvmName("wheelRollInfluenceProperty")
    set(`value`) {
      setRollInfluence(value)
    }

  /**
   * The radius of the wheel in meters.
   */
  public final inline var wheelRadius: Float
    @JvmName("wheelRadiusProperty")
    get() = getRadius()
    @JvmName("wheelRadiusProperty")
    set(`value`) {
      setRadius(value)
    }

  /**
   * This is the distance in meters the wheel is lowered from its origin point. Don't set this to
   * 0.0 and move the wheel into position, instead move the origin point of your wheel (the gizmo in
   * Godot) to the position the wheel will take when bottoming out, then use the rest length to move
   * the wheel down to the position it should be in when the car is in rest.
   */
  public final inline var wheelRestLength: Float
    @JvmName("wheelRestLengthProperty")
    get() = getSuspensionRestLength()
    @JvmName("wheelRestLengthProperty")
    set(`value`) {
      setSuspensionRestLength(value)
    }

  /**
   * This determines how much grip this wheel has. It is combined with the friction setting of the
   * surface the wheel is in contact with. 0.0 means no grip, 1.0 is normal grip. For a drift car
   * setup, try setting the grip of the rear wheels slightly lower than the front wheels, or use a
   * lower value to simulate tire wear.
   * It's best to set this to 1.0 when starting out.
   */
  public final inline var wheelFrictionSlip: Float
    @JvmName("wheelFrictionSlipProperty")
    get() = getFrictionSlip()
    @JvmName("wheelFrictionSlipProperty")
    set(`value`) {
      setFrictionSlip(value)
    }

  /**
   * This is the distance the suspension can travel. As Godot units are equivalent to meters, keep
   * this setting relatively low. Try a value between 0.1 and 0.3 depending on the type of car.
   */
  public final inline var suspensionTravel: Float
    @JvmName("suspensionTravelProperty")
    get() = getSuspensionTravel()
    @JvmName("suspensionTravelProperty")
    set(`value`) {
      setSuspensionTravel(value)
    }

  /**
   * The stiffness of the suspension, measured in Newtons per millimeter (N/mm), or megagrams per
   * second squared (Mg/s²). Use a value lower than 50 for an off-road car, a value between 50 and 100
   * for a race car and try something around 200 for something like a Formula 1 car.
   */
  public final inline var suspensionStiffness: Float
    @JvmName("suspensionStiffnessProperty")
    get() = getSuspensionStiffness()
    @JvmName("suspensionStiffnessProperty")
    set(`value`) {
      setSuspensionStiffness(value)
    }

  /**
   * The maximum force the spring can resist. This value should be higher than a quarter of the
   * [RigidBody3D.mass] of the [VehicleBody3D] or the spring will not carry the weight of the vehicle.
   * Good results are often obtained by a value that is about 3× to 4× this number.
   */
  public final inline var suspensionMaxForce: Float
    @JvmName("suspensionMaxForceProperty")
    get() = getSuspensionMaxForce()
    @JvmName("suspensionMaxForceProperty")
    set(`value`) {
      setSuspensionMaxForce(value)
    }

  /**
   * The damping applied to the suspension spring when being compressed, meaning when the wheel is
   * moving up relative to the vehicle. It is measured in Newton-seconds per millimeter (N⋅s/mm), or
   * megagrams per second (Mg/s). This value should be between 0.0 (no damping) and 1.0, but may be
   * more. A value of 0.0 means the car will keep bouncing as the spring keeps its energy. A good value
   * for this is around 0.3 for a normal car, 0.5 for a race car.
   */
  public final inline var dampingCompression: Float
    @JvmName("dampingCompressionProperty")
    get() = getDampingCompression()
    @JvmName("dampingCompressionProperty")
    set(`value`) {
      setDampingCompression(value)
    }

  /**
   * The damping applied to the suspension spring when rebounding or extending, meaning when the
   * wheel is moving down relative to the vehicle. It is measured in Newton-seconds per millimeter
   * (N⋅s/mm), or megagrams per second (Mg/s). This value should be between 0.0 (no damping) and 1.0,
   * but may be more. This value should always be slightly higher than the [dampingCompression]
   * property. For a [dampingCompression] value of 0.3, try a relaxation value of 0.5.
   */
  public final inline var dampingRelaxation: Float
    @JvmName("dampingRelaxationProperty")
    get() = getDampingRelaxation()
    @JvmName("dampingRelaxationProperty")
    set(`value`) {
      setDampingRelaxation(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(717, scriptIndex)
  }

  public final fun setRadius(length: Float): Unit {
    TransferContext.writeArguments(DOUBLE to length.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRadiusPtr, NIL)
  }

  public final fun getRadius(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSuspensionRestLength(length: Float): Unit {
    TransferContext.writeArguments(DOUBLE to length.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSuspensionRestLengthPtr, NIL)
  }

  public final fun getSuspensionRestLength(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getSuspensionRestLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSuspensionTravel(length: Float): Unit {
    TransferContext.writeArguments(DOUBLE to length.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSuspensionTravelPtr, NIL)
  }

  public final fun getSuspensionTravel(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getSuspensionTravelPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSuspensionStiffness(length: Float): Unit {
    TransferContext.writeArguments(DOUBLE to length.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSuspensionStiffnessPtr, NIL)
  }

  public final fun getSuspensionStiffness(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getSuspensionStiffnessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSuspensionMaxForce(length: Float): Unit {
    TransferContext.writeArguments(DOUBLE to length.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSuspensionMaxForcePtr, NIL)
  }

  public final fun getSuspensionMaxForce(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getSuspensionMaxForcePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDampingCompression(length: Float): Unit {
    TransferContext.writeArguments(DOUBLE to length.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDampingCompressionPtr, NIL)
  }

  public final fun getDampingCompression(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getDampingCompressionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDampingRelaxation(length: Float): Unit {
    TransferContext.writeArguments(DOUBLE to length.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDampingRelaxationPtr, NIL)
  }

  public final fun getDampingRelaxation(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getDampingRelaxationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setUseAsTraction(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setUseAsTractionPtr, NIL)
  }

  public final fun isUsedAsTraction(): Boolean {
    TransferContext.callMethod(ptr, MethodBindings.isUsedAsTractionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUseAsSteering(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setUseAsSteeringPtr, NIL)
  }

  public final fun isUsedAsSteering(): Boolean {
    TransferContext.callMethod(ptr, MethodBindings.isUsedAsSteeringPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFrictionSlip(length: Float): Unit {
    TransferContext.writeArguments(DOUBLE to length.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFrictionSlipPtr, NIL)
  }

  public final fun getFrictionSlip(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getFrictionSlipPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns `true` if this wheel is in contact with a surface.
   */
  public final fun isInContact(): Boolean {
    TransferContext.callMethod(ptr, MethodBindings.isInContactPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the contacting body node if valid in the tree, as [Node3D]. At the moment, [GridMap] is
   * not supported so the node will be always of type [PhysicsBody3D].
   * Returns `null` if the wheel is not in contact with a surface, or the contact body is not a
   * [PhysicsBody3D].
   */
  public final fun getContactBody(): Node3D? {
    TransferContext.callMethod(ptr, MethodBindings.getContactBodyPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Node3D?)
  }

  /**
   * Returns the point of the suspension's collision in world space if the wheel is in contact. If
   * the wheel isn't in contact with anything, returns the maximum point of the wheel's ray cast in
   * world space, which is defined by `wheel_rest_length + wheel_radius`.
   */
  public final fun getContactPoint(): Vector3 {
    TransferContext.callMethod(ptr, MethodBindings.getContactPointPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the normal of the suspension's collision in world space if the wheel is in contact. If
   * the wheel isn't in contact with anything, returns a vector pointing directly along the suspension
   * axis toward the vehicle in world space.
   */
  public final fun getContactNormal(): Vector3 {
    TransferContext.callMethod(ptr, MethodBindings.getContactNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setRollInfluence(rollInfluence: Float): Unit {
    TransferContext.writeArguments(DOUBLE to rollInfluence.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRollInfluencePtr, NIL)
  }

  public final fun getRollInfluence(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getRollInfluencePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns a value between 0.0 and 1.0 that indicates whether this wheel is skidding. 0.0 is
   * skidding (the wheel has lost grip, e.g. icy terrain), 1.0 means not skidding (the wheel has full
   * grip, e.g. dry asphalt road).
   */
  public final fun getSkidinfo(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getSkidinfoPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the rotational speed of the wheel in revolutions per minute.
   */
  public final fun getRpm(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getRpmPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEngineForce(engineForce: Float): Unit {
    TransferContext.writeArguments(DOUBLE to engineForce.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setEngineForcePtr, NIL)
  }

  public final fun getEngineForce(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getEngineForcePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setBrake(brake: Float): Unit {
    TransferContext.writeArguments(DOUBLE to brake.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setBrakePtr, NIL)
  }

  public final fun getBrake(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getBrakePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSteering(steering: Float): Unit {
    TransferContext.writeArguments(DOUBLE to steering.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSteeringPtr, NIL)
  }

  public final fun getSteering(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getSteeringPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  public object MethodBindings {
    internal val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_radius", 373806689)

    internal val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_radius", 1740695150)

    internal val setSuspensionRestLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_suspension_rest_length", 373806689)

    internal val getSuspensionRestLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_suspension_rest_length", 1740695150)

    internal val setSuspensionTravelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_suspension_travel", 373806689)

    internal val getSuspensionTravelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_suspension_travel", 1740695150)

    internal val setSuspensionStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_suspension_stiffness", 373806689)

    internal val getSuspensionStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_suspension_stiffness", 1740695150)

    internal val setSuspensionMaxForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_suspension_max_force", 373806689)

    internal val getSuspensionMaxForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_suspension_max_force", 1740695150)

    internal val setDampingCompressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_damping_compression", 373806689)

    internal val getDampingCompressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_damping_compression", 1740695150)

    internal val setDampingRelaxationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_damping_relaxation", 373806689)

    internal val getDampingRelaxationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_damping_relaxation", 1740695150)

    internal val setUseAsTractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_use_as_traction", 2586408642)

    internal val isUsedAsTractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "is_used_as_traction", 36873697)

    internal val setUseAsSteeringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_use_as_steering", 2586408642)

    internal val isUsedAsSteeringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "is_used_as_steering", 36873697)

    internal val setFrictionSlipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_friction_slip", 373806689)

    internal val getFrictionSlipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_friction_slip", 1740695150)

    internal val isInContactPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "is_in_contact", 36873697)

    internal val getContactBodyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_contact_body", 151077316)

    internal val getContactPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_contact_point", 3360562783)

    internal val getContactNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_contact_normal", 3360562783)

    internal val setRollInfluencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_roll_influence", 373806689)

    internal val getRollInfluencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_roll_influence", 1740695150)

    internal val getSkidinfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_skidinfo", 1740695150)

    internal val getRpmPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_rpm", 1740695150)

    internal val setEngineForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_engine_force", 373806689)

    internal val getEngineForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_engine_force", 1740695150)

    internal val setBrakePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_brake", 373806689)

    internal val getBrakePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_brake", 1740695150)

    internal val setSteeringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_steering", 373806689)

    internal val getSteeringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_steering", 1740695150)
  }
}
