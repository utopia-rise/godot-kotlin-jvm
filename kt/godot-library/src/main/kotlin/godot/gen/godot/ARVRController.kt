// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class ARVRController : Spatial() {
  val buttonPressed: Signal1<Long> by signal("button")

  val buttonRelease: Signal1<Long> by signal("button")

  val meshUpdated: Signal1<Mesh> by signal("mesh")

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

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_ARVRCONTROLLER)

  open fun getControllerName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRCONTROLLER_GET_CONTROLLER_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getHand(): ARVRPositionalTracker.TrackerHand {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRCONTROLLER_GET_HAND, LONG)
    return ARVRPositionalTracker.TrackerHand.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun getIsActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRCONTROLLER_GET_IS_ACTIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun getJoystickAxis(axis: Long): Double {
    TransferContext.writeArguments(LONG to axis)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRCONTROLLER_GET_JOYSTICK_AXIS,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun getJoystickId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRCONTROLLER_GET_JOYSTICK_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getMesh(): Mesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRCONTROLLER_GET_MESH, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Mesh?
  }

  open fun isButtonPressed(button: Long): Long {
    TransferContext.writeArguments(LONG to button)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRCONTROLLER_IS_BUTTON_PRESSED,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  companion object
}
