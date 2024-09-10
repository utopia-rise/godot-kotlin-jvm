// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Class that has everything pertaining to a world: A physics space, a visual scenario, and a sound
 * space. 3D nodes register their resources into the current 3D world.
 */
@GodotBaseType
public open class World3D : Resource() {
  /**
   * The World3D's [Environment].
   */
  public var environment: Environment?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnvironmentPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Environment?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnvironmentPtr, NIL)
    }

  /**
   * The World3D's fallback environment will be used if [environment] fails or is missing.
   */
  public var fallbackEnvironment: Environment?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFallbackEnvironmentPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Environment?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFallbackEnvironmentPtr, NIL)
    }

  /**
   * The default [CameraAttributes] resource to use if none set on the [Camera3D].
   */
  public var cameraAttributes: CameraAttributes?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCameraAttributesPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as CameraAttributes?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCameraAttributesPtr, NIL)
    }

  /**
   * The World3D's physics space.
   */
  public val space: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpacePtr, _RID)
      return (TransferContext.readReturnValue(_RID, false) as RID)
    }

  /**
   * The [RID] of this world's navigation map. Used by the [NavigationServer3D].
   */
  public val navigationMap: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNavigationMapPtr, _RID)
      return (TransferContext.readReturnValue(_RID, false) as RID)
    }

  /**
   * The World3D's visual scenario.
   */
  public val scenario: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScenarioPtr, _RID)
      return (TransferContext.readReturnValue(_RID, false) as RID)
    }

  /**
   * Direct access to the world's physics 3D space state. Used for querying current and potential
   * collisions. When using multi-threaded physics, access is limited to [Node.PhysicsProcess] in the
   * main thread.
   */
  public val directSpaceState: PhysicsDirectSpaceState3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDirectSpaceStatePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectSpaceState3D?)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_WORLD3D, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val getSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "get_space", 2944877500)

    public val getNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "get_navigation_map", 2944877500)

    public val getScenarioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "get_scenario", 2944877500)

    public val setEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "set_environment", 4143518816)

    public val getEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "get_environment", 3082064660)

    public val setFallbackEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "set_fallback_environment", 4143518816)

    public val getFallbackEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "get_fallback_environment", 3082064660)

    public val setCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "set_camera_attributes", 2817810567)

    public val getCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "get_camera_attributes", 3921283215)

    public val getDirectSpaceStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "get_direct_space_state", 2069328350)
  }
}
