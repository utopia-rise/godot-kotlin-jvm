package godot.global

import godot.Object
import godot.RandomNumberGenerator
import godot.Resource
import godot.ResourceLoader
import godot.core.*
import godot.extensions.godotStatic
import godot.core.Dictionary
import godot.core.memory.MemoryManager
import godot.extensions.loadAs

import godot.util.nullptr


object GD : GDMath, GDCore, GDRandom, GDPrint {
    override var rng: RandomNumberGenerator by godotStatic {
        RandomNumberGenerator()
    }

    /** Asserts that the condition is true.
    If the condition is false, an error is generated and the program is halted until you resume it.
    Only executes in debug builds. Use it for debugging purposes, to make sure a statement is true during development. */
    @JvmStatic
    @JvmOverloads
    fun assert(condition: Boolean, message: String = "") = assert(condition) { message }

    /** Returns whether instance is a valid object (e.g. has not been deleted from memory).*/
    @JvmStatic
    fun isInstanceValid(instance: Object?): Boolean {
        if (instance != null) {
            return instance.rawPtr != nullptr && MemoryManager.isInstanceValid(instance)
        }
        return false
    }

    /** Returns length of Variant var
     * Note: Generates a fatal error if Variant can not provide a length.
     * */
    @JvmStatic
    fun len(what: Any?): Int {
        if (what is Collection<*>) {
            return what.size
        } else if (what is Map<*, *>) {
            return what.size
        }

        return when (what) {
            is String -> len(what)
            is NodePath -> len(what)
            is Dictionary<*, *> -> len(what)
            is VariantArray<*> -> len(what)
            is PackedByteArray -> len(what)
            is PackedInt32Array -> len(what)
            is PackedFloat64Array -> len(what)
            is PackedStringArray -> len(what)
            is PackedVector2Array -> len(what)
            is PackedVector3Array -> len(what)
            is PackedColorArray -> len(what)
            else -> throw IllegalArgumentException("This type doesn't have a length. It must be a compatible Variant, Collection or Map")
        }
    }

    /**
     * Loads a resource from the filesystem located at path.
     * The resource is loaded on the method call (unless it's referenced already elsewhere, e.g. in another script or in the scene), which might cause slight delay, especially when loading scenes.
     * Important: The path must be absolute, a local path will just return null.
     * */
    @Suppress("NOTHING_TO_INLINE", "UNCHECKED_CAST")
    @JvmStatic
    @JvmOverloads
    inline fun <T : Resource> load(
        path: String,
        typeHint: String = "",
        cacheMode: ResourceLoader.CacheMode = ResourceLoader.CacheMode.CACHE_MODE_REUSE
    ): T? {
        return ResourceLoader.loadAs(path, typeHint, cacheMode)
    }
}
