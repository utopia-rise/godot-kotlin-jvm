@file:Suppress("unused", "PackageDirectoryMismatch")

package godot.core

import godot.annotation.CoreTypeHelper
import godot.core.memory.MemoryManager
import godot.core.memory.TransferContext
import godot.util.MapIterator
import godot.util.VoidPtr
import kotlin.jvm.internal.Reflection
import kotlin.reflect.KClass

class Dictionary<K, V> : NativeCoreType, MutableMap<K, V> {

    internal var keyVariantType = VariantType.NIL
    internal var valueVariantType = VariantType.NIL

    @PublishedApi
    internal constructor(handle: VoidPtr) {
        keyVariantType = VariantType.ANY
        valueVariantType = VariantType.ANY
        _handle = handle
        MemoryManager.registerNativeCoreType(this, VariantType.DICTIONARY)
    }

    constructor(keyClass: Class<*>, valueClass: Class<*>) : this(Reflection.getOrCreateKotlinClass(keyClass), Reflection.getOrCreateKotlinClass(valueClass))

    @PublishedApi
    internal constructor(keyClass: KClass<*>, valueClass: KClass<*>) {

        val keyVariantType = variantMapper[keyClass]
        checkNotNull(keyVariantType) {
            "Can't create a Dictionary with generic key ${keyClass}."
        }
        val valueVariantType = variantMapper[valueClass]
        checkNotNull(valueVariantType) {
            "Can't create a Dictionary with generic value ${valueClass}."
        }

        this.keyVariantType = keyVariantType
        this.valueVariantType = valueVariantType
        _handle = Bridge.engine_call_constructor()
        MemoryManager.registerNativeCoreType(this, VariantType.DICTIONARY)
    }

    //########################PUBLIC###############################
    //PROPERTIES
    override val size: Int
        get() {
            Bridge.engine_call_size(_handle)
            return TransferContext.readReturnValue(VariantType.JVM_INT) as Int
        }

    override val keys: MutableSet<K>
        get() = object : AbstractMutableSet<K>() {
            override fun add(element: K): Boolean = throw UnsupportedOperationException("Add is not supported on keys")
            override fun clear() {
                this@Dictionary.clear()
            }

            override operator fun contains(element: K): Boolean = containsKey(element)

            override operator fun iterator(): MutableIterator<K> {
                val entryIterator = keys().iterator()
                return object : MutableIterator<K> {
                    override fun hasNext(): Boolean = entryIterator.hasNext()
                    override fun next(): K = entryIterator.next()
                    override fun remove() = throw UnsupportedOperationException("Remove is not supported on keys")
                }
            }

            override fun remove(element: K): Boolean {
                if (containsKey(element)) {
                    this@Dictionary.remove(element)
                    return true
                }
                return false
            }

            override val size: Int get() = this@Dictionary.size
        }

    override val values: MutableCollection<V>
        get() = object : AbstractMutableCollection<V>() {
            override fun add(element: V): Boolean =
                throw UnsupportedOperationException("Add is not supported on values")

            override fun clear() = this@Dictionary.clear()

            override operator fun contains(element: V): Boolean = containsValue(element)

            override operator fun iterator(): MutableIterator<V> {
                val entryIterator = values().iterator()
                return object : MutableIterator<V> {
                    override fun hasNext(): Boolean = entryIterator.hasNext()
                    override fun next(): V = entryIterator.next()
                    override fun remove() = throw UnsupportedOperationException("Remove is not supported on values")
                }
            }

            override val size: Int get() = this@Dictionary.size
        }

