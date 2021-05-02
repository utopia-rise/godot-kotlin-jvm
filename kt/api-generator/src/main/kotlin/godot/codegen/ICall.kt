package godot.codegen

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import godot.codegen.utils.*

class ICall(
    var returnType: String,
    private val arguments: List<Argument>
) {
    private val returnTypeClass = createReturnTypeClass()
    val name: String = buildString {
        append("_icall_${if (returnType.isEnum()) "Long" else returnType}")

        for (arg in arguments) {
            append('_')

            if (arg.nullable) {
                append('n')
            }

            append(arg.type.convertTypeForICalls())
        }
    }

    val generated: FunSpec
        get() {
            val spec = FunSpec
                .builder(name)
                .addModifiers(KModifier.INTERNAL)
                .addParameter(
                    ParameterSpec(
                        "mb",
                        ClassName("kotlinx.cinterop", "CPointer")
                            .parameterizedBy(ClassName("godot.gdnative", "godot_method_bind"))
                    )
                )
                .addParameter("inst", ClassName("kotlinx.cinterop", "COpaquePointer"))

            addArgumentsToICall(spec)


            val shouldReturn = returnType != "Unit"

            addReturnTypeForICall(shouldReturn, spec)
            generateICallMethodBlock(shouldReturn, spec)

            return spec.build()
        }

    init {
        if (returnType.isEnum()) returnType = "Long"
    }

    private fun createReturnTypeClass() = ClassName(
        if (returnType.isEnum()) "kotlin" else returnType.getPackage(),
        if (returnType.isEnum()) "Long" else returnType
    ).convertIfTypeParameter()

    private fun generateICallMethodBlock(shouldReturn: Boolean, spec: FunSpec.Builder) {
        val codeBlockBuilder = CodeBlock.builder()

        val isPrimitive = returnType.isPrimitive()

        if (shouldReturn) {
            if (isPrimitive) {
                spec.addStatement("var ret: %T = ${returnType.defaultValue()}", returnTypeClass)
                codeBlockBuilder.add("%M {\n", MemberName("godot.internal.utils", "godotScoped"))
            } else {
                codeBlockBuilder.add("val ret = %M {\n", MemberName("godot.internal.utils", "godotScoped"))
            }
        } else {
            codeBlockBuilder.add("%M {\n", MemberName("godot.internal.utils", "godotScoped"))
        }

        if (shouldReturn) {
            if (isPrimitive) {
                codeBlockBuilder.add(
                    "    val retVar = %M<%T>()\n",
                    MemberName("kotlinx.cinterop", "alloc"),
                    ClassName("kotlinx.cinterop", "${returnType}Var")
                )
            } else {
                codeBlockBuilder.add(
                    "    val retVar = %M<%T>().ptr\n",
                    MemberName("kotlinx.cinterop", "alloc"),
                    if (returnType.isCoreType()) {
                        ClassName("godot.gdnative", "godot_${returnType.convertToSnakeCase()}")
                    }
                    else ClassName("kotlinx.cinterop", "COpaquePointerVar")
                )
            }
        }

        codeBlockBuilder.add(
                "    val args = allocArray<%T>(${arguments.size + 1})\n",
                ClassName("kotlinx.cinterop", "COpaquePointerVar")
            )
        arguments.withIndex().forEach {
            val i = it.index
            val value = it.value
            val nullInstruction = if (value.nullable) "?" else ""
            when {
                value.type == "String" -> {
                    codeBlockBuilder.add(
                        "    args[$i] = arg$i$nullInstruction.ptr\n"
                    )
                }
                value.type == "GodotArray" || value.type == "Variant" -> {
                    codeBlockBuilder.add(
                        "    args[$i] = arg$i$nullInstruction._handle$nullInstruction.ptr\n"
                    )
                }
                value.type.isCoreType() -> {
                    codeBlockBuilder.add(
                        "    args[$i] = arg$i$nullInstruction.ptr\n"
                    )
                }
                value.type.isPrimitive() -> {
                    codeBlockBuilder.add(
                        "    args[$i] = arg$i.ptr\n"
                    )
                }
                else -> {
                    codeBlockBuilder.add(
                        "    args[$i] = arg$i$nullInstruction.ptr\n"
                    )
                }
            }
        }
        codeBlockBuilder.add("    args[${arguments.size}] = null\n")

        if (shouldReturn) {
            if (isPrimitive) {
                codeBlockBuilder.add(
                    "    %T.gdnative.godot_method_bind_ptrcall!!.%M(mb, inst, args, retVar.%M)\n",
                    ClassName("godot.core", "Godot"),
                    MemberName("kotlinx.cinterop", "invoke"),
                    MemberName("kotlinx.cinterop", "ptr")
                )
                codeBlockBuilder.add(
                    "    ret = retVar.%M\n",
                    MemberName("kotlinx.cinterop", "value")
                )
            } else {
                codeBlockBuilder.add(
                    "    %T.gdnative.godot_method_bind_ptrcall!!.%M(mb, inst, args, retVar)\n",
                    ClassName("godot.core", "Godot"),
                    MemberName("kotlinx.cinterop", "invoke")
                )

                val returnTypeClassSimpleName = when (returnTypeClass) {
                    is ClassName -> returnTypeClass.simpleName
                    is ParameterizedTypeName -> returnTypeClass.rawType.simpleName
                    else -> throw UnexpectedTypeName("TypeName should be ClassName or ParameterizedTypeName, " +
                        "not ${returnTypeClass.javaClass.name}")
                }

                when {
                    tree.isObjectOrItsChild(returnTypeClassSimpleName) -> {
                        val typeManagerClass = ClassName("godot.core", "TypeManager")
                        if (returnTypeClassSimpleName != "Object") {
                            codeBlockBuilder.add(
                                "    %M(retVar.pointed.value!!) as %T\n",
                                MemberName(typeManagerClass, "wrap"),
                                returnTypeClass
                            )
                        } else {
                            codeBlockBuilder.add(
                                "    %M(retVar.pointed.value!!)\n",
                                MemberName(typeManagerClass, "wrap")
                            )
                        }
                    }

                    returnTypeClassSimpleName == "String" -> {
                        codeBlockBuilder.add(
                            "    retVar.%M.%M().string\n",
                            MemberName("kotlinx.cinterop", "pointed"),
                            MemberName("kotlinx.cinterop", "readValue")
                        )
                    }

                    returnTypeClassSimpleName == "GodotArray" -> {
                        codeBlockBuilder.add(
                            "    %M(retVar.%M.%M())\n",
                            MemberName("godot.core", returnTypeClassSimpleName),
                            MemberName("kotlinx.cinterop", "pointed"),
                            MemberName("kotlinx.cinterop", "readValue")
                        )
                    }

                    returnTypeClassSimpleName == "Dictionary" -> {
                        codeBlockBuilder.add(
                            "    %M<%T, %T>(retVar.%M.%M())\n",
                            MemberName("godot.core", returnTypeClassSimpleName),
                            ANY.copy(nullable = true),
                            ANY.copy(nullable = true),
                            MemberName("kotlinx.cinterop", "pointed"),
                            MemberName("kotlinx.cinterop", "readValue")
                        )
                    }

                    else -> {
                        codeBlockBuilder.add(
                            "    %T(retVar.%M.%M())\n",
                            returnTypeClass,
                            MemberName("kotlinx.cinterop", "pointed"),
                            MemberName("kotlinx.cinterop", "readValue")
                        )
                    }
                }
            }
        } else {
            codeBlockBuilder.add(
                "    %T.gdnative.godot_method_bind_ptrcall!!.%M(mb, inst, args, null)\n",
                ClassName("godot.core", "Godot"),
                MemberName("kotlinx.cinterop", "invoke")
            )
        }

        codeBlockBuilder.add("}\n")

        if (shouldReturn) {
            codeBlockBuilder.add("return ret")
        }

        spec.addCode(codeBlockBuilder.build())
    }

    private fun addReturnTypeForICall(shouldReturn: Boolean, spec: FunSpec.Builder) {
        if (shouldReturn) {
            spec.returns(returnTypeClass)
        }
    }

    private fun addArgumentsToICall(spec: FunSpec.Builder) {
        arguments.withIndex().forEach {
            val argument = it.value
            val argumentTypeAsString = argument.type.convertTypeForICalls()
            val argumentType: TypeName = argumentTypeAsString.typeNameForICalls.copy(nullable = argument.nullable)
            spec.addParameter("arg${it.index}", argumentType)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (other !is ICall) return false

        return this.name == other.name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}
