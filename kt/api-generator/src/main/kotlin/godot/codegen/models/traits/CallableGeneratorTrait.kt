package godot.codegen.models.traits

interface CallableGeneratorTrait : HasTypeGenerationTrait, MetaGenerationTrait {
    val arguments: List<HasTypeGenerationTrait>
    val isVararg: Boolean
}
