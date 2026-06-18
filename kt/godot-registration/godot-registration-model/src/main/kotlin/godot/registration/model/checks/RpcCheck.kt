package godot.registration.model.checks

import godot.annotation.TransferMode
import godot.registration.model.logging.Logger
import godot.registration.model.types.ScriptClass

class RpcCheck(logger: Logger, registeredClasses: List<ScriptClass>) : BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        registeredClasses
            .flatMap { it.functions }
            .mapNotNull { function -> function.rpcConfig?.let { function to it } }
            .forEach { (registeredFunction, rpcConfig) ->
                if (rpcConfig.transferMode != TransferMode.UNRELIABLE_ORDERED && rpcConfig.transferChannel != 0) {
                    logger.warn(
                        "You set \"transferChannel\" to something else than 0 (you set: ${rpcConfig.transferChannel}) while the \"transferMode\" is not set to ${TransferMode.UNRELIABLE_ORDERED.name}. \"transferChannel\" only has an effect with \"transferMode\" ${TransferMode.UNRELIABLE_ORDERED.name}!",
                        registeredFunction
                    )
                }
            }

        return false // just provides warnings
    }
}
