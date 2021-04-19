package godot.entrygenerator.generator.property

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.TypeSpec
import godot.entrygenerator.EntryGenerationType
import godot.entrygenerator.extension.getAnnotationValue
import godot.entrygenerator.extension.isCompatibleList
import godot.entrygenerator.model.*
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.types.KotlinType
import org.jetbrains.kotlin.types.typeUtil.isEnum
import org.jetbrains.kotlin.types.typeUtil.supertypes

abstract class PropertyRegistrationGenerator {

    fun registerProperties(
        registeredProperties: MutableList<RegisteredProperty>,
        classSpecificRegistryBuilder: TypeSpec.Builder,
        registerClassControlFlow: FunSpec.Builder,
        className: ClassName,
        bindingContext: BindingContext
    ) {
        registeredProperties
            .forEach { registeredProperty ->
                when {
                    registeredProperty.propertyDescriptor.type.isEnum() -> registerEnum(className, registeredProperty, bindingContext, registerClassControlFlow)
                    registeredProperty.propertyDescriptor.type.isCompatibleList() && registeredProperty.propertyDescriptor.type.arguments.firstOrNull()?.type?.isEnum() == true -> registerEnumList(
                        className,
                        registeredProperty,
                        bindingContext,
                        registerClassControlFlow
                    )
                    registeredProperty.propertyDescriptor.type.getJetTypeFqName(false).matches(Regex("^kotlin\\.collections\\..*Set\$"))
                        && registeredProperty.propertyDescriptor.type.arguments.firstOrNull()?.type?.isEnum() == true -> registerEnumFlag(className, registeredProperty, bindingContext, classSpecificRegistryBuilder, registerClassControlFlow)
                    else -> registerProperty(className, registeredProperty, bindingContext, classSpecificRegistryBuilder, registerClassControlFlow)
                }
            }
    }

    protected abstract fun registerEnumFlag(
        className: ClassName,
        registeredProperty: RegisteredProperty,
        bindingContext: BindingContext,
        classSpecificRegistryBuilder: TypeSpec.Builder,
        registerClassControlFlow: FunSpec.Builder
    )

    protected abstract fun registerEnumList(
        className: ClassName,
        registeredProperty: RegisteredProperty,
        bindingContext: BindingContext,
        registerClassControlFlow: FunSpec.Builder
    )

    protected abstract fun registerEnum(
        className: ClassName,
        registeredProperty: RegisteredProperty,
        bindingContext: BindingContext,
        registerClassControlFlow: FunSpec.Builder
    )

    protected abstract fun registerProperty(
        className: ClassName,
        registeredProperty: RegisteredProperty,
        bindingContext: BindingContext,
        classSpecificRegistryBuilder: TypeSpec.Builder,
        registerClassControlFlow: FunSpec.Builder
    )

    protected fun shouldBeVisibleInEditor(propertyDescriptor: PropertyDescriptor): Boolean {
        return propertyDescriptor
            .annotations
            .getAnnotationValue(
                REGISTER_PROPERTY_ANNOTATION,
                REGISTER_PROPERTY_ANNOTATION_VISIBLE_IN_EDITOR_ARGUMENT,
                true
            )
    }

    protected fun getRpcModeEnum(propertyDescriptor: PropertyDescriptor): ClassName {
        val compilerRpcModeEnumRepresentation = getCompilerRpcModeEnumRepresentation(propertyDescriptor)
        val packagePath = compilerRpcModeEnumRepresentation.first.asString().replace("/", ".")
        val name = compilerRpcModeEnumRepresentation.second
        return ClassName(packagePath, name.asString())
    }

    private fun getCompilerRpcModeEnumRepresentation(propertyDescriptor: PropertyDescriptor): Pair<ClassId, Name> {
        return propertyDescriptor
            .annotations
            .getAnnotationValue(
                REGISTER_PROPERTY_ANNOTATION,
                REGISTER_PROPERTY_ANNOTATION_RPC_MODE_ARGUMENT,
                Pair(ClassId(FqName("godot.MultiplayerAPI"), Name.identifier("RPCMode")), Name.identifier("DISABLED"))
            )
    }

    protected fun isOfType(type: KotlinType, typeFqName: String): Boolean {
        return if (type.getJetTypeFqName(false) == typeFqName) {
            true
        } else {
            type
                .supertypes()
                .any { it.getJetTypeFqName(false) == typeFqName }
        }
    }
}
