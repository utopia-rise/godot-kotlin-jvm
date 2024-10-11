package godot.codegen.services.impl

import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.TypeVariableName
import com.squareup.kotlinpoet.UNIT
import com.squareup.kotlinpoet.asClassName
import godot.codegen.constants.VOID_PTR
import godot.codegen.constants.jvmReservedMethods
import godot.codegen.extensions.applyJvmNameIfNecessary
import godot.codegen.extensions.getDefaultValueKotlinString
import godot.codegen.extensions.getTypeClassName
import godot.codegen.extensions.isBitField
import godot.codegen.extensions.isEnum
import godot.codegen.extensions.isLocalCopyCoreTypes
import godot.codegen.extensions.jvmVariantTypeValue
import godot.codegen.models.custom.AdditionalImport
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedConstant
import godot.codegen.models.enriched.EnrichedEnum
import godot.codegen.models.enriched.EnrichedMethod
import godot.codegen.models.enriched.EnrichedProperty
import godot.codegen.models.enriched.EnrichedSignal
import godot.codegen.models.enriched.isSameSignature
import godot.codegen.poet.RegistrationFileSpec
import godot.codegen.repositories.INativeStructureRepository
import godot.codegen.rpc.RpcFunctionMode
import godot.codegen.services.IApiService
import godot.codegen.services.IClassGraphService
import godot.codegen.services.IApiGenerationService
import godot.codegen.traits.CallableTrait
import godot.codegen.traits.addKdoc
import godot.tools.common.constants.TO_GODOT_NAME_UTIL_FUNCTION
import godot.tools.common.constants.CORE_TYPE_HELPER
import godot.tools.common.constants.CORE_TYPE_LOCAL_COPY
import godot.tools.common.constants.GENERATED_COMMENT
import godot.tools.common.constants.GODOT_BASE_TYPE
import godot.tools.common.constants.GODOT_ERROR
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.INTERNALS
import godot.tools.common.constants.KT_OBJECT
import godot.tools.common.constants.VARIANT_CASTER_ANY
import godot.tools.common.constants.VARIANT_PARSER_LONG
import godot.tools.common.constants.godotPackage
import godot.tools.common.constants.godotCorePackage
import java.io.File
import java.util.*

private const val methodBindingsInnerClassName = "MethodBindings"

