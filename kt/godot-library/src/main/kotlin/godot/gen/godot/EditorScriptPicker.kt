// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Godot editor's control for selecting the `script` property of a [godot.Node].
 *
 * Similar to [godot.EditorResourcePicker] this [godot.Control] node is used in the editor's Inspector dock, but only to edit the `script` property of a [godot.Node]. Default options for creating new resources of all possible subtypes are replaced with dedicated buttons that open the "Attach Node Script" dialog. Can be used with [godot.EditorInspectorPlugin] to recreate the same behavior.
 *
 * **Note:** You must set the [scriptOwner] for the custom context menu items to work.
 */
@GodotBaseType
public open class EditorScriptPicker internal constructor() : EditorResourcePicker() {
  /**
   * The owner [godot.Node] of the script property that holds the edited resource.
   */
  public var scriptOwner: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_EDITORSCRIPTPICKER_GET_SCRIPT_OWNER, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Node?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_EDITORSCRIPTPICKER_SET_SCRIPT_OWNER, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORSCRIPTPICKER, scriptIndex)
    return true
  }

  public companion object
}
