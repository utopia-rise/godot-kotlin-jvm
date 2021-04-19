package godot.entrygenerator.model

import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.descriptorUtil.getSuperClassNotAny
import org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassDescriptor
import org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedClassDescriptor
import org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope
import org.jetbrains.kotlin.types.TypeSubstitution

data class ClassWithMembers(
    val classDescriptor: ClassDescriptor,
    val functions: MutableList<FunctionDescriptor> = mutableListOf(),
    val signals: MutableList<PropertyDescriptor> = mutableListOf(),
    val properties: MutableList<RegisteredProperty> = mutableListOf()
)

data class RegisteredProperty(
    val propertyDescriptor: PropertyDescriptor,
    val isOverriding: Boolean = false,
    val isInherited: Boolean = false
)

/**
 * Add registered members of all user defined superclasses to this class representation
 *
 * As the inheritance in Godot script classes is faked, we need to register ALL members
 * of the whole user defined script class hierarchy for the child class so Godot knows these members exist for a given script
 */
fun ClassWithMembers.gatherAllMembersOfClassHierarchyForRegistration() {
    classDescriptor.getMembersOfUserDefinedSuperClasses()
        .let { (functionsFromSuperclasses, propertiesFromSuperclasses, signalsFromSuperclasses) ->
            functions.addAll(getOnlyFunctionsNotAlreadyPresentAndAnnotatedInThisClass(functionsFromSuperclasses))
            signals.addAll(getOnlySignalsNotAlreadyPresentAndAnnotatedInThisClass(signalsFromSuperclasses))
            markOverriddenProperties()
            addInheritedButNotOverriddenProperties(propertiesFromSuperclasses)
        }
}

private fun ClassWithMembers.addInheritedButNotOverriddenProperties(propertiesFromSuperclasses: MutableList<PropertyDescriptor>) {
    properties.addAll(
        getOnlyPropertiesNotAlreadyPresentAndAnnotatedInThisClass(propertiesFromSuperclasses)
            .map { propertyDescriptor ->
                RegisteredProperty(
                    propertyDescriptor,
                    isInherited = true
                )
            }
    )
}

private fun ClassWithMembers.markOverriddenProperties() {
    val overriddenProperties = properties
        .filter { registeredProperty -> registeredProperty.propertyDescriptor.overriddenDescriptors.isNotEmpty() }

    properties.removeAll(overriddenProperties)
    properties.addAll(overriddenProperties.map { it.copy(isOverriding = true) })
}

/**
 * Filters the signals found in superclasses to only get the not overridden and not explicitly annotated ones
 * @return PropertyDescriptors that need to be added to the child class for registration
 */
private fun ClassWithMembers.getOnlySignalsNotAlreadyPresentAndAnnotatedInThisClass(signalsFromSuperclasses: MutableList<PropertyDescriptor>) =
    signalsFromSuperclasses
        .filter { signalFromSuperClass ->
            signals
                .none { signal ->
                    signal.name == signalFromSuperClass.name &&
                        signal.returnType == signalFromSuperClass.returnType
                }
        }

/**
 * Filters the properties found in superclasses to only get the not overridden and not explicitly annotated ones
 * @return PropertyDescriptors that need to be added to the child class for registration
 */
private fun ClassWithMembers.getOnlyPropertiesNotAlreadyPresentAndAnnotatedInThisClass(propertiesFromSuperclasses: MutableList<PropertyDescriptor>) =
    propertiesFromSuperclasses
        .filter { propertyFromSuperClass ->
            properties
                .map { it.propertyDescriptor }
                .none { property ->
                    property.name == propertyFromSuperClass.name &&
                        property.returnType == propertyFromSuperClass.returnType
                }
        }
        .filter { superClassPropertyDescriptor ->
            !addOverriddenNotAnnotatedPropertyDescriptor(
                superClassPropertyDescriptor
            )
        }

/**
 * Filters the functions found in superclasses to only get the not overridden and not explicitly annotated ones
 * @return FunctionDescriptors that need to be added to the child class for registration
 */
private fun ClassWithMembers.getOnlyFunctionsNotAlreadyPresentAndAnnotatedInThisClass(functionsFromSuperclasses: MutableList<FunctionDescriptor>) =
    functionsFromSuperclasses
        .filter { functionFromSuperClass ->
            functions
                .filter {
                    it.name == functionFromSuperClass.name &&
                        it.valueParameters.size == functionFromSuperClass.valueParameters.size
                }
                .none { functionDescriptor ->
                    functionDescriptor
                        .valueParameters
                        .mapIndexed { index, valueParameterDescriptor -> functionFromSuperClass.valueParameters[index].type == valueParameterDescriptor.type }
                        .all { isValueParameterTypeEqual -> isValueParameterTypeEqual }
                }
        }

/**
 * Adds an overridden property which was annotated in a superclass but was not annotated in a child class to the child classes registered properties
 *
 * Here for handling script inheritance
 *
 * @return true if such a property existed and was added, false otherwise
 */
