// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
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
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Blends linearly between three [godot.AnimationNode] of any type placed in a 2D space.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * A resource to add to an [godot.AnimationNodeBlendTree].
 *
 * This node allows you to blend linearly between three animations using a [godot.core.Vector2] weight.
 *
 * You can add vertices to the blend space with [addBlendPoint] and automatically triangulate it by setting [autoTriangles] to `true`. Otherwise, use [addTriangle] and [removeTriangle] to create up the blend space by hand.
 */
@GodotBaseType
public open class AnimationNodeBlendSpace2D : AnimationRootNode() {
  /**
   * Emitted every time the blend space's triangles are created, removed, or when one of their vertices changes position.
   */
  public val trianglesUpdated: Signal0 by signal()

  /**
   * If `true`, the blend space is triangulated automatically. The mesh updates every time you add or remove points with [addBlendPoint] and [removeBlendPoint].
   */
  public open var autoTriangles: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_AUTO_TRIANGLES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_AUTO_TRIANGLES, NIL)
    }

  /**
   * Controls the interpolation between animations. See [enum BlendMode] constants.
   */
  public open var blendMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_MODE, NIL)
    }

  public open val blendPoint0_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_0_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint0_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_0_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_0_POS, NIL)
    }

  public open val blendPoint1_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_1_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint1_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_1_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_1_POS, NIL)
    }

  public open val blendPoint10_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_10_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint10_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_10_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_10_POS, NIL)
    }

  public open val blendPoint11_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_11_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint11_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_11_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 11L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_11_POS, NIL)
    }

  public open val blendPoint12_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 12L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_12_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint12_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 12L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_12_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 12L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_12_POS, NIL)
    }

  public open val blendPoint13_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 13L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_13_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint13_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 13L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_13_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 13L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_13_POS, NIL)
    }

  public open val blendPoint14_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 14L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_14_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint14_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 14L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_14_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 14L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_14_POS, NIL)
    }

  public open val blendPoint15_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 15L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_15_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint15_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 15L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_15_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 15L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_15_POS, NIL)
    }

  public open val blendPoint16_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 16L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_16_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint16_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 16L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_16_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 16L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_16_POS, NIL)
    }

  public open val blendPoint17_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 17L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_17_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint17_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 17L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_17_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 17L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_17_POS, NIL)
    }

  public open val blendPoint18_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 18L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_18_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint18_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 18L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_18_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 18L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_18_POS, NIL)
    }

  public open val blendPoint19_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 19L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_19_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint19_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 19L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_19_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 19L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_19_POS, NIL)
    }

  public open val blendPoint2_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_2_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint2_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_2_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_2_POS, NIL)
    }

  public open val blendPoint20_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 20L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_20_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint20_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 20L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_20_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 20L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_20_POS, NIL)
    }

  public open val blendPoint21_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 21L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_21_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint21_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 21L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_21_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 21L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_21_POS, NIL)
    }

  public open val blendPoint22_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 22L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_22_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint22_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 22L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_22_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 22L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_22_POS, NIL)
    }

  public open val blendPoint23_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 23L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_23_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint23_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 23L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_23_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 23L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_23_POS, NIL)
    }

  public open val blendPoint24_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 24L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_24_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint24_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 24L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_24_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 24L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_24_POS, NIL)
    }

  public open val blendPoint25_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 25L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_25_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint25_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 25L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_25_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 25L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_25_POS, NIL)
    }

  public open val blendPoint26_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 26L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_26_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint26_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 26L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_26_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 26L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_26_POS, NIL)
    }

  public open val blendPoint27_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 27L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_27_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint27_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 27L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_27_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 27L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_27_POS, NIL)
    }

  public open val blendPoint28_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 28L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_28_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint28_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 28L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_28_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 28L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_28_POS, NIL)
    }

  public open val blendPoint29_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 29L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_29_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint29_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 29L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_29_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 29L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_29_POS, NIL)
    }

  public open val blendPoint3_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_3_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint3_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_3_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_3_POS, NIL)
    }

  public open val blendPoint30_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 30L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_30_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint30_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 30L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_30_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 30L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_30_POS, NIL)
    }

  public open val blendPoint31_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 31L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_31_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint31_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 31L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_31_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 31L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_31_POS, NIL)
    }

  public open val blendPoint32_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 32L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_32_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint32_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 32L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_32_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 32L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_32_POS, NIL)
    }

  public open val blendPoint33_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 33L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_33_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint33_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 33L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_33_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 33L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_33_POS, NIL)
    }

  public open val blendPoint34_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 34L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_34_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint34_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 34L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_34_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 34L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_34_POS, NIL)
    }

  public open val blendPoint35_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 35L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_35_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint35_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 35L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_35_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 35L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_35_POS, NIL)
    }

  public open val blendPoint36_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 36L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_36_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint36_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 36L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_36_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 36L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_36_POS, NIL)
    }

  public open val blendPoint37_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 37L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_37_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint37_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 37L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_37_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 37L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_37_POS, NIL)
    }

  public open val blendPoint38_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 38L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_38_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint38_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 38L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_38_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 38L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_38_POS, NIL)
    }

  public open val blendPoint39_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 39L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_39_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint39_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 39L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_39_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 39L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_39_POS, NIL)
    }

  public open val blendPoint4_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_4_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint4_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_4_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_4_POS, NIL)
    }

  public open val blendPoint40_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 40L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_40_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint40_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 40L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_40_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 40L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_40_POS, NIL)
    }

  public open val blendPoint41_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 41L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_41_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint41_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 41L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_41_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 41L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_41_POS, NIL)
    }

  public open val blendPoint42_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 42L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_42_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint42_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 42L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_42_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 42L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_42_POS, NIL)
    }

  public open val blendPoint43_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 43L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_43_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint43_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 43L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_43_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 43L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_43_POS, NIL)
    }

  public open val blendPoint44_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 44L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_44_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint44_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 44L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_44_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 44L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_44_POS, NIL)
    }

  public open val blendPoint45_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 45L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_45_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint45_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 45L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_45_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 45L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_45_POS, NIL)
    }

  public open val blendPoint46_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 46L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_46_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint46_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 46L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_46_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 46L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_46_POS, NIL)
    }

  public open val blendPoint47_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 47L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_47_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint47_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 47L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_47_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 47L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_47_POS, NIL)
    }

  public open val blendPoint48_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 48L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_48_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint48_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 48L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_48_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 48L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_48_POS, NIL)
    }

  public open val blendPoint49_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 49L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_49_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint49_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 49L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_49_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 49L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_49_POS, NIL)
    }

  public open val blendPoint5_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_5_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint5_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_5_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_5_POS, NIL)
    }

  public open val blendPoint50_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 50L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_50_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint50_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 50L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_50_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 50L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_50_POS, NIL)
    }

  public open val blendPoint51_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 51L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_51_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint51_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 51L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_51_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 51L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_51_POS, NIL)
    }

  public open val blendPoint52_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 52L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_52_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint52_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 52L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_52_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 52L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_52_POS, NIL)
    }

  public open val blendPoint53_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 53L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_53_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint53_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 53L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_53_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 53L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_53_POS, NIL)
    }

  public open val blendPoint54_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 54L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_54_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint54_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 54L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_54_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 54L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_54_POS, NIL)
    }

  public open val blendPoint55_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 55L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_55_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint55_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 55L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_55_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 55L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_55_POS, NIL)
    }

  public open val blendPoint56_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 56L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_56_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint56_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 56L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_56_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 56L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_56_POS, NIL)
    }

  public open val blendPoint57_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 57L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_57_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint57_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 57L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_57_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 57L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_57_POS, NIL)
    }

  public open val blendPoint58_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 58L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_58_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint58_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 58L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_58_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 58L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_58_POS, NIL)
    }

  public open val blendPoint59_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 59L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_59_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint59_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 59L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_59_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 59L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_59_POS, NIL)
    }

  public open val blendPoint6_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_6_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint6_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_6_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_6_POS, NIL)
    }

  public open val blendPoint60_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 60L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_60_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint60_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 60L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_60_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 60L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_60_POS, NIL)
    }

  public open val blendPoint61_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 61L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_61_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint61_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 61L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_61_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 61L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_61_POS, NIL)
    }

  public open val blendPoint62_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 62L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_62_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint62_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 62L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_62_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 62L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_62_POS, NIL)
    }

  public open val blendPoint63_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 63L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_63_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint63_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 63L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_63_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 63L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_63_POS, NIL)
    }

  public open val blendPoint7_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_7_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint7_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_7_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_7_POS, NIL)
    }

  public open val blendPoint8_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_8_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint8_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_8_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_8_POS, NIL)
    }

  public open val blendPoint9_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_9_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open var blendPoint9_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_9_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_9_POS, NIL)
    }

  /**
   * The blend space's X and Y axes' upper limit for the points' position. See [addBlendPoint].
   */
  public open var maxSpace: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_MAX_SPACE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_MAX_SPACE, NIL)
    }

  /**
   * The blend space's X and Y axes' lower limit for the points' position. See [addBlendPoint].
   */
  public open var minSpace: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_MIN_SPACE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_MIN_SPACE, NIL)
    }

  /**
   * Position increment to snap to when moving a point.
   */
  public open var snap: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_SNAP, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_SNAP, NIL)
    }

  /**
   * Name of the blend space's X axis.
   */
  public open var xLabel: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_X_LABEL, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_X_LABEL, NIL)
    }

  /**
   * Name of the blend space's Y axis.
   */
  public open var yLabel: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_Y_LABEL, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_Y_LABEL, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODEBLENDSPACE2D)
  }

  @CoreTypeHelper
  public open fun blendPoint0_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint0_pos.apply{
      schedule(this)
      blendPoint0_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint1_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint1_pos.apply{
      schedule(this)
      blendPoint1_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint10_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint10_pos.apply{
      schedule(this)
      blendPoint10_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint11_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint11_pos.apply{
      schedule(this)
      blendPoint11_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint12_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint12_pos.apply{
      schedule(this)
      blendPoint12_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint13_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint13_pos.apply{
      schedule(this)
      blendPoint13_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint14_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint14_pos.apply{
      schedule(this)
      blendPoint14_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint15_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint15_pos.apply{
      schedule(this)
      blendPoint15_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint16_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint16_pos.apply{
      schedule(this)
      blendPoint16_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint17_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint17_pos.apply{
      schedule(this)
      blendPoint17_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint18_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint18_pos.apply{
      schedule(this)
      blendPoint18_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint19_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint19_pos.apply{
      schedule(this)
      blendPoint19_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint2_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint2_pos.apply{
      schedule(this)
      blendPoint2_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint20_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint20_pos.apply{
      schedule(this)
      blendPoint20_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint21_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint21_pos.apply{
      schedule(this)
      blendPoint21_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint22_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint22_pos.apply{
      schedule(this)
      blendPoint22_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint23_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint23_pos.apply{
      schedule(this)
      blendPoint23_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint24_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint24_pos.apply{
      schedule(this)
      blendPoint24_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint25_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint25_pos.apply{
      schedule(this)
      blendPoint25_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint26_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint26_pos.apply{
      schedule(this)
      blendPoint26_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint27_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint27_pos.apply{
      schedule(this)
      blendPoint27_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint28_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint28_pos.apply{
      schedule(this)
      blendPoint28_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint29_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint29_pos.apply{
      schedule(this)
      blendPoint29_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint3_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint3_pos.apply{
      schedule(this)
      blendPoint3_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint30_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint30_pos.apply{
      schedule(this)
      blendPoint30_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint31_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint31_pos.apply{
      schedule(this)
      blendPoint31_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint32_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint32_pos.apply{
      schedule(this)
      blendPoint32_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint33_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint33_pos.apply{
      schedule(this)
      blendPoint33_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint34_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint34_pos.apply{
      schedule(this)
      blendPoint34_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint35_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint35_pos.apply{
      schedule(this)
      blendPoint35_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint36_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint36_pos.apply{
      schedule(this)
      blendPoint36_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint37_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint37_pos.apply{
      schedule(this)
      blendPoint37_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint38_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint38_pos.apply{
      schedule(this)
      blendPoint38_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint39_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint39_pos.apply{
      schedule(this)
      blendPoint39_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint4_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint4_pos.apply{
      schedule(this)
      blendPoint4_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint40_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint40_pos.apply{
      schedule(this)
      blendPoint40_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint41_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint41_pos.apply{
      schedule(this)
      blendPoint41_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint42_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint42_pos.apply{
      schedule(this)
      blendPoint42_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint43_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint43_pos.apply{
      schedule(this)
      blendPoint43_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint44_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint44_pos.apply{
      schedule(this)
      blendPoint44_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint45_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint45_pos.apply{
      schedule(this)
      blendPoint45_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint46_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint46_pos.apply{
      schedule(this)
      blendPoint46_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint47_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint47_pos.apply{
      schedule(this)
      blendPoint47_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint48_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint48_pos.apply{
      schedule(this)
      blendPoint48_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint49_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint49_pos.apply{
      schedule(this)
      blendPoint49_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint5_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint5_pos.apply{
      schedule(this)
      blendPoint5_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint50_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint50_pos.apply{
      schedule(this)
      blendPoint50_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint51_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint51_pos.apply{
      schedule(this)
      blendPoint51_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint52_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint52_pos.apply{
      schedule(this)
      blendPoint52_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint53_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint53_pos.apply{
      schedule(this)
      blendPoint53_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint54_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint54_pos.apply{
      schedule(this)
      blendPoint54_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint55_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint55_pos.apply{
      schedule(this)
      blendPoint55_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint56_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint56_pos.apply{
      schedule(this)
      blendPoint56_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint57_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint57_pos.apply{
      schedule(this)
      blendPoint57_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint58_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint58_pos.apply{
      schedule(this)
      blendPoint58_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint59_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint59_pos.apply{
      schedule(this)
      blendPoint59_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint6_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint6_pos.apply{
      schedule(this)
      blendPoint6_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint60_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint60_pos.apply{
      schedule(this)
      blendPoint60_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint61_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint61_pos.apply{
      schedule(this)
      blendPoint61_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint62_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint62_pos.apply{
      schedule(this)
      blendPoint62_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint63_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint63_pos.apply{
      schedule(this)
      blendPoint63_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint7_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint7_pos.apply{
      schedule(this)
      blendPoint7_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint8_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint8_pos.apply{
      schedule(this)
      blendPoint8_pos = this
  }


  @CoreTypeHelper
  public open fun blendPoint9_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint9_pos.apply{
      schedule(this)
      blendPoint9_pos = this
  }


  @CoreTypeHelper
  public open fun maxSpace(schedule: Vector2.() -> Unit): Vector2 = maxSpace.apply{
      schedule(this)
      maxSpace = this
  }


  @CoreTypeHelper
  public open fun minSpace(schedule: Vector2.() -> Unit): Vector2 = minSpace.apply{
      schedule(this)
      minSpace = this
  }


  @CoreTypeHelper
  public open fun snap(schedule: Vector2.() -> Unit): Vector2 = snap.apply{
      schedule(this)
      snap = this
  }


  public open fun _addBlendPoint(index: Long, node: AnimationRootNode): Unit {
  }

  public open fun _getTriangles(): PoolIntArray {
    throw NotImplementedError("_get_triangles is not implemented for AnimationNodeBlendSpace2D")
  }

  public open fun _setTriangles(triangles: PoolIntArray): Unit {
  }

  public open fun _treeChanged(): Unit {
  }

  public open fun _updateTriangles(): Unit {
  }

  /**
   * Adds a new point that represents a `node` at the position set by `pos`. You can insert it at a specific index using the `at_index` argument. If you use the default value for `at_index`, the point is inserted at the end of the blend points array.
   */
  public open fun addBlendPoint(
    node: AnimationRootNode,
    pos: Vector2,
    atIndex: Long = -1
  ): Unit {
    TransferContext.writeArguments(OBJECT to node, VECTOR2 to pos, LONG to atIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_ADD_BLEND_POINT, NIL)
  }

  /**
   * Creates a new triangle using three points `x`, `y`, and `z`. Triangles can overlap. You can insert the triangle at a specific index using the `at_index` argument. If you use the default value for `at_index`, the point is inserted at the end of the blend points array.
   */
  public open fun addTriangle(
    x: Long,
    y: Long,
    z: Long,
    atIndex: Long = -1
  ): Unit {
    TransferContext.writeArguments(LONG to x, LONG to y, LONG to z, LONG to atIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_ADD_TRIANGLE, NIL)
  }

  /**
   * Returns the number of points in the blend space.
   */
  public open fun getBlendPointCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of triangles in the blend space.
   */
  public open fun getTriangleCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_TRIANGLE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the position of the point at index `point` in the triangle of index `triangle`.
   */
  public open fun getTrianglePoint(triangle: Long, point: Long): Long {
    TransferContext.writeArguments(LONG to triangle, LONG to point)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_TRIANGLE_POINT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes the point at index `point` from the blend space.
   */
  public open fun removeBlendPoint(point: Long): Unit {
    TransferContext.writeArguments(LONG to point)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_REMOVE_BLEND_POINT, NIL)
  }

  /**
   * Removes the triangle at index `triangle` from the blend space.
   */
  public open fun removeTriangle(triangle: Long): Unit {
    TransferContext.writeArguments(LONG to triangle)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_REMOVE_TRIANGLE, NIL)
  }

  /**
   * Changes the [godot.AnimationNode] referenced by the point at index `point`.
   */
  public open fun setBlendPointNode(point: Long, node: AnimationRootNode): Unit {
    TransferContext.writeArguments(LONG to point, OBJECT to node)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_NODE, NIL)
  }

  public enum class BlendMode(
    id: Long
  ) {
    /**
     * The interpolation between animations is linear.
     */
    BLEND_MODE_INTERPOLATED(0),
    /**
     * The blend space plays the animation of the node the blending position is closest to. Useful for frame-by-frame 2D animations.
     */
    BLEND_MODE_DISCRETE(1),
    /**
     * Similar to [BLEND_MODE_DISCRETE], but starts the new animation at the last animation's playback position.
     */
    BLEND_MODE_DISCRETE_CARRY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * The blend space plays the animation of the node the blending position is closest to. Useful for frame-by-frame 2D animations.
     */
    public final const val BLEND_MODE_DISCRETE: Long = 1

    /**
     * Similar to [BLEND_MODE_DISCRETE], but starts the new animation at the last animation's playback position.
     */
    public final const val BLEND_MODE_DISCRETE_CARRY: Long = 2

    /**
     * The interpolation between animations is linear.
     */
    public final const val BLEND_MODE_INTERPOLATED: Long = 0
  }
}
