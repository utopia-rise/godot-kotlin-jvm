package godot.codegen.services.impl

import godot.codegen.Graph
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedMethod
import godot.codegen.models.enriched.EnrichedProperty
import godot.codegen.repositories.ClassRepository
import godot.codegen.services.IClassGraphService

class ClassGraphService(classRepository: ClassRepository) : IClassGraphService {
    private val classGraph = Graph(classRepository.list()) { child, parent ->
        child.inherits == parent.name
    }

    override fun getMethodFromAncestor(
        cl: EnrichedClass,
        method: EnrichedMethod
    ): Pair<EnrichedClass, EnrichedMethod>? {
        fun check(m: EnrichedMethod): Boolean {
            if (m.name == method.name && m.arguments.size == method.arguments.size) {
                var flag = true

                m.arguments.withIndex().forEach {
                    if (it.value.type != method.arguments[it.index].type) flag = false
                }

                if (flag) return true
            }
            return false
        }

        tailrec fun Graph.Node<EnrichedClass>.findMethodInHierarchy(): Pair<EnrichedClass, EnrichedMethod>? {
            value.methods.forEach {
                if (check(it)) return value to it
            }

            return parent?.findMethodInHierarchy()
        }
        return classGraph.nodes.find { it.value.name == cl.name }?.parent?.findMethodInHierarchy()
    }

    override fun doAncestorsHaveProperty(cl: EnrichedClass, prop: EnrichedProperty): Boolean {
        if (cl.inherits.isNullOrEmpty()) return false

        tailrec fun Graph.Node<EnrichedClass>.findPropertyInHierarchy(): Boolean? {
            value.properties.forEach {
                if (it.name == prop.name) return true
            }
            return parent?.findPropertyInHierarchy()
        }
        return classGraph.nodes.find { it.value.name == cl.name }!!.parent!!.findPropertyInHierarchy() ?: false
    }

    override fun doAncestorsHaveMethod(cl: EnrichedClass, method: EnrichedMethod): Boolean {
        if (method.name == "toString") return true

        if (cl.inherits == "") return false

        return getMethodFromAncestor(cl, method) != null
    }

    override fun getSanitisedArgumentName(cl: EnrichedClass, method: EnrichedMethod, index: Int): String {
        val parentMethod = getMethodFromAncestor(cl, method)?.second
        return (parentMethod ?: method).arguments[index].name
    }
}