package godot.annotation.processor

import com.google.devtools.ksp.getAllSuperTypes
import com.google.devtools.ksp.getConstructors
import com.google.devtools.ksp.getPropertyDeclarationByName
import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSAnnotation
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSFile
import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import com.google.devtools.ksp.symbol.KSName
import com.google.devtools.ksp.symbol.KSPropertyDeclaration
import com.google.devtools.ksp.symbol.KSType
import com.google.devtools.ksp.symbol.KSTypeAlias
import com.google.devtools.ksp.symbol.KSTypeReference
import com.google.devtools.ksp.symbol.KSValueParameter
import com.google.devtools.ksp.symbol.KSVisitorVoid
import godot.annotation.Export
import godot.annotation.RegisterClass
import godot.annotation.RegisterConstructor
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.annotation.Tool
import godot.entrygenerator.EntryGenerator
import godot.entrygenerator.model.ClassAnnotation
import godot.entrygenerator.model.Clazz
import godot.entrygenerator.model.ConstructorAnnotation
import godot.entrygenerator.model.ExportAnnotation
import godot.entrygenerator.model.FunctionAnnotation
import godot.entrygenerator.model.GodotAnnotation
import godot.entrygenerator.model.GodotBaseTypeAnnotation
import godot.entrygenerator.model.PropertyAnnotation
import godot.entrygenerator.model.RegisterClassAnnotation
import godot.entrygenerator.model.RegisterConstructorAnnotation
import godot.entrygenerator.model.RegisterFunctionAnnotation
import godot.entrygenerator.model.RegisterPropertyAnnotation
import godot.entrygenerator.model.RegisterSignalAnnotation
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredConstructor
import godot.entrygenerator.model.RegisteredFunction
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.RpcMode
import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.model.ToolAnnotation
import godot.entrygenerator.model.Type
import godot.entrygenerator.model.ValueParameter
import org.jetbrains.kotlin.com.intellij.mock.MockProject
import org.jetbrains.kotlin.com.intellij.openapi.vfs.StandardFileSystems
import org.jetbrains.kotlin.com.intellij.openapi.vfs.VirtualFile
import org.jetbrains.kotlin.com.intellij.openapi.vfs.VirtualFileManager
import org.jetbrains.kotlin.com.intellij.psi.PsiManager
import org.jetbrains.kotlin.extensions.PreprocessedFileCreator
import org.jetbrains.kotlin.idea.KotlinFileType
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtFile
import java.io.File
import java.io.FileOutputStream
import java.io.FileWriter

