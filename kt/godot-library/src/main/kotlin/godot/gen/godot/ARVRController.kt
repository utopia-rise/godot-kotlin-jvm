// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.ARVRPositionalTracker
import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * A spatial node representing a spatially-tracked controller.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/vr/index.html](https://docs.godotengine.org/en/latest/tutorials/vr/index.html)
 *
 * This is a helper spatial node that is linked to the tracking of controllers. It also offers several handy passthroughs to the state of buttons and such on the controllers.
 *
 * Controllers are linked by their ID. You can create controller nodes before the controllers are available. If your game always uses two controllers (one for each hand), you can predefine the controllers with ID 1 and 2; they will become active as soon as the controllers are identified. If you expect additional controllers to be used, you should react to the signals and add ARVRController nodes to your scene.
 *
 * The position of the controller node is automatically updated by the [godot.ARVRServer]. This makes this node ideal to add child nodes to visualize the controller.
 */
@GodotBaseType
open class ARVRController : Spatial() {
  /**
   * Emitted when a button on this controller is pressed.
   */
  val buttonPressed: Signal1<Long> by signal("button")

  /**
   * Emitted when a button on this controller is released.
   */
  val buttonRelease: Signal1<Long> by signal("button")

  /**
   * Emitted when the mesh associated with the controller changes or when one becomes available. Generally speaking this will be a static mesh after becoming available.
   */
  val meshUpdated: Signal1<Mesh> by signal("mesh")

  /**
   * The controller's ID.
   *
   * A controller ID of 0 is unbound and will always result in an inactive node. Controller ID 1 is reserved for the first controller that identifies itself as the left-hand controller and ID 2 is reserved for the first controller that identifies itself as the right-hand controller.
   *
   * For any other controller that the [godot.ARVRServer] detects, we continue with controller ID 3.
   *
   * When a controller is turned off, its slot is freed. This ensures controllers will keep the same ID even when controllers with lower IDs are turned off.
   */
  open var controllerId: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRCONTROLLER_GET_CONTROLLER_ID,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRCONTROLLER_SET_CONTROLLER_ID,
          NIL)
    }

  /**
   * The degree to which the controller vibrates. Ranges from `0.0` to `1.0` with precision `.01`. If changed, updates [godot.ARVRPositionalTracker.rumble] accordingly.
   *
   * This is a useful property to animate if you want the controller to vibrate for a limited duration.
   */
  open var rumble: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRCONTROLLER_GET_RUMBLE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRCONTROLLER_SET_RUMBLE, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_ARVRCONTROLLER)
  }

  /**
   * If active, returns the name of the associated controller if provided by the AR/VR SDK used.
   */
  open fun getControllerName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRCONTROLLER_GET_CONTROLLER_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the hand holding this controller, if known. See [enum ARVRPositionalTracker.TrackerHand].
   */
  open fun getHand(): ARVRPositionalTracker.TrackerHand {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRCONTROLLER_GET_HAND, LONG)
    return ARVRPositionalTracker.TrackerHand.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns `true` if the bound controller is active. ARVR systems attempt to track active controllers.
   */
  open fun getIsActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRCONTROLLER_GET_IS_ACTIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the value of the given axis for things like triggers, touchpads, etc. that are embedded into the controller.
   */
  open fun getJoystickAxis(axis: Long): Double {
    TransferContext.writeArguments(LONG to axis)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRCONTROLLER_GET_JOYSTICK_AXIS,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the ID of the joystick object bound to this. Every controller tracked by the [godot.ARVRServer] that has buttons and axis will also be registered as a joystick within Godot. This means that all the normal joystick tracking and input mapping will work for buttons and axis found on the AR/VR controllers. This ID is purely offered as information so you can link up the controller with its joystick entry.
   */
  open fun getJoystickId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRCONTROLLER_GET_JOYSTICK_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * If provided by the [godot.ARVRInterface], this returns a mesh associated with the controller. This can be used to visualize the controller.
   */
  open fun getMesh(): Mesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRCONTROLLER_GET_MESH, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Mesh?
  }

  /**
   * Returns `true` if the button at index `button` is pressed. See [enum JoystickList], in particular the `JOY_VR_*` constants.
   */
  open fun isButtonPressed(button: Long): Long {
    TransferContext.writeArguments(LONG to button)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRCONTROLLER_IS_BUTTON_PRESSED,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }
}
