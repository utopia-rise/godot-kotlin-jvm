// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.Curve
import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
open class Curve : Resource() {
  val rangeChanged: Signal0 by signal()

  open var bakeResolution: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_BAKE_RESOLUTION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_BAKE_RESOLUTION, NIL)
    }

  open var maxValue: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_MAX_VALUE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_MAX_VALUE, NIL)
    }

  open var minValue: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_MIN_VALUE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_MIN_VALUE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_CURVE)

  open fun _getData(): VariantArray<Any?> {
    throw NotImplementedError("_get_data is not implemented for Curve")
  }

  open fun _setData(data: VariantArray<Any?>) {
  }

  open fun addPoint(
    position: Vector2,
    leftTangent: Double = 0.0,
    rightTangent: Double = 0.0,
    leftMode: Long = 0,
    rightMode: Long = 0
  ): Long {
    TransferContext.writeArguments(VECTOR2 to position, DOUBLE to leftTangent, DOUBLE to
        rightTangent, LONG to leftMode, LONG to rightMode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_ADD_POINT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun bake() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_BAKE, NIL)
  }

  open fun cleanDupes() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_CLEAN_DUPES, NIL)
  }

  open fun clearPoints() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_CLEAR_POINTS, NIL)
  }

  open fun getPointCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_POINT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getPointLeftMode(index: Long): Curve.TangentMode {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_POINT_LEFT_MODE, LONG)
    return Curve.TangentMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun getPointLeftTangent(index: Long): Double {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_POINT_LEFT_TANGENT,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun getPointPosition(index: Long): Vector2 {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_POINT_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getPointRightMode(index: Long): Curve.TangentMode {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_POINT_RIGHT_MODE, LONG)
    return Curve.TangentMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun getPointRightTangent(index: Long): Double {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_GET_POINT_RIGHT_TANGENT,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun interpolate(offset: Double): Double {
    TransferContext.writeArguments(DOUBLE to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_INTERPOLATE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun interpolateBaked(offset: Double): Double {
    TransferContext.writeArguments(DOUBLE to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_INTERPOLATE_BAKED, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun removePoint(index: Long) {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_REMOVE_POINT, NIL)
  }

  open fun setPointLeftMode(index: Long, mode: Long) {
    TransferContext.writeArguments(LONG to index, LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_POINT_LEFT_MODE, NIL)
  }

  open fun setPointLeftTangent(index: Long, tangent: Double) {
    TransferContext.writeArguments(LONG to index, DOUBLE to tangent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_POINT_LEFT_TANGENT, NIL)
  }

  open fun setPointOffset(index: Long, offset: Double): Long {
    TransferContext.writeArguments(LONG to index, DOUBLE to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_POINT_OFFSET, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun setPointRightMode(index: Long, mode: Long) {
    TransferContext.writeArguments(LONG to index, LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_POINT_RIGHT_MODE, NIL)
  }

  open fun setPointRightTangent(index: Long, tangent: Double) {
    TransferContext.writeArguments(LONG to index, DOUBLE to tangent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_POINT_RIGHT_TANGENT, NIL)
  }

  open fun setPointValue(index: Long, y: Double) {
    TransferContext.writeArguments(LONG to index, DOUBLE to y)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVE_SET_POINT_VALUE, NIL)
  }

  enum class TangentMode(
    id: Long
  ) {
    TANGENT_FREE(0),

    TANGENT_LINEAR(1),

    TANGENT_MODE_COUNT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val TANGENT_FREE: Long = 0

    final const val TANGENT_LINEAR: Long = 1

    final const val TANGENT_MODE_COUNT: Long = 2
  }
}
