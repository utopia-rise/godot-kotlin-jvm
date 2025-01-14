// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Callable
import godot.core.PackedByteArray
import godot.core.Signal0
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.CALLABLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

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
  @JvmStatic
  public val pwaUpdateAvailable: Signal0 by Signal0

  public override fun new(scriptIndex: Int): Unit {
    getSingleton(ENGINECLASS_JAVASCRIPTBRIDGE)
  }

  /**
   * Execute the string ` as JavaScript code within the browser window. This is a call to the actual
   * global JavaScript function [code skip-lint]eval()`.
   * If [useGlobalExecutionContext] is `true`, the code will be evaluated in the global execution
   * context. Otherwise, it is evaluated in the execution context of a function within the engine's
   * runtime environment.
   */
  @JvmOverloads
  @JvmStatic
  public final fun eval(code: String, useGlobalExecutionContext: Boolean = false): Any? {
    TransferContext.writeArguments(STRING to code, BOOL to useGlobalExecutionContext)
    TransferContext.callMethod(ptr, MethodBindings.evalPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns an interface to a JavaScript object that can be used by scripts. The [interface] must
   * be a valid property of the JavaScript `window`. The callback must accept a single [Array]
   * argument, which will contain the JavaScript `arguments`. See [JavaScriptObject] for usage.
   */
  @JvmStatic
  public final fun getInterface(`interface`: String): JavaScriptObject? {
    TransferContext.writeArguments(STRING to `interface`)
    TransferContext.callMethod(ptr, MethodBindings.getInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as JavaScriptObject?)
  }

  /**
   * Creates a reference to a [Callable] that can be used as a callback by JavaScript. The reference
   * must be kept until the callback happens, or it won't be called at all. See [JavaScriptObject] for
   * usage.
   */
  @JvmStatic
  public final fun createCallback(callable: Callable): JavaScriptObject? {
    TransferContext.writeArguments(CALLABLE to callable)
    TransferContext.callMethod(ptr, MethodBindings.createCallbackPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as JavaScriptObject?)
  }

  /**
   * Creates a new JavaScript object using the `new` constructor. The [object] must a valid property
   * of the JavaScript `window`. See [JavaScriptObject] for usage.
   */
  @JvmStatic
  public final fun createObject(`object`: String, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING to `object`,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(ptr, MethodBindings.createObjectPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Prompts the user to download a file containing the specified [buffer]. The file will have the
   * given [name] and [mime] type.
   * **Note:** The browser may override the [url=https://en.wikipedia.org/wiki/Media_type]MIME
   * type[/url] provided based on the file [name]'s extension.
   * **Note:** Browsers might block the download if [downloadBuffer] is not being called from a user
   * interaction (e.g. button click).
   * **Note:** Browsers might ask the user for permission or block the download if multiple download
   * requests are made in a quick succession.
   */
  @JvmOverloads
  @JvmStatic
  public final fun downloadBuffer(
    buffer: PackedByteArray,
    name: String,
    mime: String = "application/octet-stream",
  ): Unit {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer, STRING to name, STRING to mime)
    TransferContext.callMethod(ptr, MethodBindings.downloadBufferPtr, NIL)
  }

  /**
   * Returns `true` if a new version of the progressive web app is waiting to be activated.
   * **Note:** Only relevant when exported as a Progressive Web App.
   */
  @JvmStatic
  public final fun pwaNeedsUpdate(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.pwaNeedsUpdatePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Performs the live update of the progressive web app. Forcing the new version to be installed
   * and the page to be reloaded.
   * **Note:** Your application will be **reloaded in all browser tabs**.
   * **Note:** Only relevant when exported as a Progressive Web App and [pwaNeedsUpdate] returns
   * `true`.
   */
  @JvmStatic
  public final fun pwaUpdate(): Error {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.pwaUpdatePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Force synchronization of the persistent file system (when enabled).
   * **Note:** This is only useful for modules or extensions that can't use [FileAccess] to write
   * files.
   */
  @JvmStatic
  public final fun forceFsSync(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.forceFsSyncPtr, NIL)
  }

  internal object MethodBindings {
    public val evalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaScriptBridge", "eval", 218087648)

    public val getInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaScriptBridge", "get_interface", 1355533281)

    public val createCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaScriptBridge", "create_callback", 422818440)

    public val createObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaScriptBridge", "create_object", 3093893586)

    public val downloadBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaScriptBridge", "download_buffer", 3352272093)

    public val pwaNeedsUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaScriptBridge", "pwa_needs_update", 36873697)

    public val pwaUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaScriptBridge", "pwa_update", 166280745)

    public val forceFsSyncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaScriptBridge", "force_fs_sync", 3218959716)
  }
}
