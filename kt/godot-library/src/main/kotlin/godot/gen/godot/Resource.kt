// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType._RID
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress

/**
 * Base class for all resources.
 * 
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/getting_started/workflow/best_practices/node_alternatives.html](https://docs.godotengine.org/en/latest/getting_started/workflow/best_practices/node_alternatives.html)
 * 
 * Resource is the base class for all Godot-specific resource types, serving primarily as data containers. Unlike [godot.Object]s, they are reference-counted and freed when no longer in use. They are also cached once loaded from disk, so that any further attempts to load a resource from a given path will return the same reference (all this in contrast to a [godot.Node], which is not reference-counted and can be instanced from disk as many times as desired). Resources can be saved externally on disk or bundled into another object, such as a [godot.Node] or another resource.
 */
@GodotBaseType
open class Resource : Reference() {
  /**
   * Emitted whenever the resource changes.
   */
  val changed: Signal0 by signal()

  /**
   * If `true`, the resource will be made unique in each instance of its local scene. It can thus be modified in a scene instance without impacting other instances of that same scene.
   */
  open var resourceLocalToScene: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RESOURCE_GET_RESOURCE_LOCAL_TO_SCENE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RESOURCE_SET_RESOURCE_LOCAL_TO_SCENE, NIL)
    }

  /**
   * The name of the resource. This is an optional identifier.
   */
  open var resourceName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_GET_RESOURCE_NAME,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_SET_RESOURCE_NAME, NIL)
    }

  /**
   * The path to the resource. In case it has its own file, it will return its filepath. If it's tied to the scene, it will return the scene's path, followed by the resource's index.
   */
  open var resourcePath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_GET_RESOURCE_PATH,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_SET_RESOURCE_PATH, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_RESOURCE)
  }

  /**
   * Virtual function which can be overridden to customize the behavior value of [setupLocalToScene].
   */
  open fun _setupLocalToScene() {
  }

  /**
   * Duplicates the resource, returning a new resource. By default, sub-resources are shared between resource copies for efficiency. This can be changed by passing `true` to the `subresources` argument which will copy the subresources.
   *
   * **Note:** If `subresources` is `true`, this method will only perform a shallow copy. Nested resources within subresources will not be duplicated and will still be shared.
   */
  open fun duplicate(subresources: Boolean = false): Resource? {
    TransferContext.writeArguments(BOOL to subresources)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_DUPLICATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Resource?
  }

  /**
   * If [resourceLocalToScene] is enabled and the resource was loaded from a [godot.PackedScene] instantiation, returns the local scene where this resource's unique copy is in use. Otherwise, returns `null`.
   */
  open fun getLocalScene(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_GET_LOCAL_SCENE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Returns the RID of the resource (or an empty RID). Many resources (such as [godot.Texture], [godot.Mesh], etc) are high-level abstractions of resources stored in a server, so this function will return the original RID.
   */
  open fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_GET_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * This method is called when a resource with [resourceLocalToScene] enabled is loaded from a [godot.PackedScene] instantiation. Its behavior can be customized by overriding [_setupLocalToScene] from script.
   *
   * For most resources, this method performs no base logic. [godot.ViewportTexture] performs custom logic to properly set the proxy texture and flags in the local viewport.
   */
  open fun setupLocalToScene() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_SETUP_LOCAL_TO_SCENE, NIL)
  }

  /**
   * Sets the path of the resource, potentially overriding an existing cache entry for this path. This differs from setting [resourcePath], as the latter would error out if another resource was already cached for the given path.
   */
  open fun takeOverPath(path: String) {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_TAKE_OVER_PATH, NIL)
  }
}
