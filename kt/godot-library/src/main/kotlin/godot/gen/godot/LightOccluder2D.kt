// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Occludes light cast by a Light2D, casting shadows. The LightOccluder2D must be provided with an
 * [OccluderPolygon2D] in order for the shadow to be computed.
 */
@GodotBaseType
public open class LightOccluder2D : Node2D() {
  /**
   * The [OccluderPolygon2D] used to compute the shadow.
   */
  public var occluder: OccluderPolygon2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOccluderPolygonPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as OccluderPolygon2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOccluderPolygonPtr, NIL)
    }

  /**
   * If enabled, the occluder will be part of a real-time generated signed distance field that can
   * be used in custom shaders.
   */
  public var sdfCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSetAsSdfCollisionPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAsSdfCollisionPtr, NIL)
    }

  /**
   * The LightOccluder2D's occluder light mask. The LightOccluder2D will cast shadows only from
   * Light2D(s) that have the same light mask(s).
   */
  public var occluderLightMask: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOccluderLightMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setOccluderLightMaskPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_LIGHTOCCLUDER2D, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setOccluderPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightOccluder2D", "set_occluder_polygon")

    public val getOccluderPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightOccluder2D", "get_occluder_polygon")

    public val setOccluderLightMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightOccluder2D", "set_occluder_light_mask")

    public val getOccluderLightMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightOccluder2D", "get_occluder_light_mask")

    public val setAsSdfCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightOccluder2D", "set_as_sdf_collision")

    public val isSetAsSdfCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LightOccluder2D", "is_set_as_sdf_collision")
  }
}
