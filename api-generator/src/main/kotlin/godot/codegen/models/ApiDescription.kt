package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class ApiDescription @JsonCreator constructor(
    @JsonProperty("header") var header: Header,
    @JsonProperty("builtin_class_sizes") var builtinClassSizes: MutableList<BuiltinClassSizes>,
    @JsonProperty("builtin_class_member_offsets") var builtinClassMemberOffsets: MutableList<BuiltinClassMemberOffsets>,
    @JsonProperty("global_constants") var globalConstants: MutableList<Constant>,
    @JsonProperty("global_enums") var globalEnums: MutableList<Enum>,
    @JsonProperty("utility_functions") var utilityFunctions: MutableList<UtilityFunction>,
    @JsonProperty("builtin_classes") val builtinClasses: MutableList<BuiltinClass>,
    @JsonProperty("classes") var classes: MutableList<Class>,
    @JsonProperty("singletons") var singletons: MutableList<Singleton>,
    @JsonProperty("native_structures") var nativeStructures: MutableList<NativeStructure>
)
