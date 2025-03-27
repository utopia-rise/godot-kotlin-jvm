package godot.common.util

import kotlin.properties.ReadOnlyProperty

/**
 * Removal operations are not allowed and will throw an [UnsupportedOperationException].
 *
 * @param T the type of elements held in this list.
 * @property inner the internal mutable list that stores the elements.
 */
open class AddOnlyCollection<T>(inner: MutableCollection<T> = mutableListOf<T>()) : MutableCollection<T> by inner {

    // All removal operations throw an exception.
    override fun remove(element: T): Boolean = throw UnsupportedOperationException("Removal is not allowed")
    override fun removeAll(elements: Collection<T>): Boolean = throw UnsupportedOperationException("Removal is not allowed")
    override fun retainAll(elements: Collection<T>): Boolean = throw UnsupportedOperationException("Removal is not allowed")
    override fun clear() = throw UnsupportedOperationException("Removal is not allowed")
}


/**
 * The delegate list (BackingList) sends its additions to the master [MutableCollection].
 *
 * Each BackingList maintains its own internal list of elements (for reading purposes)
 * and propagates any additions to the registered BackedList.
 * Removal operations are banned and will throw an [UnsupportedOperationException].
 *
 * @param T the type of elements held in this list.
 * @property master the master BackedList to which additions are propagated.
 * @property inner the internal list that stores the elements for this BackingList.
 */
class BackingCollection<T>(
    private val master: MutableCollection<in T>,
    private val inner: MutableCollection<T> = mutableListOf<T>()
) : AddOnlyCollection<T>(inner) {

    // Override addition to propagate the change to the master.
    override fun add(element: T): Boolean {
        // Add to our local list first.
        val added = inner.add(element)
        if (added) {
            master.add(element)
        }
        return added
    }

    override fun addAll(elements: Collection<T>): Boolean {
        var changed = false
        for (el in elements) {
            changed = add(el) || changed
        }
        return changed
    }

    // Ban removal operations.
    override fun remove(element: T): Boolean = throw UnsupportedOperationException("Removal is not allowed")
    override fun removeAll(elements: Collection<T>): Boolean = throw UnsupportedOperationException("Removal is not allowed")
    override fun retainAll(elements: Collection<T>): Boolean = throw UnsupportedOperationException("Removal is not allowed")
    override fun clear() = throw UnsupportedOperationException("Removal is not allowed")
}

/**
 * A property delegate for creating a [BackingCollection] associated with a given [AddOnlyCollection].
 *
 * @param T the type of elements held in the lists.
 * @property master the master [AddOnlyCollection] that the delegated [BackingCollection] will be associated with.
 */
fun <T> back(master: AddOnlyCollection<in T>): ReadOnlyProperty<Any?, AddOnlyCollection<T>> {
    val prop = BackingCollection<T>(master)
    return ReadOnlyProperty { _, _ ->  prop}
}
