package godot.global

import godot.api.Object
import godot.api.RandomNumberGenerator
import godot.api.Resource
import godot.api.ResourceLoader
import godot.core.NodePath
import godot.core.PackedByteArray
import godot.core.PackedColorArray
import godot.core.PackedFloat64Array
import godot.core.PackedInt32Array
import godot.core.PackedStringArray
import godot.core.PackedVector2Array
import godot.core.PackedVector3Array
import godot.internal.memory.MemoryManager
import godot.extension.asStatic
import godot.extension.loadAs
import godot.common.interop.nullptr


object GD : GDMath, GDCore, GDRandom, GDPrint {
    override var rng = RandomNumberGenerator().asStatic()

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
            return instance.ptr != nullptr && MemoryManager.isInstanceValid(instance)
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
    @Suppress("NOTHING_TO_INLINE")
    @JvmStatic
    @JvmOverloads
    inline fun <T : Resource> load(
        path: String,
        typeHint: String = "",
        cacheMode: ResourceLoader.CacheMode = ResourceLoader.CacheMode.CACHE_MODE_REUSE
    ): T? {
        return ResourceLoader.loadAs(path, typeHint, cacheMode)
    }

    /**
     * The MemoryManager runs automatically at the end of each frame, but it can happen that the engine freeze for a long period of time (a loading screen).
     * You can use that method to manually trigger it if you want memory to be quickly freed.
     * */
    fun syncMemory() {
        MemoryManager.querySync()
    }


    /**
     * If some cleanups operations are needed when the game closes, you can register callbacks for it.
     * Useful when you have to free third party resources or terminate non-daemon threads.
     * */
    fun callWhenClosing(callback: () -> Unit) {
        MemoryManager.registerCallback(false, callback)
    }
}
