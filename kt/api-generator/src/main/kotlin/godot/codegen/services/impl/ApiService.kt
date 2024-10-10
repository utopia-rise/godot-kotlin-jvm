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
import godot.codegen.models.enriched.EnrichedEnum
import godot.codegen.models.enriched.EnrichedMethod
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
    override fun getSingletons() = singletonRepository
        .list()
        .map {
            classRepository.findByClassName(it.type)?.copy(it.name) ?: throw NoMatchingClassFoundException(it.type)
        }
        .filter { it.apiType == ApiType.CORE }

    override fun getClasses() = classRepository
        .list()
        .filter {
            for (singleton in singletonRepository.list()) {
                if (singleton.type == it.type || classGraphService.doClassInherits(it, singleton.type)) return@filter false
            }
            it.apiType == ApiType.CORE
        }

    override fun getGlobalEnums() = globalEnumRepository.list()

    override fun updatePropertyIfShouldUseSuper(className: String, propertyName: String) {
        fun inner(className: String, propertyName: String, isSetter: Boolean) {
            val clazz = classRepository.findByClassName(className) ?: throw NoMatchingClassFoundException(className)
            val property = clazz.properties.first { it.name == propertyName }

            val setter = property.internal.setter

            if (isSetter && setter == null) return

            val methodName = if (isSetter) setter!! else property.internal.getter
            val returnType = if (isSetter) "" else property.type
            val arguments = if (isSetter) {
                listOf(Argument(property.name, property.type, null, null))
            } else {
                listOf()
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
                ),
                clazz.engineClassDBIndexName
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

        inner(className, propertyName, true)
        inner(className, propertyName, false)
    }

    override fun findGetSetMethodsAndUpdateProperties() {
        for (enrichedClass in classRepository.list()) {
            for (property in enrichedClass.properties) {
                for (method in enrichedClass.methods) {
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
            }
        }
    }

    override fun findEnumValue(enumClassName: ClassTypeNameWrapper, enumValue: Long): DefaultEnumValue {
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
