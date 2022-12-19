// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Suppress

/**
 * Reference frame for GUI.
 *
 * A rectangle box that displays only a [borderColor] border color around its rectangle. [godot.ReferenceRect] has no fill [godot.core.Color]. If you need to display a rectangle filled with a solid color, consider using [godot.ColorRect] instead.
 */
@GodotBaseType
public open class ReferenceRect : Control() {
  /**
   * Sets the border [godot.core.Color] of the [godot.ReferenceRect].
   */
  public var borderColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFERENCERECT_GET_BORDER_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFERENCERECT_SET_BORDER_COLOR,
          NIL)
    }

  /**
   * Sets the border width of the [godot.ReferenceRect]. The border grows both inwards and outwards with respect to the rectangle box.
   */
  public var borderWidth: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFERENCERECT_GET_BORDER_WIDTH,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFERENCERECT_SET_BORDER_WIDTH,
          NIL)
    }

  /**
   * If `true`, the [godot.ReferenceRect] will only be visible while in editor. Otherwise, [godot.ReferenceRect] will be visible in the running project.
   */
  public var editorOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFERENCERECT_GET_EDITOR_ONLY,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFERENCERECT_SET_EDITOR_ONLY,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_REFERENCERECT, scriptIndex)
    return true
  }

  public companion object
}
