// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Double
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
  public val blendPoint0_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 0)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint0_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 0)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint1_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 1)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint1_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 1)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint2_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 2)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint2_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 2)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint3_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 3)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint3_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 3)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint4_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 4)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint4_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 4)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint5_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 5)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint5_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 5)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint6_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 6)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint6_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 6)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint7_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 7)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint7_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 7)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint8_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 8)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint8_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 8)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint9_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 9)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint9_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 9)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint10_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 10)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint10_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 10)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint11_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 11)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint11_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 11)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint12_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 12)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint12_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 12)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint13_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 13)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint13_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 13)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint14_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 14)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint14_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 14)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint15_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 15)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint15_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 15)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint16_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 16)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint16_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 16)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint17_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 17)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint17_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 17)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint18_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 18)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint18_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 18)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint19_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 19)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint19_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 19)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint20_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 20)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint20_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 20)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint21_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 21)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint21_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 21)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint22_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 22)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint22_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 22)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint23_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 23)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint23_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 23)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint24_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 24)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint24_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 24)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint25_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 25)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint25_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 25)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint26_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 26)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint26_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 26)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint27_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 27)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint27_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 27)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint28_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 28)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint28_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 28)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint29_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 29)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint29_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 29)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint30_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 30)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint30_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 30)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint31_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 31)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint31_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 31)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint32_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 32)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint32_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 32)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint33_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 33)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint33_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 33)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint34_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 34)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint34_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 34)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint35_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 35)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint35_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 35)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint36_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 36)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint36_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 36)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint37_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 37)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint37_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 37)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint38_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 38)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint38_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 38)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint39_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 39)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint39_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 39)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint40_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 40)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint40_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 40)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint41_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 41)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint41_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 41)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint42_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 42)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint42_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 42)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint43_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 43)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint43_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 43)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint44_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 44)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint44_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 44)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint45_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 45)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint45_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 45)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint46_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 46)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint46_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 46)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint47_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 47)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint47_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 47)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint48_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 48)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint48_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 48)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint49_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 49)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint49_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 49)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint50_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 50)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint50_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 50)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint51_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 51)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint51_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 51)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint52_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 52)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint52_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 52)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint53_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 53)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint53_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 53)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint54_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 54)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint54_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 54)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint55_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 55)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint55_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 55)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint56_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 56)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint56_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 56)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint57_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 57)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint57_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 57)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint58_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 58)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint58_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 58)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint59_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 59)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint59_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 59)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint60_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 60)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint60_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 60)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint61_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 61)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint61_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 61)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint62_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 62)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint62_pos: Double
    get() {
      TransferContext.writeArguments(LONG to 62)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val blendPoint63_node: AnimationRootNode?
    get() {
      TransferContext.writeArguments(LONG to 63)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_GET_BLEND_POINT_NODE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
    }

  public val blendPoint63_pos: Double
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

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODEBLENDSPACE1D)
  }

  /**
   * Adds a new point that represents a `node` on the virtual axis at a given position set by `pos`. You can insert it at a specific index using the `at_index` argument. If you use the default value for `at_index`, the point is inserted at the end of the blend points array.
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
   * Updates the position of the point at index `point` on the blend axis.
   */
  public fun setBlendPointPosition(point: Long, pos: Double): Unit {
    TransferContext.writeArguments(LONG to point, DOUBLE to pos)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_SET_BLEND_POINT_POSITION, NIL)
  }

  /**
   * Changes the [godot.AnimationNode] referenced by the point at index `point`.
   */
  public fun setBlendPointNode(point: Long, node: AnimationRootNode): Unit {
    TransferContext.writeArguments(LONG to point, OBJECT to node)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE1D_SET_BLEND_POINT_NODE, NIL)
  }

  /**
   * Removes the point at index `point` from the blend axis.
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
