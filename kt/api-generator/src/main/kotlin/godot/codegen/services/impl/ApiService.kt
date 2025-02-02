package godot.codegen.services.impl

import com.squareup.kotlinpoet.UNIT
import godot.codegen.exceptions.NoMatchingClassFoundException
import godot.codegen.exceptions.NoMatchingEnumFound
import godot.codegen.extensions.getTypeClassName
import godot.codegen.extensions.isBitField
import godot.codegen.extensions.isEnum
import godot.codegen.models.ApiType
import godot.codegen.models.Argument
import godot.codegen.models.Method
import godot.codegen.models.ReturnValue
import godot.codegen.models.custom.DefaultEnumValue
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedMethod
import godot.codegen.models.enriched.EnrichedProperty
import godot.codegen.poet.ClassTypeNameWrapper
import godot.codegen.repositories.ClassRepository
import godot.codegen.repositories.CoreTypeEnumRepository
import godot.codegen.repositories.GlobalEnumRepository
import godot.codegen.repositories.SingletonRepository
import godot.codegen.services.IClassGraphService
import godot.codegen.services.IApiService
import godot.tools.common.constants.GodotTypes

class ApiService(
    private val classRepository: ClassRepository,
    private val singletonRepository: SingletonRepository,
    private val globalEnumRepository: GlobalEnumRepository,
    private val coreTypeEnumRepository: CoreTypeEnumRepository,
    private val classGraphService: IClassGraphService
) : IApiService{
    private val singletons = singletonRepository
        .list()
        .map {
            classRepository.findByClassName(it.type)?.copy(it.name) ?: throw NoMatchingClassFoundException(it.type)
        }
        .filter { it.apiType == ApiType.CORE }

    private val classes = classRepository
        .list()
        .filter {
            for (singleton in singletonRepository.list()) {
                if (singleton.type == it.type || classGraphService.doClassInherits(it, singleton.type)) return@filter false
            }
            it.apiType == ApiType.CORE
        }

    override fun getSingletons() = singletons

    override fun getClasses() = classes

    override fun getGlobalEnums() = globalEnumRepository.list()

    private fun findGetterSetterInAncestor(clazz: EnrichedClass, property: EnrichedProperty, isSetter: Boolean) {
        val methodName: String
        val returnType: String
        val arguments: List<Argument>

        if (isSetter) {
            if(property.setterMethod != null) return
            methodName = property.internal.setter ?: return // Early return if the property doesn't have a setter.
            returnType = ""
            arguments = listOf(Argument(property.name, property.type, null, null))
        } else {
            if(property.getterMethod != null) return
            methodName = property.internal.getter // No need to check, a property always has at least a getter.
            returnType = property.type
            arguments = listOf()
        }

        val method = EnrichedMethod(
            Method(
                name = methodName,
                isConst = false,
                isVararg = false,
                isVirtual = false,
                isStatic = false,
                hash = 0,
                hashCompatibility = listOf(),
                returnValue = ReturnValue(returnType, null),
                returnType = null,
                arguments = arguments,
                description = null,
                briefDescription = null
            )
        )

        val parentClassAndMethod = classGraphService.getMethodFromAncestor(clazz, method)
        val hasValidAccessor = if (isSetter) property.hasValidSetterInClass else property.hasValidGetterInClass
        if (parentClassAndMethod != null && !hasValidAccessor) {
            if (isSetter) {
                property.setterMethod = parentClassAndMethod.second
            } else {
                property.getterMethod = parentClassAndMethod.second
            }
        }
    }

    override fun findGetSetMethodsAndUpdateProperties() {
        for (clazz in classRepository.list()) {
            for (property in clazz.properties) {
                for (method in clazz.methods) {
                    if (property.name == "") continue

                    when (method.name) {
                        property.getter -> {
                            if (method.getTypeClassName().className == UNIT || method.arguments.size > 1 || method.internal.isVirtual) continue

                            if (!property.isIndexed && method.arguments.size == 1) continue

                            if (method.arguments.size == 1 && !method.arguments[0].isEnum() && method.arguments[0].type != GodotTypes.int) continue

                            property.getterMethod = method
                        }

                        property.setter -> {
                            if (method.getTypeClassName().className != UNIT || method.arguments.size > 2 || method.internal.isVirtual) continue

                            if (!property.isIndexed && method.arguments.size == 2) continue

                            if (method.arguments.size == 2 && !method.arguments[0].isEnum() && method.arguments[0].type != GodotTypes.int) continue

                            property.setterMethod = method
                        }
                    }
                }
                findGetterSetterInAncestor(clazz, property, false)
                findGetterSetterInAncestor(clazz, property, true)
            }
        }
    }

    override fun findDefaultEnumValue(enumClassName: ClassTypeNameWrapper, enumValue: Long): DefaultEnumValue {
        val simpleNames = enumClassName.className.simpleNames
        return if (simpleNames.size > 1) {
            val className = simpleNames[0]
            val enrichedEnum = if (GodotTypes.coreTypes.contains(className)) {
                coreTypeEnumRepository.listForCoreType(className)
            } else {
                getClasses()
                    .plus(getSingletons())
                    .first { it.name == className }
                    .enums
            }?.firstOrNull { it.getTypeClassName() == enumClassName } ?:
            throw NoMatchingEnumFound(simpleNames.joinToString("."))

            val value = enrichedEnum
                .internal
                .values
                .firstOrNull { it.value == enumValue } ?:
            if (enrichedEnum.isBitField()) {
                return DefaultEnumValue(
                    null,
                    "${enrichedEnum.name}Value($enumValue)",
                    enrichedEnum.encapsulatingType
                )
            }
            else {
                throw NoMatchingEnumFound(simpleNames.joinToString("."))
            }

            DefaultEnumValue(enrichedEnum, value)
        } else {
            val enum = getGlobalEnums()
                .first { it.name == simpleNames[0] }
            val value = enum
                .internal
                .values
                .first { it.value == enumValue }

            DefaultEnumValue(enum, value)
        }
    }
}
