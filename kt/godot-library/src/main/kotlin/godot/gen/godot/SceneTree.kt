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
 * As one of the most important classes, the [SceneTree] manages the hierarchy of nodes in a scene,
 * as well as scenes themselves. Nodes can be added, fetched and removed. The whole scene tree (and
 * thus the current scene) can be paused. Scenes can be loaded, switched and reloaded.
 * You can also use the [SceneTree] to organize your nodes into **groups**: every node can be added
 * to as many groups as you want to create, e.g. an "enemy" group. You can then iterate these groups or
 * even call methods and set properties on all the nodes belonging to any given group.
 * [SceneTree] is the default [MainLoop] implementation used by the engine, and is thus in charge of
 * the game loop.
 */
@GodotBaseType
public open class SceneTree : MainLoop() {
  /**
   * Emitted any time the tree's hierarchy changes (nodes being moved, renamed, etc.).
   */
  public val treeChanged: Signal0 by signal()

  /**
   * Emitted when the [Node.processMode] of any node inside the tree is changed. Only emitted in the
   * editor, to update the visibility of disabled nodes.
   */
  public val treeProcessModeChanged: Signal0 by signal()

  /**
   * Emitted when the [node] enters this tree.
   */
  public val nodeAdded: Signal1<Node> by signal("node")

  /**
   * Emitted when the [node] exits this tree.
   */
  public val nodeRemoved: Signal1<Node> by signal("node")

  /**
   * Emitted when the [node]'s [Node.name] is changed.
   */
  public val nodeRenamed: Signal1<Node> by signal("node")

  /**
   * Emitted when the [node]'s [Node.updateConfigurationWarnings] is called. Only emitted in the
   * editor.
   */
  public val nodeConfigurationWarningChanged: Signal1<Node> by signal("node")

  /**
   * Emitted immediately before [Node.Process] is called on every node in this tree.
   */
  public val processFrame: Signal0 by signal()

  /**
   * Emitted immediately before [Node.PhysicsProcess] is called on every node in this tree.
   */
  public val physicsFrame: Signal0 by signal()

