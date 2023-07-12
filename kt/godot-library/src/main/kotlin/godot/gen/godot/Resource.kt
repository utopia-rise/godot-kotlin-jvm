// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for serializable objects.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/best_practices/node_alternatives.html]($DOCS_URL/tutorials/best_practices/node_alternatives.html)
 *
 * Resource is the base class for all Godot-specific resource types, serving primarily as data containers. Since they inherit from [godot.RefCounted], resources are reference-counted and freed when no longer in use. They can also be nested within other resources, and saved on disk. Once loaded from disk, further attempts to load a resource by [resourcePath] returns the same reference. [godot.PackedScene], one of the most common [godot.Object]s in a Godot project, is also a resource, uniquely capable of storing and instantiating the [godot.Node]s it contains as many times as desired.
 *
 * In GDScript, resources can loaded from disk by their [resourcePath] using [@GDScript.load] or [@GDScript.preload].
 *
 * **Note:** In C#, resources will not be freed instantly after they are no longer in use. Instead, garbage collection will run periodically and will free resources that are no longer in use. This means that unused resources will linger on for a while before being removed.
 */
@GodotBaseType
public open class Resource : RefCounted() {
  /**
   * Emitted when the resource changes, usually when one of its properties is modified. See also [emitChanged].
   *
   * **Note:** This signal is not emitted automatically for properties of custom resources. If necessary, a setter needs to be created to emit the signal.
   */
  public val changed: Signal0 by signal()

  /**
   * Emitted when [setupLocalToScene] is called, usually by a newly duplicated resource with [resourceLocalToScene] set to `true`. Custom behavior can be defined by connecting this signal.
   */
  public val setupLocalToSceneRequested: Signal0 by signal()

  /**
   * If `true`, the resource is duplicated for each instance of all scenes using it. At run-time, the resource can be modified in one scene without affecting other instances (see [godot.PackedScene.instantiate]).
   *
   * **Note:** Changing this property at run-time has no effect on already created duplicate resources.
   */
  public var resourceLocalToScene: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_IS_LOCAL_TO_SCENE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_SET_LOCAL_TO_SCENE, NIL)
    }

  /**
   * The unique path to this resource. If it has been saved to disk, the value will be its filepath. If the resource is exclusively contained within a scene, the value will be the [godot.PackedScene]'s filepath, followed by a unique identifier.
   *
   * **Note:** Setting this property manually may fail if a resource with the same path has already been previously loaded. If necessary, use [takeOverPath].
   */
  public var resourcePath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_GET_PATH, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_SET_PATH, NIL)
    }

  /**
   * An optional name for this resource. When defined, its value is displayed to represent the resource in the Inspector dock. For built-in scripts, the name is displayed as part of the tab name in the script editor.
   */
  public var resourceName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_GET_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_SET_NAME, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RESOURCE, scriptIndex)
    return true
  }

  /**
   * Sets the [resourcePath] to [path], potentially overriding an existing cache entry for this path. Further attempts to load an overridden resource by path will instead return this resource.
   */
  public fun takeOverPath(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_TAKE_OVER_PATH, NIL)
  }

  /**
   * Returns the [RID] of this resource (or an empty RID). Many resources (such as [godot.Texture2D], [godot.Mesh], and so on) are high-level abstractions of resources stored in a specialized server ([godot.DisplayServer], [godot.RenderingServer], etc.), so this function will return the original [RID].
   */
  public fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_GET_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * If [resourceLocalToScene] is set to `true` and the resource has been loaded from a [godot.PackedScene] instantiation, returns the root [godot.Node] of the scene where this resource is used. Otherwise, returns `null`.
   */
  public fun getLocalScene(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_GET_LOCAL_SCENE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Emits the [setupLocalToSceneRequested] signal. If [resourceLocalToScene] is set to `true`, this method is called from [godot.PackedScene.instantiate] by the newly duplicated resource within the scene instance.
   *
   * For most resources, this method performs no logic of its own. Custom behavior can be defined by connecting [setupLocalToSceneRequested] from a script, **not** by overriding this method.
   *
   * **Example:** Assign a random value to `health` for every duplicated Resource from an instantiated scene, excluding the original.
   *
   * ```
   * 				extends Resource
   *
   * 				var health = 0
   *
   * 				func _init():
   * 				    setup_local_to_scene_requested.connect(randomize_health)
   *
   * 				func randomize_health():
   * 				    health = randi_range(10, 40)
   * 				```
   */
  public fun setupLocalToScene(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_SETUP_LOCAL_TO_SCENE, NIL)
  }

  /**
   * Emits the [changed] signal. This method is called automatically for built-in resources.
   *
   * **Note:** For custom resources, it's recommended to call this method whenever a meaningful change occurs, such as a modified property. This ensures that custom [godot.Object]s depending on the resource are properly updated.
   *
   * ```
   * 				var damage:
   * 				    set(new_value):
   * 				        if damage != new_value:
   * 				            damage = new_value
   * 				            emit_changed()
   * 				```
   */
  public fun emitChanged(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_EMIT_CHANGED, NIL)
  }

  /**
   * Duplicates this resource, returning a new resource with its `export`ed or [PROPERTY_USAGE_STORAGE] properties copied from the original.
   *
   * If [subresources] is `false`, a shallow copy is returned; nested resources within subresources are not duplicated and are shared from the original resource. If [subresources] is `true`, a deep copy is returned; nested subresources will be duplicated and are not shared.
   *
   * Subresource properties with the [PROPERTY_USAGE_ALWAYS_DUPLICATE] flag are always duplicated even with [subresources] set to `false`, and properties with the [PROPERTY_USAGE_NEVER_DUPLICATE] flag are never duplicated even with [subresources] set to `true`.
   *
   * **Note:** For custom resources, this method will fail if [godot.Object.Init] has been defined with required parameters.
   */
  public fun duplicate(subresources: Boolean = false): Resource? {
    TransferContext.writeArguments(BOOL to subresources)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_DUPLICATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Resource?
  }

  public companion object
}
