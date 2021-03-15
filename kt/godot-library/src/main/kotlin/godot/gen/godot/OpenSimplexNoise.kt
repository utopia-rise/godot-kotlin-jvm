// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class OpenSimplexNoise : Resource() {
  open var lacunarity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENSIMPLEXNOISE_GET_LACUNARITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENSIMPLEXNOISE_SET_LACUNARITY,
          NIL)
    }

  open var octaves: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENSIMPLEXNOISE_GET_OCTAVES,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENSIMPLEXNOISE_SET_OCTAVES, NIL)
    }

  open var period: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENSIMPLEXNOISE_GET_PERIOD,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENSIMPLEXNOISE_SET_PERIOD, NIL)
    }

  open var persistence: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENSIMPLEXNOISE_GET_PERSISTENCE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENSIMPLEXNOISE_SET_PERSISTENCE,
          NIL)
    }

  open var seed: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENSIMPLEXNOISE_GET_SEED, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENSIMPLEXNOISE_SET_SEED, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_OPENSIMPLEXNOISE,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun getImage(width: Long, height: Long): Image? {
    TransferContext.writeArguments(LONG to width, LONG to height)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENSIMPLEXNOISE_GET_IMAGE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  open fun getNoise1d(x: Double): Double {
    TransferContext.writeArguments(DOUBLE to x)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENSIMPLEXNOISE_GET_NOISE_1D,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun getNoise2d(x: Double, y: Double): Double {
    TransferContext.writeArguments(DOUBLE to x, DOUBLE to y)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENSIMPLEXNOISE_GET_NOISE_2D,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun getNoise2dv(pos: Vector2): Double {
    TransferContext.writeArguments(VECTOR2 to pos)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENSIMPLEXNOISE_GET_NOISE_2DV,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun getNoise3d(
    x: Double,
    y: Double,
    z: Double
  ): Double {
    TransferContext.writeArguments(DOUBLE to x, DOUBLE to y, DOUBLE to z)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENSIMPLEXNOISE_GET_NOISE_3D,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun getNoise3dv(pos: Vector3): Double {
    TransferContext.writeArguments(VECTOR3 to pos)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENSIMPLEXNOISE_GET_NOISE_3DV,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun getNoise4d(
    x: Double,
    y: Double,
    z: Double,
    w: Double
  ): Double {
    TransferContext.writeArguments(DOUBLE to x, DOUBLE to y, DOUBLE to z, DOUBLE to w)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENSIMPLEXNOISE_GET_NOISE_4D,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun getSeamlessImage(size: Long): Image? {
    TransferContext.writeArguments(LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENSIMPLEXNOISE_GET_SEAMLESS_IMAGE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }
}
