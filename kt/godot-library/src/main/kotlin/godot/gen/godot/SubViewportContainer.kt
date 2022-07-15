// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
 * Control for holding [godot.SubViewport]s.
 *
 * A [godot.Container] node that holds a [godot.SubViewport]. It uses the [godot.SubViewport]'s size as minimum size, unless [stretch] is enabled.
 *
 * **Note:** Changing a SubViewportContainer's [godot.Control.scale] will cause its contents to appear distorted. To change its visual size without causing distortion, adjust the node's margins instead (if it's not already in a container).
 *
 * **Note:** The SubViewportContainer forwards mouse-enter and mouse-exit notifications to its sub-viewports.
 */
@GodotBaseType
public open class SubViewportContainer : Container() {
  /**
   * If `true`, the sub-viewport will be automatically resized to the control's size.
   */
  public var stretch: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SUBVIEWPORTCONTAINER_IS_STRETCH_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SUBVIEWPORTCONTAINER_SET_STRETCH,
          NIL)
    }

  /**
   * Divides the sub-viewport's effective resolution by this value while preserving its scale. This can be used to speed up rendering.
   *
   * For example, a 1280×720 sub-viewport with [stretchShrink] set to `2` will be rendered at 640×360 while occupying the same size in the container.
   *
   * **Note:** [stretch] must be `true` for this property to work.
   */
  public var stretchShrink: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SUBVIEWPORTCONTAINER_GET_STRETCH_SHRINK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SUBVIEWPORTCONTAINER_SET_STRETCH_SHRINK, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SUBVIEWPORTCONTAINER)
  }

  public companion object
}
