// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

/**
 * A 3D physics body that simulates the behavior of a car.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/524](https://godotengine.org/asset-library/asset/524)
 *
 * This physics body implements all the physics logic needed to simulate a car. It is based on the raycast vehicle system commonly found in physics engines. Aside from a [godot.CollisionShape3D] for the main body of the vehicle, you must also add a [godot.VehicleWheel3D] node for each wheel. You should also add a [godot.MeshInstance3D] to this node for the 3D model of the vehicle, but this model should generally not include meshes for the wheels. You can control the vehicle by using the [brake], [engineForce], and [steering] properties. The position or orientation of this node shouldn't be changed directly.
 *
 * **Note:** The origin point of your VehicleBody3D will determine the center of gravity of your vehicle. To make the vehicle more grounded, the origin point is usually kept low, moving the [godot.CollisionShape3D] and [godot.MeshInstance3D] upwards.
 *
 * **Note:** This class has known issues and isn't designed to provide realistic 3D vehicle physics. If you want advanced vehicle physics, you may have to write your own physics integration using [godot.CharacterBody3D] or [godot.RigidBody3D].
 */
@GodotBaseType
public open class VehicleBody3D : RigidBody3D() {
  /**
   * Accelerates the vehicle by applying an engine force. The vehicle is only sped up if the wheels that have [godot.VehicleWheel3D.useAsTraction] set to `true` and are in contact with a surface. The [godot.RigidBody3D.mass] of the vehicle has an effect on the acceleration of the vehicle. For a vehicle with a mass set to 1000, try a value in the 25 - 50 range for acceleration.
   *
   * **Note:** The simulation does not take the effect of gears into account, you will need to add logic for this if you wish to simulate gears.
   *
   * A negative value will result in the vehicle reversing.
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
   * Slows down the vehicle by applying a braking force. The vehicle is only slowed down if the wheels are in contact with a surface. The force you need to apply to adequately slow down your vehicle depends on the [godot.RigidBody3D.mass] of the vehicle. For a vehicle with a mass set to 1000, try a value in the 25 - 30 range for hard braking.
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
   * The steering angle for the vehicle. Setting this to a non-zero value will result in the vehicle turning when it's moving. Wheels that have [godot.VehicleWheel3D.useAsSteering] set to `true` will automatically be rotated.
   *
   * **Note:** This property is edited in the inspector in degrees. In code the property is set in radians.
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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VEHICLEBODY3D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setEngineForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleBody3D", "set_engine_force")

    public val getEngineForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleBody3D", "get_engine_force")

    public val setBrakePtr: VoidPtr = TypeManager.getMethodBindPtr("VehicleBody3D", "set_brake")

    public val getBrakePtr: VoidPtr = TypeManager.getMethodBindPtr("VehicleBody3D", "get_brake")

    public val setSteeringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleBody3D", "set_steering")

    public val getSteeringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VehicleBody3D", "get_steering")
  }
}
