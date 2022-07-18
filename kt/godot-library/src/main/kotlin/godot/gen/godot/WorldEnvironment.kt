// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Suppress
import kotlin.Unit

/**
 * Default environment properties for the entire scene (post-processing effects, lighting and background settings).
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * The [godot.WorldEnvironment] node is used to configure the default [godot.Environment] for the scene.
 *
 * The parameters defined in the [godot.WorldEnvironment] can be overridden by an [godot.Environment] node set on the current [godot.Camera3D]. Additionally, only one [godot.WorldEnvironment] may be instantiated in a given scene at a time.
 *
 * The [godot.WorldEnvironment] allows the user to specify default lighting parameters (e.g. ambient lighting), various post-processing effects (e.g. SSAO, DOF, Tonemapping), and how to draw the background (e.g. solid color, skybox). Usually, these are added in order to improve the realism/color balance of the scene.
 */
@GodotBaseType
public open class WorldEnvironment : Node() {
  /**
   * The [godot.Environment] resource used by this [godot.WorldEnvironment], defining the default properties.
   */
  public var environment: Environment?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLDENVIRONMENT_GET_ENVIRONMENT,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Environment?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLDENVIRONMENT_SET_ENVIRONMENT,
          NIL.ordinal)
    }

  /**
   * The [godot.CameraEffects] resource used by this [godot.WorldEnvironment], defining the default properties. This [godot.CameraEffects] resource will be used by all [godot.Camera3D]s that do not define their own [godot.CameraEffects].
   */
  public var cameraEffects: CameraEffects?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLDENVIRONMENT_GET_CAMERA_EFFECTS,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as CameraEffects?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLDENVIRONMENT_SET_CAMERA_EFFECTS,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_WORLDENVIRONMENT)
  }

  public companion object
}
