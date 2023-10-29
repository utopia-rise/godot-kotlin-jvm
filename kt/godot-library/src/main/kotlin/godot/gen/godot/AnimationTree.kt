// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A node used for advanced animation transitions in an [godot.AnimationPlayer].
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * A node used for advanced animation transitions in an [godot.AnimationPlayer].
 *
 * **Note:** When linked with an [godot.AnimationPlayer], several properties and methods of the corresponding [godot.AnimationPlayer] will not function as expected. Playback and transitions should be handled using only the [godot.AnimationTree] and its constituent [godot.AnimationNode](s). The [godot.AnimationPlayer] node should be used solely for adding, deleting, and editing animations.
 */
@GodotBaseType
public open class AnimationTree : AnimationMixer() {
  /**
   * Emitted when the [animPlayer] is changed.
   */
  public val animationPlayerChanged: Signal0 by signal()

  /**
   * The root animation node of this [godot.AnimationTree]. See [godot.AnimationRootNode].
   */
  public var treeRoot: AnimationRootNode?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_TREE_ROOT,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_SET_TREE_ROOT, NIL)
    }

  /**
   * The path to the [godot.Node] used to evaluate the [godot.AnimationNode] [godot.Expression] if one is not explicitly specified internally.
   */
  public var advanceExpressionBaseNode: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_ADVANCE_EXPRESSION_BASE_NODE, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_SET_ADVANCE_EXPRESSION_BASE_NODE, NIL)
    }

  /**
   * The path to the [godot.AnimationPlayer] used for animating.
   */
  public var animPlayer: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_ANIMATION_PLAYER, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_SET_ANIMATION_PLAYER, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONTREE, scriptIndex)
    return true
  }

  /**
   * For backward compatibility. See [enum AnimationMixer.AnimationCallbackModeProcess].
   */
  public fun setProcessCallback(mode: AnimationProcessCallback): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_SET_PROCESS_CALLBACK,
        NIL)
  }

  /**
   * For backward compatibility. See [enum AnimationMixer.AnimationCallbackModeProcess].
   */
  public fun getProcessCallback(): AnimationProcessCallback {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREE_GET_PROCESS_CALLBACK,
        LONG)
    return AnimationTree.AnimationProcessCallback.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class AnimationProcessCallback(
    id: Long,
  ) {
    /**
     * For backward compatibility. See [godot.AnimationMixer.ANIMATION_CALLBACK_MODE_PROCESS_PHYSICS].
     */
    ANIMATION_PROCESS_PHYSICS(0),
    /**
     * For backward compatibility. See [godot.AnimationMixer.ANIMATION_CALLBACK_MODE_PROCESS_IDLE].
     */
    ANIMATION_PROCESS_IDLE(1),
    /**
     * For backward compatibility. See [godot.AnimationMixer.ANIMATION_CALLBACK_MODE_PROCESS_MANUAL].
     */
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
}
