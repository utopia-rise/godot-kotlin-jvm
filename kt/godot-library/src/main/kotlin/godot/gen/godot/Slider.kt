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
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Abstract base class for sliders, used to adjust a value by moving a grabber along a horizontal or
 * vertical axis. Sliders are [Range]-based controls.
 */
@GodotBaseType
public open class Slider internal constructor() : Range() {
  /**
   * Emitted when dragging is started. This is emitted before the corresponding [signal
   * Range.value_changed] signal.
   */
  public val dragStarted: Signal0 by signal()

  /**
   * Emitted when dragging stops. If [valueChanged] is true, [Range.value] is different from the
   * value when you started the dragging.
   */
  public val dragEnded: Signal1<Boolean> by signal("valueChanged")

  /**
   * If `true`, the slider can be interacted with. If `false`, the value can be changed only by
   * code.
   */
  public final inline var editable: Boolean
    @JvmName("editableProperty")
    get() = isEditable()
    @JvmName("editableProperty")
    set(`value`) {
      setEditable(value)
    }

  /**
   * If `true`, the value can be changed using the mouse wheel.
   */
  public final inline var scrollable: Boolean
    @JvmName("scrollableProperty")
    get() = isScrollable()
    @JvmName("scrollableProperty")
    set(`value`) {
      setScrollable(value)
    }

  /**
   * Number of ticks displayed on the slider, including border ticks. Ticks are
   * uniformly-distributed value markers.
   */
  public final inline var tickCount: Int
    @JvmName("tickCountProperty")
    get() = getTicks()
    @JvmName("tickCountProperty")
    set(`value`) {
      setTicks(value)
    }

  /**
   * If `true`, the slider will display ticks for minimum and maximum values.
   */
  public final inline var ticksOnBorders: Boolean
    @JvmName("ticksOnBordersProperty")
    get() = getTicksOnBorders()
    @JvmName("ticksOnBordersProperty")
    set(`value`) {
      setTicksOnBorders(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SLIDER, scriptIndex)
  }

  public final fun setTicks(count: Int): Unit {
    TransferContext.writeArguments(LONG to count.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setTicksPtr, NIL)
  }

  public final fun getTicks(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTicksPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public final fun getTicksOnBorders(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTicksOnBordersPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public final fun setTicksOnBorders(ticksOnBorder: Boolean): Unit {
    TransferContext.writeArguments(BOOL to ticksOnBorder)
    TransferContext.callMethod(rawPtr, MethodBindings.setTicksOnBordersPtr, NIL)
  }

  public final fun setEditable(editable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to editable)
    TransferContext.callMethod(rawPtr, MethodBindings.setEditablePtr, NIL)
  }

  public final fun isEditable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isEditablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public final fun setScrollable(scrollable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to scrollable)
    TransferContext.callMethod(rawPtr, MethodBindings.setScrollablePtr, NIL)
  }

  public final fun isScrollable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isScrollablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setTicksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Slider", "set_ticks", 1286410249)

    public val getTicksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Slider", "get_ticks", 3905245786)

    public val getTicksOnBordersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Slider", "get_ticks_on_borders", 36873697)

    public val setTicksOnBordersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Slider", "set_ticks_on_borders", 2586408642)

    public val setEditablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Slider", "set_editable", 2586408642)

    public val isEditablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Slider", "is_editable", 36873697)

    public val setScrollablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Slider", "set_scrollable", 2586408642)

    public val isScrollablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Slider", "is_scrollable", 36873697)
  }
}
