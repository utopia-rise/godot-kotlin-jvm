// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * Occludes light cast by a Light2D, casting shadows. The LightOccluder2D must be provided with an [OccluderPolygon2D] in order for the shadow to be computed.
 */
@GodotBaseType
public open class LightOccluder2D : Node2D() {
  /**
   * The [OccluderPolygon2D] used to compute the shadow.
   */
  public final inline var occluder: OccluderPolygon2D?
    @JvmName("occluderProperty")
    get() = getOccluderPolygon()
    @JvmName("occluderProperty")
    set(`value`) {
      setOccluderPolygon(value)
    }

  /**
   * If enabled, the occluder will be part of a real-time generated signed distance field that can be used in custom shaders.
   */
  public final inline var sdfCollision: Boolean
    @JvmName("sdfCollisionProperty")
    get() = isSetAsSdfCollision()
    @JvmName("sdfCollisionProperty")
    set(`value`) {
      setAsSdfCollision(value)
    }

  /**
   * The LightOccluder2D's occluder light mask. The LightOccluder2D will cast shadows only from Light2D(s) that have the same light mask(s).
   */
  public final inline var occluderLightMask: Int
    @JvmName("occluderLightMaskProperty")
    get() = getOccluderLightMask()
    @JvmName("occluderLightMaskProperty")
    set(`value`) {
      setOccluderLightMask(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(333, scriptIndex)
  }

  public final fun setOccluderPolygon(polygon: OccluderPolygon2D?) {
    TransferContext.writeArguments(OBJECT to polygon)
    TransferContext.callMethod(ptr, MethodBindings.setOccluderPolygonPtr, NIL)
  }

  public final fun getOccluderPolygon(): OccluderPolygon2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOccluderPolygonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as OccluderPolygon2D?)
  }

  public final fun setOccluderLightMask(mask: Int) {
    TransferContext.writeArguments(LONG to mask.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setOccluderLightMaskPtr, NIL)
  }

  public final fun getOccluderLightMask(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOccluderLightMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setAsSdfCollision(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setAsSdfCollisionPtr, NIL)
  }

  public final fun isSetAsSdfCollision(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSetAsSdfCollisionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setOccluderPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightOccluder2D", "set_occluder_polygon", 3_258_315_893)

    internal val getOccluderPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightOccluder2D", "get_occluder_polygon", 3_962_317_075)

    internal val setOccluderLightMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightOccluder2D", "set_occluder_light_mask", 1_286_410_249)

    internal val getOccluderLightMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightOccluder2D", "get_occluder_light_mask", 3_905_245_786)

    internal val setAsSdfCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightOccluder2D", "set_as_sdf_collision", 2_586_408_642)

    internal val isSetAsSdfCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightOccluder2D", "is_set_as_sdf_collision", 36_873_697)
  }
}
