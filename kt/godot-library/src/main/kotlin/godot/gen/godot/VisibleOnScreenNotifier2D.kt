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
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.RECT2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A rectangular region of 2D space that detects whether it is visible on screen.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/515](https://godotengine.org/asset-library/asset/515)
 *
 * [godot.VisibleOnScreenEnabler2D] represents a rectangular region of 2D space. When any part of this region becomes visible on screen or in a viewport, it will emit a [screenEntered] signal, and likewise it will emit a [screenExited] signal when no part of it remains visible.
 *
 * If you want a node to be enabled automatically when this region is visible on screen, use [godot.VisibleOnScreenEnabler2D].
 *
 * **Note:** [godot.VisibleOnScreenNotifier2D] uses the render culling code to determine whether it's visible on screen, so it won't function unless [godot.CanvasItem.visible] is set to `true`.
 */
@GodotBaseType
public open class VisibleOnScreenNotifier2D : Node2D() {
  /**
   * Emitted when the VisibleOnScreenNotifier2D enters the screen.
   */
  public val screenEntered: Signal0 by signal()

  /**
   * Emitted when the VisibleOnScreenNotifier2D exits the screen.
   */
  public val screenExited: Signal0 by signal()

  /**
   * The VisibleOnScreenNotifier2D's bounding rectangle.
   */
  @CoreTypeLocalCopy
  public var rect: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRectPtr, RECT2)
      return (TransferContext.readReturnValue(RECT2, false) as Rect2)
    }
    set(`value`) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRectPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISIBLEONSCREENNOTIFIER2D, scriptIndex)
    return true
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
  public open fun rectMutate(block: Rect2.() -> Unit): Rect2 = rect.apply{
      block(this)
      rect = this
  }


  /**
   * If `true`, the bounding rectangle is on the screen.
   *
   * **Note:** It takes one frame for the [godot.VisibleOnScreenNotifier2D]'s visibility to be determined once added to the scene tree, so this method will always return `false` right after it is instantiated, before the draw pass.
   */
  public fun isOnScreen(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOnScreenPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenNotifier2D", "set_rect")

    public val getRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenNotifier2D", "get_rect")

    public val isOnScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenNotifier2D", "is_on_screen")
  }
}