class GodotSymbolProcessor(
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
    private lateinit var resolver: Resolver
    private val sourceFilesContainingRegisteredClasses = mutableListOf<SourceFile>()
    private val registeredClassToKSFileMap = mutableMapOf<RegisteredClass, KSFile>()
    private lateinit var srcDirs: List<String>
    private lateinit var outDir: String
    private lateinit var projectBasePath: String

    override fun process(resolver: Resolver): List<KSAnnotated> {
        this.resolver = resolver
        srcDirs = options["srcDirs"]
            ?.split(File.pathSeparator)
            ?: throw IllegalStateException("No srcDirs option provided")
        outDir = options["outDir"]
            ?: throw IllegalStateException("No outDir option provided")
        projectBasePath = options["projectBasePath"]
            ?: throw IllegalStateException("No projectBasePath option provided")
        resolver.getAllFiles().map { it.accept(registerAnnotationVisitor, Unit) }
        return emptyList()
    }

    override fun finish() {
        super.finish()
        EntryGenerator.generateEntryFiles(
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

            return if (classDeclaration.annotations.any { it.fqNameUnsafe == RegisterClass::class.qualifiedName }) {
                val registeredFunctions = classDeclaration
                    .getAllFunctions()
                    .mapNotNull { mapFunctionDeclaration(it) }
                val registeredProperties = classDeclaration
                    .getAllProperties()
                    .mapNotNull { mapPropertyDeclaration(it) }

                val registeredConstructors = classDeclaration
                    .getConstructors()
                    .map { mapConstructorDeclaration(it) }

                RegisteredClass(
                    fqName,
                    supertypeDeclarations,
                    classDeclaration.getResPath(srcDirs, projectBasePath),
                    annotations,
                    registeredConstructors,
                    registeredFunctions,
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
            )
        }

        private fun mapPropertyDeclaration(propertyDeclaration: KSPropertyDeclaration): RegisteredProperty? {
            return if (propertyDeclaration.annotations.any { it.fqNameUnsafe == RegisterProperty::class.qualifiedName }) {
                val fqName = requireNotNull(propertyDeclaration.qualifiedName?.asString()) {
                    "Qualified name for a registered property declaration cannot be null"
                }
                val annotations = propertyDeclaration
                    .annotations
                    .mapNotNull { mapAnnotation(it) as? PropertyAnnotation }

                val type = requireNotNull(mapTypeReference(propertyDeclaration.type)) {
                    "type of property $fqName cannot be null"
                }

                RegisteredProperty(
                    fqName,
                    type,
                    propertyDeclaration.isMutable,
                    propertyDeclaration.findOverridee() != null,
                    annotations,
                    ::defaultValueProvider
                )
            } else null
        }

        private fun mapTypeReference(type: KSTypeReference?): Type? {
            type ?: return null
            val resolvedType = type.resolve()
            val fqName = requireNotNull(resolvedType.declaration.qualifiedName?.asString()) {
                "resolvedType $resolvedType cannot have no fqName"
            }.removeSuffix("?")

            val superTypes = when(val declaration = resolvedType.declaration) {
                is KSClassDeclaration -> declaration.superTypes.mapNotNull { mapTypeReference(it) }
                is KSTypeAlias -> listOfNotNull(mapTypeReference(declaration.type))
                else -> throw IllegalStateException("Unknown declaration type $declaration for type reference")
            }

            return Type(
                fqName,
                resolvedType.isMarkedNullable,
                superTypes
            )
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
                    annotations
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
                RegisterFunction::class.qualifiedName -> RegisterFunctionAnnotation(
                    RpcMode.DISABLED //TODO
                )
                RegisterProperty::class.qualifiedName -> RegisterPropertyAnnotation(
                    RpcMode.DISABLED //TODO
                )
                RegisterSignal::class.qualifiedName -> RegisterSignalAnnotation
                Tool::class.qualifiedName -> ToolAnnotation
                Export::class.qualifiedName -> ExportAnnotation
                "godot.annotation.GodotBaseType" -> GodotBaseTypeAnnotation //is internal
                else -> null /*throw IllegalArgumentException(
                    "Unknown annotation: $annotation"
                )*/
            }
        }

        private fun defaultValueProvider(registeredProperty: RegisteredProperty): Pair<String, Array<Any?>> {
            return resolver.getPropertyDeclarationByName(registeredProperty.fqName)?.let { propertyDeclaration ->
                "" to arrayOf() //TODO
            } ?: "" to arrayOf()
        }
    }
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

private fun fqNameToResPath(srcDirs: List<String>, project: MockProject, projectDir: String): Map<String, String> {
    //Start: taken from CoreEnvironmentUtils createSourceFilesFromSourceRoots inside org.jetbrains.kotlin:kotlin-compiler:1.4.10
    val localFileSystem = VirtualFileManager
        .getInstance()
        .getFileSystem(StandardFileSystems.FILE_PROTOCOL)
    val psiManager = PsiManager.getInstance(project)
    val virtualFileCreator = PreprocessedFileCreator(project)

    val processedFiles = hashSetOf<VirtualFile>()
    //End: taken from CoreEnvironmentUtils createSourceFilesFromSourceRoots inside org.jetbrains.kotlin:kotlin-compiler:1.4.10

    return srcDirs
        .flatMap { srcDirAbsolutePath ->
            //Start: taken from CoreEnvironmentUtils createSourceFilesFromSourceRoots inside org.jetbrains.kotlin:kotlin-compiler:1.4.10
            val vFile = localFileSystem.findFileByPath(srcDirAbsolutePath) ?: return@flatMap emptySequence()
            if (!vFile.isDirectory && vFile.fileType != KotlinFileType.INSTANCE) {
                return@flatMap emptySequence()
            }

            File(srcDirAbsolutePath)
                .walkTopDown()
                .map { file ->
                    if (!file.isFile) return@map null

                    val virtualFile = localFileSystem
                        .findFileByPath(file.absolutePath)
                        ?.let(virtualFileCreator::create)

                    if (virtualFile != null && processedFiles.add(virtualFile)) {
                        val psiFile = psiManager.findFile(virtualFile)
                        if (psiFile is KtFile) {
                            psiFile
                        } else null
                    } else null
                }
                //End: taken from CoreEnvironmentUtils createSourceFilesFromSourceRoots inside org.jetbrains.kotlin:kotlin-compiler:1.4.10
                .filterNotNull()
                .flatMap { ktFile ->
                    ktFile
                        .children
                        .filterIsInstance<KtClass>()
                }
                .mapNotNull { ktClass ->
                    val fqName = ktClass.fqName?.asString() ?: return@mapNotNull null
                    val classFilePath = ktClass
                        .containingKtFile
                        .virtualFilePath
                        .replace(File.separator, "/")
                        .removePrefix(projectDir.replace(File.separator, "/"))
                        .removePrefix("/")

                    val resPath = "res://$classFilePath"
                    fqName to resPath
                }
        }
        .toMap()
}
