// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
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

/**
 * Placeholder for the root [godot.Node] of a [godot.PackedScene].
 *
 * Turning on the option **Load As Placeholder** for an instanced scene in the editor causes it to be replaced by an InstancePlaceholder when running the game. This makes it possible to delay actually loading the scene until calling [replaceByInstance]. This is useful to avoid loading large scenes all at once by loading parts of it selectively.
 *
 * The InstancePlaceholder does not have a transform. This causes any child nodes to be positioned relatively to the Viewport from point (0,0), rather than their parent as displayed in the editor. Replacing the placeholder with a scene with a transform will transform children relatively to their parent again.
 */
@GodotBaseType
open class InstancePlaceholder : Node() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_INSTANCEPLACEHOLDER)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  /**
   *
   */
  open fun createInstance(replace: Boolean = false, customScene: PackedScene? = null): Node? {
    TransferContext.writeArguments(BOOL to replace, OBJECT to customScene)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INSTANCEPLACEHOLDER_CREATE_INSTANCE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Gets the path to the [godot.PackedScene] resource file that is loaded by default when calling [replaceByInstance].
   */
  open fun getInstancePath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INSTANCEPLACEHOLDER_GET_INSTANCE_PATH, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   *
   */
  open fun getStoredValues(withOrder: Boolean = false): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(BOOL to withOrder)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INSTANCEPLACEHOLDER_GET_STORED_VALUES, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Replaces this placeholder by the scene handed as an argument, or the original scene if no argument is given. As for all resources, the scene is loaded only if it's not loaded already. By manually loading the scene beforehand, delays caused by this function can be avoided.
   */
  open fun replaceByInstance(customScene: PackedScene? = null) {
    TransferContext.writeArguments(OBJECT to customScene)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INSTANCEPLACEHOLDER_REPLACE_BY_INSTANCE, NIL)
  }
}
