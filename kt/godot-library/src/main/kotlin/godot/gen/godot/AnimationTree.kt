// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A node used for advanced animation transitions in an [AnimationPlayer].
 * **Note:** When linked with an [AnimationPlayer], several properties and methods of the
 * corresponding [AnimationPlayer] will not function as expected. Playback and transitions should be
 * handled using only the [AnimationTree] and its constituent [AnimationNode](s). The [AnimationPlayer]
 * node should be used solely for adding, deleting, and editing animations.
 */
@GodotBaseType
public open class AnimationTree : AnimationMixer() {
  /**
   * Emitted when the [animPlayer] is changed.
   */
  public val animationPlayerChanged: Signal0 by signal()

  /**
   * The root animation node of this [AnimationTree]. See [AnimationRootNode].
   */
  public var treeRoot: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTreeRootPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTreeRootPtr, NIL)
    }

  /**
   * The path to the [Node] used to evaluate the [AnimationNode] [Expression] if one is not
   * explicitly specified internally.
   */
  public var advanceExpressionBaseNode: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAdvanceExpressionBaseNodePtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAdvanceExpressionBaseNodePtr, NIL)
    }

  /**
   * The path to the [AnimationPlayer] used for animating.
   */
  public var animPlayer: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAnimationPlayerPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAnimationPlayerPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONTREE, scriptIndex)
    return true
  }

  /**
   * Sets the process notification in which to update animations.
   */
  public fun setProcessCallback(mode: AnimationProcessCallback): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setProcessCallbackPtr, NIL)
  }

  /**
   * Returns the process notification in which to update animations.
   */
  public fun getProcessCallback(): AnimationProcessCallback {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessCallbackPtr, LONG)
    return AnimationTree.AnimationProcessCallback.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class AnimationProcessCallback(
    id: Long,
  ) {
    ANIMATION_PROCESS_PHYSICS(0),
    ANIMATION_PROCESS_IDLE(1),
    ANIMATION_PROCESS_MANUAL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setTreeRootPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "set_tree_root")

    public val getTreeRootPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "get_tree_root")

    public val setAdvanceExpressionBaseNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "set_advance_expression_base_node")

    public val getAdvanceExpressionBaseNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "get_advance_expression_base_node")

    public val setAnimationPlayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "set_animation_player")

    public val getAnimationPlayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "get_animation_player")

    public val setProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "set_process_callback")

    public val getProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationTree", "get_process_callback")
  }
}
