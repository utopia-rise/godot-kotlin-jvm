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
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * TLSOptions abstracts the configuration options for the [StreamPeerTLS] and [PacketPeerDTLS]
 * classes.
 * Objects of this class cannot be instantiated directly, and one of the static methods [client],
 * [clientUnsafe], or [server] should be used instead.
 *
 * gdscript:
 * ```gdscript
 * # Create a TLS client configuration which uses our custom trusted CA chain.
 * var client_trusted_cas = load("res://my_trusted_cas.crt")
 * var client_tls_options = TLSOptions.client(client_trusted_cas)
 *
 * # Create a TLS server configuration.
 * var server_certs = load("res://my_server_cas.crt")
 * var server_key = load("res://my_server_key.key")
 * var server_tls_options = TLSOptions.server(server_key, server_certs)
 * ```
 */
@GodotBaseType
public open class TLSOptions internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_TLSOPTIONS, scriptIndex)
  }

  /**
   * Returns `true` if created with [TLSOptions.server], `false` otherwise.
   */
  public final fun isServer(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isServerPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if created with [TLSOptions.clientUnsafe], `false` otherwise.
   */
  public final fun isUnsafeClient(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUnsafeClientPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the common name (domain name) override specified when creating with
   * [TLSOptions.client].
   */
  public final fun getCommonNameOverride(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCommonNameOverridePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the CA [X509Certificate] chain specified when creating with [TLSOptions.client] or
   * [TLSOptions.clientUnsafe].
   */
  public final fun getTrustedCaChain(): X509Certificate? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTrustedCaChainPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as X509Certificate?)
  }

  /**
   * Returns the [CryptoKey] specified when creating with [TLSOptions.server].
   */
  public final fun getPrivateKey(): CryptoKey? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPrivateKeyPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as CryptoKey?)
  }

  /**
   * Returns the [X509Certificate] specified when creating with [TLSOptions.server].
   */
  public final fun getOwnCertificate(): X509Certificate? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOwnCertificatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as X509Certificate?)
  }

  public companion object {
    /**
     * Creates a TLS client configuration which validates certificates and their common names (fully
     * qualified domain names).
     * You can specify a custom [trustedChain] of certification authorities (the default CA list
     * will be used if `null`), and optionally provide a [commonNameOverride] if you expect the
     * certificate to have a common name other than the server FQDN.
     * **Note:** On the Web platform, TLS verification is always enforced against the CA list of the
     * web browser. This is considered a security feature.
     */
    @JvmOverloads
    public final fun client(trustedChain: X509Certificate? = null, commonNameOverride: String = ""):
        TLSOptions? {
      TransferContext.writeArguments(OBJECT to trustedChain, STRING to commonNameOverride)
      TransferContext.callMethod(0, MethodBindings.clientPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as TLSOptions?)
    }

    /**
     * Creates an **unsafe** TLS client configuration where certificate validation is optional. You
     * can optionally provide a valid [trustedChain], but the common name of the certificates will
     * never be checked. Using this configuration for purposes other than testing **is not
     * recommended**.
     * **Note:** On the Web platform, TLS verification is always enforced against the CA list of the
     * web browser. This is considered a security feature.
     */
    @JvmOverloads
    public final fun clientUnsafe(trustedChain: X509Certificate? = null): TLSOptions? {
      TransferContext.writeArguments(OBJECT to trustedChain)
      TransferContext.callMethod(0, MethodBindings.clientUnsafePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as TLSOptions?)
    }

    /**
     * Creates a TLS server configuration using the provided [key] and [certificate].
     * **Note:** The [certificate] should include the full certificate chain up to the signing CA
     * (certificates file can be concatenated using a general purpose text editor).
     */
    public final fun server(key: CryptoKey?, certificate: X509Certificate?): TLSOptions? {
      TransferContext.writeArguments(OBJECT to key, OBJECT to certificate)
      TransferContext.callMethod(0, MethodBindings.serverPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as TLSOptions?)
    }
  }

  internal object MethodBindings {
    public val clientPtr: VoidPtr = TypeManager.getMethodBindPtr("TLSOptions", "client", 3565000357)

    public val clientUnsafePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TLSOptions", "client_unsafe", 2090251749)

    public val serverPtr: VoidPtr = TypeManager.getMethodBindPtr("TLSOptions", "server", 36969539)

    public val isServerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TLSOptions", "is_server", 36873697)

    public val isUnsafeClientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TLSOptions", "is_unsafe_client", 36873697)

    public val getCommonNameOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TLSOptions", "get_common_name_override", 201670096)

    public val getTrustedCaChainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TLSOptions", "get_trusted_ca_chain", 1120709175)

    public val getPrivateKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TLSOptions", "get_private_key", 2119971811)

    public val getOwnCertificatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TLSOptions", "get_own_certificate", 1120709175)
  }
}
