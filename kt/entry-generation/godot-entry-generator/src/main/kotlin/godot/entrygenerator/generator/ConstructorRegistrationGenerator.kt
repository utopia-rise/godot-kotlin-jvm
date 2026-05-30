package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import godot.registration.KtConstructor

object ConstructorRegistrationGenerator {

    fun generate(className: ClassName, registerClassControlFlow: FunSpec.Builder) {
        registerClassControlFlow.addStatement(
            "constructor(%T(::%T))",
            KtConstructor::class,
            className
        )
    }
}
