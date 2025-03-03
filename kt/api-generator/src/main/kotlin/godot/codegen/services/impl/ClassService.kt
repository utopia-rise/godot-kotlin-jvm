package godot.codegen.services.impl

import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedMethod
import godot.codegen.models.enriched.EnrichedProperty
import godot.codegen.repositories.ClassRepository
import godot.codegen.services.IClassService

class ClassService(val classRepository: ClassRepository) : IClassService {
    override fun getTypes() = classRepository.listTypes()
    override fun getClasses() = classRepository.listClasses()
    override fun getSingletons() = classRepository.listSingleton()

    override fun findTypeByName(name: String) = classRepository.findTypeByName(name)
    override fun findClassByName(name: String) = classRepository.findClassByName(name)
    override fun findSingletonByName(name: String) = classRepository.findSingletonByName(name)

    override fun getMethodFromAncestor(
        clazz: EnrichedClass,
        method: EnrichedMethod
    ): Pair<EnrichedClass, EnrichedMethod>? {
        fun check(m: EnrichedMethod): Boolean {
            if (m.name != method.name || m.arguments.size != method.arguments.size) {
                return false
            }

            m.arguments.withIndex().forEach {
                if (it.value.type != method.arguments[it.index].type) return false
            }
            return true
        }

        tailrec fun EnrichedClass.findMethodInHierarchy(): Pair<EnrichedClass, EnrichedMethod>? {
            methods.forEach {
                if (check(it)) return this to it
            }

            return parent?.findMethodInHierarchy()
        }
        return clazz.parent?.findMethodInHierarchy()
    }

    override fun doAncestorsHaveProperty(clazz: EnrichedClass, property: EnrichedProperty): Boolean {
        if (clazz.parent == null) return false

        tailrec fun EnrichedClass.findPropertyInHierarchy(): Boolean? {
            properties.forEach {
                if (it.name == property.name) {
                    return true
                }
            }
            return parent?.findPropertyInHierarchy()
        }
        return clazz.parent?.findPropertyInHierarchy() == true
    }

    override fun doAncestorsHaveMethod(clazz: EnrichedClass, method: EnrichedMethod): Boolean {
        if (clazz.parent == null) return false

        return getMethodFromAncestor(clazz, method) != null
    }

    override fun getSanitisedArgumentName(cl: EnrichedClass, method: EnrichedMethod, index: Int): String {
        val parentMethod = getMethodFromAncestor(cl, method)?.second
        return (parentMethod ?: method).arguments[index].name
    }
}
