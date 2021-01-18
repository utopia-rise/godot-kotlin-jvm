package godot.intellij.plugin.data.model

data class PluginIncomingKtScriptSignalConnection(
    val scenePath: String,
    val signalName: String,
    val fromNodeName: String,
    val fromScriptPath: String?,
    val toMethodName: String,
    val toKtClassFqName: String
)
