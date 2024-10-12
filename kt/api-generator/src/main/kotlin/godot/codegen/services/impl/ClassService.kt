package godot.codegen.services.impl

import com.squareup.kotlinpoet.UNIT
import godot.codegen.exceptions.NoMatchingClassFoundException
import godot.codegen.extensions.getTypeClassName
import godot.codegen.extensions.isEnum
import godot.codegen.models.ApiType
import godot.codegen.models.Argument
import godot.codegen.models.Method
import godot.codegen.models.ReturnValue
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedMethod
import godot.codegen.models.enriched.EnrichedProperty
import godot.codegen.repositories.ClassRepository
import godot.codegen.repositories.SingletonRepository
import godot.codegen.services.IClassGraphService
import godot.codegen.services.IClassService
import godot.tools.common.constants.GodotTypes

class ClassService(
    private val classRepository: ClassRepository,
    private val singletonRepository: SingletonRepository,
    private val classGraphService: IClassGraphService
) : IClassService {
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
}
