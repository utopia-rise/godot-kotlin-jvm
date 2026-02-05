package godot.codegen.models.traits

interface CallableGeneratorTrait : MetaGenerationTrait {
    val arguments: List<HasTypeGenerationTrait>
    val isVararg: Boolean
    val voidPtrVariableName: String
}
