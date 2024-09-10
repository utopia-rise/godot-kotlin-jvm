// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [VisibleOnScreenNotifier3D] represents a box-shaped region of 3D space. When any part of this
 * region becomes visible on screen or in a [Camera3D]'s view, it will emit a [signal screen_entered]
 * signal, and likewise it will emit a [signal screen_exited] signal when no part of it remains
 * visible.
 * If you want a node to be enabled automatically when this region is visible on screen, use
 * [VisibleOnScreenEnabler3D].
 * **Note:** [VisibleOnScreenNotifier3D] uses an approximate heuristic that doesn't take walls and
 * other occlusion into account, unless occlusion culling is used. It also won't function unless
 * [Node3D.visible] is set to `true`.
 */
@GodotBaseType
public open class VisibleOnScreenNotifier3D : VisualInstance3D() {
  /**
   * Emitted when the [VisibleOnScreenNotifier3D] enters the screen.
   */
  public val screenEntered: Signal0 by signal()

  /**
   * Emitted when the [VisibleOnScreenNotifier3D] exits the screen.
   */
  public val screenExited: Signal0 by signal()

  /**
   * The [VisibleOnScreenNotifier3D]'s bounding box.
   */
  @CoreTypeLocalCopy
  public var aabb: AABB
    @JvmName("aabbProperty")
    get() = getAabb()
    @JvmName("aabbProperty")
    set(`value`) {
      setAabb(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_VISIBLEONSCREENNOTIFIER3D, scriptIndex)
  }

  /**
   * The [VisibleOnScreenNotifier3D]'s bounding box.
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
   * val myCoreType = visibleonscreennotifier3d.aabb
   * //Your changes
   * visibleonscreennotifier3d.aabb = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun aabbMutate(block: AABB.() -> Unit): AABB = aabb.apply{
      block(this)
      aabb = this
  }


  public fun setAabb(rect: AABB): Unit {
    TransferContext.writeArguments(godot.core.VariantType.AABB to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.setAabbPtr, NIL)
  }

  /**
   * Returns `true` if the bounding box is on the screen.
   * **Note:** It takes one frame for the [VisibleOnScreenNotifier3D]'s visibility to be assessed
   * once added to the scene tree, so this method will always return `false` right after it is
   * instantiated.
   */
  public fun isOnScreen(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOnScreenPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenNotifier3D", "set_aabb", 259215842)

    public val isOnScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenNotifier3D", "is_on_screen", 36873697)
  }
}
