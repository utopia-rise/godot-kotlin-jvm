// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Signal0
import godot.core.Signal1
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_SLIDER_INDEX: Int = 601

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
  public val dragStarted: Signal0 by Signal0

  /**
   * Emitted when dragging stops. If [valueChanged] is true, [Range.value] is different from the
   * value when you started the dragging.
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

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_SLIDER_INDEX, scriptIndex)
  }

  public final fun setTicks(count: Int): Unit {
    Internals.writeArguments(LONG to count.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setTicksPtr, NIL)
  }

  public final fun getTicks(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTicksPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun getTicksOnBorders(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTicksOnBordersPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTicksOnBorders(ticksOnBorder: Boolean): Unit {
    Internals.writeArguments(BOOL to ticksOnBorder)
    Internals.callMethod(rawPtr, MethodBindings.setTicksOnBordersPtr, NIL)
  }

  public final fun setEditable(editable: Boolean): Unit {
    Internals.writeArguments(BOOL to editable)
    Internals.callMethod(rawPtr, MethodBindings.setEditablePtr, NIL)
  }

  public final fun isEditable(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isEditablePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setScrollable(scrollable: Boolean): Unit {
    Internals.writeArguments(BOOL to scrollable)
    Internals.callMethod(rawPtr, MethodBindings.setScrollablePtr, NIL)
  }

  public final fun isScrollable(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isScrollablePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setTicksPtr: VoidPtr =
        Internals.getMethodBindPtr("Slider", "set_ticks", 1286410249)

    internal val getTicksPtr: VoidPtr =
        Internals.getMethodBindPtr("Slider", "get_ticks", 3905245786)

    internal val getTicksOnBordersPtr: VoidPtr =
        Internals.getMethodBindPtr("Slider", "get_ticks_on_borders", 36873697)

    internal val setTicksOnBordersPtr: VoidPtr =
        Internals.getMethodBindPtr("Slider", "set_ticks_on_borders", 2586408642)

    internal val setEditablePtr: VoidPtr =
        Internals.getMethodBindPtr("Slider", "set_editable", 2586408642)

    internal val isEditablePtr: VoidPtr =
        Internals.getMethodBindPtr("Slider", "is_editable", 36873697)

    internal val setScrollablePtr: VoidPtr =
        Internals.getMethodBindPtr("Slider", "set_scrollable", 2586408642)

    internal val isScrollablePtr: VoidPtr =
        Internals.getMethodBindPtr("Slider", "is_scrollable", 36873697)
  }
}
