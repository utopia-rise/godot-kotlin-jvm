// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

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
  public var engineForce: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEngineForcePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEngineForcePtr, NIL)
    }

  /**
   * Slows down the wheel by applying a braking force. The wheel is only slowed down if it is in
   * contact with a surface. The force you need to apply to adequately slow down your vehicle depends
   * on the [RigidBody3D.mass] of the vehicle. For a vehicle with a mass set to 1000, try a value in
   * the 25 - 30 range for hard braking.
   */
  public var brake: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBrakePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setBrakePtr, NIL)
    }

  /**
   * The steering angle for the wheel, in radians. Setting this to a non-zero value will result in
   * the vehicle turning when it's moving.
   */
  public var steering: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSteeringPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSteeringPtr, NIL)
    }

  /**
   * If `true`, this wheel transfers engine force to the ground to propel the vehicle forward. This
   * value is used in conjunction with [VehicleBody3D.engineForce] and ignored if you are using the
   * per-wheel [engineForce] value instead.
   */
  public var useAsTraction: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsedAsTractionPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseAsTractionPtr, NIL)
    }

  /**
   * If `true`, this wheel will be turned when the car steers. This value is used in conjunction
   * with [VehicleBody3D.steering] and ignored if you are using the per-wheel [steering] value instead.
   */
  public var useAsSteering: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsedAsSteeringPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseAsSteeringPtr, NIL)
    }

  /**
   * This value affects the roll of your vehicle. If set to 1.0 for all wheels, your vehicle will
   * resist body roll, while a value of 0.0 will be prone to rolling over.
   */
  public var wheelRollInfluence: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRollInfluencePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRollInfluencePtr, NIL)
    }

  /**
   * The radius of the wheel in meters.
   */
  public var wheelRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRadiusPtr, NIL)
    }

  /**
   * This is the distance in meters the wheel is lowered from its origin point. Don't set this to
   * 0.0 and move the wheel into position, instead move the origin point of your wheel (the gizmo in
   * Godot) to the position the wheel will take when bottoming out, then use the rest length to move
   * the wheel down to the position it should be in when the car is in rest.
   */
  public var wheelRestLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSuspensionRestLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSuspensionRestLengthPtr, NIL)
    }

  /**
   * This determines how much grip this wheel has. It is combined with the friction setting of the
   * surface the wheel is in contact with. 0.0 means no grip, 1.0 is normal grip. For a drift car
   * setup, try setting the grip of the rear wheels slightly lower than the front wheels, or use a
   * lower value to simulate tire wear.
   * It's best to set this to 1.0 when starting out.
   */
  public var wheelFrictionSlip: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFrictionSlipPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFrictionSlipPtr, NIL)
    }

  /**
   * This is the distance the suspension can travel. As Godot units are equivalent to meters, keep
   * this setting relatively low. Try a value between 0.1 and 0.3 depending on the type of car.
   */
  public var suspensionTravel: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSuspensionTravelPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSuspensionTravelPtr, NIL)
    }

  /**
   * This value defines the stiffness of the suspension. Use a value lower than 50 for an off-road
   * car, a value between 50 and 100 for a race car and try something around 200 for something like a
   * Formula 1 car.
   */
  public var suspensionStiffness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSuspensionStiffnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSuspensionStiffnessPtr, NIL)
    }

  /**
   * The maximum force the spring can resist. This value should be higher than a quarter of the
   * [RigidBody3D.mass] of the [VehicleBody3D] or the spring will not carry the weight of the vehicle.
   * Good results are often obtained by a value that is about 3× to 4× this number.
   */
  public var suspensionMaxForce: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSuspensionMaxForcePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSuspensionMaxForcePtr, NIL)
    }

  /**
   * The damping applied to the spring when the spring is being compressed. This value should be
   * between 0.0 (no damping) and 1.0. A value of 0.0 means the car will keep bouncing as the spring
   * keeps its energy. A good value for this is around 0.3 for a normal car, 0.5 for a race car.
   */
  public var dampingCompression: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDampingCompressionPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDampingCompressionPtr, NIL)
    }

  /**
   * The damping applied to the spring when relaxing. This value should be between 0.0 (no damping)
   * and 1.0. This value should always be slightly higher than the [dampingCompression] property. For a
   * [dampingCompression] value of 0.3, try a relaxation value of 0.5.
   */
  public var dampingRelaxation: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDampingRelaxationPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDampingRelaxationPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VEHICLEWHEEL3D, scriptIndex)
    return true
  }

  /**
   * Returns `true` if this wheel is in contact with a surface.
   */
  public fun isInContact(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isInContactPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the contacting body node if valid in the tree, as [Node3D]. At the moment, [GridMap] is
   * not supported so the node will be always of type [PhysicsBody3D].
   * Returns `null` if the wheel is not in contact with a surface, or the contact body is not a
   * [PhysicsBody3D].
   */
  public fun getContactBody(): Node3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getContactBodyPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Node3D?)
  }

  /**
   * Returns a value between 0.0 and 1.0 that indicates whether this wheel is skidding. 0.0 is
   * skidding (the wheel has lost grip, e.g. icy terrain), 1.0 means not skidding (the wheel has full
   * grip, e.g. dry asphalt road).
   */
  public fun getSkidinfo(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSkidinfoPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the rotational speed of the wheel in revolutions per minute.
   */
  public fun getRpm(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRpmPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setRadiusPtr: VoidPtr = TypeManager.getMethodBindPtr("VehicleWheel3D", "set_radius")

    public val getRadiusPtr: VoidPtr = TypeManager.getMethodBindPtr("VehicleWheel3D", "get_radius")

    public val setSuspensionRestLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_suspension_rest_length")

    public val getSuspensionRestLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_suspension_rest_length")

    public val setSuspensionTravelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_suspension_travel")

    public val getSuspensionTravelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_suspension_travel")

    public val setSuspensionStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_suspension_stiffness")

    public val getSuspensionStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_suspension_stiffness")

    public val setSuspensionMaxForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_suspension_max_force")

    public val getSuspensionMaxForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_suspension_max_force")

    public val setDampingCompressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_damping_compression")

    public val getDampingCompressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_damping_compression")

    public val setDampingRelaxationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_damping_relaxation")

    public val getDampingRelaxationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_damping_relaxation")

    public val setUseAsTractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_use_as_traction")

    public val isUsedAsTractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "is_used_as_traction")

    public val setUseAsSteeringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_use_as_steering")

    public val isUsedAsSteeringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "is_used_as_steering")

    public val setFrictionSlipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_friction_slip")

    public val getFrictionSlipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_friction_slip")

    public val isInContactPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "is_in_contact")

    public val getContactBodyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_contact_body")

    public val setRollInfluencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_roll_influence")

    public val getRollInfluencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_roll_influence")

    public val getSkidinfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_skidinfo")

    public val getRpmPtr: VoidPtr = TypeManager.getMethodBindPtr("VehicleWheel3D", "get_rpm")

    public val setEngineForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_engine_force")

    public val getEngineForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_engine_force")

    public val setBrakePtr: VoidPtr = TypeManager.getMethodBindPtr("VehicleWheel3D", "set_brake")

    public val getBrakePtr: VoidPtr = TypeManager.getMethodBindPtr("VehicleWheel3D", "get_brake")

    public val setSteeringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "set_steering")

    public val getSteeringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleWheel3D", "get_steering")
  }
}
