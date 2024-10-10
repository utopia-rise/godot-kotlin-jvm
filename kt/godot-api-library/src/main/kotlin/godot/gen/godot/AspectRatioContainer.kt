// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_ASPECTRATIOCONTAINER_INDEX: Int = 76

/**
 * A container type that arranges its child controls in a way that preserves their proportions
 * automatically when the container is resized. Useful when a container has a dynamic size and the
 * child nodes must adjust their sizes accordingly without losing their aspect ratios.
 */
@GodotBaseType
public open class AspectRatioContainer : Container() {
  /**
   * The aspect ratio to enforce on child controls. This is the width divided by the height. The
   * ratio depends on the [stretchMode].
   */
  public final inline var ratio: Float
    @JvmName("ratioProperty")
    get() = getRatio()
    @JvmName("ratioProperty")
    set(`value`) {
      setRatio(value)
    }

  /**
   * The stretch mode used to align child controls.
   */
  public final inline var stretchMode: StretchMode
    @JvmName("stretchModeProperty")
    get() = getStretchMode()
    @JvmName("stretchModeProperty")
    set(`value`) {
      setStretchMode(value)
    }

  /**
   * Specifies the horizontal relative position of child controls.
   */
  public final inline var alignmentHorizontal: AlignmentMode
    @JvmName("alignmentHorizontalProperty")
    get() = getAlignmentHorizontal()
    @JvmName("alignmentHorizontalProperty")
    set(`value`) {
      setAlignmentHorizontal(value)
    }

  /**
   * Specifies the vertical relative position of child controls.
   */
  public final inline var alignmentVertical: AlignmentMode
    @JvmName("alignmentVerticalProperty")
    get() = getAlignmentVertical()
    @JvmName("alignmentVerticalProperty")
    set(`value`) {
      setAlignmentVertical(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_ASPECTRATIOCONTAINER_INDEX, scriptIndex)
  }

  public final fun setRatio(ratio: Float): Unit {
    TransferContext.writeArguments(DOUBLE to ratio.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setRatioPtr, NIL)
  }

  public final fun getRatio(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRatioPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setStretchMode(stretchMode: StretchMode): Unit {
    TransferContext.writeArguments(LONG to stretchMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setStretchModePtr, NIL)
  }

  public final fun getStretchMode(): StretchMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStretchModePtr, LONG)
    return AspectRatioContainer.StretchMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAlignmentHorizontal(alignmentHorizontal: AlignmentMode): Unit {
    TransferContext.writeArguments(LONG to alignmentHorizontal.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setAlignmentHorizontalPtr, NIL)
  }

  public final fun getAlignmentHorizontal(): AlignmentMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAlignmentHorizontalPtr, LONG)
    return AspectRatioContainer.AlignmentMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAlignmentVertical(alignmentVertical: AlignmentMode): Unit {
    TransferContext.writeArguments(LONG to alignmentVertical.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setAlignmentVerticalPtr, NIL)
  }

  public final fun getAlignmentVertical(): AlignmentMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAlignmentVerticalPtr, LONG)
    return AspectRatioContainer.AlignmentMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class StretchMode(
    id: Long,
  ) {
    /**
     * The height of child controls is automatically adjusted based on the width of the container.
     */
    STRETCH_WIDTH_CONTROLS_HEIGHT(0),
    /**
     * The width of child controls is automatically adjusted based on the height of the container.
     */
    STRETCH_HEIGHT_CONTROLS_WIDTH(1),
    /**
     * The bounding rectangle of child controls is automatically adjusted to fit inside the
     * container while keeping the aspect ratio.
     */
    STRETCH_FIT(2),
    /**
     * The width and height of child controls is automatically adjusted to make their bounding
     * rectangle cover the entire area of the container while keeping the aspect ratio.
     * When the bounding rectangle of child controls exceed the container's size and
     * [Control.clipContents] is enabled, this allows to show only the container's area restricted by
     * its own bounding rectangle.
     */
    STRETCH_COVER(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): StretchMode = entries.single { it.id == `value` }
    }
  }

  public enum class AlignmentMode(
    id: Long,
  ) {
    /**
     * Aligns child controls with the beginning (left or top) of the container.
     */
    ALIGNMENT_BEGIN(0),
    /**
     * Aligns child controls with the center of the container.
     */
    ALIGNMENT_CENTER(1),
    /**
     * Aligns child controls with the end (right or bottom) of the container.
     */
    ALIGNMENT_END(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AlignmentMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "set_ratio", 373806689)

    public val getRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "get_ratio", 1740695150)

    public val setStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "set_stretch_mode", 1876743467)

    public val getStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "get_stretch_mode", 3416449033)

    public val setAlignmentHorizontalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "set_alignment_horizontal", 2147829016)

    public val getAlignmentHorizontalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "get_alignment_horizontal", 3838875429)

    public val setAlignmentVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "set_alignment_vertical", 2147829016)

    public val getAlignmentVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "get_alignment_vertical", 3838875429)
  }
}
