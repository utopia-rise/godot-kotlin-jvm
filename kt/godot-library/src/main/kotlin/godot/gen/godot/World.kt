// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType._RID
import kotlin.Suppress
import kotlin.Unit

/**
 * Class that has everything pertaining to a world.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.4/tutorials/physics/ray-casting.html](https://docs.godotengine.org/en/3.4/tutorials/physics/ray-casting.html)
 *
 * Class that has everything pertaining to a world. A physics space, a visual scenario and a sound space. Spatial nodes register their resources into the current world.
 */
@GodotBaseType
public open class World : Resource() {
  /**
   * Direct access to the world's physics 3D space state. Used for querying current and potential collisions.
   */
  public open val directSpaceState: PhysicsDirectSpaceState?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD_GET_DIRECT_SPACE_STATE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectSpaceState?
    }

  /**
   * The World's [godot.Environment].
   */
  public open var environment: Environment?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD_GET_ENVIRONMENT, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Environment?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD_SET_ENVIRONMENT, NIL)
    }

  /**
   * The World's fallback_environment will be used if the World's [godot.Environment] fails or is missing.
   */
  public open var fallbackEnvironment: Environment?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD_GET_FALLBACK_ENVIRONMENT,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Environment?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD_SET_FALLBACK_ENVIRONMENT,
          NIL)
    }

  /**
   * The World's visual scenario.
   */
  public open val scenario: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD_GET_SCENARIO, _RID)
      return TransferContext.readReturnValue(_RID, false) as RID
    }

  /**
   * The World's physics space.
   */
  public open val space: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD_GET_SPACE, _RID)
      return TransferContext.readReturnValue(_RID, false) as RID
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_WORLD)
  }
}