class ApiGenerationService(
    private val classGraphService: IClassGraphService,
    private val apiService: IApiService,
    private val nativeStructureRepository: INativeStructureRepository
) : IApiGenerationService {
    private var nextEngineClassIndex = 0

    override fun generateCore(outputDir: File) {
        val apiClasses = apiService.getClasses().filter {
            it.name == "Object" || it.name == "RefCounted"
        }

        for (enrichedClass in apiClasses) {
            for (property in enrichedClass.properties) {
                apiService.updatePropertyIfShouldUseSuper(enrichedClass.name, property.name)
            }
            generateClass(enrichedClass).writeTo(outputDir)
        }

        for (enum in apiService.getGlobalEnums()) {
            val enumAndExtensions = generateEnum(enum)
            val fileBuilder = FileSpec.builder(godotPackage, enum.name)
            for (typeSpec in enumAndExtensions.first) {
                fileBuilder.addType(typeSpec)
            }
            for (extension in enumAndExtensions.second) {
                fileBuilder.addFunction(extension)
            }

            fileBuilder
                .addFileComment(GENERATED_COMMENT)
                .build()
                .writeTo(outputDir)
        }
    }

    override fun generateApi(outputDir: File) {
        apiService.findGetSetMethodsAndUpdateProperties()

        //TODO: generateEngineTypesRegistration

        val registrationFileSpec = RegistrationFileSpec()

        //We first generate singletons so that their index in engine types and engine singleton lists are same.
        for (singleton in apiService.getSingletons()) {
            for (property in singleton.properties) {
                apiService.updatePropertyIfShouldUseSuper(singleton.name, property.name)
            }

            generateSingleton(singleton).writeTo(outputDir)
            generateEngineTypesRegistrationForSingleton(registrationFileSpec, singleton)
        }

        for (enrichedClass in apiService.getClasses()) {
            for (property in enrichedClass.properties) {
                apiService.updatePropertyIfShouldUseSuper(enrichedClass.name, property.name)
            }

            if (enrichedClass.name != "Object" && enrichedClass.name != "RefCounted") {
                generateClass(enrichedClass).writeTo(outputDir)
            }
            generateEngineTypesRegistrationForClass(registrationFileSpec, enrichedClass)
        }

        registrationFileSpec.build().writeTo(outputDir)
    }


    override fun generateSingleton(singletonClass: EnrichedClass): FileSpec {
        val fileBuilder = FileSpec.builder(godotPackage, singletonClass.name)
        fileBuilder.generateEngineIndexesForClass(singletonClass)

        val singletonTypeName = singletonClass.getTypeClassName()
        val baseClass = singletonClass.inherits ?: GodotKotlinJvmTypes.obj
        val singletonBuilder = TypeSpec
            .objectBuilder(singletonTypeName.className)
            .superclass(ClassName(godotPackage, baseClass))
            .generateSingletonConstructor(singletonClass.engineClassDBIndexName)

        return generateCommonsForClass(
            fileBuilder,
            singletonBuilder,
            singletonClass,
            true,
            singletonBuilder
        )
    }

    override fun generateClass(clazz: EnrichedClass): FileSpec {
        val fileBuilder = FileSpec.builder(godotPackage, clazz.name)
        fileBuilder.generateEngineIndexesForClass(clazz)

        val className = clazz.getTypeClassName()

        val classTypeBuilder = TypeSpec
            .classBuilder(className.className)
            .addModifiers(KModifier.OPEN)

        if (!clazz.internal.isInstantiable) {
            classTypeBuilder.primaryConstructor(
                FunSpec.constructorBuilder()
                    .addModifiers(KModifier.INTERNAL)
                    .build()
            )
        }

        val baseClass = clazz.inherits
        if (!baseClass.isNullOrEmpty()) {
            classTypeBuilder.superclass(ClassName(godotPackage, baseClass))
        }

        classTypeBuilder.generateClassConstructor(clazz.engineClassDBIndexName)

        return generateCommonsForClass(fileBuilder, classTypeBuilder, clazz, false)
    }

    private fun generateCommonsForClass(
        fileBuilder: FileSpec.Builder,
        classTypeBuilder: TypeSpec.Builder,
        enrichedClass: EnrichedClass,
        isSingleton: Boolean,
        constantsTypeReceiver: TypeSpec.Builder = TypeSpec.companionObjectBuilder()
    ): FileSpec {

        classTypeBuilder
            .addKdoc(enrichedClass)
            .addAnnotation(GODOT_BASE_TYPE)

        val name = enrichedClass.name
        if (name == GodotKotlinJvmTypes.obj) {
            classTypeBuilder.superclass(KT_OBJECT)
        }
        if (name == GodotKotlinJvmTypes.refCounted) {
            classTypeBuilder.preventOnDestroyUsage()
        }
        if (name == GodotTypes.node) {
            classTypeBuilder.generateTypesafeRpc()
        }

        val enumExtensions = mutableListOf<FunSpec>()

        for (enum in enrichedClass.enums) {
            val enumAndExtensions = generateEnum(enum, name)
            enumExtensions.addAll(enumAndExtensions.second)
            for (typeSpec in enumAndExtensions.first) {
                classTypeBuilder.addType(typeSpec)
            }
        }

        for (constant in enrichedClass.constants) {
            constantsTypeReceiver.addProperty(generateConstant(constant, name))
        }

        for (method in enrichedClass.methods.filter { it.internal.isStatic }) {
            constantsTypeReceiver.addFunction(generateMethod(enrichedClass, method, true, isSingleton))
        }

        if (constantsTypeReceiver != classTypeBuilder) {
            constantsTypeReceiver.build().let { classTypeBuilder.addType(it) }
        }

        for (signal in enrichedClass.signals) {
            classTypeBuilder.addProperty(generateSignals(signal, isSingleton))
        }

        for (property in enrichedClass.properties) {
            val propertySpec = generateProperty(enrichedClass, property, isSingleton) ?: continue
            classTypeBuilder.addProperty(propertySpec)
            if (property.hasValidSetterInClass && property.isLocalCopyCoreTypes()) {
                classTypeBuilder.addFunction(generateCoreTypeHelper(enrichedClass, property, isSingleton))
            }
        }

        for (method in enrichedClass.methods.filter { !it.internal.isStatic }) {
            // TODO: Implement native structure when value class are here.
            var shouldGenerate = true
            for (argument in method.arguments) {
                if (nativeStructureRepository.findMatchingType(argument) != null) {
                    shouldGenerate = false
                    break
                }
            }
            shouldGenerate = shouldGenerate && nativeStructureRepository.findMatchingType(method) == null
            if (shouldGenerate) {
                classTypeBuilder.addFunction(generateMethod(enrichedClass, method, false, isSingleton))
            }
        }

        val methodBindPtrReceiver = TypeSpec
            .objectBuilder(methodBindingsInnerClassName)

        for (method in enrichedClass.methods.filter { !it.internal.isVirtual }) {
            methodBindPtrReceiver.addProperty(generateMethodVoidPtr(enrichedClass, method))
        }

        val generatedClass = classTypeBuilder
            .addType(methodBindPtrReceiver.build())
            .build()

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

    private fun FileSpec.Builder.generateEngineIndexesForClass(clazz: EnrichedClass) {
        addProperty(
            PropertySpec
                .builder(clazz.engineClassDBIndexName, INT, KModifier.CONST)
                .initializer("%L", nextEngineClassIndex)
                .addModifiers(KModifier.PRIVATE)
                .build()
        )
        ++nextEngineClassIndex
    }

    override fun generateEnum(enum: EnrichedEnum, containingClassName: String?): Pair<List<TypeSpec>, List<FunSpec>> {
        return if (enum.internal.isBitField) {
            val packageName = if (enum.encapsulatingType == null) {
                godotPackage
            } else {
                "$godotPackage.${enum.encapsulatingType.type}"
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

            for (value in enum.internal.values) {
                val bitFieldValueClassName = ClassName(packageName, bitFlagValueClassName)
                bitfieldInterfaceCompanion
                    .addProperty(
                        PropertySpec.builder(value.name, bitFieldInterfaceName)
                            .initializer(CodeBlock.of("%T(%L)", bitFieldValueClassName, value.value))
                            .build()
                    )
            }

            bitfieldInterface.addType(bitfieldInterfaceCompanion.build())

            listOf(bitfieldInterface.build(), bitFlagValueClass) to extensionsOperator
        } else {
            val enumBuilder = TypeSpec.enumBuilder(enum.name)
            enumBuilder.primaryConstructor(
                FunSpec.constructorBuilder()
                    .addParameter("id", Long::class)
                    .addStatement("this.%N = %N", "id", "id")
                    .build()
            )
            enumBuilder.addProperty("id", Long::class)

            for (value in enum.internal.values) {
                val valueName = value.name
                enumBuilder.addEnumConstant(
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
                        .returns(ClassName("${godotPackage}.${containingClassName ?: ""}", enum.name))
                        .addParameter("value", Long::class)
                        .addStatement("return·entries.single·{·it.%N·==·%N·}", "id", "value")
                        .build()
                )
                .build()
            enumBuilder.addType(companion)
            listOf(enumBuilder.build()) to listOf()
        }
    }

    override fun generateConstant(constant: EnrichedConstant, containingClassName: String?): PropertySpec {
        val constantName = constant.internal.name
        return PropertySpec
            .builder(constantName, constant.getTypeClassName().typeName)
            .addModifiers(KModifier.CONST, KModifier.FINAL)
            .initializer("%L", constant.internal.value)
            .also {
                it.addKdoc(constant)
            }
            .build()
    }

    override fun generateEngineTypesRegistrationForClass(
        registrationFileSpec: RegistrationFileSpec,
        clazz: EnrichedClass
    ) {
        generateCommonRegistrationForClass(
            registrationFileSpec,
            clazz
        ) { addRegisterEngineType(it, false) }
    }

    override fun generateEngineTypesRegistrationForSingleton(
        registrationFileSpec: RegistrationFileSpec,
        singleton: EnrichedClass
    ) {
        generateCommonRegistrationForClass(
            registrationFileSpec,
            singleton
        ) {
            addRegisterEngineType(it, true)
            addRegisterSingleton(it)
        }
    }

    private fun generateSignals(signal: EnrichedSignal, isSingleton: Boolean): PropertySpec {
        val signalClass = signal.getTypeClassName()
        val arguments = signal.arguments

        val builder = PropertySpec
            .builder(
                signal.name,
                signalClass.typeName
            )
            .addKdoc(signal)
            .delegate(
                "%T",
                ClassName(godotCorePackage, "Signal" + arguments.size)
            )

        if (isSingleton) {
            builder.addAnnotation(JvmStatic::class)
        }

        return builder.build()
    }

    private fun generateProperty(enrichedClass: EnrichedClass, property: EnrichedProperty, isSingleton: Boolean): PropertySpec? {
        if (!property.hasValidGetterInClass && !property.hasValidSetterInClass) return null

        // We can't trust the property alone because some of them don't have a getter so we have to check on the setter's first parameter as well.
        val argumentIndex = if (property.isIndexed) 1 else 0
        val propertyTypeName = (property.getterMethod ?: property.setterMethod!!.arguments[argumentIndex]).getCastedType()

        val propertyType = propertyTypeName.typeName
        val propertySpecBuilder = PropertySpec.builder(property.name, propertyType).addModifiers(KModifier.FINAL)

        if (isSingleton) {
            propertySpecBuilder.addAnnotation(JvmStatic::class)
        }

        if (property.hasValidGetterInClass) {
            val methodName = property.getter

            propertySpecBuilder.getter(
                FunSpec.getterBuilder()
                    .addStatement(
                        if (property.isIndexed) {
                            val indexArgument = property.getterMethod!!.arguments[0]
                            if (indexArgument.isEnum() || indexArgument.isBitField()) {
                                val argumentValue = apiService.findEnumValue(
                                    indexArgument.getBufferType(),
                                    property.internal.index!!.toLong()
                                ).name
                                "return $methodName($argumentValue)"
                            } else {
                                "return $methodName(${property.internal.index})"
                            }

                        } else {
                            "return $methodName()"
                        }
                    )
                    .addAnnotation(
                        AnnotationSpec.builder(JvmName::class)
                            .addMember("\"${property.name}Property\"")
                            .build()
                    )
                    .addModifiers(KModifier.INLINE)
                    .build()
            )
        } else {
            propertySpecBuilder.getter(
                FunSpec.getterBuilder()
                    .addStatement(
                        "%L %T(%S)",
                        "throw",
                        UninitializedPropertyAccessException::class,
                        "Cannot access property ${property.name}: has no getter"
                    )
                    .build()
            )
        }

        val getterAndSetterAreCompatible = property.getterMethod?.getCastedType() == property.setterMethod?.arguments?.get(argumentIndex)?.getCastedType()

        // We don't generate the setter if its type doesn't match the getter.
        if (property.hasValidSetterInClass && getterAndSetterAreCompatible) {
            val methodName = property.setter

            propertySpecBuilder.mutable().setter(
                FunSpec.setterBuilder()
                    .addParameter("value", property.getCastedType().typeName)
                    .addStatement(
                        if (property.isIndexed) {
                            val indexArgument = property.setterMethod!!.arguments[0]
                            if (indexArgument.isEnum() || indexArgument.isBitField()) {
                                val argumentValue = apiService.findEnumValue(
                                    indexArgument.getBufferType(),
                                    property.internal.index!!.toLong()
                                ).name
                                "$methodName($argumentValue, value)"
                            } else {
                                "$methodName(${property.internal.index}, value)"
                            }

                        } else {
                            "$methodName(value)"
                        }

                    )
                    .addModifiers(KModifier.INLINE)
                    .addAnnotation(
                        AnnotationSpec.builder(JvmName::class)
                            .addMember("\"${property.name}Property\"")
                            .build()
                    )
                    .build()
            )
        }

        if (property.isLocalCopyCoreTypes()) {
            propertySpecBuilder.addAnnotation(CORE_TYPE_LOCAL_COPY)
        }

        propertySpecBuilder.addKdoc(property)

        return propertySpecBuilder.build()
    }

    private fun generateCoreTypeHelper(enrichedClass: EnrichedClass, property: EnrichedProperty, isSingleton: Boolean): FunSpec {
        val parameterTypeName = property.getCastedType()
        val parameterName = property.name
        val propertyFunSpec = FunSpec.builder("${parameterName}Mutate").addModifiers(KModifier.FINAL)

        if (isSingleton) {
            propertyFunSpec.addAnnotation(JvmStatic::class)
        }

        return propertyFunSpec
            .addParameter(
                ParameterSpec.builder(
                    "block",
                    LambdaTypeName.get(
                        receiver = parameterTypeName.typeName,
                        returnType = UNIT
                    )
                ).build()
            )
            .addAnnotation(CORE_TYPE_HELPER)
            .returns(parameterTypeName.typeName)
            .addStatement(
                """return $parameterName.apply{
                                            |    block(this)
                                            |    $parameterName = this
                                            |}
                                            |""".trimMargin()
            ).apply {
                val kDoc = buildString {
                    val propertyKdoc =
                        property.sanitizedDocumentation
                    if (propertyKdoc != null) {
                        appendLine(propertyKdoc.replace("/*", "&#47;*"))
                        appendLine()
                    }

                    appendLine(
                        """This is a helper function to make dealing with local copies easier.
                    |
                    |For more information, see our [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
                    |
                    |Allow to directly modify the local copy of the property and assign it back to the Object.
                    |
                    |Prefer that over writing:
                    |``````
                    |val myCoreType = ${enrichedClass.name.lowercase()}.${property.name}
                    |//Your changes
                    |${enrichedClass.name.lowercase()}.${property.name} = myCoreType
                    |``````
                    |""".trimMargin()
                    )
                }
                addKdoc(kDoc)
            }
            .build()
    }

    private fun generateMethod(enrichedClass: EnrichedClass, method: EnrichedMethod, isStatic: Boolean, isSingleton: Boolean): FunSpec {
        val modifiers = mutableListOf<KModifier>()

        // This method already exist in the Kotlin class Any. We have to override it because Godot uses the same name in Object.
        if (method.name == "toString") {
            modifiers.add(KModifier.OVERRIDE)
        }

        // Godot doesn't override its methods, they are either final or meant to be implemented by script or extension.
        if (method.internal.isVirtual) {
            modifiers.add(KModifier.OPEN)
        } else {
            modifiers.add(KModifier.FINAL)
        }

        val generatedFunBuilder = FunSpec
            .builder(method.name)
            .addModifiers(modifiers)
            .applyJvmNameIfNecessary(method.name)

        val methodTypeName = method.getCastedType()
        val shouldReturn = method.getTypeClassName().typeName != UNIT

        if (shouldReturn) {
            generatedFunBuilder.returns(methodTypeName.typeName)

            if (method.isEnum()) {
                val methodTypeSimpleName = methodTypeName.className.simpleName
                if (methodTypeSimpleName.contains('.')) {
                    enrichedClass.additionalImports.add(
                        AdditionalImport(
                            methodTypeName.className.packageName,
                            methodTypeSimpleName.split('.')[0]
                        )
                    )
                }
            }
        }

        //TODO: move adding arguments to generatedFunBuilder to separate function
        val callArgumentsAsString = buildCallArgumentsString(
            enrichedClass,
            generatedFunBuilder,
            method
        ) //cannot be inlined as it also adds the arguments to the generatedFunBuilder

        if (method.internal.isVararg) {
            generatedFunBuilder.addParameter(
                "__var_args",
                ANY.copy(nullable = true),
                KModifier.VARARG
            )
        }

        generatedFunBuilder.generateCodeBlock(enrichedClass, method, callArgumentsAsString, isStatic)

        generatedFunBuilder.addKdoc(method)

        for (jvmReservedMethod in jvmReservedMethods) {
            if (method.isSameSignature(jvmReservedMethod) && !method.internal.isVirtual) {
                generatedFunBuilder.addAnnotation(
                    AnnotationSpec.builder(JvmName::class)
                        .addMember(
                            CodeBlock.of(
                                "\"%L%L\"",
                                enrichedClass.name.replaceFirstChar { it.lowercase(Locale.US) },
                                method.name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.US) else it.toString() }
                            )
                        )
                        .build()
                )

            }
        }

        if (isSingleton) {
            generatedFunBuilder.addAnnotation(JvmStatic::class)
        }

        return generatedFunBuilder.build()
    }

    private fun generateMethodVoidPtr(enrichedClass: EnrichedClass, method: EnrichedMethod) = PropertySpec
        .builder("${method.name}Ptr", VOID_PTR)
        .addModifiers(KModifier.INTERNAL)
        .initializer(
            "%T.getMethodBindPtr(%S,·%S,·%L)",
            INTERNALS,
            enrichedClass.internal.name,
            method.internal.name,
            method.internal.hash
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

    private fun TypeSpec.Builder.generateSingletonConstructor(classIndexName: String): TypeSpec.Builder {
        addFunction(
            FunSpec.builder("new")
                .addModifiers(KModifier.OVERRIDE)
                .addParameter("scriptIndex", Int::class)
                .returns(Unit::class)
                .addStatement(
                    "%T.getSingleton(this, %M)",
                    INTERNALS,
                    MemberName(godotPackage, classIndexName),
                )
                .build()
        )
        return this
    }

    private fun TypeSpec.Builder.generateClassConstructor(classIndexName: String): TypeSpec.Builder {
        addFunction(
            FunSpec.builder("new")
                .addModifiers(KModifier.OVERRIDE)
                .addParameter("scriptIndex", Int::class)
                .returns(Unit::class)
                .addStatement(
                    "%T.callConstructor(this, %M, scriptIndex)",
                    INTERNALS,
                    MemberName(godotPackage, classIndexName),
                )
                .build()
        )
        return this
    }

    private fun buildCallArgumentsString(
        cl: EnrichedClass,
        generatedFunBuilder: FunSpec.Builder,
        method: EnrichedMethod
    ): String {
        return buildString {
            method.arguments.withIndex().forEach {
                val index = it.index
                val argument = it.value

                val shouldAddComa = index != 0

                if (shouldAddComa) append(",·")

                val sanitisedArgumentName = classGraphService.getSanitisedArgumentName(cl, method, index)

                append("%T·to·$sanitisedArgumentName${argument.getToBufferCastingMethod()}")

                if (argument.isEnum()) append(".id")
                if (argument.isBitField()) append(".flag")

                val argumentTypeClassName = argument.getCastedType()
                val parameterBuilder = ParameterSpec.builder(
                    sanitisedArgumentName,
                    argumentTypeClassName.typeName
                )

                val defaultValueKotlinCode = argument.getDefaultValueKotlinString()
                val appliedDefault = if ((argument.isEnum() || argument.isBitField()) && defaultValueKotlinCode != null) {
                    apiService.findEnumValue(
                        argumentTypeClassName,
                        defaultValueKotlinCode.first.toLong()
                    ).name
                } else {
                    defaultValueKotlinCode?.first
                }
                if (appliedDefault != null) {
                    parameterBuilder.defaultValue(appliedDefault, *defaultValueKotlinCode!!.second)

                    // add @JvmOverloads annotation for java support if not already present
                    val jvmOverloadAnnotationSpec = AnnotationSpec.builder(JvmOverloads::class.asClassName()).build()
                    if (!generatedFunBuilder.annotations.contains(jvmOverloadAnnotationSpec)) {
                        generatedFunBuilder.addAnnotation(jvmOverloadAnnotationSpec)
                    }
                }

                generatedFunBuilder.addParameter(parameterBuilder.build())
            }
            if (method.internal.isVararg && isNotEmpty()) append(",·")
        }
    }

    private fun FunSpec.Builder.generateCodeBlock(
        clazz: EnrichedClass,
        enrichedMethod: EnrichedMethod,
        callArgumentsAsString: String,
        isStatic: Boolean
    ) {
        if (!enrichedMethod.internal.isVirtual) {
            generateJvmMethodCall(
                clazz,
                callable = enrichedMethod,
                callArgumentsAsString = callArgumentsAsString,
                isStatic = isStatic
            )
        } else if (enrichedMethod.getTypeClassName().typeName != UNIT) {
            addStatement(
                "%L·%T(%S)",
                "throw",
                NotImplementedError::class,
                "${enrichedMethod.internal.name} is not implemented for ${clazz.internal.name}"
            )
        }
    }

    private fun <T : CallableTrait> FunSpec.Builder.generateJvmMethodCall(
        clazz: EnrichedClass,
        callable: T,
        callArgumentsAsString: String,
        isStatic: Boolean
    ): FunSpec.Builder {
        val ktVariantClassNames = callable.arguments.map {
            it.jvmVariantTypeValue
        }.toTypedArray()

        if (callable.isVararg) {
            addStatement(
                "%T.writeArguments($callArgumentsAsString·*__var_args.map·{·%T·to·it·}.toTypedArray())",
                INTERNALS,
                *ktVariantClassNames,
                VARIANT_CASTER_ANY
            )
        } else {
            addStatement(
                "%T.writeArguments($callArgumentsAsString)",
                INTERNALS,
                *ktVariantClassNames
            )
        }

        val returnTypeVariantTypeClass = callable.jvmVariantTypeValue

        val rawPtr = if (isStatic) {
            "0" //nullpointer
        } else {
            "rawPtr"
        }

        addStatement(
            "%T.callMethod($rawPtr, %T.%M, %T)",
            INTERNALS,
            clazz.getTypeClassName().className.nestedClass(methodBindingsInnerClassName),
            MemberName("godot", callable.voidPtrVariableName),
            returnTypeVariantTypeClass
        )

        val methodReturnType = callable.getBufferType()

        if (methodReturnType.typeName != UNIT) {
            if (callable.isEnum()) {
                addStatement(
                    "return·${methodReturnType.className.simpleNames.joinToString(".")}.from(%T.readReturnValue(%T)·as·%T)",
                    INTERNALS,
                    VARIANT_PARSER_LONG,
                    LONG
                )
            } else if (callable.isBitField()) {
                val simpleNames = methodReturnType.className.simpleNames
                addStatement(
                    "return·%T(%T.readReturnValue(%T)·as·%T)",
                    ClassName(
                        "${methodReturnType.className.packageName}.${simpleNames.subList(0, simpleNames.size - 1).joinToString(".")}",
                        "${callable.getTypeClassName().className.simpleName}Value"
                    ),
                    INTERNALS,
                    VARIANT_PARSER_LONG,
                    LONG
                )
            } else {
                addStatement(
                    "return·(%T.readReturnValue(%T)·as·%T)${callable.getFromBufferCastingMethod()}",
                    INTERNALS,
                    returnTypeVariantTypeClass,
                    methodReturnType.typeName
                )
            }
        }
        return this
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

    private fun generateCommonRegistrationForClass(
        registrationFileSpec: RegistrationFileSpec,
        clazz: EnrichedClass,
        registrationFunc: RegistrationFileSpec.(EnrichedClass) -> Unit
    ) {
        registrationFileSpec.registrationFunc(clazz)

        registrationFileSpec.registerMethodsFunBuilder.addStatement(
            "%T",
            clazz.getTypeClassName().className.nestedClass(methodBindingsInnerClassName)
        )
    }

    private fun RegistrationFileSpec.addRegisterEngineType(clazz: EnrichedClass, isSingleton: Boolean) {
        val formatString = if (isSingleton) {
            "%T.registerEngineType(%S, %T::class) { %T }"
        } else {
            "%T.registerEngineType(%S, %T::class, ::%T)"
        }
        val typeName = clazz.getTypeClassName().typeName
        registerTypesFunBuilder.addStatement(
            formatString,
            INTERNALS,
            clazz.internal.name,
            typeName,
            typeName
        )
    }

    private fun RegistrationFileSpec.addRegisterSingleton(clazz: EnrichedClass) {
        registerTypesFunBuilder.addStatement(
            "%T.registerSingleton(%S)",
            INTERNALS,
            clazz.name
        )
    }

    private fun TypeSpec.Builder.generateOperatorMethods(
        operations: Array<String>,
        enum: EnrichedEnum,
        isOperator: Boolean = false
    ) {
        val packageName = if (enum.encapsulatingType == null) {
            godotPackage
        } else {
            "$godotPackage.${enum.encapsulatingType.type}"
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

    companion object {
        private const val BIT_FLAG_VALUE_MEMBER = "flag"

        fun generateBitFlagExtensionsOperators(
            bitOperations: Array<String>,
            enum: EnrichedEnum,
            isOperator: Boolean = false
        ): List<FunSpec> {
            val packageName = if (enum.encapsulatingType == null) {
                godotPackage
            } else {
                "$godotPackage.${enum.encapsulatingType.type}"
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
}
