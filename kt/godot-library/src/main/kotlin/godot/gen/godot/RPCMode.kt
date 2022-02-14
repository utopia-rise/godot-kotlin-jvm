// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class RPCMode(
  id: Long
) {
  RPC_MODE_DISABLED(0),
  RPC_MODE_ANY_PEER(1),
  RPC_MODE_AUTH(2),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = values().single { it.id == `value` }
  }
}
