// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Error
import godot.core.GodotEnum
import godot.core.PackedStringArray
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * A singleton used to load resource files from the filesystem.
 *
 * It uses the many [ResourceFormatLoader] classes registered in the engine (either built-in or from
 * a plugin) to load files into memory and convert them to a format that can be used by the engine.
 *
 * **Note:** You have to import the files into the engine first to load them using [load]. If you
 * want to load [Image]s at run-time, you may use [Image.load]. If you want to import audio files, you
 * can use the snippet described in [AudioStreamMP3.data].
 *
 * **Note:** Non-resource files such as plain text files cannot be read using [ResourceLoader]. Use
 * [FileAccess] for those files instead, and be aware that non-resource files are not exported by
 * default (see notes in the [FileAccess] class description for instructions on exporting them).
 */
@GodotBaseType
public object ResourceLoader : Object() {
  public override fun new(scriptIndex: Int): Unit {
    getSingleton(27)
  }

  /**
   * Loads the resource using threads. If [useSubThreads] is `true`, multiple threads will be used
   * to load the resource, which makes loading faster, but may affect the main thread (and thus cause
   * game slowdowns).
   *
   * The [cacheMode] property defines whether and how the cache should be used or updated when
   * loading the resource. See [CacheMode] for details.
   */
  @JvmOverloads
  @JvmStatic
  public final fun loadThreadedRequest(
    path: String,
    typeHint: String = "",
    useSubThreads: Boolean = false,
    cacheMode: CacheMode = ResourceLoader.CacheMode.REUSE,
  ): Error {
    TransferContext.writeArguments(STRING to path, STRING to typeHint, BOOL to useSubThreads, LONG to cacheMode.value)
    TransferContext.callMethod(ptr, MethodBindings.loadThreadedRequestPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the status of a threaded loading operation started with [loadThreadedRequest] for the
   * resource at [path]. See [ThreadLoadStatus] for possible return values.
   *
   * An array variable can optionally be passed via [progress], and will return a one-element array
   * containing the ratio of completion of the threaded loading (between `0.0` and `1.0`).
   *
   * **Note:** The recommended way of using this method is to call it during different frames (e.g.,
   * in [Node.Process], instead of a loop).
   */
  @JvmOverloads
  @JvmStatic
  public final fun loadThreadedGetStatus(path: String, progress: VariantArray<Any?> =
      godot.core.variantArrayOf()): ThreadLoadStatus {
    TransferContext.writeArguments(STRING to path, ARRAY to progress)
    TransferContext.callMethod(ptr, MethodBindings.loadThreadedGetStatusPtr, LONG)
    return ThreadLoadStatus.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the resource loaded by [loadThreadedRequest].
   *
   * If this is called before the loading thread is done (i.e. [loadThreadedGetStatus] is not
   * [THREAD_LOAD_LOADED]), the calling thread will be blocked until the resource has finished loading.
   * However, it's recommended to use [loadThreadedGetStatus] to known when the load has actually
   * completed.
   */
  @JvmStatic
  public final fun loadThreadedGet(path: String): Resource? {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.loadThreadedGetPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Resource?)
  }

  /**
   * Loads a resource at the given [path], caching the result for further access.
   *
   * The registered [ResourceFormatLoader]s are queried sequentially to find the first one which can
   * handle the file's extension, and then attempt loading. If loading fails, the remaining
   * ResourceFormatLoaders are also attempted.
   *
   * An optional [typeHint] can be used to further specify the [Resource] type that should be
   * handled by the [ResourceFormatLoader]. Anything that inherits from [Resource] can be used as a
   * type hint, for example [Image].
   *
   * The [cacheMode] property defines whether and how the cache should be used or updated when
   * loading the resource. See [CacheMode] for details.
   *
   * Returns an empty resource if no [ResourceFormatLoader] could handle the file, and prints an
   * error if no file is found at the specified path.
   *
   * GDScript has a simplified [@GDScript.load] built-in method which can be used in most
   * situations, leaving the use of [ResourceLoader] for more advanced scenarios.
   *
   * **Note:** If [ProjectSettings.editor/export/convertTextResourcesToBinary] is `true`,
   * [@GDScript.load] will not be able to read converted files in an exported project. If you rely on
   * run-time loading of files present within the PCK, set
   * [ProjectSettings.editor/export/convertTextResourcesToBinary] to `false`.
   *
   * **Note:** Relative paths will be prefixed with `"res://"` before loading, to avoid unexpected
   * results make sure your paths are absolute.
   */
  @JvmOverloads
  @JvmStatic
  public final fun load(
    path: String,
    typeHint: String = "",
    cacheMode: CacheMode = ResourceLoader.CacheMode.REUSE,
  ): Resource? {
    TransferContext.writeArguments(STRING to path, STRING to typeHint, LONG to cacheMode.value)
    TransferContext.callMethod(ptr, MethodBindings.loadPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Resource?)
  }

  /**
   * Returns the list of recognized extensions for a resource type.
   */
  @JvmStatic
  public final fun getRecognizedExtensionsForType(type: String): PackedStringArray {
    TransferContext.writeArguments(STRING to type)
    TransferContext.callMethod(ptr, MethodBindings.getRecognizedExtensionsForTypePtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Registers a new [ResourceFormatLoader]. The ResourceLoader will use the ResourceFormatLoader as
   * described in [load].
   *
   * This method is performed implicitly for ResourceFormatLoaders written in GDScript (see
   * [ResourceFormatLoader] for more information).
   */
  @JvmOverloads
  @JvmStatic
  public final fun addResourceFormatLoader(formatLoader: ResourceFormatLoader?, atFront: Boolean =
      false): Unit {
    TransferContext.writeArguments(OBJECT to formatLoader, BOOL to atFront)
    TransferContext.callMethod(ptr, MethodBindings.addResourceFormatLoaderPtr, NIL)
  }

  /**
   * Unregisters the given [ResourceFormatLoader].
   */
  @JvmStatic
  public final fun removeResourceFormatLoader(formatLoader: ResourceFormatLoader?): Unit {
    TransferContext.writeArguments(OBJECT to formatLoader)
    TransferContext.callMethod(ptr, MethodBindings.removeResourceFormatLoaderPtr, NIL)
  }

  /**
   * Changes the behavior on missing sub-resources. The default behavior is to abort loading.
   */
  @JvmStatic
  public final fun setAbortOnMissingResources(abort: Boolean): Unit {
    TransferContext.writeArguments(BOOL to abort)
    TransferContext.callMethod(ptr, MethodBindings.setAbortOnMissingResourcesPtr, NIL)
  }

  /**
   * Returns the dependencies for the resource at the given [path].
   *
   * **Note:** The dependencies are returned with slices separated by `::`. You can use
   * [String.getSlice] to get their components.
   *
   * ```
   * for dependency in ResourceLoader.get_dependencies(path):
   *     print(dependency.get_slice("::", 0)) # Prints the UID.
   *     print(dependency.get_slice("::", 2)) # Prints the path.
   * ```
   */
  @JvmStatic
  public final fun getDependencies(path: String): PackedStringArray {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.getDependenciesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns whether a cached resource is available for the given [path].
   *
   * Once a resource has been loaded by the engine, it is cached in memory for faster access, and
   * future calls to the [load] method will use the cached version. The cached resource can be
   * overridden by using [Resource.takeOverPath] on a new resource for that same path.
   */
  @JvmStatic
  public final fun hasCached(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.hasCachedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the cached resource reference for the given [path].
   *
   * **Note:** If the resource is not cached, the returned [Resource] will be invalid.
   */
  @JvmStatic
  public final fun getCachedRef(path: String): Resource? {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.getCachedRefPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Resource?)
  }

  /**
   * Returns whether a recognized resource exists for the given [path].
   *
   * An optional [typeHint] can be used to further specify the [Resource] type that should be
   * handled by the [ResourceFormatLoader]. Anything that inherits from [Resource] can be used as a
   * type hint, for example [Image].
   *
   * **Note:** If you use [Resource.takeOverPath], this method will return `true` for the taken path
   * even if the resource wasn't saved (i.e. exists only in resource cache).
   */
  @JvmOverloads
  @JvmStatic
  public final fun exists(path: String, typeHint: String = ""): Boolean {
    TransferContext.writeArguments(STRING to path, STRING to typeHint)
    TransferContext.callMethod(ptr, MethodBindings.existsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the ID associated with a given resource path, or `-1` when no such ID exists.
   */
  @JvmStatic
  public final fun getResourceUid(path: String): Long {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.getResourceUidPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Lists a directory (as example: "res://assets/enemies"), returning all resources contained
   * within. The resource files are the original file names as visible in the editor before exporting.
   */
  @JvmStatic
  public final fun listDirectory(directoryPath: String): PackedStringArray {
    TransferContext.writeArguments(STRING to directoryPath)
    TransferContext.callMethod(ptr, MethodBindings.listDirectoryPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  public enum class ThreadLoadStatus(
    `value`: Long,
  ) : GodotEnum {
    /**
     * The resource is invalid, or has not been loaded with [loadThreadedRequest].
     */
    INVALID_RESOURCE(0),
    /**
     * The resource is still being loaded.
     */
    IN_PROGRESS(1),
    /**
     * Some error occurred during loading and it failed.
     */
    FAILED(2),
    /**
     * The resource was loaded successfully and can be accessed via [loadThreadedGet].
     */
    LOADED(3),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): ThreadLoadStatus = entries.single { it.`value` == `value` }
    }
  }

  public enum class CacheMode(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Neither the main resource (the one requested to be loaded) nor any of its subresources are
     * retrieved from cache nor stored into it. Dependencies (external resources) are loaded with
     * [CACHE_MODE_REUSE].
     */
    IGNORE(0),
    /**
     * The main resource (the one requested to be loaded), its subresources, and its dependencies
     * (external resources) are retrieved from cache if present, instead of loaded. Those not cached
     * are loaded and then stored into the cache. The same rules are propagated recursively down the
     * tree of dependencies (external resources).
     */
    REUSE(1),
    /**
     * Like [CACHE_MODE_REUSE], but the cache is checked for the main resource (the one requested to
     * be loaded) as well as for each of its subresources. Those already in the cache, as long as the
     * loaded and cached types match, have their data refreshed from storage into the already existing
     * instances. Otherwise, they are recreated as completely new objects.
     */
    REPLACE(2),
    /**
     * Like [CACHE_MODE_IGNORE], but propagated recursively down the tree of dependencies (external
     * resources).
     */
    IGNORE_DEEP(3),
    /**
     * Like [CACHE_MODE_REPLACE], but propagated recursively down the tree of dependencies (external
     * resources).
     */
    REPLACE_DEEP(4),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): CacheMode = entries.single { it.`value` == `value` }
    }
  }

  public object MethodBindings {
    internal val loadThreadedRequestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "load_threaded_request", 3614384323)

    internal val loadThreadedGetStatusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "load_threaded_get_status", 4137685479)

    internal val loadThreadedGetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "load_threaded_get", 1748875256)

    internal val loadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "load", 3358495409)

    internal val getRecognizedExtensionsForTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "get_recognized_extensions_for_type", 3538744774)

    internal val addResourceFormatLoaderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "add_resource_format_loader", 2896595483)

    internal val removeResourceFormatLoaderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "remove_resource_format_loader", 405397102)

    internal val setAbortOnMissingResourcesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "set_abort_on_missing_resources", 2586408642)

    internal val getDependenciesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "get_dependencies", 3538744774)

    internal val hasCachedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "has_cached", 2323990056)

    internal val getCachedRefPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "get_cached_ref", 1748875256)

    internal val existsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "exists", 4185558881)

    internal val getResourceUidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "get_resource_uid", 1597066294)

    internal val listDirectoryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceLoader", "list_directory", 3538744774)
  }
}
