package godot.codegen.generation

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import godot.codegen.models.enriched.EnrichedEnum
import godot.codegen.services.IApiGenerationService
import godot.tools.common.constants.godotApiPackage
import godot.tools.common.constants.godotCorePackage

object BitFieldGenerator {
    private const val BIT_FLAG_VALUE_MEMBER = "flag"

    fun generate(enum: EnrichedEnum, context: IApiGenerationService): Pair<List<TypeSpec>, List<FunSpec>> {
        val packageName = if (enum.outerClass == null) {
            godotCorePackage
        } else {
            "$godotApiPackage.${enum.outerClass}"
        }


        val bitFieldInterfaceName = ClassName(packageName, enum.name)
        val bitFlagValueClassName = "${enum.name}Value"
        val bitFlagValueClass = TypeSpec.classBuilder(bitFlagValueClassName)
            .addSuperinterface(bitFieldInterfaceName)
            .addModifiers(KModifier.VALUE)
            .addAnnotation(JvmInline::class)
            .addProperty(
                PropertySpec.builder(BIT_FLAG_VALUE_MEMBER, LONG)
                    .addModifiers(KModifier.OVERRIDE)
                    .initializer(BIT_FLAG_VALUE_MEMBER)
                    .build()
            )
            .primaryConstructor(
                FunSpec.constructorBuilder()
                    .addParameter(
                        ParameterSpec
                            .builder(BIT_FLAG_VALUE_MEMBER, LONG)
                            .build()
                    )
                    .build()
            )
            .build()
        val bitfieldInterface = TypeSpec.interfaceBuilder(enum.name)
            .addModifiers(KModifier.SEALED)
            .addProperty(
                PropertySpec.builder(BIT_FLAG_VALUE_MEMBER, LONG)
                    .build()
            )

        val logicalOperations = arrayOf("or", "xor", "and")
        val extensionsOperator = generateBitFlagExtensionsOperators(logicalOperations, enum).toMutableList()
        bitfieldInterface.generateOperatorMethods(logicalOperations, enum)

        val commonOperators = arrayOf("plus", "minus", "times", "div", "rem")
        extensionsOperator.addAll(generateBitFlagExtensionsOperators(commonOperators, enum, true))
        bitfieldInterface.generateOperatorMethods(commonOperators, enum, true)

        val unaryOperations = arrayOf("unaryPlus", "unaryMinus", "inv")

        for (unaryOperation in unaryOperations) {
            bitfieldInterface.addFunction(
                FunSpec.builder(unaryOperation)
                    .returns(bitFieldInterfaceName)
                    .addCode(CodeBlock.of("return·%L(%L.%L())", bitFlagValueClassName, BIT_FLAG_VALUE_MEMBER, unaryOperation))
                    .build()
            )
        }

        val shiftOperations = arrayOf("shl", "shr", "ushr")
        val shiftOperationsParameterName = "bits"

        for (shiftOperation in shiftOperations) {
            bitfieldInterface.addFunction(
                FunSpec.builder(shiftOperation)
                    .addModifiers(KModifier.INFIX)
                    .addParameter(shiftOperationsParameterName, INT)
                    .returns(bitFieldInterfaceName)
                    .addCode(
                        CodeBlock.of(
                            "return·%L(%L·%L·%L)",
                            bitFlagValueClassName, BIT_FLAG_VALUE_MEMBER, shiftOperation, shiftOperationsParameterName
                        )
                    )
                    .build()
            )
        }

        val bitfieldInterfaceCompanion = TypeSpec.companionObjectBuilder()

        for (value in enum.values) {
            val bitFieldValueClassName = ClassName(packageName, bitFlagValueClassName)
            bitfieldInterfaceCompanion
                .addProperty(
                    PropertySpec.builder(value.name, bitFieldInterfaceName)
                        .initializer(CodeBlock.of("%T(%L)", bitFieldValueClassName, value.value))
                        .build()
                )
        }

        bitfieldInterface.addType(bitfieldInterfaceCompanion.build())

        return listOf(bitfieldInterface.build(), bitFlagValueClass) to extensionsOperator
    }

    private fun TypeSpec.Builder.generateOperatorMethods(
        operations: Array<String>,
        enum: EnrichedEnum,
        isOperator: Boolean = false
    ) {
        val packageName = if (enum.outerClass == null) {
            godotCorePackage
        } else {
            "$godotApiPackage.${enum.outerClass}"
        }

        val bitFieldInterfaceName = ClassName(packageName, enum.name)

        val bitFlagValueClassName = "${enum.name}Value"

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
                            bitFlagValueClassName,
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
                        CodeBlock.of("return·%L(%L.%L(other))", bitFlagValueClassName, BIT_FLAG_VALUE_MEMBER, operation)
                    )
                    .build()
            )
        }
    }

    fun generateBitFlagExtensionsOperators(
        bitOperations: Array<String>,
        enum: EnrichedEnum,
        isOperator: Boolean = false
    ): List<FunSpec> {
        val packageName = if (enum.outerClass == null) {
            godotCorePackage
        } else {
            "$godotApiPackage.${enum.outerClass}"
        }

        val bitFieldInterfaceName = ClassName(packageName, enum.name)

        val operatorModifier = if (isOperator) KModifier.OPERATOR else KModifier.INFIX

        return bitOperations
            .map {
                FunSpec.builder(it)
                    .addModifiers(operatorModifier)
                    .receiver(LONG)
                    .addParameter(
                        ParameterSpec
                            .builder("other", bitFieldInterfaceName)
                            .build()
                    )
                    .returns(LONG)
                    .addCode(
                        CodeBlock.of("return·this.%L(other.%L)", it, BIT_FLAG_VALUE_MEMBER)
                    ).build()
            }
    }
}
