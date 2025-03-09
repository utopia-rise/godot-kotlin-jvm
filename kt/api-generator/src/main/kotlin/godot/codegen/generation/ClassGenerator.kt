package godot.codegen.generation

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.TypeVariableName
import com.squareup.kotlinpoet.asClassName
import godot.codegen.extensions.getClassName
import godot.codegen.extensions.isBitField
import godot.codegen.extensions.isLocalCopyCoreTypes
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedMethod
import godot.codegen.rpc.RpcFunctionMode
import godot.codegen.services.IApiGenerationService
import godot.codegen.services.impl.methodBindingsInnerClassName
import godot.codegen.traits.addKdoc
import godot.tools.common.constants.GENERATED_COMMENT
import godot.tools.common.constants.GODOT_BASE_TYPE
import godot.tools.common.constants.GODOT_ERROR
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.KT_OBJECT
import godot.tools.common.constants.TO_GODOT_NAME_UTIL_FUNCTION
import godot.tools.common.constants.TYPE_MANAGER
import godot.tools.common.constants.VOID_PTR
import godot.tools.common.constants.godotApiPackage
import kotlin.inc

object ClassGenerator {
    private var nextEngineClassIndex = 0
    private var nextSingletonIndex = 0


    fun generateClass(clazz: EnrichedClass, context: IApiGenerationService): FileSpec {
        val fileBuilder = FileSpec.builder(godotApiPackage, clazz.type)

        val className = clazz.getClassName()

        val classTypeBuilder = TypeSpec
            .classBuilder(className)
            .addModifiers(KModifier.OPEN)

        if (!clazz.isInstantiable) {
            classTypeBuilder.primaryConstructor(
                FunSpec.constructorBuilder()
                    .addModifiers(KModifier.INTERNAL)
                    .build()
            )
        }

        val baseClass = clazz.parent?.getClassName() ?: KT_OBJECT

        return classTypeBuilder
            .superclass(baseClass)
            .generateClassConstructor()
            .generateCommonsForClass(fileBuilder, clazz, false, context)
    }

    fun generateSingleton(clazz: EnrichedClass, context: IApiGenerationService): FileSpec {
        val fileBuilder = FileSpec.builder(godotApiPackage, clazz.type)

        val className = clazz.getClassName()
        val baseClass = clazz.parent?.getClassName() ?: KT_OBJECT

        val singletonBuilder = TypeSpec
            .objectBuilder(className)
            .superclass(baseClass)
            .generateSingletonConstructor()

        return singletonBuilder.generateCommonsForClass(
            fileBuilder,
            clazz,
            true,
            context,
            singletonBuilder
        )
    }

    private fun TypeSpec.Builder.generateClassConstructor(): TypeSpec.Builder {
        addFunction(
            FunSpec.builder("new")
                .addModifiers(KModifier.OVERRIDE)
                .addParameter("scriptIndex", Int::class)
                .returns(Unit::class)
                .addStatement(
                    "createNativeObject($nextEngineClassIndex, scriptIndex)"
                )
                .build()
        )
        ++nextEngineClassIndex
        return this
    }

    private fun TypeSpec.Builder.generateSingletonConstructor(): TypeSpec.Builder {
        addFunction(
            FunSpec.builder("new")
                .addModifiers(KModifier.OVERRIDE)
                .addParameter("scriptIndex", Int::class)
                .returns(Unit::class)
                .addStatement(
                    "getSingleton($nextSingletonIndex)"
                )
                .build()
        )
        ++nextEngineClassIndex
        ++nextSingletonIndex
        return this
    }


