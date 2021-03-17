// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

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
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Manages the game loop via a hierarchy of nodes.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/getting_started/step_by_step/scene_tree.html](https://docs.godotengine.org/en/latest/getting_started/step_by_step/scene_tree.html)
 * [https://docs.godotengine.org/en/latest/tutorials/viewports/multiple_resolutions.html](https://docs.godotengine.org/en/latest/tutorials/viewports/multiple_resolutions.html)
 *
 * As one of the most important classes, the [godot.SceneTree] manages the hierarchy of nodes in a scene as well as scenes themselves. Nodes can be added, retrieved and removed. The whole scene tree (and thus the current scene) can be paused. Scenes can be loaded, switched and reloaded.
 *
 * You can also use the [godot.SceneTree] to organize your nodes into groups: every node can be assigned as many groups as you want to create, e.g. a "enemy" group. You can then iterate these groups or even call methods and set properties on all the group's members at once.
 *
 * [godot.SceneTree] is the default [godot.MainLoop] implementation used by scenes, and is thus in charge of the game loop.
 */
@GodotBaseType
open class SceneTree : MainLoop() {
  /**
   * Emitted whenever this [godot.SceneTree]'s [networkPeer] successfully connected to a server. Only emitted on clients.
   */
  val connectedToServer: Signal0 by signal()

  /**
   * Emitted whenever this [godot.SceneTree]'s [networkPeer] fails to establish a connection to a server. Only emitted on clients.
   */
  val connectionFailed: Signal0 by signal()

  /**
   * Emitted when files are dragged from the OS file manager and dropped in the game window. The arguments are a list of file paths and the identifier of the screen where the drag originated.
   */
  val filesDropped: Signal2<PoolStringArray, Long> by signal("files", "screen")

  /**
   * Emitted whenever global menu item is clicked.
   */
  val globalMenuAction: Signal2<Unit, Unit> by signal("id", "meta")

  /**
   * Emitted immediately before [godot.Node.Process] is called on every node in the [godot.SceneTree].
   */
  val idleFrame: Signal0 by signal()

  /**
   * Emitted whenever this [godot.SceneTree]'s [networkPeer] connects with a new peer. ID is the peer ID of the new peer. Clients get notified when other clients connect to the same server. Upon connecting to a server, a client also receives this signal for the server (with ID being 1).
   */
  val networkPeerConnected: Signal1<Long> by signal("id")

  /**
   * Emitted whenever this [godot.SceneTree]'s [networkPeer] disconnects from a peer. Clients get notified when other clients disconnect from the same server.
   */
  val networkPeerDisconnected: Signal1<Long> by signal("id")

  /**
   * Emitted whenever a node is added to the [godot.SceneTree].
   */
  val nodeAdded: Signal1<Node> by signal("node")

  /**
   * Emitted when a node's configuration changed. Only emitted in `tool` mode.
   */
  val nodeConfigurationWarningChanged: Signal1<Node> by signal("node")

  /**
   * Emitted whenever a node is removed from the [godot.SceneTree].
   */
  val nodeRemoved: Signal1<Node> by signal("node")

  /**
   * Emitted whenever a node is renamed.
   */
  val nodeRenamed: Signal1<Node> by signal("node")

  /**
   * Emitted immediately before [godot.Node.PhysicsProcess] is called on every node in the [godot.SceneTree].
   */
  val physicsFrame: Signal0 by signal()

  /**
   * Emitted when the screen resolution (fullscreen) or window size (windowed) changes.
   */
  val screenResized: Signal0 by signal()

  /**
   * Emitted whenever this [godot.SceneTree]'s [networkPeer] disconnected from server. Only emitted on clients.
   */
  val serverDisconnected: Signal0 by signal()

  /**
   * Emitted whenever the [godot.SceneTree] hierarchy changed (children being moved or renamed, etc.).
   */
  val treeChanged: Signal0 by signal()

  /**
   * The current scene.
   */
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

  /**
   * If `true`, collision shapes will be visible when running the game from the editor for debugging purposes.
   */
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

  /**
   * If `true`, navigation polygons will be visible when running the game from the editor for debugging purposes.
   */
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

  /**
   * The root of the edited scene.
   */
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

  /**
   * The default [godot.MultiplayerAPI] instance for this [godot.SceneTree].
   */
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

  /**
   * If `true` (default value), enables automatic polling of the [godot.MultiplayerAPI] for this SceneTree during [idleFrame].
   *
   * If `false`, you need to manually call [godot.MultiplayerAPI.poll] to process network packets and deliver RPCs/RSETs. This allows running RPCs/RSETs in a different loop (e.g. physics, thread, specific time step) and for manual [godot.Mutex] protection when accessing the [godot.MultiplayerAPI] from threads.
   */
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

  /**
   * The peer object to handle the RPC system (effectively enabling networking when set). Depending on the peer itself, the [godot.SceneTree] will become a network server (check with [isNetworkServer]) and will set the root node's network mode to master, or it will become a regular peer with the root node set to puppet. All child nodes are set to inherit the network mode by default. Handling of networking-related events (connection, disconnection, new clients) is done by connecting to [godot.SceneTree]'s signals.
   */
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

  /**
   * If `true`, the [godot.SceneTree] is paused. Doing so will have the following behavior:
   *
   * - 2D and 3D physics will be stopped.
   *
   * - [godot.Node.Process], [godot.Node.PhysicsProcess] and [godot.Node.Input] will not be called anymore in nodes.
   */
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

  /**
   * If `true`, the [godot.SceneTree]'s [networkPeer] refuses new incoming connections.
   */
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

  /**
   * The [godot.SceneTree]'s root [godot.Viewport].
   */
  open val root: Viewport?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_ROOT, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Viewport?
    }

  /**
   * If `true`, font oversampling is used.
   */
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

  override fun __new() {
    callConstructor(ENGINECLASS_SCENETREE)
  }

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

  /**
   * Calls `method` on each member of the given group.
   */
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

  /**
   * Calls `method` on each member of the given group, respecting the given [enum GroupCallFlags].
   */
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

  /**
   * Changes the running scene to the one at the given `path`, after loading it into a [godot.PackedScene] and creating a new instance.
   *
   * Returns [OK] on success, [ERR_CANT_OPEN] if the `path` cannot be loaded into a [godot.PackedScene], or [ERR_CANT_CREATE] if that scene cannot be instantiated.
   */
  open fun changeScene(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_CHANGE_SCENE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Changes the running scene to a new instance of the given [godot.PackedScene].
   *
   * Returns [OK] on success or [ERR_CANT_CREATE] if the scene cannot be instantiated.
   */
  open fun changeSceneTo(packedScene: PackedScene): GodotError {
    TransferContext.writeArguments(OBJECT to packedScene)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_CHANGE_SCENE_TO, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns a [godot.SceneTreeTimer] which will [godot.SceneTreeTimer.timeout] after the given time in seconds elapsed in this [godot.SceneTree]. If `pause_mode_process` is set to `false`, pausing the [godot.SceneTree] will also pause the timer.
   *
   * Commonly used to create a one-shot delay timer as in the following example:
   *
   * ```
   * 				func some_function():
   * 				    print("start")
   * 				    yield(get_tree().create_timer(1.0), "timeout")
   * 				    print("end")
   * 				```
   */
  open fun createTimer(timeSec: Double, pauseModeProcess: Boolean = true): SceneTreeTimer? {
    TransferContext.writeArguments(DOUBLE to timeSec, BOOL to pauseModeProcess)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_CREATE_TIMER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SceneTreeTimer?
  }

  /**
   * Returns the current frame number, i.e. the total frame count since the application started.
   */
  open fun getFrame(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_FRAME, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the peer IDs of all connected peers of this [godot.SceneTree]'s [networkPeer].
   */
  open fun getNetworkConnectedPeers(): PoolIntArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_NETWORK_CONNECTED_PEERS, POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  /**
   * Returns the unique peer ID of this [godot.SceneTree]'s [networkPeer].
   */
  open fun getNetworkUniqueId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_NETWORK_UNIQUE_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of nodes in this [godot.SceneTree].
   */
  open fun getNodeCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_NODE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a list of all nodes assigned to the given group.
   */
  open fun getNodesInGroup(group: String): VariantArray<Any?> {
    TransferContext.writeArguments(STRING to group)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_NODES_IN_GROUP, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the sender's peer ID for the most recently received RPC call.
   */
  open fun getRpcSenderId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_RPC_SENDER_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if the given group exists.
   */
  open fun hasGroup(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_HAS_GROUP, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if there is a [networkPeer] set.
   */
  open fun hasNetworkPeer(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_HAS_NETWORK_PEER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the most recent [godot.InputEvent] was marked as handled with [setInputAsHandled].
   */
  open fun isInputHandled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_IS_INPUT_HANDLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if this [godot.SceneTree]'s [networkPeer] is in server mode (listening for connections).
   */
  open fun isNetworkServer(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_IS_NETWORK_SERVER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sends the given notification to all members of the `group`.
   */
  open fun notifyGroup(group: String, notification: Long) {
    TransferContext.writeArguments(STRING to group, LONG to notification)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_NOTIFY_GROUP, NIL)
  }

  /**
   * Sends the given notification to all members of the `group`, respecting the given [enum GroupCallFlags].
   */
  open fun notifyGroupFlags(
    callFlags: Long,
    group: String,
    notification: Long
  ) {
    TransferContext.writeArguments(LONG to callFlags, STRING to group, LONG to notification)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_NOTIFY_GROUP_FLAGS, NIL)
  }

  /**
   * Queues the given object for deletion, delaying the call to [godot.Object.free] to after the current frame.
   */
  open fun queueDelete(obj: Object) {
    TransferContext.writeArguments(OBJECT to obj)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_QUEUE_DELETE, NIL)
  }

  /**
   * Quits the application. A process `exit_code` can optionally be passed as an argument. If this argument is `0` or greater, it will override the [godot.OS.exitCode] defined before quitting the application.
   */
  open fun quit(exitCode: Long = -1) {
    TransferContext.writeArguments(LONG to exitCode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_QUIT, NIL)
  }

  /**
   * Reloads the currently active scene.
   *
   * Returns [OK] on success, [ERR_UNCONFIGURED] if no [currentScene] was defined yet, [ERR_CANT_OPEN] if [currentScene] cannot be loaded into a [godot.PackedScene], or [ERR_CANT_CREATE] if the scene cannot be instantiated.
   */
  open fun reloadCurrentScene(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_RELOAD_CURRENT_SCENE,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * If `true`, the application automatically accepts quitting. Enabled by default.
   *
   * For mobile platforms, see [setQuitOnGoBack].
   */
  open fun setAutoAcceptQuit(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_AUTO_ACCEPT_QUIT, NIL)
  }

  /**
   * Sets the given `property` to `value` on all members of the given group.
   */
  open fun setGroup(
    group: String,
    property: String,
    value: Any?
  ) {
    TransferContext.writeArguments(STRING to group, STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_GROUP, NIL)
  }

  /**
   * Sets the given `property` to `value` on all members of the given group, respecting the given [enum GroupCallFlags].
   */
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

  /**
   * Marks the most recent [godot.InputEvent] as handled.
   */
  open fun setInputAsHandled() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_INPUT_AS_HANDLED, NIL)
  }

  /**
   * If `true`, the application quits automatically on going back (e.g. on Android). Enabled by default.
   *
   * To handle 'Go Back' button when this option is disabled, use [godot.MainLoop.NOTIFICATION_WM_GO_BACK_REQUEST].
   */
  open fun setQuitOnGoBack(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_QUIT_ON_GO_BACK, NIL)
  }

  /**
   * Configures screen stretching to the given [enum StretchMode], [enum StretchAspect], minimum size and `shrink` ratio.
   */
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
    /**
     * Fill the window with the content stretched to cover excessive space. Content may appear stretched.
     */
    STRETCH_ASPECT_IGNORE(0),

    /**
     * Retain the same aspect ratio by padding with black bars on either axis. This prevents distortion.
     */
    STRETCH_ASPECT_KEEP(1),

    /**
     * Expand vertically. Left/right black bars may appear if the window is too wide.
     */
    STRETCH_ASPECT_KEEP_WIDTH(2),

    /**
     * Expand horizontally. Top/bottom black bars may appear if the window is too tall.
     */
    STRETCH_ASPECT_KEEP_HEIGHT(3),

    /**
     * Expand in both directions, retaining the same aspect ratio. This prevents distortion while avoiding black bars.
     */
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
    /**
     * Call a group with no flags (default).
     */
    GROUP_CALL_DEFAULT(0),

    /**
     * Call a group in reverse scene order.
     */
    GROUP_CALL_REVERSE(1),

    /**
     * Call a group immediately (calls are normally made on idle).
     */
    GROUP_CALL_REALTIME(2),

    /**
     * Call a group only once even if the call is executed many times.
     */
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
    /**
     * No stretching.
     */
    STRETCH_MODE_DISABLED(0),

    /**
     * Render stretching in higher resolution (interpolated).
     */
    STRETCH_MODE_2D(1),

    /**
     * Keep the specified display resolution. No interpolation. Content may appear pixelated.
     */
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
    /**
     * Call a group with no flags (default).
     */
    final const val GROUP_CALL_DEFAULT: Long = 0

    /**
     * Call a group immediately (calls are normally made on idle).
     */
    final const val GROUP_CALL_REALTIME: Long = 2

    /**
     * Call a group in reverse scene order.
     */
    final const val GROUP_CALL_REVERSE: Long = 1

    /**
     * Call a group only once even if the call is executed many times.
     */
    final const val GROUP_CALL_UNIQUE: Long = 4

    /**
     * Expand in both directions, retaining the same aspect ratio. This prevents distortion while avoiding black bars.
     */
    final const val STRETCH_ASPECT_EXPAND: Long = 4

    /**
     * Fill the window with the content stretched to cover excessive space. Content may appear stretched.
     */
    final const val STRETCH_ASPECT_IGNORE: Long = 0

    /**
     * Retain the same aspect ratio by padding with black bars on either axis. This prevents distortion.
     */
    final const val STRETCH_ASPECT_KEEP: Long = 1

    /**
     * Expand horizontally. Top/bottom black bars may appear if the window is too tall.
     */
    final const val STRETCH_ASPECT_KEEP_HEIGHT: Long = 3

    /**
     * Expand vertically. Left/right black bars may appear if the window is too wide.
     */
    final const val STRETCH_ASPECT_KEEP_WIDTH: Long = 2

    /**
     * Render stretching in higher resolution (interpolated).
     */
    final const val STRETCH_MODE_2D: Long = 1

    /**
     * No stretching.
     */
    final const val STRETCH_MODE_DISABLED: Long = 0

    /**
     * Keep the specified display resolution. No interpolation. Content may appear pixelated.
     */
    final const val STRETCH_MODE_VIEWPORT: Long = 2
  }
}
