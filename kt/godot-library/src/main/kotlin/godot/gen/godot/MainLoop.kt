// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class MainLoop : Object() {
  val onRequestPermissionsResult: Signal2<String, Boolean> by signal("permission", "granted")

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_MAINLOOP)

  open fun _dropFiles(files: PoolStringArray, fromScreen: Long) {
  }

  open fun _finalize() {
  }

  open fun _globalMenuAction(id: Any, meta: Any) {
  }

  open fun _idle(delta: Double): Boolean {
    throw NotImplementedError("_idle is not implemented for MainLoop")
  }

  open fun _initialize() {
  }

  open fun _inputEvent(event: InputEvent) {
  }

  open fun _inputText(text: String) {
  }

  open fun _iteration(delta: Double): Boolean {
    throw NotImplementedError("_iteration is not implemented for MainLoop")
  }

  open fun finish() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MAINLOOP_FINISH, NIL)
  }

  open fun idle(delta: Double): Boolean {
    TransferContext.writeArguments(DOUBLE to delta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MAINLOOP_IDLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun init() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MAINLOOP_INIT, NIL)
  }

  open fun inputEvent(event: InputEvent) {
    TransferContext.writeArguments(OBJECT to event)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MAINLOOP_INPUT_EVENT, NIL)
  }

  open fun inputText(text: String) {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MAINLOOP_INPUT_TEXT, NIL)
  }

  open fun iteration(delta: Double): Boolean {
    TransferContext.writeArguments(DOUBLE to delta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MAINLOOP_ITERATION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  companion object {
    final const val NOTIFICATION_APP_PAUSED: Long = 1015

    final const val NOTIFICATION_APP_RESUMED: Long = 1014

    final const val NOTIFICATION_CRASH: Long = 1012

    final const val NOTIFICATION_OS_IME_UPDATE: Long = 1013

    final const val NOTIFICATION_OS_MEMORY_WARNING: Long = 1009

    final const val NOTIFICATION_TRANSLATION_CHANGED: Long = 1010

    final const val NOTIFICATION_WM_ABOUT: Long = 1011

    final const val NOTIFICATION_WM_FOCUS_IN: Long = 1004

    final const val NOTIFICATION_WM_FOCUS_OUT: Long = 1005

    final const val NOTIFICATION_WM_GO_BACK_REQUEST: Long = 1007

    final const val NOTIFICATION_WM_MOUSE_ENTER: Long = 1002

    final const val NOTIFICATION_WM_MOUSE_EXIT: Long = 1003

    final const val NOTIFICATION_WM_QUIT_REQUEST: Long = 1006

    final const val NOTIFICATION_WM_UNFOCUS_REQUEST: Long = 1008
  }
}
