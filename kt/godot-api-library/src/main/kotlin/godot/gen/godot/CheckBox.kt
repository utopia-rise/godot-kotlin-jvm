// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.util.Internals
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_CHECKBOX_INDEX: Int = 181

/**
 * [CheckBox] allows the user to choose one of only two possible options. It's similar to
 * [CheckButton] in functionality, but it has a different appearance. To follow established UX
 * patterns, it's recommended to use [CheckBox] when toggling it has **no** immediate effect on
 * something. For example, it could be used when toggling it will only do something once a confirmation
 * button is pressed.
 * See also [BaseButton] which contains common properties and methods associated with this node.
 * When [BaseButton.buttonGroup] specifies a [ButtonGroup], [CheckBox] changes its appearance to
 * that of a radio button and uses the various `radio_*` theme properties.
 */
@GodotBaseType
public open class CheckBox : Button() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_CHECKBOX_INDEX, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
