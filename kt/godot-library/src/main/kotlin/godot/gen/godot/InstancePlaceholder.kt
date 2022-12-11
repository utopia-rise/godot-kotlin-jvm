// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

/**
 * Placeholder for the root [godot.Node] of a [godot.PackedScene].
 *
 * Turning on the option **Load As Placeholder** for an instantiated scene in the editor causes it to be replaced by an [godot.InstancePlaceholder] when running the game, this will not replace the node in the editor. This makes it possible to delay actually loading the scene until calling [createInstance]. This is useful to avoid loading large scenes all at once by loading parts of it selectively.
 *
 * The [godot.InstancePlaceholder] does not have a transform. This causes any child nodes to be positioned relatively to the [godot.Viewport] from point (0,0), rather than their parent as displayed in the editor. Replacing the placeholder with a scene with a transform will transform children relatively to their parent again.
 */
@GodotBaseType
public open class InstancePlaceholder internal constructor() : Node() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INSTANCEPLACEHOLDER, scriptIndex)
    return true
  }

  /**
   * Returns the list of properties that will be applied to the node when [createInstance] is called.
   *
   * If [withOrder] is `true`, a key named `.order` (note the leading period) is added to the dictionary. This `.order` key is an [godot.Array] of [godot.String] property names specifying the order in which properties will be applied (with index 0 being the first).
   */
  public fun getStoredValues(withOrder: Boolean = false): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(BOOL to withOrder)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INSTANCEPLACEHOLDER_GET_STORED_VALUES, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Call this method to actually load in the node. The created node will be placed as a sibling *above* the [godot.InstancePlaceholder] in the scene tree. The [godot.Node]'s reference is also returned for convenience.
   *
   * **Note:** [createInstance] is not thread-safe. Use [godot.Object.callDeferred] if calling from a thread.
   */
  public fun createInstance(replace: Boolean = false, customScene: PackedScene? = null): Node? {
    TransferContext.writeArguments(BOOL to replace, OBJECT to customScene)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INSTANCEPLACEHOLDER_CREATE_INSTANCE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Gets the path to the [godot.PackedScene] resource file that is loaded by default when calling [createInstance]. Not thread-safe. Use [godot.Object.callDeferred] if calling from a thread.
   */
  public fun getInstancePath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INSTANCEPLACEHOLDER_GET_INSTANCE_PATH, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public companion object
}
