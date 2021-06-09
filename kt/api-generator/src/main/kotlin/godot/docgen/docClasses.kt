package godot.docgen

data class ClassDoc(
    val name: String,
    val briefDescription: String,
    val description: String,
    val tutorialLinks: List<String>,
    val functions: Map<String, FunctionDoc>,
    val properties: Map<String, PropertyDoc>,
    val signals: Map<String, SignalDoc>,
    val constants: Map<String, ConstantDoc>
)

data class FunctionDoc(
    val name: String,
    val description: String
)

data class PropertyDoc(
    val name: String,
    val description: String
)

data class SignalDoc(
    val name: String,
    val description: String
)

data class ConstantDoc(
    val name: String,
    val enum: String,
    val description: String
)
