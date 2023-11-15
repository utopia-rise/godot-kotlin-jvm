// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * An X509 certificate (e.g. for TLS).
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/networking/ssl_certificates.html]($DOCS_URL/tutorials/networking/ssl_certificates.html)
 *
 * The X509Certificate class represents an X509 certificate. Certificates can be loaded and saved like any other [godot.Resource].
 *
 * They can be used as the server certificate in [godot.StreamPeerTLS.acceptStream] (along with the proper [godot.CryptoKey]), and to specify the only certificate that should be accepted when connecting to a TLS server via [godot.StreamPeerTLS.connectToStream].
 */
@GodotBaseType
public open class X509Certificate : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_X509CERTIFICATE, scriptIndex)
    return true
  }

  /**
   * Saves a certificate to the given [path] (should be a "*.crt" file).
   */
  public fun save(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_X509CERTIFICATE_SAVE, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Loads a certificate from [path] ("*.crt" file).
   */
  public fun load(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_X509CERTIFICATE_LOAD, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns a string representation of the certificate, or an empty string if the certificate is invalid.
   */
  public fun saveToString(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_X509CERTIFICATE_SAVE_TO_STRING,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Loads a certificate from the given [string].
   */
  public fun loadFromString(string: String): GodotError {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_X509CERTIFICATE_LOAD_FROM_STRING,
        LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object
}
