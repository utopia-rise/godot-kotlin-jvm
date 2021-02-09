// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class Light : VisualInstance() {
  open var editorOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_EDITOR_ONLY, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_EDITOR_ONLY, NIL)
    }

  open var lightBakeMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_LIGHT_BAKE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_LIGHT_BAKE_MODE, NIL)
    }

  open var lightColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_LIGHT_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_LIGHT_COLOR, NIL)
    }

  open var lightCullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_LIGHT_CULL_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_LIGHT_CULL_MASK, NIL)
    }

  open var lightEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_LIGHT_ENERGY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_LIGHT_ENERGY, NIL)
    }

  open var lightIndirectEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_LIGHT_INDIRECT_ENERGY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_LIGHT_INDIRECT_ENERGY,
          NIL)
    }

  open var lightNegative: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_LIGHT_NEGATIVE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_LIGHT_NEGATIVE, NIL)
    }

  open var lightSpecular: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_LIGHT_SPECULAR, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_LIGHT_SPECULAR, NIL)
    }

  open var shadowBias: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_SHADOW_BIAS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_SHADOW_BIAS, NIL)
    }

  open var shadowColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_SHADOW_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_SHADOW_COLOR, NIL)
    }

  open var shadowContact: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_SHADOW_CONTACT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_SHADOW_CONTACT, NIL)
    }

  open var shadowEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_SHADOW_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_SHADOW_ENABLED, NIL)
    }

  open var shadowReverseCullFace: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHT_GET_SHADOW_REVERSE_CULL_FACE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHT_SET_SHADOW_REVERSE_CULL_FACE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_LIGHT)

  open fun lightColor(schedule: Color.() -> Unit): Color = lightColor.apply{
      schedule(this)
      lightColor = this
  }


  open fun shadowColor(schedule: Color.() -> Unit): Color = shadowColor.apply{
      schedule(this)
      shadowColor = this
  }


  enum class BakeMode(
    id: Long
  ) {
    BAKE_DISABLED(0),

    BAKE_INDIRECT(1),

    BAKE_ALL(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Param(
    id: Long
  ) {
    PARAM_ENERGY(0),

    PARAM_INDIRECT_ENERGY(1),

    PARAM_SPECULAR(2),

    PARAM_RANGE(3),

    PARAM_ATTENUATION(4),

    PARAM_SPOT_ANGLE(5),

    PARAM_SPOT_ATTENUATION(6),

    PARAM_CONTACT_SHADOW_SIZE(7),

    PARAM_SHADOW_MAX_DISTANCE(8),

    PARAM_SHADOW_SPLIT_1_OFFSET(9),

    PARAM_SHADOW_SPLIT_2_OFFSET(10),

    PARAM_SHADOW_SPLIT_3_OFFSET(11),

    PARAM_SHADOW_NORMAL_BIAS(12),

    PARAM_SHADOW_BIAS(13),

    PARAM_SHADOW_BIAS_SPLIT_SCALE(14),

    PARAM_MAX(15);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val BAKE_ALL: Long = 2

    final const val BAKE_DISABLED: Long = 0

    final const val BAKE_INDIRECT: Long = 1

    final const val PARAM_ATTENUATION: Long = 4

    final const val PARAM_CONTACT_SHADOW_SIZE: Long = 7

    final const val PARAM_ENERGY: Long = 0

    final const val PARAM_INDIRECT_ENERGY: Long = 1

    final const val PARAM_MAX: Long = 15

    final const val PARAM_RANGE: Long = 3

    final const val PARAM_SHADOW_BIAS: Long = 13

    final const val PARAM_SHADOW_BIAS_SPLIT_SCALE: Long = 14

    final const val PARAM_SHADOW_MAX_DISTANCE: Long = 8

    final const val PARAM_SHADOW_NORMAL_BIAS: Long = 12

    final const val PARAM_SHADOW_SPLIT_1_OFFSET: Long = 9

    final const val PARAM_SHADOW_SPLIT_2_OFFSET: Long = 10

    final const val PARAM_SHADOW_SPLIT_3_OFFSET: Long = 11

    final const val PARAM_SPECULAR: Long = 2

    final const val PARAM_SPOT_ANGLE: Long = 5

    final const val PARAM_SPOT_ATTENUATION: Long = 6
  }
}
