package godot.common.util

// A basic LRU cache.
class LRUCache<K, V>(private val capacity: Int) : LinkedHashMap<K, V>(capacity, 0.75f, true) {
    override fun removeEldestEntry(eldest: MutableMap.MutableEntry<K, V>?): Boolean {
        return size > capacity
    }
}
