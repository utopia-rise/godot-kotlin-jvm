// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.Signal0
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_ANIMATIONTREE_INDEX: Int = 71

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
  public val animationPlayerChanged: Signal0 by Signal0

  /**
   * The root animation node of this [AnimationTree]. See [AnimationRootNode].
   */
  public final inline var treeRoot: AnimationRootNode?
    @JvmName("treeRootProperty")
    get() = getTreeRoot()
    @JvmName("treeRootProperty")
    set(`value`) {
      setTreeRoot(value)
    }

  /**
   * The path to the [Node] used to evaluate the [AnimationNode] [Expression] if one is not
   * explicitly specified internally.
   */
  public final inline var advanceExpressionBaseNode: NodePath
    @JvmName("advanceExpressionBaseNodeProperty")
    get() = getAdvanceExpressionBaseNode()
    @JvmName("advanceExpressionBaseNodeProperty")
    set(`value`) {
      setAdvanceExpressionBaseNode(value)
    }

  /**
   * The path to the [AnimationPlayer] used for animating.
   */
  public final inline var animPlayer: NodePath
    @JvmName("animPlayerProperty")
    get() = getAnimationPlayer()
    @JvmName("animPlayerProperty")
    set(`value`) {
      setAnimationPlayer(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_ANIMATIONTREE_INDEX, scriptIndex)
  }

  public final fun setTreeRoot(animationNode: AnimationRootNode?): Unit {
    Internals.writeArguments(OBJECT to animationNode)
    Internals.callMethod(rawPtr, MethodBindings.setTreeRootPtr, NIL)
  }

  public final fun getTreeRoot(): AnimationRootNode? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTreeRootPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as AnimationRootNode?)
  }

  public final fun setAdvanceExpressionBaseNode(path: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to path)
    Internals.callMethod(rawPtr, MethodBindings.setAdvanceExpressionBaseNodePtr, NIL)
  }

  public final fun getAdvanceExpressionBaseNode(): NodePath {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAdvanceExpressionBaseNodePtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setAnimationPlayer(path: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to path)
    Internals.callMethod(rawPtr, MethodBindings.setAnimationPlayerPtr, NIL)
  }

  public final fun getAnimationPlayer(): NodePath {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAnimationPlayerPtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Sets the process notification in which to update animations.
   */
  public final fun setProcessCallback(mode: AnimationProcessCallback): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setProcessCallbackPtr, NIL)
  }

  /**
   * Returns the process notification in which to update animations.
   */
  public final fun getProcessCallback(): AnimationProcessCallback {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getProcessCallbackPtr, LONG)
    return AnimationTree.AnimationProcessCallback.from(Internals.readReturnValue(LONG) as Long)
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
      public fun from(`value`: Long): AnimationProcessCallback = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setTreeRootPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationTree", "set_tree_root", 2581683800)

    public val getTreeRootPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationTree", "get_tree_root", 4110384712)

    public val setAdvanceExpressionBaseNodePtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationTree", "set_advance_expression_base_node", 1348162250)

    public val getAdvanceExpressionBaseNodePtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationTree", "get_advance_expression_base_node", 4075236667)

    public val setAnimationPlayerPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationTree", "set_animation_player", 1348162250)

    public val getAnimationPlayerPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationTree", "get_animation_player", 4075236667)

    public val setProcessCallbackPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationTree", "set_process_callback", 1723352826)

    public val getProcessCallbackPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationTree", "get_process_callback", 891317132)
  }
}
