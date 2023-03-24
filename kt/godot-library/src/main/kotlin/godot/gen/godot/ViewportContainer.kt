// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Control for holding [godot.Viewport]s.
 *
 * A [godot.Container] node that holds a [godot.Viewport], automatically setting the viewport's size.
 *
 * **Note:** Changing a ViewportContainer's [godot.Control.rectScale] will cause its contents to appear distorted. To change its visual size without causing distortion, adjust the node's margins instead (if it's not already in a container).
 */
@GodotBaseType
public open class ViewportContainer : Container() {
  /**
   * If `true`, the viewport will be scaled to the control's size.
   */
  public open var stretch: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORTCONTAINER_GET_STRETCH,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORTCONTAINER_SET_STRETCH,
          NIL)
    }

  /**
   * Divides the viewport's effective resolution by this value while preserving its scale. This can be used to speed up rendering.
   *
   * For example, a 1280×720 viewport with [stretchShrink] set to `2` will be rendered at 640×360 while occupying the same size in the container.
   *
   * **Note:** [stretch] must be `true` for this property to work.
   */
  public open var stretchShrink: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORTCONTAINER_GET_STRETCH_SHRINK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORTCONTAINER_SET_STRETCH_SHRINK, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VIEWPORTCONTAINER)
  }

  public override fun _input(event: InputEvent): Unit {
  }

  public override fun _unhandledInput(event: InputEvent): Unit {
  }
}
