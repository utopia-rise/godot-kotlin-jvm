// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
  public var autoTriangles: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_AUTO_TRIANGLES, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_AUTO_TRIANGLES, NIL.ordinal)
    }

  public val blendPoint0_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 0)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint0_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 0)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint1_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 1)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint1_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 1)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint2_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 2)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint2_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 2)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint3_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 3)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint3_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 3)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint4_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 4)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint4_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 4)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint5_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 5)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint5_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 5)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint6_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 6)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint6_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 6)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint7_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 7)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint7_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 7)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint8_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 8)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint8_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 8)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint9_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 9)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint9_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 9)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint10_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 10)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint10_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 10)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint11_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 11)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint11_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 11)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint12_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 12)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint12_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 12)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint13_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 13)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint13_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 13)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint14_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 14)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint14_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 14)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint15_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 15)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint15_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 15)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint16_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 16)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint16_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 16)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint17_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 17)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint17_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 17)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint18_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 18)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint18_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 18)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint19_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 19)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint19_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 19)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint20_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 20)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint20_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 20)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint21_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 21)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint21_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 21)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint22_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 22)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint22_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 22)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint23_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 23)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint23_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 23)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint24_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 24)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint24_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 24)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint25_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 25)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint25_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 25)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint26_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 26)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint26_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 26)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint27_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 27)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint27_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 27)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint28_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 28)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint28_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 28)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint29_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 29)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint29_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 29)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint30_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 30)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint30_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 30)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint31_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 31)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint31_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 31)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint32_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 32)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint32_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 32)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint33_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 33)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint33_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 33)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint34_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 34)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint34_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 34)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint35_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 35)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint35_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 35)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint36_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 36)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint36_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 36)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint37_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 37)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint37_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 37)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint38_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 38)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint38_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 38)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint39_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 39)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint39_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 39)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint40_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 40)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint40_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 40)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint41_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 41)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint41_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 41)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint42_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 42)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint42_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 42)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint43_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 43)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint43_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 43)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint44_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 44)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint44_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 44)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint45_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 45)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint45_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 45)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint46_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 46)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint46_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 46)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint47_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 47)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint47_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 47)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint48_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 48)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint48_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 48)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint49_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 49)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint49_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 49)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint50_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 50)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint50_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 50)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint51_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 51)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint51_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 51)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint52_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 52)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint52_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 52)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint53_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 53)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint53_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 53)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint54_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 54)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint54_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 54)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint55_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 55)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint55_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 55)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint56_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 56)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint56_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 56)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint57_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 57)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint57_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 57)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint58_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 58)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint58_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 58)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint59_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 59)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint59_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 59)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint60_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 60)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint60_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 60)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint61_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 61)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint61_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 61)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint62_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 62)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint62_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 62)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint63_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 63)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint63_pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 63)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  /**
   * The blend space's X and Y axes' lower limit for the points' position. See [addBlendPoint].
   */
  public var minSpace: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_MIN_SPACE, VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_MIN_SPACE, NIL.ordinal)
    }

  /**
   * The blend space's X and Y axes' upper limit for the points' position. See [addBlendPoint].
   */
  public var maxSpace: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_MAX_SPACE, VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_MAX_SPACE, NIL.ordinal)
    }

  /**
   * Position increment to snap to when moving a point.
   */
  public var snap: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_SNAP,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_SNAP,
          NIL.ordinal)
    }

  /**
   * Name of the blend space's X axis.
   */
  public var xLabel: String
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_X_LABEL,
          STRING.ordinal)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_X_LABEL,
          NIL.ordinal)
    }

  /**
   * Name of the blend space's Y axis.
   */
  public var yLabel: String
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_Y_LABEL,
          STRING.ordinal)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_Y_LABEL,
          NIL.ordinal)
    }

  /**
   * Controls the interpolation between animations. See [enum BlendMode] constants.
   */
  public var blendMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_MODE, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_MODE, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODEBLENDSPACE2D)
  }

  /**
   * Adds a new point that represents a `node` at the position set by `pos`. You can insert it at a specific index using the `at_index` argument. If you use the default value for `at_index`, the point is inserted at the end of the blend points array.
   */
  public fun addBlendPoint(
    node: AnimationRootNode,
    pos: Vector2,
    atIndex: Long = -1
  ): Unit {
    TransferContext.writeArguments(OBJECT to node, VECTOR2 to pos, LONG to atIndex)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_ADD_BLEND_POINT, NIL.ordinal)
  }

  /**
   * Updates the position of the point at index `point` on the blend axis.
   */
  public fun setBlendPointPosition(point: Long, pos: Vector2): Unit {
    TransferContext.writeArguments(LONG to point, VECTOR2 to pos)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_POSITION, NIL.ordinal)
  }

  /**
   * Changes the [godot.AnimationNode] referenced by the point at index `point`.
   */
  public fun setBlendPointNode(point: Long, node: AnimationRootNode): Unit {
    TransferContext.writeArguments(LONG to point, OBJECT to node)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_NODE, NIL.ordinal)
  }

  /**
   * Removes the point at index `point` from the blend space.
   */
  public fun removeBlendPoint(point: Long): Unit {
    TransferContext.writeArguments(LONG to point)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_REMOVE_BLEND_POINT, NIL.ordinal)
  }

  /**
   * Returns the number of points in the blend space.
   */
  public fun getBlendPointCount(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_COUNT, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Creates a new triangle using three points `x`, `y`, and `z`. Triangles can overlap. You can insert the triangle at a specific index using the `at_index` argument. If you use the default value for `at_index`, the point is inserted at the end of the blend points array.
   */
  public fun addTriangle(
    x: Long,
    y: Long,
    z: Long,
    atIndex: Long = -1
  ): Unit {
    TransferContext.writeArguments(LONG to x, LONG to y, LONG to z, LONG to atIndex)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_ADD_TRIANGLE,
        NIL.ordinal)
  }

  /**
   * Returns the position of the point at index `point` in the triangle of index `triangle`.
   */
  public fun getTrianglePoint(triangle: Long, point: Long): Long {
    TransferContext.writeArguments(LONG to triangle, LONG to point)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_TRIANGLE_POINT, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes the triangle at index `triangle` from the blend space.
   */
  public fun removeTriangle(triangle: Long): Unit {
    TransferContext.writeArguments(LONG to triangle)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_REMOVE_TRIANGLE, NIL.ordinal)
  }

  /**
   * Returns the number of triangles in the blend space.
   */
  public fun getTriangleCount(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_TRIANGLE_COUNT, LONG.ordinal)
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
