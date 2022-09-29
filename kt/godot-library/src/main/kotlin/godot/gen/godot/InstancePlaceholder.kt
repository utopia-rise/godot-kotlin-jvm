// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Placeholder for the root [godot.Node] of a [godot.PackedScene].
 *
 * Turning on the option **Load As Placeholder** for an instanced scene in the editor causes it to be replaced by an InstancePlaceholder when running the game. This makes it possible to delay actually loading the scene until calling [replaceByInstance]. This is useful to avoid loading large scenes all at once by loading parts of it selectively.
 *
 * The InstancePlaceholder does not have a transform. This causes any child nodes to be positioned relatively to the Viewport from point (0,0), rather than their parent as displayed in the editor. Replacing the placeholder with a scene with a transform will transform children relatively to their parent again.
 */
@GodotBaseType
public open class InstancePlaceholder : Node() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_INSTANCEPLACEHOLDER)
  }

  /**
   * Call this method to actually load in the node. The created node will be placed as a sibling *above* the [godot.InstancePlaceholder] in the scene tree. The [godot.Node]'s reference is also returned for convenience.
   *
   * **Note:** [createInstance] is not thread-safe. Use [godot.Object.callDeferred] if calling from a thread.
   */
  public open fun createInstance(replace: Boolean = false, customScene: PackedScene? = null):
      Node? {
    TransferContext.writeArguments(BOOL to replace, OBJECT to customScene)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INSTANCEPLACEHOLDER_CREATE_INSTANCE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Gets the path to the [godot.PackedScene] resource file that is loaded by default when calling [replaceByInstance]. Not thread-safe. Use [godot.Object.callDeferred] if calling from a thread.
   */
  public open fun getInstancePath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INSTANCEPLACEHOLDER_GET_INSTANCE_PATH, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the list of properties that will be applied to the node when [createInstance] is called.
   *
   * If `with_order` is `true`, a key named `.order` (note the leading period) is added to the dictionary. This `.order` key is an [godot.Array] of [godot.String] property names specifying the order in which properties will be applied (with index 0 being the first).
   */
  public open fun getStoredValues(withOrder: Boolean = false): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(BOOL to withOrder)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INSTANCEPLACEHOLDER_GET_STORED_VALUES, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Replaces this placeholder by the scene handed as an argument, or the original scene if no argument is given. As for all resources, the scene is loaded only if it's not loaded already. By manually loading the scene beforehand, delays caused by this function can be avoided.
   */
  public open fun replaceByInstance(customScene: PackedScene? = null): Unit {
    TransferContext.writeArguments(OBJECT to customScene)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INSTANCEPLACEHOLDER_REPLACE_BY_INSTANCE, NIL)
  }
}
