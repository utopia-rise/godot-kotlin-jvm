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
import godot.core.HorizontalAlignment
import godot.core.Signal1
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A container that can be expanded/collapsed, with a title that can be filled with controls, such
 * as buttons.
 *
 * The title can be positioned at the top or bottom of the container.
 *
 * The container can be expanded or collapsed by clicking the title or by pressing `ui_accept` when
 * focused.
 *
 * Child control nodes are hidden when the container is collapsed. Ignores non-control children.
 *
 * Can allow grouping with other FoldableContainers, check [foldableGroup] and [FoldableGroup].
 */
@GodotBaseType
public open class FoldableContainer : Container() {
  /**
   * Emitted when the container is folded/expanded.
   */
  public val foldingChanged: Signal1<Boolean> by Signal1

  /**
   * If `true`, the container will becomes folded and will hide all its children.
   */
  public final inline var folded: Boolean
    @JvmName("foldedProperty")
    get() = isFolded()
    @JvmName("foldedProperty")
    set(`value`) {
      setFolded(value)
    }

  /**
   * The container's title text.
   */
  public final inline var title: String
    @JvmName("titleProperty")
    get() = getTitle()
    @JvmName("titleProperty")
    set(`value`) {
      setTitle(value)
    }

  /**
   * Title's horizontal text alignment.
   */
  public final inline var titleAlignment: HorizontalAlignment
    @JvmName("titleAlignmentProperty")
    get() = getTitleAlignment()
    @JvmName("titleAlignmentProperty")
    set(`value`) {
      setTitleAlignment(value)
    }

  /**
   * Title's position.
   */
  public final inline var titlePosition: TitlePosition
    @JvmName("titlePositionProperty")
    get() = getTitlePosition()
    @JvmName("titlePositionProperty")
    set(`value`) {
      setTitlePosition(value)
    }

  /**
   * Defines the behavior of the title when the text is longer than the available space.
   */
  public final inline var titleTextOverrunBehavior: TextServer.OverrunBehavior
    @JvmName("titleTextOverrunBehaviorProperty")
    get() = getTitleTextOverrunBehavior()
    @JvmName("titleTextOverrunBehaviorProperty")
    set(`value`) {
      setTitleTextOverrunBehavior(value)
    }

  /**
   * The [FoldableGroup] associated with the container. When multiple [FoldableContainer] nodes
   * share the same group, only one of them is allowed to be unfolded.
   */
  public final inline var foldableGroup: FoldableGroup?
    @JvmName("foldableGroupProperty")
    get() = getFoldableGroup()
    @JvmName("foldableGroupProperty")
    set(`value`) {
      setFoldableGroup(value)
    }

  /**
   * Title text writing direction.
   */
  public final inline var titleTextDirection: Control.TextDirection
    @JvmName("titleTextDirectionProperty")
    get() = getTitleTextDirection()
    @JvmName("titleTextDirectionProperty")
    set(`value`) {
      setTitleTextDirection(value)
    }

