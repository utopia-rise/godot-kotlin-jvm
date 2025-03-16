package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class ApiDescription @JsonCreator constructor(
    @JsonProperty("header") val header: Header,
    @JsonProperty("builtin_class_sizes") val builtinClassSizes: List<BuiltinClassSizes>,
    @JsonProperty("builtin_class_member_offsets") val builtinClassMemberOffsets: List<BuiltinClassMemberOffsets>,
    @JsonProperty("global_constants") val globalConstants: List<Constant>,
    @JsonProperty("global_enums") val globalEnums: List<Enum>,
    @JsonProperty("utility_functions") val utilityFunctions: List<UtilityFunction>,
    @JsonProperty("builtin_classes") val builtinClasses: List<BuiltinClass>,
    @JsonProperty("classes") val classes: List<Class>,
    @JsonProperty("singletons") val singletons: List<Singleton>,
    @JsonProperty("native_structures") val nativeStructures: List<NativeStructure>
)
