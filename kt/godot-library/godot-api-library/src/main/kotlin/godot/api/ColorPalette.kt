// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.PackedColorArray
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_COLOR_ARRAY
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The [ColorPalette] resource is designed to store and manage a collection of colors. This resource
 * is useful in scenarios where a predefined set of colors is required, such as for creating themes,
 * designing user interfaces, or managing game assets. The built-in [ColorPicker] control can also make
 * use of [ColorPalette] without additional code.
 */
@GodotBaseType
public open class ColorPalette : Resource() {
  /**
   * A [PackedColorArray] containing the colors in the palette.
   */
  public final inline var colors: PackedColorArray
    @JvmName("colorsProperty")
    get() = getColors()
    @JvmName("colorsProperty")
    set(`value`) {
      setColors(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(162, scriptIndex)
  }

  public final fun setColors(colors: PackedColorArray): Unit {
    TransferContext.writeArguments(PACKED_COLOR_ARRAY to colors)
    TransferContext.callMethod(ptr, MethodBindings.setColorsPtr, NIL)
  }

  public final fun getColors(): PackedColorArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColorsPtr, PACKED_COLOR_ARRAY)
    return (TransferContext.readReturnValue(PACKED_COLOR_ARRAY) as PackedColorArray)
  }

  public companion object

  public object MethodBindings {
    internal val setColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPalette", "set_colors", 3546319833)

    internal val getColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ColorPalette", "get_colors", 1392750486)
  }
}
