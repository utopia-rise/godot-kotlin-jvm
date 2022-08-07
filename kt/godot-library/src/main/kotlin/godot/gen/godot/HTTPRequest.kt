// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.HTTPClient
import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.signals.Signal4
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A node with the ability to send HTTP(S) requests.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/networking/http_request_class.html]($DOCS_URL/tutorials/networking/http_request_class.html)
 * [$DOCS_URL/tutorials/networking/ssl_certificates.html]($DOCS_URL/tutorials/networking/ssl_certificates.html)
 *
 * A node with the ability to send HTTP requests. Uses [godot.HTTPClient] internally.
 *
 * Can be used to make HTTP requests, i.e. download or upload files or web content via HTTP.
 *
 * **Warning:** See the notes and warnings on [godot.HTTPClient] for limitations, especially regarding SSL security.
 *
 * **Example of contacting a REST API and printing one of its returned fields:**
 *
 * ```
 * 		func _ready():
 * 		    # Create an HTTP request node and connect its completion signal.
 * 		    var http_request = HTTPRequest.new()
 * 		    add_child(http_request)
 * 		    http_request.connect("request_completed", self, "_http_request_completed")
 *
 * 		    # Perform a GET request. The URL below returns JSON as of writing.
 * 		    var error = http_request.request("https://httpbin.org/get")
 * 		    if error != OK:
 * 		        push_error("An error occurred in the HTTP request.")
 *
 * 		    # Perform a POST request. The URL below returns JSON as of writing.
 * 		    # Note: Don't make simultaneous requests using a single HTTPRequest node.
 * 		    # The snippet below is provided for reference only.
 * 		    var body = to_json({"name": "Godette"})
 * 		    error = http_request.request("https://httpbin.org/post", [], true, HTTPClient.METHOD_POST, body)
 * 		    if error != OK:
 * 		        push_error("An error occurred in the HTTP request.")
 *
 *
 * 		# Called when the HTTP request is completed.
 * 		func _http_request_completed(result, response_code, headers, body):
 * 		    var response = parse_json(body.get_string_from_utf8())
 *
 * 		    # Will print the user agent string used by the HTTPRequest node (as recognized by httpbin.org).
 * 		    print(response.headers["User-Agent"])
 * 		```
 *
 * **Example of loading and displaying an image using HTTPRequest:**
 *
 * ```
 * 		func _ready():
 * 		    # Create an HTTP request node and connect its completion signal.
 * 		    var http_request = HTTPRequest.new()
 * 		    add_child(http_request)
 * 		    http_request.connect("request_completed", self, "_http_request_completed")
 *
 * 		    # Perform the HTTP request. The URL below returns a PNG image as of writing.
 * 		    var error = http_request.request("https://via.placeholder.com/512")
 * 		    if error != OK:
 * 		        push_error("An error occurred in the HTTP request.")
 *
 *
 * 		# Called when the HTTP request is completed.
 * 		func _http_request_completed(result, response_code, headers, body):
 * 		    var image = Image.new()
 * 		    var error = image.load_png_from_buffer(body)
 * 		    if error != OK:
 * 		        push_error("Couldn't load the image.")
 *
 * 		    var texture = ImageTexture.new()
 * 		    texture.create_from_image(image)
 *
 * 		    # Display the image in a TextureRect node.
 * 		    var texture_rect = TextureRect.new()
 * 		    add_child(texture_rect)
 * 		    texture_rect.texture = texture
 * 		```
 */
@GodotBaseType
public open class HTTPRequest : Node() {
  /**
   * Emitted when a request is completed.
   */
  public val requestCompleted: Signal4<Long, Long, PoolStringArray, PoolByteArray> by
      signal("result", "response_code", "headers", "body")

