package godot.registration.model.ext

import godot.common.util.NaturalT
import godot.common.util.RealT
import godot.registration.model.types.GodotClass
import godot.registration.model.types.Type
import godot.registration.model.types.TypeKind
import godot.registration.model.types.TYPE_BOOLEAN
import godot.registration.model.types.TYPE_BYTE
import godot.registration.model.types.TYPE_DOUBLE
import godot.registration.model.types.TYPE_FLOAT
import godot.registration.model.types.TYPE_INT
import godot.registration.model.types.TYPE_KOTLIN_STRING
import godot.registration.model.types.TYPE_LONG
import godot.registration.model.types.TYPE_SHORT
import godot.tools.common.constants.isCollectionsType

fun Type.isCoreType(): Boolean = kind == TypeKind.CORE_TYPE

fun Type.isNodeType(): Boolean {
    return (this as? GodotClass)?.isOrInherits(godot.api.Node::class.java.name) == true
}

fun Type.isKotlinCollection(): Boolean = isCollectionsType(fqName)

private val javaCollection = arrayOf(
    "java.util.ArrayList",
    "java.util.LinkedList",
    "java.util.Vector",
    "java.util.Stack",
    "java.util.HashSet",
    "java.util.LinkedHashSet",
    "java.util.TreeSet",
    "java.util.PriorityQueue",
    "java.util.ArrayDeque",
    "java.util.HashMap",
    "java.util.LinkedHashMap",
    "java.util.TreeMap",
    "java.util.Hashtable",
    "java.util.List",
    "java.util.Set",
    "java.util.Queue",
    "java.util.Deque",
    "java.util.Map",
    "java.util.SortedSet",
    "java.util.NavigableSet",
    "java.util.SortedMap",
    "java.util.NavigableMap"
)

fun Type.isJavaCollection(): Boolean = javaCollection.contains(fqName)

fun Type.isEnum(): Boolean = kind == TypeKind.ENUM

fun Type.isBitField(): Boolean = kind == TypeKind.BITFIELD

fun Type.isRefCounted(): Boolean =
    (this as? GodotClass)?.isOrInherits(godot.api.RefCounted::class.java.name) == true

private fun GodotClass.isOrInherits(targetFqName: String): Boolean {
    var current: GodotClass? = this
    while (current != null) {
        if (current.fqName == targetFqName) {
            return true
        }
        current = current.parent
    }
    return false
}

fun Type.isGodotPrimitive(): Boolean = when (fqName) {
    TYPE_INT,
    NaturalT::class.qualifiedName,
    TYPE_LONG,
    TYPE_FLOAT,
    RealT::class.qualifiedName,
    TYPE_DOUBLE,
    TYPE_BOOLEAN,
    TYPE_BYTE,
    TYPE_SHORT,
    TYPE_KOTLIN_STRING -> true

    else -> false
}
