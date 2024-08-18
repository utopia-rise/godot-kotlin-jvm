// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A singleton used to load resource files from the filesystem.
 * It uses the many [ResourceFormatLoader] classes registered in the engine (either built-in or from
 * a plugin) to load files into memory and convert them to a format that can be used by the engine.
 * **Note:** You have to import the files into the engine first to load them using [load]. If you
 * want to load [Image]s at run-time, you may use [Image.load]. If you want to import audio files, you
 * can use the snippet described in [AudioStreamMP3.data].
 */
@GodotBaseType
public object ResourceLoader : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_RESOURCELOADER)
    return false
  }

  /**
   * Loads the resource using threads. If [useSubThreads] is `true`, multiple threads will be used
   * to load the resource, which makes loading faster, but may affect the main thread (and thus cause
   * game slowdowns).
   * The [cacheMode] property defines whether and how the cache should be used or updated when
   * loading the resource. See [CacheMode] for details.
   */
  @JvmOverloads
  public fun loadThreadedRequest(
    path: String,
    typeHint: String = "",
    useSubThreads: Boolean = false,
    cacheMode: CacheMode = ResourceLoader.CacheMode.CACHE_MODE_REUSE,
  ): GodotError {
    TransferContext.writeArguments(STRING to path, STRING to typeHint, BOOL to useSubThreads, LONG to cacheMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.loadThreadedRequestPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the status of a threaded loading operation started with [loadThreadedRequest] for the
   * resource at [path]. See [ThreadLoadStatus] for possible return values.
   * An array variable can optionally be passed via [progress], and will return a one-element array
   * containing the percentage of completion of the threaded loading.
   * **Note:** The recommended way of using this method is to call it during different frames (e.g.,
   * in [Node.Process], instead of a loop).
   */
  @JvmOverloads
  public fun loadThreadedGetStatus(path: String, progress: VariantArray<Any?> =
      godot.core.variantArrayOf()): ThreadLoadStatus {
    TransferContext.writeArguments(STRING to path, ARRAY to progress)
    TransferContext.callMethod(rawPtr, MethodBindings.loadThreadedGetStatusPtr, LONG)
    return ResourceLoader.ThreadLoadStatus.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the resource loaded by [loadThreadedRequest].
   * If this is called before the loading thread is done (i.e. [loadThreadedGetStatus] is not
   * [THREAD_LOAD_LOADED]), the calling thread will be blocked until the resource has finished loading.
   * However, it's recommended to use [loadThreadedGetStatus] to known when the load has actually
   * completed.
   */
  public fun loadThreadedGet(path: String): Resource? {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.loadThreadedGetPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
  }

  /**
   * Loads a resource at the given [path], caching the result for further access.
   * The registered [ResourceFormatLoader]s are queried sequentially to find the first one which can
   * handle the file's extension, and then attempt loading. If loading fails, the remaining
   * ResourceFormatLoaders are also attempted.
   * An optional [typeHint] can be used to further specify the [Resource] type that should be
   * handled by the [ResourceFormatLoader]. Anything that inherits from [Resource] can be used as a
   * type hint, for example [Image].
   * The [cacheMode] property defines whether and how the cache should be used or updated when
   * loading the resource. See [CacheMode] for details.
   * Returns an empty resource if no [ResourceFormatLoader] could handle the file, and prints an
   * error if no file is found at the specified path.
   * GDScript has a simplified [@GDScript.load] built-in method which can be used in most
   * situations, leaving the use of [ResourceLoader] for more advanced scenarios.
   * **Note:** If [ProjectSettings.editor/export/convertTextResourcesToBinary] is `true`,
   * [@GDScript.load] will not be able to read converted files in an exported project. If you rely on
   * run-time loading of files present within the PCK, set
   * [ProjectSettings.editor/export/convertTextResourcesToBinary] to `false`.
   * **Note:** Relative paths will be prefixed with `"res://"` before loading, to avoid unexpected
   * results make sure your paths are absolute.
   */
  @JvmOverloads
  public fun load(
    path: String,
    typeHint: String = "",
    cacheMode: CacheMode = ResourceLoader.CacheMode.CACHE_MODE_REUSE,
  ): Resource? {
    TransferContext.writeArguments(STRING to path, STRING to typeHint, LONG to cacheMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.loadPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
  }

  /**
   * Returns the list of recognized extensions for a resource type.
   */
  public fun getRecognizedExtensionsForType(type: String): PackedStringArray {
    TransferContext.writeArguments(STRING to type)
    TransferContext.callMethod(rawPtr, MethodBindings.getRecognizedExtensionsForTypePtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Registers a new [ResourceFormatLoader]. The ResourceLoader will use the ResourceFormatLoader as
   * described in [load].
   * This method is performed implicitly for ResourceFormatLoaders written in GDScript (see
   * [ResourceFormatLoader] for more information).
   */
  @JvmOverloads
  public fun addResourceFormatLoader(formatLoader: ResourceFormatLoader, atFront: Boolean = false):
      Unit {
    TransferContext.writeArguments(OBJECT to formatLoader, BOOL to atFront)
    TransferContext.callMethod(rawPtr, MethodBindings.addResourceFormatLoaderPtr, NIL)
  }

  /**
   * Unregisters the given [ResourceFormatLoader].
   */
  public fun removeResourceFormatLoader(formatLoader: ResourceFormatLoader): Unit {
    TransferContext.writeArguments(OBJECT to formatLoader)
    TransferContext.callMethod(rawPtr, MethodBindings.removeResourceFormatLoaderPtr, NIL)
  }

  /**
   * Changes the behavior on missing sub-resources. The default behavior is to abort loading.
   */
  public fun setAbortOnMissingResources(abort: Boolean): Unit {
    TransferContext.writeArguments(BOOL to abort)
    TransferContext.callMethod(rawPtr, MethodBindings.setAbortOnMissingResourcesPtr, NIL)
  }

  /**
   * Returns the dependencies for the resource at the given [path].
   * **Note:** The dependencies are returned with slices separated by `::`. You can use
   * [String.getSlice] to get their components.
   * [codeblock]
   * for dep in ResourceLoader.get_dependencies(path):
   *     print(dep.get_slice("::", 0)) # Prints UID.
   *     print(dep.get_slice("::", 2)) # Prints path.
   * [/codeblock]
   */
  public fun getDependencies(path: String): PackedStringArray {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.getDependenciesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns whether a cached resource is available for the given [path].
   * Once a resource has been loaded by the engine, it is cached in memory for faster access, and
   * future calls to the [load] method will use the cached version. The cached resource can be
   * overridden by using [Resource.takeOverPath] on a new resource for that same path.
   */
  public fun hasCached(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.hasCachedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns whether a recognized resource exists for the given [path].
   * An optional [typeHint] can be used to further specify the [Resource] type that should be
   * handled by the [ResourceFormatLoader]. Anything that inherits from [Resource] can be used as a
   * type hint, for example [Image].
   * **Note:** If you use [Resource.takeOverPath], this method will return `true` for the taken path
   * even if the resource wasn't saved (i.e. exists only in resource cache).
   */
  @JvmOverloads
  public fun exists(path: String, typeHint: String = ""): Boolean {
    TransferContext.writeArguments(STRING to path, STRING to typeHint)
    TransferContext.callMethod(rawPtr, MethodBindings.existsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the ID associated with a given resource path, or `-1` when no such ID exists.
   */
  public fun getResourceUid(path: String): Long {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.getResourceUidPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public enum class ThreadLoadStatus(
    id: Long,
  ) {
    /**
     * The resource is invalid, or has not been loaded with [loadThreadedRequest].
     */
    THREAD_LOAD_INVALID_RESOURCE(0),
    /**
     * The resource is still being loaded.
     */
    THREAD_LOAD_IN_PROGRESS(1),
    /**
     * Some error occurred during loading and it failed.
     */
    THREAD_LOAD_FAILED(2),
    /**
     * The resource was loaded successfully and can be accessed via [loadThreadedGet].
     */
    THREAD_LOAD_LOADED(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ThreadLoadStatus = entries.single { it.id == `value` }
    }
  }

  public enum class CacheMode(
    id: Long,
  ) {
    /**
     * Neither the main resource (the one requested to be loaded) nor any of its subresources are
     * retrieved from cache nor stored into it. Dependencies (external resources) are loaded with
     * [CACHE_MODE_REUSE].
     */
    CACHE_MODE_IGNORE(0),
    /**
     * The main resource (the one requested to be loaded), its subresources, and its dependencies
     * (external resources) are retrieved from cache if present, instead of loaded. Those not cached
     * are loaded and then stored into the cache. The same rules are propagated recursively down the
     * tree of dependencies (external resources).
     */
    CACHE_MODE_REUSE(1),
    /**
     * Like [CACHE_MODE_REUSE], but the cache is checked for the main resource (the one requested to
     * be loaded) as well as for each of its subresources. Those already in the cache, as long as the
     * loaded and cached types match, have their data refreshed from storage into the already existing
     * instances. Otherwise, they are recreated as completely new objects.
     */
    CACHE_MODE_REPLACE(2),
    /**
     * Like [CACHE_MODE_IGNORE], but propagated recursively down the tree of dependencies (external
     * resources).
     */
    CACHE_MODE_IGNORE_DEEP(3),
    /**
     * Like [CACHE_MODE_REPLACE], but propagated recursively down the tree of dependencies (external
     * resources).
     */
    CACHE_MODE_REPLACE_DEEP(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CacheMode = entries.single { it.id == `value` }
    }
  }

  internal object MethodBindings {
    public val loadThreadedRequestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "load_threaded_request")

    public val loadThreadedGetStatusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "load_threaded_get_status")

    public val loadThreadedGetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "load_threaded_get")

    public val loadPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceLoader", "load")

    public val getRecognizedExtensionsForTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "get_recognized_extensions_for_type")

    public val addResourceFormatLoaderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "add_resource_format_loader")

    public val removeResourceFormatLoaderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "remove_resource_format_loader")

    public val setAbortOnMissingResourcesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "set_abort_on_missing_resources")

    public val getDependenciesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "get_dependencies")

    public val hasCachedPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceLoader", "has_cached")

    public val existsPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceLoader", "exists")

    public val getResourceUidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "get_resource_uid")
  }
}
