package godot.codegen.generation.rule

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import godot.codegen.generation.GenerationContext
import godot.codegen.generation.task.EnrichedEnumTask
import godot.codegen.generation.task.FileTask
import godot.codegen.models.enriched.EnrichedEnum
import godot.codegen.models.traits.addKdoc
import godot.tools.common.constants.GodotKotlinJvmTypes.godotEnum
import godot.tools.common.constants.godotCorePackage

private const val BIT_FLAG_VALUE_MEMBER = "flag"

class EnumRule : GodotApiRule<EnrichedEnumTask>() {

    override fun apply(task: EnrichedEnumTask, context: GenerationContext) = with(task.builder) {
        val enum = task.enum
        if (enum.isBitField()) {
            generateBitfield(enum)
        } else {
            generateEnum(enum)
        }
    }

    fun TypeSpec.Builder.generateEnum(enum: EnrichedEnum) {
        addSuperinterface(ClassName(godotCorePackage, godotEnum))

        primaryConstructor(
            FunSpec.constructorBuilder()
                .addParameter("id", Long::class)
                .addStatement("this.%N = %N", "id", "id")
                .build()
        )
        addProperty("id", Long::class, KModifier.OVERRIDE)

        for (value in enum.values) {
            val valueName = value.name
            addEnumConstant(
                valueName,
                TypeSpec.anonymousClassBuilder()
                    .addSuperclassConstructorParameter("%L", value.value)
                    .also {
                        it.addKdoc(value)
                    }
                    .build()
            )
        }

        val companion = TypeSpec.companionObjectBuilder()
            .addFunction(
                FunSpec.builder("from")
                    .returns(enum.className)
                    .addParameter("value", Long::class)
                    .addStatement("return·entries.single·{·it.%N·==·%N·}", "id", "value")
                    .build()
            )
            .build()

        addType(companion)
    }

    fun TypeSpec.Builder.generateBitfield(enum: EnrichedEnum) {
        val className = enum.className

        primaryConstructor(
            FunSpec.constructorBuilder()
                .addParameter(
                    ParameterSpec
                        .builder(BIT_FLAG_VALUE_MEMBER, LONG)
                        .build()
                )
                .build()
        )
        addProperty(
            PropertySpec.builder(BIT_FLAG_VALUE_MEMBER, LONG)
                .initializer(BIT_FLAG_VALUE_MEMBER)
                .build()
        )

        val logicalOperations = arrayOf("or", "xor", "and")
        generateOperatorMethods(logicalOperations, enum)

        val unaryOperations = arrayOf("unaryPlus", "unaryMinus", "inv")
        for (unaryOperation in unaryOperations) {
            addFunction(
                FunSpec.builder(unaryOperation)
                    .returns(className)
                    .addCode(CodeBlock.of("return·%L(%L.%L())", enum.simpleName, BIT_FLAG_VALUE_MEMBER, unaryOperation))
                    .build()
            )
        }

        val shiftOperations = arrayOf("shl", "shr", "ushr")
        val shiftOperationsParameterName = "bits"
        for (shiftOperation in shiftOperations) {
            addFunction(
                FunSpec.builder(shiftOperation)
                    .addModifiers(KModifier.INFIX)
                    .addParameter(shiftOperationsParameterName, INT)
                    .returns(className)
                    .addCode(
                        CodeBlock.of(
                            "return·%L(%L·%L·%L)",
                            enum.simpleName, BIT_FLAG_VALUE_MEMBER, shiftOperation, shiftOperationsParameterName
                        )
                    )
                    .build()
            )
        }

        val bitfieldCompanion = TypeSpec.companionObjectBuilder()
        for (value in enum.values) {
            bitfieldCompanion
                .addProperty(
                    PropertySpec.builder(value.name, className)
                        .addAnnotation(JvmField::class)
                        .initializer(CodeBlock.of("%T(%L)", className, value.value))
                        .addKdoc(value)
                        .build()
                )
        }

        addType(bitfieldCompanion.build())
    }

    private fun TypeSpec.Builder.generateOperatorMethods(
        operations: Array<String>,
        enum: EnrichedEnum,
        isOperator: Boolean = false
    ) {

        val bitFieldInterfaceName = enum.className

        val operatorModifier = if (isOperator) KModifier.OPERATOR else KModifier.INFIX

        for (operation in operations) {
            this.addFunction(
                FunSpec.builder(operation)
                    .addModifiers(operatorModifier)
                    .addParameter(
                        ParameterSpec
                            .builder("other", bitFieldInterfaceName)
                            .build()
                    )
                    .returns(bitFieldInterfaceName)
                    .addCode(
                        CodeBlock.of(
                            "return·%L(%L.%L(other.%L))",
                            enum.simpleName,
                            BIT_FLAG_VALUE_MEMBER,
                            operation,
                            BIT_FLAG_VALUE_MEMBER
                        )
                    )
                    .build()
            )
            this.addFunction(
                FunSpec.builder(operation)
                    .addModifiers(operatorModifier)
                    .addParameter(
                        ParameterSpec
                            .builder("other", LONG)
                            .build()
                    )
                    .returns(bitFieldInterfaceName)
                    .addCode(
                        CodeBlock.of("return·%L(%L.%L(other))", enum.simpleName, BIT_FLAG_VALUE_MEMBER, operation)
                    )
                    .build()
            )
        }
    }
}

class BitfieldExtensionRule : GodotApiRule<FileTask>() {
    override fun apply(task: FileTask, context: GenerationContext) = with(task.builder) {
        val enums = task.classes.flatMap { it.enums } + task.enums

        enums.filter { it.enum.isBitField() }
            .forEach { enum ->
                val logicalOperations = arrayOf("or", "xor", "and")
                generateBitFlagExtensionsOperators(logicalOperations, enum.enum).forEach {
                    addFunction(it)
                }
            }
    }

    fun generateBitFlagExtensionsOperators(
        bitOperations: Array<String>,
        enum: EnrichedEnum,
    ): List<FunSpec> {

        return bitOperations
            .map {
                FunSpec.builder(it)
                    .addModifiers(KModifier.INFIX)
                    .receiver(LONG)
                    .addParameter(
                        ParameterSpec
                            .builder("other", enum.className)
                            .build()
                    )
                    .returns(LONG)
                    .addCode(
                        CodeBlock.of("return·this.%L(other.%L)", it, BIT_FLAG_VALUE_MEMBER)
                    ).build()
            }
    }
}
