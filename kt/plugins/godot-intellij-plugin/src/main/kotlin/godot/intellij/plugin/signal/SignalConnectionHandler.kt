package godot.intellij.plugin.signal

import com.intellij.openapi.project.Project
import com.utopiarise.serialization.godot.model.SignalConnection
import godot.intellij.plugin.data.model.PluginIncomingKtScriptSignalConnection
import godot.intellij.plugin.data.model.PluginOutgoingKtScriptSignalConnection

object SignalConnectionHandlerProvider {
    private val projectToSignalConnectionHandler: MutableMap<Project, SignalConnectionHandler> = mutableMapOf()

    fun getInstanceForProject(project: Project): SignalConnectionHandler {
        val signalConnectionHandler = projectToSignalConnectionHandler[project]

        return if (signalConnectionHandler == null) {
            val newSignalConnectionHanlder = SignalConnectionHandler()
            projectToSignalConnectionHandler[project] = newSignalConnectionHanlder
            newSignalConnectionHanlder
        } else {
            signalConnectionHandler
        }
    }

    fun disposeSignalConnectionHandlerForProject(project: Project) =
        projectToSignalConnectionHandler.remove(project)
}

class SignalConnectionHandler {
    private val incomingKtScriptSignalConnections: MutableMap<String, MutableMap<String, List<PluginIncomingKtScriptSignalConnection>>> =
        mutableMapOf()
    private val outgoingKtScriptSignalConnections: MutableMap<String, MutableMap<String, List<PluginOutgoingKtScriptSignalConnection>>> =
        mutableMapOf()

    fun getIncomingKtSignalConnection(
        classFqName: String,
        methodName: String
    ): List<PluginIncomingKtScriptSignalConnection> {
        return incomingKtScriptSignalConnections
            .map { it.value }
            .flatMap { it[classFqName] ?: emptyList() }
            .filter { it.toMethodName == methodName }
    }

    fun getOutgoingKtSignalConnection(
        classFqName: String,
        signalName: String
    ): List<PluginOutgoingKtScriptSignalConnection> {
        return outgoingKtScriptSignalConnections
            .map { it.value }
            .flatMap { it[classFqName] ?: emptyList() }
            .filter { it.signalName == signalName }
    }

    fun updateSignalConnections(path: String, newSignalConnections: List<SignalConnection>) {
        newSignalConnections
            .filter { signalConnection ->
                signalConnection.to.script?.endsWith("kt") == true
            }
            .map { signalConnection ->
                val signalName = if (signalConnection.from.script?.endsWith("kt") == true) {
                    "signal${signalConnection.signal.snakeToLowerCamelCase().capitalize()}"
                } else {
                    signalConnection.signal
                }
                val toMethodName = signalConnection.method.snakeToLowerCamelCase()
                val fromNode = signalConnection.from
                val toKtClassFqName = signalConnection
                    .to
                    .script!! //already filtered above
                    .removePrefix("res://src/main/kotlin/")
                    .replace("/", ".")
                    .removeSuffix(".kt")

                PluginIncomingKtScriptSignalConnection(
                    path,
                    signalName,
                    fromNode.name,
                    signalConnection.from.script,
                    toMethodName,
                    toKtClassFqName
                )
            }
            .groupBy { pluginIncomingKtSignalConnection -> pluginIncomingKtSignalConnection.toKtClassFqName }
            .let { map ->
                incomingKtScriptSignalConnections[path] = map.toMutableMap()
            }

        newSignalConnections
            .filter { signalConnection ->
                signalConnection.from.script?.endsWith("kt") == true
            }
            .map { signalConnection ->
                val toScriptIsAlsoKt = signalConnection.to.script?.endsWith("kt") == true
                val signalName = "signal${signalConnection.signal.snakeToLowerCamelCase().capitalize()}"
                val toMethodName = if (toScriptIsAlsoKt) {
                    signalConnection.method.snakeToLowerCamelCase()
                } else {
                    signalConnection.method
                }
                val fromKtClassFqName = signalConnection
                    .from
                    .script!! //already filtered above
                    .removePrefix("res://src/main/kotlin/")
                    .replace("/", ".")
                    .removeSuffix(".kt")

                PluginOutgoingKtScriptSignalConnection(
                    path,
                    signalName,
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
        incomingKtScriptSignalConnections.remove(path)
        outgoingKtScriptSignalConnections.remove(path)
    }

    private fun String.snakeToLowerCamelCase(): String {
        return "_[a-zA-Z]"
            .toRegex()
            .replace(this) {
                it
                    .value
                    .replace("_", "")
                    .toUpperCase()
            }
    }
}
