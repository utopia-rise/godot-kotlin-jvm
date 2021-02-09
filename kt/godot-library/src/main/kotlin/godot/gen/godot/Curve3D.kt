// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.PoolRealArray
import godot.core.PoolVector3Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_REAL_ARRAY
import godot.core.VariantType.POOL_VECTOR3_ARRAY
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
open class Curve3D : Resource() {
  open var bakeInterval: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_BAKE_INTERVAL, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_SET_BAKE_INTERVAL, NIL)
    }

  open var upVectorEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_UP_VECTOR_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_SET_UP_VECTOR_ENABLED,
          NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_CURVE3D)

  open fun _getData(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_data is not implemented for Curve3D")
  }

  open fun _setData(arg0: Dictionary<Any?, Any?>) {
  }

  open fun addPoint(
    position: Vector3,
    _in: Vector3 = Vector3(0.0, 0.0, 0.0),
    out: Vector3 = Vector3(0.0, 0.0, 0.0),
    atPosition: Long = -1
  ) {
    TransferContext.writeArguments(VECTOR3 to position, VECTOR3 to _in, VECTOR3 to out, LONG to
        atPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_ADD_POINT, NIL)
  }

  open fun clearPoints() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_CLEAR_POINTS, NIL)
  }

  open fun getBakedLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_BAKED_LENGTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun getBakedPoints(): PoolVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_BAKED_POINTS,
        POOL_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
  }

  open fun getBakedTilts(): PoolRealArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_BAKED_TILTS,
        POOL_REAL_ARRAY)
    return TransferContext.readReturnValue(POOL_REAL_ARRAY, false) as PoolRealArray
  }

  open fun getBakedUpVectors(): PoolVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_BAKED_UP_VECTORS,
        POOL_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
  }

  open fun getClosestOffset(toPoint: Vector3): Double {
    TransferContext.writeArguments(VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_CLOSEST_OFFSET, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun getClosestPoint(toPoint: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_CLOSEST_POINT, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun getPointCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_POINT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getPointIn(idx: Long): Vector3 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_POINT_IN, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun getPointOut(idx: Long): Vector3 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_POINT_OUT, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun getPointPosition(idx: Long): Vector3 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_POINT_POSITION, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun getPointTilt(idx: Long): Double {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_GET_POINT_TILT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun interpolate(idx: Long, t: Double): Vector3 {
    TransferContext.writeArguments(LONG to idx, DOUBLE to t)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_INTERPOLATE, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun interpolateBaked(offset: Double, cubic: Boolean = false): Vector3 {
    TransferContext.writeArguments(DOUBLE to offset, BOOL to cubic)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_INTERPOLATE_BAKED, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun interpolateBakedUpVector(offset: Double, applyTilt: Boolean = false): Vector3 {
    TransferContext.writeArguments(DOUBLE to offset, BOOL to applyTilt)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_INTERPOLATE_BAKED_UP_VECTOR,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun interpolatef(fofs: Double): Vector3 {
    TransferContext.writeArguments(DOUBLE to fofs)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_INTERPOLATEF, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun removePoint(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_REMOVE_POINT, NIL)
  }

  open fun setPointIn(idx: Long, position: Vector3) {
    TransferContext.writeArguments(LONG to idx, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_SET_POINT_IN, NIL)
  }

  open fun setPointOut(idx: Long, position: Vector3) {
    TransferContext.writeArguments(LONG to idx, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_SET_POINT_OUT, NIL)
  }

  open fun setPointPosition(idx: Long, position: Vector3) {
    TransferContext.writeArguments(LONG to idx, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_SET_POINT_POSITION, NIL)
  }

  open fun setPointTilt(idx: Long, tilt: Double) {
    TransferContext.writeArguments(LONG to idx, DOUBLE to tilt)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_SET_POINT_TILT, NIL)
  }

  open fun tessellate(maxStages: Long = 5, toleranceDegrees: Double = 4.0): PoolVector3Array {
    TransferContext.writeArguments(LONG to maxStages, DOUBLE to toleranceDegrees)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE3D_TESSELLATE,
        POOL_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
  }
}
