package godot.extensions

import godot.Resource
import godot.ResourceLoader

@Suppress("NOTHING_TO_INLINE", "UNCHECKED_CAST")
inline fun <T : Resource> ResourceLoader.loadAs(
    path: String,
    typeHint: String = "",
    cacheMode: ResourceLoader.CacheMode = ResourceLoader.CacheMode.CACHE_MODE_REUSE
): T? {
    return load(path, typeHint, cacheMode) as T?
}
