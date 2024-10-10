// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_WORLDENVIRONMENT_INDEX: Int = 833

/**
 * The [WorldEnvironment] node is used to configure the default [Environment] for the scene.
 * The parameters defined in the [WorldEnvironment] can be overridden by an [Environment] node set
 * on the current [Camera3D]. Additionally, only one [WorldEnvironment] may be instantiated in a given
 * scene at a time.
 * The [WorldEnvironment] allows the user to specify default lighting parameters (e.g. ambient
 * lighting), various post-processing effects (e.g. SSAO, DOF, Tonemapping), and how to draw the
 * background (e.g. solid color, skybox). Usually, these are added in order to improve the
 * realism/color balance of the scene.
 */
@GodotBaseType
public open class WorldEnvironment : Node() {
  /**
   * The [Environment] resource used by this [WorldEnvironment], defining the default properties.
   */
  public final inline var environment: Environment?
    @JvmName("environmentProperty")
    get() = getEnvironment()
    @JvmName("environmentProperty")
    set(`value`) {
      setEnvironment(value)
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
   * The default [Compositor] resource to use if none set on the [Camera3D].
   */
  public final inline var compositor: Compositor?
    @JvmName("compositorProperty")
    get() = getCompositor()
    @JvmName("compositorProperty")
    set(`value`) {
      setCompositor(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_WORLDENVIRONMENT_INDEX, scriptIndex)
  }

  public final fun setEnvironment(env: Environment?): Unit {
    Internals.writeArguments(OBJECT to env)
    Internals.callMethod(rawPtr, MethodBindings.setEnvironmentPtr, NIL)
  }

  public final fun getEnvironment(): Environment? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEnvironmentPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Environment?)
  }

  public final fun setCameraAttributes(cameraAttributes: CameraAttributes?): Unit {
    Internals.writeArguments(OBJECT to cameraAttributes)
    Internals.callMethod(rawPtr, MethodBindings.setCameraAttributesPtr, NIL)
  }

  public final fun getCameraAttributes(): CameraAttributes? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCameraAttributesPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as CameraAttributes?)
  }

  public final fun setCompositor(compositor: Compositor?): Unit {
    Internals.writeArguments(OBJECT to compositor)
    Internals.callMethod(rawPtr, MethodBindings.setCompositorPtr, NIL)
  }

  public final fun getCompositor(): Compositor? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCompositorPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Compositor?)
  }

  public companion object

  internal object MethodBindings {
    public val setEnvironmentPtr: VoidPtr =
        Internals.getMethodBindPtr("WorldEnvironment", "set_environment", 4143518816)

    public val getEnvironmentPtr: VoidPtr =
        Internals.getMethodBindPtr("WorldEnvironment", "get_environment", 3082064660)

    public val setCameraAttributesPtr: VoidPtr =
        Internals.getMethodBindPtr("WorldEnvironment", "set_camera_attributes", 2817810567)

    public val getCameraAttributesPtr: VoidPtr =
        Internals.getMethodBindPtr("WorldEnvironment", "get_camera_attributes", 3921283215)

    public val setCompositorPtr: VoidPtr =
        Internals.getMethodBindPtr("WorldEnvironment", "set_compositor", 1586754307)

    public val getCompositorPtr: VoidPtr =
        Internals.getMethodBindPtr("WorldEnvironment", "get_compositor", 3647707413)
  }
}
