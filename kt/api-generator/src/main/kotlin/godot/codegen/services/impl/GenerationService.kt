package godot.codegen.services.impl

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import godot.codegen.constants.VOID_PTR
import godot.codegen.constants.jvmReservedMethods
import godot.codegen.exceptions.ClassGenerationException
import godot.codegen.extensions.*
import godot.codegen.extensions.applyJvmNameIfNecessary
import godot.codegen.models.custom.AdditionalImport
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedConstant
import godot.codegen.models.enriched.EnrichedEnum
import godot.codegen.models.enriched.EnrichedMethod
import godot.codegen.models.enriched.EnrichedProperty
import godot.codegen.models.enriched.EnrichedSignal
import godot.codegen.models.enriched.isSameSignature
import godot.codegen.models.enriched.toGetterCallable
import godot.codegen.models.enriched.toSetterCallable
import godot.codegen.poet.RegistrationFileSpec
import godot.codegen.repositories.INativeStructureRepository
import godot.codegen.rpc.RpcFunctionMode
import godot.codegen.services.IClassGraphService
import godot.codegen.services.IEnumService
import godot.codegen.services.IGenerationService
import godot.codegen.traits.CallableTrait
import godot.codegen.traits.addKdoc
import godot.tools.common.constants.CORE_TYPE_LOCAL_COPY
import godot.tools.common.constants.CORE_TYPE_HELPER
import godot.tools.common.constants.GENERATED_COMMENT
import godot.tools.common.constants.GODOT_BASE_TYPE
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.KT_OBJECT
import godot.tools.common.constants.TRANSFER_CONTEXT
import godot.tools.common.constants.TYPE_MANAGER
import godot.tools.common.constants.VARIANT_TYPE_ANY
import godot.tools.common.constants.VARIANT_TYPE_LONG
import godot.tools.common.constants.godotApiPackage
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.godotUtilPackage
import godot.tools.common.constants.signalPackage
import java.util.*

private const val methodBindingsInnerClassName = "MethodBindings"

