package godot.codegen.services.impl

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.TypeVariableName
import com.squareup.kotlinpoet.UNIT
import godot.codegen.services.IAwaitGenerationService
import godot.common.constants.Constraints
import godot.tools.common.constants.GodotKotlinJvmTypes.signal
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.godotCoroutinePackage
import godot.tools.common.constants.kotlinCoroutinePackage
import godot.tools.common.constants.kotlinxCoroutinePackage
import java.io.File

private val cancellableContinuationClass = ClassName(kotlinxCoroutinePackage, "CancellableContinuation")
private val suspendCancellableCoroutine = MemberName(kotlinxCoroutinePackage, "suspendCancellableCoroutine")
private val promise = MemberName(godotCorePackage, "promise")
private val resume = MemberName(kotlinCoroutinePackage, "resume")
private const val cancel = "cancel"

object AwaitGenerationService : IAwaitGenerationService {
    override fun generate(output: File) {
        val awaitFile = FileSpec.builder(godotCoroutinePackage, "Await")

        val allParameters = Array(Constraints.MAX_FUNCTION_ARG_COUNT) { index ->
            TypeVariableName("P$index")
        }.toList()

        for (argCount in 0..Constraints.MAX_FUNCTION_ARG_COUNT) {
            val parameters = allParameters.take(argCount)

            val baseReceiver = ClassName(godotCorePackage, signal + argCount)
            val receiver = if (argCount != 0) {
                baseReceiver.parameterizedBy(parameters)
            } else {
                baseReceiver
            }

            val returnType: TypeName = when (argCount) {
                0 -> UNIT
                1 -> parameters[0]
                else -> ClassName(godotCoroutinePackage, "SignalArguments$argCount").parameterizedBy(parameters)
            }

            // Create a tuple for the signal arguments
            if (argCount >= 2) {
                awaitFile.addType(
                    TypeSpec.classBuilder("SignalArguments$argCount")
                        .addModifiers(KModifier.DATA)
                        .primaryConstructor(
                            FunSpec
                                .constructorBuilder()
                                .apply {
                                    parameters.forEachIndexed { index, parameter ->
                                        addParameter("p$index", parameter)
                                    }
                                }
                                .build()
                        )
                        .addProperties(
                            parameters.mapIndexed { index, parameter ->
                                PropertySpec
                                    .builder("p$index", parameter)
                                    .initializer("p$index")
                                    .build()
                            }
                        )
                        .addTypeVariables(parameters)
                        .build()
                )
            }

            awaitFile.addFunction(
                FunSpec.builder("await")
                    .addModifiers(KModifier.SUSPEND, KModifier.INLINE)
                    .receiver(receiver)
                    .apply {
                        if (argCount != 0) {
                            addTypeVariables(parameters.map { it.copy(reified = true) })
                        }
                    }
                    .generateBody(argCount, returnType)
                    .returns(returnType)
                    .build()
            )
        }

        awaitFile
            .addAnnotation(
                AnnotationSpec.builder(Suppress::class)
                    .addMember("\"PackageDirectoryMismatch\", \"unused\"")
                    .build()
            )
            .indent("    ")
            .build()
            .writeTo(output)
    }


    private fun FunSpec.Builder.generateBody(argCount: Int, returnType: TypeName): FunSpec.Builder {
        // Build `p0, p1, ..., px`
        val lambdaParameters = buildString {
            for (i in 0 until argCount) {
                if (i != 0) {
                    append(",·")
                }
                append("p$i")
            }
        }

        // Build what is inserted into the `resume()` method : `Unit`, `po`, `SignalArgumentsX(p0, p1, p2, ...).`
        val resumeParameters = when (argCount) {
            0 -> "Unit"
            1 -> lambdaParameters
            else -> "SignalArguments$argCount($lambdaParameters)"
        }
        val lambdaParametersWithType = buildString {
            for (i in 0 until argCount) {
                if (i != 0) {
                    append(",·")
                }
                append("p$i:·P$i")
            }
        }

        return this
            .beginControlFlow("return·%M", suspendCancellableCoroutine)
            .addStatement("cont:·%T<%T>·->", cancellableContinuationClass, returnType)
            .addStatement("%M(", promise)
            .addStatement("{·$lambdaParametersWithType·->·cont.%M($resumeParameters)·},", resume)
            .addStatement("{·cont.%L()·},", cancel)
            .addStatement(")")
            .endControlFlow()
    }
}
