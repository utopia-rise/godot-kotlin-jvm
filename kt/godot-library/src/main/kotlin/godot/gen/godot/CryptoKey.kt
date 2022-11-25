// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A cryptographic key (RSA).
 *
 * The CryptoKey class represents a cryptographic key. Keys can be loaded and saved like any other [godot.Resource].
 *
 * They can be used to generate a self-signed [godot.X509Certificate] via [godot.Crypto.generateSelfSignedCertificate] and as private key in [godot.StreamPeerTLS.acceptStream] along with the appropriate certificate.
 */
@GodotBaseType
public open class CryptoKey : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CRYPTOKEY)
  }

  /**
   * Saves a key to the given [path]. If [publicOnly] is `true`, only the public key will be saved.
   *
   * **Note:** [path] should be a "*.pub" file if [publicOnly] is `true`, a "*.key" file otherwise.
   */
  public fun save(path: String, publicOnly: Boolean = false): GodotError {
    TransferContext.writeArguments(STRING to path, BOOL to publicOnly)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTOKEY_SAVE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Loads a key from [path]. If [publicOnly] is `true`, only the public key will be loaded.
   *
   * **Note:** [path] should be a "*.pub" file if [publicOnly] is `true`, a "*.key" file otherwise.
   */
  public fun load(path: String, publicOnly: Boolean = false): GodotError {
    TransferContext.writeArguments(STRING to path, BOOL to publicOnly)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTOKEY_LOAD, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns `true` if this CryptoKey only has the public part, and not the private one.
   */
  public fun isPublicOnly(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTOKEY_IS_PUBLIC_ONLY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns a string containing the key in PEM format. If [publicOnly] is `true`, only the public key will be included.
   */
  public fun saveToString(publicOnly: Boolean = false): String {
    TransferContext.writeArguments(BOOL to publicOnly)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTOKEY_SAVE_TO_STRING, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Loads a key from the given [stringKey]. If [publicOnly] is `true`, only the public key will be loaded.
   */
  public fun loadFromString(stringKey: String, publicOnly: Boolean = false): GodotError {
    TransferContext.writeArguments(STRING to stringKey, BOOL to publicOnly)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CRYPTOKEY_LOAD_FROM_STRING, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public companion object
}
