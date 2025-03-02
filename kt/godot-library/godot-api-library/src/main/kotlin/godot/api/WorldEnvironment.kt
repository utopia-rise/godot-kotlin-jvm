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
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
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
    createNativeObject(859, scriptIndex)
  }

  public final fun setEnvironment(env: Environment?): Unit {
    TransferContext.writeArguments(OBJECT to env)
    TransferContext.callMethod(ptr, MethodBindings.setEnvironmentPtr, NIL)
  }

  public final fun getEnvironment(): Environment? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnvironmentPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Environment?)
  }

  public final fun setCameraAttributes(cameraAttributes: CameraAttributes?): Unit {
    TransferContext.writeArguments(OBJECT to cameraAttributes)
    TransferContext.callMethod(ptr, MethodBindings.setCameraAttributesPtr, NIL)
  }

  public final fun getCameraAttributes(): CameraAttributes? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCameraAttributesPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as CameraAttributes?)
  }

  public final fun setCompositor(compositor: Compositor?): Unit {
    TransferContext.writeArguments(OBJECT to compositor)
    TransferContext.callMethod(ptr, MethodBindings.setCompositorPtr, NIL)
  }

  public final fun getCompositor(): Compositor? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCompositorPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Compositor?)
  }

  public companion object

  public object MethodBindings {
    internal val setEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorldEnvironment", "set_environment", 4143518816)

    internal val getEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorldEnvironment", "get_environment", 3082064660)

    internal val setCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorldEnvironment", "set_camera_attributes", 2817810567)

    internal val getCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorldEnvironment", "get_camera_attributes", 3921283215)

    internal val setCompositorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorldEnvironment", "set_compositor", 1586754307)

    internal val getCompositorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorldEnvironment", "get_compositor", 3647707413)
  }
}
