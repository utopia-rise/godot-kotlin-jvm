// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class Noise internal constructor() : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_NOISE)
  }

  public fun getNoise1d(x: Double): Double {
    TransferContext.writeArguments(DOUBLE to x)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_NOISE_GET_NOISE_1D, DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public fun getNoise2d(x: Double, y: Double): Double {
    TransferContext.writeArguments(DOUBLE to x, DOUBLE to y)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_NOISE_GET_NOISE_2D, DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public fun getNoise2dv(v: Vector2): Double {
    TransferContext.writeArguments(VECTOR2 to v)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_NOISE_GET_NOISE_2DV, DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public fun getNoise3d(
    x: Double,
    y: Double,
    z: Double
  ): Double {
    TransferContext.writeArguments(DOUBLE to x, DOUBLE to y, DOUBLE to z)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_NOISE_GET_NOISE_3D, DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public fun getNoise3dv(v: Vector3): Double {
    TransferContext.writeArguments(VECTOR3 to v)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_NOISE_GET_NOISE_3DV, DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public fun getImage(
    width: Long,
    height: Long,
    invert: Boolean = false
  ): Image? {
    TransferContext.writeArguments(LONG to width, LONG to height, BOOL to invert)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_NOISE_GET_IMAGE, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  public fun getSeamlessImage(
    width: Long,
    height: Long,
    invert: Boolean = false,
    skirt: Double = 0.1
  ): Image? {
    TransferContext.writeArguments(LONG to width, LONG to height, BOOL to invert, DOUBLE to skirt)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_NOISE_GET_SEAMLESS_IMAGE, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  public companion object
}
