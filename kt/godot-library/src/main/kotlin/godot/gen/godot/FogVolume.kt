// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A region that contributes to the default volumetric fog from the world environment.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/3d/volumetric_fog.html]($DOCS_URL/tutorials/3d/volumetric_fog.html)
 *
 * [godot.FogVolume]s are used to add localized fog into the global volumetric fog effect. [godot.FogVolume]s can also remove volumetric fog from specific areas if using a [godot.FogMaterial] with a negative [godot.FogMaterial.density].
 *
 * Performance of [godot.FogVolume]s is directly related to their relative size on the screen and the complexity of their attached [godot.FogMaterial]. It is best to keep [godot.FogVolume]s relatively small and simple where possible.
 *
 * **Note:** [godot.FogVolume]s only have a visible effect if [godot.Environment.volumetricFogEnabled] is `true`. If you don't want fog to be globally visible (but only within [godot.FogVolume] nodes), set [godot.Environment.volumetricFogDensity] to `0.0`.
 */
@GodotBaseType
public open class FogVolume : VisualInstance3D() {
  /**
   * The size of the [godot.FogVolume] when [shape] is [godot.RenderingServer.FOG_VOLUME_SHAPE_ELLIPSOID], [godot.RenderingServer.FOG_VOLUME_SHAPE_CONE], [godot.RenderingServer.FOG_VOLUME_SHAPE_CYLINDER] or [godot.RenderingServer.FOG_VOLUME_SHAPE_BOX].
   *
   * **Note:** Thin fog volumes may appear to flicker when the camera moves or rotates. This can be alleviated by increasing [godot.ProjectSettings.rendering/environment/volumetricFog/volumeDepth] (at a performance cost) or by decreasing [godot.Environment.volumetricFogLength] (at no performance cost, but at the cost of lower fog range). Alternatively, the [godot.FogVolume] can be made thicker and use a lower density in the [material].
   *
   * **Note:** If [shape] is [godot.RenderingServer.FOG_VOLUME_SHAPE_CONE] or [godot.RenderingServer.FOG_VOLUME_SHAPE_CYLINDER], the cone/cylinder will be adjusted to fit within the size. Non-uniform scaling of cone/cylinder shapes via the [size] property is not supported, but you can scale the [godot.FogVolume] node instead.
   */
  @CoreTypeLocalCopy
  public var size: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGVOLUME_GET_SIZE, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGVOLUME_SET_SIZE, NIL)
    }

  /**
   * The shape of the [godot.FogVolume]. This can be set to either [godot.RenderingServer.FOG_VOLUME_SHAPE_ELLIPSOID], [godot.RenderingServer.FOG_VOLUME_SHAPE_CONE], [godot.RenderingServer.FOG_VOLUME_SHAPE_CYLINDER], [godot.RenderingServer.FOG_VOLUME_SHAPE_BOX] or [godot.RenderingServer.FOG_VOLUME_SHAPE_WORLD].
   */
  public var shape: RenderingServer.FogVolumeShape
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGVOLUME_GET_SHAPE, LONG)
      return RenderingServer.FogVolumeShape.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGVOLUME_SET_SHAPE, NIL)
    }

  /**
   * The [godot.Material] used by the [godot.FogVolume]. Can be either a built-in [godot.FogMaterial] or a custom [godot.ShaderMaterial].
   */
  public var material: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGVOLUME_GET_MATERIAL, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGVOLUME_SET_MATERIAL, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_FOGVOLUME, scriptIndex)
    return true
  }

  /**
   * The size of the [godot.FogVolume] when [shape] is [godot.RenderingServer.FOG_VOLUME_SHAPE_ELLIPSOID], [godot.RenderingServer.FOG_VOLUME_SHAPE_CONE], [godot.RenderingServer.FOG_VOLUME_SHAPE_CYLINDER] or [godot.RenderingServer.FOG_VOLUME_SHAPE_BOX].
   *
   * **Note:** Thin fog volumes may appear to flicker when the camera moves or rotates. This can be alleviated by increasing [godot.ProjectSettings.rendering/environment/volumetricFog/volumeDepth] (at a performance cost) or by decreasing [godot.Environment.volumetricFogLength] (at no performance cost, but at the cost of lower fog range). Alternatively, the [godot.FogVolume] can be made thicker and use a lower density in the [material].
   *
   * **Note:** If [shape] is [godot.RenderingServer.FOG_VOLUME_SHAPE_CONE] or [godot.RenderingServer.FOG_VOLUME_SHAPE_CYLINDER], the cone/cylinder will be adjusted to fit within the size. Non-uniform scaling of cone/cylinder shapes via the [size] property is not supported, but you can scale the [godot.FogVolume] node instead.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = fogvolume.size
   * //Your changes
   * fogvolume.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
      block(this)
      size = this
  }


  public companion object
}