  /**
   * If `true`, the application automatically accepts quitting requests.
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
   * If `true`, the application quits automatically when navigating back (e.g. using the system
   * "Back" button on Android).
   * To handle 'Go Back' button when this option is disabled, use
   * [DisplayServer.WINDOW_EVENT_GO_BACK_REQUEST].
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
   * If `true`, collision shapes will be visible when running the game from the editor for debugging
   * purposes.
   * **Note:** This property is not designed to be changed at run-time. Changing the value of
   * [debugCollisionsHint] while the project is running will not have the desired effect.
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
   * If `true`, curves from [Path2D] and [Path3D] nodes will be visible when running the game from
   * the editor for debugging purposes.
   * **Note:** This property is not designed to be changed at run-time. Changing the value of
   * [debugPathsHint] while the project is running will not have the desired effect.
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
   * If `true`, navigation polygons will be visible when running the game from the editor for
   * debugging purposes.
   * **Note:** This property is not designed to be changed at run-time. Changing the value of
   * [debugNavigationHint] while the project is running will not have the desired effect.
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
   * If `true`, the scene tree is considered paused. This causes the following behavior:
   * - 2D and 3D physics will be stopped, as well as collision detection and related signals.
   * - Depending on each node's [Node.processMode], their [Node.Process], [Node.PhysicsProcess] and
   * [Node.Input] callback methods may not called anymore.
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
   * The root of the scene currently being edited in the editor. This is usually a direct child of
   * [root].
   * **Note:** This property does nothing in release builds.
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
   * The root node of the currently loaded main scene, usually as a direct child of [root]. See also
   * [changeSceneToFile], [changeSceneToPacked], and [reloadCurrentScene].
   * **Warning:** Setting this property directly may not work as expected, as it does *not* add or
   * remove any nodes from this tree.
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
   * The tree's root [Window]. This is top-most [Node] of the scene tree, and is always present. An
   * absolute [NodePath] always starts from this node. Children of the root node may include the loaded
   * [currentScene], as well as any
   * [url=$DOCS_URL/tutorials/scripting/singletons_autoload.html]AutoLoad[/url] configured in the
   * Project Settings.
   * **Warning:** Do not delete this node. This will result in unstable behavior, followed by a
   * crash.
   */
  public val root: Window?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRootPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Window?)
    }

  /**
   * If `true` (default value), enables automatic polling of the [MultiplayerAPI] for this SceneTree
   * during [signal process_frame].
   * If `false`, you need to manually call [MultiplayerAPI.poll] to process network packets and
   * deliver RPCs. This allows running RPCs in a different loop (e.g. physics, thread, specific time
   * step) and for manual [Mutex] protection when accessing the [MultiplayerAPI] from threads.
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

  /**
   * If `true`, the renderer will interpolate the transforms of physics objects between the last two
   * transforms, so that smooth motion is seen even when physics ticks do not coincide with rendered
   * frames.
   * The default value of this property is controlled by
   * [ProjectSettings.physics/common/physicsInterpolation].
   */
  public var physicsInterpolation: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isPhysicsInterpolationEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsInterpolationEnabledPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SCENETREE, scriptIndex)
  }

  /**
   * Returns `true` if a node added to the given group [name] exists in the tree.
   */
  public fun hasGroup(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasGroupPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns a new [SceneTreeTimer]. After [timeSec] in seconds have passed, the timer will emit
   * [signal SceneTreeTimer.timeout] and will be automatically freed.
   * If [processAlways] is `false`, the timer will be paused when setting [SceneTree.paused] to
   * `true`.
   * If [processInPhysics] is `true`, the timer will update at the end of the physics frame, instead
   * of the process frame.
   * If [ignoreTimeScale] is `true`, the timer will ignore [Engine.timeScale] and update with the
   * real, elapsed time.
   * This method is commonly used to create a one-shot delay timer, as in the following example:
   *
   * gdscript:
   * ```gdscript
   * func some_function():
   *     print("start")
   *     await get_tree().create_timer(1.0).timeout
   *     print("end")
   * ```
   * csharp:
   * ```csharp
   * public async Task SomeFunction()
   * {
   *     GD.Print("start");
   *     await ToSignal(GetTree().CreateTimer(1.0f), SceneTreeTimer.SignalName.Timeout);
   *     GD.Print("end");
   * }
   * ```
   *
   * **Note:** The timer is always updated *after* all of the nodes in the tree. A node's
   * [Node.Process] method would be called before the timer updates (or [Node.PhysicsProcess] if
   * [processInPhysics] is set to `true`).
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
   * Creates and returns a new [Tween] processed in this tree. The Tween will start automatically on
   * the next process frame or physics frame (depending on its [Tween.TweenProcessMode]).
   * **Note:** A [Tween] created using this method is not bound to any [Node]. It may keep working
   * until there is nothing left to animate. If you want the [Tween] to be automatically killed when
   * the [Node] is freed, use [Node.createTween] or [Tween.bindNode].
   */
  public fun createTween(): Tween? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createTweenPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  /**
   * Returns an [Array] of currently existing [Tween]s in the tree, including paused tweens.
   */
  public fun getProcessedTweens(): VariantArray<Tween> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessedTweensPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Tween>)
  }

  /**
   * Returns the number of nodes inside this tree.
   */
  public fun getNodeCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns how many frames have been processed, since the application started. This is *not* a
   * measurement of elapsed time.
   */
  public fun getFrame(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFramePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Quits the application at the end of the current iteration, with the given [exitCode].
   * By convention, an exit code of `0` indicates success, whereas any other exit code indicates an
   * error. For portability reasons, it should be between `0` and `125` (inclusive).
   * **Note:** On iOS this method doesn't work. Instead, as recommended by the
   * [url=https://developer.apple.com/library/archive/qa/qa1561/_index.html]iOS Human Interface
   * Guidelines[/url], the user is expected to close apps via the Home button.
   */
  @JvmOverloads
  public fun quit(exitCode: Int = 0): Unit {
    TransferContext.writeArguments(LONG to exitCode.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.quitPtr, NIL)
  }

  /**
   * Queues the given [obj] to be deleted, calling its [Object.free] at the end of the current
   * frame. This method is similar to [Node.queueFree].
   */
  public fun queueDelete(obj: Object): Unit {
    TransferContext.writeArguments(OBJECT to obj)
    TransferContext.callMethod(rawPtr, MethodBindings.queueDeletePtr, NIL)
  }

  /**
   * Calls the given [method] on each node inside this tree added to the given [group]. Use [flags]
   * to customize this method's behavior (see [GroupCallFlags]). Additional arguments for [method] can
   * be passed at the end of this method. Nodes that cannot call [method] (either because the method
   * doesn't exist or the arguments do not match) are ignored.
   * [codeblock]
   * # Calls "hide" to all nodes of the "enemies" group, at the end of the frame and in reverse tree
   * order.
   * get_tree().call_group_flags(
   *         SceneTree.GROUP_CALL_DEFERRED | SceneTree.GROUP_CALL_REVERSE,
   *         "enemies", "hide")
   * [/codeblock]
   * **Note:** In C#, [method] must be in snake_case when referring to built-in Godot methods.
   * Prefer using the names exposed in the `MethodName` class to avoid allocating a new [StringName] on
   * each call.
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
   * Calls [Object.notification] with the given [notification] to all nodes inside this tree added
   * to the [group]. Use [callFlags] to customize this method's behavior (see [GroupCallFlags]).
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
   * Sets the given [property] to [value] on all nodes inside this tree added to the given [group].
   * Nodes that do not have the [property] are ignored. Use [callFlags] to customize this method's
   * behavior (see [GroupCallFlags]).
   * **Note:** In C#, [property] must be in snake_case when referring to built-in Godot properties.
   * Prefer using the names exposed in the `PropertyName` class to avoid allocating a new [StringName]
   * on each call.
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
   * Calls [method] on each node inside this tree added to the given [group]. You can pass arguments
   * to [method] by specifying them at the end of this method call. Nodes that cannot call [method]
   * (either because the method doesn't exist or the arguments do not match) are ignored. See also
   * [setGroup] and [notifyGroup].
   * **Note:** This method acts immediately on all selected nodes at once, which may cause
   * stuttering in some performance-intensive situations.
   * **Note:** In C#, [method] must be in snake_case when referring to built-in Godot methods.
   * Prefer using the names exposed in the `MethodName` class to avoid allocating a new [StringName] on
   * each call.
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
   * Calls [Object.notification] with the given [notification] to all nodes inside this tree added
   * to the [group]. See also [url=$DOCS_URL/tutorials/best_practices/godot_notifications.html]Godot
   * notifications[/url] and [callGroup] and [setGroup].
   * **Note:** This method acts immediately on all selected nodes at once, which may cause
   * stuttering in some performance-intensive situations.
   */
  public fun notifyGroup(group: StringName, notification: Int): Unit {
    TransferContext.writeArguments(STRING_NAME to group, LONG to notification.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.notifyGroupPtr, NIL)
  }

  /**
   * Sets the given [property] to [value] on all nodes inside this tree added to the given [group].
   * Nodes that do not have the [property] are ignored. See also [callGroup] and [notifyGroup].
   * **Note:** This method acts immediately on all selected nodes at once, which may cause
   * stuttering in some performance-intensive situations.
   * **Note:** In C#, [property] must be in snake_case when referring to built-in Godot properties.
   * Prefer using the names exposed in the `PropertyName` class to avoid allocating a new [StringName]
   * on each call.
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
   * Returns an [Array] containing all nodes inside this tree, that have been added to the given
   * [group], in scene hierarchy order.
   */
  public fun getNodesInGroup(group: StringName): VariantArray<Node> {
    TransferContext.writeArguments(STRING_NAME to group)
    TransferContext.callMethod(rawPtr, MethodBindings.getNodesInGroupPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Node>)
  }

  /**
   * Returns the first [Node] found inside the tree, that has been added to the given [group], in
   * scene hierarchy order. Returns `null` if no match is found. See also [getNodesInGroup].
   */
  public fun getFirstNodeInGroup(group: StringName): Node? {
    TransferContext.writeArguments(STRING_NAME to group)
    TransferContext.callMethod(rawPtr, MethodBindings.getFirstNodeInGroupPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Node?)
  }

  /**
   * Returns the number of nodes assigned to the given group.
   */
  public fun getNodeCountInGroup(group: StringName): Int {
    TransferContext.writeArguments(STRING_NAME to group)
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeCountInGroupPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Changes the running scene to the one at the given [path], after loading it into a [PackedScene]
   * and creating a new instance.
   * Returns [OK] on success, [ERR_CANT_OPEN] if the [path] cannot be loaded into a [PackedScene],
   * or [ERR_CANT_CREATE] if that scene cannot be instantiated.
   * **Note:** See [changeSceneToPacked] for details on the order of operations.
   */
  public fun changeSceneToFile(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.changeSceneToFilePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Changes the running scene to a new instance of the given [PackedScene] (which must be valid).
   * Returns [OK] on success, [ERR_CANT_CREATE] if the scene cannot be instantiated, or
   * [ERR_INVALID_PARAMETER] if the scene is invalid.
   * **Note:** Operations happen in the following order when [changeSceneToPacked] is called:
   * 1. The current scene node is immediately removed from the tree. From that point, [Node.getTree]
   * called on the current (outgoing) scene will return `null`. [currentScene] will be `null`, too,
   * because the new scene is not available yet.
   * 2. At the end of the frame, the formerly current scene, already removed from the tree, will be
   * deleted (freed from memory) and then the new scene will be instantiated and added to the tree.
   * [Node.getTree] and [currentScene] will be back to working as usual.
   * This ensures that both scenes aren't running at the same time, while still freeing the previous
   * scene in a safe way similar to [Node.queueFree].
   */
  public fun changeSceneToPacked(packedScene: PackedScene): GodotError {
    TransferContext.writeArguments(OBJECT to packedScene)
    TransferContext.callMethod(rawPtr, MethodBindings.changeSceneToPackedPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Reloads the currently active scene, replacing [currentScene] with a new instance of its
   * original [PackedScene].
   * Returns [OK] on success, [ERR_UNCONFIGURED] if no [currentScene] is defined, [ERR_CANT_OPEN] if
   * [currentScene] cannot be loaded into a [PackedScene], or [ERR_CANT_CREATE] if the scene cannot be
   * instantiated.
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
   * Sets a custom [MultiplayerAPI] with the given [rootPath] (controlling also the relative
   * subpaths), or override the default one if [rootPath] is empty.
   * **Note:** No [MultiplayerAPI] must be configured for the subpath containing [rootPath], nested
   * custom multiplayers are not allowed. I.e. if one is configured for `"/root/Foo"` setting one for
   * `"/root/Foo/Bar"` will cause an error.
   */
  @JvmOverloads
  public fun setMultiplayer(multiplayer: MultiplayerAPI, rootPath: NodePath = NodePath("")): Unit {
    TransferContext.writeArguments(OBJECT to multiplayer, NODE_PATH to rootPath)
    TransferContext.callMethod(rawPtr, MethodBindings.setMultiplayerPtr, NIL)
  }

  /**
   * Searches for the [MultiplayerAPI] configured for the given path, if one does not exist it
   * searches the parent paths until one is found. If the path is empty, or none is found, the default
   * one is returned. See [setMultiplayer].
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
     * Call nodes within a group with no special behavior (default).
     */
    GROUP_CALL_DEFAULT(0),
    /**
     * Call nodes within a group in reverse tree hierarchy order (all nested children are called
     * before their respective parent nodes).
     */
    GROUP_CALL_REVERSE(1),
    /**
     * Call nodes within a group at the end of the current frame (can be either process or physics
     * frame), similar to [Object.callDeferred].
     */
    GROUP_CALL_DEFERRED(2),
    /**
     * Call nodes within a group only once, even if the call is executed many times in the same
     * frame. Must be combined with [GROUP_CALL_DEFERRED] to work.
     * **Note:** Different arguments are not taken into account. Therefore, when the same call is
     * executed with different arguments, only the first call will be performed.
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

    public val setPhysicsInterpolationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "set_physics_interpolation_enabled")

    public val isPhysicsInterpolationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "is_physics_interpolation_enabled")

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

    public val getNodeCountInGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneTree", "get_node_count_in_group")

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
