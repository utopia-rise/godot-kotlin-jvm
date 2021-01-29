package godot.intellij.plugin.data.model

/**
 * Data container for needed information's about signals connected through the godot editor
 *
 * Stores information's about incoming signals
 *
 * @property scenePath res:// path to scene file (tscn) in which this connection is set up
 * @property signalName name of the emitting signal
 * @property fromNodeName name of the node which contains the emitting signal
 * @property toNodeName name of the node which contains the receiving function
 * @property fromScriptPath res:// path to the script that defines the emitting signal
 * @property toFunctionName name of the receiving function
 * @property toKtClassFqName fqName of the KtClass which contains the receiving function
 */
data class IncomingSignalConnectionDataContainer(
    val scenePath: String,
    val signalName: String,
    val fromNodeName: String,
    val toNodeName: String,
    val fromScriptPath: String?,
    val toFunctionName: String,
    val toKtClassFqName: String
)
