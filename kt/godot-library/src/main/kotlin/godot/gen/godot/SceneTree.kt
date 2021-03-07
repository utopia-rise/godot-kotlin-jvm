// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.PoolIntArray
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_INT_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class SceneTree : MainLoop() {
  val connectedToServer: Signal0 by signal()

  val connectionFailed: Signal0 by signal()

  val filesDropped: Signal2<PoolStringArray, Long> by signal("files", "screen")

  val globalMenuAction: Signal2<Unit, Unit> by signal("id", "meta")

  val idleFrame: Signal0 by signal()

  val networkPeerConnected: Signal1<Long> by signal("id")

  val networkPeerDisconnected: Signal1<Long> by signal("id")

  val nodeAdded: Signal1<Node> by signal("node")

  val nodeConfigurationWarningChanged: Signal1<Node> by signal("node")

  val nodeRemoved: Signal1<Node> by signal("node")

  val nodeRenamed: Signal1<Node> by signal("node")

  val physicsFrame: Signal0 by signal()

  val screenResized: Signal0 by signal()

  val serverDisconnected: Signal0 by signal()

  val treeChanged: Signal0 by signal()

  open var currentScene: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_CURRENT_SCENE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Node?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_CURRENT_SCENE, NIL)
    }

  open var debugCollisionsHint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_DEBUG_COLLISIONS_HINT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_DEBUG_COLLISIONS_HINT, NIL)
    }

  open var debugNavigationHint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_DEBUG_NAVIGATION_HINT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_DEBUG_NAVIGATION_HINT, NIL)
    }

  open var editedSceneRoot: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_EDITED_SCENE_ROOT,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Node?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_EDITED_SCENE_ROOT,
          NIL)
    }

  open var multiplayer: MultiplayerAPI?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_MULTIPLAYER, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as MultiplayerAPI?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_MULTIPLAYER, NIL)
    }

  open var multiplayerPoll: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_MULTIPLAYER_POLL,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_MULTIPLAYER_POLL,
          NIL)
    }

  open var networkPeer: NetworkedMultiplayerPeer?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_NETWORK_PEER,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as NetworkedMultiplayerPeer?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_NETWORK_PEER, NIL)
    }

  open var paused: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_PAUSED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_PAUSED, NIL)
    }

  open var refuseNewNetworkConnections: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_REFUSE_NEW_NETWORK_CONNECTIONS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_REFUSE_NEW_NETWORK_CONNECTIONS, NIL)
    }

  open val root: Viewport?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_ROOT, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Viewport?
    }

  open var useFontOversampling: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_USE_FONT_OVERSAMPLING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_USE_FONT_OVERSAMPLING, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_SCENETREE)

  open fun _changeScene(arg0: Node) {
  }

  open fun _connectedToServer() {
  }

  open fun _connectionFailed() {
  }

  open fun _networkPeerConnected(arg0: Long) {
  }

  open fun _networkPeerDisconnected(arg0: Long) {
  }

  open fun _serverDisconnected() {
  }

  open fun callGroup(
    group: String,
    method: String,
    vararg __var_args: Any?
  ): Any? {
    TransferContext.writeArguments(STRING to group, STRING to method,  *__var_args.map { ANY to it
        }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_CALL_GROUP, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun callGroupFlags(
    flags: Long,
    group: String,
    method: String,
    vararg __var_args: Any?
  ): Any? {
    TransferContext.writeArguments(LONG to flags, STRING to group, STRING to method, 
        *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_CALL_GROUP_FLAGS, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun changeScene(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_CHANGE_SCENE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun changeSceneTo(packedScene: PackedScene): GodotError {
    TransferContext.writeArguments(OBJECT to packedScene)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_CHANGE_SCENE_TO, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun createTimer(timeSec: Double, pauseModeProcess: Boolean = true): SceneTreeTimer? {
    TransferContext.writeArguments(DOUBLE to timeSec, BOOL to pauseModeProcess)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_CREATE_TIMER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SceneTreeTimer?
  }

  open fun getFrame(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_FRAME, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getNetworkConnectedPeers(): PoolIntArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_NETWORK_CONNECTED_PEERS, POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  open fun getNetworkUniqueId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_NETWORK_UNIQUE_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getNodeCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_NODE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getNodesInGroup(group: String): VariantArray<Any?> {
    TransferContext.writeArguments(STRING to group)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_NODES_IN_GROUP, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun getRpcSenderId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_RPC_SENDER_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun hasGroup(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_HAS_GROUP, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasNetworkPeer(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_HAS_NETWORK_PEER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isInputHandled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_IS_INPUT_HANDLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isNetworkServer(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_IS_NETWORK_SERVER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun notifyGroup(group: String, notification: Long) {
    TransferContext.writeArguments(STRING to group, LONG to notification)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_NOTIFY_GROUP, NIL)
  }

  open fun notifyGroupFlags(
    callFlags: Long,
    group: String,
    notification: Long
  ) {
    TransferContext.writeArguments(LONG to callFlags, STRING to group, LONG to notification)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_NOTIFY_GROUP_FLAGS, NIL)
  }

  open fun queueDelete(obj: Object) {
    TransferContext.writeArguments(OBJECT to obj)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_QUEUE_DELETE, NIL)
  }

  open fun quit(exitCode: Long = -1) {
    TransferContext.writeArguments(LONG to exitCode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_QUIT, NIL)
  }

  open fun reloadCurrentScene(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_RELOAD_CURRENT_SCENE,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun setAutoAcceptQuit(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_AUTO_ACCEPT_QUIT, NIL)
  }

  open fun setGroup(
    group: String,
    property: String,
    value: Any?
  ) {
    TransferContext.writeArguments(STRING to group, STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_GROUP, NIL)
  }

  open fun setGroupFlags(
    callFlags: Long,
    group: String,
    property: String,
    value: Any?
  ) {
    TransferContext.writeArguments(LONG to callFlags, STRING to group, STRING to property, ANY to
        value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_GROUP_FLAGS, NIL)
  }

  open fun setInputAsHandled() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_INPUT_AS_HANDLED, NIL)
  }

  open fun setQuitOnGoBack(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_QUIT_ON_GO_BACK, NIL)
  }

  open fun setScreenStretch(
    mode: Long,
    aspect: Long,
    minsize: Vector2,
    shrink: Double = 1.0
  ) {
    TransferContext.writeArguments(LONG to mode, LONG to aspect, VECTOR2 to minsize, DOUBLE to
        shrink)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_SCREEN_STRETCH, NIL)
  }

  enum class StretchAspect(
    id: Long
  ) {
    STRETCH_ASPECT_IGNORE(0),

    STRETCH_ASPECT_KEEP(1),

    STRETCH_ASPECT_KEEP_WIDTH(2),

    STRETCH_ASPECT_KEEP_HEIGHT(3),

    STRETCH_ASPECT_EXPAND(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class GroupCallFlags(
    id: Long
  ) {
    GROUP_CALL_DEFAULT(0),

    GROUP_CALL_REVERSE(1),

    GROUP_CALL_REALTIME(2),

    GROUP_CALL_UNIQUE(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class StretchMode(
    id: Long
  ) {
    STRETCH_MODE_DISABLED(0),

    STRETCH_MODE_2D(1),

    STRETCH_MODE_VIEWPORT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val GROUP_CALL_DEFAULT: Long = 0

    final const val GROUP_CALL_REALTIME: Long = 2

    final const val GROUP_CALL_REVERSE: Long = 1

    final const val GROUP_CALL_UNIQUE: Long = 4

    final const val STRETCH_ASPECT_EXPAND: Long = 4

    final const val STRETCH_ASPECT_IGNORE: Long = 0

    final const val STRETCH_ASPECT_KEEP: Long = 1

    final const val STRETCH_ASPECT_KEEP_HEIGHT: Long = 3

    final const val STRETCH_ASPECT_KEEP_WIDTH: Long = 2

    final const val STRETCH_MODE_2D: Long = 1

    final const val STRETCH_MODE_DISABLED: Long = 0

    final const val STRETCH_MODE_VIEWPORT: Long = 2
  }
}
