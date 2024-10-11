// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_CRYPTOKEY_INDEX: Int = 213

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
    Internals.callConstructor(this, ENGINE_CLASS_CRYPTOKEY_INDEX, scriptIndex)
  }

  /**
   * Saves a key to the given [path]. If [publicOnly] is `true`, only the public key will be saved.
   * **Note:** [path] should be a "*.pub" file if [publicOnly] is `true`, a "*.key" file otherwise.
   */
  @JvmOverloads
  public final fun save(path: String, publicOnly: Boolean = false): Error {
    Internals.writeArguments(STRING to path, BOOL to publicOnly)
    Internals.callMethod(rawPtr, MethodBindings.savePtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Loads a key from [path]. If [publicOnly] is `true`, only the public key will be loaded.
   * **Note:** [path] should be a "*.pub" file if [publicOnly] is `true`, a "*.key" file otherwise.
   */
  @JvmOverloads
  public final fun load(path: String, publicOnly: Boolean = false): Error {
    Internals.writeArguments(STRING to path, BOOL to publicOnly)
    Internals.callMethod(rawPtr, MethodBindings.loadPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if this CryptoKey only has the public part, and not the private one.
   */
  public final fun isPublicOnly(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isPublicOnlyPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns a string containing the key in PEM format. If [publicOnly] is `true`, only the public
   * key will be included.
   */
  @JvmOverloads
  public final fun saveToString(publicOnly: Boolean = false): String {
    Internals.writeArguments(BOOL to publicOnly)
    Internals.callMethod(rawPtr, MethodBindings.saveToStringPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Loads a key from the given [stringKey]. If [publicOnly] is `true`, only the public key will be
   * loaded.
   */
  @JvmOverloads
  public final fun loadFromString(stringKey: String, publicOnly: Boolean = false): Error {
    Internals.writeArguments(STRING to stringKey, BOOL to publicOnly)
    Internals.callMethod(rawPtr, MethodBindings.loadFromStringPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  public companion object

  public object MethodBindings {
    internal val savePtr: VoidPtr = Internals.getMethodBindPtr("CryptoKey", "save", 885841341)

    internal val loadPtr: VoidPtr = Internals.getMethodBindPtr("CryptoKey", "load", 885841341)

    internal val isPublicOnlyPtr: VoidPtr =
        Internals.getMethodBindPtr("CryptoKey", "is_public_only", 36873697)

    internal val saveToStringPtr: VoidPtr =
        Internals.getMethodBindPtr("CryptoKey", "save_to_string", 32795936)

    internal val loadFromStringPtr: VoidPtr =
        Internals.getMethodBindPtr("CryptoKey", "load_from_string", 885841341)
  }
}
