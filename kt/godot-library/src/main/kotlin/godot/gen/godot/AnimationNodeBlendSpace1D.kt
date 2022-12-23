// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Blends linearly between two of any number of [godot.AnimationNode] of any type placed on a virtual axis.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/animation/animation_tree.html]($DOCS_URL/tutorials/animation/animation_tree.html)
 *
 * A resource to add to an [godot.AnimationNodeBlendTree].
 *
 * This is a virtual axis on which you can add any type of [godot.AnimationNode] using [addBlendPoint].
 *
 * Outputs the linear blend of the two [godot.AnimationNode]s closest to the node's current value.
 *
 * You can set the extents of the axis using the [minSpace] and [maxSpace].
 */
@GodotBaseType
public open class AnimationNodeBlendSpace1D : AnimationRootNode() {
  public val blendPoint0Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 0)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint0Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 0)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint1Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 1)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint1Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 1)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint2Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 2)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint2Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 2)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint3Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 3)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint3Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 3)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint4Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 4)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint4Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 4)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint5Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 5)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint5Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 5)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint6Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 6)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint6Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 6)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint7Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 7)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint7Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 7)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint8Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 8)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint8Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 8)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint9Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 9)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint9Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 9)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint10Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 10)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint10Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 10)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint11Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 11)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint11Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 11)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint12Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 12)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint12Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 12)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint13Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 13)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint13Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 13)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint14Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 14)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint14Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 14)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint15Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 15)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint15Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 15)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint16Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 16)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint16Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 16)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint17Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 17)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint17Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 17)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint18Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 18)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint18Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 18)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint19Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 19)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint19Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 19)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint20Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 20)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint20Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 20)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint21Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 21)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint21Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 21)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint22Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 22)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint22Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 22)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint23Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 23)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint23Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 23)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint24Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 24)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint24Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 24)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint25Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 25)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint25Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 25)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint26Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 26)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint26Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 26)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint27Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 27)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint27Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 27)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint28Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 28)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint28Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 28)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint29Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 29)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint29Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 29)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint30Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 30)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint30Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 30)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint31Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 31)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint31Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 31)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint32Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 32)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint32Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 32)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint33Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 33)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint33Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 33)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint34Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 34)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint34Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 34)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint35Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 35)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint35Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 35)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint36Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 36)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint36Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 36)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint37Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 37)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint37Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 37)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint38Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 38)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint38Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 38)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint39Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 39)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint39Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 39)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint40Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 40)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint40Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 40)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint41Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 41)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint41Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 41)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint42Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 42)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint42Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 42)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint43Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 43)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint43Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 43)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint44Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 44)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint44Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 44)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint45Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 45)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint45Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 45)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint46Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 46)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint46Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 46)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint47Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 47)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint47Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 47)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint48Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 48)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint48Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 48)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint49Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 49)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint49Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 49)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint50Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 50)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint50Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 50)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint51Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 51)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint51Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 51)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint52Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 52)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint52Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 52)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint53Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 53)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint53Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 53)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint54Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 54)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint54Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 54)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint55Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 55)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint55Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 55)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint56Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 56)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint56Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 56)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint57Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 57)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint57Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 57)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint58Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 58)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint58Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 58)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint59Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 59)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint59Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 59)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint60Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 60)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint60Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 60)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint61Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 61)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint61Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 61)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint62Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 62)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint62Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 62)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint63Node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 63)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint63Pos: Double
    get() {
      TransferContext.writeArguments(LONG to 63)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The blend space's axis's lower limit for the points' position. See [addBlendPoint].
   */
  public var minSpace: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_MIN_SPACE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_SET_MIN_SPACE, NIL)
    }

  /**
   * The blend space's axis's upper limit for the points' position. See [addBlendPoint].
   */
  public var maxSpace: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_MAX_SPACE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_SET_MAX_SPACE, NIL)
    }

  /**
   * Position increment to snap to when moving a point on the axis.
   */
  public var snap: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_SNAP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_SET_SNAP, NIL)
    }

  /**
   * Label of the virtual axis of the blend space.
   */
  public var valueLabel: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_VALUE_LABEL, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_SET_VALUE_LABEL, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODEBLENDSPACE1D, scriptIndex)
    return true
  }

  /**
   * Adds a new point that represents a [node] on the virtual axis at a given position set by [pos]. You can insert it at a specific index using the [atIndex] argument. If you use the default value for [atIndex], the point is inserted at the end of the blend points array.
   */
  public fun addBlendPoint(
    node: AnimationRootNode,
    pos: Double,
    atIndex: Long = -1
  ): Unit {
    TransferContext.writeArguments(OBJECT to node, DOUBLE to pos, LONG to atIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_ADD_BLEND_POINT, NIL)
  }

  /**
   * Updates the position of the point at index [point] on the blend axis.
   */
  public fun setBlendPointPosition(point: Long, pos: Double): Unit {
    TransferContext.writeArguments(LONG to point, DOUBLE to pos)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_SET_BLEND_POINT_POSITION, NIL)
  }

  /**
   * Changes the [godot.AnimationNode] referenced by the point at index [point].
   */
  public fun setBlendPointNode(point: Long, node: AnimationRootNode): Unit {
    TransferContext.writeArguments(LONG to point, OBJECT to node)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_SET_BLEND_POINT_NODE, NIL)
  }

  /**
   * Removes the point at index [point] from the blend axis.
   */
  public fun removeBlendPoint(point: Long): Unit {
    TransferContext.writeArguments(LONG to point)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_REMOVE_BLEND_POINT, NIL)
  }

  /**
   * Returns the number of points on the blend axis.
   */
  public fun getBlendPointCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public companion object
}
