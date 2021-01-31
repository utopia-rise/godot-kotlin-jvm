// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolByteArray
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress

@GodotBaseType
object Marshalls : Object() {
  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINECLASS__MARSHALLS)

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  fun base64ToRaw(base64Str: String): PoolByteArray {
    TransferContext.writeArguments(STRING to base64Str)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__MARSHALLS_BASE64_TO_RAW,
        POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  fun base64ToUtf8(base64Str: String): String {
    TransferContext.writeArguments(STRING to base64Str)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__MARSHALLS_BASE64_TO_UTF8, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun base64ToVariant(base64Str: String, allowObjects: Boolean = false): Any? {
    TransferContext.writeArguments(STRING to base64Str, BOOL to allowObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__MARSHALLS_BASE64_TO_VARIANT, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  fun rawToBase64(array: PoolByteArray): String {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to array)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__MARSHALLS_RAW_TO_BASE64, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun utf8ToBase64(utf8Str: String): String {
    TransferContext.writeArguments(STRING to utf8Str)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__MARSHALLS_UTF8_TO_BASE64, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun variantToBase64(variant: Any, fullObjects: Boolean = false): String {
    TransferContext.writeArguments(ANY to variant, BOOL to fullObjects)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__MARSHALLS_VARIANT_TO_BASE64,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }
}
