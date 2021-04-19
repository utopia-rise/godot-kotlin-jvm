package godot.entrygenerator.model

import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.descriptors.PropertyDescriptor

/**
 * Just used as a container for [ClassWithMembers.getMembersOfUserDefinedSuperClasses]
 *
 * Chosen over a [Triple] to be more explicit about the contents of this container.
 */
data class MemberOfSuperClassesContainer(
    val functions: MutableList<FunctionDescriptor> = mutableListOf(),
    val properties: MutableList<PropertyDescriptor> = mutableListOf(),
    val signals: MutableList<PropertyDescriptor> = mutableListOf()
)
