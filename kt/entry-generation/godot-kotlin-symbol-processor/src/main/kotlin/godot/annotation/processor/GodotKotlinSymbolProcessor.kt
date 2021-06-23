package godot.annotation.processor

import com.google.devtools.ksp.getAllSuperTypes
import com.google.devtools.ksp.getConstructors
import com.google.devtools.ksp.getDeclaredProperties
import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.symbol.ClassKind
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSAnnotation
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSFile
import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import com.google.devtools.ksp.symbol.KSPropertyDeclaration
import com.google.devtools.ksp.symbol.KSType
import com.google.devtools.ksp.symbol.KSTypeAlias
import com.google.devtools.ksp.symbol.KSTypeReference
import com.google.devtools.ksp.symbol.KSVisitorVoid
import com.google.devtools.ksp.symbol.Modifier
import godot.MultiplayerAPI
import godot.annotation.ColorNoAlpha
import godot.annotation.Dir
import godot.annotation.EnumFlag
import godot.annotation.EnumTypeHint
import godot.annotation.ExpEasing
import godot.annotation.Export
import godot.annotation.IntFlag
import godot.annotation.MultilineText
import godot.annotation.PlaceHolderText
import godot.annotation.RegisterClass
import godot.annotation.RegisterConstructor
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.annotation.Tool
import godot.annotation.processor.compiler.CompilerDataProvider
import godot.annotation.processor.compiler.PsiProvider
import godot.annotation.processor.utils.LoggerWrapper
import godot.entrygenerator.EntryGenerator
import godot.entrygenerator.model.ClassAnnotation
import godot.entrygenerator.model.Clazz
import godot.entrygenerator.model.ColorNoAlphaHintAnnotation
import godot.entrygenerator.model.ConstructorAnnotation
import godot.entrygenerator.model.DirHintAnnotation
import godot.entrygenerator.model.DoubleRangeHintAnnotation
import godot.entrygenerator.model.EnumFlagHintAnnotation
import godot.entrygenerator.model.ExpEasingHintAnnotation
import godot.entrygenerator.model.ExpRangeHintAnnotation
import godot.entrygenerator.model.ExportAnnotation
import godot.entrygenerator.model.FileHintAnnotation
import godot.entrygenerator.model.FloatRangeHintAnnotation
import godot.entrygenerator.model.FunctionAnnotation
import godot.entrygenerator.model.GodotAnnotation
import godot.entrygenerator.model.GodotBaseTypeAnnotation
import godot.entrygenerator.model.IntFlagHintAnnotation
import godot.entrygenerator.model.IntRangeHintAnnotation
import godot.entrygenerator.model.LongRangeHintAnnotation
import godot.entrygenerator.model.MultilineTextHintAnnotation
import godot.entrygenerator.model.PlaceHolderTextHintAnnotation
import godot.entrygenerator.model.PropertyAnnotation
import godot.entrygenerator.model.Range
import godot.entrygenerator.model.RegisterClassAnnotation
import godot.entrygenerator.model.RegisterConstructorAnnotation
import godot.entrygenerator.model.RegisterFunctionAnnotation
import godot.entrygenerator.model.RegisterPropertyAnnotation
import godot.entrygenerator.model.RegisterSignalAnnotation
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredConstructor
import godot.entrygenerator.model.RegisteredFunction
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.RegisteredSignal
import godot.entrygenerator.model.RpcMode
import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.model.ToolAnnotation
import godot.entrygenerator.model.Type
import godot.entrygenerator.model.TypeKind
import godot.entrygenerator.model.ValueParameter
import java.io.File