private fun ClassWithMembers.addOverriddenNotAnnotatedPropertyDescriptor(
    superClassPropertyDescriptor: PropertyDescriptor
) = (classDescriptor as LazyClassDescriptor)
    .declaredCallableMembers
    .filterIsInstance<PropertyDescriptor>()
    .filter { propertyDescriptor -> !properties.map { it.propertyDescriptor }.contains(propertyDescriptor) }
    .filter { propertyDescriptor ->
        propertyDescriptor.name.asString() == superClassPropertyDescriptor.name.asString() &&
            propertyDescriptor.returnType == superClassPropertyDescriptor.returnType
    }
    .let { foundProperties ->
        require(foundProperties.size <= 1) {
            "Found multiple candidates of overridden but not annotated properties! This should never happen! To work around this bug in this check, register overridden properties which are registered in superclasses explicitly in the child class and file a bugreport at https://github.com/utopia-rise/godot-kotlin-entry-generator/ so we can fix this."
        }
        foundProperties
    }
    .firstOrNull()
    ?.let { propertyDescriptor ->
        properties.add(
            RegisteredProperty(
                propertyDescriptor,
                isOverriding = true
            )
        )
        true
    } ?: false

/**
 * Finds all registered members in user defined superclasses
 *
 * Needed for script inheritance as all parent members need to be registered in the child context as well, overridden or not.
 * @return all registered members of user defined super classes
 */
private tailrec fun ClassDescriptor.getMembersOfUserDefinedSuperClasses(
    memberOfSuperClassesContainer: MemberOfSuperClassesContainer = MemberOfSuperClassesContainer()
): MemberOfSuperClassesContainer {
    val superClass = getSuperClassNotAny()

    return if (superClass == null || superClass.annotations.mapNotNull { it.fqName?.asString() }
            .contains(GODOT_BASE_TYPE_ANNOTATION)) {
        memberOfSuperClassesContainer //no further user or library defined superclasses found. Returning all found members
    } else {
        when (superClass) {
            is DeserializedClassDescriptor -> {
                (superClass
                    .getMemberScope(TypeSubstitution.EMPTY)
                    as DeserializedMemberScope)
                    .getContributedDescriptors()
                    .forEach { declarationDescriptor ->
                        when (declarationDescriptor) {
                            is PropertyDescriptor -> {
                                val isRegisteredProperty = declarationDescriptor
                                    .annotations
                                    .map { annotation ->
                                        annotation
                                            .fqName
                                            ?.asString()
                                    }
                                    .contains(REGISTER_PROPERTY_ANNOTATION)

                                val isRegisteredSignal = declarationDescriptor
                                    .annotations
                                    .map { annotation ->
                                        annotation
                                            .fqName
                                            ?.asString()
                                    }
                                    .contains(REGISTER_SIGNAL_ANNOTATION)

                                if (isRegisteredProperty) {
                                    memberOfSuperClassesContainer.properties.add(declarationDescriptor)
                                }
                                if (isRegisteredSignal) {
                                    memberOfSuperClassesContainer.signals.add(declarationDescriptor)
                                }
                            }
                            is FunctionDescriptor -> {
                                val isRegistered = declarationDescriptor
                                    .annotations
                                    .map { annotation ->
                                        annotation
                                            .fqName
                                            ?.asString()
                                    }
                                    .contains(REGISTER_FUNCTION_ANNOTATION)
                                if (isRegistered) {
                                    memberOfSuperClassesContainer.functions.add(declarationDescriptor)
                                }
                            }
                        }
                    }
            }
            is LazyClassDescriptor -> {
                val members = superClass.declaredCallableMembers

                val functions = members
                    .filterIsInstance<FunctionDescriptor>()
                    .filter { functionDescriptor ->
                        functionDescriptor
                            .annotations
                            .map { annotation ->
                                annotation
                                    .fqName
                                    ?.asString()
                            }
                            .contains(REGISTER_FUNCTION_ANNOTATION)
                    }

                val properties = members
                    .filterIsInstance<PropertyDescriptor>()
                    .filter { propertyDescriptor ->
                        propertyDescriptor
                            .annotations
                            .map { annotation ->
                                annotation
                                    .fqName
                                    ?.asString()
                            }
                            .contains(REGISTER_PROPERTY_ANNOTATION)
                    }

                val signals = members
                    .filterIsInstance<PropertyDescriptor>()
                    .filter { propertyDescriptor ->
                        propertyDescriptor
                            .annotations
                            .map { annotation ->
                                annotation
                                    .fqName
                                    ?.asString()
                            }
                            .contains(REGISTER_SIGNAL_ANNOTATION)
                    }

                memberOfSuperClassesContainer.functions.addAll(functions)
                memberOfSuperClassesContainer.properties.addAll(properties)
                memberOfSuperClassesContainer.signals.addAll(signals)
            }
            else -> throw IllegalArgumentException("Cannot handle ClassDescriptor type of $superClass")
        }

        superClass.getMembersOfUserDefinedSuperClasses(memberOfSuperClassesContainer)
    }
}
