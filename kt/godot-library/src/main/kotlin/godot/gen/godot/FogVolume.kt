// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A node used to add local fog with the volumetric fog effect.
 *
 * [godot.FogVolume]s are used to add localized fog into the global volumetric fog effect.
 *
 * Performance of [godot.FogVolume]s is directly related to their relative size on the screen and the complexity of their attached [godot.FogMaterial]. It is best to keep [godot.FogVolume]s relatively small and simple where possible.
 */
@GodotBaseType
public open class FogVolume : VisualInstance3D() {
  /**
   * Sets the size of the [godot.FogVolume] when [shape] is [godot.RenderingServer.FOG_VOLUME_SHAPE_ELLIPSOID], [godot.RenderingServer.FOG_VOLUME_SHAPE_CONE], [godot.RenderingServer.FOG_VOLUME_SHAPE_CYLINDER] or [godot.RenderingServer.FOG_VOLUME_SHAPE_BOX].
   *
   * **Note:** Thin fog volumes may appear to flicker when the camera moves or rotates. This can be alleviated by increasing [godot.ProjectSettings.rendering/environment/volumetricFog/volumeDepth] (at a performance cost) or by decreasing [godot.Environment.volumetricFogLength] (at no performance cost, but at the cost of lower fog range). Alternatively, the [godot.FogVolume] can be made thicker and use a lower density in the [material].
   *
   * **Note:** If [shape] is [godot.RenderingServer.FOG_VOLUME_SHAPE_CONE] or [godot.RenderingServer.FOG_VOLUME_SHAPE_CYLINDER], the cone/cylinder will be adjusted to fit within the extents. Non-uniform scaling of cone/cylinder shapes via the [extents] property is not supported, but you can scale the [godot.FogVolume] node instead.
   */
  public var extents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGVOLUME_GET_EXTENTS, VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGVOLUME_SET_EXTENTS, NIL.ordinal)
    }

  /**
   * Sets the shape of the [godot.FogVolume] to either [godot.RenderingServer.FOG_VOLUME_SHAPE_ELLIPSOID], [godot.RenderingServer.FOG_VOLUME_SHAPE_CONE], [godot.RenderingServer.FOG_VOLUME_SHAPE_CYLINDER], [godot.RenderingServer.FOG_VOLUME_SHAPE_BOX] or [godot.RenderingServer.FOG_VOLUME_SHAPE_WORLD].
   */
  public var shape: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGVOLUME_GET_SHAPE, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGVOLUME_SET_SHAPE, NIL.ordinal)
    }

  /**
   * Sets the [godot.Material] to be used by the [godot.FogVolume]. Can be either a [godot.FogMaterial] or a custom [godot.ShaderMaterial].
   */
  public var material: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGVOLUME_GET_MATERIAL, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Material?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGVOLUME_SET_MATERIAL, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_FOGVOLUME)
  }

  public companion object
}
