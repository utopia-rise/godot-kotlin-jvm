// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

/**
 * TLS configuration for clients and servers.
 *
 * TLSOptions abstracts the configuration options for the [godot.StreamPeerTLS] and [godot.PacketPeerDTLS] classes.
 *
 * Objects of this class cannot be instantiated directly, and one of the static methods [client], [clientUnsafe], or [server] should be used instead.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * # Create a TLS client configuration which uses our custom trusted CA chain.
 *
 * var client_trusted_cas = load("res://my_trusted_cas.crt")
 *
 * var client_tls_options = TLSOptions.client(client_trusted_cas)
 *
 *
 *
 * # Create a TLS server configuration.
 *
 * var server_certs = load("res://my_server_cas.crt")
 *
 * var server_key = load("res://my_server_key.key")
 *
 * var server_tls_options = TLSOptions.server(server_key, server_certs)
 *
 * [/gdscript]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class TLSOptions internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TLSOPTIONS, scriptIndex)
    return true
  }

  public companion object {
    /**
     * Creates a TLS client configuration which validates certificates and their common names (fully qualified domain names).
     *
     * You can specify a custom [trustedChain] of certification authorities (the default CA list will be used if `null`), and optionally provide a [commonNameOverride] if you expect the certificate to have a common name other then the server FQDN.
     *
     * Note: On the Web plafrom, TLS verification is always enforced against the CA list of the web browser. This is considered a security feature.
     */
    @JvmOverloads
    public fun client(trustedChain: X509Certificate? = null, commonNameOverride: String = ""):
        TLSOptions? {
      TransferContext.writeArguments(OBJECT to trustedChain, STRING to commonNameOverride)
      TransferContext.callMethod(0, ENGINEMETHOD_ENGINECLASS_TLSOPTIONS_CLIENT, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as TLSOptions?)
    }

    /**
     * Creates an **unsafe** TLS client configuration where certificate validation is optional. You can optionally provide a valid [trustedChain], but the common name of the certififcates will never be checked. Using this configuration for purposes other than testing **is not recommended**.
     *
     * Note: On the Web plafrom, TLS verification is always enforced against the CA list of the web browser. This is considered a security feature.
     */
    @JvmOverloads
    public fun clientUnsafe(trustedChain: X509Certificate? = null): TLSOptions? {
      TransferContext.writeArguments(OBJECT to trustedChain)
      TransferContext.callMethod(0, ENGINEMETHOD_ENGINECLASS_TLSOPTIONS_CLIENT_UNSAFE, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as TLSOptions?)
    }

    /**
     * Creates a TLS server configuration using the provided [key] and [certificate].
     *
     * Note: The [certificate] should include the full certificate chain up to the signing CA (certificates file can be concatenated using a general purpose text editor).
     */
    public fun server(key: CryptoKey, certificate: X509Certificate): TLSOptions? {
      TransferContext.writeArguments(OBJECT to key, OBJECT to certificate)
      TransferContext.callMethod(0, ENGINEMETHOD_ENGINECLASS_TLSOPTIONS_SERVER, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as TLSOptions?)
    }
  }
}
