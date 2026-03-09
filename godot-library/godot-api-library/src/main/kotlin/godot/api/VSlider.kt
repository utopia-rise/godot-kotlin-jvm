// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import kotlin.Suppress
import kotlin.Unit

/**
 * A vertical slider, used to adjust a value by moving a grabber along a vertical axis. It is a
 * [Range]-based control and goes from bottom (min) to top (max). Note that this direction is the
 * opposite of [VScrollBar]'s.
 */
@GodotBaseType
public open class VSlider : Slider() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(728, scriptPtr)
  }

  public companion object

  public object MethodBindings
}
