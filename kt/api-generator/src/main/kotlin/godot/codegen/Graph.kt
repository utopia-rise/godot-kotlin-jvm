package godot.codegen

class Graph<T>(elements: List<T>, sortFun: (T, T) -> Boolean) {
    val nodes = mutableListOf<Node<T>>()

    init {
        elements.forEach { nodes.add(Node(it)) }
        nodes.forEach { v1 ->
            nodes.forEach { v2 ->
                if (sortFun(v1.value, v2.value)) {
                    v2.childs.add(v1)
                    v1.parent = v2
                }
            }
        }
    }


    class Node<T>(val value: T) {
        var parent: Node<T>? = null
        var childs = mutableListOf<Node<T>>()
    }
}


fun List<Class>.buildTree(): Graph<Class> {
    return Graph(this) { child, parent -> child.baseClass == parent.newName }
}

fun Graph<Class>.getMethodFromAncestor(cl: Class, method: Method): Pair<Class, Method>? {
    fun check(m: Method): Boolean {
        if (m.newName == method.newName && m.arguments.size == method.arguments.size) {
            var flag = true

            m.arguments.withIndex().forEach {
                if (it.value.type != method.arguments[it.index].type) flag = false
            }

            if (flag) return true
        }
        return false
    }

    tailrec fun Graph.Node<Class>.findMethodInHierarchy(): Pair<Class, Method>? {
        value.methods.forEach {
            if (check(it)) return value to it
        }

        return parent?.findMethodInHierarchy()
    }
    return nodes.find { it.value.newName == cl.newName }?.parent?.findMethodInHierarchy()
}

fun Graph<Class>.doAncestorsHaveMethod(cl: Class, method: Method): Boolean {
    if (method.newName == "toString") return true

    if (cl.baseClass == "") return false

    return getMethodFromAncestor(cl, method) != null
}


fun Graph<Class>.doAncestorsHaveProperty(cl: Class, prop: Property): Boolean {
    if (cl.baseClass == "") return false

    tailrec fun Graph.Node<Class>.findPropertyInHierarchy(): Boolean? {
        value.properties.forEach {
            if (it.newName == prop.newName) return true
        }
        return parent?.findPropertyInHierarchy()
    }
    return nodes.find { it.value.newName == cl.newName }!!.parent!!.findPropertyInHierarchy() ?: false
}

fun Graph<Class>.getSanitisedArgumentName(method: Method, index: Int, cl: Class): String {
    val parentMethod = getMethodFromAncestor(cl, method)?.second
    return (parentMethod ?: method).arguments[index].name
}

fun Graph<Class>.isObjectOrItsChild(className: String): Boolean {
    var isObjectFamily = false
    var classToCheck = nodes.find { it.value.newName == className } ?: return false

    while (!isObjectFamily) {
        isObjectFamily = classToCheck.value.newName == "Object"

        if (isObjectFamily) return true

        classToCheck = classToCheck.parent ?: return false
    }
    return isObjectFamily
}

fun Graph<Class>.getBaseClass(clazz: Class): Class? = nodes.find { it.value.newName == clazz.baseClass }?.value
