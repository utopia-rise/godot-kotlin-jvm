// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
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
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_AUTO_TRIANGLES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_AUTO_TRIANGLES, NIL)
    }

  public val blendPoint0Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 0)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint0Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 0)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint1Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 1)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint1Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 1)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint2Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 2)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint2Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 2)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint3Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 3)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint3Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 3)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint4Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 4)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint4Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 4)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint5Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 5)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint5Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 5)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint6Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 6)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint6Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 6)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint7Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 7)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint7Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 7)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint8Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 8)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint8Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 8)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint9Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 9)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint9Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 9)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint10Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 10)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint10Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 10)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint11Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 11)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint11Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 11)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint12Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 12)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint12Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 12)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint13Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 13)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint13Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 13)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint14Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 14)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint14Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 14)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint15Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 15)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint15Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 15)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint16Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 16)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint16Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 16)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint17Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 17)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint17Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 17)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint18Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 18)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint18Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 18)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint19Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 19)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint19Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 19)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint20Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 20)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint20Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 20)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint21Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 21)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint21Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 21)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint22Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 22)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint22Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 22)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint23Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 23)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint23Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 23)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint24Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 24)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint24Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 24)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint25Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 25)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint25Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 25)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint26Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 26)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint26Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 26)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint27Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 27)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint27Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 27)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint28Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 28)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint28Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 28)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint29Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 29)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint29Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 29)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint30Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 30)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint30Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 30)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint31Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 31)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint31Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 31)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint32Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 32)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint32Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 32)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint33Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 33)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint33Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 33)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint34Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 34)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint34Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 34)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint35Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 35)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint35Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 35)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint36Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 36)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint36Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 36)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint37Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 37)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint37Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 37)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint38Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 38)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint38Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 38)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint39Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 39)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint39Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 39)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint40Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 40)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint40Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 40)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint41Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 41)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint41Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 41)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint42Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 42)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint42Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 42)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint43Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 43)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint43Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 43)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint44Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 44)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint44Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 44)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint45Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 45)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint45Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 45)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint46Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 46)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint46Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 46)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint47Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 47)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint47Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 47)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint48Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 48)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint48Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 48)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint49Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 49)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint49Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 49)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint50Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 50)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint50Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 50)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint51Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 51)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint51Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 51)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint52Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 52)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint52Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 52)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint53Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 53)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint53Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 53)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint54Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 54)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint54Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 54)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint55Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 55)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint55Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 55)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint56Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 56)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint56Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 56)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint57Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 57)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint57Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 57)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint58Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 58)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint58Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 58)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint59Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 59)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint59Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 59)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint60Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 60)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint60Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 60)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint61Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 61)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint61Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 61)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint62Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 62)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint62Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 62)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  public val blendPoint63Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 63)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint63Pos: Vector2
    get() {
      TransferContext.writeArguments(LONG to 63)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  /**
   * The blend space's X and Y axes' lower limit for the points' position. See [addBlendPoint].
   */
  public var minSpace: Vector2
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
  public var maxSpace: Vector2
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
  public var snap: Vector2
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
  public var xLabel: String
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
  public var yLabel: String
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
  public var blendMode: Long
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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODEBLENDSPACE2D, scriptIndex)
    return true
  }

  /**
   * Adds a new point that represents a [node] at the position set by [pos]. You can insert it at a specific index using the [atIndex] argument. If you use the default value for [atIndex], the point is inserted at the end of the blend points array.
   */
  public fun addBlendPoint(
    node: AnimationRootNode,
    pos: Vector2,
    atIndex: Long = -1
  ): Unit {
    TransferContext.writeArguments(OBJECT to node, VECTOR2 to pos, LONG to atIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_ADD_BLEND_POINT, NIL)
  }

  /**
   * Updates the position of the point at index [point] on the blend axis.
   */
  public fun setBlendPointPosition(point: Long, pos: Vector2): Unit {
    TransferContext.writeArguments(LONG to point, VECTOR2 to pos)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_POSITION, NIL)
  }

  /**
   * Changes the [godot.AnimationNode] referenced by the point at index [point].
   */
  public fun setBlendPointNode(point: Long, node: AnimationRootNode): Unit {
    TransferContext.writeArguments(LONG to point, OBJECT to node)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_NODE, NIL)
  }

  /**
   * Removes the point at index [point] from the blend space.
   */
  public fun removeBlendPoint(point: Long): Unit {
    TransferContext.writeArguments(LONG to point)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_REMOVE_BLEND_POINT, NIL)
  }

  /**
   * Returns the number of points in the blend space.
   */
  public fun getBlendPointCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Creates a new triangle using three points [x], [y], and [z]. Triangles can overlap. You can insert the triangle at a specific index using the [atIndex] argument. If you use the default value for [atIndex], the point is inserted at the end of the blend points array.
   */
  public fun addTriangle(
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
   * Returns the position of the point at index [point] in the triangle of index [triangle].
   */
  public fun getTrianglePoint(triangle: Long, point: Long): Long {
    TransferContext.writeArguments(LONG to triangle, LONG to point)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_TRIANGLE_POINT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes the triangle at index [triangle] from the blend space.
   */
  public fun removeTriangle(triangle: Long): Unit {
    TransferContext.writeArguments(LONG to triangle)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_REMOVE_TRIANGLE, NIL)
  }

  /**
   * Returns the number of triangles in the blend space.
   */
  public fun getTriangleCount(): Long {
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
