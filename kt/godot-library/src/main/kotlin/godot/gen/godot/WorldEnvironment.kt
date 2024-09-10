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
   * The default [Compositor] resource to use if none set on the [Camera3D].
   */
  public var compositor: Compositor?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCompositorPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Compositor?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCompositorPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_WORLDENVIRONMENT, scriptIndex)
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
