// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * This is a helper spatial node that is linked to the tracking of controllers. It also offers
 * several handy passthroughs to the state of buttons and such on the controllers.
 * Controllers are linked by their ID. You can create controller nodes before the controllers are
 * available. If your game always uses two controllers (one for each hand), you can predefine the
 * controllers with ID 1 and 2; they will become active as soon as the controllers are identified. If
 * you expect additional controllers to be used, you should react to the signals and add XRController3D
 * nodes to your scene.
 * The position of the controller node is automatically updated by the [XRServer]. This makes this
 * node ideal to add child nodes to visualize the controller.
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
  public val inputFloatChanged: Signal2<String, Double> by signal("name", "value")

  /**
   * Emitted when a thumbstick or thumbpad on this controller is moved.
   */
  public val inputVector2Changed: Signal2<String, Vector2> by signal("name", "value")

  /**
   * Emitted when the interaction profile on this controller is changed.
   */
  public val profileChanged: Signal1<String> by signal("role")

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_XRCONTROLLER3D, scriptIndex)
  }

  /**
   * Returns `true` if the button with the given [name] is pressed.
   */
  public final fun isButtonPressed(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.isButtonPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns a [Variant] for the input with the given [name]. This works for any input type, the
   * variant will be typed according to the actions configuration.
   */
  public final fun getInput(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getInputPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns a numeric value for the input with the given [name]. This is used for triggers and grip
   * sensors.
   */
  public final fun getFloat(name: StringName): Float {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getFloatPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns a [Vector2] for the input with the given [name]. This is used for thumbsticks and
   * thumbpads found on many controllers.
   */
  public final fun getVector2(name: StringName): Vector2 {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getVector2Ptr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the hand holding this controller, if known. See [XRPositionalTracker.TrackerHand].
   */
  public final fun getTrackerHand(): XRPositionalTracker.TrackerHand {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTrackerHandPtr, LONG)
    return XRPositionalTracker.TrackerHand.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val isButtonPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRController3D", "is_button_pressed", 2619796661)

    public val getInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRController3D", "get_input", 2760726917)

    public val getFloatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRController3D", "get_float", 2349060816)

    public val getVector2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("XRController3D", "get_vector2", 3100822709)

    public val getTrackerHandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRController3D", "get_tracker_hand", 4181770860)
  }
}
