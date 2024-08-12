// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Resource is the base class for all Godot-specific resource types, serving primarily as data
 * containers. Since they inherit from [RefCounted], resources are reference-counted and freed when no
 * longer in use. They can also be nested within other resources, and saved on disk. Once loaded from
 * disk, further attempts to load a resource by [resourcePath] returns the same reference.
 * [PackedScene], one of the most common [Object]s in a Godot project, is also a resource, uniquely
 * capable of storing and instantiating the [Node]s it contains as many times as desired.
 * In GDScript, resources can loaded from disk by their [resourcePath] using [@GDScript.load] or
 * [@GDScript.preload].
 * **Note:** In C#, resources will not be freed instantly after they are no longer in use. Instead,
 * garbage collection will run periodically and will free resources that are no longer in use. This
 * means that unused resources will linger on for a while before being removed.
 */
@GodotBaseType
public open class Resource : RefCounted() {
  /**
   * Emitted when the resource changes, usually when one of its properties is modified. See also
   * [emitChanged].
   * **Note:** This signal is not emitted automatically for properties of custom resources. If
   * necessary, a setter needs to be created to emit the signal.
   */
  public val changed: Signal0 by signal()

  /**
   * Emitted by a newly duplicated resource with [resourceLocalToScene] set to `true`. 
   * *Deprecated.* This signal is only emitted when the resource is created. Override
   * [_setupLocalToScene] instead.
   */
  public val setupLocalToSceneRequested: Signal0 by signal()

  /**
   * If `true`, the resource is duplicated for each instance of all scenes using it. At run-time,
   * the resource can be modified in one scene without affecting other instances (see
   * [PackedScene.instantiate]).
   * **Note:** Changing this property at run-time has no effect on already created duplicate
   * resources.
   */
  public var resourceLocalToScene: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isLocalToScenePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLocalToScenePtr, NIL)
    }

  /**
   * The unique path to this resource. If it has been saved to disk, the value will be its filepath.
   * If the resource is exclusively contained within a scene, the value will be the [PackedScene]'s
   * filepath, followed by a unique identifier.
   * **Note:** Setting this property manually may fail if a resource with the same path has already
   * been previously loaded. If necessary, use [takeOverPath].
   */
  public var resourcePath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathPtr, NIL)
    }

  /**
   * An optional name for this resource. When defined, its value is displayed to represent the
   * resource in the Inspector dock. For built-in scripts, the name is displayed as part of the tab
   * name in the script editor.
   * **Note:** Some resource formats do not support resource names. You can still set the name in
   * the editor or via code, but it will be lost when the resource is reloaded. For example, only
   * built-in scripts can have a resource name, while scripts stored in separate files cannot.
   */
  public var resourceName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNamePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNamePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RESOURCE, scriptIndex)
    return true
  }

  /**
   * Override this method to customize the newly duplicated resource created from
   * [PackedScene.instantiate], if the original's [resourceLocalToScene] is set to `true`.
   * **Example:** Set a random `damage` value to every local resource from an instantiated scene.
   * [codeblock]
   * extends Resource
   *
   * var damage = 0
   *
   * func _setup_local_to_scene():
   *     damage = randi_range(10, 40)
   * [/codeblock]
   */
  public open fun _setupLocalToScene(): Unit {
  }

  /**
   * Sets the [resourcePath] to [path], potentially overriding an existing cache entry for this
   * path. Further attempts to load an overridden resource by path will instead return this resource.
   */
  public fun takeOverPath(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.takeOverPathPtr, NIL)
  }

  /**
   * Returns the [RID] of this resource (or an empty RID). Many resources (such as [Texture2D],
   * [Mesh], and so on) are high-level abstractions of resources stored in a specialized server
   * ([DisplayServer], [RenderingServer], etc.), so this function will return the original [RID].
   */
  public fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * If [resourceLocalToScene] is set to `true` and the resource has been loaded from a
   * [PackedScene] instantiation, returns the root [Node] of the scene where this resource is used.
   * Otherwise, returns `null`.
   */
  public fun getLocalScene(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocalScenePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Node?)
  }

  /**
   * Calls [_setupLocalToScene]. If [resourceLocalToScene] is set to `true`, this method is
   * automatically called from [PackedScene.instantiate] by the newly duplicated resource within the
   * scene instance.
   * *Deprecated.* This method should only be called internally. Override [_setupLocalToScene]
   * instead.
   */
  public fun setupLocalToScene(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.setupLocalToScenePtr, NIL)
  }

  /**
   * Emits the [signal changed] signal. This method is called automatically for some built-in
   * resources.
   * **Note:** For custom resources, it's recommended to call this method whenever a meaningful
   * change occurs, such as a modified property. This ensures that custom [Object]s depending on the
   * resource are properly updated.
   * [codeblock]
   * var damage:
   *     set(new_value):
   *         if damage != new_value:
   *             damage = new_value
   *             emit_changed()
   * [/codeblock]
   */
  public fun emitChanged(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.emitChangedPtr, NIL)
  }

  /**
   * Duplicates this resource, returning a new resource with its `export`ed or
   * [PROPERTY_USAGE_STORAGE] properties copied from the original.
   * If [subresources] is `false`, a shallow copy is returned; nested resources within subresources
   * are not duplicated and are shared from the original resource. If [subresources] is `true`, a deep
   * copy is returned; nested subresources will be duplicated and are not shared.
   * Subresource properties with the [PROPERTY_USAGE_ALWAYS_DUPLICATE] flag are always duplicated
   * even with [subresources] set to `false`, and properties with the [PROPERTY_USAGE_NEVER_DUPLICATE]
   * flag are never duplicated even with [subresources] set to `true`.
   * **Note:** For custom resources, this method will fail if [Object.Init] has been defined with
   * required parameters.
   */
  @JvmOverloads
  public fun duplicate(subresources: Boolean = false): Resource? {
    TransferContext.writeArguments(BOOL to subresources)
    TransferContext.callMethod(rawPtr, MethodBindings.duplicatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
  }

  public companion object

  internal object MethodBindings {
    public val _setupLocalToScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "_setup_local_to_scene")

    public val setPathPtr: VoidPtr = TypeManager.getMethodBindPtr("Resource", "set_path")

    public val takeOverPathPtr: VoidPtr = TypeManager.getMethodBindPtr("Resource", "take_over_path")

    public val getPathPtr: VoidPtr = TypeManager.getMethodBindPtr("Resource", "get_path")

    public val setNamePtr: VoidPtr = TypeManager.getMethodBindPtr("Resource", "set_name")

    public val getNamePtr: VoidPtr = TypeManager.getMethodBindPtr("Resource", "get_name")

    public val getRidPtr: VoidPtr = TypeManager.getMethodBindPtr("Resource", "get_rid")

    public val setLocalToScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "set_local_to_scene")

    public val isLocalToScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "is_local_to_scene")

    public val getLocalScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "get_local_scene")

    public val setupLocalToScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Resource", "setup_local_to_scene")

    public val emitChangedPtr: VoidPtr = TypeManager.getMethodBindPtr("Resource", "emit_changed")

    public val duplicatePtr: VoidPtr = TypeManager.getMethodBindPtr("Resource", "duplicate")
  }
}
