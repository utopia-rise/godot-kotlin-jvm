package godot.coroutines

import godot.Error
import godot.Resource
import godot.ResourceLoader
import godot.ResourceLoader.CacheMode
import godot.core.variantArrayOf
import godot.global.GD
import godot.common.util.RealT
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException


/**
 * Suspends the coroutine until a resource is loaded from the given path.
 *
 * @param path The path of the resource to be loaded.
 * @param typeHint A hint about the type of resource being loaded.
 * @param useSubThreads Specifies whether to use sub-threads for loading the resource.
 * @param cacheMode The cache mode to be used while loading the resource.
 * @param onProgress A callback function to track the progress of resource loading.
 * @return The loaded resource, or null if there was an error.
 */
public suspend inline fun ResourceLoader.awaitLoad(
    path: String,
    typeHint: String = "",
    useSubThreads: Boolean = false,
    cacheMode: CacheMode = ResourceLoader.CacheMode.CACHE_MODE_REUSE,
    crossinline onProgress: (RealT) -> Unit = {},
): Resource? {
    // early return in case the resource is already loaded
    if (hasCached(path)) {
        return load(path)
    }

    // Start a new job so we have a suspension point in case the coroutine is currently in the main thread.
    val job = GodotCoroutine.async(Dispatchers.Default) {
        load(path)
    }

    return job.await()
}

/**
 * Suspends the coroutine until a resource is loaded from the given path.
 *
 * @param path The path of the resource to be loaded.
 * @param typeHint A hint about the type of resource being loaded.
 * @param useSubThreads Specifies whether to use sub-threads for loading the resource.
 * @param cacheMode The cache mode to be used while loading the resource.
 * @param onProgress A callback function to track the progress of resource loading.
 * @return The loaded resource, or null if there was an error.
 */
public suspend inline fun <R> ResourceLoader.awaitLoadAs(
    path: String,
    typeHint: String = "",
    useSubThreads: Boolean = false,
    cacheMode: CacheMode = ResourceLoader.CacheMode.CACHE_MODE_REUSE,
    crossinline onProgress: (RealT) -> Unit = {},
): R? {
    @Suppress("UNCHECKED_CAST")
    return this.awaitLoad(path, typeHint, useSubThreads, cacheMode, onProgress) as? R
}
