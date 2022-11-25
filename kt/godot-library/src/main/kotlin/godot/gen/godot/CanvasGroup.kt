// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Merges several 2D nodes into a single draw operation.
 *
 * Child [godot.CanvasItem] nodes of a [godot.CanvasGroup] are drawn as a single object. It allows to e.g. draw overlapping translucent 2D nodes without blending (set [godot.CanvasItem.selfModulate] property of [godot.CanvasGroup] to achieve this effect).
 *
 * **Note:** Since [godot.CanvasGroup] and [godot.CanvasItem.clipChildren] both utilize the backbuffer, children of a [godot.CanvasGroup] who have their [godot.CanvasItem.clipChildren] set to anything other than [godot.CanvasItem.CLIP_CHILDREN_DISABLED] will not function correctly.
 */
@GodotBaseType
public open class CanvasGroup : Node2D() {
  /**
   *
   */
  public var fitMargin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASGROUP_GET_FIT_MARGIN,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASGROUP_SET_FIT_MARGIN, NIL)
    }

  /**
   *
   */
  public var clearMargin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASGROUP_GET_CLEAR_MARGIN,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASGROUP_SET_CLEAR_MARGIN, NIL)
    }

  /**
   *
   */
  public var useMipmaps: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASGROUP_IS_USING_MIPMAPS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASGROUP_SET_USE_MIPMAPS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CANVASGROUP)
  }

  public companion object
}
