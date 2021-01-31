// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class Popup : Control() {
  val aboutToShow: Signal0 by signal()

  val popupHide: Signal0 by signal()

  open var popupExclusive: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUP_GET_POPUP_EXCLUSIVE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUP_SET_POPUP_EXCLUSIVE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_POPUP)

  open fun popup(bounds: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0)) {
    TransferContext.writeArguments(RECT2 to bounds)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUP_POPUP, NIL)
  }

  open fun popupCentered(size: Vector2 = Vector2(0.0, 0.0)) {
    TransferContext.writeArguments(VECTOR2 to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUP_POPUP_CENTERED, NIL)
  }

  open fun popupCenteredClamped(size: Vector2 = Vector2(0.0, 0.0), fallbackRatio: Double = 0.75) {
    TransferContext.writeArguments(VECTOR2 to size, DOUBLE to fallbackRatio)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUP_POPUP_CENTERED_CLAMPED, NIL)
  }

  open fun popupCenteredMinsize(minsize: Vector2 = Vector2(0.0, 0.0)) {
    TransferContext.writeArguments(VECTOR2 to minsize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUP_POPUP_CENTERED_MINSIZE, NIL)
  }

  open fun popupCenteredRatio(ratio: Double = 0.75) {
    TransferContext.writeArguments(DOUBLE to ratio)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUP_POPUP_CENTERED_RATIO, NIL)
  }

  open fun setAsMinsize() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POPUP_SET_AS_MINSIZE, NIL)
  }

  companion object {
    final const val NOTIFICATION_POPUP_HIDE: Long = 81

    final const val NOTIFICATION_POST_POPUP: Long = 80
  }
}