  /**
   * Language code used for text shaping algorithms. If left empty, current locale is used instead.
   */
  public final inline var language: String
    @JvmName("languageProperty")
    get() = getLanguage()
    @JvmName("languageProperty")
    set(`value`) {
      setLanguage(value)
    }

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(222, scriptPtr)
  }

  /**
   * Folds the container and emits [signal folding_changed].
   */
  public final fun fold(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.foldPtr, NIL)
  }

  /**
   * Expands the container and emits [signal folding_changed].
   */
  public final fun expand(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.expandPtr, NIL)
  }

  public final fun setFolded(folded: Boolean): Unit {
    TransferContext.writeArguments(BOOL to folded)
    TransferContext.callMethod(ptr, MethodBindings.setFoldedPtr, NIL)
  }

  public final fun isFolded(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isFoldedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFoldableGroup(buttonGroup: FoldableGroup?): Unit {
    TransferContext.writeArguments(OBJECT to buttonGroup)
    TransferContext.callMethod(ptr, MethodBindings.setFoldableGroupPtr, NIL)
  }

  public final fun getFoldableGroup(): FoldableGroup? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFoldableGroupPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as FoldableGroup?)
  }

  public final fun setTitle(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(ptr, MethodBindings.setTitlePtr, NIL)
  }

  public final fun getTitle(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTitlePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setTitleAlignment(alignment: HorizontalAlignment): Unit {
    TransferContext.writeArguments(LONG to alignment.value)
    TransferContext.callMethod(ptr, MethodBindings.setTitleAlignmentPtr, NIL)
  }

  public final fun getTitleAlignment(): HorizontalAlignment {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTitleAlignmentPtr, LONG)
    return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setLanguage(language: String): Unit {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(ptr, MethodBindings.setLanguagePtr, NIL)
  }

  public final fun getLanguage(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setTitleTextDirection(textDirection: Control.TextDirection): Unit {
    TransferContext.writeArguments(LONG to textDirection.value)
    TransferContext.callMethod(ptr, MethodBindings.setTitleTextDirectionPtr, NIL)
  }

  public final fun getTitleTextDirection(): Control.TextDirection {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTitleTextDirectionPtr, LONG)
    return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTitleTextOverrunBehavior(overrunBehavior: TextServer.OverrunBehavior): Unit {
    TransferContext.writeArguments(LONG to overrunBehavior.value)
    TransferContext.callMethod(ptr, MethodBindings.setTitleTextOverrunBehaviorPtr, NIL)
  }

  public final fun getTitleTextOverrunBehavior(): TextServer.OverrunBehavior {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTitleTextOverrunBehaviorPtr, LONG)
    return TextServer.OverrunBehavior.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTitlePosition(titlePosition: TitlePosition): Unit {
    TransferContext.writeArguments(LONG to titlePosition.value)
    TransferContext.callMethod(ptr, MethodBindings.setTitlePositionPtr, NIL)
  }

  public final fun getTitlePosition(): TitlePosition {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTitlePositionPtr, LONG)
    return TitlePosition.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Adds a [Control] that will be placed next to the container's title, obscuring the clickable
   * area. Prime usage is adding [Button] nodes, but it can be any [Control].
   *
   * The control will be added as a child of this container and removed from previous parent if
   * necessary. The controls will be placed aligned to the right, with the first added control being
   * the leftmost one.
   */
  public final fun addTitleBarControl(control: Control?): Unit {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(ptr, MethodBindings.addTitleBarControlPtr, NIL)
  }

  /**
   * Removes a [Control] added with [addTitleBarControl]. The node is not freed automatically, you
   * need to use [Node.queueFree].
   */
  public final fun removeTitleBarControl(control: Control?): Unit {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(ptr, MethodBindings.removeTitleBarControlPtr, NIL)
  }

  public enum class TitlePosition(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Makes the title appear at the top of the container.
     */
    POSITION_TOP(0),
    /**
     * Makes the title appear at the bottom of the container. Also makes all StyleBoxes flipped
     * vertically.
     */
    POSITION_BOTTOM(1),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): TitlePosition = entries.single { it.`value` == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val foldPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FoldableContainer", "fold", 3218959716)

    internal val expandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FoldableContainer", "expand", 3218959716)

    internal val setFoldedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FoldableContainer", "set_folded", 2586408642)

    internal val isFoldedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FoldableContainer", "is_folded", 36873697)

    internal val setFoldableGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FoldableContainer", "set_foldable_group", 3001390597)

    internal val getFoldableGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FoldableContainer", "get_foldable_group", 66499518)

    internal val setTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FoldableContainer", "set_title", 83702148)

    internal val getTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FoldableContainer", "get_title", 201670096)

    internal val setTitleAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FoldableContainer", "set_title_alignment", 2312603777)

    internal val getTitleAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FoldableContainer", "get_title_alignment", 341400642)

    internal val setLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FoldableContainer", "set_language", 83702148)

    internal val getLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FoldableContainer", "get_language", 201670096)

    internal val setTitleTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FoldableContainer", "set_title_text_direction", 119160795)

    internal val getTitleTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FoldableContainer", "get_title_text_direction", 797257663)

    internal val setTitleTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FoldableContainer", "set_title_text_overrun_behavior", 1008890932)

    internal val getTitleTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FoldableContainer", "get_title_text_overrun_behavior", 3779142101)

    internal val setTitlePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FoldableContainer", "set_title_position", 2276829442)

    internal val getTitlePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FoldableContainer", "get_title_position", 3028840207)

    internal val addTitleBarControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FoldableContainer", "add_title_bar_control", 1496901182)

    internal val removeTitleBarControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FoldableContainer", "remove_title_bar_control", 1496901182)
  }
}
