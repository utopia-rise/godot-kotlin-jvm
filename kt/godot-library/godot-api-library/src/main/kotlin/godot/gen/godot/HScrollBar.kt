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

private const val ENGINE_CLASS_HSCROLLBAR_INDEX: Int = 295

/**
 * A horizontal scrollbar, typically used to navigate through content that extends beyond the
 * visible width of a control. It is a [Range]-based control and goes from left (min) to right (max).
 */
@GodotBaseType
public open class HScrollBar : ScrollBar() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_HSCROLLBAR_INDEX, scriptIndex)
  }

  public companion object

  public object MethodBindings
}
