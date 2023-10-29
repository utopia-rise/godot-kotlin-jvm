// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * A custom effect for a [godot.RichTextLabel].
 *
 * Tutorials:
 * [https://github.com/Eoin-ONeill-Yokai/Godot-Rich-Text-Effect-Test-Project](https://github.com/Eoin-ONeill-Yokai/Godot-Rich-Text-Effect-Test-Project)
 *
 * A custom effect for a [godot.RichTextLabel].
 *
 * **Note:** For a [godot.RichTextEffect] to be usable, a BBCode tag must be defined as a member variable called `bbcode` in the script.
 *
 * [codeblocks]
 *
 * [gdscript skip-lint]
 *
 * # The RichTextEffect will be usable like this: `[example]Some text[/example]`
 *
 * var bbcode = "example"
 *
 * [/gdscript]
 *
 * [csharp skip-lint]
 *
 * // The RichTextEffect will be usable like this: `[example]Some text[/example]`
 *
 * string bbcode = "example";
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * **Note:** As soon as a [godot.RichTextLabel] contains at least one [godot.RichTextEffect], it will continuously process the effect unless the project is paused. This may impact battery life negatively.
 */
@GodotBaseType
public open class RichTextEffect : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RICHTEXTEFFECT, scriptIndex)
    return true
  }

  /**
   * Override this method to modify properties in [charFx]. The method must return `true` if the character could be transformed successfully. If the method returns `false`, it will skip transformation to avoid displaying broken text.
   */
  public open fun _processCustomFx(charFx: CharFXTransform): Boolean {
    throw NotImplementedError("_process_custom_fx is not implemented for RichTextEffect")
  }

  public companion object
}
