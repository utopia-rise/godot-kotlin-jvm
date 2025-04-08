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
import godot.core.PackedVector2Array
import godot.core.RID
import godot.core.Rect2i
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.RECT2I
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser._RID
import godot.core.Vector2
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This class is used by various XR interfaces to generate VRS textures that can be used to speed up
 * rendering.
 */
@GodotBaseType
public open class XRVRS : Object() {
  /**
   * The minimum radius around the focal point where full quality is guaranteed if VRS is used as a
   * percentage of screen size.
   */
  public final inline var vrsMinRadius: Float
    @JvmName("vrsMinRadiusProperty")
    get() = getVrsMinRadius()
    @JvmName("vrsMinRadiusProperty")
    set(`value`) {
      setVrsMinRadius(value)
    }

  /**
   * The strength used to calculate the VRS density map. The greater this value, the more noticeable
   * VRS is.
   */
  public final inline var vrsStrength: Float
    @JvmName("vrsStrengthProperty")
    get() = getVrsStrength()
    @JvmName("vrsStrengthProperty")
    set(`value`) {
      setVrsStrength(value)
    }

  /**
   * The render region that the VRS texture will be scaled to when generated.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var vrsRenderRegion: Rect2i
    @JvmName("vrsRenderRegionProperty")
    get() = getVrsRenderRegion()
    @JvmName("vrsRenderRegionProperty")
    set(`value`) {
      setVrsRenderRegion(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(876, scriptIndex)
  }

  /**
   * This is a helper function for [vrsRenderRegion] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = xrvrs.vrsRenderRegion
   * //Your changes
   * xrvrs.vrsRenderRegion = myCoreType
   * ``````
   *
   * The render region that the VRS texture will be scaled to when generated.
   */
  @CoreTypeHelper
  public final fun vrsRenderRegionMutate(block: Rect2i.() -> Unit): Rect2i = vrsRenderRegion.apply {
     block(this)
     vrsRenderRegion = this
  }

  public final fun getVrsMinRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVrsMinRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVrsMinRadius(radius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVrsMinRadiusPtr, NIL)
  }

  public final fun getVrsStrength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVrsStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVrsStrength(strength: Float): Unit {
    TransferContext.writeArguments(DOUBLE to strength.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVrsStrengthPtr, NIL)
  }

  public final fun getVrsRenderRegion(): Rect2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVrsRenderRegionPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I) as Rect2i)
  }

  public final fun setVrsRenderRegion(renderRegion: Rect2i): Unit {
    TransferContext.writeArguments(RECT2I to renderRegion)
    TransferContext.callMethod(ptr, MethodBindings.setVrsRenderRegionPtr, NIL)
  }

  /**
   * Generates the VRS texture based on a render [targetSize] adjusted by our VRS tile size. For
   * each eyes focal point passed in [eyeFoci] a layer is created. Focal point should be in NDC.
   *
   * The result will be cached, requesting a VRS texture with unchanged parameters and settings will
   * return the cached RID.
   */
  public final fun makeVrsTexture(targetSize: Vector2, eyeFoci: PackedVector2Array): RID {
    TransferContext.writeArguments(VECTOR2 to targetSize, PACKED_VECTOR2_ARRAY to eyeFoci)
    TransferContext.callMethod(ptr, MethodBindings.makeVrsTexturePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public companion object

  public object MethodBindings {
    internal val getVrsMinRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRVRS", "get_vrs_min_radius", 1740695150)

    internal val setVrsMinRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRVRS", "set_vrs_min_radius", 373806689)

    internal val getVrsStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRVRS", "get_vrs_strength", 1740695150)

    internal val setVrsStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRVRS", "set_vrs_strength", 373806689)

    internal val getVrsRenderRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRVRS", "get_vrs_render_region", 410525958)

    internal val setVrsRenderRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRVRS", "set_vrs_render_region", 1763793166)

    internal val makeVrsTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRVRS", "make_vrs_texture", 3647044786)
  }
}
