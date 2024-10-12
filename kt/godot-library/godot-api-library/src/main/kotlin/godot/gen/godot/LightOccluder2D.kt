// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_LIGHTOCCLUDER2D_INDEX: Int = 350

/**
 * Occludes light cast by a Light2D, casting shadows. The LightOccluder2D must be provided with an
 * [OccluderPolygon2D] in order for the shadow to be computed.
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
   * If enabled, the occluder will be part of a real-time generated signed distance field that can
   * be used in custom shaders.
   */
  public final inline var sdfCollision: Boolean
    @JvmName("sdfCollisionProperty")
    get() = isSetAsSdfCollision()
    @JvmName("sdfCollisionProperty")
    set(`value`) {
      setAsSdfCollision(value)
    }

  /**
   * The LightOccluder2D's occluder light mask. The LightOccluder2D will cast shadows only from
   * Light2D(s) that have the same light mask(s).
   */
  public final inline var occluderLightMask: Int
    @JvmName("occluderLightMaskProperty")
    get() = getOccluderLightMask()
    @JvmName("occluderLightMaskProperty")
    set(`value`) {
      setOccluderLightMask(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_LIGHTOCCLUDER2D_INDEX, scriptIndex)
  }

  public final fun setOccluderPolygon(polygon: OccluderPolygon2D?): Unit {
    Internals.writeArguments(OBJECT to polygon)
    Internals.callMethod(rawPtr, MethodBindings.setOccluderPolygonPtr, NIL)
  }

  public final fun getOccluderPolygon(): OccluderPolygon2D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOccluderPolygonPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as OccluderPolygon2D?)
  }

  public final fun setOccluderLightMask(mask: Int): Unit {
    Internals.writeArguments(LONG to mask.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setOccluderLightMaskPtr, NIL)
  }

  public final fun getOccluderLightMask(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOccluderLightMaskPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setAsSdfCollision(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setAsSdfCollisionPtr, NIL)
  }

  public final fun isSetAsSdfCollision(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isSetAsSdfCollisionPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setOccluderPolygonPtr: VoidPtr =
        Internals.getMethodBindPtr("LightOccluder2D", "set_occluder_polygon", 3258315893)

    internal val getOccluderPolygonPtr: VoidPtr =
        Internals.getMethodBindPtr("LightOccluder2D", "get_occluder_polygon", 3962317075)

    internal val setOccluderLightMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("LightOccluder2D", "set_occluder_light_mask", 1286410249)

    internal val getOccluderLightMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("LightOccluder2D", "get_occluder_light_mask", 3905245786)

    internal val setAsSdfCollisionPtr: VoidPtr =
        Internals.getMethodBindPtr("LightOccluder2D", "set_as_sdf_collision", 2586408642)

    internal val isSetAsSdfCollisionPtr: VoidPtr =
        Internals.getMethodBindPtr("LightOccluder2D", "is_set_as_sdf_collision", 36873697)
  }
}
