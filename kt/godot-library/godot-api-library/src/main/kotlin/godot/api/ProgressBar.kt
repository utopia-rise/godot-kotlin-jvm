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
 * A control used for visual representation of a percentage. Shows fill percentage from right to
 * left.
 */
@GodotBaseType
public open class ProgressBar : Range() {
  /**
   * The fill direction. See [FillMode] for possible values.
   */
  public final inline var fillMode: Int
    @JvmName("fillModeProperty")
    get() = getFillMode()
    @JvmName("fillModeProperty")
    set(`value`) {
      setFillMode(value)
    }

  /**
   * If `true`, the fill percentage is displayed on the bar.
   */
  public final inline var showPercentage: Boolean
    @JvmName("showPercentageProperty")
    get() = isPercentageShown()
    @JvmName("showPercentageProperty")
    set(`value`) {
      setShowPercentage(value)
    }

  /**
   * When set to `true`, the progress bar indicates that something is happening with an animation,
   * but does not show the fill percentage or value.
   */
  public final inline var indeterminate: Boolean
    @JvmName("indeterminateProperty")
    get() = isIndeterminate()
    @JvmName("indeterminateProperty")
    set(`value`) {
      setIndeterminate(value)
    }

  /**
   * If `false`, the [indeterminate] animation will be paused in the editor.
   */
  public final inline var editorPreviewIndeterminate: Boolean
    @JvmName("editorPreviewIndeterminateProperty")
    get() = isEditorPreviewIndeterminateEnabled()
    @JvmName("editorPreviewIndeterminateProperty")
    set(`value`) {
      setEditorPreviewIndeterminate(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(522, scriptIndex)
  }

  public final fun setFillMode(mode: Int): Unit {
    TransferContext.writeArguments(LONG to mode.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setFillModePtr, NIL)
  }

  public final fun getFillMode(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFillModePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setShowPercentage(visible: Boolean): Unit {
    TransferContext.writeArguments(BOOL to visible)
    TransferContext.callMethod(ptr, MethodBindings.setShowPercentagePtr, NIL)
  }

  public final fun isPercentageShown(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPercentageShownPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setIndeterminate(indeterminate: Boolean): Unit {
    TransferContext.writeArguments(BOOL to indeterminate)
    TransferContext.callMethod(ptr, MethodBindings.setIndeterminatePtr, NIL)
  }

  public final fun isIndeterminate(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isIndeterminatePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEditorPreviewIndeterminate(previewIndeterminate: Boolean): Unit {
    TransferContext.writeArguments(BOOL to previewIndeterminate)
    TransferContext.callMethod(ptr, MethodBindings.setEditorPreviewIndeterminatePtr, NIL)
  }

  public final fun isEditorPreviewIndeterminateEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEditorPreviewIndeterminateEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public enum class FillMode(
    id: Long,
  ) {
    /**
     * The progress bar fills from begin to end horizontally, according to the language direction.
     * If [Control.isLayoutRtl] returns `false`, it fills from left to right, and if it returns `true`,
     * it fills from right to left.
     */
    FILL_BEGIN_TO_END(0),
    /**
     * The progress bar fills from end to begin horizontally, according to the language direction.
     * If [Control.isLayoutRtl] returns `false`, it fills from right to left, and if it returns `true`,
     * it fills from left to right.
     */
    FILL_END_TO_BEGIN(1),
    /**
     * The progress fills from top to bottom.
     */
    FILL_TOP_TO_BOTTOM(2),
    /**
     * The progress fills from bottom to top.
     */
    FILL_BOTTOM_TO_TOP(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FillMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setFillModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProgressBar", "set_fill_mode", 1286410249)

    internal val getFillModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProgressBar", "get_fill_mode", 2455072627)

    internal val setShowPercentagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProgressBar", "set_show_percentage", 2586408642)

    internal val isPercentageShownPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProgressBar", "is_percentage_shown", 36873697)

    internal val setIndeterminatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProgressBar", "set_indeterminate", 2586408642)

    internal val isIndeterminatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProgressBar", "is_indeterminate", 36873697)

    internal val setEditorPreviewIndeterminatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProgressBar", "set_editor_preview_indeterminate", 2586408642)

    internal val isEditorPreviewIndeterminateEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProgressBar", "is_editor_preview_indeterminate_enabled", 36873697)
  }
}
