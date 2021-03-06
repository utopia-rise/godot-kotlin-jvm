// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress

/**
 * Singleton that connects the engine with the browser's JavaScript context in HTML5 export.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/getting_started/workflow/export/exporting_for_web.html#calling-javascript-from-script](https://docs.godotengine.org/en/latest/getting_started/workflow/export/exporting_for_web.html#calling-javascript-from-script)
 *
 * The JavaScript singleton is implemented only in the HTML5 export. It's used to access the browser's JavaScript context. This allows interaction with embedding pages or calling third-party JavaScript APIs.
 */
@GodotBaseType
object JavaScript : Object() {
  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINESINGLETON_JAVASCRIPT)

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Execute the string `code` as JavaScript code within the browser window. This is a call to the actual global JavaScript function `eval()`.
   *
   * If `use_global_execution_context` is `true`, the code will be evaluated in the global execution context. Otherwise, it is evaluated in the execution context of a function within the engine's runtime environment.
   */
  fun eval(code: String, useGlobalExecutionContext: Boolean = false): Any? {
    TransferContext.writeArguments(STRING to code, BOOL to useGlobalExecutionContext)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JAVASCRIPT_EVAL, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }
}
