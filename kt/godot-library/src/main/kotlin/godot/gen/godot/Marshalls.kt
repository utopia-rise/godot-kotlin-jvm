// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.PACKED_BYTE_ARRAY
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
    rawPtr = TransferContext.getSingleton(ENGINECLASS_MARSHALLS)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Returns a Base64-encoded string of the [Variant] `variant`. If `full_objects` is `true`, encoding objects is allowed (and can potentially include code).
   */
  public fun variantToBase64(variant: Any, fullObjects: Boolean = false): String {
    TransferContext.writeArguments(ANY to variant, BOOL to fullObjects)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MARSHALLS_VARIANT_TO_BASE64,
        STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns a decoded [Variant] corresponding to the Base64-encoded string `base64_str`. If `allow_objects` is `true`, decoding objects is allowed.
   *
   * **Warning:** Deserialized objects can contain code which gets executed. Do not use this option if the serialized object comes from untrusted sources to avoid potential security threats such as remote code execution.
   */
  public fun base64ToVariant(base64Str: String, allowObjects: Boolean = false): Any? {
    TransferContext.writeArguments(STRING to base64Str, BOOL to allowObjects)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MARSHALLS_BASE64_TO_VARIANT, ANY.ordinal)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns a Base64-encoded string of a given [godot.PackedByteArray].
   */
  public fun rawToBase64(array: PackedByteArray): String {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to array)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MARSHALLS_RAW_TO_BASE64, STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns a decoded [godot.PackedByteArray] corresponding to the Base64-encoded string `base64_str`.
   */
  public fun base64ToRaw(base64Str: String): PackedByteArray {
    TransferContext.writeArguments(STRING to base64Str)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MARSHALLS_BASE64_TO_RAW,
        PACKED_BYTE_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  /**
   * Returns a Base64-encoded string of the UTF-8 string `utf8_str`.
   */
  public fun utf8ToBase64(utf8Str: String): String {
    TransferContext.writeArguments(STRING to utf8Str)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MARSHALLS_UTF8_TO_BASE64, STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns a decoded string corresponding to the Base64-encoded string `base64_str`.
   */
  public fun base64ToUtf8(base64Str: String): String {
    TransferContext.writeArguments(STRING to base64Str)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MARSHALLS_BASE64_TO_UTF8, STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }
}
