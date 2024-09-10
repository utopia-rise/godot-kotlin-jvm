// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
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
 * [url=https://www.jsonrpc.org/]JSON-RPC[/url] is a standard which wraps a method call in a [JSON]
 * object. The object has a particular structure and identifies which method is called, the parameters
 * to that function, and carries an ID to keep track of responses. This class implements that standard
 * on top of [Dictionary]; you will have to convert between a [Dictionary] and [JSON] with other
 * functions.
 */
@GodotBaseType
public open class JSONRPC : Object() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_JSONRPC, scriptIndex)
  }

  public fun setScope(scope: String, target: Object?): Unit {
    TransferContext.writeArguments(STRING to scope, OBJECT to target)
    TransferContext.callMethod(rawPtr, MethodBindings.setScopePtr, NIL)
  }

  /**
   * Given a Dictionary which takes the form of a JSON-RPC request: unpack the request and run it.
   * Methods are resolved by looking at the field called "method" and looking for an equivalently named
   * function in the JSONRPC object. If one is found that method is called.
   * To add new supported methods extend the JSONRPC class and call [processAction] on your
   * subclass.
   * [action]: The action to be run, as a Dictionary in the form of a JSON-RPC request or
   * notification.
   */
  @JvmOverloads
  public fun processAction(action: Any?, recurse: Boolean = false): Any? {
    TransferContext.writeArguments(ANY to action, BOOL to recurse)
    TransferContext.callMethod(rawPtr, MethodBindings.processActionPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun processString(action: String): String {
    TransferContext.writeArguments(STRING to action)
    TransferContext.callMethod(rawPtr, MethodBindings.processStringPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns a dictionary in the form of a JSON-RPC request. Requests are sent to a server with the
   * expectation of a response. The ID field is used for the server to specify which exact request it
   * is responding to.
   * - [method]: Name of the method being called.
   * - [params]: An array or dictionary of parameters being passed to the method.
   * - [id]: Uniquely identifies this request. The server is expected to send a response with the
   * same ID.
   */
  public fun makeRequest(
    method: String,
    params: Any?,
    id: Any?,
  ): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING to method, ANY to params, ANY to id)
    TransferContext.callMethod(rawPtr, MethodBindings.makeRequestPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * When a server has received and processed a request, it is expected to send a response. If you
   * did not want a response then you need to have sent a Notification instead.
   * - [result]: The return value of the function which was called.
   * - [id]: The ID of the request this response is targeted to.
   */
  public fun makeResponse(result: Any?, id: Any?): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(ANY to result, ANY to id)
    TransferContext.callMethod(rawPtr, MethodBindings.makeResponsePtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns a dictionary in the form of a JSON-RPC notification. Notifications are one-shot
   * messages which do not expect a response.
   * - [method]: Name of the method being called.
   * - [params]: An array or dictionary of parameters being passed to the method.
   */
  public fun makeNotification(method: String, params: Any?): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING to method, ANY to params)
    TransferContext.callMethod(rawPtr, MethodBindings.makeNotificationPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Creates a response which indicates a previous reply has failed in some way.
   * - [code]: The error code corresponding to what kind of error this is. See the [ErrorCode]
   * constants.
   * - [message]: A custom message about this error.
   * - [id]: The request this error is a response to.
   */
  @JvmOverloads
  public fun makeResponseError(
    code: Int,
    message: String,
    id: Any? = null,
  ): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to code.toLong(), STRING to message, ANY to id)
    TransferContext.callMethod(rawPtr, MethodBindings.makeResponseErrorPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public enum class ErrorCode(
    id: Long,
  ) {
    /**
     * The request could not be parsed as it was not valid by JSON standard ([JSON.parse] failed).
     */
    PARSE_ERROR(-32700),
    /**
     * A method call was requested but the request's format is not valid.
     */
    INVALID_REQUEST(-32600),
    /**
     * A method call was requested but no function of that name existed in the JSONRPC subclass.
     */
    METHOD_NOT_FOUND(-32601),
    /**
     * A method call was requested but the given method parameters are not valid. Not used by the
     * built-in JSONRPC.
     */
    INVALID_PARAMS(-32602),
    /**
     * An internal error occurred while processing the request. Not used by the built-in JSONRPC.
     */
    INTERNAL_ERROR(-32603),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ErrorCode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setScopePtr: VoidPtr =
        TypeManager.getMethodBindPtr("JSONRPC", "set_scope", 2572618360)

    public val processActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JSONRPC", "process_action", 2963479484)

    public val processStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JSONRPC", "process_string", 1703090593)

    public val makeRequestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JSONRPC", "make_request", 3423508980)

    public val makeResponsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("JSONRPC", "make_response", 5053918)

    public val makeNotificationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JSONRPC", "make_notification", 2949127017)

    public val makeResponseErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JSONRPC", "make_response_error", 928596297)
  }
}
