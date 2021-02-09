// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.HTTPClient
import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.signals.Signal4
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class HTTPRequest : Node() {
  val requestCompleted: Signal4<Long, Long, PoolStringArray, PoolByteArray> by signal("result",
      "response_code", "headers", "body")

  open var bodySizeLimit: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_BODY_SIZE_LIMIT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_BODY_SIZE_LIMIT,
          NIL)
    }

  open var downloadChunkSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_DOWNLOAD_CHUNK_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_DOWNLOAD_CHUNK_SIZE, NIL)
    }

  open var downloadFile: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_DOWNLOAD_FILE,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_DOWNLOAD_FILE,
          NIL)
    }

  open var maxRedirects: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_MAX_REDIRECTS,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_MAX_REDIRECTS,
          NIL)
    }

  open var timeout: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_TIMEOUT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_TIMEOUT, NIL)
    }

  open var useThreads: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_USE_THREADS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_SET_USE_THREADS, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_HTTPREQUEST)

  open fun _redirectRequest(arg0: String) {
  }

  open fun _requestDone(
    arg0: Long,
    arg1: Long,
    arg2: PoolStringArray,
    arg3: PoolByteArray
  ) {
  }

  open fun _timeout() {
  }

  open fun cancelRequest() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_CANCEL_REQUEST, NIL)
  }

  open fun getBodySize(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_BODY_SIZE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getDownloadedBytes(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_DOWNLOADED_BYTES,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getHttpClientStatus(): HTTPClient.Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HTTPREQUEST_GET_HTTP_CLIENT_STATUS,
        LONG)
    return HTTPClient.Status.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun request(
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

  enum class Result(
    id: Long
  ) {
    RESULT_SUCCESS(0),

    RESULT_CHUNKED_BODY_SIZE_MISMATCH(1),

    RESULT_CANT_CONNECT(2),

    RESULT_CANT_RESOLVE(3),

    RESULT_CONNECTION_ERROR(4),

    RESULT_SSL_HANDSHAKE_ERROR(5),

    RESULT_NO_RESPONSE(6),

    RESULT_BODY_SIZE_LIMIT_EXCEEDED(7),

    RESULT_REQUEST_FAILED(8),

    RESULT_DOWNLOAD_FILE_CANT_OPEN(9),

    RESULT_DOWNLOAD_FILE_WRITE_ERROR(10),

    RESULT_REDIRECT_LIMIT_REACHED(11),

    RESULT_TIMEOUT(12);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val RESULT_BODY_SIZE_LIMIT_EXCEEDED: Long = 7

    final const val RESULT_CANT_CONNECT: Long = 2

    final const val RESULT_CANT_RESOLVE: Long = 3

    final const val RESULT_CHUNKED_BODY_SIZE_MISMATCH: Long = 1

    final const val RESULT_CONNECTION_ERROR: Long = 4

    final const val RESULT_DOWNLOAD_FILE_CANT_OPEN: Long = 9

    final const val RESULT_DOWNLOAD_FILE_WRITE_ERROR: Long = 10

    final const val RESULT_NO_RESPONSE: Long = 6

    final const val RESULT_REDIRECT_LIMIT_REACHED: Long = 11

    final const val RESULT_REQUEST_FAILED: Long = 8

    final const val RESULT_SSL_HANDSHAKE_ERROR: Long = 5

    final const val RESULT_SUCCESS: Long = 0

    final const val RESULT_TIMEOUT: Long = 12
  }
}