class GenerationService(
    private val classGraphService: IClassGraphService,
    private val enumService: IEnumService,
    private val nativeStructureRepository: INativeStructureRepository
) : IGenerationService {
    private var nextEngineClassIndex = 0
    private var nextEngineMethodIndex = 0

    override fun generateSingleton(singletonClass: EnrichedClass): FileSpec {
        val singletonTypeName = singletonClass.getTypeClassName()
        val baseClass = singletonClass.inherits ?: GodotKotlinJvmTypes.obj
        val classTypeBuilder = TypeSpec
            .objectBuilder(singletonTypeName.className)
            .superclass(ClassName(godotApiPackage, baseClass))

        classTypeBuilder.generateSingletonConstructor(singletonClass.engineClassDBIndexName)

        return generateCommonsForClass(
            classTypeBuilder,
            singletonClass,
            classTypeBuilder
        )
    }

    override fun generateClass(clazz: EnrichedClass): FileSpec {
        val className = clazz.getTypeClassName()
        val classTypeBuilder = TypeSpec.classBuilder(className.className).addModifiers(KModifier.OPEN)

        if (!clazz.internal.isInstantiable) {
            classTypeBuilder.primaryConstructor(
                FunSpec.constructorBuilder()
                    .addModifiers(KModifier.INTERNAL)
                    .build()
            )
        }

        val baseClass = clazz.inherits
        if (!baseClass.isNullOrEmpty()) {
            classTypeBuilder.superclass(ClassName(godotApiPackage, baseClass))
        }

        classTypeBuilder.generateClassConstructor(clazz.engineClassDBIndexName)

        return generateCommonsForClass(classTypeBuilder, clazz)
    }

    private fun generateCommonsForClass(
        classTypeBuilder: TypeSpec.Builder,
        enrichedClass: EnrichedClass,
        constantsTypeReceiver: TypeSpec.Builder = TypeSpec.companionObjectBuilder()
    ): FileSpec {
        val name = enrichedClass.name
        val methodBindPtrReceiver = TypeSpec
            .objectBuilder(methodBindingsInnerClassName)
            .addModifiers(KModifier.INTERNAL)

        classTypeBuilder
            .addKdoc(enrichedClass)
            .addAnnotation(GODOT_BASE_TYPE)

        if (name == GodotKotlinJvmTypes.obj) {
            classTypeBuilder.superclass(KT_OBJECT)
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

        for (method in enrichedClass.methods) {
            methodBindPtrReceiver.addProperty(generateMethodVoidPtr(enrichedClass, method))
        }

        for (method in enrichedClass.methods.filter { it.internal.isStatic }) {
            constantsTypeReceiver.addFunction(generateMethod(enrichedClass, method, true))
        }

        if (constantsTypeReceiver != classTypeBuilder) {
            constantsTypeReceiver.build().let { classTypeBuilder.addType(it) }
        }

        for (signal in enrichedClass.signals) {
            classTypeBuilder.addProperty(generateSignals(signal, name))
        }

        for (property in enrichedClass.properties) {
            val propertySpec = generateProperty(enrichedClass, property) ?: continue
            classTypeBuilder.addProperty(propertySpec)
            if (property.hasValidSetterInClass && property.isCoreTypeReimplementedInKotlin()) {
                classTypeBuilder.addFunction(generateCoreTypeHelper(enrichedClass, property))
            }
        }

        for (method in enrichedClass.methods.filter { !it.internal.isStatic }.filter { !it.isGetterOrSetter }) {
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
                classTypeBuilder.addFunction(generateMethod(enrichedClass, method))
            }
        }

        val generatedClass = classTypeBuilder
            .addType(methodBindPtrReceiver.build())
            .build()

        val fileBuilder = FileSpec
            .builder(godotApiPackage, generatedClass.name ?: throw ClassGenerationException(enrichedClass))
            .addType(generatedClass)

        for (enumExtension in enumExtensions) {
            fileBuilder.addFunction(enumExtension)
        }

        for (import in enrichedClass.additionalImports) {
            fileBuilder.addImport(import.pckge, import.name)
        }

        fileBuilder.generateSuppressWarnings()

        return fileBuilder
            .addFileComment(GENERATED_COMMENT)
            .build()
    }

    override fun generateEngineIndexesForClass(fileSpecBuilder: FileSpec.Builder, clazz: EnrichedClass) {
        fileSpecBuilder.addProperty(
            PropertySpec
                .builder(clazz.engineClassDBIndexName, INT, KModifier.CONST)
                .initializer("%L", nextEngineClassIndex)
                .addModifiers(KModifier.INTERNAL)
                .build()
        )

        ++nextEngineClassIndex
    }

    override fun generateEnum(enum: EnrichedEnum, containingClassName: String?): Pair<List<TypeSpec>, List<FunSpec>> {
        return if (enum.internal.isBitField) {
            val packageName = if (enum.encapsulatingType == null) {
                godotApiPackage
            } else {
                "$godotApiPackage.${enum.encapsulatingType.type}"
            }

            val bitFieldInterfaceName = ClassName(packageName, enum.name)

            val bitFlagValueClassName = "${enum.name}Value"

            val bitFlagValueClass = TypeSpec.classBuilder(bitFlagValueClassName)
                .addSuperinterface(bitFieldInterfaceName)
                .addModifiers(KModifier.INTERNAL, KModifier.VALUE)
                .addAnnotation(JvmInline::class)
                .addProperty(
                    PropertySpec.builder(BIT_FLAG_VALUE_MEMBER, LONG)
                        .addModifiers(KModifier.OVERRIDE)
                        .initializer(BIT_FLAG_VALUE_MEMBER)
                        .build()
                )
                .primaryConstructor(
                    FunSpec.constructorBuilder()
                        .addModifiers(KModifier.INTERNAL)
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
                        .addParameter("value", Long::class)
                        .addStatement("return entries.single { it.%N == %N }", "id", "value")
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

    private fun generateSignals(signal: EnrichedSignal, containingClassName: String): PropertySpec {
        val signalClass = signal.getTypeClassName()
        val arguments = signal.arguments

        val builder = PropertySpec
            .builder(
                signal.name,
                signalClass.typeName
            )
            .addKdoc(signal)

        if (arguments.isEmpty()) {
            builder.delegate(
                "%M()",
                MemberName(signalPackage, "signal")
            )
        } else {
            builder.delegate("%M(${
                arguments
                    .map { "\"${it.name}\"" + if (it != arguments.last()) ", " else "" }
                    .reduce { acc, s -> acc + s }
            })",
                MemberName(signalPackage, "signal")
            )
        }
        return builder.build()
    }

    private fun generateProperty(enrichedClass: EnrichedClass, property: EnrichedProperty): PropertySpec? {
        if (!property.hasValidGetterInClass &&
            !property.hasValidSetterInClass &&
            !property.shouldUseSuperSetter &&
            !property.shouldUseSuperGetter
        ) return null

//        if (hasValidGetter && !validGetter.returnType.isEnum() && type != validGetter.returnType) {
//            type = validGetter.returnType
//        }

        // Sorry for this, CPUParticles has "scale" property overrides ancestor's "scale", but mismatches type
//        if (clazz.newName == "CPUParticles" && newName == "scale") newName = "_scale"

        val modifiers = mutableListOf<KModifier>()

        if (classGraphService.doAncestorsHaveProperty(
                enrichedClass,
                property
            )
        ) {
            modifiers.add(KModifier.OVERRIDE)
        } else if (property.getterMethod?.internal?.isVirtual == true || property.setterMethod?.internal?.isVirtual == true) {
            modifiers.add(KModifier.OPEN)
        }

        val propertyTypeName = property.getCastedType()
        val propertyType = propertyTypeName.typeName
        val propertySpecBuilder = PropertySpec
            .builder(
                property.name,
                propertyType,
                modifiers
            )

        fun generateSuperGetter(): FunSpec {
            val methodName = property.getter

            return FunSpec.getterBuilder()
                .addStatement(
                    "return super.$methodName()"
                )
                .addAnnotation(
                    AnnotationSpec.builder(JvmName::class)
                        .addMember("\"${methodName}_prop\"")
                        .build()
                )
                .build()
        }

        fun generateSuperSetter(): FunSpec {
            val methodName = property.setter

            return FunSpec.setterBuilder()
                .addParameter("value", property.getCastedType().typeName)
                .addStatement(
                    "super.$methodName(value)"
                )
                .addAnnotation(
                    AnnotationSpec.builder(JvmName::class)
                        .addMember("\"${methodName}_prop\"")
                        .build()
                )
                .build()
        }

        if (property.hasValidSetterInClass) {
            propertySpecBuilder.mutable()

            val variantTypeToArgumentString = buildString {
                append("%T·to·value")

                if (property.isEnum()) {
                    append(".id")
                }

                if (property.isBitField()) {
                    append(".flag")
                }

                append(property.getToBufferCastingMethod())
            }

            val argumentStringTemplate = if (property.isIndexed) {
                "%T to ${property.internal.index}L, $variantTypeToArgumentString"
            } else {
                variantTypeToArgumentString
            }
            propertySpecBuilder.setter(
                FunSpec.setterBuilder()
                    .addParameter("value", propertyType)
                    .generateJvmMethodCall(
                        clazz = enrichedClass,
                        callable = property.toSetterCallable(),
                        callArgumentsAsString = argumentStringTemplate,
                        isStatic = false
                    )
                    .build()
            )
        } else if (property.shouldUseSuperSetter) {
            propertySpecBuilder.mutable().setter(
                generateSuperSetter()
            )
        }

        if (property.shouldUseSuperGetter) {
            propertySpecBuilder.getter(
                generateSuperGetter()
            )
        } else if (property.hasValidGetterInClass) {
            val argumentStringTemplate = if (property.isIndexed) {
                "%T to ${property.internal.index}L"
            } else {
                ""
            }
            propertySpecBuilder.getter(
                FunSpec.getterBuilder()
                    .generateJvmMethodCall(
                        clazz = enrichedClass,
                        callable = property.toGetterCallable(),
                        callArgumentsAsString = argumentStringTemplate,
                        isStatic = false
                    )
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

        if (property.isCoreTypeReimplementedInKotlin()) {
            propertySpecBuilder.addAnnotation(CORE_TYPE_LOCAL_COPY)
        }

        propertySpecBuilder.addKdoc(property)

        return propertySpecBuilder.build()
    }

    private fun generateCoreTypeHelper(enrichedClass: EnrichedClass, property: EnrichedProperty): FunSpec {
        val parameterTypeName = property.getCastedType()
        val parameterName = property.name
        val propertyFunSpec = FunSpec.builder("${parameterName}Mutate")

        if (classGraphService.doAncestorsHaveProperty(enrichedClass, property)) {
            propertyFunSpec.addModifiers(KModifier.OVERRIDE)
        } else {
            propertyFunSpec.addModifiers(KModifier.OPEN)
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

                    appendLine("""This is a helper function to make dealing with local copies easier. 
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

    private fun generateMethod(enrichedClass: EnrichedClass, method: EnrichedMethod, isStatic: Boolean = false): FunSpec {
        val modifiers = mutableListOf<KModifier>()

        if (classGraphService.doAncestorsHaveMethod(
                enrichedClass,
                method
            )
        ) {
            modifiers.add(KModifier.OVERRIDE)
        } else if (method.internal.isVirtual) {
            modifiers.add(KModifier.OPEN)
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

        return generatedFunBuilder.build()
    }

    private fun generateMethodVoidPtr(enrichedClass: EnrichedClass, method: EnrichedMethod) = PropertySpec
        .builder("${method.name}Ptr", VOID_PTR)
        .initializer(
            "%T.getMethodBindPtr(%S,·%S)",
            ClassName("godot.core", "TypeManager"),
            enrichedClass.internal.name,
            method.internal.name
        )
        .build()

    private fun TypeSpec.Builder.generateTypesafeRpc() {
        val camelToSnakeCaseUtilFunction = MemberName(godotUtilPackage, "camelToSnakeCase")
        val asStringNameUtilFunction = MemberName(godotCorePackage, "asStringName")
        for (i in 0..10) {
            val kFunctionTypeParameters = mutableListOf<TypeVariableName>()
            if (i != 0) {
                for (argIndex in 0 until i) {
                    kFunctionTypeParameters.add(TypeVariableName.invoke("ARG$argIndex"))
                }
            }

            val kFunctionClassName = ClassName("kotlin.reflect", "KFunction$i")
                .parameterizedBy(*kFunctionTypeParameters.toTypedArray(), TypeVariableName.invoke("*"))

            RpcFunctionMode.values().forEach { rpcFunctionMode ->
                val rpcFunSpec = FunSpec
                    .builder(rpcFunctionMode.functionName)
                    .addModifiers(KModifier.INLINE)

                if (rpcFunctionMode.hasId) {
                    rpcFunSpec.addParameter("id", Long::class.asClassName())
                }

                rpcFunSpec.addParameter("function", TypeVariableName.invoke("FUNCTION"))

                var templateString = "return ${rpcFunctionMode.functionName}("

                if (rpcFunctionMode.hasId) {
                    templateString += "id, "
                }

                templateString += "function.name.%M().%M()"

                kFunctionTypeParameters.forEachIndexed { index, typeVariableName ->
                    rpcFunSpec.addTypeVariable(typeVariableName)
                    val argParamName = "arg$index"
                    rpcFunSpec.addParameter(argParamName, typeVariableName)
                    templateString += ", $argParamName"
                }
                templateString += ")"
                rpcFunSpec.addStatement(templateString, camelToSnakeCaseUtilFunction, asStringNameUtilFunction)

                rpcFunSpec.addTypeVariable(TypeVariableName.invoke("FUNCTION", kFunctionClassName).copy(reified = true))
                addFunction(rpcFunSpec.build())
            }
        }
    }

    private fun TypeSpec.Builder.generateClassConstructor(classIndexName: String) {
        addFunction(
            FunSpec.builder("new")
                .addModifiers(KModifier.OVERRIDE)
                .addParameter("scriptIndex", Int::class)
                .returns(Boolean::class)
                .addStatement(
                    "callConstructor(%M, scriptIndex)",
                    MemberName(godotApiPackage, classIndexName),
                )
                .addStatement(
                    "return true"
                )
                .build()
        )
    }

    private fun TypeSpec.Builder.generateSingletonConstructor(classIndexName: String) {
        addFunction(
            FunSpec.builder("new")
                .addModifiers(KModifier.OVERRIDE)
                .addParameter("scriptIndex", Int::class)
                .returns(Boolean::class)
                .addStatement(
                    "getSingleton(%M)",
                    MemberName(godotApiPackage, classIndexName),
                )
                .addStatement(
                    "return false"
                )
                .build()
        )
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
                    enumService.findEnumValue(
                        argumentTypeClassName,
                        defaultValueKotlinCode.toLong()
                    ).name
                } else {
                    defaultValueKotlinCode
                }
                if (appliedDefault != null) {
                    parameterBuilder.defaultValue(appliedDefault)

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
                TRANSFER_CONTEXT,
                *ktVariantClassNames,
                VARIANT_TYPE_ANY
            )
        } else {
            addStatement(
                "%T.writeArguments($callArgumentsAsString)",
                TRANSFER_CONTEXT,
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
            TRANSFER_CONTEXT,
            clazz.getTypeClassName().className.nestedClass(methodBindingsInnerClassName),
            MemberName("godot", callable.voidPtrVariableName),
            returnTypeVariantTypeClass
        )

        val methodReturnType = callable.getBufferType()

        if (methodReturnType.typeName != UNIT) {
            if (callable.isEnum()) {
                addStatement(
                    "return·${methodReturnType.className.simpleNames.joinToString(".")}.from(%T.readReturnValue(%T)·as·%T)",
                    TRANSFER_CONTEXT,
                    VARIANT_TYPE_LONG,
                    LONG
                )
            } else if (callable.isBitField()) {
                val simpleNames = methodReturnType.className.simpleNames
                addStatement(
                    "return·%T(%T.readReturnValue(%T)·as·%T)",
                    ClassName("${methodReturnType.className.packageName}.${simpleNames.subList(0, simpleNames.size - 1).joinToString(".")}", "${callable.getTypeClassName().className.simpleName}Value"),
                    TRANSFER_CONTEXT,
                    VARIANT_TYPE_LONG,
                    LONG
                )
            } else {
                addStatement(
                    "return·(%T.readReturnValue(%T, %L)·as·%T)${callable.getFromBufferCastingMethod()}",
                    TRANSFER_CONTEXT,
                    returnTypeVariantTypeClass,
                    callable.nullable,
                    methodReturnType.typeName
                )
            }
        }
        return this
    }

    private fun FileSpec.Builder.generateSuppressWarnings() {
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
    }

    private fun generateCommonRegistrationForClass(
        registrationFileSpec: RegistrationFileSpec,
        clazz: EnrichedClass,
        registrationFunc: RegistrationFileSpec.(EnrichedClass) -> Unit
    ) {
        registrationFileSpec.registrationFunc(clazz)
        registrationFileSpec.addVariantMapping(clazz)

        registrationFileSpec.registerMethodsFunBuilder.addStatement(
            "%T",
            clazz.getTypeClassName().className.nestedClass(methodBindingsInnerClassName)
        )
    }

    private fun RegistrationFileSpec.addVariantMapping(enrichedClass: EnrichedClass) {
        registerVariantMappingFunBuilder.addStatement(
            "%M[%T::class] = %T",
            MemberName(godotCorePackage, "variantMapper"),
            enrichedClass.getTypeClassName().typeName,
            enrichedClass.jvmVariantTypeValue
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
            TYPE_MANAGER,
            clazz.internal.name,
            typeName,
            typeName
        )
    }

    private fun RegistrationFileSpec.addRegisterSingleton(clazz: EnrichedClass) {
        registerTypesFunBuilder.addStatement(
            "%T.registerSingleton(%S)",
            TYPE_MANAGER,
            clazz.name
        )
    }

    fun TypeSpec.Builder.generateOperatorMethods(
        operations: Array<String>,
        enum: EnrichedEnum,
        isOperator: Boolean = false
    ) {
        val packageName = if (enum.encapsulatingType == null) {
            godotApiPackage
        } else {
            "$godotApiPackage.${enum.encapsulatingType.type}"
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
                godotApiPackage
            } else {
                "$godotApiPackage.${enum.encapsulatingType.type}"
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
