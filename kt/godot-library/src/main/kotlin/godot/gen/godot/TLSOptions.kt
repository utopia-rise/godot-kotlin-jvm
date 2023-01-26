// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

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
 * var server_tls_options = TLSOptions.server(server_certs, server_key)
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

  public companion object
}
