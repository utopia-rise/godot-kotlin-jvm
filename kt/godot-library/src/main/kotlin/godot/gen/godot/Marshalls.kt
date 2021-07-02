// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolByteArray
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Data transformation (marshalling) and encoding helpers.
 *
 * Provides data transformation and encoding utility functions.
 */
@GodotBaseType
public object Marshalls : Object() {
  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_MARSHALLS)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Returns a decoded [godot.core.PoolByteArray] corresponding to the Base64-encoded string `base64_str`.
   */
  public fun base64ToRaw(base64Str: String): PoolByteArray {
    TransferContext.writeArguments(STRING to base64Str)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__MARSHALLS_BASE64_TO_RAW,
        POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  /**
   * Returns a decoded string corresponding to the Base64-encoded string `base64_str`.
   */
  public fun base64ToUtf8(base64Str: String): String {
    TransferContext.writeArguments(STRING to base64Str)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__MARSHALLS_BASE64_TO_UTF8, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns a decoded [Variant] corresponding to the Base64-encoded string `base64_str`. If `allow_objects` is `true`, decoding objects is allowed.
   *
   * **Warning:** Deserialized objects can contain code which gets executed. Do not use this option if the serialized object comes from untrusted sources to avoid potential security threats such as remote code execution.
   */
  public fun base64ToVariant(base64Str: String, allowObjects: Boolean = false): Any? {
    TransferContext.writeArguments(STRING to base64Str, BOOL to allowObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__MARSHALLS_BASE64_TO_VARIANT, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns a Base64-encoded string of a given [godot.core.PoolByteArray].
   */
  public fun rawToBase64(array: PoolByteArray): String {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to array)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__MARSHALLS_RAW_TO_BASE64, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns a Base64-encoded string of the UTF-8 string `utf8_str`.
   */
  public fun utf8ToBase64(utf8Str: String): String {
    TransferContext.writeArguments(STRING to utf8Str)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__MARSHALLS_UTF8_TO_BASE64, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns a Base64-encoded string of the [Variant] `variant`. If `full_objects` is `true`, encoding objects is allowed (and can potentially include code).
   */
  public fun variantToBase64(variant: Any?, fullObjects: Boolean = false): String {
    TransferContext.writeArguments(ANY to variant, BOOL to fullObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__MARSHALLS_VARIANT_TO_BASE64,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }
}
