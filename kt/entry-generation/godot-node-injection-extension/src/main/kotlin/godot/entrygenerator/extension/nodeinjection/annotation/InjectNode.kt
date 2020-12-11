package godot.entrygenerator.extension.nodeinjection.annotation

/**
 * Only applicable for object extending Node
 *
 * A nodePath will be registered for each property of type node annotated with this annotation.
 *
 * You then can drag and drop a node in the inspector to that nodePath.
 *
 * Once your script runs your node will be injected using that generated NodePath and getNode.
 *
 * Injection happens after _enterTree and before _ready
 */
annotation class InjectNode
