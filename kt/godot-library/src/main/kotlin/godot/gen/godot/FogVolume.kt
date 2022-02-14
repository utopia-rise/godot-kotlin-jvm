// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

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
   * Sets the size of the [godot.FogVolume] when [shape] is [godot.RenderingServer.FOG_VOLUME_SHAPE_ELLIPSOID] or [godot.RenderingServer.FOG_VOLUME_SHAPE_BOX].
   */
  public open var extents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGVOLUME_GET_EXTENTS, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGVOLUME_SET_EXTENTS, NIL)
    }

  /**
   * Sets the shape of the [godot.FogVolume] to either [godot.RenderingServer.FOG_VOLUME_SHAPE_ELLIPSOID], [godot.RenderingServer.FOG_VOLUME_SHAPE_BOX], or [godot.RenderingServer.FOG_VOLUME_SHAPE_ELLIPSOID] or [godot.RenderingServer.FOG_VOLUME_SHAPE_WORLD].
   */
  public open var shape: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGVOLUME_GET_SHAPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGVOLUME_SET_SHAPE, NIL)
    }

  /**
   * Sets the [godot.Material] to be used by the [godot.FogVolume]. Can be either a [godot.FogMaterial] or a custom [godot.ShaderMaterial].
   */
  public open var material: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGVOLUME_GET_MATERIAL, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Material?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGVOLUME_SET_MATERIAL, NIL)
      return TransferContext.readReturnValue(NIL, true) as Unit?
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_FOGVOLUME)
  }

  public companion object
}
