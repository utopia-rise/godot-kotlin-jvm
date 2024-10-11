// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.util.Internals
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_RICHTEXTEFFECT_INDEX: Int = 553

/**
 * A custom effect for a [RichTextLabel], which can be loaded in the [RichTextLabel] inspector or
 * using [RichTextLabel.installEffect].
 * **Note:** For a [RichTextEffect] to be usable, a BBCode tag must be defined as a member variable
 * called `bbcode` in the script.
 *
 * [gdscript skip-lint]
 * # The RichTextEffect will be usable like this: `[example]Some text[/example]`
 * var bbcode = "example"
 * ```
 * [csharp skip-lint]
 * // The RichTextEffect will be usable like this: `[example]Some text[/example]`
 * string bbcode = "example";
 * ```
 *
 * **Note:** As soon as a [RichTextLabel] contains at least one [RichTextEffect], it will
 * continuously process the effect unless the project is paused. This may impact battery life
 * negatively.
 */
@GodotBaseType
public open class RichTextEffect : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_RICHTEXTEFFECT_INDEX, scriptIndex)
  }

  /**
   * Override this method to modify properties in [charFx]. The method must return `true` if the
   * character could be transformed successfully. If the method returns `false`, it will skip
   * transformation to avoid displaying broken text.
   */
  public open fun _processCustomFx(charFx: CharFXTransform?): Boolean {
    throw NotImplementedError("_process_custom_fx is not implemented for RichTextEffect")
  }

  public companion object

  public object MethodBindings
}
