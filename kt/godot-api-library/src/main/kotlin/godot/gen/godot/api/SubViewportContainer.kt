// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A container that displays the contents of underlying [SubViewport] child nodes. It uses the
 * combined size of the [SubViewport]s as minimum size, unless [stretch] is enabled.
 * **Note:** Changing a [SubViewportContainer]'s [Control.scale] will cause its contents to appear
 * distorted. To change its visual size without causing distortion, adjust the node's margins instead
 * (if it's not already in a container).
 * **Note:** The [SubViewportContainer] forwards mouse-enter and mouse-exit notifications to its
 * sub-viewports.
 */
@GodotBaseType
public open class SubViewportContainer : Container() {
  /**
   * If `true`, the sub-viewport will be automatically resized to the control's size.
   * **Note:** If `true`, this will prohibit changing [SubViewport.size] of its children manually.
   */
  public final inline var stretch: Boolean
    @JvmName("stretchProperty")
    get() = isStretchEnabled()
    @JvmName("stretchProperty")
    set(`value`) {
      setStretch(value)
    }

  /**
   * Divides the sub-viewport's effective resolution by this value while preserving its scale. This
   * can be used to speed up rendering.
   * For example, a 1280×720 sub-viewport with [stretchShrink] set to `2` will be rendered at
   * 640×360 while occupying the same size in the container.
   * **Note:** [stretch] must be `true` for this property to work.
   */
  public final inline var stretchShrink: Int
    @JvmName("stretchShrinkProperty")
    get() = getStretchShrink()
    @JvmName("stretchShrinkProperty")
    set(`value`) {
      setStretchShrink(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_SUBVIEWPORTCONTAINER, scriptIndex)
  }

  /**
   * Virtual method to be implemented by the user. If it returns `true`, the [event] is propagated
   * to [SubViewport] children. Propagation doesn't happen if it returns `false`. If the function is
   * not implemented, all events are propagated to SubViewports.
   */
  public open fun _propagateInputEvent(event: InputEvent?): Boolean {
    throw NotImplementedError("_propagate_input_event is not implemented for SubViewportContainer")
  }

  public final fun setStretch(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setStretchPtr, NIL)
  }

  public final fun isStretchEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isStretchEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setStretchShrink(amount: Int): Unit {
    TransferContext.writeArguments(LONG to amount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setStretchShrinkPtr, NIL)
  }

  public final fun getStretchShrink(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStretchShrinkPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val setStretchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewportContainer", "set_stretch", 2586408642)

    public val isStretchEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewportContainer", "is_stretch_enabled", 36873697)

    public val setStretchShrinkPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewportContainer", "set_stretch_shrink", 1286410249)

    public val getStretchShrinkPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SubViewportContainer", "get_stretch_shrink", 3905245786)
  }
}
