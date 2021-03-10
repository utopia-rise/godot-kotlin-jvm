// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Suppress

/**
 * Physics body that simulates the behavior of a car.
 *
 * This node implements all the physics logic needed to simulate a car. It is based on the raycast vehicle system commonly found in physics engines. You will need to add a [godot.CollisionShape] for the main body of your vehicle and add [godot.VehicleWheel] nodes for the wheels. You should also add a [godot.MeshInstance] to this node for the 3D model of your car but this model should not include meshes for the wheels. You should control the vehicle by using the [brake], [engineForce], and [steering] properties and not change the position or orientation of this node directly.
 *
 * **Note:** The origin point of your VehicleBody will determine the center of gravity of your vehicle so it is better to keep this low and move the [godot.CollisionShape] and [godot.MeshInstance] upwards.
 *
 * **Note:** This class has known issues and isn't designed to provide realistic 3D vehicle physics. If you want advanced vehicle physics, you will probably have to write your own physics integration using another [godot.PhysicsBody] class.
 */
@GodotBaseType
open class VehicleBody : RigidBody() {
  /**
   * Slows down the vehicle by applying a braking force. The vehicle is only slowed down if the wheels are in contact with a surface. The force you need to apply to adequately slow down your vehicle depends on the [godot.RigidBody.mass] of the vehicle. For a vehicle with a mass set to 1000, try a value in the 25 - 30 range for hard braking.
   */
  open var brake: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEBODY_GET_BRAKE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEBODY_SET_BRAKE, NIL)
    }

  /**
   * Accelerates the vehicle by applying an engine force. The vehicle is only speed up if the wheels that have [godot.VehicleWheel.useAsTraction] set to `true` and are in contact with a surface. The [godot.RigidBody.mass] of the vehicle has an effect on the acceleration of the vehicle. For a vehicle with a mass set to 1000, try a value in the 25 - 50 range for acceleration.
   *
   * **Note:** The simulation does not take the effect of gears into account, you will need to add logic for this if you wish to simulate gears.
   *
   * A negative value will result in the vehicle reversing.
   */
  open var engineForce: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEBODY_GET_ENGINE_FORCE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEBODY_SET_ENGINE_FORCE, NIL)
    }

  /**
   * The steering angle for the vehicle. Setting this to a non-zero value will result in the vehicle turning when it's moving. Wheels that have [godot.VehicleWheel.useAsSteering] set to `true` will automatically be rotated.
   */
  open var steering: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEBODY_GET_STEERING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VEHICLEBODY_SET_STEERING, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VEHICLEBODY)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}
