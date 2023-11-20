// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * A container used for displaying the contents of a [godot.SubViewport].
 *
 * A container that displays the contents of underlying [godot.SubViewport] child nodes. It uses the combined size of the [godot.SubViewport]s as minimum size, unless [stretch] is enabled.
 *
 * **Note:** Changing a [godot.SubViewportContainer]'s [godot.Control.scale] will cause its contents to appear distorted. To change its visual size without causing distortion, adjust the node's margins instead (if it's not already in a container).
 *
 * **Note:** The [godot.SubViewportContainer] forwards mouse-enter and mouse-exit notifications to its sub-viewports.
 */
@GodotBaseType
public open class SubViewportContainer : Container() {
  /**
   * If `true`, the sub-viewport will be automatically resized to the control's size.
   *
   * **Note:** If `true`, this will prohibit changing [godot.SubViewport.size] of its children manually.
   */
  public var stretch: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isStretchEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStretchPtr, NIL)
    }

  /**
   * Divides the sub-viewport's effective resolution by this value while preserving its scale. This can be used to speed up rendering.
   *
   * For example, a 1280×720 sub-viewport with [stretchShrink] set to `2` will be rendered at 640×360 while occupying the same size in the container.
   *
   * **Note:** [stretch] must be `true` for this property to work.
   */
  public var stretchShrink: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStretchShrinkPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setStretchShrinkPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SUBVIEWPORTCONTAINER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setStretchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewportContainer", "set_stretch")

    public val isStretchEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewportContainer", "is_stretch_enabled")

    public val setStretchShrinkPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewportContainer", "set_stretch_shrink")

    public val getStretchShrinkPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewportContainer", "get_stretch_shrink")
  }
}
