// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
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

private const val ENGINE_CLASS_PROGRESSBAR_INDEX: Int = 505

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
    Internals.callConstructor(this, ENGINE_CLASS_PROGRESSBAR_INDEX, scriptIndex)
  }

  public final fun setFillMode(mode: Int): Unit {
    Internals.writeArguments(LONG to mode.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setFillModePtr, NIL)
  }

  public final fun getFillMode(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFillModePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setShowPercentage(visible: Boolean): Unit {
    Internals.writeArguments(BOOL to visible)
    Internals.callMethod(rawPtr, MethodBindings.setShowPercentagePtr, NIL)
  }

  public final fun isPercentageShown(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isPercentageShownPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setIndeterminate(indeterminate: Boolean): Unit {
    Internals.writeArguments(BOOL to indeterminate)
    Internals.callMethod(rawPtr, MethodBindings.setIndeterminatePtr, NIL)
  }

  public final fun isIndeterminate(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isIndeterminatePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEditorPreviewIndeterminate(previewIndeterminate: Boolean): Unit {
    Internals.writeArguments(BOOL to previewIndeterminate)
    Internals.callMethod(rawPtr, MethodBindings.setEditorPreviewIndeterminatePtr, NIL)
  }

  public final fun isEditorPreviewIndeterminateEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isEditorPreviewIndeterminateEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
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

  internal object MethodBindings {
    public val setFillModePtr: VoidPtr =
        Internals.getMethodBindPtr("ProgressBar", "set_fill_mode", 1286410249)

    public val getFillModePtr: VoidPtr =
        Internals.getMethodBindPtr("ProgressBar", "get_fill_mode", 2455072627)

    public val setShowPercentagePtr: VoidPtr =
        Internals.getMethodBindPtr("ProgressBar", "set_show_percentage", 2586408642)

    public val isPercentageShownPtr: VoidPtr =
        Internals.getMethodBindPtr("ProgressBar", "is_percentage_shown", 36873697)

    public val setIndeterminatePtr: VoidPtr =
        Internals.getMethodBindPtr("ProgressBar", "set_indeterminate", 2586408642)

    public val isIndeterminatePtr: VoidPtr =
        Internals.getMethodBindPtr("ProgressBar", "is_indeterminate", 36873697)

    public val setEditorPreviewIndeterminatePtr: VoidPtr =
        Internals.getMethodBindPtr("ProgressBar", "set_editor_preview_indeterminate", 2586408642)

    public val isEditorPreviewIndeterminateEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("ProgressBar", "is_editor_preview_indeterminate_enabled", 36873697)
  }
}
