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