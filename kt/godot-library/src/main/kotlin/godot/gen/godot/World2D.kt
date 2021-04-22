// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.OBJECT
import godot.core.VariantType._RID
import kotlin.Suppress

/**
 * Class that has everything pertaining to a 2D world.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.3/tutorials/physics/ray-casting.html](https://docs.godotengine.org/en/3.3/tutorials/physics/ray-casting.html)
 *
 * Class that has everything pertaining to a 2D world. A physics space, a visual scenario and a sound space. 2D nodes register their resources into the current 2D world.
 */
@GodotBaseType
open class World2D : Resource() {
  /**
   * The [RID] of this world's canvas resource. Used by the [godot.VisualServer] for 2D drawing.
   */
  open val canvas: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD2D_GET_CANVAS, _RID)
      return TransferContext.readReturnValue(_RID, false) as RID
    }

  /**
   * Direct access to the world's physics 2D space state. Used for querying current and potential collisions. When using multi-threaded physics, access is limited to `_physics_process(delta)` in the main thread.
   */
  open val directSpaceState: Physics2DDirectSpaceState?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD2D_GET_DIRECT_SPACE_STATE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Physics2DDirectSpaceState?
    }

  /**
   * The [RID] of this world's physics space resource. Used by the [godot.Physics2DServer] for 2D physics, treating it as both a space and an area.
   */
  open val space: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD2D_GET_SPACE, _RID)
      return TransferContext.readReturnValue(_RID, false) as RID
    }

  override fun __new() {
    callConstructor(ENGINECLASS_WORLD2D)
  }
}
