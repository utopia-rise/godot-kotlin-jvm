package godot.codegen.services.impl

import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LIST
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.TypeVariableName
import com.squareup.kotlinpoet.UNIT
import godot.codegen.services.IAwaitGenerationService
import godot.tools.common.constants.GODOT_OBJECT
import godot.tools.common.constants.GodotKotlinJvmTypes.signal
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.godotCoroutinePackage

private val cancellableContinuationClass = ClassName("kotlinx.coroutines", "CancellableContinuation")
private val suspendCancellableCoroutine = MemberName("kotlinx.coroutines", "suspendCancellableCoroutine")
private val connect = MemberName(godotCorePackage, "connect")
private val resume = MemberName("kotlin.coroutines", "resume")

object AwaitGenerationService : IAwaitGenerationService {
    override fun generate(maxArgumentCount: Int): FileSpec {
        val awaitFile = FileSpec.builder(godotCoroutinePackage, "Await")

        val allParameters = Array(maxArgumentCount) { index ->
            TypeVariableName("P$index").copy(reified = true)
        }.toList()

        for (argCount in 0..maxArgumentCount) {
            val parameters = allParameters.take(argCount)

            val baseReceiver = ClassName(godotCorePackage, signal + argCount)
            val receiver = if (argCount != 0) {
                baseReceiver.parameterizedBy(parameters)
            } else {
                baseReceiver
            }

            val returnType = when (argCount) {
                1 -> parameters[0]
                2 -> ClassName("kotlin", "Pair").parameterizedBy(parameters)
                3 -> ClassName("kotlin", "Triple").parameterizedBy(parameters)
                in 4 .. maxArgumentCount -> LIST.parameterizedBy(ANY.copy(nullable = true))
                else -> UNIT
            }

            awaitFile.addFunction(
                FunSpec.builder("await")
                    .addModifiers(KModifier.SUSPEND, KModifier.INLINE)
                    .receiver(receiver)
                    .apply {
                        if (argCount != 0) {
                            addTypeVariables(parameters)
                        }
                    }
                    .generateBody(argCount, returnType)
                    .returns(returnType)
                    .build()
            )
        }

        return awaitFile
            .addAnnotation(
                AnnotationSpec.builder(ClassName("kotlin", "Suppress"))
                    .addMember("\"PackageDirectoryMismatch\", \"unused\"")
                    .build()
            )
            .build()
    }


    private fun FunSpec.Builder.generateBody(argCount: Int, returnType: TypeName): FunSpec.Builder {
        // Build `p0, p1, ..., px`
        val lambdaParameters = buildString {
            for (i in 0 until argCount) {
                if (i != 0) {
                    append(", ")
                }
                append("p$i")
            }
        }

        // Build what is inserted into the `resume()` method : `Unit`, `po`, `Pair(p0, P1)`, `Triple(p0, p1, p2)`, `listOf(p0, p1, p2, p3), etc..`
        val resumeParameters = when (argCount) {
            0 -> "Unit"
            1 -> lambdaParameters
            2 -> "Pair($lambdaParameters)"
            3 -> "Triple($lambdaParameters)"
            in 4 .. Int.MAX_VALUE -> "listOf($lambdaParameters)"
            else -> ""
        }

        return this
            .beginControlFlow("return %M { cont: %T<%T> ->", suspendCancellableCoroutine, cancellableContinuationClass, returnType)
            .beginControlFlow("%M(%T.ConnectFlags.CONNECT_ONE_SHOT.id.toInt()) { $lambdaParameters ->", connect, GODOT_OBJECT)
            .addStatement("cont.%M($resumeParameters)", resume)
            .endControlFlow()
            .endControlFlow()
    }
}
