// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Suppress

/**
 * A spatial node representing a spatially-tracked controller.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/xr/index.html]($DOCS_URL/tutorials/xr/index.html)
 *
 * This is a helper spatial node that is linked to the tracking of controllers. It also offers several handy passthroughs to the state of buttons and such on the controllers.
 *
 * Controllers are linked by their ID. You can create controller nodes before the controllers are available. If your game always uses two controllers (one for each hand), you can predefine the controllers with ID 1 and 2; they will become active as soon as the controllers are identified. If you expect additional controllers to be used, you should react to the signals and add XRController3D nodes to your scene.
 *
 * The position of the controller node is automatically updated by the [godot.XRServer]. This makes this node ideal to add child nodes to visualize the controller.
 *
 * As many XR runtimes now use a configurable action map all inputs are named.
 */
@GodotBaseType
public open class XRController3D : XRNode3D() {
  /**
   * Emitted when a button on this controller is pressed.
   */
  public val buttonPressed: Signal1<String> by signal("name")

  /**
   * Emitted when a button on this controller is released.
   */
  public val buttonReleased: Signal1<String> by signal("name")

  /**
   * Emitted when a trigger or similar input on this controller changes value.
   */
  public val inputValueChanged: Signal2<String, Double> by signal("name", "value")

  /**
   * Emitted when a thumbstick or thumbpad on this controller is moved.
   */
  public val inputAxisChanged: Signal2<String, Vector2> by signal("name", "value")

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_XRCONTROLLER3D, scriptIndex)
    return true
  }

  /**
   * Returns `true` if the button with the given [name] is pressed.
   */
  public fun isButtonPressed(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRCONTROLLER3D_IS_BUTTON_PRESSED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns a numeric value for the input with the given [name]. This is used for triggers and grip sensors.
   */
  public fun getValue(name: StringName): Double {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRCONTROLLER3D_GET_VALUE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns a [godot.core.Vector2] for the input with the given [name]. This is used for thumbsticks and thumbpads found on many controllers.
   */
  public fun getAxis(name: StringName): Vector2 {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRCONTROLLER3D_GET_AXIS, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the hand holding this controller, if known. See [enum XRPositionalTracker.TrackerHand].
   */
  public fun getTrackerHand(): XRPositionalTracker.TrackerHand {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRCONTROLLER3D_GET_TRACKER_HAND,
        LONG)
    return XRPositionalTracker.TrackerHand.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public companion object
}
