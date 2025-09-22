// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Error
import godot.core.GodotEnum
import godot.core.PackedByteArray
import godot.core.PackedStringArray
import godot.core.Signal4
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * A node with the ability to send HTTP requests. Uses [HTTPClient] internally.
 *
 * Can be used to make HTTP requests, i.e. download or upload files or web content via HTTP.
 *
 * **Warning:** See the notes and warnings on [HTTPClient] for limitations, especially regarding TLS
 * security.
 *
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android
 * export preset before exporting the project or using one-click deploy. Otherwise, network
 * communication of any kind will be blocked by Android.
 *
 * **Example:** Contact a REST API and print one of its returned fields:
 *
 * ```gdscript
 * //gdscript
 * func _ready():
 * # Create an HTTP request node and connect its completion signal.
 * var http_request = HTTPRequest.new()
 * add_child(http_request)
 * http_request.request_completed.connect(self._http_request_completed)
 *
 * # Perform a GET request. The URL below returns JSON as of writing.
 * var error = http_request.request("https://httpbin.org/get")
 * if error != OK:
 * push_error("An error occurred in the HTTP request.")
 *
 * # Perform a POST request. The URL below returns JSON as of writing.
 * # Note: Don't make simultaneous requests using a single HTTPRequest node.
 * # The snippet below is provided for reference only.
 * var body = JSON.new().stringify({"name": "Godette"})
 * error = http_request.request("https://httpbin.org/post", [], HTTPClient.METHOD_POST, body)
 * if error != OK:
 * push_error("An error occurred in the HTTP request.")
 *
 * # Called when the HTTP request is completed.
 * func _http_request_completed(result, response_code, headers, body):
 * var json = JSON.new()
 * json.parse(body.get_string_from_utf8())
 * var response = json.get_data()
 *
 * # Will print the user agent string used by the HTTPRequest node (as recognized by httpbin.org).
 * print(response.headers["User-Agent"])
 * ```
 *
 * ```csharp
 * //csharp
 * public override void _Ready()
 * {
 * // Create an HTTP request node and connect its completion signal.
 * var httpRequest = new HttpRequest();
 * AddChild(httpRequest);
 * httpRequest.RequestCompleted += HttpRequestCompleted;
 *
 * // Perform a GET request. The URL below returns JSON as of writing.
 * Error error = httpRequest.Request("https://httpbin.org/get");
 * if (error != Error.Ok)
 * {
 * GD.PushError("An error occurred in the HTTP request.");
 * }
 *
 * // Perform a POST request. The URL below returns JSON as of writing.
 * // Note: Don't make simultaneous requests using a single HTTPRequest node.
 * // The snippet below is provided for reference only.
 * string body = new Json().Stringify(new Godot.Collections.Dictionary
 * {
 * { "name", "Godette" }
 * });
 * error = httpRequest.Request("https://httpbin.org/post", null, HttpClient.Method.Post, body);
 * if (error != Error.Ok)
 * {
 * GD.PushError("An error occurred in the HTTP request.");
 * }
 * }
 *
 * // Called when the HTTP request is completed.
 * private void HttpRequestCompleted(long result, long responseCode, string[] headers, byte[] body)
 * {
 * var json = new Json();
 * json.Parse(body.GetStringFromUtf8());
 * var response = json.GetData().AsGodotDictionary();
 *
 * // Will print the user agent string used by the HTTPRequest node (as recognized by httpbin.org).
 * GD.Print((response["headers"].AsGodotDictionary())["User-Agent"]);
 * }
 * ```
 *
 * **Example:** Load an image using [HTTPRequest] and display it:
 *
 * ```gdscript
 * //gdscript
 * func _ready():
 * # Create an HTTP request node and connect its completion signal.
 * var http_request = HTTPRequest.new()
 * add_child(http_request)
 * http_request.request_completed.connect(self._http_request_completed)
 *
 * # Perform the HTTP request. The URL below returns a PNG image as of writing.
 * var error = http_request.request("https://placehold.co/512.png")
 * if error != OK:
 * push_error("An error occurred in the HTTP request.")
 *
 * # Called when the HTTP request is completed.
 * func _http_request_completed(result, response_code, headers, body):
 * if result != HTTPRequest.RESULT_SUCCESS:
 * push_error("Image couldn't be downloaded. Try a different image.")
 *
 * var image = Image.new()
 * var error = image.load_png_from_buffer(body)
 * if error != OK:
 * push_error("Couldn't load the image.")
 *
 * var texture = ImageTexture.create_from_image(image)
 *
 * # Display the image in a TextureRect node.
 * var texture_rect = TextureRect.new()
 * add_child(texture_rect)
 * texture_rect.texture = texture
 * ```
 *
 * ```csharp
 * //csharp
 * public override void _Ready()
 * {
 * // Create an HTTP request node and connect its completion signal.
 * var httpRequest = new HttpRequest();
 * AddChild(httpRequest);
 * httpRequest.RequestCompleted += HttpRequestCompleted;
 *
 * // Perform the HTTP request. The URL below returns a PNG image as of writing.
 * Error error = httpRequest.Request("https://placehold.co/512.png");
 * if (error != Error.Ok)
 * {
 * GD.PushError("An error occurred in the HTTP request.");
 * }
 * }
 *
 * // Called when the HTTP request is completed.
 * private void HttpRequestCompleted(long result, long responseCode, string[] headers, byte[] body)
 * {
 * if (result != (long)HttpRequest.Result.Success)
 * {
 * GD.PushError("Image couldn't be downloaded. Try a different image.");
 * }
 * var image = new Image();
 * Error error = image.LoadPngFromBuffer(body);
 * if (error != Error.Ok)
 * {
 * GD.PushError("Couldn't load the image.");
 * }
 *
 * var texture = ImageTexture.CreateFromImage(image);
 *
 * // Display the image in a TextureRect node.
 * var textureRect = new TextureRect();
 * AddChild(textureRect);
 * textureRect.Texture = texture;
 * }
 * ```
 *
 * **Note:** [HTTPRequest] nodes will automatically handle decompression of response bodies. An
 * `Accept-Encoding` header will be automatically added to each of your requests, unless one is already
 * specified. Any response with a `Content-Encoding: gzip` header will automatically be decompressed
 * and delivered to you as uncompressed bytes.
 */