  /**
   * Maximum allowed size for response bodies (`-1` means no limit). When only small files are expected, this can be used to prevent disallow receiving files that are too large, preventing potential denial of service attacks.
   */
  public open var bodySizeLimit: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_BODY_SIZE_LIMIT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_BODY_SIZE_LIMIT,
          NIL)
    }

  /**
   * The size of the buffer used and maximum bytes to read per iteration. See [godot.HTTPClient.readChunkSize].
   *
   * Set this to a lower value (e.g. 4096 for 4 KiB) when downloading small files to decrease memory usage at the cost of download speeds.
   */
  public open var downloadChunkSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_DOWNLOAD_CHUNK_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_DOWNLOAD_CHUNK_SIZE, NIL)
    }

  /**
   * The file to download into. If set to a non-empty string, the request output will be written to the file located at the path. If a file already exists at the specified location, it will be overwritten as soon as body data begins to be received.
   *
   * **Note:** Folders are not automatically created when the file is created. If [downloadFile] points to a subfolder, it's recommended to create the necessary folders beforehand using [godot.Directory.makeDirRecursive] to ensure the file can be written.
   */
  public open var downloadFile: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_DOWNLOAD_FILE,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_DOWNLOAD_FILE,
          NIL)
    }

  /**
   * Maximum number of allowed redirects. This is used to prevent endless redirect loops.
   */
  public open var maxRedirects: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_MAX_REDIRECTS,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_MAX_REDIRECTS,
          NIL)
    }

  /**
   * If set to a value greater than `0.0` before the request starts, the HTTP request will time out after `timeout` seconds have passed and the request is not *completed* yet. For small HTTP requests such as REST API usage, set [timeout] to a value between `10.0` and `30.0` to prevent the application from getting stuck if the request fails to get a response in a timely manner. For file downloads, leave this to `0.0` to prevent the download from failing if it takes too much time.
   */
  public open var timeout: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_TIMEOUT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_TIMEOUT, NIL)
    }

  /**
   * If `true`, multithreading is used to improve performance.
   */
  public open var useThreads: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_USE_THREADS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_USE_THREADS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_HTTPREQUEST)
  }

  public open fun _redirectRequest(arg0: String): Unit {
  }

  public open fun _requestDone(
    arg0: Long,
    arg1: Long,
    arg2: PoolStringArray,
    arg3: PoolByteArray
  ): Unit {
  }

  public open fun _timeout(): Unit {
  }

  /**
   * Cancels the current request.
   */
  public open fun cancelRequest(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_CANCEL_REQUEST, NIL)
  }

  /**
   * Returns the response body length.
   *
   * **Note:** Some Web servers may not send a body length. In this case, the value returned will be `-1`. If using chunked transfer encoding, the body length will also be `-1`.
   */
  public open fun getBodySize(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_BODY_SIZE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the amount of bytes this HTTPRequest downloaded.
   */
  public open fun getDownloadedBytes(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_DOWNLOADED_BYTES,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the current status of the underlying [godot.HTTPClient]. See [enum HTTPClient.Status].
   */
  public open fun getHttpClientStatus(): HTTPClient.Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_HTTP_CLIENT_STATUS,
        LONG)
    return HTTPClient.Status.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Creates request on the underlying [godot.HTTPClient]. If there is no configuration errors, it tries to connect using [godot.HTTPClient.connectToHost] and passes parameters onto [godot.HTTPClient.request].
   *
   * Returns [OK] if request is successfully created. (Does not imply that the server has responded), [ERR_UNCONFIGURED] if not in the tree, [ERR_BUSY] if still processing previous request, [ERR_INVALID_PARAMETER] if given string is not a valid URL format, or [ERR_CANT_CONNECT] if not using thread and the [godot.HTTPClient] cannot connect to host.
   *
   * **Note:** When `method` is [godot.HTTPClient.METHOD_GET], the payload sent via `request_data` might be ignored by the server or even cause the server to reject the request (check [godot.RFC 7231 section 4.3.1](https://datatracker.ietf.org/doc/html/rfc7231#section-4.3.1) for more details). As a workaround, you can send data as a query string in the URL. See [godot.String.httpEscape] for an example.
   */
  public open fun request(
    url: String,
    customHeaders: PoolStringArray = PoolStringArray(),
    sslValidateDomain: Boolean = true,
    method: Long = 0,
    requestData: String = ""
  ): GodotError {
    TransferContext.writeArguments(STRING to url, POOL_STRING_ARRAY to customHeaders, BOOL to
        sslValidateDomain, LONG to method, STRING to requestData)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_REQUEST, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Creates request on the underlying [godot.HTTPClient] using a raw array of bytes for the request body. If there is no configuration errors, it tries to connect using [godot.HTTPClient.connectToHost] and passes parameters onto [godot.HTTPClient.request].
   *
   * Returns [OK] if request is successfully created. (Does not imply that the server has responded), [ERR_UNCONFIGURED] if not in the tree, [ERR_BUSY] if still processing previous request, [ERR_INVALID_PARAMETER] if given string is not a valid URL format, or [ERR_CANT_CONNECT] if not using thread and the [godot.HTTPClient] cannot connect to host.
   */
  public open fun requestRaw(
    url: String,
    customHeaders: PoolStringArray = PoolStringArray(),
    sslValidateDomain: Boolean = true,
    method: Long = 0,
    requestDataRaw: PoolByteArray = PoolByteArray()
  ): GodotError {
    TransferContext.writeArguments(STRING to url, POOL_STRING_ARRAY to customHeaders, BOOL to
        sslValidateDomain, LONG to method, POOL_BYTE_ARRAY to requestDataRaw)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_REQUEST_RAW, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets the proxy server for HTTP requests.
   *
   * The proxy server is unset if `host` is empty or `port` is -1.
   */
  public open fun setHttpProxy(host: String, port: Long): Unit {
    TransferContext.writeArguments(STRING to host, LONG to port)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_HTTP_PROXY, NIL)
  }

  /**
   * Sets the proxy server for HTTPS requests.
   *
   * The proxy server is unset if `host` is empty or `port` is -1.
   */
  public open fun setHttpsProxy(host: String, port: Long): Unit {
    TransferContext.writeArguments(STRING to host, LONG to port)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_HTTPS_PROXY, NIL)
  }

  public enum class Result(
    id: Long
  ) {
    /**
     * Request successful.
     */
    RESULT_SUCCESS(0),
    /**
     *
     */
    RESULT_CHUNKED_BODY_SIZE_MISMATCH(1),
    /**
     * Request failed while connecting.
     */
    RESULT_CANT_CONNECT(2),
    /**
     * Request failed while resolving.
     */
    RESULT_CANT_RESOLVE(3),
    /**
     * Request failed due to connection (read/write) error.
     */
    RESULT_CONNECTION_ERROR(4),
    /**
     * Request failed on SSL handshake.
     */
    RESULT_SSL_HANDSHAKE_ERROR(5),
    /**
     * Request does not have a response (yet).
     */
    RESULT_NO_RESPONSE(6),
    /**
     * Request exceeded its maximum size limit, see [bodySizeLimit].
     */
    RESULT_BODY_SIZE_LIMIT_EXCEEDED(7),
    /**
     * Request failed (currently unused).
     */
    RESULT_REQUEST_FAILED(8),
    /**
     * HTTPRequest couldn't open the download file.
     */
    RESULT_DOWNLOAD_FILE_CANT_OPEN(9),
    /**
     * HTTPRequest couldn't write to the download file.
     */
    RESULT_DOWNLOAD_FILE_WRITE_ERROR(10),
    /**
     * Request reached its maximum redirect limit, see [maxRedirects].
     */
    RESULT_REDIRECT_LIMIT_REACHED(11),
    /**
     *
     */
    RESULT_TIMEOUT(12),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Request exceeded its maximum size limit, see [bodySizeLimit].
     */
    public final const val RESULT_BODY_SIZE_LIMIT_EXCEEDED: Long = 7

    /**
     * Request failed while connecting.
     */
    public final const val RESULT_CANT_CONNECT: Long = 2

    /**
     * Request failed while resolving.
     */
    public final const val RESULT_CANT_RESOLVE: Long = 3

    /**
     *
     */
    public final const val RESULT_CHUNKED_BODY_SIZE_MISMATCH: Long = 1

    /**
     * Request failed due to connection (read/write) error.
     */
    public final const val RESULT_CONNECTION_ERROR: Long = 4

    /**
     * HTTPRequest couldn't open the download file.
     */
    public final const val RESULT_DOWNLOAD_FILE_CANT_OPEN: Long = 9

    /**
     * HTTPRequest couldn't write to the download file.
     */
    public final const val RESULT_DOWNLOAD_FILE_WRITE_ERROR: Long = 10

    /**
     * Request does not have a response (yet).
     */
    public final const val RESULT_NO_RESPONSE: Long = 6

    /**
     * Request reached its maximum redirect limit, see [maxRedirects].
     */
    public final const val RESULT_REDIRECT_LIMIT_REACHED: Long = 11

    /**
     * Request failed (currently unused).
     */
    public final const val RESULT_REQUEST_FAILED: Long = 8

    /**
     * Request failed on SSL handshake.
     */
    public final const val RESULT_SSL_HANDSHAKE_ERROR: Long = 5

    /**
     * Request successful.
     */
    public final const val RESULT_SUCCESS: Long = 0

    /**
     *
     */
    public final const val RESULT_TIMEOUT: Long = 12
  }
}
