package godot.intellij.plugin.data.cache.signalconnection

import com.intellij.openapi.project.Project
import com.utopiarise.serialization.godot.model.SignalConnection
import godot.intellij.plugin.data.model.IncomingSignalConnectionDataContainer
import godot.intellij.plugin.data.model.OutgoingSignalConnectionDataContainer
import godot.tools.common.extensions.convertToCamelCase
import java.util.*

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

    fun updateSignalConnections(project: Project, path: String, newSignalConnections: List<SignalConnection>) {
        newSignalConnections
            .filter { signalConnection ->
                signalConnection.to.script?.endsWith("kt") == true
            }
            .map { signalConnection ->
                val signalName = if (signalConnection.from.script?.endsWith("kt") == true) {
                    "signal${signalConnection.signal.convertToCamelCase().replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.US) else it.toString() }}"
                } else {
                    signalConnection.signal
                }
                val toMethodName = signalConnection.method.convertToCamelCase()
                val fromNode = signalConnection.from
                val toNode = signalConnection.to
                val toKtClassFqName = signalConnection
                    .to
                    .script!! // already filtered above
                    .removePrefix("res://src/main/kotlin/")
                    .replace("/", ".")
                    .removeSuffix(".kt")

                IncomingSignalConnectionDataContainer(
                    path.replace(project.basePath ?: "", "res://"),
                    signalName,
                    fromNode.name,
                    toNode.name,
                    signalConnection.from.script,
                    toMethodName,
                    toKtClassFqName
                )
            }
            .groupBy { pluginIncomingKtSignalConnection -> pluginIncomingKtSignalConnection.toKtClassFqName }
            .let { map ->
                incomingSignalConnectionDataContainers[path] = map.toMutableMap()
            }

        newSignalConnections
            .filter { signalConnection ->
                signalConnection.from.script?.endsWith("kt") == true
            }
            .map { signalConnection ->
                val toScriptIsAlsoKt = signalConnection.to.script?.endsWith("kt") == true
                val signalName = "signal${signalConnection.signal.convertToCamelCase().replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.US) else it.toString() }}"
                val toMethodName = if (toScriptIsAlsoKt) {
                    signalConnection.method.convertToCamelCase()
                } else {
                    signalConnection.method
                }
                val fromKtClassFqName = signalConnection
                    .from
                    .script!! // already filtered above
                    .removePrefix("res://src/main/kotlin/")
                    .replace("/", ".")
                    .removeSuffix(".kt")

                OutgoingSignalConnectionDataContainer(
                    path.replace(project.basePath ?: "", "res://"),
                    signalName,
                    signalConnection.from.name,
                    signalConnection.to.name,
                    toMethodName,
                    fromKtClassFqName,
                    signalConnection.to.script ?: "builtin"
                )
            }
            .groupBy { pluginOutgoingKtSignalConnection -> pluginOutgoingKtSignalConnection.fromKtClassFqName }
            .let { map ->
                outgoingKtScriptSignalConnections[path] = map.toMutableMap()
            }
    }

    fun removeSignalConnections(path: String) {
        incomingSignalConnectionDataContainers.remove(path)
        outgoingKtScriptSignalConnections.remove(path)
    }
}
