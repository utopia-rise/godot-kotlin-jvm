// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Long
import kotlin.Suppress

/**
 * Occludes light cast by a Light2D, casting shadows.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/2d/2d_lights_and_shadows.html](https://docs.godotengine.org/en/latest/tutorials/2d/2d_lights_and_shadows.html)
 *
 * Occludes light cast by a Light2D, casting shadows. The LightOccluder2D must be provided with an [godot.OccluderPolygon2D] in order for the shadow to be computed.
 */
@GodotBaseType
open class LightOccluder2D : Node2D() {
  /**
   * The LightOccluder2D's light mask. The LightOccluder2D will cast shadows only from Light2D(s) that have the same light mask(s).
   */
  override var lightMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTOCCLUDER2D_GET_LIGHT_MASK,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTOCCLUDER2D_SET_LIGHT_MASK,
          NIL)
    }

  /**
   * The [godot.OccluderPolygon2D] used to compute the shadow.
   */
  open var occluder: OccluderPolygon2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTOCCLUDER2D_GET_OCCLUDER,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as OccluderPolygon2D?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTOCCLUDER2D_SET_OCCLUDER, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_LIGHTOCCLUDER2D)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _polyChanged() {
  }
}
