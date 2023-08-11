package godot.intellij.plugin.data.cache.signalconnection

import com.intellij.openapi.module.Module
import com.utopiarise.serialization.godot.model.SignalConnection
import godot.intellij.plugin.data.model.IncomingSignalConnectionDataContainer
import godot.intellij.plugin.data.model.OutgoingSignalConnectionDataContainer
import godot.intellij.plugin.extension.asResPath
import godot.tools.common.constants.FileExtensions
import godot.tools.common.extensions.convertToCamelCase

class SignalConnectionCache {
    private val incomingSignalConnectionDataContainers: MutableMap<String, MutableMap<String, List<IncomingSignalConnectionDataContainer>>> =
        mutableMapOf()
    private val outgoingKtScriptSignalConnections: MutableMap<String, MutableMap<String, List<OutgoingSignalConnectionDataContainer>>> =
        mutableMapOf()

    fun getIncomingKtSignalConnection(
        classFqName: String,
        methodName: String
    ): List<IncomingSignalConnectionDataContainer> {
        return incomingSignalConnectionDataContainers
            .map { it.value }
            .flatMap { it[classFqName] ?: emptyList() }
            .filter { it.toFunctionName == methodName }
    }

    fun getOutgoingKtSignalConnection(
        classFqName: String,
        signalName: String
    ): List<OutgoingSignalConnectionDataContainer> {
        return outgoingKtScriptSignalConnections
            .map { it.value }
            .flatMap { it[classFqName] ?: emptyList() }
            .filter { it.signalName == signalName }
    }

    fun updateSignalConnections(module: Module, path: String, newSignalConnections: List<SignalConnection>) {
        newSignalConnections
            .filter { signalConnection ->
                signalConnection.to.script?.endsWith(FileExtensions.GodotKotlinJvm.registrationFile) == true
            }
            .mapNotNull { signalConnection ->
                val signalName = if (signalConnection.from.script?.endsWith(FileExtensions.GodotKotlinJvm.registrationFile) == true) {
                    signalConnection.signal.convertToCamelCase()
                } else {
                    signalConnection.signal
                }
                val toMethodName = signalConnection.method.convertToCamelCase()
                val fromNode = signalConnection.from
                val toNode = signalConnection.to

                val scriptClassFqName = signalConnection
                    .from
                    .script
                    ?.asResPath
                    ?.scriptClassFqName(module)
                    ?: return@mapNotNull null

                IncomingSignalConnectionDataContainer(
                    path.replace(module.project.basePath ?: "", "res://"),
                    signalName,
                    fromNode.name,
                    toNode.name,
                    signalConnection.from.script,
                    toMethodName,
                    scriptClassFqName
                )
            }
            .groupBy { pluginIncomingKtSignalConnection -> pluginIncomingKtSignalConnection.toClassFqName }
            .let { map ->
                incomingSignalConnectionDataContainers[path] = map.toMutableMap()
            }

        newSignalConnections
            .filter { signalConnection ->
                signalConnection.from.script?.endsWith(FileExtensions.GodotKotlinJvm.registrationFile) == true
            }
            .mapNotNull { signalConnection ->
                val toScriptIsAlsoGodotKotlinJvm = signalConnection.to.script?.endsWith(FileExtensions.GodotKotlinJvm.registrationFile) == true
                val signalName = signalConnection.signal.convertToCamelCase()
                val toMethodName = if (toScriptIsAlsoGodotKotlinJvm) {
                    signalConnection.method.convertToCamelCase()
                } else {
                    signalConnection.method
                }

                val scriptClassFqName = signalConnection
                    .from
                    .script
                    ?.asResPath
                    ?.scriptClassFqName(module)
                    ?: return@mapNotNull null

                OutgoingSignalConnectionDataContainer(
                    path.replace(module.project.basePath ?: "", "res://"),
                    signalName,
                    signalConnection.from.name,
                    signalConnection.to.name,
                    toMethodName,
                    scriptClassFqName,
                    signalConnection.to.script ?: "builtin"
                )
            }
            .groupBy { pluginOutgoingKtSignalConnection -> pluginOutgoingKtSignalConnection.fromClassFqName }
            .let { map ->
                outgoingKtScriptSignalConnections[path] = map.toMutableMap()
            }
    }

    fun removeSignalConnections(path: String) {
        incomingSignalConnectionDataContainers.remove(path)
        outgoingKtScriptSignalConnections.remove(path)
    }
}
