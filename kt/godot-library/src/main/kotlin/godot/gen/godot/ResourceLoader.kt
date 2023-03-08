// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Singleton used to load resource files.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/677](https://godotengine.org/asset-library/asset/677)
 *
 * Singleton used to load resource files from the filesystem.
 *
 * It uses the many [godot.ResourceFormatLoader] classes registered in the engine (either built-in or from a plugin) to load files into memory and convert them to a format that can be used by the engine.
 *
 * **Note:** You have to import the files into the engine first to load them using [load]. If you want to load [godot.Image]s at run-time, you may use [godot.Image.load]. If you want to import audio files, you can use the snippet described in [godot.AudioStreamMP3.data].
 */
@GodotBaseType
public object ResourceLoader : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_RESOURCELOADER)
    return false
  }

  /**
   * Loads the resource using threads. If [useSubThreads] is `true`, multiple threads will be used to load the resource, which makes loading faster, but may affect the main thread (and thus cause game slowdowns).
   *
   * The [cacheMode] property defines whether and how the cache should be used or updated when loading the resource. See [enum CacheMode] for details.
   */
  @JvmOverloads
  public fun loadThreadedRequest(
    path: String,
    typeHint: String = "",
    useSubThreads: Boolean = false,
    cacheMode: CacheMode = ResourceLoader.CacheMode.CACHE_MODE_REUSE,
  ): GodotError {
    TransferContext.writeArguments(STRING to path, STRING to typeHint, BOOL to useSubThreads, LONG to cacheMode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RESOURCELOADER_LOAD_THREADED_REQUEST, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Returns the status of a threaded loading operation started with [loadThreadedRequest] for the resource at [path]. See [enum ThreadLoadStatus] for possible return values.
   *
   * An array variable can optionally be passed via [progress], and will return a one-element array containing the percentage of completion of the threaded loading.
   */
  @JvmOverloads
  public fun loadThreadedGetStatus(path: String, progress: VariantArray<Any?> =
      godot.core.variantArrayOf()): ThreadLoadStatus {
    TransferContext.writeArguments(STRING to path, ARRAY to progress)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RESOURCELOADER_LOAD_THREADED_GET_STATUS, LONG)
    return ResourceLoader.ThreadLoadStatus.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Returns the resource loaded by [loadThreadedRequest].
   *
   * If this is called before the loading thread is done (i.e. [loadThreadedGetStatus] is not [THREAD_LOAD_LOADED]), the calling thread will be blocked until the resource has finished loading.
   */
  public fun loadThreadedGet(path: String): Resource? {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCELOADER_LOAD_THREADED_GET,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
  }

  /**
   * Loads a resource at the given [path], caching the result for further access.
   *
   * The registered [godot.ResourceFormatLoader]s are queried sequentially to find the first one which can handle the file's extension, and then attempt loading. If loading fails, the remaining ResourceFormatLoaders are also attempted.
   *
   * An optional [typeHint] can be used to further specify the [godot.Resource] type that should be handled by the [godot.ResourceFormatLoader]. Anything that inherits from [godot.Resource] can be used as a type hint, for example [godot.Image].
   *
   * The [cacheMode] property defines whether and how the cache should be used or updated when loading the resource. See [enum CacheMode] for details.
   *
   * Returns an empty resource if no [godot.ResourceFormatLoader] could handle the file.
   *
   * GDScript has a simplified [@GDScript.load] built-in method which can be used in most situations, leaving the use of [godot.ResourceLoader] for more advanced scenarios.
   */
  @JvmOverloads
  public fun load(
    path: String,
    typeHint: String = "",
    cacheMode: CacheMode = ResourceLoader.CacheMode.CACHE_MODE_REUSE,
  ): Resource? {
    TransferContext.writeArguments(STRING to path, STRING to typeHint, LONG to cacheMode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCELOADER_LOAD, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
  }

  /**
   * Returns the list of recognized extensions for a resource type.
   */
  public fun getRecognizedExtensionsForType(type: String): PackedStringArray {
    TransferContext.writeArguments(STRING to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RESOURCELOADER_GET_RECOGNIZED_EXTENSIONS_FOR_TYPE,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Registers a new [godot.ResourceFormatLoader]. The ResourceLoader will use the ResourceFormatLoader as described in [load].
   *
   * This method is performed implicitly for ResourceFormatLoaders written in GDScript (see [godot.ResourceFormatLoader] for more information).
   */
  @JvmOverloads
  public fun addResourceFormatLoader(formatLoader: ResourceFormatLoader, atFront: Boolean = false):
      Unit {
    TransferContext.writeArguments(OBJECT to formatLoader, BOOL to atFront)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RESOURCELOADER_ADD_RESOURCE_FORMAT_LOADER, NIL)
  }

  /**
   * Unregisters the given [godot.ResourceFormatLoader].
   */
  public fun removeResourceFormatLoader(formatLoader: ResourceFormatLoader): Unit {
    TransferContext.writeArguments(OBJECT to formatLoader)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RESOURCELOADER_REMOVE_RESOURCE_FORMAT_LOADER, NIL)
  }

  /**
   * Changes the behavior on missing sub-resources. The default behavior is to abort loading.
   */
  public fun setAbortOnMissingResources(abort: Boolean): Unit {
    TransferContext.writeArguments(BOOL to abort)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RESOURCELOADER_SET_ABORT_ON_MISSING_RESOURCES, NIL)
  }

  /**
   * Returns the dependencies for the resource at the given [path].
   */
  public fun getDependencies(path: String): PackedStringArray {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCELOADER_GET_DEPENDENCIES,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns whether a cached resource is available for the given [path].
   *
   * Once a resource has been loaded by the engine, it is cached in memory for faster access, and future calls to the [load] method will use the cached version. The cached resource can be overridden by using [godot.Resource.takeOverPath] on a new resource for that same path.
   */
  public fun hasCached(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCELOADER_HAS_CACHED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns whether a recognized resource exists for the given [path].
   *
   * An optional [typeHint] can be used to further specify the [godot.Resource] type that should be handled by the [godot.ResourceFormatLoader]. Anything that inherits from [godot.Resource] can be used as a type hint, for example [godot.Image].
   */
  @JvmOverloads
  public fun exists(path: String, typeHint: String = ""): Boolean {
    TransferContext.writeArguments(STRING to path, STRING to typeHint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCELOADER_EXISTS, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the ID associated with a given resource path, or `-1` when no such ID exists.
   */
  public fun getResourceUid(path: String): Long {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCELOADER_GET_RESOURCE_UID,
        LONG)
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CacheMode(
    id: Long,
  ) {
    /**
     *
     */
    CACHE_MODE_IGNORE(0),
    /**
     *
     */
    CACHE_MODE_REUSE(1),
    /**
     *
     */
    CACHE_MODE_REPLACE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }
}