@GodotBaseType
public open class HTTPRequest : Node() {
  /**
   * Emitted when a request is completed.
   */
  public val requestCompleted: Signal4<Long, Long, PackedStringArray, PackedByteArray> by Signal4

  /**
   * The file to download into. Will output any received file into it.
   */
  public final inline var downloadFile: String
    @JvmName("downloadFileProperty")
    get() = getDownloadFile()
    @JvmName("downloadFileProperty")
    set(`value`) {
      setDownloadFile(value)
    }

  /**
   * The size of the buffer used and maximum bytes to read per iteration. See
   * [HTTPClient.readChunkSize].
   *
   * Set this to a lower value (e.g. 4096 for 4 KiB) when downloading small files to decrease memory
   * usage at the cost of download speeds.
   */
  public final inline var downloadChunkSize: Int
    @JvmName("downloadChunkSizeProperty")
    get() = getDownloadChunkSize()
    @JvmName("downloadChunkSizeProperty")
    set(`value`) {
      setDownloadChunkSize(value)
    }

  /**
   * If `true`, multithreading is used to improve performance.
   */
  public final inline var useThreads: Boolean
    @JvmName("useThreadsProperty")
    get() = isUsingThreads()
    @JvmName("useThreadsProperty")
    set(`value`) {
      setUseThreads(value)
    }

  /**
   * If `true`, this header will be added to each request: `Accept-Encoding: gzip, deflate` telling
   * servers that it's okay to compress response bodies.
   *
   * Any Response body declaring a `Content-Encoding` of either `gzip` or `deflate` will then be
   * automatically decompressed, and the uncompressed bytes will be delivered via [signal
   * request_completed].
   *
   * If the user has specified their own `Accept-Encoding` header, then no header will be added
   * regardless of [acceptGzip].
   *
   * If `false` no header will be added, and no decompression will be performed on response bodies.
   * The raw bytes of the response body will be returned via [signal request_completed].
   */
  public final inline var acceptGzip: Boolean
    @JvmName("acceptGzipProperty")
    get() = isAcceptingGzip()
    @JvmName("acceptGzipProperty")
    set(`value`) {
      setAcceptGzip(value)
    }

  /**
   * Maximum allowed size for response bodies. If the response body is compressed, this will be used
   * as the maximum allowed size for the decompressed body.
   */
  public final inline var bodySizeLimit: Int
    @JvmName("bodySizeLimitProperty")
    get() = getBodySizeLimit()
    @JvmName("bodySizeLimitProperty")
    set(`value`) {
      setBodySizeLimit(value)
    }

  /**
   * Maximum number of allowed redirects.
   */
  public final inline var maxRedirects: Int
    @JvmName("maxRedirectsProperty")
    get() = getMaxRedirects()
    @JvmName("maxRedirectsProperty")
    set(`value`) {
      setMaxRedirects(value)
    }

