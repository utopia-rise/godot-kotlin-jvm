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
import godot.core.GodotEnum
import godot.core.Signal0
import godot.core.Signal1
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
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
   * Emitted when the grabber starts being dragged. This is emitted before the corresponding [signal
   * Range.value_changed] signal.
   */
  public val dragStarted: Signal0 by Signal0

  /**
   * Emitted when the grabber stops being dragged. If [valueChanged] is `true`, [Range.value] is
   * different from the value when the dragging was started.
   */
  public val dragEnded: Signal1<Boolean> by Signal1

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

  /**
   * Sets the position of the ticks. See [TickPosition] for details.
   */
  public final inline var ticksPosition: TickPosition
    @JvmName("ticksPositionProperty")
    get() = getTicksPosition()
    @JvmName("ticksPositionProperty")
    set(`value`) {
      setTicksPosition(value)
    }

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(628, scriptPtr)
  }

  public final fun setTicks(count: Int): Unit {
    TransferContext.writeArguments(LONG to count.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setTicksPtr, NIL)
  }

  public final fun getTicks(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTicksPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun getTicksOnBorders(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTicksOnBordersPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTicksOnBorders(ticksOnBorder: Boolean): Unit {
    TransferContext.writeArguments(BOOL to ticksOnBorder)
    TransferContext.callMethod(ptr, MethodBindings.setTicksOnBordersPtr, NIL)
  }

  public final fun getTicksPosition(): TickPosition {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTicksPositionPtr, LONG)
    return TickPosition.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTicksPosition(ticksOnBorder: TickPosition): Unit {
    TransferContext.writeArguments(LONG to ticksOnBorder.value)
    TransferContext.callMethod(ptr, MethodBindings.setTicksPositionPtr, NIL)
  }

  public final fun setEditable(editable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to editable)
    TransferContext.callMethod(ptr, MethodBindings.setEditablePtr, NIL)
  }

  public final fun isEditable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEditablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setScrollable(scrollable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to scrollable)
    TransferContext.callMethod(ptr, MethodBindings.setScrollablePtr, NIL)
  }

  public final fun isScrollable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isScrollablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public enum class TickPosition(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Places the ticks at the bottom of the [HSlider], or right of the [VSlider].
     */
    BOTTOM_RIGHT(0),
    /**
     * Places the ticks at the top of the [HSlider], or left of the [VSlider].
     */
    TOP_LEFT(1),
    /**
     * Places the ticks at the both sides of the slider.
     */
    BOTH(2),
    /**
     * Places the ticks at the center of the slider.
     */
    CENTER(3),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): TickPosition = entries.single { it.`value` == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setTicksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Slider", "set_ticks", 1286410249)

    internal val getTicksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Slider", "get_ticks", 3905245786)

    internal val getTicksOnBordersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Slider", "get_ticks_on_borders", 36873697)

    internal val setTicksOnBordersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Slider", "set_ticks_on_borders", 2586408642)

    internal val getTicksPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Slider", "get_ticks_position", 3567635531)

    internal val setTicksPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Slider", "set_ticks_position", 2952822224)

    internal val setEditablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Slider", "set_editable", 2586408642)

    internal val isEditablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Slider", "is_editable", 36873697)

    internal val setScrollablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Slider", "set_scrollable", 2586408642)

    internal val isScrollablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Slider", "is_scrollable", 36873697)
  }
}
