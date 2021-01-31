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

@GodotBaseType
open class HTTPClient : Reference() {
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

  open fun close() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_CLOSE, NIL)
  }

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

  open fun getResponseBodyLength(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_GET_RESPONSE_BODY_LENGTH,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getResponseCode(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_GET_RESPONSE_CODE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getResponseHeaders(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_GET_RESPONSE_HEADERS,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  open fun getResponseHeadersAsDictionary(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_GET_RESPONSE_HEADERS_AS_DICTIONARY, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  open fun getStatus(): HTTPClient.Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_GET_STATUS, LONG)
    return HTTPClient.Status.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun hasResponse(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_HAS_RESPONSE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isResponseChunked(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_IS_RESPONSE_CHUNKED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun poll(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_POLL, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun queryStringFromDict(fields: Dictionary<Any?, Any?>): String {
    TransferContext.writeArguments(DICTIONARY to fields)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_QUERY_STRING_FROM_DICT,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun readResponseBodyChunk(): PoolByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPCLIENT_READ_RESPONSE_BODY_CHUNK,
        POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

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
    STATUS_DISCONNECTED(0),

    STATUS_RESOLVING(1),

    STATUS_CANT_RESOLVE(2),

    STATUS_CONNECTING(3),

    STATUS_CANT_CONNECT(4),

    STATUS_CONNECTED(5),

    STATUS_REQUESTING(6),

    STATUS_BODY(7),

    STATUS_CONNECTION_ERROR(8),

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
    METHOD_GET(0),

    METHOD_HEAD(1),

    METHOD_POST(2),

    METHOD_PUT(3),

    METHOD_DELETE(4),

    METHOD_OPTIONS(5),

    METHOD_TRACE(6),

    METHOD_CONNECT(7),

    METHOD_PATCH(8),

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
    RESPONSE_CONTINUE(100),

    RESPONSE_SWITCHING_PROTOCOLS(101),

    RESPONSE_PROCESSING(102),

    RESPONSE_OK(200),

    RESPONSE_CREATED(201),

    RESPONSE_ACCEPTED(202),

    RESPONSE_NON_AUTHORITATIVE_INFORMATION(203),

    RESPONSE_NO_CONTENT(204),

    RESPONSE_RESET_CONTENT(205),

    RESPONSE_PARTIAL_CONTENT(206),

    RESPONSE_MULTI_STATUS(207),

    RESPONSE_ALREADY_REPORTED(208),

    RESPONSE_IM_USED(226),

    RESPONSE_MULTIPLE_CHOICES(300),

    RESPONSE_MOVED_PERMANENTLY(301),

    RESPONSE_FOUND(302),

    RESPONSE_SEE_OTHER(303),

    RESPONSE_NOT_MODIFIED(304),

    RESPONSE_USE_PROXY(305),

    RESPONSE_SWITCH_PROXY(306),

    RESPONSE_TEMPORARY_REDIRECT(307),

    RESPONSE_PERMANENT_REDIRECT(308),

    RESPONSE_BAD_REQUEST(400),

    RESPONSE_UNAUTHORIZED(401),

    RESPONSE_PAYMENT_REQUIRED(402),

    RESPONSE_FORBIDDEN(403),

    RESPONSE_NOT_FOUND(404),

    RESPONSE_METHOD_NOT_ALLOWED(405),

    RESPONSE_NOT_ACCEPTABLE(406),

    RESPONSE_PROXY_AUTHENTICATION_REQUIRED(407),

    RESPONSE_REQUEST_TIMEOUT(408),

    RESPONSE_CONFLICT(409),

    RESPONSE_GONE(410),

    RESPONSE_LENGTH_REQUIRED(411),

    RESPONSE_PRECONDITION_FAILED(412),

    RESPONSE_REQUEST_ENTITY_TOO_LARGE(413),

    RESPONSE_REQUEST_URI_TOO_LONG(414),

    RESPONSE_UNSUPPORTED_MEDIA_TYPE(415),

    RESPONSE_REQUESTED_RANGE_NOT_SATISFIABLE(416),

    RESPONSE_EXPECTATION_FAILED(417),

    RESPONSE_IM_A_TEAPOT(418),

    RESPONSE_MISDIRECTED_REQUEST(421),

    RESPONSE_UNPROCESSABLE_ENTITY(422),

    RESPONSE_LOCKED(423),

    RESPONSE_FAILED_DEPENDENCY(424),

    RESPONSE_UPGRADE_REQUIRED(426),

    RESPONSE_PRECONDITION_REQUIRED(428),

    RESPONSE_TOO_MANY_REQUESTS(429),

    RESPONSE_REQUEST_HEADER_FIELDS_TOO_LARGE(431),

    RESPONSE_UNAVAILABLE_FOR_LEGAL_REASONS(451),

    RESPONSE_INTERNAL_SERVER_ERROR(500),

    RESPONSE_NOT_IMPLEMENTED(501),

    RESPONSE_BAD_GATEWAY(502),

    RESPONSE_SERVICE_UNAVAILABLE(503),

    RESPONSE_GATEWAY_TIMEOUT(504),

    RESPONSE_HTTP_VERSION_NOT_SUPPORTED(505),

    RESPONSE_VARIANT_ALSO_NEGOTIATES(506),

    RESPONSE_INSUFFICIENT_STORAGE(507),

    RESPONSE_LOOP_DETECTED(508),

    RESPONSE_NOT_EXTENDED(510),

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
    final const val METHOD_CONNECT: Long = 7

    final const val METHOD_DELETE: Long = 4

    final const val METHOD_GET: Long = 0

    final const val METHOD_HEAD: Long = 1

    final const val METHOD_MAX: Long = 9

    final const val METHOD_OPTIONS: Long = 5

    final const val METHOD_PATCH: Long = 8

    final const val METHOD_POST: Long = 2

    final const val METHOD_PUT: Long = 3

    final const val METHOD_TRACE: Long = 6

    final const val RESPONSE_ACCEPTED: Long = 202

    final const val RESPONSE_ALREADY_REPORTED: Long = 208

    final const val RESPONSE_BAD_GATEWAY: Long = 502

    final const val RESPONSE_BAD_REQUEST: Long = 400

    final const val RESPONSE_CONFLICT: Long = 409

    final const val RESPONSE_CONTINUE: Long = 100

    final const val RESPONSE_CREATED: Long = 201

    final const val RESPONSE_EXPECTATION_FAILED: Long = 417

    final const val RESPONSE_FAILED_DEPENDENCY: Long = 424

    final const val RESPONSE_FORBIDDEN: Long = 403

    final const val RESPONSE_FOUND: Long = 302

    final const val RESPONSE_GATEWAY_TIMEOUT: Long = 504

    final const val RESPONSE_GONE: Long = 410

    final const val RESPONSE_HTTP_VERSION_NOT_SUPPORTED: Long = 505

    final const val RESPONSE_IM_A_TEAPOT: Long = 418

    final const val RESPONSE_IM_USED: Long = 226

    final const val RESPONSE_INSUFFICIENT_STORAGE: Long = 507

    final const val RESPONSE_INTERNAL_SERVER_ERROR: Long = 500

    final const val RESPONSE_LENGTH_REQUIRED: Long = 411

    final const val RESPONSE_LOCKED: Long = 423

    final const val RESPONSE_LOOP_DETECTED: Long = 508

    final const val RESPONSE_METHOD_NOT_ALLOWED: Long = 405

    final const val RESPONSE_MISDIRECTED_REQUEST: Long = 421

    final const val RESPONSE_MOVED_PERMANENTLY: Long = 301

    final const val RESPONSE_MULTIPLE_CHOICES: Long = 300

    final const val RESPONSE_MULTI_STATUS: Long = 207

    final const val RESPONSE_NETWORK_AUTH_REQUIRED: Long = 511

    final const val RESPONSE_NON_AUTHORITATIVE_INFORMATION: Long = 203

    final const val RESPONSE_NOT_ACCEPTABLE: Long = 406

    final const val RESPONSE_NOT_EXTENDED: Long = 510

    final const val RESPONSE_NOT_FOUND: Long = 404

    final const val RESPONSE_NOT_IMPLEMENTED: Long = 501

    final const val RESPONSE_NOT_MODIFIED: Long = 304

    final const val RESPONSE_NO_CONTENT: Long = 204

    final const val RESPONSE_OK: Long = 200

    final const val RESPONSE_PARTIAL_CONTENT: Long = 206

    final const val RESPONSE_PAYMENT_REQUIRED: Long = 402

    final const val RESPONSE_PERMANENT_REDIRECT: Long = 308

    final const val RESPONSE_PRECONDITION_FAILED: Long = 412

    final const val RESPONSE_PRECONDITION_REQUIRED: Long = 428

    final const val RESPONSE_PROCESSING: Long = 102

    final const val RESPONSE_PROXY_AUTHENTICATION_REQUIRED: Long = 407

    final const val RESPONSE_REQUESTED_RANGE_NOT_SATISFIABLE: Long = 416

    final const val RESPONSE_REQUEST_ENTITY_TOO_LARGE: Long = 413

    final const val RESPONSE_REQUEST_HEADER_FIELDS_TOO_LARGE: Long = 431

    final const val RESPONSE_REQUEST_TIMEOUT: Long = 408

    final const val RESPONSE_REQUEST_URI_TOO_LONG: Long = 414

    final const val RESPONSE_RESET_CONTENT: Long = 205

    final const val RESPONSE_SEE_OTHER: Long = 303

    final const val RESPONSE_SERVICE_UNAVAILABLE: Long = 503

    final const val RESPONSE_SWITCHING_PROTOCOLS: Long = 101

    final const val RESPONSE_SWITCH_PROXY: Long = 306

    final const val RESPONSE_TEMPORARY_REDIRECT: Long = 307

    final const val RESPONSE_TOO_MANY_REQUESTS: Long = 429

    final const val RESPONSE_UNAUTHORIZED: Long = 401

    final const val RESPONSE_UNAVAILABLE_FOR_LEGAL_REASONS: Long = 451

    final const val RESPONSE_UNPROCESSABLE_ENTITY: Long = 422

    final const val RESPONSE_UNSUPPORTED_MEDIA_TYPE: Long = 415

    final const val RESPONSE_UPGRADE_REQUIRED: Long = 426

    final const val RESPONSE_USE_PROXY: Long = 305

    final const val RESPONSE_VARIANT_ALSO_NEGOTIATES: Long = 506

    final const val STATUS_BODY: Long = 7

    final const val STATUS_CANT_CONNECT: Long = 4

    final const val STATUS_CANT_RESOLVE: Long = 2

    final const val STATUS_CONNECTED: Long = 5

    final const val STATUS_CONNECTING: Long = 3

    final const val STATUS_CONNECTION_ERROR: Long = 8

    final const val STATUS_DISCONNECTED: Long = 0

    final const val STATUS_REQUESTING: Long = 6

    final const val STATUS_RESOLVING: Long = 1

    final const val STATUS_SSL_HANDSHAKE_ERROR: Long = 9
  }
}
