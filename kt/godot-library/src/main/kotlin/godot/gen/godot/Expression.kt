// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class Expression : Reference() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_EXPRESSION)

  open fun execute(
    inputs: VariantArray<Any?> = VariantArray(),
    baseInstance: Object? = null,
    showError: Boolean = true
  ): Any? {
    TransferContext.writeArguments(ARRAY to inputs, OBJECT to baseInstance, BOOL to showError)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EXPRESSION_EXECUTE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun getErrorText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EXPRESSION_GET_ERROR_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun hasExecuteFailed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EXPRESSION_HAS_EXECUTE_FAILED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun parse(expression: String, inputNames: PoolStringArray = PoolStringArray()): GodotError {
    TransferContext.writeArguments(STRING to expression, POOL_STRING_ARRAY to inputNames)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EXPRESSION_PARSE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }
}