class GodotKotlinSymbolProcessor(
    private val options: Map<String, String>,
    private val codeGenerator: CodeGenerator,
    private val logger: KSPLogger
) : SymbolProcessor {
    private val registerAnnotationVisitor = RegistrationAnnotationVisitor()
    private val registerAnnotations = listOf(
        RegisterClass::class.qualifiedName!!,
        RegisterConstructor::class.qualifiedName!!,
        RegisterFunction::class.qualifiedName!!,
        RegisterProperty::class.qualifiedName!!,
        RegisterSignal::class.qualifiedName!!
    )
    private val sourceFilesContainingRegisteredClasses = mutableListOf<SourceFile>()
    private val registeredClassToKSFileMap = mutableMapOf<RegisteredClass, KSFile>()
    private lateinit var projectBasePath: String

    override fun process(resolver: Resolver): List<KSAnnotated> {
        CompilerDataProvider.extractNecessaryCompilerClasses(resolver)
        CompilerDataProvider.srcDirs = options["srcDirs"]
            ?.split(File.pathSeparator)
            ?: throw IllegalStateException("No srcDirs option provided")
        projectBasePath = options["projectBasePath"]
            ?: throw IllegalStateException("No projectBasePath option provided")

        resolver.getAllFiles().toList().map { it.accept(registerAnnotationVisitor, Unit) }
        return emptyList()
    }

    override fun finish() {
        super.finish()
        EntryGenerator.generateEntryFiles(
            LoggerWrapper(logger),
            sourceFilesContainingRegisteredClasses,
            { registeredClass ->
                codeGenerator.createNewFile(
                    Dependencies(
                        false,
                        requireNotNull(registeredClassToKSFileMap[registeredClass]) {
                            "No KSFile found for $registeredClass. This should never happen"
                        }
                    ),
                    "godot.${registeredClass.containingPackage}",
                    "${registeredClass.name}Registrar"
                ).bufferedWriter()
            },
            {
                codeGenerator.createNewFile(
                    Dependencies(
                        true,
                        *registeredClassToKSFileMap.map { it.value }.toTypedArray()
                    ),
                    "godot",
                    "Entry"
                ).bufferedWriter()
            }
        )
    }

    inner class RegistrationAnnotationVisitor : KSVisitorVoid() {
        override fun visitFile(file: KSFile, data: Unit) {
            val absolutePath = file.filePath
            val registeredClasses = file
                .declarations
                .mapNotNull { declaration ->
                    when (declaration) {
                        is KSClassDeclaration -> {
                            val clazz = mapClassDeclaration(declaration)
                            if (clazz is RegisteredClass) {
                                clazz
                            } else null
                        }
                        else -> if (declaration.annotations.any { registerAnnotations.contains(it.fqNameUnsafe) }) {
                            throw IllegalStateException("${declaration.qualifiedName} was registered top level. Only classes can be registered top level.")
                        } else {
                            null
                        }
                    }
                }
                .onEach { registeredClass ->
                    registeredClassToKSFileMap[registeredClass] = file
                }
                .toList()

            if (registeredClasses.isNotEmpty()) {
                sourceFilesContainingRegisteredClasses.add(
                    SourceFile(
                        absolutePath,
                        registeredClasses
                    )
                )
            }
        }

        private fun mapClassDeclaration(classDeclaration: KSClassDeclaration): Clazz {
            val fqName = requireNotNull(classDeclaration.qualifiedName?.asString()) {
                "Qualified name for class declaration of a registered type or it's super types cannot be null"
            }
            val supertypeDeclarations = classDeclaration
                .getAllSuperTypes()
                .mapNotNull { it.declaration as? KSClassDeclaration } //we're only interested in classes not interfaces
                .map { mapClassDeclaration(it) }
                .toList()
            val annotations = classDeclaration
                .annotations
                .mapNotNull { mapAnnotation(it) as? ClassAnnotation }
                .toList()

            return if (classDeclaration.annotations.any { it.fqNameUnsafe == RegisterClass::class.qualifiedName }) {
                val registeredFunctions = classDeclaration
                    .getAllFunctions()
                    .mapNotNull { mapFunctionDeclaration(it) }
                    .toList()

                val declaredProperties = classDeclaration.getDeclaredProperties()
                val allProperties = classDeclaration.getAllProperties()
                val registeredProperties = allProperties
                    .filter { property ->
                        property.annotations.any { it.fqNameUnsafe == RegisterProperty::class.qualifiedName } ||
                            property.findOverridee()?.annotations?.any { it.fqNameUnsafe == RegisterProperty::class.qualifiedName } == true
                    }
                    .map {
                        mapPropertyDeclaration(it, declaredProperties.toList())
                    }
                    .toList()
                val registeredSignals = allProperties
                    .filter { property ->
                        property.annotations.any { it.fqNameUnsafe == RegisterSignal::class.qualifiedName }
                    }
                    .map { mapSignalDeclaration(it, declaredProperties.toList()) }
                    .toList()
                val registeredConstructors = classDeclaration
                    .getConstructors()
                    .map { mapConstructorDeclaration(it) }
                    .toList()

                RegisteredClass(
                    fqName,
                    supertypeDeclarations,
                    classDeclaration.getResPath(CompilerDataProvider.srcDirs, projectBasePath),
                    annotations,
                    registeredConstructors,
                    registeredFunctions,
                    registeredSignals,
                    registeredProperties
                )
            } else {
                Clazz(
                    fqName,
                    supertypeDeclarations,
                    annotations
                )
            }
        }

        private fun mapConstructorDeclaration(constructorDeclaration: KSFunctionDeclaration): RegisteredConstructor {
            return RegisteredConstructor(
                constructorDeclaration.parameters.map {
                    mapParameters(
                        requireNotNull(it.name?.asString()) {
                            "parameter name of constructor ${constructorDeclaration.qualifiedName} cannot be null"
                        },
                        it.type
                    )
                },
                constructorDeclaration
                    .annotations
                    .mapNotNull { mapAnnotation(it) as? ConstructorAnnotation }
                    .toList()
            )
        }

        private fun mapSignalDeclaration(
            propertyDeclaration: KSPropertyDeclaration,
            declaredProperties: List<KSPropertyDeclaration>
        ): RegisteredSignal {
            val fqName = requireNotNull(propertyDeclaration.qualifiedName?.asString()) {
                "Qualified name for a registered property declaration cannot be null"
            }
            val annotations = propertyDeclaration
                .annotations
                .mapNotNull { mapAnnotation(it) as? PropertyAnnotation }

            val type = requireNotNull(mapTypeReference(propertyDeclaration.type)) {
                "type of property $fqName cannot be null"
            }

            val isInheritedButNotOverridden = !declaredProperties.map { it.qualifiedName?.asString() }.contains(fqName)

            val signalParameterNames = PsiProvider.provideSignalArgumentNames(if (isInheritedButNotOverridden) {
                "${propertyDeclaration.findOverridee()?.qualifiedName?.asString()}"
            } else fqName)

            return RegisteredSignal(
                fqName,
                type,
                propertyDeclaration.type.resolve().arguments.mapIndexed { index, ksTypeArgument ->
                    val argumentType = requireNotNull(mapTypeReference(requireNotNull(ksTypeArgument.type) {
                        "typeArgument's type of type $type cannot be null"
                    })) {
                        "Type of signal $fqName cannot be null"
                    }

                    val argumentName = signalParameterNames[index]

                    argumentName to argumentType
                }.toMap(),
                propertyDeclaration.findOverridee() != null,
                annotations.toList()
            )
        }

        private fun mapPropertyDeclaration(
            propertyDeclaration: KSPropertyDeclaration,
            declaredProperties: List<KSPropertyDeclaration>
        ): RegisteredProperty {
            val fqName = requireNotNull(propertyDeclaration.qualifiedName?.asString()) {
                "Qualified name for a registered property declaration cannot be null"
            }
            val annotations = propertyDeclaration
                .annotations
                .mapNotNull { mapAnnotation(it) as? PropertyAnnotation }
                .toMutableList()
                .also { declaredAnnotations ->
                    declaredAnnotations.addAll(
                        propertyDeclaration
                            .findOverridee()
                            ?.annotations
                            ?.mapNotNull { mapAnnotation(it) as? PropertyAnnotation }
                            ?: emptySequence()
                    )
                }

            val type = requireNotNull(mapTypeReference(propertyDeclaration.type)) {
                "type of property $fqName cannot be null"
            }

            val isInheritedButNotOverridden = !declaredProperties.map { it.qualifiedName?.asString() }.contains(fqName)
            val defaultValueProviderFqName = if (isInheritedButNotOverridden) {
                "${propertyDeclaration.findOverridee()?.qualifiedName?.asString()}"
            } else fqName

            return RegisteredProperty(
                fqName,
                type,
                propertyDeclaration.isMutable,
                propertyDeclaration.modifiers.contains(Modifier.LATEINIT),
                propertyDeclaration.findOverridee() != null,
                annotations.toList()
            ) {
                PsiProvider.providePropertyInitializer(defaultValueProviderFqName)
            }
        }

        private fun mapTypeReference(type: KSTypeReference?): Type? {
            type ?: return null
            val resolvedType = type.resolve()
            val fqName = requireNotNull(resolvedType.declaration.qualifiedName?.asString()) {
                "resolvedType $resolvedType cannot have no fqName"
            }.removeSuffix("?")

            val superTypes = when (val declaration = resolvedType.declaration) {
                is KSClassDeclaration -> declaration.superTypes.mapNotNull { mapTypeReference(it) }.toList()
                is KSTypeAlias -> listOfNotNull(mapTypeReference(declaration.type))
                else -> throw IllegalStateException("Unknown declaration type $declaration for type reference")
            }

            val typeKind = when((resolvedType.declaration as? KSClassDeclaration)?.classKind) {
                ClassKind.INTERFACE -> TypeKind.INTERFACE
                ClassKind.CLASS -> TypeKind.CLASS
                ClassKind.ENUM_CLASS -> TypeKind.ENUM_CLASS
                ClassKind.ENUM_ENTRY -> TypeKind.ENUM_ENTRY
                ClassKind.OBJECT -> TypeKind.OBJECT
                ClassKind.ANNOTATION_CLASS -> TypeKind.ANNOTATION_CLASS
                null -> TypeKind.TYPE_ALIAS
            }

            return Type(
                fqName,
                typeKind,
                resolvedType.isMarkedNullable,
                superTypes
            ) { resolvedType.arguments.mapNotNull { mapTypeReference(it.type) } }
        }

        private fun mapFunctionDeclaration(functionDeclaration: KSFunctionDeclaration): RegisteredFunction? {
            return if (functionDeclaration.annotations.any { it.fqNameUnsafe == RegisterFunction::class.qualifiedName }) {
                val fqName = requireNotNull(functionDeclaration.qualifiedName?.asString()) {
                    "Qualified name for a registered function declaration cannot be null"
                }
                val parameters = functionDeclaration
                    .parameters
                    .map {
                        mapParameters(
                            requireNotNull(it.name?.asString()) {
                                "Name of function parameter cannot be null. Function: ${functionDeclaration.qualifiedName}"
                            },
                            it.type
                        )
                    }
                val annotations = functionDeclaration
                    .annotations
                    .mapNotNull { mapAnnotation(it) as? FunctionAnnotation }
                RegisteredFunction(
                    fqName,
                    parameters,
                    mapTypeReference(functionDeclaration.returnType),
                    annotations.toList()
                )
            } else null
        }

        private fun mapParameters(name: String, type: KSTypeReference): ValueParameter {
            val resolvedType = type.resolve()
            return ValueParameter(
                name,
                requireNotNull(mapTypeReference(type)) {
                    "type cannot be null for parameter"
                },
                resolvedType.arguments.mapNotNull {
                    mapTypeReference(requireNotNull(it.type) {
                        "typeArgument's type of type $type cannot be null"
                    })
                }
            )
        }

        private fun mapAnnotation(annotation: KSAnnotation): GodotAnnotation? {
            return when (annotation.fqNameUnsafe) {
                RegisterClass::class.qualifiedName -> RegisterClassAnnotation(
                    annotation.arguments.first().value as? String
                )
                RegisterConstructor::class.qualifiedName -> RegisterConstructorAnnotation
                RegisterFunction::class.qualifiedName -> {
                    val rpcMode = getRpcMode(annotation)
                    RegisterFunctionAnnotation(
                        rpcMode
                    )
                }
                RegisterProperty::class.qualifiedName -> {
                    val rpcMode = getRpcMode(annotation)
                    RegisterPropertyAnnotation(
                        rpcMode
                    )
                }
                RegisterSignal::class.qualifiedName -> RegisterSignalAnnotation
                Tool::class.qualifiedName -> ToolAnnotation
                Export::class.qualifiedName -> ExportAnnotation
                "godot.annotation.GodotBaseType" -> GodotBaseTypeAnnotation //is internal
                EnumFlag::class.qualifiedName -> EnumFlagHintAnnotation
                IntFlag::class.qualifiedName -> IntFlagHintAnnotation(
                    (annotation.arguments.firstOrNull()?.value as? ArrayList<String>)?.toList() ?: emptyList()
                )
                MultilineText::class.qualifiedName -> MultilineTextHintAnnotation
                PlaceHolderText::class.qualifiedName -> PlaceHolderTextHintAnnotation
                ColorNoAlpha::class.qualifiedName -> ColorNoAlphaHintAnnotation
                godot.annotation.IntRange::class.qualifiedName -> {
                    val start = (annotation.arguments.firstOrNull { it.name?.asString() == "start" }?.value ?: annotation.arguments.first().value) as Int
                    val end = (annotation.arguments.firstOrNull { it.name?.asString() == "end" }?.value ?: annotation.arguments[1].value) as Int
                    val step = ((annotation.arguments.firstOrNull { it.name?.asString() == "step" }?.value ?: annotation.arguments[2].value) as? Int) ?: -1
                    val or = getRangeEnum(annotation)

                    IntRangeHintAnnotation(
                        start,
                        end,
                        step,
                        or
                    )
                }
                godot.annotation.LongRange::class.qualifiedName -> {
                    val start = (annotation.arguments.firstOrNull { it.name?.asString() == "start" }?.value ?: annotation.arguments.first().value) as Long
                    val end = (annotation.arguments.firstOrNull { it.name?.asString() == "end" }?.value ?: annotation.arguments[1].value) as Long
                    val step = ((annotation.arguments.firstOrNull { it.name?.asString() == "step" }?.value ?: annotation.arguments[2].value) as? Long) ?: -1
                    val or = getRangeEnum(annotation)

                    LongRangeHintAnnotation(
                        start,
                        end,
                        step,
                        or
                    )
                }
                godot.annotation.FloatRange::class.qualifiedName -> {
                    val start = (annotation.arguments.firstOrNull { it.name?.asString() == "start" }?.value ?: annotation.arguments.first().value) as Float
                    val end = (annotation.arguments.firstOrNull { it.name?.asString() == "end" }?.value ?: annotation.arguments[1].value) as Float
                    val step = ((annotation.arguments.firstOrNull { it.name?.asString() == "step" }?.value ?: annotation.arguments[2].value) as? Float) ?: -1f
                    val or = getRangeEnum(annotation)

                    FloatRangeHintAnnotation(
                        start,
                        end,
                        step,
                        or
                    )
                }
                godot.annotation.DoubleRange::class.qualifiedName -> {
                    val start = (annotation.arguments.firstOrNull { it.name?.asString() == "start" }?.value ?: annotation.arguments.first().value) as Double
                    val end = (annotation.arguments.firstOrNull { it.name?.asString() == "end" }?.value ?: annotation.arguments[1].value) as Double
                    val step = ((annotation.arguments.firstOrNull { it.name?.asString() == "step" }?.value ?: annotation.arguments[2].value) as? Double) ?: -1.0
                    val or = getRangeEnum(annotation)

                    DoubleRangeHintAnnotation(
                        start,
                        end,
                        step,
                        or
                    )
                }
                godot.annotation.ExpRange::class.qualifiedName -> {
                    val start = (annotation.arguments.firstOrNull { it.name?.asString() == "start" }?.value ?: annotation.arguments.first().value) as Float
                    val end = (annotation.arguments.firstOrNull { it.name?.asString() == "end" }?.value ?: annotation.arguments[1].value) as Float
                    val step = ((annotation.arguments.firstOrNull { it.name?.asString() == "step" }?.value ?: annotation.arguments[2].value) as? Float) ?: -1f

                    ExpRangeHintAnnotation(
                        start,
                        end,
                        step
                    )
                }
                EnumTypeHint::class.qualifiedName -> null
                ExpEasing::class.qualifiedName -> {
                    val attenuation = ((annotation.arguments.firstOrNull { it.name?.asString() == "attenuation" }?.value ?: annotation.arguments.firstOrNull()?.value) as? Boolean) ?: false
                    val inout = ((annotation.arguments.firstOrNull { it.name?.asString() == "inout" }?.value ?: annotation.arguments[1].value) as? Boolean) ?: false
                    ExpEasingHintAnnotation(
                        attenuation,
                        inout
                    )
                }
                godot.annotation.File::class.qualifiedName -> {
                    val extensions = ((annotation.arguments.firstOrNull { it.name?.asString() == "extensions" }?.value ?: annotation.arguments.firstOrNull()?.value) as? ArrayList<String>)?.toList() ?: emptyList()
                    val global = ((annotation.arguments.firstOrNull { it.name?.asString() == "global" }?.value ?: annotation.arguments[1].value) as? Boolean) ?: false
                    FileHintAnnotation(
                        extensions, global
                    )
                }
                Dir::class.qualifiedName -> {
                    val global = ((annotation.arguments.firstOrNull { it.name?.asString() == "global" }?.value ?: annotation.arguments.firstOrNull()?.value) as? Boolean) ?: false
                    DirHintAnnotation(
                        global
                    )
                }
                else -> throw IllegalArgumentException(
                    "Unknown annotation: $annotation"
                )
            }
        }

        private fun getRpcMode(annotation: KSAnnotation) =
            when ((annotation.arguments.firstOrNull()?.value as? KSType)?.declaration?.qualifiedName?.asString()) {
                MultiplayerAPI.RPCMode.REMOTE::class.qualifiedName -> RpcMode.REMOTE
                MultiplayerAPI.RPCMode.MASTER::class.qualifiedName -> RpcMode.MASTER
                MultiplayerAPI.RPCMode.PUPPET::class.qualifiedName -> RpcMode.PUPPET
                MultiplayerAPI.RPCMode.SLAVE::class.qualifiedName -> RpcMode.SLAVE
                MultiplayerAPI.RPCMode.REMOTESYNC::class.qualifiedName -> RpcMode.REMOTE_SYNC
                MultiplayerAPI.RPCMode.SYNC::class.qualifiedName -> RpcMode.SYNC
                MultiplayerAPI.RPCMode.MASTERSYNC::class.qualifiedName -> RpcMode.MASTER_SYNC
                MultiplayerAPI.RPCMode.PUPPETSYNC::class.qualifiedName -> RpcMode.PUPPET_SYNC
                else -> RpcMode.DISABLED
            }
    }

    private fun getRangeEnum(annotation: KSAnnotation) =
        ((annotation.arguments.firstOrNull { it.name?.asString() == "or" }?.value
            ?: annotation.arguments[3].value) as? KSType)?.declaration?.qualifiedName?.asString()?.let { enumFqName ->
            when (enumFqName) {
                godot.registration.Range.NONE::class.qualifiedName -> Range.NONE
                godot.registration.Range.OR_GREATER::class.qualifiedName -> Range.OR_GREATER
                godot.registration.Range.OR_LESSER::class.qualifiedName -> Range.OR_LESSER
                else -> throw IllegalArgumentException("Unknown enum $enumFqName for hint annotation IntRange")
            }
        } ?: Range.NONE
}

val KSAnnotation.fqNameUnsafe: String
    get() = requireNotNull(this.annotationType.resolve().declaration.qualifiedName?.asString()) {
        "$this has no resolvable fqName"
    }

fun KSClassDeclaration.getResPath(srcDirs: List<String>, projectDir: String): String = containingFile
    ?.filePath
    ?.let { filePath ->
        val srcDir = requireNotNull(
            srcDirs.filter { srcDir ->
                filePath.contains(srcDir)
            }
                .maxByOrNull { it.length }
                ?.removePrefix(projectDir)
                ?.replace(File.separator, "/")
                ?.removePrefix("/")
                ?.removeSuffix("/")
        )

        val relativeFilePath = filePath
            .substringAfterLast(srcDir)
            .removePrefix("/")

        "res://$srcDir/$relativeFilePath"
    }
    ?: throw IllegalStateException("Cannot get res path for declaration: $qualifiedName")
