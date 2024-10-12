// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.LONG
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_X509CERTIFICATE_INDEX: Int = 834

/**
 * The X509Certificate class represents an X509 certificate. Certificates can be loaded and saved
 * like any other [Resource].
 * They can be used as the server certificate in [StreamPeerTLS.acceptStream] (along with the proper
 * [CryptoKey]), and to specify the only certificate that should be accepted when connecting to a TLS
 * server via [StreamPeerTLS.connectToStream].
 */
@GodotBaseType
public open class X509Certificate : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_X509CERTIFICATE_INDEX, scriptIndex)
  }

  /**
   * Saves a certificate to the given [path] (should be a "*.crt" file).
   */
  public final fun save(path: String): Error {
    Internals.writeArguments(STRING to path)
    Internals.callMethod(rawPtr, MethodBindings.savePtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Loads a certificate from [path] ("*.crt" file).
   */
  public final fun load(path: String): Error {
    Internals.writeArguments(STRING to path)
    Internals.callMethod(rawPtr, MethodBindings.loadPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns a string representation of the certificate, or an empty string if the certificate is
   * invalid.
   */
  public final fun saveToString(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.saveToStringPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Loads a certificate from the given [string].
   */
  public final fun loadFromString(string: String): Error {
    Internals.writeArguments(STRING to string)
    Internals.callMethod(rawPtr, MethodBindings.loadFromStringPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  public companion object

  public object MethodBindings {
    internal val savePtr: VoidPtr = Internals.getMethodBindPtr("X509Certificate", "save", 166001499)

    internal val loadPtr: VoidPtr = Internals.getMethodBindPtr("X509Certificate", "load", 166001499)

    internal val saveToStringPtr: VoidPtr =
        Internals.getMethodBindPtr("X509Certificate", "save_to_string", 2841200299)

    internal val loadFromStringPtr: VoidPtr =
        Internals.getMethodBindPtr("X509Certificate", "load_from_string", 166001499)
  }
}
