package godot.codegen.services.impl

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
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

            awaitFile.addFunction(
                FunSpec.builder("await")
                    .addModifiers(KModifier.SUSPEND, KModifier.INLINE)
                    .receiver(receiver)
                    .apply {
                        if (argCount != 0) {
                            addTypeVariables(parameters)
                        }
                    }
                    .generateBody(argCount)
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


    private fun FunSpec.Builder.generateBody(argCount: Int): FunSpec.Builder {
        val lambdaParameters = buildString {
            for (i in 0 until argCount) {
                if (i != 0) {
                    append(", ")
                }
                append("p$i")
            }
        }

        return this
            .addStatement("%M { cont: %T<%T> ->", suspendCancellableCoroutine, cancellableContinuationClass, UNIT)
            .addStatement("    %M(%T.ConnectFlags.CONNECT_ONE_SHOT.id.toInt()) { $lambdaParameters ->", connect, GODOT_OBJECT)
            .addStatement("        cont.%M(%T)", resume, UNIT)
            .addStatement("    }")
            .addStatement("}")
            .returns(UNIT)
    }
}
