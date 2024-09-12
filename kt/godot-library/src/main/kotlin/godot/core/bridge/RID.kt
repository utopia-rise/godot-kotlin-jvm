@file:Suppress("PackageDirectoryMismatch")

package godot.core

@Suppress("MemberVisibilityCanBePrivate")
class RID : Comparable<RID> {

    /**
     * Returns the ID of the referenced low-level resource.
     */
    val id: Long

    //CONSTRUCTOR
    /**
     * Constructs an empty RID with the invalid ID 0.
     */
    constructor(id: Long) {
        this.id = id
    }

    /**
     * Constructs a RID as a copy of the given RID.
     */
    constructor(from: RID) {
        this.id = from.id
    }

    //API
    /**
     * Returns `true` if the RID is not `0`.
     */
    fun isValid() = id != 0L

    /**
     * Returns `true` if the RID is `0`.
     */
    fun isNull() = id == 0L

    //UTILITIES
    override fun compareTo(other: RID) = when {
        this == other -> 0
        this.id < other.id -> -1
        else -> 1
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is RID -> {
                id == other.id
            }
            else -> false
        }
    }

    override fun hashCode(): Int {
        return id.toInt()
    }

    override fun toString(): String {
        return "RID($id)"
    }
}
