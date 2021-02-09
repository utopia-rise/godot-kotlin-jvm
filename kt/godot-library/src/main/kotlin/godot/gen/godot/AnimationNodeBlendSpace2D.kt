// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolIntArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class AnimationNodeBlendSpace2D : AnimationRootNode() {
  val trianglesUpdated: Signal0 by signal()

  open var autoTriangles: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_AUTO_TRIANGLES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_AUTO_TRIANGLES, NIL)
    }

  open var blendMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_MODE, NIL)
    }

  open val blendPoint0_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_0_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint0_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_0_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_0_POS, NIL)
    }

  open val blendPoint1_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_1_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint1_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_1_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_1_POS, NIL)
    }

  open val blendPoint10_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_10_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint10_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_10_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_10_POS, NIL)
    }

  open val blendPoint11_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_11_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint11_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_11_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_11_POS, NIL)
    }

  open val blendPoint12_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_12_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint12_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_12_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_12_POS, NIL)
    }

  open val blendPoint13_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_13_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint13_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_13_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_13_POS, NIL)
    }

  open val blendPoint14_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_14_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint14_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_14_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_14_POS, NIL)
    }

  open val blendPoint15_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_15_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint15_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_15_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_15_POS, NIL)
    }

  open val blendPoint16_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_16_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint16_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_16_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_16_POS, NIL)
    }

  open val blendPoint17_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_17_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint17_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_17_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_17_POS, NIL)
    }

  open val blendPoint18_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_18_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint18_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_18_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_18_POS, NIL)
    }

  open val blendPoint19_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_19_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint19_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_19_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_19_POS, NIL)
    }

  open val blendPoint2_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_2_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint2_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_2_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_2_POS, NIL)
    }

  open val blendPoint20_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_20_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint20_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_20_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_20_POS, NIL)
    }

  open val blendPoint21_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_21_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint21_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_21_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_21_POS, NIL)
    }

  open val blendPoint22_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_22_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint22_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_22_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_22_POS, NIL)
    }

  open val blendPoint23_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_23_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint23_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_23_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_23_POS, NIL)
    }

  open val blendPoint24_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_24_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint24_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_24_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_24_POS, NIL)
    }

  open val blendPoint25_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_25_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint25_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_25_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_25_POS, NIL)
    }

  open val blendPoint26_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_26_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint26_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_26_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_26_POS, NIL)
    }

  open val blendPoint27_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_27_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint27_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_27_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_27_POS, NIL)
    }

  open val blendPoint28_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_28_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint28_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_28_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_28_POS, NIL)
    }

  open val blendPoint29_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_29_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint29_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_29_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_29_POS, NIL)
    }

  open val blendPoint3_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_3_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint3_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_3_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_3_POS, NIL)
    }

  open val blendPoint30_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_30_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint30_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_30_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_30_POS, NIL)
    }

  open val blendPoint31_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_31_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint31_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_31_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_31_POS, NIL)
    }

  open val blendPoint32_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_32_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint32_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_32_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_32_POS, NIL)
    }

  open val blendPoint33_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_33_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint33_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_33_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_33_POS, NIL)
    }

  open val blendPoint34_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_34_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint34_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_34_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_34_POS, NIL)
    }

  open val blendPoint35_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_35_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint35_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_35_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_35_POS, NIL)
    }

  open val blendPoint36_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_36_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint36_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_36_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_36_POS, NIL)
    }

  open val blendPoint37_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_37_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint37_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_37_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_37_POS, NIL)
    }

  open val blendPoint38_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_38_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint38_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_38_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_38_POS, NIL)
    }

  open val blendPoint39_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_39_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint39_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_39_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_39_POS, NIL)
    }

  open val blendPoint4_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_4_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint4_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_4_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_4_POS, NIL)
    }

  open val blendPoint40_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_40_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint40_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_40_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_40_POS, NIL)
    }

  open val blendPoint41_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_41_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint41_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_41_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_41_POS, NIL)
    }

  open val blendPoint42_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_42_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint42_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_42_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_42_POS, NIL)
    }

  open val blendPoint43_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_43_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint43_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_43_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_43_POS, NIL)
    }

  open val blendPoint44_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_44_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint44_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_44_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_44_POS, NIL)
    }

  open val blendPoint45_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_45_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint45_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_45_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_45_POS, NIL)
    }

  open val blendPoint46_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_46_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint46_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_46_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_46_POS, NIL)
    }

  open val blendPoint47_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_47_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint47_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_47_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_47_POS, NIL)
    }

  open val blendPoint48_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_48_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint48_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_48_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_48_POS, NIL)
    }

  open val blendPoint49_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_49_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint49_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_49_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_49_POS, NIL)
    }

  open val blendPoint5_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_5_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint5_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_5_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_5_POS, NIL)
    }

  open val blendPoint50_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_50_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint50_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_50_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_50_POS, NIL)
    }

  open val blendPoint51_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_51_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint51_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_51_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_51_POS, NIL)
    }

  open val blendPoint52_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_52_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint52_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_52_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_52_POS, NIL)
    }

  open val blendPoint53_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_53_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint53_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_53_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_53_POS, NIL)
    }

  open val blendPoint54_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_54_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint54_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_54_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_54_POS, NIL)
    }

  open val blendPoint55_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_55_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint55_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_55_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_55_POS, NIL)
    }

  open val blendPoint56_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_56_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint56_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_56_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_56_POS, NIL)
    }

  open val blendPoint57_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_57_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint57_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_57_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_57_POS, NIL)
    }

  open val blendPoint58_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_58_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint58_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_58_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_58_POS, NIL)
    }

  open val blendPoint59_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_59_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint59_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_59_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_59_POS, NIL)
    }

  open val blendPoint6_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_6_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint6_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_6_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_6_POS, NIL)
    }

  open val blendPoint60_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_60_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint60_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_60_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_60_POS, NIL)
    }

  open val blendPoint61_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_61_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint61_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_61_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_61_POS, NIL)
    }

  open val blendPoint62_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_62_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint62_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_62_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_62_POS, NIL)
    }

  open val blendPoint63_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_63_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint63_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_63_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_63_POS, NIL)
    }

  open val blendPoint7_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_7_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint7_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_7_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_7_POS, NIL)
    }

  open val blendPoint8_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_8_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint8_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_8_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_8_POS, NIL)
    }

  open val blendPoint9_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_9_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  open var blendPoint9_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_9_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_9_POS, NIL)
    }

  open var maxSpace: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_MAX_SPACE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_MAX_SPACE, NIL)
    }

  open var minSpace: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_MIN_SPACE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_MIN_SPACE, NIL)
    }

  open var snap: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_SNAP, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_SNAP, NIL)
    }

  open var xLabel: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_X_LABEL, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_X_LABEL, NIL)
    }

  open var yLabel: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_Y_LABEL, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_Y_LABEL, NIL)
    }

  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_ANIMATIONNODEBLENDSPACE2D)

  open fun blendPoint0_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint0_pos.apply{
      schedule(this)
      blendPoint0_pos = this
  }


  open fun blendPoint1_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint1_pos.apply{
      schedule(this)
      blendPoint1_pos = this
  }


  open fun blendPoint10_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint10_pos.apply{
      schedule(this)
      blendPoint10_pos = this
  }


  open fun blendPoint11_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint11_pos.apply{
      schedule(this)
      blendPoint11_pos = this
  }


  open fun blendPoint12_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint12_pos.apply{
      schedule(this)
      blendPoint12_pos = this
  }


  open fun blendPoint13_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint13_pos.apply{
      schedule(this)
      blendPoint13_pos = this
  }


  open fun blendPoint14_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint14_pos.apply{
      schedule(this)
      blendPoint14_pos = this
  }


  open fun blendPoint15_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint15_pos.apply{
      schedule(this)
      blendPoint15_pos = this
  }


  open fun blendPoint16_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint16_pos.apply{
      schedule(this)
      blendPoint16_pos = this
  }


  open fun blendPoint17_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint17_pos.apply{
      schedule(this)
      blendPoint17_pos = this
  }


  open fun blendPoint18_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint18_pos.apply{
      schedule(this)
      blendPoint18_pos = this
  }


  open fun blendPoint19_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint19_pos.apply{
      schedule(this)
      blendPoint19_pos = this
  }


  open fun blendPoint2_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint2_pos.apply{
      schedule(this)
      blendPoint2_pos = this
  }


  open fun blendPoint20_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint20_pos.apply{
      schedule(this)
      blendPoint20_pos = this
  }


  open fun blendPoint21_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint21_pos.apply{
      schedule(this)
      blendPoint21_pos = this
  }


  open fun blendPoint22_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint22_pos.apply{
      schedule(this)
      blendPoint22_pos = this
  }


  open fun blendPoint23_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint23_pos.apply{
      schedule(this)
      blendPoint23_pos = this
  }


  open fun blendPoint24_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint24_pos.apply{
      schedule(this)
      blendPoint24_pos = this
  }


  open fun blendPoint25_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint25_pos.apply{
      schedule(this)
      blendPoint25_pos = this
  }


  open fun blendPoint26_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint26_pos.apply{
      schedule(this)
      blendPoint26_pos = this
  }


  open fun blendPoint27_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint27_pos.apply{
      schedule(this)
      blendPoint27_pos = this
  }


  open fun blendPoint28_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint28_pos.apply{
      schedule(this)
      blendPoint28_pos = this
  }


  open fun blendPoint29_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint29_pos.apply{
      schedule(this)
      blendPoint29_pos = this
  }


  open fun blendPoint3_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint3_pos.apply{
      schedule(this)
      blendPoint3_pos = this
  }


  open fun blendPoint30_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint30_pos.apply{
      schedule(this)
      blendPoint30_pos = this
  }


  open fun blendPoint31_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint31_pos.apply{
      schedule(this)
      blendPoint31_pos = this
  }


  open fun blendPoint32_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint32_pos.apply{
      schedule(this)
      blendPoint32_pos = this
  }


  open fun blendPoint33_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint33_pos.apply{
      schedule(this)
      blendPoint33_pos = this
  }


  open fun blendPoint34_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint34_pos.apply{
      schedule(this)
      blendPoint34_pos = this
  }


  open fun blendPoint35_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint35_pos.apply{
      schedule(this)
      blendPoint35_pos = this
  }


  open fun blendPoint36_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint36_pos.apply{
      schedule(this)
      blendPoint36_pos = this
  }


  open fun blendPoint37_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint37_pos.apply{
      schedule(this)
      blendPoint37_pos = this
  }


  open fun blendPoint38_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint38_pos.apply{
      schedule(this)
      blendPoint38_pos = this
  }


  open fun blendPoint39_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint39_pos.apply{
      schedule(this)
      blendPoint39_pos = this
  }


  open fun blendPoint4_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint4_pos.apply{
      schedule(this)
      blendPoint4_pos = this
  }


  open fun blendPoint40_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint40_pos.apply{
      schedule(this)
      blendPoint40_pos = this
  }


  open fun blendPoint41_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint41_pos.apply{
      schedule(this)
      blendPoint41_pos = this
  }


  open fun blendPoint42_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint42_pos.apply{
      schedule(this)
      blendPoint42_pos = this
  }


  open fun blendPoint43_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint43_pos.apply{
      schedule(this)
      blendPoint43_pos = this
  }


  open fun blendPoint44_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint44_pos.apply{
      schedule(this)
      blendPoint44_pos = this
  }


  open fun blendPoint45_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint45_pos.apply{
      schedule(this)
      blendPoint45_pos = this
  }


  open fun blendPoint46_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint46_pos.apply{
      schedule(this)
      blendPoint46_pos = this
  }


  open fun blendPoint47_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint47_pos.apply{
      schedule(this)
      blendPoint47_pos = this
  }


  open fun blendPoint48_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint48_pos.apply{
      schedule(this)
      blendPoint48_pos = this
  }


  open fun blendPoint49_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint49_pos.apply{
      schedule(this)
      blendPoint49_pos = this
  }


  open fun blendPoint5_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint5_pos.apply{
      schedule(this)
      blendPoint5_pos = this
  }


  open fun blendPoint50_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint50_pos.apply{
      schedule(this)
      blendPoint50_pos = this
  }


  open fun blendPoint51_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint51_pos.apply{
      schedule(this)
      blendPoint51_pos = this
  }


  open fun blendPoint52_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint52_pos.apply{
      schedule(this)
      blendPoint52_pos = this
  }


  open fun blendPoint53_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint53_pos.apply{
      schedule(this)
      blendPoint53_pos = this
  }


  open fun blendPoint54_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint54_pos.apply{
      schedule(this)
      blendPoint54_pos = this
  }


  open fun blendPoint55_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint55_pos.apply{
      schedule(this)
      blendPoint55_pos = this
  }


  open fun blendPoint56_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint56_pos.apply{
      schedule(this)
      blendPoint56_pos = this
  }


  open fun blendPoint57_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint57_pos.apply{
      schedule(this)
      blendPoint57_pos = this
  }


  open fun blendPoint58_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint58_pos.apply{
      schedule(this)
      blendPoint58_pos = this
  }


  open fun blendPoint59_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint59_pos.apply{
      schedule(this)
      blendPoint59_pos = this
  }


  open fun blendPoint6_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint6_pos.apply{
      schedule(this)
      blendPoint6_pos = this
  }


  open fun blendPoint60_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint60_pos.apply{
      schedule(this)
      blendPoint60_pos = this
  }


  open fun blendPoint61_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint61_pos.apply{
      schedule(this)
      blendPoint61_pos = this
  }


  open fun blendPoint62_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint62_pos.apply{
      schedule(this)
      blendPoint62_pos = this
  }


  open fun blendPoint63_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint63_pos.apply{
      schedule(this)
      blendPoint63_pos = this
  }


  open fun blendPoint7_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint7_pos.apply{
      schedule(this)
      blendPoint7_pos = this
  }


  open fun blendPoint8_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint8_pos.apply{
      schedule(this)
      blendPoint8_pos = this
  }


  open fun blendPoint9_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint9_pos.apply{
      schedule(this)
      blendPoint9_pos = this
  }


  open fun maxSpace(schedule: Vector2.() -> Unit): Vector2 = maxSpace.apply{
      schedule(this)
      maxSpace = this
  }


  open fun minSpace(schedule: Vector2.() -> Unit): Vector2 = minSpace.apply{
      schedule(this)
      minSpace = this
  }


  open fun snap(schedule: Vector2.() -> Unit): Vector2 = snap.apply{
      schedule(this)
      snap = this
  }


  open fun _addBlendPoint(index: Long, node: AnimationRootNode) {
  }

  open fun _getTriangles(): PoolIntArray {
    throw NotImplementedError("_get_triangles is not implemented for AnimationNodeBlendSpace2D")
  }

  open fun _setTriangles(triangles: PoolIntArray) {
  }

  open fun _treeChanged() {
  }

  open fun _updateTriangles() {
  }

  open fun addBlendPoint(
    node: AnimationRootNode,
    pos: Vector2,
    atIndex: Long = -1
  ) {
    TransferContext.writeArguments(OBJECT to node, VECTOR2 to pos, LONG to atIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_ADD_BLEND_POINT, NIL)
  }

  open fun addTriangle(
    x: Long,
    y: Long,
    z: Long,
    atIndex: Long = -1
  ) {
    TransferContext.writeArguments(LONG to x, LONG to y, LONG to z, LONG to atIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_ADD_TRIANGLE, NIL)
  }

  open fun getBlendPointCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getTriangleCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_TRIANGLE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getTrianglePoint(triangle: Long, point: Long): Long {
    TransferContext.writeArguments(LONG to triangle, LONG to point)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_TRIANGLE_POINT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun removeBlendPoint(point: Long) {
    TransferContext.writeArguments(LONG to point)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_REMOVE_BLEND_POINT, NIL)
  }

  open fun removeTriangle(triangle: Long) {
    TransferContext.writeArguments(LONG to triangle)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_REMOVE_TRIANGLE, NIL)
  }

  open fun setBlendPointNode(point: Long, node: AnimationRootNode) {
    TransferContext.writeArguments(LONG to point, OBJECT to node)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_NODE, NIL)
  }

  enum class BlendMode(
    id: Long
  ) {
    BLEND_MODE_INTERPOLATED(0),

    BLEND_MODE_DISCRETE(1),

    BLEND_MODE_DISCRETE_CARRY(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val BLEND_MODE_DISCRETE: Long = 1

    final const val BLEND_MODE_DISCRETE_CARRY: Long = 2

    final const val BLEND_MODE_INTERPOLATED: Long = 0
  }
}
