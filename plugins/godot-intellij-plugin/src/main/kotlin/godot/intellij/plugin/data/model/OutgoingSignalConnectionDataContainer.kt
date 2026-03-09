package godot.intellij.plugin.data.model

/**
 * Data container for needed information's about signals connected through the godot editor
 *
 * Stores information's about outgoing signals
 *
 * @property scenePath res:// path to scene file (tscn) in which this connection is set up
 * @property signalName name of the emitting signal
 * @property fromNodeName name of the node which emits the signal
 * @property targetNodeName name of the node which receives emitted data
 * @property targetFunctionName name of the method which receives emitted data
 * @property fromClassFqName fqName of the KtClass which contains the emitting signal
 * @property targetScriptPath res:// path to script which receives emitted data
 */
data class OutgoingSignalConnectionDataContainer(
    val scenePath: String,
    val signalName: String,
    val fromNodeName: String,
    val targetNodeName: String,
    val targetFunctionName: String,
    val fromClassFqName: String,
    val targetScriptPath: String
)
