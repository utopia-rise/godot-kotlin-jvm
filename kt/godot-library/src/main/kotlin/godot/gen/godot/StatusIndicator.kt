// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

@GodotBaseType
public open class StatusIndicator : Node() {
  /**
   * Emitted when the status indicator is pressed.
   */
  public val pressed: Signal2<Long, Vector2i> by signal("mouseButton", "mousePosition")

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
    callConstructor(ENGINECLASS_STATUSINDICATOR, scriptIndex)
  }

  public final fun setTooltip(tooltip: String): Unit {
    TransferContext.writeArguments(STRING to tooltip)
    TransferContext.callMethod(rawPtr, MethodBindings.setTooltipPtr, NIL)
  }

  public final fun getTooltip(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTooltipPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setIcon(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setIconPtr, NIL)
  }

  public final fun getIcon(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setVisible(visible: Boolean): Unit {
    TransferContext.writeArguments(BOOL to visible)
    TransferContext.callMethod(rawPtr, MethodBindings.setVisiblePtr, NIL)
  }

  public final fun isVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMenu(menu: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to menu)
    TransferContext.callMethod(rawPtr, MethodBindings.setMenuPtr, NIL)
  }

  public final fun getMenu(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMenuPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Returns the status indicator rectangle in screen coordinates. If this status indicator is not
   * visible, returns an empty [Rect2].
   */
  public final fun getRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  public companion object

  internal object MethodBindings {
    public val setTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StatusIndicator", "set_tooltip", 83702148)

    public val getTooltipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StatusIndicator", "get_tooltip", 201670096)

    public val setIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StatusIndicator", "set_icon", 4051416890)

    public val getIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StatusIndicator", "get_icon", 3635182373)

    public val setVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StatusIndicator", "set_visible", 2586408642)

    public val isVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("StatusIndicator", "is_visible", 36873697)

    public val setMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StatusIndicator", "set_menu", 1348162250)

    public val getMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StatusIndicator", "get_menu", 4075236667)

    public val getRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StatusIndicator", "get_rect", 1639390495)
  }
}
