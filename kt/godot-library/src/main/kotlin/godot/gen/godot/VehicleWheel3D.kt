// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Physics object that simulates the behavior of a wheel.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/524](https://godotengine.org/asset-library/asset/524)
 *
 * This node needs to be used as a child node of [godot.VehicleBody3D] and simulates the behavior of one of its wheels. This node also acts as a collider to detect if the wheel is touching a surface.
 *
 * **Note:** This class has known issues and isn't designed to provide realistic 3D vehicle physics. If you want advanced vehicle physics, you will probably have to write your own physics integration using another [godot.PhysicsBody3D] class.
 */
@GodotBaseType
public open class VehicleWheel3D : Node3D() {
  /**
   * Accelerates the wheel by applying an engine force. The wheel is only sped up if it is in contact with a surface. The [godot.RigidDynamicBody3D.mass] of the vehicle has an effect on the acceleration of the vehicle. For a vehicle with a mass set to 1000, try a value in the 25 - 50 range for acceleration.
   *
   * **Note:** The simulation does not take the effect of gears into account, you will need to add logic for this if you wish to simulate gears.
   *
   * A negative value will result in the wheel reversing.
   */
  public var engineForce: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_GET_ENGINE_FORCE,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_SET_ENGINE_FORCE,
          NIL.ordinal)
    }

  /**
   * Slows down the wheel by applying a braking force. The wheel is only slowed down if it is in contact with a surface. The force you need to apply to adequately slow down your vehicle depends on the [godot.RigidDynamicBody3D.mass] of the vehicle. For a vehicle with a mass set to 1000, try a value in the 25 - 30 range for hard braking.
   */
  public var brake: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_GET_BRAKE,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_SET_BRAKE, NIL.ordinal)
    }

  /**
   * The steering angle for the wheel, in radians. Setting this to a non-zero value will result in the vehicle turning when it's moving.
   */
  public var steering: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_GET_STEERING,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_SET_STEERING,
          NIL.ordinal)
    }

  /**
   * If `true`, this wheel transfers engine force to the ground to propel the vehicle forward. This value is used in conjunction with [godot.VehicleBody3D.engineForce] and ignored if you are using the per-wheel [engineForce] value instead.
   */
  public var useAsTraction: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_IS_USED_AS_TRACTION,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_SET_USE_AS_TRACTION,
          NIL.ordinal)
    }

  /**
   * If `true`, this wheel will be turned when the car steers. This value is used in conjunction with [godot.VehicleBody3D.steering] and ignored if you are using the per-wheel [steering] value instead.
   */
  public var useAsSteering: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_IS_USED_AS_STEERING,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_SET_USE_AS_STEERING,
          NIL.ordinal)
    }

  /**
   * This value affects the roll of your vehicle. If set to 1.0 for all wheels, your vehicle will be prone to rolling over, while a value of 0.0 will resist body roll.
   */
  public var wheelRollInfluence: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_GET_ROLL_INFLUENCE,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_SET_ROLL_INFLUENCE,
          NIL.ordinal)
    }

  /**
   * The radius of the wheel in meters.
   */
  public var wheelRadius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_GET_RADIUS,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_SET_RADIUS, NIL.ordinal)
    }

  /**
   * This is the distance in meters the wheel is lowered from its origin point. Don't set this to 0.0 and move the wheel into position, instead move the origin point of your wheel (the gizmo in Godot) to the position the wheel will take when bottoming out, then use the rest length to move the wheel down to the position it should be in when the car is in rest.
   */
  public var wheelRestLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_GET_SUSPENSION_REST_LENGTH, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_SET_SUSPENSION_REST_LENGTH, NIL.ordinal)
    }

  /**
   * This determines how much grip this wheel has. It is combined with the friction setting of the surface the wheel is in contact with. 0.0 means no grip, 1.0 is normal grip. For a drift car setup, try setting the grip of the rear wheels slightly lower than the front wheels, or use a lower value to simulate tire wear.
   *
   * It's best to set this to 1.0 when starting out.
   */
  public var wheelFrictionSlip: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_GET_FRICTION_SLIP,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_SET_FRICTION_SLIP,
          NIL.ordinal)
    }

  /**
   * This is the distance the suspension can travel. As Godot units are equivalent to meters, keep this setting relatively low. Try a value between 0.1 and 0.3 depending on the type of car.
   */
  public var suspensionTravel: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_GET_SUSPENSION_TRAVEL,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_SET_SUSPENSION_TRAVEL,
          NIL.ordinal)
    }

  /**
   * This value defines the stiffness of the suspension. Use a value lower than 50 for an off-road car, a value between 50 and 100 for a race car and try something around 200 for something like a Formula 1 car.
   */
  public var suspensionStiffness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_GET_SUSPENSION_STIFFNESS, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_SET_SUSPENSION_STIFFNESS, NIL.ordinal)
    }

  /**
   * The maximum force the spring can resist. This value should be higher than a quarter of the [godot.RigidDynamicBody3D.mass] of the [godot.VehicleBody3D] or the spring will not carry the weight of the vehicle. Good results are often obtained by a value that is about 3× to 4× this number.
   */
  public var suspensionMaxForce: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_GET_SUSPENSION_MAX_FORCE, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_SET_SUSPENSION_MAX_FORCE, NIL.ordinal)
    }

  /**
   * The damping applied to the spring when the spring is being compressed. This value should be between 0.0 (no damping) and 1.0. A value of 0.0 means the car will keep bouncing as the spring keeps its energy. A good value for this is around 0.3 for a normal car, 0.5 for a race car.
   */
  public var dampingCompression: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_GET_DAMPING_COMPRESSION,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_SET_DAMPING_COMPRESSION,
          NIL.ordinal)
    }

  /**
   * The damping applied to the spring when relaxing. This value should be between 0.0 (no damping) and 1.0. This value should always be slightly higher than the [dampingCompression] property. For a [dampingCompression] value of 0.3, try a relaxation value of 0.5.
   */
  public var dampingRelaxation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_GET_DAMPING_RELAXATION,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_SET_DAMPING_RELAXATION,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VEHICLEWHEEL3D)
  }

  /**
   * Returns `true` if this wheel is in contact with a surface.
   */
  public fun isInContact(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_IS_IN_CONTACT,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the contacting body node if valid in the tree, as [godot.Node3D]. At the moment, [godot.GridMap] is not supported so the node will be always of type [godot.PhysicsBody3D].
   *
   * Returns `null` if the wheel is not in contact with a surface, or the contact body is not a [godot.PhysicsBody3D].
   */
  public fun getContactBody(): Node3D? {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_GET_CONTACT_BODY,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Node3D?
  }

  /**
   * Returns a value between 0.0 and 1.0 that indicates whether this wheel is skidding. 0.0 is skidding (the wheel has lost grip, e.g. icy terrain), 1.0 means not skidding (the wheel has full grip, e.g. dry asphalt road).
   */
  public fun getSkidinfo(): Double {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_GET_SKIDINFO,
        DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the rotational speed of the wheel in revolutions per minute.
   */
  public fun getRpm(): Double {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEWHEEL3D_GET_RPM, DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public companion object
}
