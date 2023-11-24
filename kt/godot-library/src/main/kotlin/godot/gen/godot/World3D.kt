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
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * A resource that holds all components of a 3D world, such as a visual scenario and a physics space.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/physics/ray-casting.html]($DOCS_URL/tutorials/physics/ray-casting.html)
 *
 * Class that has everything pertaining to a world: A physics space, a visual scenario, and a sound space. 3D nodes register their resources into the current 3D world.
 */
@GodotBaseType
public open class World3D : Resource() {
  /**
   * The World3D's [godot.Environment].
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
   * The default [godot.CameraAttributes] resource to use if none set on the [godot.Camera3D].
   */
  public var cameraAttributes: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCameraAttributesPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
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
   * The [RID] of this world's navigation map. Used by the [godot.NavigationServer3D].
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
   * Direct access to the world's physics 3D space state. Used for querying current and potential collisions. When using multi-threaded physics, access is limited to [godot.Node.PhysicsProcess] in the main thread.
   */
  public val directSpaceState: PhysicsDirectSpaceState3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDirectSpaceStatePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectSpaceState3D?)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WORLD3D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val getSpacePtr: VoidPtr = TypeManager.getMethodBindPtr("World3D", "get_space")

    public val getNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "get_navigation_map")

    public val getScenarioPtr: VoidPtr = TypeManager.getMethodBindPtr("World3D", "get_scenario")

    public val setEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "set_environment")

    public val getEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "get_environment")

    public val setFallbackEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "set_fallback_environment")

    public val getFallbackEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "get_fallback_environment")

    public val setCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "set_camera_attributes")

    public val getCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "get_camera_attributes")

    public val getDirectSpaceStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "get_direct_space_state")
  }
}
