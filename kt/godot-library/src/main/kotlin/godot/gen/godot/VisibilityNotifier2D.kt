// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.CoreTypeHelper
import godot.annotation.GodotBaseType
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.RECT2
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * Detects approximately when the node is visible on screen.
 *
 * The VisibilityNotifier2D detects when it is visible on the screen. It also notifies when its bounding rectangle enters or exits the screen or a viewport.
 *
 * If you want nodes to be disabled automatically when they exit the screen, use [godot.VisibilityEnabler2D] instead.
 *
 * **Note:** For performance reasons, VisibilityNotifier2D uses an approximate heuristic with precision determined by [godot.ProjectSettings.world/2d/cellSize]. If you need precise visibility checking, use another method such as adding an [godot.Area2D] node as a child of a [godot.Camera2D] node.
 */
@GodotBaseType
open class VisibilityNotifier2D : Node2D() {
  /**
   * Emitted when the VisibilityNotifier2D enters the screen.
   */
  val screenEntered: Signal0 by signal()

  /**
   * Emitted when the VisibilityNotifier2D exits the screen.
   */
  val screenExited: Signal0 by signal()

  /**
   * Emitted when the VisibilityNotifier2D enters a [godot.Viewport]'s view.
   */
  val viewportEntered: Signal1<Viewport> by signal("viewport")

  /**
   * Emitted when the VisibilityNotifier2D exits a [godot.Viewport]'s view.
   */
  val viewportExited: Signal1<Viewport> by signal("viewport")

  /**
   * The VisibilityNotifier2D's bounding rectangle.
   */
  open var rect: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISIBILITYNOTIFIER2D_GET_RECT,
          RECT2)
      return TransferContext.readReturnValue(RECT2, false) as Rect2
    }
    set(value) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISIBILITYNOTIFIER2D_SET_RECT,
          NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_VISIBILITYNOTIFIER2D)
  }

  @CoreTypeHelper
  open fun rect(schedule: Rect2.() -> Unit): Rect2 = rect.apply{
      schedule(this)
      rect = this
  }


  /**
   * If `true`, the bounding rectangle is on the screen.
   *
   * **Note:** It takes one frame for the node's visibility to be assessed once added to the scene tree, so this method will return `false` right after it is instantiated, even if it will be on screen in the draw pass.
   */
  open fun isOnScreen(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISIBILITYNOTIFIER2D_IS_ON_SCREEN,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }
}