    override val entries: MutableSet<MutableMap.MutableEntry<K, V>>
        get() = object : AbstractMutableSet<MutableMap.MutableEntry<K, V>>() {

            override fun add(element: MutableMap.MutableEntry<K, V>): Boolean {
                val ret = has(element.key)
                this@Dictionary[element.key] = element.value
                return ret
            }

            override fun clear() {
                this@Dictionary.clear()
            }

            override operator fun contains(element: MutableMap.MutableEntry<K, V>): Boolean {
                val value = get(element.key, null)
                if (value == element.value) {
                    return true
                }
                return false
            }

            override operator fun iterator(): MapIterator<K, V> {
                return MapIterator(
                    this@Dictionary.keys.iterator(),
                    this@Dictionary::get,
                    this@Dictionary::set,
                    this@Dictionary::erase
                )
            }

            override fun remove(element: MutableMap.MutableEntry<K, V>): Boolean {
                val value = get(element.key, null)
                if (value == element.value) {
                    this@Dictionary.remove(element.key)
                    return true
                }
                return false
            }

            override val size: Int get() = this@Dictionary.size
        }

//CONSTRUCTOR
    /**
     * Create a shallow copy of the Dictionary
     */
    constructor(other: Dictionary<K, V>) {
        keyVariantType = other.keyVariantType
        valueVariantType = other.valueVariantType
        _handle = other._handle
        MemoryManager.registerNativeCoreType(this, VariantType.DICTIONARY)
    }


//API
    /**
     * Clear the dictionary, removing all key/value pairs.
     */
    override fun clear() {
        Bridge.engine_call_clear(_handle)
    }

    override fun containsKey(key: K) = contains(key)

    override fun containsValue(value: V): Boolean {
        values.forEach {
            if (it == value)
                return true
        }
        return false
    }

    /**
     * Creates a copy of the dictionary, and returns it.
     * The deep parameter causes inner dictionaries and arrays to be copied recursively, but does not apply to objects.
     */

    fun duplicate(deep: Boolean): Dictionary<K, V> {
        TransferContext.writeArguments(VariantType.BOOL to deep)
        Bridge.engine_call_duplicate(_handle)
        @Suppress("UNCHECKED_CAST")
        return (TransferContext.readReturnValue(VariantType.DICTIONARY) as Dictionary<K, V>).also {
            it.keyVariantType = keyVariantType
            it.valueVariantType = valueVariantType
        }
    }

    /**
     * Erase a dictionary key/value pair by key. Doesn't return a Boolean like the GDScript version because the GDNative function doesn't return anything
     */
    fun erase(key: K) {
        TransferContext.writeArguments(keyVariantType to key)
        Bridge.engine_call_erase(_handle)
    }

    fun findKey(value: V): K {
        TransferContext.writeArguments(valueVariantType to value)
        Bridge.engine_call_find_key(_handle)
        @Suppress("UNCHECKED_CAST")
        return TransferContext.readReturnValue(keyVariantType, false) as K
    }

    /**
     * Returns the current value for the specified key in the Dictionary.
     * If the key does not exist, the method returns the value of the optional default argument, or null if it is omitted.
     */
    fun get(key: K, default: V?): V? {
        TransferContext.writeArguments(keyVariantType to key, valueVariantType to default)
        Bridge.engine_call_get(_handle)
        @Suppress("UNCHECKED_CAST")
        return TransferContext.readReturnValue(valueVariantType, true) as V
    }

    /**
     * Returns true if the dictionary has a given key.
     * Note: This is equivalent to using the in operator as follows:
     */
    fun has(key: K): Boolean {
        TransferContext.writeArguments(keyVariantType to key)
        Bridge.engine_call_has(_handle)
        return TransferContext.readReturnValue(VariantType.BOOL) as Boolean
    }


    /**
     * Returns true if the dictionary has all of the keys in the given array.
     */
    fun hasAll(keys: VariantArray<K>): Boolean {
        TransferContext.writeArguments(VariantType.ARRAY to keys)
        Bridge.engine_call_hasAll(_handle)
        return TransferContext.readReturnValue(VariantType.BOOL) as Boolean
    }


    /**
     * Returns a hashed integer value representing the dictionary contents. This can be used to compare dictionaries by value
     */
    fun hash(): Int {
        Bridge.engine_call_hash(_handle)
        return TransferContext.readReturnValue(VariantType.JVM_INT) as Int
    }

    /**
     * Returns true if the dictionary is read-only. See [makeReadOnly]
     */
    fun isReadOnly(): Boolean {
        Bridge.engine_call_is_read_only(_handle)
        return TransferContext.readReturnValue(VariantType.BOOL, false) as Boolean
    }

    /**
     * Returns true if the dictionary is empty.
     */
    override fun isEmpty(): Boolean {
        Bridge.engine_call_is_empty(_handle)
        return TransferContext.readReturnValue(VariantType.BOOL) as Boolean
    }

