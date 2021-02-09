// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.AABB
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class GeometryInstance : VisualInstance() {
  open var castShadow: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_GET_CAST_SHADOW,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_SET_CAST_SHADOW,
          NIL)
    }

  open var extraCullMargin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_GET_EXTRA_CULL_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_SET_EXTRA_CULL_MARGIN, NIL)
    }

  open var lodMaxDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_GET_LOD_MAX_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_SET_LOD_MAX_DISTANCE, NIL)
    }

  open var lodMaxHysteresis: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_GET_LOD_MAX_HYSTERESIS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_SET_LOD_MAX_HYSTERESIS, NIL)
    }

  open var lodMinDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_GET_LOD_MIN_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_SET_LOD_MIN_DISTANCE, NIL)
    }

  open var lodMinHysteresis: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_GET_LOD_MIN_HYSTERESIS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_SET_LOD_MIN_HYSTERESIS, NIL)
    }

  open var materialOverride: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_GET_MATERIAL_OVERRIDE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Material?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_SET_MATERIAL_OVERRIDE, NIL)
    }

  open var useInBakedLight: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_GET_USE_IN_BAKED_LIGHT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_SET_USE_IN_BAKED_LIGHT, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_GEOMETRYINSTANCE)

  open fun setCustomAabb(aabb: AABB) {
    TransferContext.writeArguments(godot.core.VariantType.AABB to aabb)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_SET_CUSTOM_AABB,
        NIL)
  }

  enum class Flags(
    id: Long
  ) {
    FLAG_USE_BAKED_LIGHT(0),

    FLAG_DRAW_NEXT_FRAME_IF_VISIBLE(1),

    FLAG_MAX(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ShadowCastingSetting(
    id: Long
  ) {
    SHADOW_CASTING_SETTING_OFF(0),

    SHADOW_CASTING_SETTING_ON(1),

    SHADOW_CASTING_SETTING_DOUBLE_SIDED(2),

    SHADOW_CASTING_SETTING_SHADOWS_ONLY(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val FLAG_DRAW_NEXT_FRAME_IF_VISIBLE: Long = 1

    final const val FLAG_MAX: Long = 2

    final const val FLAG_USE_BAKED_LIGHT: Long = 0

    final const val SHADOW_CASTING_SETTING_DOUBLE_SIDED: Long = 2

    final const val SHADOW_CASTING_SETTING_OFF: Long = 0

    final const val SHADOW_CASTING_SETTING_ON: Long = 1

    final const val SHADOW_CASTING_SETTING_SHADOWS_ONLY: Long = 3
  }
}
