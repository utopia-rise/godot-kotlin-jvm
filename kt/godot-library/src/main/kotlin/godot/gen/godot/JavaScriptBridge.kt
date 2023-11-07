// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * The JavaScriptBridge singleton is implemented only in the Web export. It's used to access the
 * browser's JavaScript context. This allows interaction with embedding pages or calling third-party
 * JavaScript APIs.
 * **Note:** This singleton can be disabled at build-time to improve security. By default, the
 * JavaScriptBridge singleton is enabled. Official export templates also have the JavaScriptBridge
 * singleton enabled. See
 * [url=$DOCS_URL/contributing/development/compiling/compiling_for_web.html]Compiling for the Web[/url]
 * in the documentation for more information.
 */
@GodotBaseType
public object JavaScriptBridge : Object() {
  /**
   * Emitted when an update for this progressive web app has been detected but is waiting to be
   * activated because a previous version is active. See [pwaUpdate] to force the update to take place
   * immediately.
   */
  public val pwaUpdateAvailable: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_JAVASCRIPTBRIDGE)
    return false
  }

  /**
   * Execute the string [param code] as JavaScript code within the browser window. This is a call to
   * the actual global JavaScript function [code skip-lint]eval()[/code].
   * If [param use_global_execution_context] is `true`, the code will be evaluated in the global
   * execution context. Otherwise, it is evaluated in the execution context of a function within the
   * engine's runtime environment.
   */
  @JvmOverloads
  public fun eval(code: String, useGlobalExecutionContext: Boolean = false): Any? {
    TransferContext.writeArguments(STRING to code, BOOL to useGlobalExecutionContext)
    TransferContext.callMethod(rawPtr, MethodBindings.evalPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns an interface to a JavaScript object that can be used by scripts. The [param interface]
   * must be a valid property of the JavaScript `window`. The callback must accept a single [Array]
   * argument, which will contain the JavaScript `arguments`. See [JavaScriptObject] for usage.
   */
  public fun getInterface(_interface: String): JavaScriptObject? {
    TransferContext.writeArguments(STRING to _interface)
    TransferContext.callMethod(rawPtr, MethodBindings.getInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as JavaScriptObject?)
  }

  /**
   * Creates a reference to a [Callable] that can be used as a callback by JavaScript. The reference
   * must be kept until the callback happens, or it won't be called at all. See [JavaScriptObject] for
   * usage.
   */
  public fun createCallback(callable: Callable): JavaScriptObject? {
    TransferContext.writeArguments(CALLABLE to callable)
    TransferContext.callMethod(rawPtr, MethodBindings.createCallbackPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as JavaScriptObject?)
  }

  /**
   * Creates a new JavaScript object using the `new` constructor. The [param object] must a valid
   * property of the JavaScript `window`. See [JavaScriptObject] for usage.
   */
  public fun createObject(_object: String, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING to _object,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, MethodBindings.createObjectPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Prompts the user to download a file containing the specified [param buffer]. The file will have
   * the given [param name] and [param mime] type.
   * **Note:** The browser may override the [url=https://en.wikipedia.org/wiki/Media_type]MIME
   * type[/url] provided based on the file [param name]'s extension.
   * **Note:** Browsers might block the download if [downloadBuffer] is not being called from a user
   * interaction (e.g. button click).
   * **Note:** Browsers might ask the user for permission or block the download if multiple download
   * requests are made in a quick succession.
   */
  @JvmOverloads
  public fun downloadBuffer(
    buffer: PackedByteArray,
    name: String,
    mime: String = "application/octet-stream",
  ): Unit {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer, STRING to name, STRING to mime)
    TransferContext.callMethod(rawPtr, MethodBindings.downloadBufferPtr, NIL)
  }

  /**
   * Returns `true` if a new version of the progressive web app is waiting to be activated.
   * **Note:** Only relevant when exported as a Progressive Web App.
   */
  public fun pwaNeedsUpdate(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pwaNeedsUpdatePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Performs the live update of the progressive web app. Forcing the new version to be installed
   * and the page to be reloaded.
   * **Note:** Your application will be **reloaded in all browser tabs**.
   * **Note:** Only relevant when exported as a Progressive Web App and [pwaNeedsUpdate] returns
   * `true`.
   */
  public fun pwaUpdate(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pwaUpdatePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Force synchronization of the persistent file system (when enabled).
   * **Note:** This is only useful for modules or extensions that can't use [FileAccess] to write
   * files.
   */
  public fun forceFsSync(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.forceFsSyncPtr, NIL)
  }

  internal object MethodBindings {
    public val evalPtr: VoidPtr = TypeManager.getMethodBindPtr("JavaScriptBridge", "eval")

    public val getInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaScriptBridge", "get_interface")

    public val createCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaScriptBridge", "create_callback")

    public val createObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaScriptBridge", "create_object")

    public val downloadBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaScriptBridge", "download_buffer")

    public val pwaNeedsUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaScriptBridge", "pwa_needs_update")

    public val pwaUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaScriptBridge", "pwa_update")

    public val forceFsSyncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaScriptBridge", "force_fs_sync")
  }
}
