// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

private const val ENGINE_CLASS_MARSHALLS_INDEX: Int = 16

/**
 * Provides data transformation and encoding utility functions.
 */
@GodotBaseType
public object Marshalls : Object() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.getSingleton(this, ENGINE_CLASS_MARSHALLS_INDEX)
  }

  /**
   * Returns a Base64-encoded string of the [Variant] [variant]. If [fullObjects] is `true`,
   * encoding objects is allowed (and can potentially include code).
   * Internally, this uses the same encoding mechanism as the [@GlobalScope.varToBytes] method.
   */
  @JvmOverloads
  @JvmStatic
  public final fun variantToBase64(variant: Any?, fullObjects: Boolean = false): String {
    Internals.writeArguments(ANY to variant, BOOL to fullObjects)
    Internals.callMethod(rawPtr, MethodBindings.variantToBase64Ptr, STRING)
    return (Internals.readReturnValue(STRING) as String)
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
    Internals.writeArguments(STRING to base64Str, BOOL to allowObjects)
    Internals.callMethod(rawPtr, MethodBindings.base64ToVariantPtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns a Base64-encoded string of a given [PackedByteArray].
   */
  @JvmStatic
  public final fun rawToBase64(array: PackedByteArray): String {
    Internals.writeArguments(PACKED_BYTE_ARRAY to array)
    Internals.callMethod(rawPtr, MethodBindings.rawToBase64Ptr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns a decoded [PackedByteArray] corresponding to the Base64-encoded string [base64Str].
   */
  @JvmStatic
  public final fun base64ToRaw(base64Str: String): PackedByteArray {
    Internals.writeArguments(STRING to base64Str)
    Internals.callMethod(rawPtr, MethodBindings.base64ToRawPtr, PACKED_BYTE_ARRAY)
    return (Internals.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Returns a Base64-encoded string of the UTF-8 string [utf8Str].
   */
  @JvmStatic
  public final fun utf8ToBase64(utf8Str: String): String {
    Internals.writeArguments(STRING to utf8Str)
    Internals.callMethod(rawPtr, MethodBindings.utf8ToBase64Ptr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns a decoded string corresponding to the Base64-encoded string [base64Str].
   */
  @JvmStatic
  public final fun base64ToUtf8(base64Str: String): String {
    Internals.writeArguments(STRING to base64Str)
    Internals.callMethod(rawPtr, MethodBindings.base64ToUtf8Ptr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public object MethodBindings {
    internal val variantToBase64Ptr: VoidPtr =
        Internals.getMethodBindPtr("Marshalls", "variant_to_base64", 3876248563)

    internal val base64ToVariantPtr: VoidPtr =
        Internals.getMethodBindPtr("Marshalls", "base64_to_variant", 218087648)

    internal val rawToBase64Ptr: VoidPtr =
        Internals.getMethodBindPtr("Marshalls", "raw_to_base64", 3999417757)

    internal val base64ToRawPtr: VoidPtr =
        Internals.getMethodBindPtr("Marshalls", "base64_to_raw", 659035735)

    internal val utf8ToBase64Ptr: VoidPtr =
        Internals.getMethodBindPtr("Marshalls", "utf8_to_base64", 1703090593)

    internal val base64ToUtf8Ptr: VoidPtr =
        Internals.getMethodBindPtr("Marshalls", "base64_to_utf8", 1703090593)
  }
}
