// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.UninitializedPropertyAccessException

@GodotBaseType
open class InputEventKey : InputEventWithModifiers() {
  open var echo: Boolean
    get() {
      throw UninitializedPropertyAccessException("Cannot access property echo: has no getter")
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_ECHO, NIL)
    }

  open var pressed: Boolean
    get() {
      throw UninitializedPropertyAccessException("Cannot access property pressed: has no getter")
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_PRESSED, NIL)
    }

  open var scancode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_SCANCODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_SCANCODE, NIL)
    }

  open var unicode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_UNICODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_UNICODE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_INPUTEVENTKEY)

  open fun getScancodeWithModifiers(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_SCANCODE_WITH_MODIFIERS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }
}
