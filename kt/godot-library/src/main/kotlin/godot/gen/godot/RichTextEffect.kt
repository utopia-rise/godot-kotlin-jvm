// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Boolean
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * A custom effect for use with [godot.RichTextLabel].
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/gui/bbcode_in_richtextlabel.html](https://docs.godotengine.org/en/latest/tutorials/gui/bbcode_in_richtextlabel.html)
 * [https://github.com/Eoin-ONeill-Yokai/Godot-Rich-Text-Effect-Test-Project](https://github.com/Eoin-ONeill-Yokai/Godot-Rich-Text-Effect-Test-Project)
 *
 * A custom effect for use with [godot.RichTextLabel].
 *
 * **Note:** For a [godot.RichTextEffect] to be usable, a BBCode tag must be defined as a member variable called `bbcode` in the script.
 *
 * ```
 * 		# The RichTextEffect will be usable like this: `[example]Some text[/example]`
 * 		var bbcode = "example"
 * 		```
 *
 * **Note:** As soon as a [godot.RichTextLabel] contains at least one [godot.RichTextEffect], it will continuously process the effect unless the project is paused. This may impact battery life negatively.
 */
@GodotBaseType
open class RichTextEffect : Resource() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_RICHTEXTEFFECT)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  /**
   * Override this method to modify properties in `char_fx`. The method must return `true` if the character could be transformed successfully. If the method returns `false`, it will skip transformation to avoid displaying broken text.
   */
  open fun _processCustomFx(charFx: CharFXTransform): Boolean {
    throw NotImplementedError("_process_custom_fx is not implemented for RichTextEffect")
  }
}
