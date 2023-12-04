package godot.codegen.services.impl

import com.squareup.kotlinpoet.UNIT
import godot.codegen.exceptions.NoMatchingClassFoundException
import godot.codegen.extensions.getTypeClassName
import godot.codegen.extensions.isEnum
import godot.codegen.models.ApiType
import godot.codegen.models.Argument
import godot.codegen.models.Method
import godot.codegen.models.ReturnValue
import godot.codegen.models.enriched.EnrichedMethod
import godot.codegen.repositories.ClassRepository
import godot.codegen.repositories.SingletonRepository
import godot.codegen.services.IClassGraphService
import godot.codegen.services.IClassService
import godot.tools.common.constants.GodotTypes

class ClassService(
    private val classRepository: ClassRepository,
    private val singletonRepository: SingletonRepository,
    private val classGraphService: IClassGraphService
) : IClassService{
    override fun getSingletons() = singletonRepository
        .list()
        .map {
            classRepository.findByClassName(it.type)?.copy(it.name) ?: throw NoMatchingClassFoundException(it.type)
        }
        .filter { it.apiType == ApiType.CORE }

    override fun getClasses() = classRepository
        .list()
        .filter { it.apiType == ApiType.CORE }
        .filter {
            for (singleton in singletonRepository.list()) {
                if (singleton.type == it.type || classGraphService.doClassInherits(it, singleton.type)) return@filter false
            }
            true
        }

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
                    arguments = arguments
                ),
                clazz.engineClassDBIndexName
            )

            val parentClassAndMethod = classGraphService.getMethodFromAncestor(clazz, method)
            val hasValidAccessor = if (isSetter) property.hasValidSetterInClass else property.hasValidGetterInClass
            if (parentClassAndMethod != null && !hasValidAccessor) {
                if (isSetter) {
                    property.shouldUseSuperSetter = true
                } else {
                    property.shouldUseSuperGetter = true
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
                            method.isGetterOrSetter = true
                        }
                        property.setter -> {
                            if (method.getTypeClassName().className != UNIT || method.arguments.size > 2 || method.internal.isVirtual) continue

                            if (!property.isIndexed && method.arguments.size == 2) continue

                            if (method.arguments.size == 2 && !method.arguments[0].isEnum() && method.arguments[0].type != GodotTypes.int) continue

                            property.setterMethod = method
                            method.isGetterOrSetter = true
                        }
                    }
                }
            }
        }
    }

    override fun doAncestorsHaveProperty(className: String, propertyName: String) {
        val clazz = getClasses().first { it.name == className }
        classGraphService.doAncestorsHaveProperty(clazz, clazz.properties.first { it.name == propertyName })
    }
}