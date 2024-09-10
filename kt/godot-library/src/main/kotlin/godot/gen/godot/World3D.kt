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
import kotlin.jvm.JvmName

/**
 * Class that has everything pertaining to a world: A physics space, a visual scenario, and a sound
 * space. 3D nodes register their resources into the current 3D world.
 */
@GodotBaseType
public open class World3D : Resource() {
  /**
   * The World3D's [Environment].
   */
  public final inline var environment: Environment?
    @JvmName("environmentProperty")
    get() = getEnvironment()
    @JvmName("environmentProperty")
    set(`value`) {
      setEnvironment(value)
    }

  /**
   * The World3D's fallback environment will be used if [environment] fails or is missing.
   */
  public final inline var fallbackEnvironment: Environment?
    @JvmName("fallbackEnvironmentProperty")
    get() = getFallbackEnvironment()
    @JvmName("fallbackEnvironmentProperty")
    set(`value`) {
      setFallbackEnvironment(value)
    }

  /**
   * The default [CameraAttributes] resource to use if none set on the [Camera3D].
   */
  public final inline var cameraAttributes: CameraAttributes?
    @JvmName("cameraAttributesProperty")
    get() = getCameraAttributes()
    @JvmName("cameraAttributesProperty")
    set(`value`) {
      setCameraAttributes(value)
    }

  /**
   * The World3D's physics space.
   */
  public final inline val space: RID
    @JvmName("spaceProperty")
    get() = getSpace()

  /**
   * The [RID] of this world's navigation map. Used by the [NavigationServer3D].
   */
  public final inline val navigationMap: RID
    @JvmName("navigationMapProperty")
    get() = getNavigationMap()

  /**
   * The World3D's visual scenario.
   */
  public final inline val scenario: RID
    @JvmName("scenarioProperty")
    get() = getScenario()

  /**
   * Direct access to the world's physics 3D space state. Used for querying current and potential
   * collisions. When using multi-threaded physics, access is limited to [Node.PhysicsProcess] in the
   * main thread.
   */
  public final inline val directSpaceState: PhysicsDirectSpaceState3D?
    @JvmName("directSpaceStateProperty")
    get() = getDirectSpaceState()

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_WORLD3D, scriptIndex)
  }

  public final fun getSpace(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSpacePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public final fun getNavigationMap(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public final fun getScenario(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScenarioPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public final fun setEnvironment(env: Environment?): Unit {
    TransferContext.writeArguments(OBJECT to env)
    TransferContext.callMethod(rawPtr, MethodBindings.setEnvironmentPtr, NIL)
  }

  public final fun getEnvironment(): Environment? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEnvironmentPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Environment?)
  }

  public final fun setFallbackEnvironment(env: Environment?): Unit {
    TransferContext.writeArguments(OBJECT to env)
    TransferContext.callMethod(rawPtr, MethodBindings.setFallbackEnvironmentPtr, NIL)
  }

  public final fun getFallbackEnvironment(): Environment? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFallbackEnvironmentPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Environment?)
  }

  public final fun setCameraAttributes(attributes: CameraAttributes?): Unit {
    TransferContext.writeArguments(OBJECT to attributes)
    TransferContext.callMethod(rawPtr, MethodBindings.setCameraAttributesPtr, NIL)
  }

  public final fun getCameraAttributes(): CameraAttributes? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCameraAttributesPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as CameraAttributes?)
  }

  public final fun getDirectSpaceState(): PhysicsDirectSpaceState3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDirectSpaceStatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectSpaceState3D?)
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
