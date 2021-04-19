package godot.entrygenerator.transformer

import godot.entrygenerator.model.ClassWithMembers
import godot.entrygenerator.model.RegisteredProperty
import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.descriptors.PropertyDescriptor

fun transformTypeDeclarationsToClassWithMembers(
    classes: Set<ClassDescriptor>,
    properties: Set<PropertyDescriptor>,
    functions: Set<FunctionDescriptor>,
    signals: Set<PropertyDescriptor>
): Set<ClassWithMembers> {
    val classesWithMembers = mutableSetOf<ClassWithMembers>()

    classes.forEach {
        classesWithMembers.add(ClassWithMembers(it))
    }

    properties.forEach { propertyDescriptor ->
        classesWithMembers
            .first { it.classDescriptor == propertyDescriptor.containingDeclaration }
            .properties
            .add(RegisteredProperty(propertyDescriptor))
    }

    functions.forEach { functionDescriptor ->
        classesWithMembers
            .first { it.classDescriptor == functionDescriptor.containingDeclaration }
            .functions
            .add(functionDescriptor)
    }

    signals.forEach { propertyDescriptor ->
        classesWithMembers
            .first { it.classDescriptor == propertyDescriptor.containingDeclaration }
            .signals
            .add(propertyDescriptor)
    }
    return classesWithMembers
}
