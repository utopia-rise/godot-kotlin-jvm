// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
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

  public open val blendPoint0_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_0_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint0_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_0_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint1_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_1_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint1_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_1_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint2_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_2_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint2_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_2_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint3_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_3_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint3_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_3_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint4_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_4_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint4_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_4_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint5_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_5_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint5_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_5_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint6_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_6_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint6_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_6_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint7_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_7_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint7_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_7_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint8_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_8_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint8_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_8_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint9_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_9_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint9_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_9_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint10_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_10_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint10_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_10_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint11_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_11_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint11_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_11_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint12_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_12_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint12_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_12_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint13_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_13_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint13_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_13_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint14_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_14_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint14_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_14_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint15_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_15_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint15_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_15_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint16_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_16_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint16_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_16_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint17_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_17_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint17_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_17_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint18_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_18_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint18_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_18_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint19_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_19_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint19_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_19_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint20_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_20_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint20_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_20_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint21_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_21_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint21_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_21_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint22_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_22_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint22_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_22_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint23_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_23_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint23_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_23_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint24_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_24_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint24_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_24_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint25_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_25_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint25_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_25_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint26_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_26_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint26_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_26_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint27_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_27_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint27_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_27_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint28_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_28_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint28_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_28_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint29_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_29_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint29_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_29_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint30_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_30_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint30_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_30_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint31_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_31_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint31_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_31_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint32_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_32_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint32_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_32_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint33_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_33_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint33_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_33_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint34_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_34_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint34_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_34_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint35_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_35_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint35_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_35_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint36_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_36_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint36_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_36_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint37_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_37_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint37_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_37_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint38_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_38_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint38_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_38_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint39_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_39_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint39_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_39_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint40_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_40_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint40_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_40_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint41_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_41_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint41_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_41_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint42_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_42_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint42_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_42_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint43_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_43_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint43_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_43_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint44_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_44_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint44_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_44_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint45_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_45_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint45_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_45_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint46_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_46_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint46_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_46_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint47_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_47_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint47_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_47_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint48_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_48_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint48_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_48_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint49_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_49_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint49_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_49_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint50_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_50_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint50_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_50_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint51_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_51_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint51_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_51_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint52_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_52_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint52_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_52_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint53_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_53_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint53_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_53_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint54_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_54_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint54_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_54_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint55_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_55_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint55_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_55_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint56_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_56_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint56_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_56_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint57_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_57_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint57_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_57_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint58_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_58_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint58_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_58_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint59_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_59_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint59_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_59_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint60_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_60_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint60_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_60_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint61_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_61_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint61_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_61_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint62_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_62_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint62_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_62_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public open val blendPoint63_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_63_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public open val blendPoint63_pos: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_63_POS, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
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

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODEBLENDSPACE2D)
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
   * Updates the position of the point at index `point` on the blend axis.
   */
  public open fun setBlendPointPosition(point: Long, pos: Vector2): Unit {
    TransferContext.writeArguments(LONG to point, VECTOR2 to pos)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_POSITION, NIL)
  }

  /**
   * Changes the [godot.AnimationNode] referenced by the point at index `point`.
   */
  public open fun setBlendPointNode(point: Long, node: AnimationRootNode): Unit {
    TransferContext.writeArguments(LONG to point, OBJECT to node)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_NODE, NIL)
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
   * Returns the number of points in the blend space.
   */
  public open fun getBlendPointCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
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
   * Returns the position of the point at index `point` in the triangle of index `triangle`.
   */
  public open fun getTrianglePoint(triangle: Long, point: Long): Long {
    TransferContext.writeArguments(LONG to triangle, LONG to point)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_TRIANGLE_POINT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
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
   * Returns the number of triangles in the blend space.
   */
  public open fun getTriangleCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_TRIANGLE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
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

  public companion object
}
