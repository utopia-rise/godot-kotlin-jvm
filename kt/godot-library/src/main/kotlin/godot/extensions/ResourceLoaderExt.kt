package godot.extensions

import godot.Resource
import godot.ResourceLoader

@Suppress("NOTHING_TO_INLINE", "UNCHECKED_CAST")
inline fun <T : Resource> ResourceLoader.loadAs(path: String, typeHint: String = "", noCache: Boolean = false): T? {
    return load(path, typeHint, noCache) as T?
}
