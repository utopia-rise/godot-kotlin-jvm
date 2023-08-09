// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class OpenXRInterface : XRInterface() {
  public val sessionBegun: Signal0 by signal()

  public val sessionStopping: Signal0 by signal()

  public val sessionFocussed: Signal0 by signal()

  public val sessionVisible: Signal0 by signal()

  public val poseRecentered: Signal0 by signal()

  public var displayRefreshRate: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_GET_DISPLAY_REFRESH_RATE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_SET_DISPLAY_REFRESH_RATE, NIL)
    }

  public var renderTargetSizeMultiplier: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_GET_RENDER_TARGET_SIZE_MULTIPLIER, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_SET_RENDER_TARGET_SIZE_MULTIPLIER, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OPENXRINTERFACE, scriptIndex)
    return true
  }

  public fun isActionSetActive(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_IS_ACTION_SET_ACTIVE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setActionSetActive(name: String, active: Boolean): Unit {
    TransferContext.writeArguments(STRING to name, BOOL to active)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_SET_ACTION_SET_ACTIVE, NIL)
  }

  public fun getActionSets(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_GET_ACTION_SETS,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public fun getAvailableDisplayRefreshRates(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRINTERFACE_GET_AVAILABLE_DISPLAY_REFRESH_RATES, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public companion object
}
