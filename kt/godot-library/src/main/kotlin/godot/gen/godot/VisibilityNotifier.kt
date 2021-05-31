// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * Detects approximately when the node is visible on screen.
 *
 * The VisibilityNotifier detects when it is visible on the screen. It also notifies when its bounding rectangle enters or exits the screen or a [godot.Camera]'s view.
 *
 * If you want nodes to be disabled automatically when they exit the screen, use [godot.VisibilityEnabler] instead.
 *
 * **Note:** VisibilityNotifier uses an approximate heuristic for performance reasons. It doesn't take walls and other occlusion into account. The heuristic is an implementation detail and may change in future versions. If you need precise visibility checking, use another method such as adding an [godot.Area] node as a child of a [godot.Camera] node and/or [godot.Vector3.dot].
 */
@GodotBaseType
public open class VisibilityNotifier : Spatial() {
  /**
   * Emitted when the VisibilityNotifier enters a [godot.Camera]'s view.
   */
  public val cameraEntered: Signal1<Camera> by signal("camera")

  /**
   * Emitted when the VisibilityNotifier exits a [godot.Camera]'s view.
   */
  public val cameraExited: Signal1<Camera> by signal("camera")

  /**
   * Emitted when the VisibilityNotifier enters the screen.
   */
  public val screenEntered: Signal0 by signal()

  /**
   * Emitted when the VisibilityNotifier exits the screen.
   */
  public val screenExited: Signal0 by signal()

  /**
   * The VisibilityNotifier's bounding box.
   */
  public open var aabb: AABB
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISIBILITYNOTIFIER_GET_AABB,
          godot.core.VariantType.AABB)
      return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
    }
    set(`value`) {
      TransferContext.writeArguments(godot.core.VariantType.AABB to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISIBILITYNOTIFIER_SET_AABB, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISIBILITYNOTIFIER)
  }

  @CoreTypeHelper
  public open fun aabb(schedule: AABB.() -> Unit): AABB = aabb.apply{
      schedule(this)
      aabb = this
  }


  /**
   * If `true`, the bounding box is on the screen.
   *
   * **Note:** It takes one frame for the node's visibility to be assessed once added to the scene tree, so this method will return `false` right after it is instantiated, even if it will be on screen in the draw pass.
   */
  public open fun isOnScreen(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISIBILITYNOTIFIER_IS_ON_SCREEN,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }
}
