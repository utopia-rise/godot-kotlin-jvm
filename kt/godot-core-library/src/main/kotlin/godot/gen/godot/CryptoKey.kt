// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * The CryptoKey class represents a cryptographic key. Keys can be loaded and saved like any other
 * [Resource].
 * They can be used to generate a self-signed [X509Certificate] via
 * [Crypto.generateSelfSignedCertificate] and as private key in [StreamPeerTLS.acceptStream] along with
 * the appropriate certificate.
 */
@GodotBaseType
public open class CryptoKey : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_CRYPTOKEY, scriptIndex)
  }

  /**
   * Saves a key to the given [path]. If [publicOnly] is `true`, only the public key will be saved.
   * **Note:** [path] should be a "*.pub" file if [publicOnly] is `true`, a "*.key" file otherwise.
   */
  @JvmOverloads
  public final fun save(path: String, publicOnly: Boolean = false): Error {
    TransferContext.writeArguments(STRING to path, BOOL to publicOnly)
    TransferContext.callMethod(ptr, MethodBindings.savePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Loads a key from [path]. If [publicOnly] is `true`, only the public key will be loaded.
   * **Note:** [path] should be a "*.pub" file if [publicOnly] is `true`, a "*.key" file otherwise.
   */
  @JvmOverloads
  public final fun load(path: String, publicOnly: Boolean = false): Error {
    TransferContext.writeArguments(STRING to path, BOOL to publicOnly)
    TransferContext.callMethod(ptr, MethodBindings.loadPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if this CryptoKey only has the public part, and not the private one.
   */
  public final fun isPublicOnly(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPublicOnlyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns a string containing the key in PEM format. If [publicOnly] is `true`, only the public
   * key will be included.
   */
  @JvmOverloads
  public final fun saveToString(publicOnly: Boolean = false): String {
    TransferContext.writeArguments(BOOL to publicOnly)
    TransferContext.callMethod(ptr, MethodBindings.saveToStringPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Loads a key from the given [stringKey]. If [publicOnly] is `true`, only the public key will be
   * loaded.
   */
  @JvmOverloads
  public final fun loadFromString(stringKey: String, publicOnly: Boolean = false): Error {
    TransferContext.writeArguments(STRING to stringKey, BOOL to publicOnly)
    TransferContext.callMethod(ptr, MethodBindings.loadFromStringPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val savePtr: VoidPtr = TypeManager.getMethodBindPtr("CryptoKey", "save", 885841341)

    public val loadPtr: VoidPtr = TypeManager.getMethodBindPtr("CryptoKey", "load", 885841341)

    public val isPublicOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CryptoKey", "is_public_only", 36873697)

    public val saveToStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CryptoKey", "save_to_string", 32795936)

    public val loadFromStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CryptoKey", "load_from_string", 885841341)
  }
}
