// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Base class for [godot.AnimationNode]s that hold one or multiple composite animations. Usually used for [godot.AnimationTree.treeRoot].
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/animation/animation_tree.html]($DOCS_URL/tutorials/animation/animation_tree.html)
 *
 * [godot.AnimationRootNode] is a base class for [godot.AnimationNode]s that hold a complete animation. A complete animation refers to the output of an [godot.AnimationNodeOutput] in an [godot.AnimationNodeBlendTree] or the output of another [godot.AnimationRootNode]. Used for [godot.AnimationTree.treeRoot] or in other [godot.AnimationRootNode]s.
 *
 * Examples of built-in root nodes include [godot.AnimationNodeBlendTree] (allows blending nodes between each other using various modes), [godot.AnimationNodeStateMachine] (allows to configure blending and transitions between nodes using a state machine pattern), [godot.AnimationNodeBlendSpace2D] (allows linear blending between **three** [godot.AnimationNode]s), [godot.AnimationNodeBlendSpace1D] (allows linear blending only between **two** [godot.AnimationNode]s).
 */
@GodotBaseType
public open class AnimationRootNode : AnimationNode() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONROOTNODE, scriptIndex)
    return true
  }

  public companion object
}
