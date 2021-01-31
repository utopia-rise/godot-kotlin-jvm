// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.AnimationTreePlayer
import godot.annotation.GodotBaseType
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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class AnimationTreePlayer : Node() {
  open var active: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_GET_ACTIVE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_SET_ACTIVE,
          NIL)
    }

  open var basePath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_GET_BASE_PATH,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(value) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_SET_BASE_PATH,
          NIL)
    }

  open var masterPlayer: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_GET_MASTER_PLAYER, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(value) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_SET_MASTER_PLAYER, NIL)
    }

  open var playbackProcessMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_GET_PLAYBACK_PROCESS_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_SET_PLAYBACK_PROCESS_MODE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_ANIMATIONTREEPLAYER)

  open fun addNode(type: Long, id: String) {
    TransferContext.writeArguments(LONG to type, STRING to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ADD_NODE, NIL)
  }

  open fun advance(delta: Double) {
    TransferContext.writeArguments(DOUBLE to delta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ADVANCE, NIL)
  }

  open fun animationNodeGetAnimation(id: String): Animation? {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ANIMATION_NODE_GET_ANIMATION, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Animation?
  }

  open fun animationNodeGetMasterAnimation(id: String): String {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ANIMATION_NODE_GET_MASTER_ANIMATION, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun animationNodeGetPosition(id: String): Double {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ANIMATION_NODE_GET_POSITION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun animationNodeSetAnimation(id: String, animation: Animation) {
    TransferContext.writeArguments(STRING to id, OBJECT to animation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ANIMATION_NODE_SET_ANIMATION, NIL)
  }

  open fun animationNodeSetFilterPath(
    id: String,
    path: NodePath,
    enable: Boolean
  ) {
    TransferContext.writeArguments(STRING to id, NODE_PATH to path, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ANIMATION_NODE_SET_FILTER_PATH, NIL)
  }

  open fun animationNodeSetMasterAnimation(id: String, source: String) {
    TransferContext.writeArguments(STRING to id, STRING to source)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ANIMATION_NODE_SET_MASTER_ANIMATION, NIL)
  }

  open fun areNodesConnected(
    id: String,
    dstId: String,
    dstInputIdx: Long
  ): Boolean {
    TransferContext.writeArguments(STRING to id, STRING to dstId, LONG to dstInputIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ARE_NODES_CONNECTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun blend2NodeGetAmount(id: String): Double {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_BLEND2_NODE_GET_AMOUNT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun blend2NodeSetAmount(id: String, blend: Double) {
    TransferContext.writeArguments(STRING to id, DOUBLE to blend)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_BLEND2_NODE_SET_AMOUNT, NIL)
  }

  open fun blend2NodeSetFilterPath(
    id: String,
    path: NodePath,
    enable: Boolean
  ) {
    TransferContext.writeArguments(STRING to id, NODE_PATH to path, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_BLEND2_NODE_SET_FILTER_PATH, NIL)
  }

  open fun blend3NodeGetAmount(id: String): Double {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_BLEND3_NODE_GET_AMOUNT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun blend3NodeSetAmount(id: String, blend: Double) {
    TransferContext.writeArguments(STRING to id, DOUBLE to blend)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_BLEND3_NODE_SET_AMOUNT, NIL)
  }

  open fun blend4NodeGetAmount(id: String): Vector2 {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_BLEND4_NODE_GET_AMOUNT, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun blend4NodeSetAmount(id: String, blend: Vector2) {
    TransferContext.writeArguments(STRING to id, VECTOR2 to blend)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_BLEND4_NODE_SET_AMOUNT, NIL)
  }

  open fun connectNodes(
    id: String,
    dstId: String,
    dstInputIdx: Long
  ): GodotError {
    TransferContext.writeArguments(STRING to id, STRING to dstId, LONG to dstInputIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_CONNECT_NODES,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun disconnectNodes(id: String, dstInputIdx: Long) {
    TransferContext.writeArguments(STRING to id, LONG to dstInputIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_DISCONNECT_NODES, NIL)
  }

  open fun getNodeList(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_GET_NODE_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  open fun mixNodeGetAmount(id: String): Double {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_MIX_NODE_GET_AMOUNT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun mixNodeSetAmount(id: String, ratio: Double) {
    TransferContext.writeArguments(STRING to id, DOUBLE to ratio)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_MIX_NODE_SET_AMOUNT, NIL)
  }

  open fun nodeExists(node: String): Boolean {
    TransferContext.writeArguments(STRING to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_NODE_EXISTS,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun nodeGetInputCount(id: String): Long {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_NODE_GET_INPUT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun nodeGetInputSource(id: String, idx: Long): String {
    TransferContext.writeArguments(STRING to id, LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_NODE_GET_INPUT_SOURCE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun nodeGetPosition(id: String): Vector2 {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_NODE_GET_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun nodeGetType(id: String): AnimationTreePlayer.NodeType {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_NODE_GET_TYPE,
        LONG)
    return AnimationTreePlayer.NodeType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun nodeRename(node: String, newName: String): GodotError {
    TransferContext.writeArguments(STRING to node, STRING to newName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_NODE_RENAME,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun nodeSetPosition(id: String, screenPosition: Vector2) {
    TransferContext.writeArguments(STRING to id, VECTOR2 to screenPosition)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_NODE_SET_POSITION, NIL)
  }

  open fun oneshotNodeGetAutorestartDelay(id: String): Double {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_GET_AUTORESTART_DELAY, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun oneshotNodeGetAutorestartRandomDelay(id: String): Double {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_GET_AUTORESTART_RANDOM_DELAY,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun oneshotNodeGetFadeinTime(id: String): Double {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_GET_FADEIN_TIME, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun oneshotNodeGetFadeoutTime(id: String): Double {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_GET_FADEOUT_TIME, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun oneshotNodeHasAutorestart(id: String): Boolean {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_HAS_AUTORESTART, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun oneshotNodeIsActive(id: String): Boolean {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_IS_ACTIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun oneshotNodeSetAutorestart(id: String, enable: Boolean) {
    TransferContext.writeArguments(STRING to id, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_SET_AUTORESTART, NIL)
  }

  open fun oneshotNodeSetAutorestartDelay(id: String, delaySec: Double) {
    TransferContext.writeArguments(STRING to id, DOUBLE to delaySec)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_SET_AUTORESTART_DELAY, NIL)
  }

  open fun oneshotNodeSetAutorestartRandomDelay(id: String, randSec: Double) {
    TransferContext.writeArguments(STRING to id, DOUBLE to randSec)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_SET_AUTORESTART_RANDOM_DELAY, NIL)
  }

  open fun oneshotNodeSetFadeinTime(id: String, timeSec: Double) {
    TransferContext.writeArguments(STRING to id, DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_SET_FADEIN_TIME, NIL)
  }

  open fun oneshotNodeSetFadeoutTime(id: String, timeSec: Double) {
    TransferContext.writeArguments(STRING to id, DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_SET_FADEOUT_TIME, NIL)
  }

  open fun oneshotNodeSetFilterPath(
    id: String,
    path: NodePath,
    enable: Boolean
  ) {
    TransferContext.writeArguments(STRING to id, NODE_PATH to path, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_SET_FILTER_PATH, NIL)
  }

  open fun oneshotNodeStart(id: String) {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_START, NIL)
  }

  open fun oneshotNodeStop(id: String) {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_ONESHOT_NODE_STOP, NIL)
  }

  open fun recomputeCaches() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_RECOMPUTE_CACHES, NIL)
  }

  open fun removeNode(id: String) {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_REMOVE_NODE,
        NIL)
  }

  open fun reset() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_RESET, NIL)
  }

  open fun timescaleNodeGetScale(id: String): Double {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TIMESCALE_NODE_GET_SCALE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun timescaleNodeSetScale(id: String, scale: Double) {
    TransferContext.writeArguments(STRING to id, DOUBLE to scale)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TIMESCALE_NODE_SET_SCALE, NIL)
  }

  open fun timeseekNodeSeek(id: String, seconds: Double) {
    TransferContext.writeArguments(STRING to id, DOUBLE to seconds)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TIMESEEK_NODE_SEEK, NIL)
  }

  open fun transitionNodeDeleteInput(id: String, inputIdx: Long) {
    TransferContext.writeArguments(STRING to id, LONG to inputIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TRANSITION_NODE_DELETE_INPUT, NIL)
  }

  open fun transitionNodeGetCurrent(id: String): Long {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TRANSITION_NODE_GET_CURRENT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun transitionNodeGetInputCount(id: String): Long {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TRANSITION_NODE_GET_INPUT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun transitionNodeGetXfadeTime(id: String): Double {
    TransferContext.writeArguments(STRING to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TRANSITION_NODE_GET_XFADE_TIME, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun transitionNodeHasInputAutoAdvance(id: String, inputIdx: Long): Boolean {
    TransferContext.writeArguments(STRING to id, LONG to inputIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TRANSITION_NODE_HAS_INPUT_AUTO_ADVANCE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun transitionNodeSetCurrent(id: String, inputIdx: Long) {
    TransferContext.writeArguments(STRING to id, LONG to inputIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TRANSITION_NODE_SET_CURRENT, NIL)
  }

  open fun transitionNodeSetInputAutoAdvance(
    id: String,
    inputIdx: Long,
    enable: Boolean
  ) {
    TransferContext.writeArguments(STRING to id, LONG to inputIdx, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TRANSITION_NODE_SET_INPUT_AUTO_ADVANCE, NIL)
  }

  open fun transitionNodeSetInputCount(id: String, count: Long) {
    TransferContext.writeArguments(STRING to id, LONG to count)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TRANSITION_NODE_SET_INPUT_COUNT, NIL)
  }

  open fun transitionNodeSetXfadeTime(id: String, timeSec: Double) {
    TransferContext.writeArguments(STRING to id, DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONTREEPLAYER_TRANSITION_NODE_SET_XFADE_TIME, NIL)
  }

  enum class AnimationProcessMode(
    id: Long
  ) {
    ANIMATION_PROCESS_PHYSICS(0),

    ANIMATION_PROCESS_IDLE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class NodeType(
    id: Long
  ) {
    NODE_OUTPUT(0),

    NODE_ANIMATION(1),

    NODE_ONESHOT(2),

    NODE_MIX(3),

    NODE_BLEND2(4),

    NODE_BLEND3(5),

    NODE_BLEND4(6),

    NODE_TIMESCALE(7),

    NODE_TIMESEEK(8),

    NODE_TRANSITION(9);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ANIMATION_PROCESS_IDLE: Long = 1

    final const val ANIMATION_PROCESS_PHYSICS: Long = 0

    final const val NODE_ANIMATION: Long = 1

    final const val NODE_BLEND2: Long = 4

    final const val NODE_BLEND3: Long = 5

    final const val NODE_BLEND4: Long = 6

    final const val NODE_MIX: Long = 3

    final const val NODE_ONESHOT: Long = 2

    final const val NODE_OUTPUT: Long = 0

    final const val NODE_TIMESCALE: Long = 7

    final const val NODE_TIMESEEK: Long = 8

    final const val NODE_TRANSITION: Long = 9
  }
}
