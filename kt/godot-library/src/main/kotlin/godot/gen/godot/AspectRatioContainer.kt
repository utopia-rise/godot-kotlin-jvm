// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Container that preserves its child controls' aspect ratio.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/ui/gui_containers.html]($DOCS_URL/tutorials/ui/gui_containers.html)
 *
 * Arranges child controls in a way to preserve their aspect ratio automatically whenever the container is resized. Solves the problem where the container size is dynamic and the contents' size needs to adjust accordingly without losing proportions.
 */
@GodotBaseType
public open class AspectRatioContainer : Container() {
  /**
   * Specifies the horizontal relative position of child controls.
   */
  public open var alignmentHorizontal: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ASPECTRATIOCONTAINER_GET_ALIGNMENT_HORIZONTAL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ASPECTRATIOCONTAINER_SET_ALIGNMENT_HORIZONTAL, NIL)
    }

  /**
   * Specifies the vertical relative position of child controls.
   */
  public open var alignmentVertical: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ASPECTRATIOCONTAINER_GET_ALIGNMENT_VERTICAL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ASPECTRATIOCONTAINER_SET_ALIGNMENT_VERTICAL, NIL)
    }

  /**
   * The aspect ratio to enforce on child controls. This is the width divided by the height. The ratio depends on the [stretchMode].
   */
  public open var ratio: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASPECTRATIOCONTAINER_GET_RATIO,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASPECTRATIOCONTAINER_SET_RATIO,
          NIL)
    }

  /**
   * The stretch mode used to align child controls.
   */
  public open var stretchMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ASPECTRATIOCONTAINER_GET_STRETCH_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ASPECTRATIOCONTAINER_SET_STRETCH_MODE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ASPECTRATIOCONTAINER)
  }

  public enum class AlignMode(
    id: Long
  ) {
    /**
     * Aligns child controls with the beginning (left or top) of the container.
     */
    ALIGN_BEGIN(0),
    /**
     * Aligns child controls with the center of the container.
     */
    ALIGN_CENTER(1),
    /**
     * Aligns child controls with the end (right or bottom) of the container.
     */
    ALIGN_END(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class StretchMode(
    id: Long
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
     * The bounding rectangle of child controls is automatically adjusted to fit inside the container while keeping the aspect ratio.
     */
    STRETCH_FIT(2),
    /**
     * The width and height of child controls is automatically adjusted to make their bounding rectangle cover the entire area of the container while keeping the aspect ratio.
     *
     * When the bounding rectangle of child controls exceed the container's size and [godot.Control.rectClipContent] is enabled, this allows to show only the container's area restricted by its own bounding rectangle.
     */
    STRETCH_COVER(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Aligns child controls with the beginning (left or top) of the container.
     */
    public final const val ALIGN_BEGIN: Long = 0

    /**
     * Aligns child controls with the center of the container.
     */
    public final const val ALIGN_CENTER: Long = 1

    /**
     * Aligns child controls with the end (right or bottom) of the container.
     */
    public final const val ALIGN_END: Long = 2

    /**
     * The width and height of child controls is automatically adjusted to make their bounding rectangle cover the entire area of the container while keeping the aspect ratio.
     *
     * When the bounding rectangle of child controls exceed the container's size and [godot.Control.rectClipContent] is enabled, this allows to show only the container's area restricted by its own bounding rectangle.
     */
    public final const val STRETCH_COVER: Long = 3

    /**
     * The bounding rectangle of child controls is automatically adjusted to fit inside the container while keeping the aspect ratio.
     */
    public final const val STRETCH_FIT: Long = 2

    /**
     * The width of child controls is automatically adjusted based on the height of the container.
     */
    public final const val STRETCH_HEIGHT_CONTROLS_WIDTH: Long = 1

    /**
     * The height of child controls is automatically adjusted based on the width of the container.
     */
    public final const val STRETCH_WIDTH_CONTROLS_HEIGHT: Long = 0
  }
}
