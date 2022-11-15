package godot.entrygenerator.checks

import godot.entrygenerator.model.RegisteredFunction
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger

class OverideeRegisteredCheck(logger: Logger, sourceFiles: List<SourceFile>): BaseCheck(logger, sourceFiles) {
    override fun execute() {
        sourceFiles
            .flatMap { it.registeredClasses }
            .forEach { registeredClass ->
                val registeredPropertiesInParentTypes = registeredClass
                    .supertypes
                    .flatMap { superType ->
                        superType.properties.filterIsInstance<RegisteredProperty>()
                    }
                val registeredFunctionsInParentTypes = registeredClass
                    .supertypes
                    .flatMap { superType ->
                        superType.functions.filterIsInstance<RegisteredFunction>()
                    }

                registeredClass
                    .properties
                    .filter { it.isOverridee }
                    .filter { property ->
                        registeredPropertiesInParentTypes
                            .map { it.name }
                            .contains(property.name)
                    }
                    .forEach { propertyOverridingRegisteredPropertyButNotRegisteredItself ->
                        logger.warn(
                            "Property ${propertyOverridingRegisteredPropertyButNotRegisteredItself.fqName} overrides registered property but is not registered itself and thus will not be visible to godot. This usually is a mistake. To make it visible, explicitly annotate it with @RegisterProperty"
                        )
                    }

                registeredClass
                    .functions
                    .filter { it.isOverridee }
                    .filter { function ->
                        registeredFunctionsInParentTypes
                            .map { it.name }
                            .contains(function.name)
                    }
                    .forEach { functionOverridingRegisteredFunctionButNotRegisteredItself ->
                        logger.warn(
                            "Function ${functionOverridingRegisteredFunctionButNotRegisteredItself.fqName} overrides registered function but is not registered itself and thus will not be visible to godot. This usually is a mistake. To make it visible, explicitly annotate it with @RegisterFunction"
                        )
                    }
            }
    }
}