  /**
   * The duration to wait in seconds before a request times out. If [timeout] is set to `0.0` then
   * the request will never time out. For simple requests, such as communication with a REST API, it is
   * recommended that [timeout] is set to a value suitable for the server response time (e.g. between
   * `1.0` and `10.0`). This will help prevent unwanted timeouts caused by variation in server response
   * times while still allowing the application to detect when a request has timed out. For larger
   * requests such as file downloads it is suggested the [timeout] be set to `0.0`, disabling the
   * timeout functionality. This will help to prevent large transfers from failing due to exceeding the
   * timeout value.
   */
  public final inline var timeout: Double
    @JvmName("timeoutProperty")
    get() = getTimeout()
    @JvmName("timeoutProperty")
    set(`value`) {
      setTimeout(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(285, scriptIndex)
  }

  /**
   * Creates request on the underlying [HTTPClient]. If there is no configuration errors, it tries
   * to connect using [HTTPClient.connectToHost] and passes parameters onto [HTTPClient.request].
   *
   * Returns [OK] if request is successfully created. (Does not imply that the server has
   * responded), [ERR_UNCONFIGURED] if not in the tree, [ERR_BUSY] if still processing previous
   * request, [ERR_INVALID_PARAMETER] if given string is not a valid URL format, or [ERR_CANT_CONNECT]
   * if not using thread and the [HTTPClient] cannot connect to host.
   *
   * **Note:** When [method] is [HTTPClient.METHOD_GET], the payload sent via [requestData] might be
   * ignored by the server or even cause the server to reject the request (check
   * [url=https://datatracker.ietf.org/doc/html/rfc7231#section-4.3.1]RFC 7231 section 4.3.1[/url] for
   * more details). As a workaround, you can send data as a query string in the URL (see
   * [String.uriEncode] for an example).
   *
   * **Note:** It's recommended to use transport encryption (TLS) and to avoid sending sensitive
   * information (such as login credentials) in HTTP GET URL parameters. Consider using HTTP POST
   * requests or HTTP headers for such information instead.
   */
  @JvmOverloads
  public final fun request(
    url: String,
    customHeaders: PackedStringArray = PackedStringArray(),
    method: HTTPClient.Method = HTTPClient.Method.GET,
    requestData: String = "",
  ): Error {
    TransferContext.writeArguments(STRING to url, PACKED_STRING_ARRAY to customHeaders, LONG to method.value, STRING to requestData)
    TransferContext.callMethod(ptr, MethodBindings.requestPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Creates request on the underlying [HTTPClient] using a raw array of bytes for the request body.
   * If there is no configuration errors, it tries to connect using [HTTPClient.connectToHost] and
   * passes parameters onto [HTTPClient.request].
   *
   * Returns [OK] if request is successfully created. (Does not imply that the server has
   * responded), [ERR_UNCONFIGURED] if not in the tree, [ERR_BUSY] if still processing previous
   * request, [ERR_INVALID_PARAMETER] if given string is not a valid URL format, or [ERR_CANT_CONNECT]
   * if not using thread and the [HTTPClient] cannot connect to host.
   */
  @JvmOverloads
  public final fun requestRaw(
    url: String,
    customHeaders: PackedStringArray = PackedStringArray(),
    method: HTTPClient.Method = HTTPClient.Method.GET,
    requestDataRaw: PackedByteArray = PackedByteArray(),
  ): Error {
    TransferContext.writeArguments(STRING to url, PACKED_STRING_ARRAY to customHeaders, LONG to method.value, PACKED_BYTE_ARRAY to requestDataRaw)
    TransferContext.callMethod(ptr, MethodBindings.requestRawPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Cancels the current request.
   */
  public final fun cancelRequest(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.cancelRequestPtr, NIL)
  }

  /**
   * Sets the [TLSOptions] to be used when connecting to an HTTPS server. See [TLSOptions.client].
   */
  public final fun setTlsOptions(clientOptions: TLSOptions?): Unit {
    TransferContext.writeArguments(OBJECT to clientOptions)
    TransferContext.callMethod(ptr, MethodBindings.setTlsOptionsPtr, NIL)
  }

  /**
   * Returns the current status of the underlying [HTTPClient].
   */
  public final fun getHttpClientStatus(): HTTPClient.Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHttpClientStatusPtr, LONG)
    return HTTPClient.Status.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setUseThreads(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setUseThreadsPtr, NIL)
  }

  public final fun isUsingThreads(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUsingThreadsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAcceptGzip(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setAcceptGzipPtr, NIL)
  }

  public final fun isAcceptingGzip(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isAcceptingGzipPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setBodySizeLimit(bytes: Int): Unit {
    TransferContext.writeArguments(LONG to bytes.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setBodySizeLimitPtr, NIL)
  }

  public final fun getBodySizeLimit(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBodySizeLimitPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMaxRedirects(amount: Int): Unit {
    TransferContext.writeArguments(LONG to amount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMaxRedirectsPtr, NIL)
  }

  public final fun getMaxRedirects(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxRedirectsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setDownloadFile(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.setDownloadFilePtr, NIL)
  }

  public final fun getDownloadFile(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDownloadFilePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the number of bytes this HTTPRequest downloaded.
   */
  public final fun getDownloadedBytes(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDownloadedBytesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the response body length.
   *
   * **Note:** Some Web servers may not send a body length. In this case, the value returned will be
   * `-1`. If using chunked transfer encoding, the body length will also be `-1`.
   */
  public final fun getBodySize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBodySizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setTimeout(timeout: Double): Unit {
    TransferContext.writeArguments(DOUBLE to timeout)
    TransferContext.callMethod(ptr, MethodBindings.setTimeoutPtr, NIL)
  }

  public final fun getTimeout(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTimeoutPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setDownloadChunkSize(chunkSize: Int): Unit {
    TransferContext.writeArguments(LONG to chunkSize.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setDownloadChunkSizePtr, NIL)
  }

  public final fun getDownloadChunkSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDownloadChunkSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the proxy server for HTTP requests.
   *
   * The proxy server is unset if [host] is empty or [port] is -1.
   */
  public final fun setHttpProxy(host: String, port: Int): Unit {
    TransferContext.writeArguments(STRING to host, LONG to port.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setHttpProxyPtr, NIL)
  }

  /**
   * Sets the proxy server for HTTPS requests.
   *
   * The proxy server is unset if [host] is empty or [port] is -1.
   */
  public final fun setHttpsProxy(host: String, port: Int): Unit {
    TransferContext.writeArguments(STRING to host, LONG to port.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setHttpsProxyPtr, NIL)
  }

  public enum class Result(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Request successful.
     */
    SUCCESS(0),
    /**
     * Request failed due to a mismatch between the expected and actual chunked body size during
     * transfer. Possible causes include network errors, server misconfiguration, or issues with
     * chunked encoding.
     */
    CHUNKED_BODY_SIZE_MISMATCH(1),
    /**
     * Request failed while connecting.
     */
    CANT_CONNECT(2),
    /**
     * Request failed while resolving.
     */
    CANT_RESOLVE(3),
    /**
     * Request failed due to connection (read/write) error.
     */
    CONNECTION_ERROR(4),
    /**
     * Request failed on TLS handshake.
     */
    TLS_HANDSHAKE_ERROR(5),
    /**
     * Request does not have a response (yet).
     */
    NO_RESPONSE(6),
    /**
     * Request exceeded its maximum size limit, see [bodySizeLimit].
     */
    BODY_SIZE_LIMIT_EXCEEDED(7),
    /**
     * Request failed due to an error while decompressing the response body. Possible causes include
     * unsupported or incorrect compression format, corrupted data, or incomplete transfer.
     */
    BODY_DECOMPRESS_FAILED(8),
    /**
     * Request failed (currently unused).
     */
    REQUEST_FAILED(9),
    /**
     * HTTPRequest couldn't open the download file.
     */
    DOWNLOAD_FILE_CANT_OPEN(10),
    /**
     * HTTPRequest couldn't write to the download file.
     */
    DOWNLOAD_FILE_WRITE_ERROR(11),
    /**
     * Request reached its maximum redirect limit, see [maxRedirects].
     */
    REDIRECT_LIMIT_REACHED(12),
    /**
     * Request failed due to a timeout. If you expect requests to take a long time, try increasing
     * the value of [timeout] or setting it to `0.0` to remove the timeout completely.
     */
    TIMEOUT(13),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): Result = entries.single { it.`value` == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val requestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "request", 3215244323)

    internal val requestRawPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "request_raw", 2714829993)

    internal val cancelRequestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "cancel_request", 3218959716)

    internal val setTlsOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "set_tls_options", 2210231844)

    internal val getHttpClientStatusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "get_http_client_status", 1426656811)

    internal val setUseThreadsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "set_use_threads", 2586408642)

    internal val isUsingThreadsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "is_using_threads", 36873697)

    internal val setAcceptGzipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "set_accept_gzip", 2586408642)

    internal val isAcceptingGzipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "is_accepting_gzip", 36873697)

    internal val setBodySizeLimitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "set_body_size_limit", 1286410249)

    internal val getBodySizeLimitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "get_body_size_limit", 3905245786)

    internal val setMaxRedirectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "set_max_redirects", 1286410249)

    internal val getMaxRedirectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "get_max_redirects", 3905245786)

    internal val setDownloadFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "set_download_file", 83702148)

    internal val getDownloadFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "get_download_file", 201670096)

    internal val getDownloadedBytesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "get_downloaded_bytes", 3905245786)

    internal val getBodySizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "get_body_size", 3905245786)

    internal val setTimeoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "set_timeout", 373806689)

    internal val getTimeoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "get_timeout", 191475506)

    internal val setDownloadChunkSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "set_download_chunk_size", 1286410249)

    internal val getDownloadChunkSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "get_download_chunk_size", 3905245786)

    internal val setHttpProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "set_http_proxy", 2956805083)

    internal val setHttpsProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("HTTPRequest", "set_https_proxy", 2956805083)
  }
}
