package godot.annotation.processor

import com.google.devtools.ksp.getAllSuperTypes
import com.google.devtools.ksp.getPropertyDeclarationByName
import com.google.devtools.ksp.processing.CodeGenerator
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
import com.google.devtools.ksp.symbol.KSValueParameter
import com.google.devtools.ksp.symbol.KSVisitorVoid
import godot.annotation.Export
import godot.annotation.RegisterClass
import godot.annotation.RegisterConstructor
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.annotation.Tool
import java.io.File

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

    override fun process(resolver: Resolver): List<KSAnnotated> {
        this.resolver = resolver
        resolver.getAllFiles().map { it.accept(registerAnnotationVisitor, Unit) }
        return emptyList()
    }

    override fun finish() {
        super.finish()
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

                RegisteredClass(
                    fqName,
                    supertypeDeclarations,
                    annotations,
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

        private fun mapPropertyDeclaration(propertyDeclaration: KSPropertyDeclaration): RegisteredProperty? {
            return if (propertyDeclaration.annotations.any { it.fqNameUnsafe == RegisterProperty::class.qualifiedName }) {
                val fqName = requireNotNull(propertyDeclaration.qualifiedName?.asString()) {
                    "Qualified name for a registered property declaration cannot be null"
                }
                val annotations = propertyDeclaration
                    .annotations
                    .mapNotNull { mapAnnotation(it) as? PropertyAnnotation }
                RegisteredProperty(
                    fqName,
                    propertyDeclaration.isMutable,
                    propertyDeclaration.findOverridee() != null,
                    annotations,
                    ::defaultValueProvider
                )
            } else null
        }

        private fun mapFunctionDeclaration(functionDeclaration: KSFunctionDeclaration): RegisteredFunction? {
            return if (functionDeclaration.annotations.any { it.fqNameUnsafe == RegisterFunction::class.qualifiedName }) {
                val fqName = requireNotNull(functionDeclaration.qualifiedName?.asString()) {
                    "Qualified name for a registered function declaration cannot be null"
                }
                val parameters = functionDeclaration
                    .parameters
                    .map { mapValueParameters(it) }
                val annotations = functionDeclaration
                    .annotations
                    .mapNotNull { mapAnnotation(it) as? FunctionAnnotation }
                RegisteredFunction(
                    fqName,
                    parameters,
                    functionDeclaration.returnType?.resolve()?.declaration?.qualifiedName?.asString(),
                    annotations
                )
            } else null
        }

        private fun mapValueParameters(valueParameter: KSValueParameter): ValueParameter {
            return ValueParameter(
                requireNotNull(valueParameter.name?.asString()) { "valueParameter name cannot be null: $valueParameter" },
                requireNotNull(valueParameter.type.resolve().declaration.qualifiedName?.asString()) {
                    "valueParameter type fqName cannot be null: ${valueParameter.type}"
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

sealed interface GodotJvmSourceElement

data class SourceFile(
    val absolutePath: String,
    val registeredClasses: List<RegisteredClass> = emptyList()
) : GodotJvmSourceElement {
    val name = absolutePath.substringAfterLast("/").substringAfterLast(File.separator)
    val extension = absolutePath.substringAfterLast(".")
}

open class Clazz(
    open val fqName: String,
    open val supertypes: List<Clazz> = emptyList(),
    open val annotations: List<ClassAnnotation> = emptyList()
) : GodotJvmSourceElement

data class RegisteredClass(
    override val fqName: String,
    override val supertypes: List<Clazz>,
    override val annotations: List<ClassAnnotation> = emptyList(),
    val functions: List<RegisteredFunction> = emptyList(),
    val properties: List<RegisteredProperty> = emptyList()
) : Clazz(fqName, supertypes) {
    val name = fqName.substringAfterLast(".")
    val containingPackage = fqName.substringBeforeLast(".")
}

data class RegisteredFunction(
    val fqName: String,
    val parameters: List<ValueParameter> = emptyList(),
    val returnTypeFqName: String? = null,
    val annotations: List<FunctionAnnotation> = emptyList()
) : GodotJvmSourceElement

data class ValueParameter(
    val name: String,
    val typeFqName: String
)

data class RegisteredProperty(
    val fqName: String,
    val isMutable: Boolean = true,
    val isOverridee: Boolean = false,
    val annotations: List<PropertyAnnotation> = emptyList(),
    val defaultValueProvider: (RegisteredProperty) -> Pair<String, Array<Any?>> = { "" to arrayOf() }
) : GodotJvmSourceElement {
    val name: String = fqName.substringAfterLast(".")
}

sealed interface GodotAnnotation : GodotJvmSourceElement

object GodotBaseTypeAnnotation : ClassAnnotation

data class RegisterClassAnnotation(
    val customName: String? = null
) : ClassAnnotation

object RegisterConstructorAnnotation : GodotAnnotation

data class RegisterFunctionAnnotation(
    val rpcMode: RpcMode
) : FunctionAnnotation

data class RegisterPropertyAnnotation(
    val rpcMode: RpcMode
) : PropertyAnnotation

object RegisterSignalAnnotation : PropertyAnnotation

object ToolAnnotation : ClassAnnotation

object ExportAnnotation : PropertyAnnotation

sealed interface ClassAnnotation : GodotAnnotation
sealed interface PropertyAnnotation : GodotAnnotation
sealed interface FunctionAnnotation : GodotAnnotation

enum class RpcMode {
    DISABLED,
    REMOTE,
    MASTER,
    PUPPET,
    SLAVE,
    REMOTE_SYNC,
    SYNC,
    MASTER_SYNC,
    PUPPET_SYNC
}

val KSAnnotation.fqNameUnsafe: String
    get() = requireNotNull(this.annotationType.resolve().declaration.qualifiedName?.asString()) {
        "$this has no resolvable fqName"
    }
