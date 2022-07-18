// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
 * [$DOCS_URL/tutorials/physics/ray-casting.html]($DOCS_URL/tutorials/physics/ray-casting.html)
 *
 * Class that has everything pertaining to a world. A physics space, a visual scenario and a sound space. Node3D nodes register their resources into the current world.
 */
@GodotBaseType
public open class World3D : Resource() {
  /**
   * The World3D's [godot.Environment].
   */
  public var environment: Environment?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD3D_GET_ENVIRONMENT,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Environment?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD3D_SET_ENVIRONMENT, NIL.ordinal)
    }

  /**
   * The World3D's fallback environment will be used if [environment] fails or is missing.
   */
  public var fallbackEnvironment: Environment?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD3D_GET_FALLBACK_ENVIRONMENT,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Environment?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD3D_SET_FALLBACK_ENVIRONMENT,
          NIL.ordinal)
    }

  /**
   *
   */
  public var cameraEffects: CameraEffects?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD3D_GET_CAMERA_EFFECTS,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as CameraEffects?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD3D_SET_CAMERA_EFFECTS,
          NIL.ordinal)
    }

  /**
   * The World3D's physics space.
   */
  public val space: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD3D_GET_SPACE, _RID.ordinal)
      return TransferContext.readReturnValue(_RID, false) as RID
    }

  /**
   * The [RID] of this world's navigation map. Used by the [godot.NavigationServer3D].
   */
  public val navigationMap: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD3D_GET_NAVIGATION_MAP,
          _RID.ordinal)
      return TransferContext.readReturnValue(_RID, false) as RID
    }

  /**
   * The World3D's visual scenario.
   */
  public val scenario: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD3D_GET_SCENARIO, _RID.ordinal)
      return TransferContext.readReturnValue(_RID, false) as RID
    }

  /**
   * Direct access to the world's physics 3D space state. Used for querying current and potential collisions.
   */
  public val directSpaceState: PhysicsDirectSpaceState3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD3D_GET_DIRECT_SPACE_STATE,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectSpaceState3D?
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_WORLD3D)
  }

  public companion object
}
