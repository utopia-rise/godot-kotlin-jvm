// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress

/**
 * Singleton used to load resource files.
 *
 * Singleton used to load resource files from the filesystem.
 *
 * It uses the many [godot.ResourceFormatLoader] classes registered in the engine (either built-in or from a plugin) to load files into memory and convert them to a format that can be used by the engine.
 *
 * GDScript has a simplified [@GDScript.load] built-in method which can be used in most situations, leaving the use of [godot.ResourceLoader] for more advanced scenarios.
 */
@GodotBaseType
object ResourceLoader : Object() {
  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINESINGLETON_RESOURCELOADER)

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Returns whether a recognized resource exists for the given `path`.
   *
   * An optional `type_hint` can be used to further specify the [godot.Resource] type that should be handled by the [godot.ResourceFormatLoader].
   */
  fun exists(path: String, typeHint: String = ""): Boolean {
    TransferContext.writeArguments(STRING to path, STRING to typeHint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__RESOURCELOADER_EXISTS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the dependencies for the resource at the given `path`.
   */
  fun getDependencies(path: String): PoolStringArray {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__RESOURCELOADER_GET_DEPENDENCIES,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the list of recognized extensions for a resource type.
   */
  fun getRecognizedExtensionsForType(type: String): PoolStringArray {
    TransferContext.writeArguments(STRING to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__RESOURCELOADER_GET_RECOGNIZED_EXTENSIONS_FOR_TYPE,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * *Deprecated method.* Use [hasCached] or [exists] instead.
   */
  fun has(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__RESOURCELOADER_HAS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether a cached resource is available for the given `path`.
   *
   * Once a resource has been loaded by the engine, it is cached in memory for faster access, and future calls to the [load] or [loadInteractive] methods will use the cached version. The cached resource can be overridden by using [godot.Resource.takeOverPath] on a new resource for that same path.
   */
  fun hasCached(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__RESOURCELOADER_HAS_CACHED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Loads a resource at the given `path`, caching the result for further access.
   *
   * The registered [godot.ResourceFormatLoader]s are queried sequentially to find the first one which can handle the file's extension, and then attempt loading. If loading fails, the remaining ResourceFormatLoaders are also attempted.
   *
   * An optional `type_hint` can be used to further specify the [godot.Resource] type that should be handled by the [godot.ResourceFormatLoader].
   *
   * If `no_cache` is `true`, the resource cache will be bypassed and the resource will be loaded anew. Otherwise, the cached resource will be returned if it exists.
   *
   * Returns an empty resource if no ResourceFormatLoader could handle the file.
   */
  fun load(
    path: String,
    typeHint: String = "",
    noCache: Boolean = false
  ): Resource? {
    TransferContext.writeArguments(STRING to path, STRING to typeHint, BOOL to noCache)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__RESOURCELOADER_LOAD, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Resource?
  }

  /**
   * Starts loading a resource interactively. The returned [godot.ResourceInteractiveLoader] object allows to load with high granularity, calling its [godot.ResourceInteractiveLoader.poll] method successively to load chunks.
   *
   * An optional `type_hint` can be used to further specify the [godot.Resource] type that should be handled by the [godot.ResourceFormatLoader].
   */
  fun loadInteractive(path: String, typeHint: String = ""): ResourceInteractiveLoader? {
    TransferContext.writeArguments(STRING to path, STRING to typeHint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__RESOURCELOADER_LOAD_INTERACTIVE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ResourceInteractiveLoader?
  }

  /**
   * Changes the behavior on missing sub-resources. The default behavior is to abort loading.
   */
  fun setAbortOnMissingResources(abort: Boolean) {
    TransferContext.writeArguments(BOOL to abort)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__RESOURCELOADER_SET_ABORT_ON_MISSING_RESOURCES, NIL)
  }
}
