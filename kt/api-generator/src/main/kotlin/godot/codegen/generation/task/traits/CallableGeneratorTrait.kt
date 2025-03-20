package godot.codegen.generation.task.traits

interface CallableGeneratorTrait : HasTypeGenerationTrait, MetaGenerationTrait {
    val arguments: List<HasTypeGenerationTrait>
    val isVararg: Boolean
    val voidPtrVariableName: String
}
