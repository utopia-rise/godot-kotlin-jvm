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
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

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
   * If `true`, the application automatically accepts quitting requests.
   *
   * For mobile platforms, see [quitOnGoBack].
   */
  public var autoAcceptQuit: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAutoAcceptQuitPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoAcceptQuitPtr, NIL)
    }

  /**
   * If `true`, the application quits automatically when navigating back (e.g. using the system "Back" button on Android).
   *
   * To handle 'Go Back' button when this option is disabled, use [godot.DisplayServer.WINDOW_EVENT_GO_BACK_REQUEST].
   */
  public var quitOnGoBack: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isQuitOnGoBackPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setQuitOnGoBackPtr, NIL)
    }

  /**
   * If `true`, collision shapes will be visible when running the game from the editor for debugging purposes.
   *
   * **Note:** This property is not designed to be changed at run-time. Changing the value of [debugCollisionsHint] while the project is running will not have the desired effect.
   */
  public var debugCollisionsHint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDebuggingCollisionsHintPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDebugCollisionsHintPtr, NIL)
    }

  /**
   * If `true`, curves from [godot.Path2D] and [godot.Path3D] nodes will be visible when running the game from the editor for debugging purposes.
   *
   * **Note:** This property is not designed to be changed at run-time. Changing the value of [debugPathsHint] while the project is running will not have the desired effect.
   */
  public var debugPathsHint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDebuggingPathsHintPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDebugPathsHintPtr, NIL)
    }

  /**
   * If `true`, navigation polygons will be visible when running the game from the editor for debugging purposes.
   *
   * **Note:** This property is not designed to be changed at run-time. Changing the value of [debugNavigationHint] while the project is running will not have the desired effect.
   */
  public var debugNavigationHint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDebuggingNavigationHintPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDebugNavigationHintPtr, NIL)
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
      TransferContext.callMethod(rawPtr, MethodBindings.isPausedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPausePtr, NIL)
    }

  /**
   * The root of the edited scene.
   */
  public var editedSceneRoot: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEditedSceneRootPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Node?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEditedSceneRootPtr, NIL)
    }

  /**
   * Returns the root node of the currently running scene, regardless of its structure.
   *
   * **Warning:** Setting this directly might not work as expected, and will *not* add or remove any nodes from the tree, consider using [changeSceneToFile] or [changeSceneToPacked] instead.
   */
  public var currentScene: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurrentScenePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Node?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurrentScenePtr, NIL)
    }

  /**
   * The [godot.SceneTree]'s root [godot.Window].
   */
  public val root: Window?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRootPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Window?)
    }

  /**
   * If `true` (default value), enables automatic polling of the [godot.MultiplayerAPI] for this SceneTree during [processFrame].
   *
   * If `false`, you need to manually call [godot.MultiplayerAPI.poll] to process network packets and deliver RPCs. This allows running RPCs in a different loop (e.g. physics, thread, specific time step) and for manual [godot.Mutex] protection when accessing the [godot.MultiplayerAPI] from threads.
   */
  public var multiplayerPoll: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMultiplayerPollEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMultiplayerPollEnabledPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SCENETREE, scriptIndex)
    return true
  }

  /**
   * Returns `true` if the given group exists.
   *
   * A group exists if any [godot.Node] in the tree belongs to it (see [godot.Node.addToGroup]). Groups without nodes are removed automatically.
   */
  public fun hasGroup(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasGroupPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns a [godot.SceneTreeTimer] which will emit [godot.SceneTreeTimer.timeout] after the given time in seconds elapsed in this [godot.SceneTree].
   *
   * If [processAlways] is set to `false`, pausing the [godot.SceneTree] will also pause the timer.
   *
   * If [processInPhysics] is set to `true`, will update the [godot.SceneTreeTimer] during the physics frame instead of the process frame (fixed framerate processing).
   *
   * If [ignoreTimeScale] is set to `true`, will ignore [godot.Engine.timeScale] and update the [godot.SceneTreeTimer] with the actual frame delta.
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
   * public async Task SomeFunction()
   *
   * {
   *
   *     GD.Print("start");
   *
   *     await ToSignal(GetTree().CreateTimer(1.0f), SceneTreeTimer.SignalName.Timeout);
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
   *
   * **Note:** The timer is processed after all of the nodes in the current frame, i.e. node's [godot.Node.Process] method would be called before the timer (or [godot.Node.PhysicsProcess] if [processInPhysics] is set to `true`).
   */
  @JvmOverloads
  public fun createTimer(
    timeSec: Double,
    processAlways: Boolean = true,
    processInPhysics: Boolean = false,
    ignoreTimeScale: Boolean = false,
  ): SceneTreeTimer? {
    TransferContext.writeArguments(DOUBLE to timeSec, BOOL to processAlways, BOOL to processInPhysics, BOOL to ignoreTimeScale)
    TransferContext.callMethod(rawPtr, MethodBindings.createTimerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as SceneTreeTimer?)
  }

  /**
   * Creates and returns a new [godot.Tween]. The Tween will start automatically on the next process frame or physics frame (depending on [enum Tween.TweenProcessMode]).
   *
   * **Note:** When creating a [godot.Tween] using this method, the [godot.Tween] will not be tied to the [godot.Node] that called it. It will continue to animate even if the [godot.Node] is freed, but it will automatically finish if there's nothing left to animate. If you want the [godot.Tween] to be automatically killed when the [godot.Node] is freed, use [godot.Node.createTween] or [godot.Tween.bindNode].
   */
  public fun createTween(): Tween? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createTweenPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  /**
   * Returns an array of currently existing [godot.Tween]s in the [godot.SceneTree] (both running and paused).
   */
  public fun getProcessedTweens(): VariantArray<Tween> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessedTweensPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Tween>)
  }

  /**
   * Returns the number of nodes in this [godot.SceneTree].
   */
  public fun getNodeCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the current frame number, i.e. the total frame count since the application started.
   */
  public fun getFrame(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFramePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
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
  @JvmOverloads
  public fun quit(exitCode: Int = 0): Unit {
    TransferContext.writeArguments(LONG to exitCode.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.quitPtr, NIL)
  }

  /**
   * Queues the given object for deletion, delaying the call to [godot.Object.free] to the end of the current frame.
   */
  public fun queueDelete(obj: Object): Unit {
    TransferContext.writeArguments(OBJECT to obj)
    TransferContext.callMethod(rawPtr, MethodBindings.queueDeletePtr, NIL)
  }

  /**
   * Calls [method] on each member of the given group, respecting the given [enum GroupCallFlags]. You can pass arguments to [method] by specifying them at the end of the method call. If a node doesn't have the given method or the argument list does not match (either in count or in types), it will be skipped.
   *
   * ```
   * 				# Call the method in a deferred manner and in reverse order.
   * 				get_tree().call_group_flags(SceneTree.GROUP_CALL_DEFERRED | SceneTree.GROUP_CALL_REVERSE)
   * 				```
   *
   * **Note:** Group call flags are used to control the method calling behavior. By default, methods will be called immediately in a way similar to [callGroup]. However, if the [GROUP_CALL_DEFERRED] flag is present in the [flags] argument, methods will be called at the end of the frame in a way similar to [godot.Object.setDeferred].
   */
  public fun callGroupFlags(
    flags: Long,
    group: StringName,
    method: StringName,
    vararg __var_args: Any?,
  ): Unit {
    TransferContext.writeArguments(LONG to flags, STRING_NAME to group, STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, MethodBindings.callGroupFlagsPtr, NIL)
  }

  /**
   * Sends the given notification to all members of the [group], respecting the given [enum GroupCallFlags].
   *
   * **Note:** Group call flags are used to control the notification sending behavior. By default, notifications will be sent immediately in a way similar to [notifyGroup]. However, if the [GROUP_CALL_DEFERRED] flag is present in the [callFlags] argument, notifications will be sent at the end of the current frame in a way similar to using `Object.call_deferred("notification", ...)`.
   */
  public fun notifyGroupFlags(
    callFlags: Long,
    group: StringName,
    notification: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to callFlags, STRING_NAME to group, LONG to notification.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.notifyGroupFlagsPtr, NIL)
  }

  /**
   * Sets the given [property] to [value] on all members of the given group, respecting the given [enum GroupCallFlags].
   *
   * **Note:** Group call flags are used to control the property setting behavior. By default, properties will be set immediately in a way similar to [setGroup]. However, if the [GROUP_CALL_DEFERRED] flag is present in the [callFlags] argument, properties will be set at the end of the frame in a way similar to [godot.Object.callDeferred].
   */
  public fun setGroupFlags(
    callFlags: Long,
    group: StringName,
    `property`: String,
    `value`: Any?,
  ): Unit {
    TransferContext.writeArguments(LONG to callFlags, STRING_NAME to group, STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setGroupFlagsPtr, NIL)
  }

  /**
   * Calls [method] on each member of the given group. You can pass arguments to [method] by specifying them at the end of the method call. If a node doesn't have the given method or the argument list does not match (either in count or in types), it will be skipped.
   *
   * **Note:** [callGroup] will call methods immediately on all members at once, which can cause stuttering if an expensive method is called on lots of members.
   */
  public fun callGroup(
    group: StringName,
    method: StringName,
    vararg __var_args: Any?,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to group, STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, MethodBindings.callGroupPtr, NIL)
  }

  /**
   * Sends the given notification to all members of the [group].
   *
   * **Note:** [notifyGroup] will immediately notify all members at once, which can cause stuttering if an expensive method is called as a result of sending the notification to lots of members.
   */
  public fun notifyGroup(group: StringName, notification: Int): Unit {
    TransferContext.writeArguments(STRING_NAME to group, LONG to notification.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.notifyGroupPtr, NIL)
  }

  /**
   * Sets the given [property] to [value] on all members of the given group.
   *
   * **Note:** [setGroup] will set the property immediately on all members at once, which can cause stuttering if a property with an expensive setter is set on lots of members.
   */
  public fun setGroup(
    group: StringName,
    `property`: String,
    `value`: Any?,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to group, STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setGroupPtr, NIL)
  }

  /**
   * Returns a list of all nodes assigned to the given group.
   */
  public fun getNodesInGroup(group: StringName): VariantArray<Node> {
    TransferContext.writeArguments(STRING_NAME to group)
    TransferContext.callMethod(rawPtr, MethodBindings.getNodesInGroupPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Node>)
  }

  /**
   * Returns the first node in the specified group, or `null` if the group is empty or does not exist.
   */
  public fun getFirstNodeInGroup(group: StringName): Node? {
    TransferContext.writeArguments(STRING_NAME to group)
    TransferContext.callMethod(rawPtr, MethodBindings.getFirstNodeInGroupPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Node?)
  }

  /**
   * Changes the running scene to the one at the given [path], after loading it into a [godot.PackedScene] and creating a new instance.
   *
   * Returns [OK] on success, [ERR_CANT_OPEN] if the [path] cannot be loaded into a [godot.PackedScene], or [ERR_CANT_CREATE] if that scene cannot be instantiated.
   *
   * **Note:** The new scene node is added to the tree at the end of the frame. This ensures that both scenes aren't running at the same time, while still freeing the previous scene in a safe way similar to [godot.Node.queueFree]. As such, you won't be able to access the loaded scene immediately after the [changeSceneToFile] call.
   */
  public fun changeSceneToFile(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.changeSceneToFilePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Changes the running scene to a new instance of the given [godot.PackedScene] (which must be valid).
   *
   * Returns [OK] on success, [ERR_CANT_CREATE] if the scene cannot be instantiated, or [ERR_INVALID_PARAMETER] if the scene is invalid.
   *
   * **Note:** The new scene node is added to the tree at the end of the frame. You won't be able to access it immediately after the [changeSceneToPacked] call.
   */
  public fun changeSceneToPacked(packedScene: PackedScene): GodotError {
    TransferContext.writeArguments(OBJECT to packedScene)
    TransferContext.callMethod(rawPtr, MethodBindings.changeSceneToPackedPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Reloads the currently active scene.
   *
   * Returns [OK] on success, [ERR_UNCONFIGURED] if no [currentScene] was defined yet, [ERR_CANT_OPEN] if [currentScene] cannot be loaded into a [godot.PackedScene], or [ERR_CANT_CREATE] if the scene cannot be instantiated.
   */
  public fun reloadCurrentScene(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.reloadCurrentScenePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If a current scene is loaded, calling this method will unload it.
   */
  public fun unloadCurrentScene(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.unloadCurrentScenePtr, NIL)
  }

  /**
   * Sets a custom [godot.MultiplayerAPI] with the given [rootPath] (controlling also the relative subpaths), or override the default one if [rootPath] is empty.
   *
   * **Note:** No [godot.MultiplayerAPI] must be configured for the subpath containing [rootPath], nested custom multiplayers are not allowed. I.e. if one is configured for `"/root/Foo"` setting one for `"/root/Foo/Bar"` will cause an error.
   */
  @JvmOverloads
  public fun setMultiplayer(multiplayer: MultiplayerAPI, rootPath: NodePath = NodePath("")): Unit {
    TransferContext.writeArguments(OBJECT to multiplayer, NODE_PATH to rootPath)
    TransferContext.callMethod(rawPtr, MethodBindings.setMultiplayerPtr, NIL)
  }

  /**
   * Searches for the [godot.MultiplayerAPI] configured for the given path, if one does not exist it searches the parent paths until one is found. If the path is empty, or none is found, the default one is returned. See [setMultiplayer].
   */
  @JvmOverloads
  public fun getMultiplayer(forPath: NodePath = NodePath("")): MultiplayerAPI? {
    TransferContext.writeArguments(NODE_PATH to forPath)
    TransferContext.callMethod(rawPtr, MethodBindings.getMultiplayerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as MultiplayerAPI?)
  }

  public enum class GroupCallFlags(
    id: Long,
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
     * Call a group at the end of the current frame (process or physics).
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getRootPtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "get_root")

    public val hasGroupPtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "has_group")

    public val isAutoAcceptQuitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "is_auto_accept_quit")

    public val setAutoAcceptQuitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "set_auto_accept_quit")

    public val isQuitOnGoBackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "is_quit_on_go_back")

    public val setQuitOnGoBackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "set_quit_on_go_back")

    public val setDebugCollisionsHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "set_debug_collisions_hint")

    public val isDebuggingCollisionsHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "is_debugging_collisions_hint")

    public val setDebugPathsHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "set_debug_paths_hint")

    public val isDebuggingPathsHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "is_debugging_paths_hint")

    public val setDebugNavigationHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "set_debug_navigation_hint")

    public val isDebuggingNavigationHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "is_debugging_navigation_hint")

    public val setEditedSceneRootPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "set_edited_scene_root")

    public val getEditedSceneRootPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "get_edited_scene_root")

    public val setPausePtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "set_pause")

    public val isPausedPtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "is_paused")

    public val createTimerPtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "create_timer")

    public val createTweenPtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "create_tween")

    public val getProcessedTweensPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "get_processed_tweens")

    public val getNodeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "get_node_count")

    public val getFramePtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "get_frame")

    public val quitPtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "quit")

    public val queueDeletePtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "queue_delete")

    public val callGroupFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "call_group_flags")

    public val notifyGroupFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "notify_group_flags")

    public val setGroupFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "set_group_flags")

    public val callGroupPtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "call_group")

    public val notifyGroupPtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "notify_group")

    public val setGroupPtr: VoidPtr = TypeManager.getMethodBindPtr("SceneTree", "set_group")

    public val getNodesInGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "get_nodes_in_group")

    public val getFirstNodeInGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "get_first_node_in_group")

    public val setCurrentScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "set_current_scene")

    public val getCurrentScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "get_current_scene")

    public val changeSceneToFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "change_scene_to_file")

    public val changeSceneToPackedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "change_scene_to_packed")

    public val reloadCurrentScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "reload_current_scene")

    public val unloadCurrentScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "unload_current_scene")

    public val setMultiplayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "set_multiplayer")

    public val getMultiplayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "get_multiplayer")

    public val setMultiplayerPollEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "set_multiplayer_poll_enabled")

    public val isMultiplayerPollEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "is_multiplayer_poll_enabled")
  }
}
