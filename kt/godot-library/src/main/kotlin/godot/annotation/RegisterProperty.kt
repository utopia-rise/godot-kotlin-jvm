package godot.annotation

import godot.MultiplayerAPI

/**
 * Registeres a property in godot so it can be used from another language or from godot
 *
 * **Note:** If a property is registered. Only compile time constant assignments can be used. If this is not possible you have to use lateinit and set the value either in the constructor or in `_ready`
 *
 * @param rpcMode Defines the RPC mode for this function. Default: RPCMode.DISABLED
 */
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterProperty(
    val rpcMode: MultiplayerAPI.RPCMode = MultiplayerAPI.RPCMode.DISABLED
)
