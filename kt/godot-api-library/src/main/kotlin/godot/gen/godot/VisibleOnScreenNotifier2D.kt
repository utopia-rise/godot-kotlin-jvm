// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Rect2
import godot.core.Signal0
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.RECT2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISIBLEONSCREENNOTIFIER2D_INDEX: Int = 702

/**
 * [VisibleOnScreenNotifier2D] represents a rectangular region of 2D space. When any part of this
 * region becomes visible on screen or in a viewport, it will emit a [signal screen_entered] signal,
 * and likewise it will emit a [signal screen_exited] signal when no part of it remains visible.
 * If you want a node to be enabled automatically when this region is visible on screen, use
 * [VisibleOnScreenEnabler2D].
 * **Note:** [VisibleOnScreenNotifier2D] uses the render culling code to determine whether it's
 * visible on screen, so it won't function unless [CanvasItem.visible] is set to `true`.
 */
@GodotBaseType
public open class VisibleOnScreenNotifier2D : Node2D() {
  /**
   * Emitted when the VisibleOnScreenNotifier2D enters the screen.
   */
  public val screenEntered: Signal0 by Signal0

  /**
   * Emitted when the VisibleOnScreenNotifier2D exits the screen.
   */
  public val screenExited: Signal0 by Signal0

  /**
   * The VisibleOnScreenNotifier2D's bounding rectangle.
   */
  @CoreTypeLocalCopy
  public final inline var rect: Rect2
    @JvmName("rectProperty")
    get() = getRect()
    @JvmName("rectProperty")
    set(`value`) {
      setRect(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISIBLEONSCREENNOTIFIER2D_INDEX, scriptIndex)
  }

  /**
   * The VisibleOnScreenNotifier2D's bounding rectangle.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = visibleonscreennotifier2d.rect
   * //Your changes
   * visibleonscreennotifier2d.rect = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun rectMutate(block: Rect2.() -> Unit): Rect2 = rect.apply{
      block(this)
      rect = this
  }


  public final fun setRect(rect: Rect2): Unit {
    Internals.writeArguments(RECT2 to rect)
    Internals.callMethod(rawPtr, MethodBindings.setRectPtr, NIL)
  }

  public final fun getRect(): Rect2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRectPtr, RECT2)
    return (Internals.readReturnValue(RECT2) as Rect2)
  }

  /**
   * If `true`, the bounding rectangle is on the screen.
   * **Note:** It takes one frame for the [VisibleOnScreenNotifier2D]'s visibility to be determined
   * once added to the scene tree, so this method will always return `false` right after it is
   * instantiated, before the draw pass.
   */
  public final fun isOnScreen(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isOnScreenPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setRectPtr: VoidPtr =
        Internals.getMethodBindPtr("VisibleOnScreenNotifier2D", "set_rect", 2046264180)

    public val getRectPtr: VoidPtr =
        Internals.getMethodBindPtr("VisibleOnScreenNotifier2D", "get_rect", 1639390495)

    public val isOnScreenPtr: VoidPtr =
        Internals.getMethodBindPtr("VisibleOnScreenNotifier2D", "is_on_screen", 36873697)
  }
}
