// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType._RID
import kotlin.Suppress

/**
 * Class that has everything pertaining to a world.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/physics/ray-casting.html](https://docs.godotengine.org/en/latest/tutorials/physics/ray-casting.html)
 *
 * Class that has everything pertaining to a world. A physics space, a visual scenario and a sound space. Spatial nodes register their resources into the current world.
 */
@GodotBaseType
open class World : Resource() {
  /**
   * Direct access to the world's physics 3D space state. Used for querying current and potential collisions. Must only be accessed from within `_physics_process(delta)`.
   */
  open val directSpaceState: PhysicsDirectSpaceState?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD_GET_DIRECT_SPACE_STATE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectSpaceState?
    }

  /**
   * The World's [godot.Environment].
   */
  open var environment: Environment?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD_GET_ENVIRONMENT, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Environment?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD_SET_ENVIRONMENT, NIL)
    }

  /**
   * The World's fallback_environment will be used if the World's [godot.Environment] fails or is missing.
   */
  open var fallbackEnvironment: Environment?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD_GET_FALLBACK_ENVIRONMENT,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Environment?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD_SET_FALLBACK_ENVIRONMENT,
          NIL)
    }

  /**
   * The World's visual scenario.
   */
  open val scenario: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD_GET_SCENARIO, _RID)
      return TransferContext.readReturnValue(_RID, false) as RID
    }

  /**
   * The World's physics space.
   */
  open val space: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD_GET_SPACE, _RID)
      return TransferContext.readReturnValue(_RID, false) as RID
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_WORLD)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}
