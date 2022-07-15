package godot.codegen.extensions

import godot.codegen.Graph
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedMethod
import godot.codegen.models.enriched.EnrichedProperty

//fun Graph<EnrichedClass>.getMethodFromAncestor(cl: EnrichedClass, method: EnrichedMethod): Pair<EnrichedClass, EnrichedMethod>? {
//    fun check(m: EnrichedMethod): Boolean {
//        if (m.name == method.name && m.arguments.size == method.arguments.size) {
//            var flag = true
//
//            m.arguments.withIndex().forEach {
//                if (it.value.type != method.arguments[it.index].type) flag = false
//            }
//
//            if (flag) return true
//        }
//        return false
//    }
//
//    tailrec fun Graph.Node<EnrichedClass>.findMethodInHierarchy(): Pair<EnrichedClass, EnrichedMethod>? {
//        value.methods.forEach {
//            if (check(it)) return value to it
//        }
//
//        return parent?.findMethodInHierarchy()
//    }
//    return nodes.find { it.value.name == cl.name }?.parent?.findMethodInHierarchy()
//}

//fun Graph<Class>.doAncestorsHaveMethod(cl: Class, method: Method): Boolean {
//    if (method.newName == "toString") return true
//
//    if (cl.baseClass == "") return false
//
//    return getMethodFromAncestor(cl, method) != null
//}


//fun Graph<EnrichedClass>.doAncestorsHaveProperty(cl: EnrichedClass, prop: EnrichedProperty): Boolean {
//    if (cl.inherits.isNullOrEmpty()) return false
//
//    tailrec fun Graph.Node<EnrichedClass>.findPropertyInHierarchy(): Boolean? {
//        value.properties.forEach {
//            if (it.name == prop.name) return true
//        }
//        return parent?.findPropertyInHierarchy()
//    }
//    return nodes.find { it.value.name == cl.name }!!.parent!!.findPropertyInHierarchy() ?: false
//}

//fun Graph<Class>.getSanitisedArgumentName(method: Method, index: Int, cl: Class): String {
//    val parentMethod = getMethodFromAncestor(cl, method)?.second
//    return (parentMethod ?: method).arguments[index].name
//}
//
//fun Graph<Class>.isObjectOrItsChild(className: String): Boolean {
//    var isObjectFamily = false
//    var classToCheck = nodes.find { it.value.newName == className } ?: return false
//
//    while (!isObjectFamily) {
//        isObjectFamily = classToCheck.value.newName == "Object"
//
//        if (isObjectFamily) return true
//
//        classToCheck = classToCheck.parent ?: return false
//    }
//    return isObjectFamily
//}
//
//fun Graph<Class>.getBaseClass(clazz: Class): Class? = nodes.find { it.value.newName == clazz.baseClass }?.value