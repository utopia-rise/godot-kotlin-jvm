// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class ProceduralSky : Sky() {
  open var groundBottomColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_GROUND_BOTTOM_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_GROUND_BOTTOM_COLOR, NIL)
    }

  open var groundCurve: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_GROUND_CURVE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_GROUND_CURVE,
          NIL)
    }

  open var groundEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_GROUND_ENERGY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_GROUND_ENERGY,
          NIL)
    }

  open var groundHorizonColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_GROUND_HORIZON_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_GROUND_HORIZON_COLOR, NIL)
    }

  open var skyCurve: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_SKY_CURVE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_SKY_CURVE, NIL)
    }

  open var skyEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_SKY_ENERGY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_SKY_ENERGY, NIL)
    }

  open var skyHorizonColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_SKY_HORIZON_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_SKY_HORIZON_COLOR, NIL)
    }

  open var skyTopColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_SKY_TOP_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_SKY_TOP_COLOR,
          NIL)
    }

  open var sunAngleMax: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_SUN_ANGLE_MAX,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_SUN_ANGLE_MAX,
          NIL)
    }

  open var sunAngleMin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_SUN_ANGLE_MIN,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_SUN_ANGLE_MIN,
          NIL)
    }

  open var sunColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_SUN_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_SUN_COLOR, NIL)
    }

  open var sunCurve: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_SUN_CURVE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_SUN_CURVE, NIL)
    }

  open var sunEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_SUN_ENERGY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_SUN_ENERGY, NIL)
    }

  open var sunLatitude: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_SUN_LATITUDE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_SUN_LATITUDE,
          NIL)
    }

  open var sunLongitude: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_SUN_LONGITUDE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_SUN_LONGITUDE,
          NIL)
    }

  open var textureSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_TEXTURE_SIZE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_TEXTURE_SIZE,
          NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_PROCEDURALSKY)

  open fun groundBottomColor(schedule: Color.() -> Unit): Color = groundBottomColor.apply{
      schedule(this)
      groundBottomColor = this
  }


  open fun groundHorizonColor(schedule: Color.() -> Unit): Color = groundHorizonColor.apply{
      schedule(this)
      groundHorizonColor = this
  }


  open fun skyHorizonColor(schedule: Color.() -> Unit): Color = skyHorizonColor.apply{
      schedule(this)
      skyHorizonColor = this
  }


  open fun skyTopColor(schedule: Color.() -> Unit): Color = skyTopColor.apply{
      schedule(this)
      skyTopColor = this
  }


  open fun sunColor(schedule: Color.() -> Unit): Color = sunColor.apply{
      schedule(this)
      sunColor = this
  }


  open fun _threadDone(image: Image) {
  }

  open fun _updateSky() {
  }

  enum class TextureSize(
    id: Long
  ) {
    TEXTURE_SIZE_256(0),

    TEXTURE_SIZE_512(1),

    TEXTURE_SIZE_1024(2),

    TEXTURE_SIZE_2048(3),

    TEXTURE_SIZE_4096(4),

    TEXTURE_SIZE_MAX(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val TEXTURE_SIZE_1024: Long = 2

    final const val TEXTURE_SIZE_2048: Long = 3

    final const val TEXTURE_SIZE_256: Long = 0

    final const val TEXTURE_SIZE_4096: Long = 4

    final const val TEXTURE_SIZE_512: Long = 1

    final const val TEXTURE_SIZE_MAX: Long = 5
  }
}
