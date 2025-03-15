// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [FogVolume]s are used to add localized fog into the global volumetric fog effect. [FogVolume]s
 * can also remove volumetric fog from specific areas if using a [FogMaterial] with a negative
 * [FogMaterial.density].
 * Performance of [FogVolume]s is directly related to their relative size on the screen and the
 * complexity of their attached [FogMaterial]. It is best to keep [FogVolume]s relatively small and
 * simple where possible.
 * **Note:** [FogVolume]s only have a visible effect if [Environment.volumetricFogEnabled] is
 * `true`. If you don't want fog to be globally visible (but only within [FogVolume] nodes), set
 * [Environment.volumetricFogDensity] to `0.0`.
 */
@GodotBaseType
public open class FogVolume : VisualInstance3D() {
  /**
   * The size of the [FogVolume] when [shape] is [RenderingServer.FOG_VOLUME_SHAPE_ELLIPSOID],
   * [RenderingServer.FOG_VOLUME_SHAPE_CONE], [RenderingServer.FOG_VOLUME_SHAPE_CYLINDER] or
   * [RenderingServer.FOG_VOLUME_SHAPE_BOX].
   * **Note:** Thin fog volumes may appear to flicker when the camera moves or rotates. This can be
   * alleviated by increasing [ProjectSettings.rendering/environment/volumetricFog/volumeDepth] (at a
   * performance cost) or by decreasing [Environment.volumetricFogLength] (at no performance cost, but
   * at the cost of lower fog range). Alternatively, the [FogVolume] can be made thicker and use a
   * lower density in the [material].
   * **Note:** If [shape] is [RenderingServer.FOG_VOLUME_SHAPE_CONE] or
   * [RenderingServer.FOG_VOLUME_SHAPE_CYLINDER], the cone/cylinder will be adjusted to fit within the
   * size. Non-uniform scaling of cone/cylinder shapes via the [size] property is not supported, but
   * you can scale the [FogVolume] node instead.
   */
  @CoreTypeLocalCopy
  public final inline var size: Vector3
    @JvmName("sizeProperty")
    get() = getSize()
    @JvmName("sizeProperty")
    set(`value`) {
      setSize(value)
    }

  /**
   * The shape of the [FogVolume]. This can be set to either
   * [RenderingServer.FOG_VOLUME_SHAPE_ELLIPSOID], [RenderingServer.FOG_VOLUME_SHAPE_CONE],
   * [RenderingServer.FOG_VOLUME_SHAPE_CYLINDER], [RenderingServer.FOG_VOLUME_SHAPE_BOX] or
   * [RenderingServer.FOG_VOLUME_SHAPE_WORLD].
   */
  public final inline var shape: RenderingServer.FogVolumeShape
    @JvmName("shapeProperty")
    get() = getShape()
    @JvmName("shapeProperty")
    set(`value`) {
      setShape(value)
    }

  /**
   * The [Material] used by the [FogVolume]. Can be either a built-in [FogMaterial] or a custom
   * [ShaderMaterial].
   */
  public final inline var material: Material?
    @JvmName("materialProperty")
    get() = getMaterial()
    @JvmName("materialProperty")
    set(`value`) {
      setMaterial(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(216, scriptIndex)
  }

  /**
   * The size of the [FogVolume] when [shape] is [RenderingServer.FOG_VOLUME_SHAPE_ELLIPSOID],
   * [RenderingServer.FOG_VOLUME_SHAPE_CONE], [RenderingServer.FOG_VOLUME_SHAPE_CYLINDER] or
   * [RenderingServer.FOG_VOLUME_SHAPE_BOX].
   * **Note:** Thin fog volumes may appear to flicker when the camera moves or rotates. This can be
   * alleviated by increasing [ProjectSettings.rendering/environment/volumetricFog/volumeDepth] (at a
   * performance cost) or by decreasing [Environment.volumetricFogLength] (at no performance cost, but
   * at the cost of lower fog range). Alternatively, the [FogVolume] can be made thicker and use a
   * lower density in the [material].
   * **Note:** If [shape] is [RenderingServer.FOG_VOLUME_SHAPE_CONE] or
   * [RenderingServer.FOG_VOLUME_SHAPE_CYLINDER], the cone/cylinder will be adjusted to fit within the
   * size. Non-uniform scaling of cone/cylinder shapes via the [size] property is not supported, but
   * you can scale the [FogVolume] node instead.
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
  public final fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
      block(this)
      size = this
  }


  public final fun setSize(size: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to size)
    TransferContext.callMethod(ptr, MethodBindings.setSizePtr, NIL)
  }

  public final fun getSize(): Vector3 {
    TransferContext.callMethod(ptr, MethodBindings.getSizePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setShape(shape: RenderingServer.FogVolumeShape): Unit {
    TransferContext.writeArguments(LONG to shape.id)
    TransferContext.callMethod(ptr, MethodBindings.setShapePtr, NIL)
  }

  public final fun getShape(): RenderingServer.FogVolumeShape {
    TransferContext.callMethod(ptr, MethodBindings.getShapePtr, LONG)
    return RenderingServer.FogVolumeShape.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setMaterial(material: Material?): Unit {
    TransferContext.writeArguments(OBJECT to material)
    TransferContext.callMethod(ptr, MethodBindings.setMaterialPtr, NIL)
  }

  public final fun getMaterial(): Material? {
    TransferContext.callMethod(ptr, MethodBindings.getMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Material?)
  }

  public companion object

  public object MethodBindings {
    internal val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogVolume", "set_size", 3460891852)

    internal val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogVolume", "get_size", 3360562783)

    internal val setShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogVolume", "set_shape", 1416323362)

    internal val getShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogVolume", "get_shape", 3920334604)

    internal val setMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogVolume", "set_material", 2757459619)

    internal val getMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogVolume", "get_material", 5934680)
  }
}