    private fun TypeSpec.Builder.generateCommonsForClass(
        fileBuilder: FileSpec.Builder,
        enrichedClass: EnrichedClass,
        isSingleton: Boolean,
        context: IApiGenerationService,
        constantsTypeReceiver: TypeSpec.Builder = TypeSpec.companionObjectBuilder(),
    ): FileSpec {

        addKdoc(enrichedClass)
        addAnnotation(GODOT_BASE_TYPE)

        val name = enrichedClass.type
        if (name == GodotKotlinJvmTypes.refCounted) {
            preventOnDestroyUsage()
        }
        if (name == GodotTypes.node) {
            generateTypesafeRpc()
        }

        val enumExtensions = mutableListOf<FunSpec>()

        for (enum in enrichedClass.enums) {
            val enumAndExtensions = if (enum.isBitField()) {
                BitFieldGenerator.generate(enum, context)
            } else {
                EnumGenerator.generate(enum, context)
            }


            enumExtensions.addAll(enumAndExtensions.second)
            for (typeSpec in enumAndExtensions.first) {
                addType(typeSpec)
            }
        }

        for (constant in enrichedClass.constants) {
            constantsTypeReceiver.addProperty(ConstantGenerator.generate(constant, context))
        }

        for (method in enrichedClass.methods.filter { it.isStatic }) {
            constantsTypeReceiver.addFunction(MethodGenerator.generate(enrichedClass, method, true, isSingleton, context))
        }

        if (constantsTypeReceiver != this) {
            addType(constantsTypeReceiver.build())
        }

        for (signal in enrichedClass.signals) {
            addProperty(SignalGenerator.generate(signal, isSingleton, context))
        }

        for (property in enrichedClass.properties) {
            val propertySpec = PropertyGenerator.generate(property, isSingleton, context) ?: continue
            addProperty(propertySpec)
            if (property.hasSetter && property.isLocalCopyCoreTypes()) {
                addFunction(CoreHelperGenerator.generate(enrichedClass, property, isSingleton, context))
            }
        }

        for (method in enrichedClass.methods.filter { !it.isStatic }) {
            // TODO: Implement native structure when value class are here.
            var shouldGenerate = true
            for (argument in method.arguments) {
                if (context.nativeStructureRepository.findMatchingType(argument) != null) {
                    shouldGenerate = false
                    break
                }
            }
            shouldGenerate = shouldGenerate && context.nativeStructureRepository.findMatchingType(method) == null
            if (shouldGenerate) {
                addFunction(MethodGenerator.generate(enrichedClass, method, false, isSingleton, context))
            }
        }

        val methodBindPtrReceiver = TypeSpec
            .objectBuilder(methodBindingsInnerClassName)

        for (method in enrichedClass.methods.filter { !it.isVirtual }) {
            methodBindPtrReceiver.addProperty(generateMethodVoidPtr(enrichedClass, method))
        }

        val generatedClass = addType(methodBindPtrReceiver.build()).build()

        for (enumExtension in enumExtensions) {
            fileBuilder.addFunction(enumExtension)
        }

        for (import in enrichedClass.additionalImports) {
            fileBuilder.addImport(import.pckge, import.name)
        }

        return fileBuilder
            .addType(generatedClass)
            .generateSuppressWarnings()
            .addFileComment(GENERATED_COMMENT)
            .build()
    }

    private fun generateMethodVoidPtr(enrichedClass: EnrichedClass, method: EnrichedMethod) = PropertySpec
        .builder(method.voidPtrVariableName, VOID_PTR)
        .addModifiers(KModifier.INTERNAL)
        .initializer(
            "%T.getMethodBindPtr(%S,·%S,·%L)",
            TYPE_MANAGER,
            enrichedClass.type,
            method.godotName,
            method.hash
        )
        .build()

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

    private fun FileSpec.Builder.generateSuppressWarnings(): FileSpec.Builder {
        addAnnotation(
            AnnotationSpec.builder(ClassName("kotlin", "Suppress"))
                .addMember(
                    "\"PackageDirectoryMismatch\", \"unused\", \"FunctionName\", \"RedundantModalityModifier\", " +
                        "\"UNCHECKED_CAST\", \"JoinDeclarationAndAssignment\", \"USELESS_CAST\", \"RemoveRedundantQualifierName\", " +
                        "\"NOTHING_TO_INLINE\", \"NON_FINAL_MEMBER_IN_OBJECT\", \"RedundantVisibilityModifier\", " +
                        "\"RedundantUnitReturnType\", \"MemberVisibilityCanBePrivate\""
                )
                .build()
        )
        return this
    }

}
