// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

/**
 * Data transformation (marshaling) and encoding helpers.
 *
 * Provides data transformation and encoding utility functions.
 */
@GodotBaseType
public object Marshalls : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_MARSHALLS)
    return false
  }

  /**
   * Returns a Base64-encoded string of the [Variant] [variant]. If [fullObjects] is `true`, encoding objects is allowed (and can potentially include code).
   *
   * Internally, this uses the same encoding mechanism as the [@GlobalScope.varToBytes] method.
   */
  @JvmOverloads
  public fun variantToBase64(variant: Any?, fullObjects: Boolean = false): String {
    TransferContext.writeArguments(ANY to variant, BOOL to fullObjects)
    TransferContext.callMethod(rawPtr, MethodBindings.variantToBase64Ptr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns a decoded [Variant] corresponding to the Base64-encoded string [base64Str]. If [allowObjects] is `true`, decoding objects is allowed.
   *
   * Internally, this uses the same decoding mechanism as the [@GlobalScope.bytesToVar] method.
   *
   * **Warning:** Deserialized objects can contain code which gets executed. Do not use this option if the serialized object comes from untrusted sources to avoid potential security threats such as remote code execution.
   */
  @JvmOverloads
  public fun base64ToVariant(base64Str: String, allowObjects: Boolean = false): Any? {
    TransferContext.writeArguments(STRING to base64Str, BOOL to allowObjects)
    TransferContext.callMethod(rawPtr, MethodBindings.base64ToVariantPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns a Base64-encoded string of a given [godot.PackedByteArray].
   */
  public fun rawToBase64(array: PackedByteArray): String {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to array)
    TransferContext.callMethod(rawPtr, MethodBindings.rawToBase64Ptr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns a decoded [godot.PackedByteArray] corresponding to the Base64-encoded string [base64Str].
   */
  public fun base64ToRaw(base64Str: String): PackedByteArray {
    TransferContext.writeArguments(STRING to base64Str)
    TransferContext.callMethod(rawPtr, MethodBindings.base64ToRawPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  /**
   * Returns a Base64-encoded string of the UTF-8 string [utf8Str].
   */
  public fun utf8ToBase64(utf8Str: String): String {
    TransferContext.writeArguments(STRING to utf8Str)
    TransferContext.callMethod(rawPtr, MethodBindings.utf8ToBase64Ptr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns a decoded string corresponding to the Base64-encoded string [base64Str].
   */
  public fun base64ToUtf8(base64Str: String): String {
    TransferContext.writeArguments(STRING to base64Str)
    TransferContext.callMethod(rawPtr, MethodBindings.base64ToUtf8Ptr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  internal object MethodBindings {
    public val variantToBase64Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("Marshalls", "variant_to_base64")

    public val base64ToVariantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Marshalls", "base64_to_variant")

    public val rawToBase64Ptr: VoidPtr = TypeManager.getMethodBindPtr("Marshalls", "raw_to_base64")

    public val base64ToRawPtr: VoidPtr = TypeManager.getMethodBindPtr("Marshalls", "base64_to_raw")

    public val utf8ToBase64Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("Marshalls", "utf8_to_base64")

    public val base64ToUtf8Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("Marshalls", "base64_to_utf8")
  }
}
