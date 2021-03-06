// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.HTTPClient
import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Low-level hyper-text transfer protocol client.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/networking/http_client_class.html](https://docs.godotengine.org/en/latest/tutorials/networking/http_client_class.html)
 * [https://docs.godotengine.org/en/latest/tutorials/networking/ssl_certificates.html](https://docs.godotengine.org/en/latest/tutorials/networking/ssl_certificates.html)
 *
 * Hyper-text transfer protocol client (sometimes called "User Agent"). Used to make HTTP requests to download web content, upload files and other data or to communicate with various services, among other use cases. **See the [godot.HTTPRequest] node for an higher-level alternative.**
 *
 * **Note:** This client only needs to connect to a host once (see [connectToHost]) to send multiple requests. Because of this, methods that take URLs usually take just the part after the host instead of the full URL, as the client is already connected to a host. See [request] for a full example and to get started.
 *
 * A [godot.HTTPClient] should be reused between multiple requests or to connect to different hosts instead of creating one client per request. Supports SSL and SSL server certificate verification. HTTP status codes in the 2xx range indicate success, 3xx redirection (i.e. "try again, but over here"), 4xx something was wrong with the request, and 5xx something went wrong on the server's side.
 *
 * For more information on HTTP, see https://developer.mozilla.org/en-US/docs/Web/HTTP (or read RFC 2616 to get it straight from the source: https://tools.ietf.org/html/rfc2616).
 *
 * **Note:** When performing HTTP requests from a project exported to HTML5, keep in mind the remote server may not allow requests from foreign origins due to [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS). If you host the server in question, you should modify its backend to allow requests from foreign origins by adding the `Access-Control-Allow-Origin: *` HTTP header.
 */
@GodotBaseType
open class HTTPClient : Reference() {
  /**
   * If `true`, execution will block until all data is read from the response.
   */
  open var blockingModeEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_GET_BLOCKING_MODE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_SET_BLOCKING_MODE_ENABLED, NIL)
    }

  /**
   * The connection to use for this client.
   */
  open var connection: StreamPeer?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_GET_CONNECTION, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as StreamPeer?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_SET_CONNECTION, NIL)
    }

  /**
   * The size of the buffer used and maximum bytes to read per iteration. See [readResponseBodyChunk].
   */
  open var readChunkSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_GET_READ_CHUNK_SIZE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_SET_READ_CHUNK_SIZE,
          NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_HTTPCLIENT)

  /**
   * Closes the current connection, allowing reuse of this [godot.HTTPClient].
   */
  open fun close() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_CLOSE, NIL)
  }

  /**
   * Connects to a host. This needs to be done before any requests are sent.
   *
   * The host should not have http:// prepended but will strip the protocol identifier if provided.
   *
   * If no `port` is specified (or `-1` is used), it is automatically set to 80 for HTTP and 443 for HTTPS (if `use_ssl` is enabled).
   *
   * `verify_host` will check the SSL identity of the host if set to `true`.
   */
  open fun connectToHost(
    host: String,
    port: Long = -1,
    useSsl: Boolean = false,
    verifyHost: Boolean = true
  ): GodotError {
    TransferContext.writeArguments(STRING to host, LONG to port, BOOL to useSsl, BOOL to verifyHost)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_CONNECT_TO_HOST, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the response's body length.
   *
   * **Note:** Some Web servers may not send a body length. In this case, the value returned will be `-1`. If using chunked transfer encoding, the body length will also be `-1`.
   */
  open fun getResponseBodyLength(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_GET_RESPONSE_BODY_LENGTH,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the response's HTTP status code.
   */
  open fun getResponseCode(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_GET_RESPONSE_CODE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the response headers.
   */
  open fun getResponseHeaders(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_GET_RESPONSE_HEADERS,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns all response headers as a Dictionary of structure `{ "key": "value1; value2" }` where the case-sensitivity of the keys and values is kept like the server delivers it. A value is a simple String, this string can have more than one value where "; " is used as separator.
   *
   * **Example:**
   *
   * ```
   * 				{
   * 				    "content-length": 12,
   * 				    "Content-Type": "application/json; charset=UTF-8",
   * 				}
   * 				```
   */
  open fun getResponseHeadersAsDictionary(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_GET_RESPONSE_HEADERS_AS_DICTIONARY, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns a [enum Status] constant. Need to call [poll] in order to get status updates.
   */
  open fun getStatus(): HTTPClient.Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_GET_STATUS, LONG)
    return HTTPClient.Status.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * If `true`, this [godot.HTTPClient] has a response available.
   */
  open fun hasResponse(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_HAS_RESPONSE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * If `true`, this [godot.HTTPClient] has a response that is chunked.
   */
  open fun isResponseChunked(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_IS_RESPONSE_CHUNKED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * This needs to be called in order to have any request processed. Check results with [getStatus].
   */
  open fun poll(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_POLL, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Generates a GET/POST application/x-www-form-urlencoded style query string from a provided dictionary, e.g.:
   *
   * ```
   * 				var fields = {"username": "user", "password": "pass"}
   * 				var query_string = http_client.query_string_from_dict(fields)
   * 				# Returns "username=user&password=pass"
   * 				```
   *
   * Furthermore, if a key has a `null` value, only the key itself is added, without equal sign and value. If the value is an array, for each value in it a pair with the same key is added.
   *
   * ```
   * 				var fields = {"single": 123, "not_valued": null, "multiple": [22, 33, 44]}
   * 				var query_string = http_client.query_string_from_dict(fields)
   * 				# Returns "single=123&not_valued&multiple=22&multiple=33&multiple=44"
   * 				```
   */
  open fun queryStringFromDict(fields: Dictionary<Any?, Any?>): String {
    TransferContext.writeArguments(DICTIONARY to fields)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_QUERY_STRING_FROM_DICT,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Reads one chunk from the response.
   */
  open fun readResponseBodyChunk(): PoolByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_READ_RESPONSE_BODY_CHUNK,
        POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  /**
   * Sends a request to the connected host. The URL parameter is just the part after the host, so for `http://somehost.com/index.php`, it is `index.php`.
   *
   * Headers are HTTP request headers. For available HTTP methods, see [enum Method].
   *
   * To create a POST request with query strings to push to the server, do:
   *
   * ```
   * 				var fields = {"username" : "user", "password" : "pass"}
   * 				var query_string = http_client.query_string_from_dict(fields)
   * 				var headers = ["Content-Type: application/x-www-form-urlencoded", "Content-Length: " + str(query_string.length())]
   * 				var result = http_client.request(http_client.METHOD_POST, "index.php", headers, query_string)
   * 				```
   *
   * **Note:** The `request_data` parameter is ignored if `method` is [godot.HTTPClient.METHOD_GET]. This is because GET methods can't contain request data. As a workaround, you can pass request data as a query string in the URL. See [godot.String.httpEscape] for an example.
   */
  open fun request(
    method: Long,
    url: String,
    headers: PoolStringArray,
    body: String = ""
  ): GodotError {
    TransferContext.writeArguments(LONG to method, STRING to url, POOL_STRING_ARRAY to headers,
        STRING to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_REQUEST, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sends a raw request to the connected host. The URL parameter is just the part after the host, so for `http://somehost.com/index.php`, it is `index.php`.
   *
   * Headers are HTTP request headers. For available HTTP methods, see [enum Method].
   *
   * Sends the body data raw, as a byte array and does not encode it in any way.
   */
  open fun requestRaw(
    method: Long,
    url: String,
    headers: PoolStringArray,
    body: PoolByteArray
  ): GodotError {
    TransferContext.writeArguments(LONG to method, STRING to url, POOL_STRING_ARRAY to headers,
        POOL_BYTE_ARRAY to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_REQUEST_RAW, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  enum class Status(
    id: Long
  ) {
    /**
     * Status: Disconnected from the server.
     */
    STATUS_DISCONNECTED(0),

    /**
     * Status: Currently resolving the hostname for the given URL into an IP.
     */
    STATUS_RESOLVING(1),

    /**
     * Status: DNS failure: Can't resolve the hostname for the given URL.
     */
    STATUS_CANT_RESOLVE(2),

    /**
     * Status: Currently connecting to server.
     */
    STATUS_CONNECTING(3),

    /**
     * Status: Can't connect to the server.
     */
    STATUS_CANT_CONNECT(4),

    /**
     * Status: Connection established.
     */
    STATUS_CONNECTED(5),

    /**
     * Status: Currently sending request.
     */
    STATUS_REQUESTING(6),

    /**
     * Status: HTTP body received.
     */
    STATUS_BODY(7),

    /**
     * Status: Error in HTTP connection.
     */
    STATUS_CONNECTION_ERROR(8),

    /**
     * Status: Error in SSL handshake.
     */
    STATUS_SSL_HANDSHAKE_ERROR(9);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Method(
    id: Long
  ) {
    /**
     * HTTP GET method. The GET method requests a representation of the specified resource. Requests using GET should only retrieve data.
     */
    METHOD_GET(0),

    /**
     * HTTP HEAD method. The HEAD method asks for a response identical to that of a GET request, but without the response body. This is useful to request metadata like HTTP headers or to check if a resource exists.
     */
    METHOD_HEAD(1),

    /**
     * HTTP POST method. The POST method is used to submit an entity to the specified resource, often causing a change in state or side effects on the server. This is often used for forms and submitting data or uploading files.
     */
    METHOD_POST(2),

    /**
     * HTTP PUT method. The PUT method asks to replace all current representations of the target resource with the request payload. (You can think of POST as "create or update" and PUT as "update", although many services tend to not make a clear distinction or change their meaning).
     */
    METHOD_PUT(3),

    /**
     * HTTP DELETE method. The DELETE method requests to delete the specified resource.
     */
    METHOD_DELETE(4),

    /**
     * HTTP OPTIONS method. The OPTIONS method asks for a description of the communication options for the target resource. Rarely used.
     */
    METHOD_OPTIONS(5),

    /**
     * HTTP TRACE method. The TRACE method performs a message loop-back test along the path to the target resource. Returns the entire HTTP request received in the response body. Rarely used.
     */
    METHOD_TRACE(6),

    /**
     * HTTP CONNECT method. The CONNECT method establishes a tunnel to the server identified by the target resource. Rarely used.
     */
    METHOD_CONNECT(7),

    /**
     * HTTP PATCH method. The PATCH method is used to apply partial modifications to a resource.
     */
    METHOD_PATCH(8),

    /**
     * Represents the size of the [enum Method] enum.
     */
    METHOD_MAX(9);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ResponseCode(
    id: Long
  ) {
    /**
     * HTTP status code `100 Continue`. Interim response that indicates everything so far is OK and that the client should continue with the request (or ignore this status if already finished).
     */
    RESPONSE_CONTINUE(100),

    /**
     * HTTP status code `101 Switching Protocol`. Sent in response to an `Upgrade` request header by the client. Indicates the protocol the server is switching to.
     */
    RESPONSE_SWITCHING_PROTOCOLS(101),

    /**
     * HTTP status code `102 Processing` (WebDAV). Indicates that the server has received and is processing the request, but no response is available yet.
     */
    RESPONSE_PROCESSING(102),

    /**
     * HTTP status code `200 OK`. The request has succeeded. Default response for successful requests. Meaning varies depending on the request. GET: The resource has been fetched and is transmitted in the message body. HEAD: The entity headers are in the message body. POST: The resource describing the result of the action is transmitted in the message body. TRACE: The message body contains the request message as received by the server.
     */
    RESPONSE_OK(200),

    /**
     * HTTP status code `201 Created`. The request has succeeded and a new resource has been created as a result of it. This is typically the response sent after a PUT request.
     */
    RESPONSE_CREATED(201),

    /**
     * HTTP status code `202 Accepted`. The request has been received but not yet acted upon. It is non-committal, meaning that there is no way in HTTP to later send an asynchronous response indicating the outcome of processing the request. It is intended for cases where another process or server handles the request, or for batch processing.
     */
    RESPONSE_ACCEPTED(202),

    /**
     * HTTP status code `203 Non-Authoritative Information`. This response code means returned meta-information set is not exact set as available from the origin server, but collected from a local or a third party copy. Except this condition, 200 OK response should be preferred instead of this response.
     */
    RESPONSE_NON_AUTHORITATIVE_INFORMATION(203),

    /**
     * HTTP status code `204 No Content`. There is no content to send for this request, but the headers may be useful. The user-agent may update its cached headers for this resource with the new ones.
     */
    RESPONSE_NO_CONTENT(204),

    /**
     * HTTP status code `205 Reset Content`. The server has fulfilled the request and desires that the client resets the "document view" that caused the request to be sent to its original state as received from the origin server.
     */
    RESPONSE_RESET_CONTENT(205),

    /**
     * HTTP status code `206 Partial Content`. This response code is used because of a range header sent by the client to separate download into multiple streams.
     */
    RESPONSE_PARTIAL_CONTENT(206),

    /**
     * HTTP status code `207 Multi-Status` (WebDAV). A Multi-Status response conveys information about multiple resources in situations where multiple status codes might be appropriate.
     */
    RESPONSE_MULTI_STATUS(207),

    /**
     * HTTP status code `208 Already Reported` (WebDAV). Used inside a DAV: propstat response element to avoid enumerating the internal members of multiple bindings to the same collection repeatedly.
     */
    RESPONSE_ALREADY_REPORTED(208),

    /**
     * HTTP status code `226 IM Used` (WebDAV). The server has fulfilled a GET request for the resource, and the response is a representation of the result of one or more instance-manipulations applied to the current instance.
     */
    RESPONSE_IM_USED(226),

    /**
     * HTTP status code `300 Multiple Choice`. The request has more than one possible responses and there is no standardized way to choose one of the responses. User-agent or user should choose one of them.
     */
    RESPONSE_MULTIPLE_CHOICES(300),

    /**
     * HTTP status code `301 Moved Permanently`. Redirection. This response code means the URI of requested resource has been changed. The new URI is usually included in the response.
     */
    RESPONSE_MOVED_PERMANENTLY(301),

    /**
     * HTTP status code `302 Found`. Temporary redirection. This response code means the URI of requested resource has been changed temporarily. New changes in the URI might be made in the future. Therefore, this same URI should be used by the client in future requests.
     */
    RESPONSE_FOUND(302),

    /**
     * HTTP status code `303 See Other`. The server is redirecting the user agent to a different resource, as indicated by a URI in the Location header field, which is intended to provide an indirect response to the original request.
     */
    RESPONSE_SEE_OTHER(303),

    /**
     * HTTP status code `304 Not Modified`. A conditional GET or HEAD request has been received and would have resulted in a 200 OK response if it were not for the fact that the condition evaluated to `false`.
     */
    RESPONSE_NOT_MODIFIED(304),

    /**
     * HTTP status code `305 Use Proxy`. *Deprecated. Do not use.*
     */
    RESPONSE_USE_PROXY(305),

    /**
     * HTTP status code `306 Switch Proxy`. *Deprecated. Do not use.*
     */
    RESPONSE_SWITCH_PROXY(306),

    /**
     * HTTP status code `307 Temporary Redirect`. The target resource resides temporarily under a different URI and the user agent MUST NOT change the request method if it performs an automatic redirection to that URI.
     */
    RESPONSE_TEMPORARY_REDIRECT(307),

    /**
     * HTTP status code `308 Permanent Redirect`. The target resource has been assigned a new permanent URI and any future references to this resource ought to use one of the enclosed URIs.
     */
    RESPONSE_PERMANENT_REDIRECT(308),

    /**
     * HTTP status code `400 Bad Request`. The request was invalid. The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, invalid request contents, or deceptive request routing).
     */
    RESPONSE_BAD_REQUEST(400),

    /**
     * HTTP status code `401 Unauthorized`. Credentials required. The request has not been applied because it lacks valid authentication credentials for the target resource.
     */
    RESPONSE_UNAUTHORIZED(401),

    /**
     * HTTP status code `402 Payment Required`. This response code is reserved for future use. Initial aim for creating this code was using it for digital payment systems, however this is not currently used.
     */
    RESPONSE_PAYMENT_REQUIRED(402),

    /**
     * HTTP status code `403 Forbidden`. The client does not have access rights to the content, i.e. they are unauthorized, so server is rejecting to give proper response. Unlike `401`, the client's identity is known to the server.
     */
    RESPONSE_FORBIDDEN(403),

    /**
     * HTTP status code `404 Not Found`. The server can not find requested resource. Either the URL is not recognized or the endpoint is valid but the resource itself does not exist. May also be sent instead of 403 to hide existence of a resource if the client is not authorized.
     */
    RESPONSE_NOT_FOUND(404),

    /**
     * HTTP status code `405 Method Not Allowed`. The request's HTTP method is known by the server but has been disabled and cannot be used. For example, an API may forbid DELETE-ing a resource. The two mandatory methods, GET and HEAD, must never be disabled and should not return this error code.
     */
    RESPONSE_METHOD_NOT_ALLOWED(405),

    /**
     * HTTP status code `406 Not Acceptable`. The target resource does not have a current representation that would be acceptable to the user agent, according to the proactive negotiation header fields received in the request. Used when negotiation content.
     */
    RESPONSE_NOT_ACCEPTABLE(406),

    /**
     * HTTP status code `407 Proxy Authentication Required`. Similar to 401 Unauthorized, but it indicates that the client needs to authenticate itself in order to use a proxy.
     */
    RESPONSE_PROXY_AUTHENTICATION_REQUIRED(407),

    /**
     * HTTP status code `408 Request Timeout`. The server did not receive a complete request message within the time that it was prepared to wait.
     */
    RESPONSE_REQUEST_TIMEOUT(408),

    /**
     * HTTP status code `409 Conflict`. The request could not be completed due to a conflict with the current state of the target resource. This code is used in situations where the user might be able to resolve the conflict and resubmit the request.
     */
    RESPONSE_CONFLICT(409),

    /**
     * HTTP status code `410 Gone`. The target resource is no longer available at the origin server and this condition is likely permanent.
     */
    RESPONSE_GONE(410),

    /**
     * HTTP status code `411 Length Required`. The server refuses to accept the request without a defined Content-Length header.
     */
    RESPONSE_LENGTH_REQUIRED(411),

    /**
     * HTTP status code `412 Precondition Failed`. One or more conditions given in the request header fields evaluated to `false` when tested on the server.
     */
    RESPONSE_PRECONDITION_FAILED(412),

    /**
     * HTTP status code `413 Entity Too Large`. The server is refusing to process a request because the request payload is larger than the server is willing or able to process.
     */
    RESPONSE_REQUEST_ENTITY_TOO_LARGE(413),

    /**
     * HTTP status code `414 Request-URI Too Long`. The server is refusing to service the request because the request-target is longer than the server is willing to interpret.
     */
    RESPONSE_REQUEST_URI_TOO_LONG(414),

    /**
     * HTTP status code `415 Unsupported Media Type`. The origin server is refusing to service the request because the payload is in a format not supported by this method on the target resource.
     */
    RESPONSE_UNSUPPORTED_MEDIA_TYPE(415),

    /**
     * HTTP status code `416 Requested Range Not Satisfiable`. None of the ranges in the request's Range header field overlap the current extent of the selected resource or the set of ranges requested has been rejected due to invalid ranges or an excessive request of small or overlapping ranges.
     */
    RESPONSE_REQUESTED_RANGE_NOT_SATISFIABLE(416),

    /**
     * HTTP status code `417 Expectation Failed`. The expectation given in the request's Expect header field could not be met by at least one of the inbound servers.
     */
    RESPONSE_EXPECTATION_FAILED(417),

    /**
     * HTTP status code `418 I'm A Teapot`. Any attempt to brew coffee with a teapot should result in the error code "418 I'm a teapot". The resulting entity body MAY be short and stout.
     */
    RESPONSE_IM_A_TEAPOT(418),

    /**
     * HTTP status code `421 Misdirected Request`. The request was directed at a server that is not able to produce a response. This can be sent by a server that is not configured to produce responses for the combination of scheme and authority that are included in the request URI.
     */
    RESPONSE_MISDIRECTED_REQUEST(421),

    /**
     * HTTP status code `422 Unprocessable Entity` (WebDAV). The server understands the content type of the request entity (hence a 415 Unsupported Media Type status code is inappropriate), and the syntax of the request entity is correct (thus a 400 Bad Request status code is inappropriate) but was unable to process the contained instructions.
     */
    RESPONSE_UNPROCESSABLE_ENTITY(422),

    /**
     * HTTP status code `423 Locked` (WebDAV). The source or destination resource of a method is locked.
     */
    RESPONSE_LOCKED(423),

    /**
     * HTTP status code `424 Failed Dependency` (WebDAV). The method could not be performed on the resource because the requested action depended on another action and that action failed.
     */
    RESPONSE_FAILED_DEPENDENCY(424),

    /**
     * HTTP status code `426 Upgrade Required`. The server refuses to perform the request using the current protocol but might be willing to do so after the client upgrades to a different protocol.
     */
    RESPONSE_UPGRADE_REQUIRED(426),

    /**
     * HTTP status code `428 Precondition Required`. The origin server requires the request to be conditional.
     */
    RESPONSE_PRECONDITION_REQUIRED(428),

    /**
     * HTTP status code `429 Too Many Requests`. The user has sent too many requests in a given amount of time (see "rate limiting"). Back off and increase time between requests or try again later.
     */
    RESPONSE_TOO_MANY_REQUESTS(429),

    /**
     * HTTP status code `431 Request Header Fields Too Large`. The server is unwilling to process the request because its header fields are too large. The request MAY be resubmitted after reducing the size of the request header fields.
     */
    RESPONSE_REQUEST_HEADER_FIELDS_TOO_LARGE(431),

    /**
     * HTTP status code `451 Response Unavailable For Legal Reasons`. The server is denying access to the resource as a consequence of a legal demand.
     */
    RESPONSE_UNAVAILABLE_FOR_LEGAL_REASONS(451),

    /**
     * HTTP status code `500 Internal Server Error`. The server encountered an unexpected condition that prevented it from fulfilling the request.
     */
    RESPONSE_INTERNAL_SERVER_ERROR(500),

    /**
     * HTTP status code `501 Not Implemented`. The server does not support the functionality required to fulfill the request.
     */
    RESPONSE_NOT_IMPLEMENTED(501),

    /**
     * HTTP status code `502 Bad Gateway`. The server, while acting as a gateway or proxy, received an invalid response from an inbound server it accessed while attempting to fulfill the request. Usually returned by load balancers or proxies.
     */
    RESPONSE_BAD_GATEWAY(502),

    /**
     * HTTP status code `503 Service Unavailable`. The server is currently unable to handle the request due to a temporary overload or scheduled maintenance, which will likely be alleviated after some delay. Try again later.
     */
    RESPONSE_SERVICE_UNAVAILABLE(503),

    /**
     * HTTP status code `504 Gateway Timeout`. The server, while acting as a gateway or proxy, did not receive a timely response from an upstream server it needed to access in order to complete the request. Usually returned by load balancers or proxies.
     */
    RESPONSE_GATEWAY_TIMEOUT(504),

    /**
     * HTTP status code `505 HTTP Version Not Supported`. The server does not support, or refuses to support, the major version of HTTP that was used in the request message.
     */
    RESPONSE_HTTP_VERSION_NOT_SUPPORTED(505),

    /**
     * HTTP status code `506 Variant Also Negotiates`. The server has an internal configuration error: the chosen variant resource is configured to engage in transparent content negotiation itself, and is therefore not a proper end point in the negotiation process.
     */
    RESPONSE_VARIANT_ALSO_NEGOTIATES(506),

    /**
     * HTTP status code `507 Insufficient Storage`. The method could not be performed on the resource because the server is unable to store the representation needed to successfully complete the request.
     */
    RESPONSE_INSUFFICIENT_STORAGE(507),

    /**
     * HTTP status code `508 Loop Detected`. The server terminated an operation because it encountered an infinite loop while processing a request with "Depth: infinity". This status indicates that the entire operation failed.
     */
    RESPONSE_LOOP_DETECTED(508),

    /**
     * HTTP status code `510 Not Extended`. The policy for accessing the resource has not been met in the request. The server should send back all the information necessary for the client to issue an extended request.
     */
    RESPONSE_NOT_EXTENDED(510),

    /**
     * HTTP status code `511 Network Authentication Required`. The client needs to authenticate to gain network access.
     */
    RESPONSE_NETWORK_AUTH_REQUIRED(511);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * HTTP CONNECT method. The CONNECT method establishes a tunnel to the server identified by the target resource. Rarely used.
     */
    final const val METHOD_CONNECT: Long = 7

    /**
     * HTTP DELETE method. The DELETE method requests to delete the specified resource.
     */
    final const val METHOD_DELETE: Long = 4

    /**
     * HTTP GET method. The GET method requests a representation of the specified resource. Requests using GET should only retrieve data.
     */
    final const val METHOD_GET: Long = 0

    /**
     * HTTP HEAD method. The HEAD method asks for a response identical to that of a GET request, but without the response body. This is useful to request metadata like HTTP headers or to check if a resource exists.
     */
    final const val METHOD_HEAD: Long = 1

    /**
     * Represents the size of the [enum Method] enum.
     */
    final const val METHOD_MAX: Long = 9

    /**
     * HTTP OPTIONS method. The OPTIONS method asks for a description of the communication options for the target resource. Rarely used.
     */
    final const val METHOD_OPTIONS: Long = 5

    /**
     * HTTP PATCH method. The PATCH method is used to apply partial modifications to a resource.
     */
    final const val METHOD_PATCH: Long = 8

    /**
     * HTTP POST method. The POST method is used to submit an entity to the specified resource, often causing a change in state or side effects on the server. This is often used for forms and submitting data or uploading files.
     */
    final const val METHOD_POST: Long = 2

    /**
     * HTTP PUT method. The PUT method asks to replace all current representations of the target resource with the request payload. (You can think of POST as "create or update" and PUT as "update", although many services tend to not make a clear distinction or change their meaning).
     */
    final const val METHOD_PUT: Long = 3

    /**
     * HTTP TRACE method. The TRACE method performs a message loop-back test along the path to the target resource. Returns the entire HTTP request received in the response body. Rarely used.
     */
    final const val METHOD_TRACE: Long = 6

    /**
     * HTTP status code `202 Accepted`. The request has been received but not yet acted upon. It is non-committal, meaning that there is no way in HTTP to later send an asynchronous response indicating the outcome of processing the request. It is intended for cases where another process or server handles the request, or for batch processing.
     */
    final const val RESPONSE_ACCEPTED: Long = 202

    /**
     * HTTP status code `208 Already Reported` (WebDAV). Used inside a DAV: propstat response element to avoid enumerating the internal members of multiple bindings to the same collection repeatedly.
     */
    final const val RESPONSE_ALREADY_REPORTED: Long = 208

    /**
     * HTTP status code `502 Bad Gateway`. The server, while acting as a gateway or proxy, received an invalid response from an inbound server it accessed while attempting to fulfill the request. Usually returned by load balancers or proxies.
     */
    final const val RESPONSE_BAD_GATEWAY: Long = 502

    /**
     * HTTP status code `400 Bad Request`. The request was invalid. The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, invalid request contents, or deceptive request routing).
     */
    final const val RESPONSE_BAD_REQUEST: Long = 400

    /**
     * HTTP status code `409 Conflict`. The request could not be completed due to a conflict with the current state of the target resource. This code is used in situations where the user might be able to resolve the conflict and resubmit the request.
     */
    final const val RESPONSE_CONFLICT: Long = 409

    /**
     * HTTP status code `100 Continue`. Interim response that indicates everything so far is OK and that the client should continue with the request (or ignore this status if already finished).
     */
    final const val RESPONSE_CONTINUE: Long = 100

    /**
     * HTTP status code `201 Created`. The request has succeeded and a new resource has been created as a result of it. This is typically the response sent after a PUT request.
     */
    final const val RESPONSE_CREATED: Long = 201

    /**
     * HTTP status code `417 Expectation Failed`. The expectation given in the request's Expect header field could not be met by at least one of the inbound servers.
     */
    final const val RESPONSE_EXPECTATION_FAILED: Long = 417

    /**
     * HTTP status code `424 Failed Dependency` (WebDAV). The method could not be performed on the resource because the requested action depended on another action and that action failed.
     */
    final const val RESPONSE_FAILED_DEPENDENCY: Long = 424

    /**
     * HTTP status code `403 Forbidden`. The client does not have access rights to the content, i.e. they are unauthorized, so server is rejecting to give proper response. Unlike `401`, the client's identity is known to the server.
     */
    final const val RESPONSE_FORBIDDEN: Long = 403

    /**
     * HTTP status code `302 Found`. Temporary redirection. This response code means the URI of requested resource has been changed temporarily. New changes in the URI might be made in the future. Therefore, this same URI should be used by the client in future requests.
     */
    final const val RESPONSE_FOUND: Long = 302

    /**
     * HTTP status code `504 Gateway Timeout`. The server, while acting as a gateway or proxy, did not receive a timely response from an upstream server it needed to access in order to complete the request. Usually returned by load balancers or proxies.
     */
    final const val RESPONSE_GATEWAY_TIMEOUT: Long = 504

    /**
     * HTTP status code `410 Gone`. The target resource is no longer available at the origin server and this condition is likely permanent.
     */
    final const val RESPONSE_GONE: Long = 410

    /**
     * HTTP status code `505 HTTP Version Not Supported`. The server does not support, or refuses to support, the major version of HTTP that was used in the request message.
     */
    final const val RESPONSE_HTTP_VERSION_NOT_SUPPORTED: Long = 505

    /**
     * HTTP status code `418 I'm A Teapot`. Any attempt to brew coffee with a teapot should result in the error code "418 I'm a teapot". The resulting entity body MAY be short and stout.
     */
    final const val RESPONSE_IM_A_TEAPOT: Long = 418

    /**
     * HTTP status code `226 IM Used` (WebDAV). The server has fulfilled a GET request for the resource, and the response is a representation of the result of one or more instance-manipulations applied to the current instance.
     */
    final const val RESPONSE_IM_USED: Long = 226

    /**
     * HTTP status code `507 Insufficient Storage`. The method could not be performed on the resource because the server is unable to store the representation needed to successfully complete the request.
     */
    final const val RESPONSE_INSUFFICIENT_STORAGE: Long = 507

    /**
     * HTTP status code `500 Internal Server Error`. The server encountered an unexpected condition that prevented it from fulfilling the request.
     */
    final const val RESPONSE_INTERNAL_SERVER_ERROR: Long = 500

    /**
     * HTTP status code `411 Length Required`. The server refuses to accept the request without a defined Content-Length header.
     */
    final const val RESPONSE_LENGTH_REQUIRED: Long = 411

    /**
     * HTTP status code `423 Locked` (WebDAV). The source or destination resource of a method is locked.
     */
    final const val RESPONSE_LOCKED: Long = 423

    /**
     * HTTP status code `508 Loop Detected`. The server terminated an operation because it encountered an infinite loop while processing a request with "Depth: infinity". This status indicates that the entire operation failed.
     */
    final const val RESPONSE_LOOP_DETECTED: Long = 508

    /**
     * HTTP status code `405 Method Not Allowed`. The request's HTTP method is known by the server but has been disabled and cannot be used. For example, an API may forbid DELETE-ing a resource. The two mandatory methods, GET and HEAD, must never be disabled and should not return this error code.
     */
    final const val RESPONSE_METHOD_NOT_ALLOWED: Long = 405

    /**
     * HTTP status code `421 Misdirected Request`. The request was directed at a server that is not able to produce a response. This can be sent by a server that is not configured to produce responses for the combination of scheme and authority that are included in the request URI.
     */
    final const val RESPONSE_MISDIRECTED_REQUEST: Long = 421

    /**
     * HTTP status code `301 Moved Permanently`. Redirection. This response code means the URI of requested resource has been changed. The new URI is usually included in the response.
     */
    final const val RESPONSE_MOVED_PERMANENTLY: Long = 301

    /**
     * HTTP status code `300 Multiple Choice`. The request has more than one possible responses and there is no standardized way to choose one of the responses. User-agent or user should choose one of them.
     */
    final const val RESPONSE_MULTIPLE_CHOICES: Long = 300

    /**
     * HTTP status code `207 Multi-Status` (WebDAV). A Multi-Status response conveys information about multiple resources in situations where multiple status codes might be appropriate.
     */
    final const val RESPONSE_MULTI_STATUS: Long = 207

    /**
     * HTTP status code `511 Network Authentication Required`. The client needs to authenticate to gain network access.
     */
    final const val RESPONSE_NETWORK_AUTH_REQUIRED: Long = 511

    /**
     * HTTP status code `203 Non-Authoritative Information`. This response code means returned meta-information set is not exact set as available from the origin server, but collected from a local or a third party copy. Except this condition, 200 OK response should be preferred instead of this response.
     */
    final const val RESPONSE_NON_AUTHORITATIVE_INFORMATION: Long = 203

    /**
     * HTTP status code `406 Not Acceptable`. The target resource does not have a current representation that would be acceptable to the user agent, according to the proactive negotiation header fields received in the request. Used when negotiation content.
     */
    final const val RESPONSE_NOT_ACCEPTABLE: Long = 406

    /**
     * HTTP status code `510 Not Extended`. The policy for accessing the resource has not been met in the request. The server should send back all the information necessary for the client to issue an extended request.
     */
    final const val RESPONSE_NOT_EXTENDED: Long = 510

    /**
     * HTTP status code `404 Not Found`. The server can not find requested resource. Either the URL is not recognized or the endpoint is valid but the resource itself does not exist. May also be sent instead of 403 to hide existence of a resource if the client is not authorized.
     */
    final const val RESPONSE_NOT_FOUND: Long = 404

    /**
     * HTTP status code `501 Not Implemented`. The server does not support the functionality required to fulfill the request.
     */
    final const val RESPONSE_NOT_IMPLEMENTED: Long = 501

    /**
     * HTTP status code `304 Not Modified`. A conditional GET or HEAD request has been received and would have resulted in a 200 OK response if it were not for the fact that the condition evaluated to `false`.
     */
    final const val RESPONSE_NOT_MODIFIED: Long = 304

    /**
     * HTTP status code `204 No Content`. There is no content to send for this request, but the headers may be useful. The user-agent may update its cached headers for this resource with the new ones.
     */
    final const val RESPONSE_NO_CONTENT: Long = 204

    /**
     * HTTP status code `200 OK`. The request has succeeded. Default response for successful requests. Meaning varies depending on the request. GET: The resource has been fetched and is transmitted in the message body. HEAD: The entity headers are in the message body. POST: The resource describing the result of the action is transmitted in the message body. TRACE: The message body contains the request message as received by the server.
     */
    final const val RESPONSE_OK: Long = 200

    /**
     * HTTP status code `206 Partial Content`. This response code is used because of a range header sent by the client to separate download into multiple streams.
     */
    final const val RESPONSE_PARTIAL_CONTENT: Long = 206

    /**
     * HTTP status code `402 Payment Required`. This response code is reserved for future use. Initial aim for creating this code was using it for digital payment systems, however this is not currently used.
     */
    final const val RESPONSE_PAYMENT_REQUIRED: Long = 402

    /**
     * HTTP status code `308 Permanent Redirect`. The target resource has been assigned a new permanent URI and any future references to this resource ought to use one of the enclosed URIs.
     */
    final const val RESPONSE_PERMANENT_REDIRECT: Long = 308

    /**
     * HTTP status code `412 Precondition Failed`. One or more conditions given in the request header fields evaluated to `false` when tested on the server.
     */
    final const val RESPONSE_PRECONDITION_FAILED: Long = 412

    /**
     * HTTP status code `428 Precondition Required`. The origin server requires the request to be conditional.
     */
    final const val RESPONSE_PRECONDITION_REQUIRED: Long = 428

    /**
     * HTTP status code `102 Processing` (WebDAV). Indicates that the server has received and is processing the request, but no response is available yet.
     */
    final const val RESPONSE_PROCESSING: Long = 102

    /**
     * HTTP status code `407 Proxy Authentication Required`. Similar to 401 Unauthorized, but it indicates that the client needs to authenticate itself in order to use a proxy.
     */
    final const val RESPONSE_PROXY_AUTHENTICATION_REQUIRED: Long = 407

    /**
     * HTTP status code `416 Requested Range Not Satisfiable`. None of the ranges in the request's Range header field overlap the current extent of the selected resource or the set of ranges requested has been rejected due to invalid ranges or an excessive request of small or overlapping ranges.
     */
    final const val RESPONSE_REQUESTED_RANGE_NOT_SATISFIABLE: Long = 416

    /**
     * HTTP status code `413 Entity Too Large`. The server is refusing to process a request because the request payload is larger than the server is willing or able to process.
     */
    final const val RESPONSE_REQUEST_ENTITY_TOO_LARGE: Long = 413

    /**
     * HTTP status code `431 Request Header Fields Too Large`. The server is unwilling to process the request because its header fields are too large. The request MAY be resubmitted after reducing the size of the request header fields.
     */
    final const val RESPONSE_REQUEST_HEADER_FIELDS_TOO_LARGE: Long = 431

    /**
     * HTTP status code `408 Request Timeout`. The server did not receive a complete request message within the time that it was prepared to wait.
     */
    final const val RESPONSE_REQUEST_TIMEOUT: Long = 408

    /**
     * HTTP status code `414 Request-URI Too Long`. The server is refusing to service the request because the request-target is longer than the server is willing to interpret.
     */
    final const val RESPONSE_REQUEST_URI_TOO_LONG: Long = 414

    /**
     * HTTP status code `205 Reset Content`. The server has fulfilled the request and desires that the client resets the "document view" that caused the request to be sent to its original state as received from the origin server.
     */
    final const val RESPONSE_RESET_CONTENT: Long = 205

    /**
     * HTTP status code `303 See Other`. The server is redirecting the user agent to a different resource, as indicated by a URI in the Location header field, which is intended to provide an indirect response to the original request.
     */
    final const val RESPONSE_SEE_OTHER: Long = 303

    /**
     * HTTP status code `503 Service Unavailable`. The server is currently unable to handle the request due to a temporary overload or scheduled maintenance, which will likely be alleviated after some delay. Try again later.
     */
    final const val RESPONSE_SERVICE_UNAVAILABLE: Long = 503

    /**
     * HTTP status code `101 Switching Protocol`. Sent in response to an `Upgrade` request header by the client. Indicates the protocol the server is switching to.
     */
    final const val RESPONSE_SWITCHING_PROTOCOLS: Long = 101

    /**
     * HTTP status code `306 Switch Proxy`. *Deprecated. Do not use.*
     */
    final const val RESPONSE_SWITCH_PROXY: Long = 306

    /**
     * HTTP status code `307 Temporary Redirect`. The target resource resides temporarily under a different URI and the user agent MUST NOT change the request method if it performs an automatic redirection to that URI.
     */
    final const val RESPONSE_TEMPORARY_REDIRECT: Long = 307

    /**
     * HTTP status code `429 Too Many Requests`. The user has sent too many requests in a given amount of time (see "rate limiting"). Back off and increase time between requests or try again later.
     */
    final const val RESPONSE_TOO_MANY_REQUESTS: Long = 429

    /**
     * HTTP status code `401 Unauthorized`. Credentials required. The request has not been applied because it lacks valid authentication credentials for the target resource.
     */
    final const val RESPONSE_UNAUTHORIZED: Long = 401

    /**
     * HTTP status code `451 Response Unavailable For Legal Reasons`. The server is denying access to the resource as a consequence of a legal demand.
     */
    final const val RESPONSE_UNAVAILABLE_FOR_LEGAL_REASONS: Long = 451

    /**
     * HTTP status code `422 Unprocessable Entity` (WebDAV). The server understands the content type of the request entity (hence a 415 Unsupported Media Type status code is inappropriate), and the syntax of the request entity is correct (thus a 400 Bad Request status code is inappropriate) but was unable to process the contained instructions.
     */
    final const val RESPONSE_UNPROCESSABLE_ENTITY: Long = 422

    /**
     * HTTP status code `415 Unsupported Media Type`. The origin server is refusing to service the request because the payload is in a format not supported by this method on the target resource.
     */
    final const val RESPONSE_UNSUPPORTED_MEDIA_TYPE: Long = 415

    /**
     * HTTP status code `426 Upgrade Required`. The server refuses to perform the request using the current protocol but might be willing to do so after the client upgrades to a different protocol.
     */
    final const val RESPONSE_UPGRADE_REQUIRED: Long = 426

    /**
     * HTTP status code `305 Use Proxy`. *Deprecated. Do not use.*
     */
    final const val RESPONSE_USE_PROXY: Long = 305

    /**
     * HTTP status code `506 Variant Also Negotiates`. The server has an internal configuration error: the chosen variant resource is configured to engage in transparent content negotiation itself, and is therefore not a proper end point in the negotiation process.
     */
    final const val RESPONSE_VARIANT_ALSO_NEGOTIATES: Long = 506

    /**
     * Status: HTTP body received.
     */
    final const val STATUS_BODY: Long = 7

    /**
     * Status: Can't connect to the server.
     */
    final const val STATUS_CANT_CONNECT: Long = 4

    /**
     * Status: DNS failure: Can't resolve the hostname for the given URL.
     */
    final const val STATUS_CANT_RESOLVE: Long = 2

    /**
     * Status: Connection established.
     */
    final const val STATUS_CONNECTED: Long = 5

    /**
     * Status: Currently connecting to server.
     */
    final const val STATUS_CONNECTING: Long = 3

    /**
     * Status: Error in HTTP connection.
     */
    final const val STATUS_CONNECTION_ERROR: Long = 8

    /**
     * Status: Disconnected from the server.
     */
    final const val STATUS_DISCONNECTED: Long = 0

    /**
     * Status: Currently sending request.
     */
    final const val STATUS_REQUESTING: Long = 6

    /**
     * Status: Currently resolving the hostname for the given URL into an IP.
     */
    final const val STATUS_RESOLVING: Long = 1

    /**
     * Status: Error in SSL handshake.
     */
    final const val STATUS_SSL_HANDSHAKE_ERROR: Long = 9
  }
}
