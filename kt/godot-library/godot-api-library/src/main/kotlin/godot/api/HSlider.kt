// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINECLASS_HSLIDER: Int = 297

/**
 * A horizontal slider, used to adjust a value by moving a grabber along a horizontal axis. It is a
 * [Range]-based control and goes from left (min) to right (max).
 */
@GodotBaseType
public open class HSlider : Slider() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_HSLIDER, scriptIndex)
  }

  public companion object

  public object MethodBindings
}
