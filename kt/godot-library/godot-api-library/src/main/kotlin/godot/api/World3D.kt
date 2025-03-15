// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.RID
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser._RID
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
    createNativeObject(855, scriptIndex)
  }

  public final fun getSpace(): RID {
    TransferContext.callMethod(ptr, MethodBindings.getSpacePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun getNavigationMap(): RID {
    TransferContext.callMethod(ptr, MethodBindings.getNavigationMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun getScenario(): RID {
    TransferContext.callMethod(ptr, MethodBindings.getScenarioPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setEnvironment(env: Environment?): Unit {
    TransferContext.writeArguments(OBJECT to env)
    TransferContext.callMethod(ptr, MethodBindings.setEnvironmentPtr, NIL)
  }

  public final fun getEnvironment(): Environment? {
    TransferContext.callMethod(ptr, MethodBindings.getEnvironmentPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Environment?)
  }

  public final fun setFallbackEnvironment(env: Environment?): Unit {
    TransferContext.writeArguments(OBJECT to env)
    TransferContext.callMethod(ptr, MethodBindings.setFallbackEnvironmentPtr, NIL)
  }

  public final fun getFallbackEnvironment(): Environment? {
    TransferContext.callMethod(ptr, MethodBindings.getFallbackEnvironmentPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Environment?)
  }

  public final fun setCameraAttributes(attributes: CameraAttributes?): Unit {
    TransferContext.writeArguments(OBJECT to attributes)
    TransferContext.callMethod(ptr, MethodBindings.setCameraAttributesPtr, NIL)
  }

  public final fun getCameraAttributes(): CameraAttributes? {
    TransferContext.callMethod(ptr, MethodBindings.getCameraAttributesPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as CameraAttributes?)
  }

  public final fun getDirectSpaceState(): PhysicsDirectSpaceState3D? {
    TransferContext.callMethod(ptr, MethodBindings.getDirectSpaceStatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as PhysicsDirectSpaceState3D?)
  }

  public companion object

  public object MethodBindings {
    internal val getSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "get_space", 2944877500)

    internal val getNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "get_navigation_map", 2944877500)

    internal val getScenarioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "get_scenario", 2944877500)

    internal val setEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "set_environment", 4143518816)

    internal val getEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "get_environment", 3082064660)

    internal val setFallbackEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "set_fallback_environment", 4143518816)

    internal val getFallbackEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "get_fallback_environment", 3082064660)

    internal val setCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "set_camera_attributes", 2817810567)

    internal val getCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "get_camera_attributes", 3921283215)

    internal val getDirectSpaceStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("World3D", "get_direct_space_state", 2069328350)
  }
}
