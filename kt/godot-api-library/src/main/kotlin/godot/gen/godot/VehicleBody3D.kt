// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VEHICLEBODY3D_INDEX: Int = 619

/**
 * This physics body implements all the physics logic needed to simulate a car. It is based on the
 * raycast vehicle system commonly found in physics engines. Aside from a [CollisionShape3D] for the
 * main body of the vehicle, you must also add a [VehicleWheel3D] node for each wheel. You should also
 * add a [MeshInstance3D] to this node for the 3D model of the vehicle, but this model should generally
 * not include meshes for the wheels. You can control the vehicle by using the [brake], [engineForce],
 * and [steering] properties. The position or orientation of this node shouldn't be changed directly.
 * **Note:** The origin point of your VehicleBody3D will determine the center of gravity of your
 * vehicle. To make the vehicle more grounded, the origin point is usually kept low, moving the
 * [CollisionShape3D] and [MeshInstance3D] upwards.
 * **Note:** This class has known issues and isn't designed to provide realistic 3D vehicle physics.
 * If you want advanced vehicle physics, you may have to write your own physics integration using
 * [CharacterBody3D] or [RigidBody3D].
 */
@GodotBaseType
public open class VehicleBody3D : RigidBody3D() {
  /**
   * Accelerates the vehicle by applying an engine force. The vehicle is only sped up if the wheels
   * that have [VehicleWheel3D.useAsTraction] set to `true` and are in contact with a surface. The
   * [RigidBody3D.mass] of the vehicle has an effect on the acceleration of the vehicle. For a vehicle
   * with a mass set to 1000, try a value in the 25 - 50 range for acceleration.
   * **Note:** The simulation does not take the effect of gears into account, you will need to add
   * logic for this if you wish to simulate gears.
   * A negative value will result in the vehicle reversing.
   */
  public final inline var engineForce: Float
    @JvmName("engineForceProperty")
    get() = getEngineForce()
    @JvmName("engineForceProperty")
    set(`value`) {
      setEngineForce(value)
    }

  /**
   * Slows down the vehicle by applying a braking force. The vehicle is only slowed down if the
   * wheels are in contact with a surface. The force you need to apply to adequately slow down your
   * vehicle depends on the [RigidBody3D.mass] of the vehicle. For a vehicle with a mass set to 1000,
   * try a value in the 25 - 30 range for hard braking.
   */
  public final inline var brake: Float
    @JvmName("brakeProperty")
    get() = getBrake()
    @JvmName("brakeProperty")
    set(`value`) {
      setBrake(value)
    }

  /**
   * The steering angle for the vehicle. Setting this to a non-zero value will result in the vehicle
   * turning when it's moving. Wheels that have [VehicleWheel3D.useAsSteering] set to `true` will
   * automatically be rotated.
   * **Note:** This property is edited in the inspector in degrees. In code the property is set in
   * radians.
   */
  public final inline var steering: Float
    @JvmName("steeringProperty")
    get() = getSteering()
    @JvmName("steeringProperty")
    set(`value`) {
      setSteering(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VEHICLEBODY3D_INDEX, scriptIndex)
  }

  public final fun setEngineForce(engineForce: Float): Unit {
    Internals.writeArguments(DOUBLE to engineForce.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setEngineForcePtr, NIL)
  }

  public final fun getEngineForce(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEngineForcePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setBrake(brake: Float): Unit {
    Internals.writeArguments(DOUBLE to brake.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setBrakePtr, NIL)
  }

  public final fun getBrake(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBrakePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSteering(steering: Float): Unit {
    Internals.writeArguments(DOUBLE to steering.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setSteeringPtr, NIL)
  }

  public final fun getSteering(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSteeringPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setEngineForcePtr: VoidPtr =
        Internals.getMethodBindPtr("VehicleBody3D", "set_engine_force", 373806689)

    public val getEngineForcePtr: VoidPtr =
        Internals.getMethodBindPtr("VehicleBody3D", "get_engine_force", 1740695150)

    public val setBrakePtr: VoidPtr =
        Internals.getMethodBindPtr("VehicleBody3D", "set_brake", 373806689)

    public val getBrakePtr: VoidPtr =
        Internals.getMethodBindPtr("VehicleBody3D", "get_brake", 1740695150)

    public val setSteeringPtr: VoidPtr =
        Internals.getMethodBindPtr("VehicleBody3D", "set_steering", 373806689)

    public val getSteeringPtr: VoidPtr =
        Internals.getMethodBindPtr("VehicleBody3D", "get_steering", 1740695150)
  }
}
