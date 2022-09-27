package godot.core

@JvmInline
value class ObjectID(val id: Long) {
    val isReference: Boolean
        get() = (id and OBJECTDB_REFERENCE_BIT) > 0

    val index: Int
        get() = (id and OBJECTDB_SLOT_MAX_COUNT_MASK).toInt()

    val validator: Int
        get() = (id and OBJECTDB_VALIDATOR_MASK).toInt()

    companion object {
        //Copied from object.h, change that part if Godot does.
        private const val OBJECTDB_VALIDATOR_BITS = 39
        const val OBJECTDB_VALIDATOR_MASK = ((1L shl OBJECTDB_VALIDATOR_BITS) - 1L)
        const val OBJECTDB_SLOT_MAX_COUNT_BITS = 24
        const val OBJECTDB_SLOT_MAX_COUNT_MASK = ((1L shl OBJECTDB_SLOT_MAX_COUNT_BITS) - 1L)
        const val OBJECTDB_REFERENCE_BIT = (1L shl (OBJECTDB_SLOT_MAX_COUNT_BITS + OBJECTDB_VALIDATOR_BITS))
    }
}
