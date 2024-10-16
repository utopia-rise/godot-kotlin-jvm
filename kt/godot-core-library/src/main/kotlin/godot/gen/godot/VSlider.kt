// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A vertical slider, used to adjust a value by moving a grabber along a vertical axis. It is a
 * [Range]-based control and goes from bottom (min) to top (max). Note that this direction is the
 * opposite of [VScrollBar]'s.
 */
@GodotBaseType
public open class VSlider : Slider() {
  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_VSLIDER, this, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
