// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * A container type that arranges its child controls in a way that preserves their proportions automatically when the container is resized. Useful when a container has a dynamic size and the child nodes must adjust their sizes accordingly without losing their aspect ratios.
 */
@GodotBaseType
public open class AspectRatioContainer : Container() {
  /**
   * The aspect ratio to enforce on child controls. This is the width divided by the height. The ratio depends on the [stretchMode].
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

  override fun new(scriptIndex: Int) {
    createNativeObject(42, scriptIndex)
  }

  public final fun setRatio(ratio: Float) {
    TransferContext.writeArguments(DOUBLE to ratio.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRatioPtr, NIL)
  }

  public final fun getRatio(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRatioPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setStretchMode(stretchMode: StretchMode) {
    TransferContext.writeArguments(LONG to stretchMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setStretchModePtr, NIL)
  }

  public final fun getStretchMode(): StretchMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStretchModePtr, LONG)
    return StretchMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAlignmentHorizontal(alignmentHorizontal: AlignmentMode) {
    TransferContext.writeArguments(LONG to alignmentHorizontal.id)
    TransferContext.callMethod(ptr, MethodBindings.setAlignmentHorizontalPtr, NIL)
  }

  public final fun getAlignmentHorizontal(): AlignmentMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAlignmentHorizontalPtr, LONG)
    return AlignmentMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAlignmentVertical(alignmentVertical: AlignmentMode) {
    TransferContext.writeArguments(LONG to alignmentVertical.id)
    TransferContext.callMethod(ptr, MethodBindings.setAlignmentVerticalPtr, NIL)
  }

  public final fun getAlignmentVertical(): AlignmentMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAlignmentVerticalPtr, LONG)
    return AlignmentMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class StretchMode(
    id: Long,
  ) {
    /**
     * The height of child controls is automatically adjusted based on the width of the container.
     */
    WIDTH_CONTROLS_HEIGHT(0),
    /**
     * The width of child controls is automatically adjusted based on the height of the container.
     */
    HEIGHT_CONTROLS_WIDTH(1),
    /**
     * The bounding rectangle of child controls is automatically adjusted to fit inside the container while keeping the aspect ratio.
     */
    FIT(2),
    /**
     * The width and height of child controls is automatically adjusted to make their bounding rectangle cover the entire area of the container while keeping the aspect ratio.
     *
     * When the bounding rectangle of child controls exceed the container's size and [Control.clipContents] is enabled, this allows to show only the container's area restricted by its own bounding rectangle.
     */
    COVER(3),
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
    BEGIN(0),
    /**
     * Aligns child controls with the center of the container.
     */
    CENTER(1),
    /**
     * Aligns child controls with the end (right or bottom) of the container.
     */
    END(2),
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

  public object MethodBindings {
    internal val setRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "set_ratio", 373_806_689)

    internal val getRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "get_ratio", 1_740_695_150)

    internal val setStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "set_stretch_mode", 1_876_743_467)

    internal val getStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "get_stretch_mode", 3_416_449_033)

    internal val setAlignmentHorizontalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "set_alignment_horizontal", 2_147_829_016)

    internal val getAlignmentHorizontalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "get_alignment_horizontal", 3_838_875_429)

    internal val setAlignmentVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "set_alignment_vertical", 2_147_829_016)

    internal val getAlignmentVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "get_alignment_vertical", 3_838_875_429)
  }
}
