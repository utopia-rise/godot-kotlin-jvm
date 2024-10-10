// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.Rect2
import godot.core.Signal2
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.RECT2
import godot.core.VariantParser.STRING
import godot.core.Vector2i
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_STATUSINDICATOR_INDEX: Int = 552

@GodotBaseType
public open class StatusIndicator : Node() {
  /**
   * Emitted when the status indicator is pressed.
   */
  public val pressed: Signal2<Long, Vector2i> by Signal2

  /**
   * Status indicator tooltip.
   */
  public final inline var tooltip: String
    @JvmName("tooltipProperty")
    get() = getTooltip()
    @JvmName("tooltipProperty")
    set(`value`) {
      setTooltip(value)
    }

  /**
   * Status indicator icon.
   */
  public final inline var icon: Texture2D?
    @JvmName("iconProperty")
    get() = getIcon()
    @JvmName("iconProperty")
    set(`value`) {
      setIcon(value)
    }

  /**
   * Status indicator native popup menu. If this is set, the [signal pressed] signal is not emitted.
   * **Note:** Native popup is only supported if [NativeMenu] supports
   * [NativeMenu.FEATURE_POPUP_MENU] feature.
   */
  public final inline var menu: NodePath
    @JvmName("menuProperty")
    get() = getMenu()
    @JvmName("menuProperty")
    set(`value`) {
      setMenu(value)
    }

  /**
   * If `true`, the status indicator is visible.
   */
  public final inline var visible: Boolean
    @JvmName("visibleProperty")
    get() = isVisible()
    @JvmName("visibleProperty")
    set(`value`) {
      setVisible(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_STATUSINDICATOR_INDEX, scriptIndex)
  }

  public final fun setTooltip(tooltip: String): Unit {
    Internals.writeArguments(STRING to tooltip)
    Internals.callMethod(rawPtr, MethodBindings.setTooltipPtr, NIL)
  }

  public final fun getTooltip(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTooltipPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setIcon(texture: Texture2D?): Unit {
    Internals.writeArguments(OBJECT to texture)
    Internals.callMethod(rawPtr, MethodBindings.setIconPtr, NIL)
  }

  public final fun getIcon(): Texture2D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getIconPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setVisible(visible: Boolean): Unit {
    Internals.writeArguments(BOOL to visible)
    Internals.callMethod(rawPtr, MethodBindings.setVisiblePtr, NIL)
  }

  public final fun isVisible(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isVisiblePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMenu(menu: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to menu)
    Internals.callMethod(rawPtr, MethodBindings.setMenuPtr, NIL)
  }

  public final fun getMenu(): NodePath {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMenuPtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Returns the status indicator rectangle in screen coordinates. If this status indicator is not
   * visible, returns an empty [Rect2].
   */
  public final fun getRect(): Rect2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRectPtr, RECT2)
    return (Internals.readReturnValue(RECT2) as Rect2)
  }

  public companion object

  internal object MethodBindings {
    public val setTooltipPtr: VoidPtr =
        Internals.getMethodBindPtr("StatusIndicator", "set_tooltip", 83702148)

    public val getTooltipPtr: VoidPtr =
        Internals.getMethodBindPtr("StatusIndicator", "get_tooltip", 201670096)

    public val setIconPtr: VoidPtr =
        Internals.getMethodBindPtr("StatusIndicator", "set_icon", 4051416890)

    public val getIconPtr: VoidPtr =
        Internals.getMethodBindPtr("StatusIndicator", "get_icon", 3635182373)

    public val setVisiblePtr: VoidPtr =
        Internals.getMethodBindPtr("StatusIndicator", "set_visible", 2586408642)

    public val isVisiblePtr: VoidPtr =
        Internals.getMethodBindPtr("StatusIndicator", "is_visible", 36873697)

    public val setMenuPtr: VoidPtr =
        Internals.getMethodBindPtr("StatusIndicator", "set_menu", 1348162250)

    public val getMenuPtr: VoidPtr =
        Internals.getMethodBindPtr("StatusIndicator", "get_menu", 4075236667)

    public val getRectPtr: VoidPtr =
        Internals.getMethodBindPtr("StatusIndicator", "get_rect", 1639390495)
  }
}
