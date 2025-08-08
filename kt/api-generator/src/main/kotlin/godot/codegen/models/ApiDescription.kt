package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class ApiDescription @JsonCreator constructor(
    @param:JsonProperty("header") val header: Header,
    @param:JsonProperty("builtin_class_sizes") val builtinClassSizes: List<BuiltinClassSizes>,
    @param:JsonProperty("builtin_class_member_offsets") val builtinClassMemberOffsets: List<BuiltinClassMemberOffsets>,
    @param:JsonProperty("global_constants") val globalConstants: List<Constant>,
    @param:JsonProperty("global_enums") val globalEnums: List<Enum>,
    @param:JsonProperty("utility_functions") val utilityFunctions: List<UtilityFunction>,
    @param:JsonProperty("builtin_classes") val builtinClasses: List<BuiltinClass>,
    @param:JsonProperty("classes") val classes: List<Class>,
    @param:JsonProperty("singletons") val singletons: List<Singleton>,
    @param:JsonProperty("native_structures") val nativeStructures: List<NativeStructure>
)
