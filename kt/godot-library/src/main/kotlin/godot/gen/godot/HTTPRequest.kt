// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.PackedStringArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal4
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A node with the ability to send HTTP(S) requests.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/networking/ssl_certificates.html]($DOCS_URL/tutorials/networking/ssl_certificates.html)
 *
 * A node with the ability to send HTTP requests. Uses [godot.HTTPClient] internally.
 *
 * Can be used to make HTTP requests, i.e. download or upload files or web content via HTTP.
 *
 * **Warning:** See the notes and warnings on [godot.HTTPClient] for limitations, especially regarding TLS security.
 *
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android export preset before exporting the project or using one-click deploy. Otherwise, network communication of any kind will be blocked by Android.
 *
 * **Example of contacting a REST API and printing one of its returned fields:**
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * func _ready():
 *
 *     # Create an HTTP request node and connect its completion signal.
 *
 *     var http_request = HTTPRequest.new()
 *
 *     add_child(http_request)
 *
 *     http_request.request_completed.connect(self._http_request_completed)
 *
 *
 *
 *     # Perform a GET request. The URL below returns JSON as of writing.
 *
 *     var error = http_request.request("https://httpbin.org/get")
 *
 *     if error != OK:
 *
 *         push_error("An error occurred in the HTTP request.")
 *
 *
 *
 *     # Perform a POST request. The URL below returns JSON as of writing.
 *
 *     # Note: Don't make simultaneous requests using a single HTTPRequest node.
 *
 *     # The snippet below is provided for reference only.
 *
 *     var body = JSON.new().stringify({"name": "Godette"})
 *
 *     error = http_request.request("https://httpbin.org/post", [], HTTPClient.METHOD_POST, body)
 *
 *     if error != OK:
 *
 *         push_error("An error occurred in the HTTP request.")
 *
 *
 *
 * # Called when the HTTP request is completed.
 *
 * func _http_request_completed(result, response_code, headers, body):
 *
 *     var json = JSON.new()
 *
 *     json.parse(body.get_string_from_utf8())
 *
 *     var response = json.get_data()
 *
 *
 *
 *     # Will print the user agent string used by the HTTPRequest node (as recognized by httpbin.org).
 *
 *     print(response.headers["User-Agent"])
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * public override void _Ready()
 *
 * {
 *
 *     // Create an HTTP request node and connect its completion signal.
 *
 *     var httpRequest = new HTTPRequest();
 *
 *     AddChild(httpRequest);
 *
 *     httpRequest.RequestCompleted += HttpRequestCompleted;
 *
 *
 *
 *     // Perform a GET request. The URL below returns JSON as of writing.
 *
 *     Error error = httpRequest.Request("https://httpbin.org/get");
 *
 *     if (error != Error.Ok)
 *
 *     {
 *
 *         GD.PushError("An error occurred in the HTTP request.");
 *
 *     }
 *
 *
 *
 *     // Perform a POST request. The URL below returns JSON as of writing.
 *
 *     // Note: Don't make simultaneous requests using a single HTTPRequest node.
 *
 *     // The snippet below is provided for reference only.
 *
 *     string body = new Json().Stringify(new Godot.Collections.Dictionary
 *
 *     {
 *
 *         { "name", "Godette" }
 *
 *     });
 *
 *     error = httpRequest.Request("https://httpbin.org/post", null, HTTPClient.Method.Post, body);
 *
 *     if (error != Error.Ok)
 *
 *     {
 *
 *         GD.PushError("An error occurred in the HTTP request.");
 *
 *     }
 *
 * }
 *
 *
 *
 * // Called when the HTTP request is completed.
 *
 * private void HttpRequestCompleted(long result, long responseCode, string[] headers, byte[] body)
 *
 * {
 *
 *     var json = new Json();
 *
 *     json.Parse(body.GetStringFromUtf8());
 *
 *     var response = json.GetData().AsGodotDictionary();
 *
 *
 *
 *     // Will print the user agent string used by the HTTPRequest node (as recognized by httpbin.org).
 *
 *     GD.Print((response["headers"].AsGodotDictionary())["User-Agent"]);
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * **Example of loading and displaying an image using HTTPRequest:**
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * func _ready():
 *
 *     # Create an HTTP request node and connect its completion signal.
 *
 *     var http_request = HTTPRequest.new()
 *
 *     add_child(http_request)
 *
 *     http_request.request_completed.connect(self._http_request_completed)
 *
 *
 *
 *     # Perform the HTTP request. The URL below returns a PNG image as of writing.
 *
 *     var error = http_request.request("https://via.placeholder.com/512")
 *
 *     if error != OK:
 *
 *         push_error("An error occurred in the HTTP request.")
 *
 *
 *
 * # Called when the HTTP request is completed.
 *
 * func _http_request_completed(result, response_code, headers, body):
 *
 *     if result != HTTPRequest.RESULT_SUCCESS:
 *
 *         push_error("Image couldn't be downloaded. Try a different image.")
 *
 *
 *
 *     var image = Image.new()
 *
 *     var error = image.load_png_from_buffer(body)
 *
 *     if error != OK:
 *
 *         push_error("Couldn't load the image.")
 *
 *
 *
 *     var texture = ImageTexture.create_from_image(image)
 *
 *
 *
 *     # Display the image in a TextureRect node.
 *
 *     var texture_rect = TextureRect.new()
 *
 *     add_child(texture_rect)
 *
 *     texture_rect.texture = texture
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * public override void _Ready()
 *
 * {
 *
 *     // Create an HTTP request node and connect its completion signal.
 *
 *     var httpRequest = new HTTPRequest();
 *
 *     AddChild(httpRequest);
 *
 *     httpRequest.RequestCompleted += HttpRequestCompleted;
 *
 *
 *
 *     // Perform the HTTP request. The URL below returns a PNG image as of writing.
 *
 *     Error error = httpRequest.Request("https://via.placeholder.com/512");
 *
 *     if (error != Error.Ok)
 *
 *     {
 *
 *         GD.PushError("An error occurred in the HTTP request.");
 *
 *     }
 *
 * }
 *
 *
 *
 * // Called when the HTTP request is completed.
 *
 * private void HttpRequestCompleted(long result, long responseCode, string[] headers, byte[] body)
 *
 * {
 *
 *     if (result != (long)HTTPRequest.Result.Success)
 *
 *     {
 *
 *         GD.PushError("Image couldn't be downloaded. Try a different image.");
 *
 *     }
 *
 *     var image = new Image();
 *
 *     Error error = image.LoadPngFromBuffer(body);
 *
 *     if (error != Error.Ok)
 *
 *     {
 *
 *         GD.PushError("Couldn't load the image.");
 *
 *     }
 *
 *
 *
 *     var texture = ImageTexture.CreateFromImage(image);
 *
 *
 *
 *     // Display the image in a TextureRect node.
 *
 *     var textureRect = new TextureRect();
 *
 *     AddChild(textureRect);
 *
 *     textureRect.Texture = texture;
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * **Gzipped response bodies**: HTTPRequest will automatically handle decompression of response bodies. A `Accept-Encoding` header will be automatically added to each of your requests, unless one is already specified. Any response with a `Content-Encoding: gzip` header will automatically be decompressed and delivered to you as uncompressed bytes.
 */
@GodotBaseType
public open class HTTPRequest : Node() {
  /**
   * Emitted when a request is completed.
   */
  public val requestCompleted: Signal4<Long, Long, PackedStringArray, PackedByteArray> by
      signal("result", "responseCode", "headers", "body")

  /**
   * The file to download into. Will output any received file into it.
   */
  public var downloadFile: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_DOWNLOAD_FILE,
          STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_DOWNLOAD_FILE,
          NIL)
    }

  /**
   * The size of the buffer used and maximum bytes to read per iteration. See [godot.HTTPClient.readChunkSize].
   *
   * Set this to a lower value (e.g. 4096 for 4 KiB) when downloading small files to decrease memory usage at the cost of download speeds.
   */
  public var downloadChunkSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_DOWNLOAD_CHUNK_SIZE, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_DOWNLOAD_CHUNK_SIZE, NIL)
    }

  /**
   * If `true`, multithreading is used to improve performance.
   */
  public var useThreads: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_IS_USING_THREADS,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_USE_THREADS, NIL)
    }

  /**
   * If `true`, this header will be added to each request: `Accept-Encoding: gzip, deflate` telling servers that it's okay to compress response bodies.
   *
   * Any Response body declaring a `Content-Encoding` of either `gzip` or `deflate` will then be automatically decompressed, and the uncompressed bytes will be delivered via `request_completed`.
   *
   * If the user has specified their own `Accept-Encoding` header, then no header will be added regardless of `accept_gzip`.
   *
   * If `false` no header will be added, and no decompression will be performed on response bodies. The raw bytes of the response body will be returned via `request_completed`.
   */
  public var acceptGzip: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_IS_ACCEPTING_GZIP,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_ACCEPT_GZIP, NIL)
    }

  /**
   * Maximum allowed size for response bodies. If the response body is compressed, this will be used as the maximum allowed size for the decompressed body.
   */
  public var bodySizeLimit: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_BODY_SIZE_LIMIT,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_BODY_SIZE_LIMIT,
          NIL)
    }

  /**
   * Maximum number of allowed redirects.
   */
  public var maxRedirects: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_MAX_REDIRECTS,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_MAX_REDIRECTS,
          NIL)
    }

  /**
   * The duration to wait in seconds before a request times out. If [timeout] is set to `0.0` then the request will never time out. For simple requests, such as communication with a REST API, it is recommended that [timeout] is set to a value suitable for the server response time (e.g. between `1.0` and `10.0`). This will help prevent unwanted timeouts caused by variation in server response times while still allowing the application to detect when a request has timed out. For larger requests such as file downloads it is suggested the [timeout] be set to `0.0`, disabling the timeout functionality. This will help to prevent large transfers from failing due to exceeding the timeout value.
   */
  public var timeout: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_TIMEOUT, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_TIMEOUT, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_HTTPREQUEST, scriptIndex)
    return true
  }

  /**
   * Creates request on the underlying [godot.HTTPClient]. If there is no configuration errors, it tries to connect using [godot.HTTPClient.connectToHost] and passes parameters onto [godot.HTTPClient.request].
   *
   * Returns [OK] if request is successfully created. (Does not imply that the server has responded), [ERR_UNCONFIGURED] if not in the tree, [ERR_BUSY] if still processing previous request, [ERR_INVALID_PARAMETER] if given string is not a valid URL format, or [ERR_CANT_CONNECT] if not using thread and the [godot.HTTPClient] cannot connect to host.
   *
   * **Note:** When [method] is [godot.HTTPClient.METHOD_GET], the payload sent via [requestData] might be ignored by the server or even cause the server to reject the request (check [godot.RFC 7231 section 4.3.1](https://datatracker.ietf.org/doc/html/rfc7231#section-4.3.1) for more details). As a workaround, you can send data as a query string in the URL (see [godot.String.uriEncode] for an example).
   *
   * **Note:** It's recommended to use transport encryption (TLS) and to avoid sending sensitive information (such as login credentials) in HTTP GET URL parameters. Consider using HTTP POST requests or HTTP headers for such information instead.
   */
  @JvmOverloads
  public fun request(
    url: String,
    customHeaders: PackedStringArray = PackedStringArray(),
    method: HTTPClient.Method = HTTPClient.Method.METHOD_GET,
    requestData: String = "",
  ): GodotError {
    TransferContext.writeArguments(STRING to url, PACKED_STRING_ARRAY to customHeaders, LONG to method.id, STRING to requestData)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_REQUEST, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Creates request on the underlying [godot.HTTPClient] using a raw array of bytes for the request body. If there is no configuration errors, it tries to connect using [godot.HTTPClient.connectToHost] and passes parameters onto [godot.HTTPClient.request].
   *
   * Returns [OK] if request is successfully created. (Does not imply that the server has responded), [ERR_UNCONFIGURED] if not in the tree, [ERR_BUSY] if still processing previous request, [ERR_INVALID_PARAMETER] if given string is not a valid URL format, or [ERR_CANT_CONNECT] if not using thread and the [godot.HTTPClient] cannot connect to host.
   */
  @JvmOverloads
  public fun requestRaw(
    url: String,
    customHeaders: PackedStringArray = PackedStringArray(),
    method: HTTPClient.Method = HTTPClient.Method.METHOD_GET,
    requestDataRaw: PackedByteArray = PackedByteArray(),
  ): GodotError {
    TransferContext.writeArguments(STRING to url, PACKED_STRING_ARRAY to customHeaders, LONG to method.id, PACKED_BYTE_ARRAY to requestDataRaw)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_REQUEST_RAW, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Cancels the current request.
   */
  public fun cancelRequest(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_CANCEL_REQUEST, NIL)
  }

  /**
   * Sets the [godot.TLSOptions] to be used when connecting to an HTTPS server. See [godot.TLSOptions.client].
   */
  public fun setTlsOptions(clientOptions: TLSOptions): Unit {
    TransferContext.writeArguments(OBJECT to clientOptions)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_TLS_OPTIONS, NIL)
  }

  /**
   * Returns the current status of the underlying [godot.HTTPClient]. See [enum HTTPClient.Status].
   */
  public fun getHttpClientStatus(): HTTPClient.Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_HTTP_CLIENT_STATUS,
        LONG)
    return HTTPClient.Status.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Returns the number of bytes this HTTPRequest downloaded.
   */
  public fun getDownloadedBytes(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_DOWNLOADED_BYTES,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the response body length.
   *
   * **Note:** Some Web servers may not send a body length. In this case, the value returned will be `-1`. If using chunked transfer encoding, the body length will also be `-1`.
   */
  public fun getBodySize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_BODY_SIZE, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the proxy server for HTTP requests.
   *
   * The proxy server is unset if [host] is empty or [port] is -1.
   */
  public fun setHttpProxy(host: String, port: Int): Unit {
    TransferContext.writeArguments(STRING to host, LONG to port.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_HTTP_PROXY, NIL)
  }

  /**
   * Sets the proxy server for HTTPS requests.
   *
   * The proxy server is unset if [host] is empty or [port] is -1.
   */
  public fun setHttpsProxy(host: String, port: Int): Unit {
    TransferContext.writeArguments(STRING to host, LONG to port.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_HTTPS_PROXY, NIL)
  }

  public enum class Result(
    id: Long,
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
    /**
     *
     */
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
     * Request failed due to a timeout. If you expect requests to take a long time, try increasing the value of [timeout] or setting it to `0.0` to remove the timeout completely.
     */
    RESULT_TIMEOUT(13),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
