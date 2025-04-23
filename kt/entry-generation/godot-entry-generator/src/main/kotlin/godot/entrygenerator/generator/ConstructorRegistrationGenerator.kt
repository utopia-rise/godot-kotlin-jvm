package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import godot.tools.common.constants.godotCorePackage

object ConstructorRegistrationGenerator {

    fun generate(className: ClassName, registerClassControlFlow: FunSpec.Builder) {
        registerClassControlFlow.addStatement(
            "constructor(%T(::%T))",
            ClassName(godotCorePackage, "KtConstructor"),
            className
        )
    }
}
