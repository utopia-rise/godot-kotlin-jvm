// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Occludes light cast by a Light2D, casting shadows.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/2d/2d_lights_and_shadows.html]($DOCS_URL/tutorials/2d/2d_lights_and_shadows.html)
 *
 * Occludes light cast by a Light2D, casting shadows. The LightOccluder2D must be provided with an [godot.OccluderPolygon2D] in order for the shadow to be computed.
 */
@GodotBaseType
public open class LightOccluder2D : Node2D() {
  /**
   * The [godot.OccluderPolygon2D] used to compute the shadow.
   */
  public open var occluder: OccluderPolygon2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTOCCLUDER2D_GET_OCCLUDER,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as OccluderPolygon2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTOCCLUDER2D_SET_OCCLUDER, NIL)
      return TransferContext.readReturnValue(NIL, true) as Unit?
    }

  /**
   *
   */
  public open var sdfCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTOCCLUDER2D_GET_SDF_COLLISION,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTOCCLUDER2D_SET_SDF_COLLISION,
          NIL)
    }

  /**
   * The LightOccluder2D's occluder light mask. The LightOccluder2D will cast shadows only from Light2D(s) that have the same light mask(s).
   */
  public open var occluderLightMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHTOCCLUDER2D_GET_OCCLUDER_LIGHT_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHTOCCLUDER2D_SET_OCCLUDER_LIGHT_MASK, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_LIGHTOCCLUDER2D)
  }

  public companion object
}
