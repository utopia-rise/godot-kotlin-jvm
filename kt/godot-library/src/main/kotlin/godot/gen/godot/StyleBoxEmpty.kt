// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * An empty [godot.StyleBox] (does not display anything).
 *
 * An empty [godot.StyleBox] that can be used to display nothing instead of the default style (e.g. it can "disable" `focus` styles).
 */
@GodotBaseType
public open class StyleBoxEmpty : StyleBox() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STYLEBOXEMPTY, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings
}
