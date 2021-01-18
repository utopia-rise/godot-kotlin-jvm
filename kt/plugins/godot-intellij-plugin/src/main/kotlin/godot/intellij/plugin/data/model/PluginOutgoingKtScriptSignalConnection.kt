package godot.intellij.plugin.data.model

data class PluginOutgoingKtScriptSignalConnection(
    val scenePath: String,
    val signalName: String,
    val targetNodeName: String,
    val targetMethodName: String,
    val fromKtClassFqName: String,
    val targetScriptPath: String
)
