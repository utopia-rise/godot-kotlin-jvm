package godot.registration.model.checks

import godot.core.Dictionary
import godot.core.VariantArray
import godot.registration.model.logging.Logger
import godot.registration.model.ext.isJavaCollection
import godot.registration.model.ext.isKotlinCollection
import godot.registration.model.types.ScriptClass
import godot.registration.model.types.SourceClass
import godot.registration.model.types.Type

class SourceClassCheck(logger: Logger, registeredClasses: List<ScriptClass>) : BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        var hasIssue = false

        registeredClasses.forEach { scriptClass ->
            scriptClass.constructors.forEach { constructor ->
                if (reportSourceClasses(constructor.parameterTypes, constructor, "constructor parameter")) {
                    hasIssue = true
                }
            }

            scriptClass.functions.forEach { function ->
                if (reportSourceClasses(function.parameters.map { it.type }, function, "function parameter")) {
                    hasIssue = true
                }
                if (reportSourceClasses(listOf(function.returnType), function, "function return type")) {
                    hasIssue = true
                }
            }

            scriptClass.properties.forEach { property ->
                if (reportSourceClasses(listOf(property.type), property, "property type")) {
                    hasIssue = true
                }
            }

            scriptClass.signals.forEach { signal ->
                if (reportSourceClasses(signal.parameterTypes, signal, "signal parameter")) {
                    hasIssue = true
                }
            }
        }

        return hasIssue
    }

    private fun reportSourceClasses(types: List<Type>, owner: Any, usage: String): Boolean {
        var hasIssue = false
        types
            .flatMap(Type::relevantSignatureTypes)
            .filterIsInstance<SourceClass>()
            .filter { sourceClass -> sourceClass::class == SourceClass::class }
            .distinctBy(SourceClass::fqName)
            .forEach { sourceClass ->
                hasIssue = true
                logger.error(
                    "Registered $usage cannot use unrelated JVM class ${sourceClass.fqName}. " +
                        "Only Godot-compatible classes can appear in registered signatures.",
                    owner
                )
            }
        return hasIssue
    }
}

private fun Type.relevantSignatureTypes(): List<Type> = listOf(this) + if (carriesGodotVisibleGenericTypes()) {
    genericArguments.flatMap(Type::relevantSignatureTypes)
} else {
    emptyList()
}

private fun Type.carriesGodotVisibleGenericTypes(): Boolean =
    isKotlinCollection() ||
        isJavaCollection() ||
        fqName == VariantArray::class.qualifiedName ||
        fqName == Dictionary::class.qualifiedName
