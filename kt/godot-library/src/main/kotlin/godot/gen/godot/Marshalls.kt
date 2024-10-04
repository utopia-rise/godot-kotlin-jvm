// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Provides data transformation and encoding utility functions.
 */
@GodotBaseType
public object Marshalls : Object() {
  public override fun new(scriptIndex: Int): Unit {
    getSingleton(ENGINECLASS_MARSHALLS)
  }

  /**
   * Returns a Base64-encoded string of the [Variant] [variant]. If [fullObjects] is `true`,
   * encoding objects is allowed (and can potentially include code).
   * Internally, this uses the same encoding mechanism as the [@GlobalScope.varToBytes] method.
   */
  @JvmOverloads
  @JvmStatic
  public final fun variantToBase64(variant: Any?, fullObjects: Boolean = false): String {
    TransferContext.writeArguments(ANY to variant, BOOL to fullObjects)
    TransferContext.callMethod(rawPtr, MethodBindings.variantToBase64Ptr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns a decoded [Variant] corresponding to the Base64-encoded string [base64Str]. If
   * [allowObjects] is `true`, decoding objects is allowed.
   * Internally, this uses the same decoding mechanism as the [@GlobalScope.bytesToVar] method.
   * **Warning:** Deserialized objects can contain code which gets executed. Do not use this option
   * if the serialized object comes from untrusted sources to avoid potential security threats such as
   * remote code execution.
   */
  @JvmOverloads
  @JvmStatic
  public final fun base64ToVariant(base64Str: String, allowObjects: Boolean = false): Any? {
    TransferContext.writeArguments(STRING to base64Str, BOOL to allowObjects)
    TransferContext.callMethod(rawPtr, MethodBindings.base64ToVariantPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns a Base64-encoded string of a given [PackedByteArray].
   */
  @JvmStatic
  public final fun rawToBase64(array: PackedByteArray): String {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to array)
    TransferContext.callMethod(rawPtr, MethodBindings.rawToBase64Ptr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns a decoded [PackedByteArray] corresponding to the Base64-encoded string [base64Str].
   */
  @JvmStatic
  public final fun base64ToRaw(base64Str: String): PackedByteArray {
    TransferContext.writeArguments(STRING to base64Str)
    TransferContext.callMethod(rawPtr, MethodBindings.base64ToRawPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Returns a Base64-encoded string of the UTF-8 string [utf8Str].
   */
  @JvmStatic
  public final fun utf8ToBase64(utf8Str: String): String {
    TransferContext.writeArguments(STRING to utf8Str)
    TransferContext.callMethod(rawPtr, MethodBindings.utf8ToBase64Ptr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns a decoded string corresponding to the Base64-encoded string [base64Str].
   */
  @JvmStatic
  public final fun base64ToUtf8(base64Str: String): String {
    TransferContext.writeArguments(STRING to base64Str)
    TransferContext.callMethod(rawPtr, MethodBindings.base64ToUtf8Ptr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  internal object MethodBindings {
    public val variantToBase64Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("Marshalls", "variant_to_base64", 3876248563)

    public val base64ToVariantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Marshalls", "base64_to_variant", 218087648)

    public val rawToBase64Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("Marshalls", "raw_to_base64", 3999417757)

    public val base64ToRawPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Marshalls", "base64_to_raw", 659035735)

    public val utf8ToBase64Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("Marshalls", "utf8_to_base64", 1703090593)

    public val base64ToUtf8Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("Marshalls", "base64_to_utf8", 1703090593)
  }
}
