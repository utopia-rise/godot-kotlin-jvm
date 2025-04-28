package godot.coroutines

import godot.core.Error
import godot.api.Resource
import godot.api.ResourceLoader
import godot.api.ResourceLoader.CacheMode
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
 * @param cacheMode The cache mode to be used while loading the resource.
 * @return The loaded resource, or null if there was an error.
 */
public suspend inline fun ResourceLoader.awaitLoad(
    path: String,
    typeHint: String = "",
    cacheMode: CacheMode = CacheMode.REUSE,
): Resource? {
    // early return in case the resource is already loaded
    if (hasCached(path)) {
        return load(path)
    }

    // Start a new job so we have a suspension point in case the coroutine is currently in the main thread.
    val job = GodotCoroutine.async(GodotDispatchers.ThreadPool) {
        load(path, typeHint, cacheMode)
    }

    return job.await()
}

/**
 * Suspends the coroutine until a resource is loaded from the given path.
 *
 * @param path The path of the resource to be loaded.
 * @param typeHint A hint about the type of resource being loaded.
 * @param cacheMode The cache mode to be used while loading the resource.
 * @return The loaded resource, or null if there was an error.
 */
public suspend inline fun <R> ResourceLoader.awaitLoadAs(
    path: String,
    typeHint: String = "",
    cacheMode: CacheMode = CacheMode.REUSE,
): R? {
    @Suppress("UNCHECKED_CAST")
    return this.awaitLoad(path, typeHint, cacheMode) as? R
}
