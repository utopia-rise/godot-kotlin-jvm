// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.AnimationTreePlayer
import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.NodePath
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * *Deprecated.* Animation player that uses a node graph for blending animations. Superseded by [godot.AnimationTree].
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.3/tutorials/animation/animation_tree.html](https://docs.godotengine.org/en/3.3/tutorials/animation/animation_tree.html)
 *
 * *Deprecated.* A node graph tool for blending multiple animations bound to an [godot.AnimationPlayer]. Especially useful for animating characters or other skeleton-based rigs. It can combine several animations to form a desired pose.
 *
 * It takes [godot.Animation]s from an [godot.AnimationPlayer] node and mixes them depending on the graph.
 *
 * See [godot.AnimationTree] for a more full-featured replacement of this node.
 */
@GodotBaseType
public open class AnimationTreePlayer : Node() {
  /**
   * If `true`, the [godot.AnimationTreePlayer] is able to play animations.
   */
  public open var active: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_GET_ACTIVE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_SET_ACTIVE,
          NIL)
    }

  /**
   * The node from which to relatively access other nodes.
   *
   * It accesses the bones, so it should point to the same node the [godot.AnimationPlayer] would point its Root Node at.
   */
  public open var basePath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_GET_BASE_PATH,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_SET_BASE_PATH,
          NIL)
    }

  /**
   * The path to the [godot.AnimationPlayer] from which this [godot.AnimationTreePlayer] binds animations to animation nodes.
   *
   * Once set, [godot.Animation] nodes can be added to the [godot.AnimationTreePlayer].
   */
  public open var masterPlayer: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_GET_MASTER_PLAYER, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_SET_MASTER_PLAYER, NIL)
    }

  /**
   * The thread in which to update animations.
   */
  public open var playbackProcessMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_GET_PLAYBACK_PROCESS_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_SET_PLAYBACK_PROCESS_MODE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATIONTREEPLAYER)
  }

  /**
   * Adds a `type` node to the graph with name `id`.
   */
  public open fun addNode(type: Long, id: String): Unit {
    TransferContext.writeArguments(LONG to type, STRING to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ADD_NODE, NIL)
  }

  /**
   * Shifts position in the animation timeline. `delta` is the time in seconds to shift. Events between the current frame and `delta` are handled.
   */
  public open fun advance(delta: Double): Unit {
    TransferContext.writeArguments(DOUBLE to delta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ADVANCE, NIL)
  }

  /**
   * Returns the [godot.AnimationPlayer]'s [godot.Animation] bound to the [godot.AnimationTreePlayer]'s animation node with name `id`.
   */
  public open fun animationNodeGetAnimation(id: String): Animation? {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ANIMATION_NODE_GET_ANIMATION, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Animation?
  }

  /**
   * Returns the name of the [masterPlayer]'s [godot.Animation] bound to this animation node.
   */
  public open fun animationNodeGetMasterAnimation(id: String): String {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ANIMATION_NODE_GET_MASTER_ANIMATION, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the absolute playback timestamp of the animation node with name `id`.
   */
  public open fun animationNodeGetPosition(id: String): Double {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ANIMATION_NODE_GET_POSITION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Binds a new [godot.Animation] from the [masterPlayer] to the [godot.AnimationTreePlayer]'s animation node with name `id`.
   */
  public open fun animationNodeSetAnimation(id: String, animation: Animation): Unit {
    TransferContext.writeArguments(STRING to id, OBJECT to animation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ANIMATION_NODE_SET_ANIMATION, NIL)
  }

  /**
   * If `enable` is `true`, the animation node with ID `id` turns off the track modifying the property at `path`. The modified node's children continue to animate.
   */
  public open fun animationNodeSetFilterPath(
    id: String,
    path: NodePath,
    enable: Boolean
  ): Unit {
    TransferContext.writeArguments(STRING to id, NODE_PATH to path, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ANIMATION_NODE_SET_FILTER_PATH, NIL)
  }

  /**
   * Binds the [godot.Animation] named `source` from [masterPlayer] to the animation node `id`. Recalculates caches.
   */
  public open fun animationNodeSetMasterAnimation(id: String, source: String): Unit {
    TransferContext.writeArguments(STRING to id, STRING to source)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ANIMATION_NODE_SET_MASTER_ANIMATION, NIL)
  }

  /**
   * Returns whether node `id` and `dst_id` are connected at the specified slot.
   */
  public open fun areNodesConnected(
    id: String,
    dstId: String,
    dstInputIdx: Long
  ): Boolean {
    TransferContext.writeArguments(STRING to id, STRING to dstId, LONG to dstInputIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ARE_NODES_CONNECTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the blend amount of a Blend2 node given its name.
   */
  public open fun blend2NodeGetAmount(id: String): Double {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_BLEND2_NODE_GET_AMOUNT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the blend amount of a Blend2 node given its name and value.
   *
   * A Blend2 node blends two animations (A and B) with the amount between 0 and 1.
   *
   * At 0, output is input A. Towards 1, the influence of A gets lessened, the influence of B gets raised. At 1, output is input B.
   */
  public open fun blend2NodeSetAmount(id: String, blend: Double): Unit {
    TransferContext.writeArguments(STRING to id, DOUBLE to blend)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_BLEND2_NODE_SET_AMOUNT, NIL)
  }

  /**
   * If `enable` is `true`, the Blend2 node with name `id` turns off the track modifying the property at `path`. The modified node's children continue to animate.
   */
  public open fun blend2NodeSetFilterPath(
    id: String,
    path: NodePath,
    enable: Boolean
  ): Unit {
    TransferContext.writeArguments(STRING to id, NODE_PATH to path, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_BLEND2_NODE_SET_FILTER_PATH, NIL)
  }

  /**
   * Returns the blend amount of a Blend3 node given its name.
   */
  public open fun blend3NodeGetAmount(id: String): Double {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_BLEND3_NODE_GET_AMOUNT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the blend amount of a Blend3 node given its name and value.
   *
   * A Blend3 Node blends three animations (A, B-, B+) with the amount between -1 and 1.
   *
   * At -1, output is input B-. From -1 to 0, the influence of B- gets lessened, the influence of A gets raised and the influence of B+ is 0. At 0, output is input A. From 0 to 1, the influence of A gets lessened, the influence of B+ gets raised and the influence of B+ is 0. At 1, output is input B+.
   */
  public open fun blend3NodeSetAmount(id: String, blend: Double): Unit {
    TransferContext.writeArguments(STRING to id, DOUBLE to blend)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_BLEND3_NODE_SET_AMOUNT, NIL)
  }

  /**
   * Returns the blend amount of a Blend4 node given its name.
   */
  public open fun blend4NodeGetAmount(id: String): Vector2 {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_BLEND4_NODE_GET_AMOUNT, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Sets the blend amount of a Blend4 node given its name and value.
   *
   * A Blend4 Node blends two pairs of animations.
   *
   * The two pairs are blended like Blend2 and then added together.
   */
  public open fun blend4NodeSetAmount(id: String, blend: Vector2): Unit {
    TransferContext.writeArguments(STRING to id, VECTOR2 to blend)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_BLEND4_NODE_SET_AMOUNT, NIL)
  }

  /**
   * Connects node `id` to `dst_id` at the specified input slot.
   */
  public open fun connectNodes(
    id: String,
    dstId: String,
    dstInputIdx: Long
  ): GodotError {
    TransferContext.writeArguments(STRING to id, STRING to dstId, LONG to dstInputIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_CONNECT_NODES,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Disconnects nodes connected to `id` at the specified input slot.
   */
  public open fun disconnectNodes(id: String, dstInputIdx: Long): Unit {
    TransferContext.writeArguments(STRING to id, LONG to dstInputIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_DISCONNECT_NODES, NIL)
  }

  /**
   * Returns a [godot.core.PoolStringArray] containing the name of all nodes.
   */
  public open fun getNodeList(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_GET_NODE_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the mix amount of a Mix node given its name.
   */
  public open fun mixNodeGetAmount(id: String): Double {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_MIX_NODE_GET_AMOUNT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the mix amount of a Mix node given its name and value.
   *
   * A Mix node adds input b to input a by the amount given by ratio.
   */
  public open fun mixNodeSetAmount(id: String, ratio: Double): Unit {
    TransferContext.writeArguments(STRING to id, DOUBLE to ratio)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_MIX_NODE_SET_AMOUNT, NIL)
  }

  /**
   * Check if a node exists (by name).
   */
  public open fun nodeExists(node: String): Boolean {
    TransferContext.writeArguments(STRING to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_NODE_EXISTS,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the input count for a given node. Different types of nodes have different amount of inputs.
   */
  public open fun nodeGetInputCount(id: String): Long {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_NODE_GET_INPUT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the input source for a given node input.
   */
  public open fun nodeGetInputSource(id: String, idx: Long): String {
    TransferContext.writeArguments(STRING to id, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_NODE_GET_INPUT_SOURCE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns position of a node in the graph given its name.
   */
  public open fun nodeGetPosition(id: String): Vector2 {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_NODE_GET_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Gets the node type, will return from [enum NodeType] enum.
   */
  public open fun nodeGetType(id: String): AnimationTreePlayer.NodeType {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_NODE_GET_TYPE,
        LONG)
    return AnimationTreePlayer.NodeType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Renames a node in the graph.
   */
  public open fun nodeRename(node: String, newName: String): GodotError {
    TransferContext.writeArguments(STRING to node, STRING to newName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_NODE_RENAME,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets the position of a node in the graph given its name and position.
   */
  public open fun nodeSetPosition(id: String, screenPosition: Vector2): Unit {
    TransferContext.writeArguments(STRING to id, VECTOR2 to screenPosition)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_NODE_SET_POSITION, NIL)
  }

  /**
   * Returns the autostart delay of a OneShot node given its name.
   */
  public open fun oneshotNodeGetAutorestartDelay(id: String): Double {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_GET_AUTORESTART_DELAY, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the autostart random delay of a OneShot node given its name.
   */
  public open fun oneshotNodeGetAutorestartRandomDelay(id: String): Double {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_GET_AUTORESTART_RANDOM_DELAY,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the fade in time of a OneShot node given its name.
   */
  public open fun oneshotNodeGetFadeinTime(id: String): Double {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_GET_FADEIN_TIME, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the fade out time of a OneShot node given its name.
   */
  public open fun oneshotNodeGetFadeoutTime(id: String): Double {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_GET_FADEOUT_TIME, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns whether a OneShot node will auto restart given its name.
   */
  public open fun oneshotNodeHasAutorestart(id: String): Boolean {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_HAS_AUTORESTART, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether a OneShot node is active given its name.
   */
  public open fun oneshotNodeIsActive(id: String): Boolean {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_IS_ACTIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the autorestart property of a OneShot node given its name and value.
   */
  public open fun oneshotNodeSetAutorestart(id: String, enable: Boolean): Unit {
    TransferContext.writeArguments(STRING to id, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_SET_AUTORESTART, NIL)
  }

  /**
   * Sets the autorestart delay of a OneShot node given its name and value in seconds.
   */
  public open fun oneshotNodeSetAutorestartDelay(id: String, delaySec: Double): Unit {
    TransferContext.writeArguments(STRING to id, DOUBLE to delaySec)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_SET_AUTORESTART_DELAY, NIL)
  }

  /**
   * Sets the autorestart random delay of a OneShot node given its name and value in seconds.
   */
  public open fun oneshotNodeSetAutorestartRandomDelay(id: String, randSec: Double): Unit {
    TransferContext.writeArguments(STRING to id, DOUBLE to randSec)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_SET_AUTORESTART_RANDOM_DELAY, NIL)
  }

  /**
   * Sets the fade in time of a OneShot node given its name and value in seconds.
   */
  public open fun oneshotNodeSetFadeinTime(id: String, timeSec: Double): Unit {
    TransferContext.writeArguments(STRING to id, DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_SET_FADEIN_TIME, NIL)
  }

  /**
   * Sets the fade out time of a OneShot node given its name and value in seconds.
   */
  public open fun oneshotNodeSetFadeoutTime(id: String, timeSec: Double): Unit {
    TransferContext.writeArguments(STRING to id, DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_SET_FADEOUT_TIME, NIL)
  }

  /**
   * If `enable` is `true`, the OneShot node with ID `id` turns off the track modifying the property at `path`. The modified node's children continue to animate.
   */
  public open fun oneshotNodeSetFilterPath(
    id: String,
    path: NodePath,
    enable: Boolean
  ): Unit {
    TransferContext.writeArguments(STRING to id, NODE_PATH to path, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_SET_FILTER_PATH, NIL)
  }

  /**
   * Starts a OneShot node given its name.
   */
  public open fun oneshotNodeStart(id: String): Unit {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_START, NIL)
  }

  /**
   * Stops the OneShot node with name `id`.
   */
  public open fun oneshotNodeStop(id: String): Unit {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_STOP, NIL)
  }

  /**
   * Manually recalculates the cache of track information generated from animation nodes. Needed when external sources modify the animation nodes' state.
   */
  public open fun recomputeCaches(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_RECOMPUTE_CACHES, NIL)
  }

  /**
   * Removes the animation node with name `id`.
   */
  public open fun removeNode(id: String): Unit {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_REMOVE_NODE,
        NIL)
  }

  /**
   * Resets this [godot.AnimationTreePlayer].
   */
  public open fun reset(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_RESET, NIL)
  }

  /**
   * Returns the time scale value of the TimeScale node with name `id`.
   */
  public open fun timescaleNodeGetScale(id: String): Double {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TIMESCALE_NODE_GET_SCALE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the time scale of the TimeScale node with name `id` to `scale`.
   *
   * The TimeScale node is used to speed [godot.Animation]s up if the scale is above 1 or slow them down if it is below 1.
   *
   * If applied after a blend or mix, affects all input animations to that blend or mix.
   */
  public open fun timescaleNodeSetScale(id: String, scale: Double): Unit {
    TransferContext.writeArguments(STRING to id, DOUBLE to scale)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TIMESCALE_NODE_SET_SCALE, NIL)
  }

  /**
   * Sets the time seek value of the TimeSeek node with name `id` to `seconds`.
   *
   * This functions as a seek in the [godot.Animation] or the blend or mix of [godot.Animation]s input in it.
   */
  public open fun timeseekNodeSeek(id: String, seconds: Double): Unit {
    TransferContext.writeArguments(STRING to id, DOUBLE to seconds)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TIMESEEK_NODE_SEEK, NIL)
  }

  /**
   * Deletes the input at `input_idx` for the transition node with name `id`.
   */
  public open fun transitionNodeDeleteInput(id: String, inputIdx: Long): Unit {
    TransferContext.writeArguments(STRING to id, LONG to inputIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TRANSITION_NODE_DELETE_INPUT, NIL)
  }

  /**
   * Returns the index of the currently evaluated input for the transition node with name `id`.
   */
  public open fun transitionNodeGetCurrent(id: String): Long {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TRANSITION_NODE_GET_CURRENT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of inputs for the transition node with name `id`. You can add inputs by right-clicking on the transition node.
   */
  public open fun transitionNodeGetInputCount(id: String): Long {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TRANSITION_NODE_GET_INPUT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the cross fade time for the transition node with name `id`.
   */
  public open fun transitionNodeGetXfadeTime(id: String): Double {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TRANSITION_NODE_GET_XFADE_TIME, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns `true` if the input at `input_idx` on the transition node with name `id` is set to automatically advance to the next input upon completion.
   */
  public open fun transitionNodeHasInputAutoAdvance(id: String, inputIdx: Long): Boolean {
    TransferContext.writeArguments(STRING to id, LONG to inputIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TRANSITION_NODE_HAS_INPUT_AUTO_ADVANCE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * The transition node with name `id` sets its current input at `input_idx`.
   */
  public open fun transitionNodeSetCurrent(id: String, inputIdx: Long): Unit {
    TransferContext.writeArguments(STRING to id, LONG to inputIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TRANSITION_NODE_SET_CURRENT, NIL)
  }

  /**
   * The transition node with name `id` advances to its next input automatically when the input at `input_idx` completes.
   */
  public open fun transitionNodeSetInputAutoAdvance(
    id: String,
    inputIdx: Long,
    enable: Boolean
  ): Unit {
    TransferContext.writeArguments(STRING to id, LONG to inputIdx, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TRANSITION_NODE_SET_INPUT_AUTO_ADVANCE, NIL)
  }

  /**
   * Resizes the number of inputs available for the transition node with name `id`.
   */
  public open fun transitionNodeSetInputCount(id: String, count: Long): Unit {
    TransferContext.writeArguments(STRING to id, LONG to count)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TRANSITION_NODE_SET_INPUT_COUNT, NIL)
  }

  /**
   * The transition node with name `id` sets its cross fade time to `time_sec`.
   */
  public open fun transitionNodeSetXfadeTime(id: String, timeSec: Double): Unit {
    TransferContext.writeArguments(STRING to id, DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TRANSITION_NODE_SET_XFADE_TIME, NIL)
  }

  public enum class AnimationProcessMode(
    id: Long
  ) {
    /**
     * Process animation during the physics process. This is especially useful when animating physics bodies.
     */
    ANIMATION_PROCESS_PHYSICS(0),
    /**
     * Process animation during the idle process.
     */
    ANIMATION_PROCESS_IDLE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class NodeType(
    id: Long
  ) {
    /**
     * Output node.
     */
    NODE_OUTPUT(0),
    /**
     * Animation node.
     */
    NODE_ANIMATION(1),
    /**
     * OneShot node.
     */
    NODE_ONESHOT(2),
    /**
     * Mix node.
     */
    NODE_MIX(3),
    /**
     * Blend2 node.
     */
    NODE_BLEND2(4),
    /**
     * Blend3 node.
     */
    NODE_BLEND3(5),
    /**
     * Blend4 node.
     */
    NODE_BLEND4(6),
    /**
     * TimeScale node.
     */
    NODE_TIMESCALE(7),
    /**
     * TimeSeek node.
     */
    NODE_TIMESEEK(8),
    /**
     * Transition node.
     */
    NODE_TRANSITION(9),
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
     * Process animation during the idle process.
     */
    public final const val ANIMATION_PROCESS_IDLE: Long = 1

    /**
     * Process animation during the physics process. This is especially useful when animating physics bodies.
     */
    public final const val ANIMATION_PROCESS_PHYSICS: Long = 0

    /**
     * Animation node.
     */
    public final const val NODE_ANIMATION: Long = 1

    /**
     * Blend2 node.
     */
    public final const val NODE_BLEND2: Long = 4

    /**
     * Blend3 node.
     */
    public final const val NODE_BLEND3: Long = 5

    /**
     * Blend4 node.
     */
    public final const val NODE_BLEND4: Long = 6

    /**
     * Mix node.
     */
    public final const val NODE_MIX: Long = 3

    /**
     * OneShot node.
     */
    public final const val NODE_ONESHOT: Long = 2

    /**
     * Output node.
     */
    public final const val NODE_OUTPUT: Long = 0

    /**
     * TimeScale node.
     */
    public final const val NODE_TIMESCALE: Long = 7

    /**
     * TimeSeek node.
     */
    public final const val NODE_TIMESEEK: Long = 8

    /**
     * Transition node.
     */
    public final const val NODE_TRANSITION: Long = 9
  }
}
