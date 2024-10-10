// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
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
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_HTTPREQUEST_INDEX: Int = 280

/**
 * A node with the ability to send HTTP requests. Uses [HTTPClient] internally.
 * Can be used to make HTTP requests, i.e. download or upload files or web content via HTTP.
 * **Warning:** See the notes and warnings on [HTTPClient] for limitations, especially regarding TLS
 * security.
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android
 * export preset before exporting the project or using one-click deploy. Otherwise, network
 * communication of any kind will be blocked by Android.
 * **Example of contacting a REST API and printing one of its returned fields:**
 *
 * gdscript:
 * ```gdscript
 * func _ready():
 *     # Create an HTTP request node and connect its completion signal.
 *     var http_request = HTTPRequest.new()
 *     add_child(http_request)
 *     http_request.request_completed.connect(self._http_request_completed)
 *
 *     # Perform a GET request. The URL below returns JSON as of writing.
 *     var error = http_request.request("https://httpbin.org/get")
 *     if error != OK:
 *         push_error("An error occurred in the HTTP request.")
 *
 *     # Perform a POST request. The URL below returns JSON as of writing.
 *     # Note: Don't make simultaneous requests using a single HTTPRequest node.
 *     # The snippet below is provided for reference only.
 *     var body = JSON.new().stringify({"name": "Godette"})
 *     error = http_request.request("https://httpbin.org/post", [], HTTPClient.METHOD_POST, body)
 *     if error != OK:
 *         push_error("An error occurred in the HTTP request.")
 *
 * # Called when the HTTP request is completed.
 * func _http_request_completed(result, response_code, headers, body):
 *     var json = JSON.new()
 *     json.parse(body.get_string_from_utf8())
 *     var response = json.get_data()
 *
 *     # Will print the user agent string used by the HTTPRequest node (as recognized by
 * httpbin.org).
 *     print(response.headers["User-Agent"])
 * ```
 * csharp:
 * ```csharp
 * public override void _Ready()
 * {
 *     // Create an HTTP request node and connect its completion signal.
 *     var httpRequest = new HttpRequest();
 *     AddChild(httpRequest);
 *     httpRequest.RequestCompleted += HttpRequestCompleted;
 *
 *     // Perform a GET request. The URL below returns JSON as of writing.
 *     Error error = httpRequest.Request("https://httpbin.org/get");
 *     if (error != Error.Ok)
 *     {
 *         GD.PushError("An error occurred in the HTTP request.");
 *     }
 *
 *     // Perform a POST request. The URL below returns JSON as of writing.
 *     // Note: Don't make simultaneous requests using a single HTTPRequest node.
 *     // The snippet below is provided for reference only.
 *     string body = new Json().Stringify(new Godot.Collections.Dictionary
 *     {
 *         { "name", "Godette" }
 *     });
 *     error = httpRequest.Request("https://httpbin.org/post", null, HttpClient.Method.Post, body);
 *     if (error != Error.Ok)
 *     {
 *         GD.PushError("An error occurred in the HTTP request.");
 *     }
 * }
 *
 * // Called when the HTTP request is completed.
 * private void HttpRequestCompleted(long result, long responseCode, string[] headers, byte[] body)
 * {
 *     var json = new Json();
 *     json.Parse(body.GetStringFromUtf8());
 *     var response = json.GetData().AsGodotDictionary();
 *
 *     // Will print the user agent string used by the HTTPRequest node (as recognized by
 * httpbin.org).
 *     GD.Print((response["headers"].AsGodotDictionary())["User-Agent"]);
 * }
 * ```
 *
 * **Example of loading and displaying an image using HTTPRequest:**
 *
 * gdscript:
 * ```gdscript
 * func _ready():
 *     # Create an HTTP request node and connect its completion signal.
 *     var http_request = HTTPRequest.new()
 *     add_child(http_request)
 *     http_request.request_completed.connect(self._http_request_completed)
 *
 *     # Perform the HTTP request. The URL below returns a PNG image as of writing.
 *     var error = http_request.request("https://via.placeholder.com/512")
 *     if error != OK:
 *         push_error("An error occurred in the HTTP request.")
 *
 * # Called when the HTTP request is completed.
 * func _http_request_completed(result, response_code, headers, body):
 *     if result != HTTPRequest.RESULT_SUCCESS:
 *         push_error("Image couldn't be downloaded. Try a different image.")
 *
 *     var image = Image.new()
 *     var error = image.load_png_from_buffer(body)
 *     if error != OK:
 *         push_error("Couldn't load the image.")
 *
 *     var texture = ImageTexture.create_from_image(image)
 *
 *     # Display the image in a TextureRect node.
 *     var texture_rect = TextureRect.new()
 *     add_child(texture_rect)
 *     texture_rect.texture = texture
 * ```
 * csharp:
 * ```csharp
 * public override void _Ready()
 * {
 *     // Create an HTTP request node and connect its completion signal.
 *     var httpRequest = new HttpRequest();
 *     AddChild(httpRequest);
 *     httpRequest.RequestCompleted += HttpRequestCompleted;
 *
 *     // Perform the HTTP request. The URL below returns a PNG image as of writing.
 *     Error error = httpRequest.Request("https://via.placeholder.com/512");
 *     if (error != Error.Ok)
 *     {
 *         GD.PushError("An error occurred in the HTTP request.");
 *     }
 * }
 *
 * // Called when the HTTP request is completed.
 * private void HttpRequestCompleted(long result, long responseCode, string[] headers, byte[] body)
 * {
 *     if (result != (long)HttpRequest.Result.Success)
 *     {
 *         GD.PushError("Image couldn't be downloaded. Try a different image.");
 *     }
 *     var image = new Image();
 *     Error error = image.LoadPngFromBuffer(body);
 *     if (error != Error.Ok)
 *     {
 *         GD.PushError("Couldn't load the image.");
 *     }
 *
 *     var texture = ImageTexture.CreateFromImage(image);
 *
 *     // Display the image in a TextureRect node.
 *     var textureRect = new TextureRect();
 *     AddChild(textureRect);
 *     textureRect.Texture = texture;
 * }
 * ```
 *
 * **Gzipped response bodies**: HTTPRequest will automatically handle decompression of response
 * bodies. A `Accept-Encoding` header will be automatically added to each of your requests, unless one
 * is already specified. Any response with a `Content-Encoding: gzip` header will automatically be
 * decompressed and delivered to you as uncompressed bytes.
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
   * Any Response body declaring a `Content-Encoding` of either `gzip` or `deflate` will then be
   * automatically decompressed, and the uncompressed bytes will be delivered via [signal
   * request_completed].
   * If the user has specified their own `Accept-Encoding` header, then no header will be added
   * regardless of [acceptGzip].
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
    Internals.callConstructor(this, ENGINE_CLASS_HTTPREQUEST_INDEX, scriptIndex)
  }

  /**
   * Creates request on the underlying [HTTPClient]. If there is no configuration errors, it tries
   * to connect using [HTTPClient.connectToHost] and passes parameters onto [HTTPClient.request].
   * Returns [OK] if request is successfully created. (Does not imply that the server has
   * responded), [ERR_UNCONFIGURED] if not in the tree, [ERR_BUSY] if still processing previous
   * request, [ERR_INVALID_PARAMETER] if given string is not a valid URL format, or [ERR_CANT_CONNECT]
   * if not using thread and the [HTTPClient] cannot connect to host.
   * **Note:** When [method] is [HTTPClient.METHOD_GET], the payload sent via [requestData] might be
   * ignored by the server or even cause the server to reject the request (check
   * [url=https://datatracker.ietf.org/doc/html/rfc7231#section-4.3.1]RFC 7231 section 4.3.1[/url] for
   * more details). As a workaround, you can send data as a query string in the URL (see
   * [String.uriEncode] for an example).
   * **Note:** It's recommended to use transport encryption (TLS) and to avoid sending sensitive
   * information (such as login credentials) in HTTP GET URL parameters. Consider using HTTP POST
   * requests or HTTP headers for such information instead.
   */
  @JvmOverloads
  public final fun request(
    url: String,
    customHeaders: PackedStringArray = PackedStringArray(),
    method: HTTPClient.Method = HTTPClient.Method.METHOD_GET,
    requestData: String = "",
  ): Error {
    Internals.writeArguments(STRING to url, PACKED_STRING_ARRAY to customHeaders, LONG to method.id, STRING to requestData)
    Internals.callMethod(rawPtr, MethodBindings.requestPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Creates request on the underlying [HTTPClient] using a raw array of bytes for the request body.
   * If there is no configuration errors, it tries to connect using [HTTPClient.connectToHost] and
   * passes parameters onto [HTTPClient.request].
   * Returns [OK] if request is successfully created. (Does not imply that the server has
   * responded), [ERR_UNCONFIGURED] if not in the tree, [ERR_BUSY] if still processing previous
   * request, [ERR_INVALID_PARAMETER] if given string is not a valid URL format, or [ERR_CANT_CONNECT]
   * if not using thread and the [HTTPClient] cannot connect to host.
   */
  @JvmOverloads
  public final fun requestRaw(
    url: String,
    customHeaders: PackedStringArray = PackedStringArray(),
    method: HTTPClient.Method = HTTPClient.Method.METHOD_GET,
    requestDataRaw: PackedByteArray = PackedByteArray(),
  ): Error {
    Internals.writeArguments(STRING to url, PACKED_STRING_ARRAY to customHeaders, LONG to method.id, PACKED_BYTE_ARRAY to requestDataRaw)
    Internals.callMethod(rawPtr, MethodBindings.requestRawPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Cancels the current request.
   */
  public final fun cancelRequest(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.cancelRequestPtr, NIL)
  }

  /**
   * Sets the [TLSOptions] to be used when connecting to an HTTPS server. See [TLSOptions.client].
   */
  public final fun setTlsOptions(clientOptions: TLSOptions?): Unit {
    Internals.writeArguments(OBJECT to clientOptions)
    Internals.callMethod(rawPtr, MethodBindings.setTlsOptionsPtr, NIL)
  }

  /**
   * Returns the current status of the underlying [HTTPClient]. See [HTTPClient.Status].
   */
  public final fun getHttpClientStatus(): HTTPClient.Status {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHttpClientStatusPtr, LONG)
    return HTTPClient.Status.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setUseThreads(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setUseThreadsPtr, NIL)
  }

  public final fun isUsingThreads(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isUsingThreadsPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAcceptGzip(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setAcceptGzipPtr, NIL)
  }

  public final fun isAcceptingGzip(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isAcceptingGzipPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setBodySizeLimit(bytes: Int): Unit {
    Internals.writeArguments(LONG to bytes.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setBodySizeLimitPtr, NIL)
  }

  public final fun getBodySizeLimit(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBodySizeLimitPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMaxRedirects(amount: Int): Unit {
    Internals.writeArguments(LONG to amount.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setMaxRedirectsPtr, NIL)
  }

  public final fun getMaxRedirects(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxRedirectsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setDownloadFile(path: String): Unit {
    Internals.writeArguments(STRING to path)
    Internals.callMethod(rawPtr, MethodBindings.setDownloadFilePtr, NIL)
  }

  public final fun getDownloadFile(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDownloadFilePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the number of bytes this HTTPRequest downloaded.
   */
  public final fun getDownloadedBytes(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDownloadedBytesPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the response body length.
   * **Note:** Some Web servers may not send a body length. In this case, the value returned will be
   * `-1`. If using chunked transfer encoding, the body length will also be `-1`.
   */
  public final fun getBodySize(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBodySizePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setTimeout(timeout: Double): Unit {
    Internals.writeArguments(DOUBLE to timeout)
    Internals.callMethod(rawPtr, MethodBindings.setTimeoutPtr, NIL)
  }

  public final fun getTimeout(): Double {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTimeoutPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double)
  }

  public final fun setDownloadChunkSize(chunkSize: Int): Unit {
    Internals.writeArguments(LONG to chunkSize.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setDownloadChunkSizePtr, NIL)
  }

  public final fun getDownloadChunkSize(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDownloadChunkSizePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the proxy server for HTTP requests.
   * The proxy server is unset if [host] is empty or [port] is -1.
   */
  public final fun setHttpProxy(host: String, port: Int): Unit {
    Internals.writeArguments(STRING to host, LONG to port.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setHttpProxyPtr, NIL)
  }

  /**
   * Sets the proxy server for HTTPS requests.
   * The proxy server is unset if [host] is empty or [port] is -1.
   */
  public final fun setHttpsProxy(host: String, port: Int): Unit {
    Internals.writeArguments(STRING to host, LONG to port.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setHttpsProxyPtr, NIL)
  }

  public enum class Result(
    id: Long,
  ) {
    /**
     * Request successful.
     */
    RESULT_SUCCESS(0),
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
     * Request failed on TLS handshake.
     */
    RESULT_TLS_HANDSHAKE_ERROR(5),
    /**
     * Request does not have a response (yet).
     */
    RESULT_NO_RESPONSE(6),
    /**
     * Request exceeded its maximum size limit, see [bodySizeLimit].
     */
    RESULT_BODY_SIZE_LIMIT_EXCEEDED(7),
    RESULT_BODY_DECOMPRESS_FAILED(8),
    /**
     * Request failed (currently unused).
     */
    RESULT_REQUEST_FAILED(9),
    /**
     * HTTPRequest couldn't open the download file.
     */
    RESULT_DOWNLOAD_FILE_CANT_OPEN(10),
    /**
     * HTTPRequest couldn't write to the download file.
     */
    RESULT_DOWNLOAD_FILE_WRITE_ERROR(11),
    /**
     * Request reached its maximum redirect limit, see [maxRedirects].
     */
    RESULT_REDIRECT_LIMIT_REACHED(12),
    /**
     * Request failed due to a timeout. If you expect requests to take a long time, try increasing
     * the value of [timeout] or setting it to `0.0` to remove the timeout completely.
     */
    RESULT_TIMEOUT(13),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Result = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val requestPtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "request", 3215244323)

    public val requestRawPtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "request_raw", 2714829993)

    public val cancelRequestPtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "cancel_request", 3218959716)

    public val setTlsOptionsPtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "set_tls_options", 2210231844)

    public val getHttpClientStatusPtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "get_http_client_status", 1426656811)

    public val setUseThreadsPtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "set_use_threads", 2586408642)

    public val isUsingThreadsPtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "is_using_threads", 36873697)

    public val setAcceptGzipPtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "set_accept_gzip", 2586408642)

    public val isAcceptingGzipPtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "is_accepting_gzip", 36873697)

    public val setBodySizeLimitPtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "set_body_size_limit", 1286410249)

    public val getBodySizeLimitPtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "get_body_size_limit", 3905245786)

    public val setMaxRedirectsPtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "set_max_redirects", 1286410249)

    public val getMaxRedirectsPtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "get_max_redirects", 3905245786)

    public val setDownloadFilePtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "set_download_file", 83702148)

    public val getDownloadFilePtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "get_download_file", 201670096)

    public val getDownloadedBytesPtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "get_downloaded_bytes", 3905245786)

    public val getBodySizePtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "get_body_size", 3905245786)

    public val setTimeoutPtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "set_timeout", 373806689)

    public val getTimeoutPtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "get_timeout", 191475506)

    public val setDownloadChunkSizePtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "set_download_chunk_size", 1286410249)

    public val getDownloadChunkSizePtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "get_download_chunk_size", 3905245786)

    public val setHttpProxyPtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "set_http_proxy", 2956805083)

    public val setHttpsProxyPtr: VoidPtr =
        Internals.getMethodBindPtr("HTTPRequest", "set_https_proxy", 2956805083)
  }
}