    /**
     * Returns the list of keys in the Dictionary.
     */
    fun keys(): VariantArray<K> {
        Bridge.engine_call_keys(_handle)
        @Suppress("UNCHECKED_CAST")
        return (TransferContext.readReturnValue(VariantType.ARRAY) as VariantArray<K>).also {
            it.variantType = keyVariantType
        }
    }

    fun makeReadOnly() {
        Bridge.engine_call_make_read_only(_handle)
    }

    fun merge(dictionary: Dictionary<K, V>, overwrite: Boolean = false) {
        TransferContext.writeArguments(VariantType.DICTIONARY to dictionary, VariantType.BOOL to overwrite)
        Bridge.engine_call_merge(_handle)
    }

    override fun put(key: K, value: V): V? {
        val ret = get(key, null)
        set(key, value)
        return ret
    }

    override fun putAll(from: Map<out K, V>) {
        from.forEach {
            set(it.key, it.value)
        }
    }

    override fun remove(key: K): V? {
        val ret = get(key, null)
        erase(key)
        return ret
    }

    /**
     * Returns the list of values in the Dictionary.
     */
    fun values(): VariantArray<V> {
        Bridge.engine_call_values(_handle)
        @Suppress("UNCHECKED_CAST")
        return (TransferContext.readReturnValue(VariantType.ARRAY) as VariantArray<V>).also {
            it.variantType = valueVariantType
        }
    }


    //UTILITIES
    override operator fun get(key: K): V {
        TransferContext.writeArguments(keyVariantType to key)
        Bridge.engine_call_operator_get(_handle)
        @Suppress("UNCHECKED_CAST")
        return TransferContext.readReturnValue(valueVariantType, true) as V
    }

    @CoreTypeHelper
    inline fun <R> get(key: K, block: V.() -> R): R {
        val localCopy = this[key]
        val ret = localCopy.block()
        this[key] = localCopy
        return ret
    }

    operator fun set(key: K, value: V) {
        TransferContext.writeArguments(keyVariantType to key, valueVariantType to value)
        Bridge.engine_call_operator_set(_handle)
    }

    operator fun contains(key: K): Boolean = has(key)

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Dictionary<*, *>) {
            return false
        }
        TransferContext.writeArguments(VariantType.DICTIONARY to this, VariantType.DICTIONARY to other)
        Bridge.engine_call_equals(_handle)
        return TransferContext.readReturnValue(VariantType.BOOL) as Boolean
    }

    override fun hashCode(): Int {
        return _handle.hashCode()
    }

    override fun toString(): String {
        return "Dictionary($size)"
    }

    @Suppress("FunctionName")
    private object Bridge {
        external fun engine_call_constructor(): VoidPtr

        external fun engine_call_clear(_handle: VoidPtr)
        external fun engine_call_duplicate(_handle: VoidPtr)
        external fun engine_call_erase(_handle: VoidPtr)
        external fun engine_call_find_key(_handle: VoidPtr)
        external fun engine_call_get(_handle: VoidPtr)
        external fun engine_call_has(_handle: VoidPtr)
        external fun engine_call_hasAll(_handle: VoidPtr)
        external fun engine_call_hash(_handle: VoidPtr)
        external fun engine_call_is_empty(_handle: VoidPtr)
        external fun engine_call_is_read_only(_handle: VoidPtr)
        external fun engine_call_keys(_handle: VoidPtr)
        external fun engine_call_make_read_only(_handle: VoidPtr)
        external fun engine_call_merge(_handle: VoidPtr)
        external fun engine_call_size(_handle: VoidPtr)
        external fun engine_call_values(_handle: VoidPtr)
        external fun engine_call_operator_get(_handle: VoidPtr)
        external fun engine_call_operator_set(_handle: VoidPtr)
        external fun engine_call_equals(_handle: VoidPtr)
    }


    companion object {
        inline operator fun <reified K, reified V> invoke() = Dictionary<K, V>(K::class, V::class)

    }
}

inline fun <reified K, reified V> dictionaryOf(vararg args: Pair<K, V>) = Dictionary<K, V>().also {
    it.putAll(args)
}

/**
 * Convert a Map into a Dictionary
 */
inline fun <reified K, reified V> Map<K, V>.toDictionary() = Dictionary<K, V>().also {
    it.putAll(this)
}
