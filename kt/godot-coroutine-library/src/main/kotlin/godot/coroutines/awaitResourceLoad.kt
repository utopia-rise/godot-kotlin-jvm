package godot.coroutines

import godot.Error
import godot.Resource
import godot.ResourceLoader
import godot.ResourceLoader.CacheMode
import godot.core.variantArrayOf
import godot.global.GD
import godot.util.RealT
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
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
    val error = this.loadThreadedRequest(
        path = path,
        typeHint = typeHint,
        useSubThreads = useSubThreads,
        cacheMode = cacheMode,
    )

    if (error != Error.OK) {
        GD.printErr("Could not trigger resource load. Got error: $error")
        return null
    }

    // early return in case the resource is already loaded
    if (this.loadThreadedGetStatus(path) == ResourceLoader.ThreadLoadStatus.THREAD_LOAD_LOADED) {
        return this.loadThreadedGet(path)
    }

    return suspendCancellableCoroutine { continuation ->
        CoroutineScope(Dispatchers.Default).launch {
            var success = false
            do {
                val progress = variantArrayOf<Any?>()

                val status = awaitDeferred {
                    this@awaitLoad.loadThreadedGetStatus(
                        path = path,
                        progress = progress,
                    ).also {
                        (progress.firstOrNull() as? RealT)?.let { onProgress(it) }
                    }
                }

                when (status) {
                    ResourceLoader.ThreadLoadStatus.THREAD_LOAD_LOADED -> success = true
                    ResourceLoader.ThreadLoadStatus.THREAD_LOAD_IN_PROGRESS -> {
                        // no op
                    }

                    ResourceLoader.ThreadLoadStatus.THREAD_LOAD_INVALID_RESOURCE,
                    ResourceLoader.ThreadLoadStatus.THREAD_LOAD_FAILED -> continuation.resumeWithException(
                        IllegalStateException("Failed to load resource: $status")
                    )
                }
            } while (status == ResourceLoader.ThreadLoadStatus.THREAD_LOAD_IN_PROGRESS)

            if (success) {
                continuation.resume(this@awaitLoad.loadThreadedGet(path))
            }
        }
    }
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
