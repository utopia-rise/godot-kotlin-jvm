// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolByteArray
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Singleton that connects the engine with the browser's JavaScript context in HTML5 export.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.4/getting_started/workflow/export/exporting_for_web.html#calling-javascript-from-script](https://docs.godotengine.org/en/3.4/getting_started/workflow/export/exporting_for_web.html#calling-javascript-from-script)
 *
 * The JavaScript singleton is implemented only in the HTML5 export. It's used to access the browser's JavaScript context. This allows interaction with embedding pages or calling third-party JavaScript APIs.
 *
 * **Note:** This singleton can be disabled at build-time to improve security. By default, the JavaScript singleton is enabled. Official export templates also have the JavaScript singleton enabled. See [godot.Compiling for the Web](https://docs.godotengine.org/en/3.4/development/compiling/compiling_for_web.html) in the documentation for more information.
 */
@GodotBaseType
public object JavaScript : Object() {
  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_JAVASCRIPT)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Creates a reference to a script function that can be used as a callback by JavaScript. The reference must be kept until the callback happens, or it won't be called at all. See [godot.JavaScriptObject] for usage.
   */
  public fun createCallback(_object: Object, method: String): JavaScriptObject? {
    TransferContext.writeArguments(OBJECT to _object, STRING to method)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JAVASCRIPT_CREATE_CALLBACK, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as JavaScriptObject?
  }

  /**
   * Creates a new JavaScript object using the `new` constructor. The `object` must a valid property of the JavaScript `window`. See [godot.JavaScriptObject] for usage.
   */
  public fun createObject(_object: String, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING to _object,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JAVASCRIPT_CREATE_OBJECT, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Prompts the user to download a file containing the specified `buffer`. The file will have the given `name` and `mime` type.
   *
   * **Note:** The browser may override the [godot.MIME type](https://en.wikipedia.org/wiki/Media_type) provided based on the file `name`'s extension.
   *
   * **Note:** Browsers might block the download if [downloadBuffer] is not being called from a user interaction (e.g. button click).
   *
   * **Note:** Browsers might ask the user for permission or block the download if multiple download requests are made in a quick succession.
   */
  public fun downloadBuffer(
    buffer: PoolByteArray,
    name: String,
    mime: String = "application/octet-stream"
  ): Unit {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to buffer, STRING to name, STRING to mime)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JAVASCRIPT_DOWNLOAD_BUFFER, NIL)
  }

  /**
   * Execute the string `code` as JavaScript code within the browser window. This is a call to the actual global JavaScript function `eval()`.
   *
   * If `use_global_execution_context` is `true`, the code will be evaluated in the global execution context. Otherwise, it is evaluated in the execution context of a function within the engine's runtime environment.
   */
  public fun eval(code: String, useGlobalExecutionContext: Boolean = false): Any? {
    TransferContext.writeArguments(STRING to code, BOOL to useGlobalExecutionContext)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JAVASCRIPT_EVAL, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns an interface to a JavaScript object that can be used by scripts. The `interface` must be a valid property of the JavaScript `window`. The callback must accept a single [godot.Array] argument, which will contain the JavaScript `arguments`. See [godot.JavaScriptObject] for usage.
   */
  public fun getInterface(_interface: String): JavaScriptObject? {
    TransferContext.writeArguments(STRING to _interface)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JAVASCRIPT_GET_INTERFACE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as JavaScriptObject?
  }
}
