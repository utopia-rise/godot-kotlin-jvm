// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    callConstructor(ENGINECLASS_WORLDENVIRONMENT, scriptIndex)
  }

  public final fun setEnvironment(env: Environment?): Unit {
    TransferContext.writeArguments(OBJECT to env)
    TransferContext.callMethod(rawPtr, MethodBindings.setEnvironmentPtr, NIL)
  }

  public final fun getEnvironment(): Environment? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEnvironmentPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Environment?)
  }

  public final fun setCameraAttributes(cameraAttributes: CameraAttributes?): Unit {
    TransferContext.writeArguments(OBJECT to cameraAttributes)
    TransferContext.callMethod(rawPtr, MethodBindings.setCameraAttributesPtr, NIL)
  }

  public final fun getCameraAttributes(): CameraAttributes? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCameraAttributesPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as CameraAttributes?)
  }

  public final fun setCompositor(compositor: Compositor?): Unit {
    TransferContext.writeArguments(OBJECT to compositor)
    TransferContext.callMethod(rawPtr, MethodBindings.setCompositorPtr, NIL)
  }

  public final fun getCompositor(): Compositor? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCompositorPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Compositor?)
  }

  public companion object

  internal object MethodBindings {
    public val setEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorldEnvironment", "set_environment", 4143518816)

    public val getEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorldEnvironment", "get_environment", 3082064660)

    public val setCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorldEnvironment", "set_camera_attributes", 2817810567)

    public val getCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorldEnvironment", "get_camera_attributes", 3921283215)

    public val setCompositorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorldEnvironment", "set_compositor", 1586754307)

    public val getCompositorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorldEnvironment", "get_compositor", 3647707413)
  }
}
