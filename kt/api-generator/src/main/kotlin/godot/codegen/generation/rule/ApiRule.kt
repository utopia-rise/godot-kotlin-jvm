package godot.codegen.generation.rule

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.TypeVariableName
import com.squareup.kotlinpoet.asClassName
import godot.codegen.generation.Context
import godot.codegen.generation.task.ApiTask
import godot.codegen.generation.task.EnrichedClassTask
import godot.codegen.generation.task.FileTask
import godot.codegen.rpc.RpcFunctionMode
import godot.tools.common.constants.GODOT_ERROR
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.TO_GODOT_NAME_UTIL_FUNCTION


class CoreRule : GodotApiRule<ApiTask>() {
    override fun apply(task: ApiTask, context: Context) {
        val classes = context
            .classRepository
            .listTypes()
            .filter { it.type == GodotTypes.godotObject  || it.type == GodotTypes.refCounted  }


        for (clazz in classes) {
            task.files += FileTask(clazz)
        }

        for (enum in context.enumRepository.getGlobalEnums()) {
            task.files += FileTask(enum)
        }
    }
}

class ApiRule : GodotApiRule<ApiTask>() {
    override fun apply(task: ApiTask, context: Context) {
        val classes = context
            .classRepository
            .listTypes()
            .filter { it.type != GodotTypes.godotObject && it.type != GodotTypes.refCounted }
            .filter {  //Remove class extending singletons
                val parent = it.parent
                parent == null || parent.isSingleton == false
            }

        for (clazz in classes) {
            task.files += FileTask(clazz)
        }
    }
}

class ObjectRule : GodotApiRule<EnrichedClassTask>() {
    override fun apply(task: EnrichedClassTask, context: Context) = task.configure {
        val type = task.clazz.type
        if (type == GodotTypes.node) {
            generateTypesafeRpc()
        }
        if (type == GodotKotlinJvmTypes.refCounted) {
            preventOnDestroyUsage()
        }
    }

    private fun TypeSpec.Builder.preventOnDestroyUsage() {
        addFunction(
            FunSpec.builder("_onDestroy")
                .addModifiers(KModifier.OVERRIDE, KModifier.FINAL)
                .returns(Unit::class)
                .addStatement("")
                .build()
        )
    }

    private fun TypeSpec.Builder.generateTypesafeRpc() {
        for (i in 0..10) {
            val kFunctionTypeParameters = mutableListOf<TypeVariableName>()
            if (i != 0) {
                for (argIndex in 0 until i) {
                    kFunctionTypeParameters.add(TypeVariableName.invoke("ARG$argIndex"))
                }
            }

            val kFunctionClassName = ClassName("kotlin.reflect", "KFunction$i")
                .parameterizedBy(*kFunctionTypeParameters.toTypedArray(), TypeVariableName.invoke("*"))

            RpcFunctionMode.entries.forEach { rpcFunctionMode ->
                val rpcFunSpec = FunSpec
                    .builder(rpcFunctionMode.functionName)
                    .returns(GODOT_ERROR)
                    .addModifiers(KModifier.INLINE)

                if (rpcFunctionMode.hasId) {
                    rpcFunSpec.addParameter("id", Long::class.asClassName())
                }

                rpcFunSpec.addParameter("function", TypeVariableName.invoke("FUNCTION"))

                var templateString = "return ${rpcFunctionMode.functionName}("

                if (rpcFunctionMode.hasId) {
                    templateString += "id, "
                }

                templateString += "function.name.%M()"

                kFunctionTypeParameters.forEachIndexed { index, typeVariableName ->
                    rpcFunSpec.addTypeVariable(typeVariableName)
                    val argParamName = "arg$index"
                    rpcFunSpec.addParameter(argParamName, typeVariableName)
                    templateString += ", $argParamName"
                }
                templateString += ")"
                rpcFunSpec.addStatement(templateString, TO_GODOT_NAME_UTIL_FUNCTION)

                rpcFunSpec.addTypeVariable(TypeVariableName.invoke("FUNCTION", kFunctionClassName).copy(reified = true))
                addFunction(rpcFunSpec.build())
            }
        }
    }
}
