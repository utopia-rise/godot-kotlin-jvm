// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Suppress

/**
 * Physics body that simulates the behavior of a car.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/524](https://godotengine.org/asset-library/asset/524)
 *
 * This node implements all the physics logic needed to simulate a car. It is based on the raycast vehicle system commonly found in physics engines. You will need to add a [godot.CollisionShape3D] for the main body of your vehicle and add [godot.VehicleWheel3D] nodes for the wheels. You should also add a [godot.MeshInstance3D] to this node for the 3D model of your car but this model should not include meshes for the wheels. You should control the vehicle by using the [brake], [engineForce], and [steering] properties and not change the position or orientation of this node directly.
 *
 * **Note:** The origin point of your VehicleBody3D will determine the center of gravity of your vehicle so it is better to keep this low and move the [godot.CollisionShape3D] and [godot.MeshInstance3D] upwards.
 *
 * **Note:** This class has known issues and isn't designed to provide realistic 3D vehicle physics. If you want advanced vehicle physics, you will probably have to write your own physics integration using another [godot.PhysicsBody3D] class.
 */
@GodotBaseType
public open class VehicleBody3D : RigidDynamicBody3D() {
  /**
   * Accelerates the vehicle by applying an engine force. The vehicle is only sped up if the wheels that have [godot.VehicleWheel3D.useAsTraction] set to `true` and are in contact with a surface. The [godot.RigidBody3D.mass] of the vehicle has an effect on the acceleration of the vehicle. For a vehicle with a mass set to 1000, try a value in the 25 - 50 range for acceleration.
   *
   * **Note:** The simulation does not take the effect of gears into account, you will need to add logic for this if you wish to simulate gears.
   *
   * A negative value will result in the vehicle reversing.
   */
  public var engineForce: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEBODY3D_GET_ENGINE_FORCE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEBODY3D_SET_ENGINE_FORCE,
          NIL)
    }

  /**
   * Slows down the vehicle by applying a braking force. The vehicle is only slowed down if the wheels are in contact with a surface. The force you need to apply to adequately slow down your vehicle depends on the [godot.RigidBody3D.mass] of the vehicle. For a vehicle with a mass set to 1000, try a value in the 25 - 30 range for hard braking.
   */
  public var brake: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEBODY3D_GET_BRAKE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEBODY3D_SET_BRAKE, NIL)
    }

  /**
   * The steering angle for the vehicle, in radians. Setting this to a non-zero value will result in the vehicle turning when it's moving. Wheels that have [godot.VehicleWheel3D.useAsSteering] set to `true` will automatically be rotated.
   */
  public var steering: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEBODY3D_GET_STEERING,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEBODY3D_SET_STEERING, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VEHICLEBODY3D, scriptIndex)
    return true
  }

  public companion object
}
