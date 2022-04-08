// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.COLOR
import godot.core.VariantType.NIL
import kotlin.Suppress
import kotlin.Unit

/**
 * Colored rectangle.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/515](https://godotengine.org/asset-library/asset/515)
 *
 * Displays a rectangle filled with a solid [color]. If you need to display the border alone, consider using [godot.ReferenceRect] instead.
 */
@GodotBaseType
public open class ColorRect : Control() {
  /**
   * The fill color.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * $ColorRect.color = Color(1, 0, 0, 1) # Set ColorRect's color to red.
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * GetNode<ColorRect>("ColorRect").Color = new Color(1, 0, 0, 1); // Set ColorRect's color to red.
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORRECT_GET_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLORRECT_SET_COLOR, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_COLORRECT)
  }

  public companion object
}
