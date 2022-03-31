// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.StringName
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
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.signals.Signal0
import godot.signals.Signal1
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
 * [$DOCS_URL/tutorials/rendering/multiple_resolutions.html]($DOCS_URL/tutorials/rendering/multiple_resolutions.html)
 *
 * As one of the most important classes, the [godot.SceneTree] manages the hierarchy of nodes in a scene as well as scenes themselves. Nodes can be added, retrieved and removed. The whole scene tree (and thus the current scene) can be paused. Scenes can be loaded, switched and reloaded.
 *
 * You can also use the [godot.SceneTree] to organize your nodes into groups: every node can be assigned as many groups as you want to create, e.g. an "enemy" group. You can then iterate these groups or even call methods and set properties on all the group's members at once.
 *
 * [godot.SceneTree] is the default [godot.MainLoop] implementation used by scenes, and is thus in charge of the game loop.
 */
@GodotBaseType
public open class SceneTree : MainLoop() {
  /**
   * Emitted when a node's configuration changed. Only emitted in `tool` mode.
   */
  public val nodeConfigurationWarningChanged: Signal1<Node> by signal("node")

  /**
   * This signal is only emitted in the editor, it allows the editor to update the visibility of disabled nodes. Emitted whenever any node's [godot.Node.processMode] is changed.
   */
  public val treeProcessModeChanged: Signal0 by signal()

  /**
   * Emitted immediately before [godot.Node.PhysicsProcess] is called on every node in the [godot.SceneTree].
   */
  public val physicsFrame: Signal0 by signal()

  /**
   * Emitted whenever a node is removed from the [godot.SceneTree].
   */
  public val nodeRemoved: Signal1<Node> by signal("node")

  /**
   * Emitted whenever a node is added to the [godot.SceneTree].
   */
  public val nodeAdded: Signal1<Node> by signal("node")

  /**
   * Emitted immediately before [godot.Node.Process] is called on every node in the [godot.SceneTree].
   */
  public val processFrame: Signal0 by signal()

  /**
   * Emitted whenever a node is renamed.
   */
  public val nodeRenamed: Signal1<Node> by signal("node")

  /**
   * Emitted whenever the [godot.SceneTree] hierarchy changed (children being moved or renamed, etc.).
   */
  public val treeChanged: Signal0 by signal()

