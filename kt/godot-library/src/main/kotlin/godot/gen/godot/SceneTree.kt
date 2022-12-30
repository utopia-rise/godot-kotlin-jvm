// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.NodePath
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
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
   * Emitted whenever the [godot.SceneTree] hierarchy changed (children being moved or renamed, etc.).
   */
  public val treeChanged: Signal0 by signal()

  /**
   * This signal is only emitted in the editor, it allows the editor to update the visibility of disabled nodes. Emitted whenever any node's [godot.Node.processMode] is changed.
   */
  public val treeProcessModeChanged: Signal0 by signal()

  /**
   * Emitted whenever a node is added to the [godot.SceneTree].
   */
  public val nodeAdded: Signal1<Node> by signal("node")

  /**
   * Emitted whenever a node is removed from the [godot.SceneTree].
   */
  public val nodeRemoved: Signal1<Node> by signal("node")

  /**
   * Emitted whenever a node is renamed.
   */
  public val nodeRenamed: Signal1<Node> by signal("node")

  /**
   * Emitted when a node's configuration changed. Only emitted in `tool` mode.
   */
  public val nodeConfigurationWarningChanged: Signal1<Node> by signal("node")

  /**
   * Emitted immediately before [godot.Node.Process] is called on every node in the [godot.SceneTree].
   */
  public val processFrame: Signal0 by signal()

  /**
   * Emitted immediately before [godot.Node.PhysicsProcess] is called on every node in the [godot.SceneTree].
   */
  public val physicsFrame: Signal0 by signal()

  /**
   * If `true`, the application automatically accepts quitting.
   *
   * For mobile platforms, see [quitOnGoBack].
   */
  public var autoAcceptQuit: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_IS_AUTO_ACCEPT_QUIT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_AUTO_ACCEPT_QUIT,
          NIL)
    }

  /**
   * If `true`, the application quits automatically on going back (e.g. on Android).
   *
   * To handle 'Go Back' button when this option is disabled, use [godot.DisplayServer.WINDOW_EVENT_GO_BACK_REQUEST].
   */
  public var quitOnGoBack: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_IS_QUIT_ON_GO_BACK,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_QUIT_ON_GO_BACK,
          NIL)
    }

  /**
   * If `true`, collision shapes will be visible when running the game from the editor for debugging purposes.
   *
   * **Note:** This property is not designed to be changed at run-time. Changing the value of [debugCollisionsHint] while the project is running will not have the desired effect.
   */
  public var debugCollisionsHint: Boolean
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
   * If `true`, curves from [godot.Path2D] and [godot.Path3D] nodes will be visible when running the game from the editor for debugging purposes.
   *
   * **Note:** This property is not designed to be changed at run-time. Changing the value of [debugPathsHint] while the project is running will not have the desired effect.
   */
  public var debugPathsHint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_IS_DEBUGGING_PATHS_HINT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_DEBUG_PATHS_HINT,
          NIL)
    }

  /**
   * If `true`, navigation polygons will be visible when running the game from the editor for debugging purposes.
   *
   * **Note:** This property is not designed to be changed at run-time. Changing the value of [debugNavigationHint] while the project is running will not have the desired effect.
   */
  public var debugNavigationHint: Boolean
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
  public var paused: Boolean
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
  public var editedSceneRoot: Node?
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
  public var currentScene: Node?
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
  public val root: Window?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_ROOT, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Window?
    }

  /**
   * If `true` (default value), enables automatic polling of the [godot.MultiplayerAPI] for this SceneTree during [processFrame].
   *
   * If `false`, you need to manually call [godot.MultiplayerAPI.poll] to process network packets and deliver RPCs. This allows running RPCs in a different loop (e.g. physics, thread, specific time step) and for manual [godot.Mutex] protection when accessing the [godot.MultiplayerAPI] from threads.
   */
  public var multiplayerPoll: Boolean
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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SCENETREE, scriptIndex)
    return true
  }

  /**
   * Returns `true` if the given group exists.
   */
  public fun hasGroup(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_HAS_GROUP, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns a [godot.SceneTreeTimer] which will [godot.SceneTreeTimer.timeout] after the given time in seconds elapsed in this [godot.SceneTree].
   *
   * If `process_always` is set to `false`, pausing the [godot.SceneTree] will also pause the timer.
   *
   * If `process_in_physics` is set to `true`, will update the [godot.SceneTreeTimer] during the physics frame instead of the process frame (fixed framerate processing).
   *
   * If `ignore_time_scale` is set to `true`, will ignore [godot.Engine.timeScale] and update the [godot.SceneTreeTimer] with the actual frame delta.
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
  public fun createTimer(
    timeSec: Double,
    processAlways: Boolean = true,
    processInPhysics: Boolean = false,
    ignoreTimeScale: Boolean = false
  ): SceneTreeTimer? {
    TransferContext.writeArguments(DOUBLE to timeSec, BOOL to processAlways, BOOL to processInPhysics, BOOL to ignoreTimeScale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_CREATE_TIMER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SceneTreeTimer?
  }

  /**
   * Creates and returns a new [godot.Tween].
   */
  public fun createTween(): Tween? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_CREATE_TWEEN, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Tween?
  }

  /**
   * Returns an array of currently existing [godot.Tween]s in the [godot.SceneTree] (both running and paused).
   */
  public fun getProcessedTweens(): VariantArray<Tween> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_PROCESSED_TWEENS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Tween>
  }

  /**
   * Returns the number of nodes in this [godot.SceneTree].
   */
  public fun getNodeCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_NODE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the current frame number, i.e. the total frame count since the application started.
   */
  public fun getFrame(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_FRAME, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Quits the application at the end of the current iteration. Argument [exitCode] can optionally be given (defaulting to 0) to customize the exit status code.
   *
   * By convention, an exit code of `0` indicates success whereas a non-zero exit code indicates an error.
   *
   * For portability reasons, the exit code should be set between 0 and 125 (inclusive).
   *
   * **Note:** On iOS this method doesn't work. Instead, as recommended by the iOS Human Interface Guidelines, the user is expected to close apps via the Home button.
   */
  public fun quit(exitCode: Long = 0): Unit {
    TransferContext.writeArguments(LONG to exitCode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_QUIT, NIL)
  }

  /**
   * Queues the given object for deletion, delaying the call to [godot.Object.free] to after the current frame.
   */
  public fun queueDelete(obj: Object): Unit {
    TransferContext.writeArguments(OBJECT to obj)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_QUEUE_DELETE, NIL)
  }

  /**
   * Calls [method] on each member of the given group, respecting the given [enum GroupCallFlags]. You can pass arguments to [method] by specifying them at the end of the method call. If a node doesn't have the given method or the argument list does not match (either in count or in types), it will be skipped.
   *
   * ```
   * 				# Call the method in a deferred manner and in reverse order.
   * 				get_tree().call_group_flags(SceneTree.GROUP_CALL_DEFERRED | SceneTree.GROUP_CALL_REVERSE)
   * 				```
   *
   * **Note:** Group call flags are used to control the method calling behavior. By default, methods will be called immediately in a way similar to [callGroup]. However, if the [GROUP_CALL_DEFERRED] flag is present in the [flags] argument, methods will be called with a one-frame delay in a way similar to [godot.Object.setDeferred].
   */
  public fun callGroupFlags(
    flags: Long,
    group: StringName,
    method: StringName,
    vararg __var_args: Any?
  ): Unit {
    TransferContext.writeArguments(LONG to flags, STRING_NAME to group, STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_CALL_GROUP_FLAGS, NIL)
  }

  /**
   * Sends the given notification to all members of the [group], respecting the given [enum GroupCallFlags].
   *
   * **Note:** Group call flags are used to control the notification sending behavior. By default, notifications will be sent immediately in a way similar to [notifyGroup]. However, if the [GROUP_CALL_DEFERRED] flag is present in the [callFlags] argument, notifications will be sent with a one-frame delay in a way similar to using `Object.call_deferred("notification", ...)`.
   */
  public fun notifyGroupFlags(
    callFlags: Long,
    group: StringName,
    notification: Long
  ): Unit {
    TransferContext.writeArguments(LONG to callFlags, STRING_NAME to group, LONG to notification)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_NOTIFY_GROUP_FLAGS, NIL)
  }

  /**
   * Sets the given [property] to [value] on all members of the given group, respecting the given [enum GroupCallFlags].
   *
   * **Note:** Group call flags are used to control the property setting behavior. By default, properties will be set immediately in a way similar to [setGroup]. However, if the [GROUP_CALL_DEFERRED] flag is present in the [callFlags] argument, properties will be set with a one-frame delay in a way similar to [godot.Object.callDeferred].
   */
  public fun setGroupFlags(
    callFlags: Long,
    group: StringName,
    `property`: String,
    `value`: Any
  ): Unit {
    TransferContext.writeArguments(LONG to callFlags, STRING_NAME to group, STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_GROUP_FLAGS, NIL)
  }

  /**
   * Calls [method] on each member of the given group. You can pass arguments to [method] by specifying them at the end of the method call. If a node doesn't have the given method or the argument list does not match (either in count or in types), it will be skipped.
   *
   * **Note:** [callGroup] will call methods immediately on all members at once, which can cause stuttering if an expensive method is called on lots of members. To wait for one frame after [callGroup] was called, use [callGroupFlags] with the [GROUP_CALL_DEFERRED] flag.
   */
  public fun callGroup(
    group: StringName,
    method: StringName,
    vararg __var_args: Any?
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to group, STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_CALL_GROUP, NIL)
  }

  /**
   * Sends the given notification to all members of the [group].
   *
   * **Note:** [notifyGroup] will immediately notify all members at once, which can cause stuttering if an expensive method is called as a result of sending the notification lots of members. To wait for one frame, use [notifyGroupFlags] with the [GROUP_CALL_DEFERRED] flag.
   */
  public fun notifyGroup(group: StringName, notification: Long): Unit {
    TransferContext.writeArguments(STRING_NAME to group, LONG to notification)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_NOTIFY_GROUP, NIL)
  }

  /**
   * Sets the given [property] to [value] on all members of the given group.
   *
   * **Note:** [setGroup] will set the property immediately on all members at once, which can cause stuttering if a property with an expensive setter is set on lots of members. To wait for one frame, use [setGroupFlags] with the [GROUP_CALL_DEFERRED] flag.
   */
  public fun setGroup(
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
  public fun getNodesInGroup(group: StringName): VariantArray<Node> {
    TransferContext.writeArguments(STRING_NAME to group)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_NODES_IN_GROUP, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Node>
  }

  /**
   * Returns the first node in the specified group, or `null` if the group is empty or does not exist.
   */
  public fun getFirstNodeInGroup(group: StringName): Node? {
    TransferContext.writeArguments(STRING_NAME to group)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_FIRST_NODE_IN_GROUP,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Changes the running scene to the one at the given [path], after loading it into a [godot.PackedScene] and creating a new instance.
   *
   * Returns [OK] on success, [ERR_CANT_OPEN] if the [path] cannot be loaded into a [godot.PackedScene], or [ERR_CANT_CREATE] if that scene cannot be instantiated.
   *
   * **Note:** The scene change is deferred, which means that the new scene node is added on the next idle frame. You won't be able to access it immediately after the [changeSceneToFile] call.
   */
  public fun changeSceneToFile(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_CHANGE_SCENE_TO_FILE,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Changes the running scene to a new instance of the given [godot.PackedScene].
   *
   * Returns [OK] on success or [ERR_CANT_CREATE] if the scene cannot be instantiated.
   *
   * **Note:** The scene change is deferred, which means that the new scene node is added on the next idle frame. You won't be able to access it immediately after the [changeSceneToPacked] call.
   */
  public fun changeSceneToPacked(packedScene: PackedScene): GodotError {
    TransferContext.writeArguments(OBJECT to packedScene)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_CHANGE_SCENE_TO_PACKED,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Reloads the currently active scene.
   *
   * Returns [OK] on success, [ERR_UNCONFIGURED] if no [currentScene] was defined yet, [ERR_CANT_OPEN] if [currentScene] cannot be loaded into a [godot.PackedScene], or [ERR_CANT_CREATE] if the scene cannot be instantiated.
   */
  public fun reloadCurrentScene(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_RELOAD_CURRENT_SCENE,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets a custom [godot.MultiplayerAPI] with the given [rootPath] (controlling also the relative subpaths), or override the default one if [rootPath] is empty.
   */
  public fun setMultiplayer(multiplayer: MultiplayerAPI, rootPath: NodePath = NodePath("")): Unit {
    TransferContext.writeArguments(OBJECT to multiplayer, NODE_PATH to rootPath)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_SET_MULTIPLAYER, NIL)
  }

  /**
   * Return the [godot.MultiplayerAPI] configured for the given path, or the default one if [forPath] is empty.
   */
  public fun getMultiplayer(forPath: NodePath = NodePath("")): MultiplayerAPI? {
    TransferContext.writeArguments(NODE_PATH to forPath)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREE_GET_MULTIPLAYER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as MultiplayerAPI?
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
     * Call a group with a one-frame delay (idle frame, not physics).
     */
    GROUP_CALL_DEFERRED(2),
    /**
     * Call a group only once even if the call is executed many times.
     *
     * **Note:** Arguments are not taken into account when deciding whether the call is unique or not. Therefore when the same method is called with different arguments, only the first call will be performed.
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