  /**
   * If `true`, collision shapes will be visible when running the game from the editor for debugging purposes.
   */
  public open var debugCollisionsHint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENETREE_IS_DEBUGGING_COLLISIONS_HINT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_DEBUG_COLLISIONS_HINT, NIL)
    }

  /**
   * If `true`, navigation polygons will be visible when running the game from the editor for debugging purposes.
   */
  public open var debugNavigationHint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENETREE_IS_DEBUGGING_NAVIGATION_HINT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_DEBUG_NAVIGATION_HINT, NIL)
    }

  /**
   * If `true`, the [godot.SceneTree] is paused. Doing so will have the following behavior:
   *
   * - 2D and 3D physics will be stopped. This includes signals and collision detection.
   *
   * - [godot.Node.Process], [godot.Node.PhysicsProcess] and [godot.Node.Input] will not be called anymore in nodes.
   */
  public open var paused: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_IS_PAUSED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_PAUSE, NIL)
    }

  /**
   * The root of the edited scene.
   */
  public open var editedSceneRoot: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_EDITED_SCENE_ROOT,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Node?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_EDITED_SCENE_ROOT,
          NIL)
    }

  /**
   * The current scene.
   */
  public open var currentScene: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_CURRENT_SCENE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Node?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_CURRENT_SCENE, NIL)
    }

  /**
   * The [godot.SceneTree]'s root [godot.Window].
   */
  public open val root: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_ROOT, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Node?
    }

  /**
   * The default [godot.MultiplayerAPI] instance for this [godot.SceneTree].
   */
  public open var multiplayer: MultiplayerAPI?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_MULTIPLAYER, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as MultiplayerAPI?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_MULTIPLAYER, NIL)
    }

  /**
   * If `true` (default value), enables automatic polling of the [godot.MultiplayerAPI] for this SceneTree during [processFrame].
   *
   * If `false`, you need to manually call [godot.MultiplayerAPI.poll] to process network packets and deliver RPCs. This allows running RPCs in a different loop (e.g. physics, thread, specific time step) and for manual [godot.Mutex] protection when accessing the [godot.MultiplayerAPI] from threads.
   */
  public open var multiplayerPoll: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENETREE_IS_MULTIPLAYER_POLL_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_MULTIPLAYER_POLL_ENABLED, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SCENETREE)
  }

  /**
   * Returns `true` if the given group exists.
   */
  public open fun hasGroup(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_HAS_GROUP, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * If `true`, the application automatically accepts quitting. Enabled by default.
   *
   * For mobile platforms, see [setQuitOnGoBack].
   */
  public open fun setAutoAcceptQuit(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_AUTO_ACCEPT_QUIT, NIL)
  }

  /**
   * If `true`, the application quits automatically on going back (e.g. on Android). Enabled by default.
   *
   * To handle 'Go Back' button when this option is disabled, use [godot.DisplayServer.WINDOW_EVENT_GO_BACK_REQUEST].
   */
  public open fun setQuitOnGoBack(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_QUIT_ON_GO_BACK, NIL)
  }

  /**
   * Returns a [godot.SceneTreeTimer] which will [godot.SceneTreeTimer.timeout] after the given time in seconds elapsed in this [godot.SceneTree]. If `process_always` is set to `false`, pausing the [godot.SceneTree] will also pause the timer.
   *
   * Commonly used to create a one-shot delay timer as in the following example:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * func some_function():
   *
   *     print("start")
   *
   *     await get_tree().create_timer(1.0).timeout
   *
   *     print("end")
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * public async void SomeFunction()
   *
   * {
   *
   *     GD.Print("start");
   *
   *     await ToSignal(GetTree().CreateTimer(1.0f), "timeout");
   *
   *     GD.Print("end");
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * The timer will be automatically freed after its time elapses.
   */
  public open fun createTimer(timeSec: Double, processAlways: Boolean = true): SceneTreeTimer? {
    TransferContext.writeArguments(DOUBLE to timeSec, BOOL to processAlways)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_CREATE_TIMER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SceneTreeTimer?
  }

  /**
   * Creates and returns a new [godot.Tween].
   */
  public open fun createTween(): Tween? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_CREATE_TWEEN, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Tween?
  }

  /**
   * Returns an array of currently existing [godot.Tween]s in the [godot.SceneTree] (both running and paused).
   */
  public open fun getProcessedTweens(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_PROCESSED_TWEENS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the number of nodes in this [godot.SceneTree].
   */
  public open fun getNodeCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_NODE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the current frame number, i.e. the total frame count since the application started.
   */
  public open fun getFrame(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_FRAME, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Quits the application at the end of the current iteration. Argument `exit_code` can optionally be given (defaulting to 0) to customize the exit status code.
   *
   * By convention, an exit code of `0` indicates success whereas a non-zero exit code indicates an error.
   *
   * For portability reasons, the exit code should be set between 0 and 125 (inclusive).
   *
   * **Note:** On iOS this method doesn't work. Instead, as recommended by the iOS Human Interface Guidelines, the user is expected to close apps via the Home button.
   */
  public open fun quit(exitCode: Long = 0): Unit {
    TransferContext.writeArguments(LONG to exitCode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_QUIT, NIL)
  }

  /**
   * Queues the given object for deletion, delaying the call to [godot.Object.free] to after the current frame.
   */
  public open fun queueDelete(obj: Object): Unit {
    TransferContext.writeArguments(OBJECT to obj)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_QUEUE_DELETE, NIL)
  }

  /**
   * Calls `method` on each member of the given group, respecting the given [enum GroupCallFlags]. You can pass arguments to `method` by specifying them at the end of the method call.
   *
   * **Note:** Due to design limitations, [callGroupFlags] will fail silently if one of the arguments is `null`.
   *
   * ```
   * 				# Call the method immediately and in reverse order.
   * 				get_tree().call_group_flags(SceneTree.GROUP_CALL_REALTIME | SceneTree.GROUP_CALL_REVERSE, "bases", "destroy")
   * 				```
   */
  public open fun callGroupFlags(
    flags: Long,
    group: StringName,
    method: StringName,
    vararg __var_args: Any?
  ): Unit {
    TransferContext.writeArguments(LONG to flags, STRING_NAME to group, STRING_NAME to method, 
        *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_CALL_GROUP_FLAGS, NIL)
  }

  /**
   * Sends the given notification to all members of the `group`, respecting the given [enum GroupCallFlags].
   */
  public open fun notifyGroupFlags(
    callFlags: Long,
    group: StringName,
    notification: Long
  ): Unit {
    TransferContext.writeArguments(LONG to callFlags, STRING_NAME to group, LONG to notification)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_NOTIFY_GROUP_FLAGS, NIL)
  }

  /**
   * Sets the given `property` to `value` on all members of the given group, respecting the given [enum GroupCallFlags].
   */
  public open fun setGroupFlags(
    callFlags: Long,
    group: StringName,
    `property`: String,
    `value`: Any
  ): Unit {
    TransferContext.writeArguments(LONG to callFlags, STRING_NAME to group, STRING to property, ANY
        to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_GROUP_FLAGS, NIL)
  }

  /**
   * Calls `method` on each member of the given group. You can pass arguments to `method` by specifying them at the end of the method call. This method is equivalent of calling [callGroupFlags] with [GROUP_CALL_DEFAULT] flag.
   *
   * **Note:** Due to design limitations, [callGroup] will fail silently if one of the arguments is `null`.
   *
   * **Note:** [callGroup] will always call methods with an one-frame delay, in a way similar to [godot.Object.callDeferred]. To call methods immediately, use [callGroupFlags] with the [GROUP_CALL_REALTIME] flag.
   */
  public open fun callGroup(
    group: StringName,
    method: StringName,
    vararg __var_args: Any?
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to group, STRING_NAME to method,  *__var_args.map {
        ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_CALL_GROUP, NIL)
  }

  /**
   * Sends the given notification to all members of the `group`.
   */
  public open fun notifyGroup(group: StringName, notification: Long): Unit {
    TransferContext.writeArguments(STRING_NAME to group, LONG to notification)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_NOTIFY_GROUP, NIL)
  }

  /**
   * Sets the given `property` to `value` on all members of the given group.
   */
  public open fun setGroup(
    group: StringName,
    `property`: String,
    `value`: Any
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to group, STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_GROUP, NIL)
  }

  /**
   * Returns a list of all nodes assigned to the given group.
   */
  public open fun getNodesInGroup(group: StringName): VariantArray<Any?> {
    TransferContext.writeArguments(STRING_NAME to group)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_NODES_IN_GROUP, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   *
   */
  public open fun getFirstNodeInGroup(group: StringName): Node? {
    TransferContext.writeArguments(STRING_NAME to group)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_FIRST_NODE_IN_GROUP,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Changes the running scene to the one at the given `path`, after loading it into a [godot.PackedScene] and creating a new instance.
   *
   * Returns [OK] on success, [ERR_CANT_OPEN] if the `path` cannot be loaded into a [godot.PackedScene], or [ERR_CANT_CREATE] if that scene cannot be instantiated.
   *
   * **Note:** The scene change is deferred, which means that the new scene node is added on the next idle frame. You won't be able to access it immediately after the [changeScene] call.
   */
  public open fun changeScene(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_CHANGE_SCENE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Changes the running scene to a new instance of the given [godot.PackedScene].
   *
   * Returns [OK] on success or [ERR_CANT_CREATE] if the scene cannot be instantiated.
   *
   * **Note:** The scene change is deferred, which means that the new scene node is added on the next idle frame. You won't be able to access it immediately after the [changeSceneTo] call.
   */
  public open fun changeSceneTo(packedScene: PackedScene): GodotError {
    TransferContext.writeArguments(OBJECT to packedScene)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_CHANGE_SCENE_TO, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Reloads the currently active scene.
   *
   * Returns [OK] on success, [ERR_UNCONFIGURED] if no [currentScene] was defined yet, [ERR_CANT_OPEN] if [currentScene] cannot be loaded into a [godot.PackedScene], or [ERR_CANT_CREATE] if the scene cannot be instantiated.
   */
  public open fun reloadCurrentScene(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_RELOAD_CURRENT_SCENE,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public enum class GroupCallFlags(
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
    GROUP_CALL_UNIQUE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
