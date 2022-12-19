// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.PackedStringArray
import godot.core.StringName
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
import godot.core.asStringName
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.camelToSnakeCase
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KFunction0
import kotlin.reflect.KFunction1
import kotlin.reflect.KFunction10
import kotlin.reflect.KFunction2
import kotlin.reflect.KFunction3
import kotlin.reflect.KFunction4
import kotlin.reflect.KFunction5
import kotlin.reflect.KFunction6
import kotlin.reflect.KFunction7
import kotlin.reflect.KFunction8
import kotlin.reflect.KFunction9

/**
 * Base class for all *scene* objects.
 *
 * Tutorials:
 * [https://github.com/godotengine/godot-demo-projects/](https://github.com/godotengine/godot-demo-projects/)
 *
 * Nodes are Godot's building blocks. They can be assigned as the child of another node, resulting in a tree arrangement. A given node can contain any number of nodes as children with the requirement that all siblings (direct children of a node) should have unique names.
 *
 * A tree of nodes is called a *scene*. Scenes can be saved to the disk and then instantiated into other scenes. This allows for very high flexibility in the architecture and data model of Godot projects.
 *
 * **Scene tree:** The [godot.SceneTree] contains the active tree of nodes. When a node is added to the scene tree, it receives the [NOTIFICATION_ENTER_TREE] notification and its [_enterTree] callback is triggered. Child nodes are always added *after* their parent node, i.e. the [_enterTree] callback of a parent node will be triggered before its child's.
 *
 * Once all nodes have been added in the scene tree, they receive the [NOTIFICATION_READY] notification and their respective [_ready] callbacks are triggered. For groups of nodes, the [_ready] callback is called in reverse order, starting with the children and moving up to the parent nodes.
 *
 * This means that when adding a node to the scene tree, the following order will be used for the callbacks: [_enterTree] of the parent, [_enterTree] of the children, [_ready] of the children and finally [_ready] of the parent (recursively for the entire scene tree).
 *
 * **Processing:** Nodes can override the "process" state, so that they receive a callback on each frame requesting them to process (do something). Normal processing (callback [_process], toggled with [setProcess]) happens as fast as possible and is dependent on the frame rate, so the processing time *delta* (in seconds) is passed as an argument. Physics processing (callback [_physicsProcess], toggled with [setPhysicsProcess]) happens a fixed number of times per second (60 by default) and is useful for code related to the physics engine.
 *
 * Nodes can also process input events. When present, the [_input] function will be called for each input that the program receives. In many cases, this can be overkill (unless used for simple projects), and the [_unhandledInput] function might be preferred; it is called when the input event was not handled by anyone else (typically, GUI [godot.Control] nodes), ensuring that the node only receives the events that were meant for it.
 *
 * To keep track of the scene hierarchy (especially when instancing scenes into other scenes), an "owner" can be set for the node with the [owner] property. This keeps track of who instantiated what. This is mostly useful when writing editors and tools, though.
 *
 * Finally, when a node is freed with [godot.Object.free] or [queueFree], it will also free all its children.
 *
 * **Groups:** Nodes can be added to as many groups as you want to be easy to manage, you could create groups like "enemies" or "collectables" for example, depending on your game. See [addToGroup], [isInGroup] and [removeFromGroup]. You can then retrieve all nodes in these groups, iterate them and even call methods on groups via the methods on [godot.SceneTree].
 *
 * **Networking with nodes:** After connecting to a server (or making one, see [godot.ENetMultiplayerPeer]), it is possible to use the built-in RPC (remote procedure call) system to communicate over the network. By calling [rpc] with a method name, it will be called locally and in all connected peers (peers = clients and the server that accepts connections). To identify which node receives the RPC call, Godot will use its [godot.core.NodePath] (make sure node names are the same on all peers). Also, take a look at the high-level networking tutorial and corresponding demos.
 *
 * **Note:** The `script` property is part of the [godot.Object] class, not [godot.Node]. It isn't exposed like most properties but does have a setter and getter (`set_script()` and `get_script()`).
 */
@GodotBaseType
public open class Node : Object() {
  /**
   * Emitted when the node is renamed.
   */
  public val renamed: Signal0 by signal()

  public val childExitedTree: Signal1<Node> by signal("node")

  /**
   * Emitted when the node is ready. Comes after [_ready] callback and follows the same rules.
   */
  public val ready: Signal0 by signal()

  /**
   * Emitted when the node enters the tree.
   *
   * This signal is emitted *after* the related [NOTIFICATION_ENTER_TREE] notification.
   */
  public val treeEntered: Signal0 by signal()

  /**
   * Emitted when the node is still active but about to exit the tree. This is the right place for de-initialization (or a "destructor", if you will).
   *
   * This signal is emitted *before* the related [NOTIFICATION_EXIT_TREE] notification.
   */
  public val treeExiting: Signal0 by signal()

  /**
   * Emitted when a child node enters the scene tree, either because it entered on its own or because this node entered with it.
   *
   * This signal is emitted *after* the child node's own [NOTIFICATION_ENTER_TREE] and [treeEntered].
   */
  public val childEnteredTree: Signal1<Node> by signal("node")

  /**
   * Emitted after the node exits the tree and is no longer active.
   */
  public val treeExited: Signal0 by signal()

  /**
   * The name of the node. This name is unique among the siblings (other child nodes from the same parent). When set to an existing name, the node will be automatically renamed.
   *
   * **Note:** Auto-generated names might include the `@` character, which is reserved for unique names when using [addChild]. When setting the name manually, any `@` will be removed.
   */
  public var name: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_NAME, STRING_NAME)
      return TransferContext.readReturnValue(STRING_NAME, false) as StringName
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_NAME, NIL)
    }

  /**
   * If a scene is instantiated from a file, its topmost node contains the absolute file path from which it was loaded in [sceneFilePath] (e.g. `res://levels/1.tscn`). Otherwise, [sceneFilePath] is set to an empty string.
   */
  public var sceneFilePath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_SCENE_FILE_PATH, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_SCENE_FILE_PATH, NIL)
    }

  /**
   * The node owner. A node can have any other node as owner (as long as it is a valid parent, grandparent, etc. ascending in the tree). When saving a node (using [godot.PackedScene]), all the nodes it owns will be saved with it. This allows for the creation of complex [godot.SceneTree]s, with instancing and subinstancing.
   *
   * **Note:** If you want a child to be persisted to a [godot.PackedScene], you must set [owner] in addition to calling [addChild]. This is typically relevant for [tool scripts]($DOCS_URL/tutorials/plugins/running_code_in_the_editor.html) and [editor plugins]($DOCS_URL/tutorials/plugins/editor/index.html). If [addChild] is called without setting [owner], the newly added [godot.Node] will not be visible in the scene tree, though it will be visible in the 2D/3D view.
   */
  public var owner: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_OWNER, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Node?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_OWNER, NIL)
    }

  /**
   * The [godot.MultiplayerAPI] instance associated with this node. See [godot.SceneTree.getMultiplayer].
   */
  public val multiplayer: MultiplayerAPI?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_MULTIPLAYER, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as MultiplayerAPI?
    }

  public var customMultiplayer: MultiplayerAPI?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_CUSTOM_MULTIPLAYER,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as MultiplayerAPI?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_CUSTOM_MULTIPLAYER, NIL)
    }

  /**
   * Can be used to pause or unpause the node, or make the node paused based on the [godot.SceneTree], or make it inherit the process mode from its parent (default).
   */
  public var processMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_PROCESS_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PROCESS_MODE, NIL)
    }

  /**
   * The node's priority in the execution order of the enabled processing callbacks (i.e. [NOTIFICATION_PROCESS], [NOTIFICATION_PHYSICS_PROCESS] and their internal counterparts). Nodes whose process priority value is *lower* will have their processing callbacks executed first.
   */
  public var processPriority: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_PROCESS_PRIORITY, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PROCESS_PRIORITY, NIL)
    }

  /**
   * Add a custom description to a node. It will be displayed in a tooltip when hovered in editor's scene tree.
   */
  public var editorDescription: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_EDITOR_DESCRIPTION,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_EDITOR_DESCRIPTION, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NODE, scriptIndex)
    return true
  }

  public inline fun <reified FUNCTION : KFunction0<*>> rpc(function: FUNCTION) =
      rpc(function.name.camelToSnakeCase().asStringName())

  public inline fun <reified FUNCTION : KFunction0<*>> rpcId(id: Long, function: FUNCTION) =
      rpcId(id, function.name.camelToSnakeCase().asStringName())

  public inline fun <ARG0, reified FUNCTION : KFunction1<ARG0, *>> rpc(function: FUNCTION,
      arg0: ARG0) = rpc(function.name.camelToSnakeCase().asStringName(), arg0)

  public inline fun <ARG0, reified FUNCTION : KFunction1<ARG0, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0
  ) = rpcId(id, function.name.camelToSnakeCase().asStringName(), arg0)

  public inline fun <ARG0, ARG1, reified FUNCTION : KFunction2<ARG0, ARG1, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1
  ) = rpc(function.name.camelToSnakeCase().asStringName(), arg0, arg1)

  public inline fun <ARG0, ARG1, reified FUNCTION : KFunction2<ARG0, ARG1, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1
  ) = rpcId(id, function.name.camelToSnakeCase().asStringName(), arg0, arg1)

  public inline fun <ARG0, ARG1, ARG2, reified FUNCTION : KFunction3<ARG0, ARG1, ARG2, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2
  ) = rpc(function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2)

  public inline fun <ARG0, ARG1, ARG2, reified FUNCTION : KFunction3<ARG0, ARG1, ARG2, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2
  ) = rpcId(id, function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2)

  public inline fun <ARG0, ARG1, ARG2, ARG3, reified FUNCTION :
      KFunction4<ARG0, ARG1, ARG2, ARG3, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3
  ) = rpc(function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3)

  public inline fun <ARG0, ARG1, ARG2, ARG3, reified FUNCTION :
      KFunction4<ARG0, ARG1, ARG2, ARG3, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3
  ) = rpcId(id, function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, reified FUNCTION :
      KFunction5<ARG0, ARG1, ARG2, ARG3, ARG4, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4
  ) = rpc(function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3, arg4)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, reified FUNCTION :
      KFunction5<ARG0, ARG1, ARG2, ARG3, ARG4, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4
  ) = rpcId(id, function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3, arg4)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, reified FUNCTION :
      KFunction6<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5
  ) = rpc(function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3, arg4, arg5)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, reified FUNCTION :
      KFunction6<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5
  ) = rpcId(id, function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3, arg4, arg5)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, reified FUNCTION :
      KFunction7<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6
  ) = rpc(function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3, arg4, arg5, arg6)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, reified FUNCTION :
      KFunction7<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6
  ) = rpcId(id, function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3, arg4, arg5,
      arg6)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, reified FUNCTION :
      KFunction8<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7
  ) = rpc(function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3, arg4, arg5, arg6,
      arg7)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, reified FUNCTION :
      KFunction8<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7
  ) = rpcId(id, function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3, arg4, arg5,
      arg6, arg7)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, reified FUNCTION :
      KFunction9<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8
  ) = rpc(function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3, arg4, arg5, arg6,
      arg7, arg8)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, reified FUNCTION :
      KFunction9<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8
  ) = rpcId(id, function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3, arg4, arg5,
      arg6, arg7, arg8)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, reified FUNCTION :
      KFunction10<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8,
    arg9: ARG9
  ) = rpc(function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3, arg4, arg5, arg6,
      arg7, arg8, arg9)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, reified FUNCTION :
      KFunction10<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, ARG7, ARG8, ARG9, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
    arg7: ARG7,
    arg8: ARG8,
    arg9: ARG9
  ) = rpcId(id, function.name.camelToSnakeCase().asStringName(), arg0, arg1, arg2, arg3, arg4, arg5,
      arg6, arg7, arg8, arg9)

  /**
   * Called during the processing step of the main loop. Processing happens at every frame and as fast as possible, so the [delta] time since the previous frame is not constant. [delta] is in seconds.
   *
   * It is only called if processing is enabled, which is done automatically if this method is overridden, and can be toggled with [setProcess].
   *
   * Corresponds to the [NOTIFICATION_PROCESS] notification in [godot.Object.Notification].
   *
   * **Note:** This method is only called if the node is present in the scene tree (i.e. if it's not an orphan).
   */
  public open fun _process(delta: Double): Unit {
  }

  /**
   * Called during the physics processing step of the main loop. Physics processing means that the frame rate is synced to the physics, i.e. the [delta] variable should be constant. [delta] is in seconds.
   *
   * It is only called if physics processing is enabled, which is done automatically if this method is overridden, and can be toggled with [setPhysicsProcess].
   *
   * Corresponds to the [NOTIFICATION_PHYSICS_PROCESS] notification in [godot.Object.Notification].
   *
   * **Note:** This method is only called if the node is present in the scene tree (i.e. if it's not an orphan).
   */
  public open fun _physicsProcess(delta: Double): Unit {
  }

  /**
   * Called when the node enters the [godot.SceneTree] (e.g. upon instancing, scene changing, or after calling [addChild] in a script). If the node has children, its [_enterTree] callback will be called first, and then that of the children.
   *
   * Corresponds to the [NOTIFICATION_ENTER_TREE] notification in [godot.Object.Notification].
   */
  public open fun _enterTree(): Unit {
  }

  /**
   * Called when the node is about to leave the [godot.SceneTree] (e.g. upon freeing, scene changing, or after calling [removeChild] in a script). If the node has children, its [_exitTree] callback will be called last, after all its children have left the tree.
   *
   * Corresponds to the [NOTIFICATION_EXIT_TREE] notification in [godot.Object.Notification] and signal [treeExiting]. To get notified when the node has already left the active tree, connect to the [treeExited].
   */
  public open fun _exitTree(): Unit {
  }

  /**
   * Called when the node is "ready", i.e. when both the node and its children have entered the scene tree. If the node has children, their [_ready] callbacks get triggered first, and the parent node will receive the ready notification afterwards.
   *
   * Corresponds to the [NOTIFICATION_READY] notification in [godot.Object.Notification]. See also the `@onready` annotation for variables.
   *
   * Usually used for initialization. For even earlier initialization, [godot.Object.Init] may be used. See also [_enterTree].
   *
   * **Note:** [_ready] may be called only once for each node. After removing a node from the scene tree and adding it again, `_ready` will not be called a second time. This can be bypassed by requesting another call with [requestReady], which may be called anywhere before adding the node again.
   */
  public open fun _ready(): Unit {
  }

  /**
   * The elements in the array returned from this method are displayed as warnings in the Scene dock if the script that overrides it is a `tool` script.
   *
   * Returning an empty array produces no warnings.
   *
   * Call [updateConfigurationWarnings] when the warnings need to be updated for this node.
   */
  public open fun _getConfigurationWarnings(): PackedStringArray {
    throw NotImplementedError("_get_configuration_warnings is not implemented for Node")
  }

  /**
   * Called when there is an input event. The input event propagates up through the node tree until a node consumes it.
   *
   * It is only called if input processing is enabled, which is done automatically if this method is overridden, and can be toggled with [setProcessInput].
   *
   * To consume the input event and stop it propagating further to other nodes, [godot.Viewport.setInputAsHandled] can be called.
   *
   * For gameplay input, [_unhandledInput] and [_unhandledKeyInput] are usually a better fit as they allow the GUI to intercept the events first.
   *
   * **Note:** This method is only called if the node is present in the scene tree (i.e. if it's not an orphan).
   */
  public open fun _input(event: InputEvent): Unit {
  }

  /**
   * Called when an [godot.InputEvent] hasn't been consumed by [_input] or any GUI [godot.Control] item. The input event propagates up through the node tree until a node consumes it.
   *
   * It is only called if unhandled input processing is enabled, which is done automatically if this method is overridden, and can be toggled with [setProcessUnhandledInput].
   *
   * To consume the input event and stop it propagating further to other nodes, [godot.Viewport.setInputAsHandled] can be called.
   *
   * For gameplay input, this and [_unhandledKeyInput] are usually a better fit than [_input] as they allow the GUI to intercept the events first.
   *
   * **Note:** This method is only called if the node is present in the scene tree (i.e. if it's not an orphan).
   */
  public open fun _unhandledInput(event: InputEvent): Unit {
  }

  /**
   * Called when an [godot.InputEventKey] hasn't been consumed by [_input] or any GUI [godot.Control] item. The input event propagates up through the node tree until a node consumes it.
   *
   * It is only called if unhandled key input processing is enabled, which is done automatically if this method is overridden, and can be toggled with [setProcessUnhandledKeyInput].
   *
   * To consume the input event and stop it propagating further to other nodes, [godot.Viewport.setInputAsHandled] can be called.
   *
   * This method can be used to handle Unicode character input with [kbd]Alt[/kbd], [kbd]Alt + Ctrl[/kbd], and [kbd]Alt + Shift[/kbd] modifiers, after shortcuts were handled.
   *
   * For gameplay input, this and [_unhandledInput] are usually a better fit than [_input] as they allow the GUI to intercept the events first.
   *
   * This method also performs better than [_unhandledInput], since unrelated events such as [godot.InputEventMouseMotion] are automatically filtered.
   *
   * **Note:** This method is only called if the node is present in the scene tree (i.e. if it's not an orphan).
   */
  public open fun _unhandledKeyInput(event: InputEvent): Unit {
  }

  /**
   * Adds a [sibling] node to current's node parent, at the same level as that node, right below it.
   *
   * If [forceReadableName] is `true`, improves the readability of the added [sibling]. If not named, the [sibling] is renamed to its type, and if it shares [name] with a sibling, a number is suffixed more appropriately. This operation is very slow. As such, it is recommended leaving this to `false`, which assigns a dummy name featuring `@` in both situations.
   *
   * Use [addChild] instead of this method if you don't need the child node to be added below a specific node in the list of children.
   *
   * **Note:** If this node is internal, the new sibling will be internal too (see `internal` parameter in [addChild]).
   */
  public fun addSibling(sibling: Node, legibleUniqueName: Boolean = false): Unit {
    TransferContext.writeArguments(OBJECT to sibling, BOOL to legibleUniqueName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_ADD_SIBLING, NIL)
  }

  /**
   * Adds a child [node]. Nodes can have any number of children, but every child must have a unique name. Child nodes are automatically deleted when the parent node is deleted, so an entire scene can be removed by deleting its topmost node.
   *
   * If [forceReadableName] is `true`, improves the readability of the added [node]. If not named, the [node] is renamed to its type, and if it shares [name] with a sibling, a number is suffixed more appropriately. This operation is very slow. As such, it is recommended leaving this to `false`, which assigns a dummy name featuring `@` in both situations.
   *
   * If [internal] is different than [INTERNAL_MODE_DISABLED], the child will be added as internal node. Such nodes are ignored by methods like [getChildren], unless their parameter `include_internal` is `true`.The intended usage is to hide the internal nodes from the user, so the user won't accidentally delete or modify them. Used by some GUI nodes, e.g. [godot.ColorPicker]. See [enum InternalMode] for available modes.
   *
   * **Note:** If the child node already has a parent, the function will fail. Use [removeChild] first to remove the node from its current parent. For example:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var child_node = get_child(0)
   *
   * if child_node.get_parent():
   *
   *     child_node.get_parent().remove_child(child_node)
   *
   * add_child(child_node)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * Node childNode = GetChild(0);
   *
   * if (childNode.GetParent() != null)
   *
   * {
   *
   *     childNode.GetParent().RemoveChild(childNode);
   *
   * }
   *
   * AddChild(childNode);
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * If you need the child node to be added below a specific node in the list of children, use [addSibling] instead of this method.
   *
   * **Note:** If you want a child to be persisted to a [godot.PackedScene], you must set [owner] in addition to calling [addChild]. This is typically relevant for [tool scripts]($DOCS_URL/tutorials/plugins/running_code_in_the_editor.html) and [editor plugins]($DOCS_URL/tutorials/plugins/editor/index.html). If [addChild] is called without setting [owner], the newly added [godot.Node] will not be visible in the scene tree, though it will be visible in the 2D/3D view.
   */
  public fun addChild(
    node: Node,
    legibleUniqueName: Boolean = false,
    `internal`: Node.InternalMode = Node.InternalMode.INTERNAL_MODE_DISABLED
  ): Unit {
    TransferContext.writeArguments(OBJECT to node, BOOL to legibleUniqueName, LONG to internal.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_ADD_CHILD, NIL)
  }

  /**
   * Removes a child node. The node is NOT deleted and must be deleted manually.
   *
   * **Note:** This function may set the [owner] of the removed Node (or its descendants) to be `null`, if that [owner] is no longer a parent or ancestor.
   */
  public fun removeChild(node: Node): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_REMOVE_CHILD, NIL)
  }

  /**
   * Returns the number of child nodes.
   *
   * If [includeInternal] is `false`, internal children aren't counted (see `internal` parameter in [addChild]).
   */
  public fun getChildCount(includeInternal: Boolean = false): Long {
    TransferContext.writeArguments(BOOL to includeInternal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_CHILD_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns an array of references to node's children.
   *
   * If [includeInternal] is `false`, the returned array won't include internal children (see `internal` parameter in [addChild]).
   */
  public fun getChildren(includeInternal: Boolean = false): VariantArray<Any?> {
    TransferContext.writeArguments(BOOL to includeInternal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_CHILDREN, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns a child node by its index (see [getChildCount]). This method is often used for iterating all children of a node.
   *
   * Negative indices access the children from the last one.
   *
   * If [includeInternal] is `false`, internal children are skipped (see `internal` parameter in [addChild]).
   *
   * To access a child node via its name, use [getNode].
   */
  public fun getChild(idx: Long, includeInternal: Boolean = false): Node? {
    TransferContext.writeArguments(LONG to idx, BOOL to includeInternal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_CHILD, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Returns `true` if the node that the [godot.core.NodePath] points to exists.
   */
  public fun hasNode(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_HAS_NODE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Fetches a node. The [godot.core.NodePath] can be either a relative path (from the current node) or an absolute path (in the scene tree) to a node. If the path does not exist, `null` is returned and an error is logged. Attempts to access methods on the return value will result in an "Attempt to call <method> on a null instance." error.
   *
   * **Note:** Fetching absolute paths only works when the node is inside the scene tree (see [isInsideTree]).
   *
   * **Example:** Assume your current node is Character and the following tree:
   *
   * ```
   * 				/root
   * 				/root/Character
   * 				/root/Character/Sword
   * 				/root/Character/Backpack/Dagger
   * 				/root/MyGame
   * 				/root/Swamp/Alligator
   * 				/root/Swamp/Mosquito
   * 				/root/Swamp/Goblin
   * 				```
   *
   * Possible paths are:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * get_node("Sword")
   *
   * get_node("Backpack/Dagger")
   *
   * get_node("../Swamp/Alligator")
   *
   * get_node("/root/MyGame")
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * GetNode("Sword");
   *
   * GetNode("Backpack/Dagger");
   *
   * GetNode("../Swamp/Alligator");
   *
   * GetNode("/root/MyGame");
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun getNode(path: NodePath): Node? {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_NODE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Similar to [getNode], but does not log an error if [path] does not point to a valid [godot.Node].
   */
  public fun getNodeOrNull(path: NodePath): Node? {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_NODE_OR_NULL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Returns the parent node of the current node, or `null` if the node lacks a parent.
   */
  public fun getParent(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_PARENT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  public fun findNodes(
    mask: String,
    type: String = "",
    recursive: Boolean = true,
    owned: Boolean = true
  ): VariantArray<Any?> {
    TransferContext.writeArguments(STRING to mask, STRING to type, BOOL to recursive, BOOL to owned)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_FIND_NODES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Finds the first parent of the current node whose name matches [pattern] as in [godot.String.match].
   *
   * [pattern] does not match against the full path, just against individual node names. It is case-sensitive, with `"*"` matching zero or more characters and `"?"` matching any single character except `"."`).
   *
   * **Note:** As this method walks upwards in the scene tree, it can be slow in large, deeply nested scene trees. Whenever possible, consider using [getNode] with unique names instead (see [uniqueNameInOwner]), or caching the node references into variable.
   */
  public fun findParent(mask: String): Node? {
    TransferContext.writeArguments(STRING to mask)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_FIND_PARENT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Returns `true` if the [godot.core.NodePath] points to a valid node and its subname points to a valid resource, e.g. `Area2D/CollisionShape2D:shape`. Properties with a non-[godot.Resource] type (e.g. nodes or primitive math types) are not considered resources.
   */
  public fun hasNodeAndResource(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_HAS_NODE_AND_RESOURCE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Fetches a node and one of its resources as specified by the [godot.core.NodePath]'s subname (e.g. `Area2D/CollisionShape2D:shape`). If several nested resources are specified in the [godot.core.NodePath], the last one will be fetched.
   *
   * The return value is an array of size 3: the first index points to the [godot.Node] (or `null` if not found), the second index points to the [godot.Resource] (or `null` if not found), and the third index is the remaining [godot.core.NodePath], if any.
   *
   * For example, assuming that `Area2D/CollisionShape2D` is a valid node and that its `shape` property has been assigned a [godot.RectangleShape2D] resource, one could have this kind of output:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * print(get_node_and_resource("Area2D/CollisionShape2D")) # [[godot.CollisionShape2D:1161], Null, ]
   *
   * print(get_node_and_resource("Area2D/CollisionShape2D:shape")) # [[godot.CollisionShape2D:1161], [godot.RectangleShape2D:1156], ]
   *
   * print(get_node_and_resource("Area2D/CollisionShape2D:shape:extents")) # [[godot.CollisionShape2D:1161], [godot.RectangleShape2D:1156], :extents]
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * GD.Print(GetNodeAndResource("Area2D/CollisionShape2D")); // [[godot.CollisionShape2D:1161], Null, ]
   *
   * GD.Print(GetNodeAndResource("Area2D/CollisionShape2D:shape")); // [[godot.CollisionShape2D:1161], [godot.RectangleShape2D:1156], ]
   *
   * GD.Print(GetNodeAndResource("Area2D/CollisionShape2D:shape:extents")); // [[godot.CollisionShape2D:1161], [godot.RectangleShape2D:1156], :extents]
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun getNodeAndResource(path: NodePath): VariantArray<Any?> {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_NODE_AND_RESOURCE, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns `true` if this node is currently inside a [godot.SceneTree].
   */
  public fun isInsideTree(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_INSIDE_TREE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the given node is a direct or indirect child of the current node.
   */
  public fun isAncestorOf(node: Node): Boolean {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_ANCESTOR_OF, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the given node occurs later in the scene hierarchy than the current node.
   */
  public fun isGreaterThan(node: Node): Boolean {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_GREATER_THAN, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the absolute path of the current node. This only works if the current node is inside the scene tree (see [isInsideTree]).
   */
  public fun getPath(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_PATH, NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * Returns the relative [godot.core.NodePath] from this node to the specified [node]. Both nodes must be in the same scene or the function will fail.
   */
  public fun getPathTo(node: Node): NodePath {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_PATH_TO, NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * Adds the node to a group. Groups are helpers to name and organize a subset of nodes, for example "enemies" or "collectables". A node can be in any number of groups. Nodes can be assigned a group at any time, but will not be added until they are inside the scene tree (see [isInsideTree]). See notes in the description, and the group methods in [godot.SceneTree].
   *
   * The [persistent] option is used when packing node to [godot.PackedScene] and saving to file. Non-persistent groups aren't stored.
   *
   * **Note:** For performance reasons, the order of node groups is *not* guaranteed. The order of node groups should not be relied upon as it can vary across project runs.
   */
  public fun addToGroup(group: StringName, persistent: Boolean = false): Unit {
    TransferContext.writeArguments(STRING_NAME to group, BOOL to persistent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_ADD_TO_GROUP, NIL)
  }

  /**
   * Removes a node from the [group]. Does nothing if the node is not in the [group]. See notes in the description, and the group methods in [godot.SceneTree].
   */
  public fun removeFromGroup(group: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to group)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_REMOVE_FROM_GROUP, NIL)
  }

  /**
   * Returns `true` if this node is in the specified group. See notes in the description, and the group methods in [godot.SceneTree].
   */
  public fun isInGroup(group: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to group)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_IN_GROUP, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Moves a child node to a different index (order) among the other children. Since calls, signals, etc. are performed by tree order, changing the order of children nodes may be useful. If [toIndex] is negative, the index will be counted from the end.
   *
   * **Note:** Internal children can only be moved within their expected "internal range" (see `internal` parameter in [addChild]).
   */
  public fun moveChild(childNode: Node, toPosition: Long): Unit {
    TransferContext.writeArguments(OBJECT to childNode, LONG to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_MOVE_CHILD, NIL)
  }

  /**
   * Returns an array listing the groups that the node is a member of.
   *
   * **Note:** For performance reasons, the order of node groups is *not* guaranteed. The order of node groups should not be relied upon as it can vary across project runs.
   *
   * **Note:** The engine uses some group names internally (all starting with an underscore). To avoid conflicts with internal groups, do not add custom groups whose name starts with an underscore. To exclude internal groups while looping over [getGroups], use the following snippet:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * # Stores the node's non-internal groups only (as an array of Strings).
   *
   * var non_internal_groups = []
   *
   * for group in get_groups():
   *
   *     if not group.begins_with("_"):
   *
   *         non_internal_groups.push_back(group)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * // Stores the node's non-internal groups only (as a List of strings).
   *
   * List<string> nonInternalGroups = new List<string>();
   *
   * foreach (string group in GetGroups())
   *
   * {
   *
   *     if (!group.BeginsWith("_"))
   *
   *         nonInternalGroups.Add(group);
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun getGroups(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_GROUPS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public fun raise(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RAISE, NIL)
  }

  public fun removeAndSkip(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_REMOVE_AND_SKIP, NIL)
  }

  /**
   * Returns the node's order in the scene tree branch. For example, if called on the first child node the position is `0`.
   *
   * If [includeInternal] is `false`, the index won't take internal children into account, i.e. first non-internal child will have index of 0 (see `internal` parameter in [addChild]).
   */
  public fun getIndex(includeInternal: Boolean = false): Long {
    TransferContext.writeArguments(BOOL to includeInternal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Prints the tree to stdout. Used mainly for debugging purposes. This version displays the path relative to the current node, and is good for copy/pasting into the [getNode] function.
   *
   * **Example output:**
   *
   * ```
   * 				TheGame
   * 				TheGame/Menu
   * 				TheGame/Menu/Label
   * 				TheGame/Menu/Camera2D
   * 				TheGame/SplashScreen
   * 				TheGame/SplashScreen/Camera2D
   * 				```
   */
  public fun printTree(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_PRINT_TREE, NIL)
  }

  /**
   * Similar to [printTree], this prints the tree to stdout. This version displays a more graphical representation similar to what is displayed in the Scene Dock. It is useful for inspecting larger trees.
   *
   * **Example output:**
   *
   * ```
   * 				 ┖╴TheGame
   * 				    ┠╴Menu
   * 				    ┃  ┠╴Label
   * 				    ┃  ┖╴Camera2D
   * 				    ┖╴SplashScreen
   * 				       ┖╴Camera2D
   * 				```
   */
  public fun printTreePretty(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_PRINT_TREE_PRETTY, NIL)
  }

  /**
   * Notifies the current node and all its children recursively by calling [godot.Object.notification] on all of them.
   */
  public fun propagateNotification(what: Long): Unit {
    TransferContext.writeArguments(LONG to what)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_PROPAGATE_NOTIFICATION, NIL)
  }

  /**
   * Calls the given method (if present) with the arguments given in [args] on this node and recursively on all its children. If the [parentFirst] argument is `true`, the method will be called on the current node first, then on all its children. If [parentFirst] is `false`, the children will be called first.
   */
  public fun propagateCall(
    method: StringName,
    args: VariantArray<Any?> = godot.core.variantArrayOf(),
    parentFirst: Boolean = false
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to method, ARRAY to args, BOOL to parentFirst)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_PROPAGATE_CALL, NIL)
  }

  /**
   * Enables or disables physics (i.e. fixed framerate) processing. When a node is being processed, it will receive a [NOTIFICATION_PHYSICS_PROCESS] at a fixed (usually 60 FPS, see [godot.Engine.physicsTicksPerSecond] to change) interval (and the [_physicsProcess] callback will be called if exists). Enabled automatically if [_physicsProcess] is overridden. Any calls to this before [_ready] will be ignored.
   */
  public fun setPhysicsProcess(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PHYSICS_PROCESS, NIL)
  }

  /**
   * Returns the time elapsed (in seconds) since the last physics-bound frame (see [_physicsProcess]). This is always a constant value in physics processing unless the frames per second is changed via [godot.Engine.physicsTicksPerSecond].
   */
  public fun getPhysicsProcessDeltaTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_PHYSICS_PROCESS_DELTA_TIME,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns `true` if physics processing is enabled (see [setPhysicsProcess]).
   */
  public fun isPhysicsProcessing(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_PHYSICS_PROCESSING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the time elapsed (in seconds) since the last process callback. This value may vary from frame to frame.
   */
  public fun getProcessDeltaTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_PROCESS_DELTA_TIME, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Enables or disables processing. When a node is being processed, it will receive a [NOTIFICATION_PROCESS] on every drawn frame (and the [_process] callback will be called if exists). Enabled automatically if [_process] is overridden. Any calls to this before [_ready] will be ignored.
   */
  public fun setProcess(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PROCESS, NIL)
  }

  /**
   * Returns `true` if processing is enabled (see [setProcess]).
   */
  public fun isProcessing(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_PROCESSING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Enables or disables input processing. This is not required for GUI controls! Enabled automatically if [_input] is overridden. Any calls to this before [_ready] will be ignored.
   */
  public fun setProcessInput(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PROCESS_INPUT, NIL)
  }

  /**
   * Returns `true` if the node is processing input (see [setProcessInput]).
   */
  public fun isProcessingInput(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_PROCESSING_INPUT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Enables unhandled input processing. This is not required for GUI controls! It enables the node to receive all input that was not previously handled (usually by a [godot.Control]). Enabled automatically if [_unhandledInput] is overridden. Any calls to this before [_ready] will be ignored.
   */
  public fun setProcessUnhandledInput(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PROCESS_UNHANDLED_INPUT,
        NIL)
  }

  /**
   * Returns `true` if the node is processing unhandled input (see [setProcessUnhandledInput]).
   */
  public fun isProcessingUnhandledInput(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_PROCESSING_UNHANDLED_INPUT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Enables unhandled key input processing. Enabled automatically if [_unhandledKeyInput] is overridden. Any calls to this before [_ready] will be ignored.
   */
  public fun setProcessUnhandledKeyInput(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NODE_SET_PROCESS_UNHANDLED_KEY_INPUT, NIL)
  }

  /**
   * Returns `true` if the node is processing unhandled key input (see [setProcessUnhandledKeyInput]).
   */
  public fun isProcessingUnhandledKeyInput(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NODE_IS_PROCESSING_UNHANDLED_KEY_INPUT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the node can process while the scene tree is paused (see [processMode]). Always returns `true` if the scene tree is not paused, and `false` if the node is not in the tree.
   */
  public fun canProcess(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_CAN_PROCESS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun printStrayNodes(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_PRINT_STRAY_NODES, NIL)
  }

  /**
   * Sets the folded state of the node in the Scene dock. This method is only intended for use with editor tooling.
   */
  public fun setDisplayFolded(fold: Boolean): Unit {
    TransferContext.writeArguments(BOOL to fold)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_DISPLAY_FOLDED, NIL)
  }

  /**
   * Returns `true` if the node is folded (collapsed) in the Scene dock. This method is only intended for use with editor tooling.
   */
  public fun isDisplayedFolded(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_DISPLAYED_FOLDED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Enables or disabled internal processing for this node. Internal processing happens in isolation from the normal [_process] calls and is used by some nodes internally to guarantee proper functioning even if the node is paused or processing is disabled for scripting ([setProcess]). Only useful for advanced uses to manipulate built-in nodes' behavior.
   *
   * **Warning:** Built-in Nodes rely on the internal processing for their own logic, so changing this value from your code may lead to unexpected behavior. Script access to this internal logic is provided for specific advanced uses, but is unsafe and not supported.
   */
  public fun setProcessInternal(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PROCESS_INTERNAL, NIL)
  }

  /**
   * Returns `true` if internal processing is enabled (see [setProcessInternal]).
   */
  public fun isProcessingInternal(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_PROCESSING_INTERNAL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Enables or disables internal physics for this node. Internal physics processing happens in isolation from the normal [_physicsProcess] calls and is used by some nodes internally to guarantee proper functioning even if the node is paused or physics processing is disabled for scripting ([setPhysicsProcess]). Only useful for advanced uses to manipulate built-in nodes' behavior.
   *
   * **Warning:** Built-in Nodes rely on the internal processing for their own logic, so changing this value from your code may lead to unexpected behavior. Script access to this internal logic is provided for specific advanced uses, but is unsafe and not supported.
   */
  public fun setPhysicsProcessInternal(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_PHYSICS_PROCESS_INTERNAL,
        NIL)
  }

  /**
   * Returns `true` if internal physics processing is enabled (see [setPhysicsProcessInternal]).
   */
  public fun isPhysicsProcessingInternal(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_PHYSICS_PROCESSING_INTERNAL,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the [godot.SceneTree] that contains this node.
   */
  public fun getTree(): SceneTree? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_TREE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SceneTree?
  }

  /**
   * Creates a new [godot.Tween] and binds it to this node. This is equivalent of doing:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * get_tree().create_tween().bind_node(self)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * GetTree().CreateTween().BindNode(this);
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun createTween(): Tween? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_CREATE_TWEEN, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Tween?
  }

  /**
   * Duplicates the node, returning a new node.
   *
   * You can fine-tune the behavior using the [flags] (see [enum DuplicateFlags]).
   *
   * **Note:** It will not work properly if the node contains a script with constructor arguments (i.e. needs to supply arguments to [godot.Object.Init] method). In that case, the node will be duplicated without a script.
   */
  public fun duplicate(flags: Long = 15): Node? {
    TransferContext.writeArguments(LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_DUPLICATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Replaces a node in a scene by the given one. Subscriptions that pass through this node will be lost.
   *
   * If [keepGroups] is `true`, the [node] is added to the same groups that the replaced node is in.
   *
   * **Note:** The given node will become the new parent of any child nodes that the replaced node had.
   *
   * **Note:** The replaced node is not automatically freed, so you either need to keep it in a variable for later use or free it using [godot.Object.free].
   */
  public fun replaceBy(node: Node, keepGroups: Boolean = false): Unit {
    TransferContext.writeArguments(OBJECT to node, BOOL to keepGroups)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_REPLACE_BY, NIL)
  }

  /**
   * Sets whether this is an instance load placeholder. See [godot.InstancePlaceholder].
   */
  public fun setSceneInstanceLoadPlaceholder(loadPlaceholder: Boolean): Unit {
    TransferContext.writeArguments(BOOL to loadPlaceholder)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NODE_SET_SCENE_INSTANCE_LOAD_PLACEHOLDER, NIL)
  }

  /**
   * Returns `true` if this is an instance load placeholder. See [godot.InstancePlaceholder].
   */
  public fun getSceneInstanceLoadPlaceholder(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NODE_GET_SCENE_INSTANCE_LOAD_PLACEHOLDER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the editable children state of [node] relative to this node. This method is only intended for use with editor tooling.
   */
  public fun setEditableInstance(node: Node, isEditable: Boolean): Unit {
    TransferContext.writeArguments(OBJECT to node, BOOL to isEditable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_EDITABLE_INSTANCE, NIL)
  }

  /**
   * Returns `true` if [node] has editable children enabled relative to this node. This method is only intended for use with editor tooling.
   */
  public fun isEditableInstance(node: Node): Boolean {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_EDITABLE_INSTANCE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the node's [godot.Viewport].
   */
  public fun getViewport(): Viewport? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_VIEWPORT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Viewport?
  }

  /**
   * Queues a node for deletion at the end of the current frame. When deleted, all of its child nodes will be deleted as well. This method ensures it's safe to delete the node, contrary to [godot.Object.free]. Use [godot.Object.isQueuedForDeletion] to check whether a node will be deleted at the end of the frame.
   */
  public fun queueFree(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_QUEUE_FREE, NIL)
  }

  /**
   * Requests that `_ready` be called again. Note that the method won't be called immediately, but is scheduled for when the node is added to the scene tree again (see [_ready]). `_ready` is called only for the node which requested it, which means that you need to request ready for each child if you want them to call `_ready` too (in which case, `_ready` will be called in the same order as it would normally).
   */
  public fun requestReady(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_REQUEST_READY, NIL)
  }

  /**
   * Sets the node's multiplayer authority to the peer with the given peer ID. The multiplayer authority is the peer that has authority over the node on the network. Useful in conjunction with [rpcConfig] and the [godot.MultiplayerAPI]. Inherited from the parent node by default, which ultimately defaults to peer ID 1 (the server). If [recursive], the given peer is recursively set as the authority for all children of this node.
   */
  public fun setMultiplayerAuthority(id: Long, recursive: Boolean = true): Unit {
    TransferContext.writeArguments(LONG to id, BOOL to recursive)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_SET_MULTIPLAYER_AUTHORITY, NIL)
  }

  /**
   * Returns the peer ID of the multiplayer authority for this node. See [setMultiplayerAuthority].
   */
  public fun getMultiplayerAuthority(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_GET_MULTIPLAYER_AUTHORITY,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if the local system is the multiplayer authority of this node.
   */
  public fun isMultiplayerAuthority(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_IS_MULTIPLAYER_AUTHORITY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Changes the RPC mode for the given [method] with the given [config] which should be `null` (to disable) or a [godot.core.Dictionary] in the form:
   *
   * ```
   * 				{
   * 				    rpc_mode = MultiplayerAPI.RPCMode,
   * 				    transfer_mode = MultiplayerPeer.TranferMode,
   * 				    call_local = false,
   * 				    channel = 0,
   * 				}
   * 				```
   *
   * See [enum MultiplayerAPI.RPCMode] and [enum MultiplayerPeer.TransferMode]. An alternative is annotating methods and properties with the corresponding annotation (`@rpc(any)`, `@rpc(authority)`). By default, methods are not exposed to networking (and RPCs).
   */
  public fun rpcConfig(
    method: StringName,
    rpcMode: RPCMode,
    callLocal: Boolean = false,
    transferMode: TransferMode = TransferMode.TRANSFER_MODE_RELIABLE,
    channel: Long = 0
  ): Long {
    TransferContext.writeArguments(STRING_NAME to method, LONG to rpcMode.id, BOOL to callLocal, LONG to transferMode.id, LONG to channel)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RPC_CONFIG, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sends a remote procedure call request for the given [method] to peers on the network (and locally), optionally sending all additional arguments as arguments to the method called by the RPC. The call request will only be received by nodes with the same [godot.core.NodePath], including the exact same node name. Behavior depends on the RPC configuration for the given method, see [rpcConfig]. Methods are not exposed to RPCs by default. Returns `null`.
   *
   * **Note:** You can only safely use RPCs on clients after you received the `connected_to_server` signal from the [godot.MultiplayerAPI]. You also need to keep track of the connection state, either by the [godot.MultiplayerAPI] signals like `server_disconnected` or by checking `get_multiplayer().peer.get_connection_status() == CONNECTION_CONNECTED`.
   */
  public fun rpc(method: StringName, vararg __var_args: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RPC, NIL)
  }

  /**
   * Sends a [rpc] to a specific peer identified by [peerId] (see [godot.MultiplayerPeer.setTargetPeer]). Returns `null`.
   */
  public fun rpcId(
    peerId: Long,
    method: StringName,
    vararg __var_args: Any?
  ): Unit {
    TransferContext.writeArguments(LONG to peerId, STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_RPC_ID, NIL)
  }

  /**
   * Updates the warning displayed for this node in the Scene Dock.
   *
   * Use [_getConfigurationWarnings] to setup the warning message to display.
   */
  public fun updateConfigurationWarnings(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE_UPDATE_CONFIGURATION_WARNINGS,
        NIL)
  }

  public enum class ProcessMode(
    id: Long
  ) {
    /**
     * Inherits process mode from the node's parent. For the root node, it is equivalent to [PROCESS_MODE_PAUSABLE]. Default.
     */
    PROCESS_MODE_INHERIT(0),
    /**
     * Stops processing when the [godot.SceneTree] is paused (process when unpaused). This is the inverse of [PROCESS_MODE_WHEN_PAUSED].
     */
    PROCESS_MODE_PAUSABLE(1),
    /**
     * Only process when the [godot.SceneTree] is paused (don't process when unpaused). This is the inverse of [PROCESS_MODE_PAUSABLE].
     */
    PROCESS_MODE_WHEN_PAUSED(2),
    /**
     * Always process. Continue processing always, ignoring the [godot.SceneTree]'s paused property. This is the inverse of [PROCESS_MODE_DISABLED].
     */
    PROCESS_MODE_ALWAYS(3),
    /**
     * Never process. Completely disables processing, ignoring the [godot.SceneTree]'s paused property. This is the inverse of [PROCESS_MODE_ALWAYS].
     */
    PROCESS_MODE_DISABLED(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DuplicateFlags(
    id: Long
  ) {
    /**
     * Duplicate the node's signals.
     */
    DUPLICATE_SIGNALS(1),
    /**
     * Duplicate the node's groups.
     */
    DUPLICATE_GROUPS(2),
    /**
     * Duplicate the node's scripts.
     */
    DUPLICATE_SCRIPTS(4),
    /**
     * Duplicate using instancing.
     *
     * An instance stays linked to the original so when the original changes, the instance changes too.
     */
    DUPLICATE_USE_INSTANCING(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class InternalMode(
    id: Long
  ) {
    /**
     * Node will not be internal.
     */
    INTERNAL_MODE_DISABLED(0),
    /**
     * Node will be placed at the front of parent's node list, before any non-internal sibling.
     */
    INTERNAL_MODE_FRONT(1),
    /**
     * Node will be placed at the back of parent's node list, after any non-internal sibling.
     */
    INTERNAL_MODE_BACK(2),
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
     * Notification received when the node enters a [godot.SceneTree].
     *
     * This notification is emitted *before* the related [treeEntered].
     */
    public final const val NOTIFICATION_ENTER_TREE: Long = 10

    /**
     * Notification received when the node is about to exit a [godot.SceneTree].
     *
     * This notification is emitted *after* the related [treeExiting].
     */
    public final const val NOTIFICATION_EXIT_TREE: Long = 11

    /**
     * Notification received when the node is moved in the parent.
     */
    public final const val NOTIFICATION_MOVED_IN_PARENT: Long = 12

    /**
     * Notification received when the node is ready. See [_ready].
     */
    public final const val NOTIFICATION_READY: Long = 13

    /**
     * Notification received when the node is paused.
     */
    public final const val NOTIFICATION_PAUSED: Long = 14

    /**
     * Notification received when the node is unpaused.
     */
    public final const val NOTIFICATION_UNPAUSED: Long = 15

    /**
     * Notification received every frame when the physics process flag is set (see [setPhysicsProcess]).
     */
    public final const val NOTIFICATION_PHYSICS_PROCESS: Long = 16

    /**
     * Notification received every frame when the process flag is set (see [setProcess]).
     */
    public final const val NOTIFICATION_PROCESS: Long = 17

    /**
     * Notification received when a node is set as a child of another node.
     *
     * **Note:** This doesn't mean that a node entered the [godot.SceneTree].
     */
    public final const val NOTIFICATION_PARENTED: Long = 18

    /**
     * Notification received when a node is unparented (parent removed it from the list of children).
     */
    public final const val NOTIFICATION_UNPARENTED: Long = 19

    public final const val NOTIFICATION_INSTANCED: Long = 20

    /**
     * Notification received when a drag operation begins. All nodes receive this notification, not only the dragged one.
     *
     * Can be triggered either by dragging a [godot.Control] that provides drag data (see [godot.Control.GetDragData]) or using [godot.Control.forceDrag].
     *
     * Use [godot.Viewport.guiGetDragData] to get the dragged data.
     */
    public final const val NOTIFICATION_DRAG_BEGIN: Long = 21

    /**
     * Notification received when a drag operation ends.
     *
     * Use [godot.Viewport.guiIsDragSuccessful] to check if the drag succeeded.
     */
    public final const val NOTIFICATION_DRAG_END: Long = 22

    /**
     * Notification received when the node's name or one of its parents' name is changed. This notification is *not* received when the node is removed from the scene tree to be added to another parent later on.
     */
    public final const val NOTIFICATION_PATH_RENAMED: Long = 23

    /**
     * Notification received every frame when the internal process flag is set (see [setProcessInternal]).
     */
    public final const val NOTIFICATION_INTERNAL_PROCESS: Long = 25

    /**
     * Notification received every frame when the internal physics process flag is set (see [setPhysicsProcessInternal]).
     */
    public final const val NOTIFICATION_INTERNAL_PHYSICS_PROCESS: Long = 26

    /**
     * Notification received when the node is ready, just before [NOTIFICATION_READY] is received. Unlike the latter, it's sent every time the node enters tree, instead of only once.
     */
    public final const val NOTIFICATION_POST_ENTER_TREE: Long = 27

    /**
     * Notification received when the node is disabled. See [PROCESS_MODE_DISABLED].
     */
    public final const val NOTIFICATION_DISABLED: Long = 28

    /**
     * Notification received when the node is enabled again after being disabled. See [PROCESS_MODE_DISABLED].
     */
    public final const val NOTIFICATION_ENABLED: Long = 29

    /**
     * Notification received right before the scene with the node is saved in the editor. This notification is only sent in the Godot editor and will not occur in exported projects.
     */
    public final const val NOTIFICATION_EDITOR_PRE_SAVE: Long = 9001

    /**
     * Notification received right after the scene with the node is saved in the editor. This notification is only sent in the Godot editor and will not occur in exported projects.
     */
    public final const val NOTIFICATION_EDITOR_POST_SAVE: Long = 9002

    /**
     * Notification received from the OS when the mouse enters the game window.
     *
     * Implemented on desktop and web platforms.
     */
    public final const val NOTIFICATION_WM_MOUSE_ENTER: Long = 1002

    /**
     * Notification received from the OS when the mouse leaves the game window.
     *
     * Implemented on desktop and web platforms.
     */
    public final const val NOTIFICATION_WM_MOUSE_EXIT: Long = 1003

    /**
     * Notification received from the OS when the node's parent [godot.Window] is focused. This may be a change of focus between two windows of the same engine instance, or from the OS desktop or a third-party application to a window of the game (in which case [NOTIFICATION_APPLICATION_FOCUS_IN] is also emitted).
     */
    public final const val NOTIFICATION_WM_WINDOW_FOCUS_IN: Long = 1004

    /**
     * Notification received from the OS when the node's parent [godot.Window] is defocused. This may be a change of focus between two windows of the same engine instance, or from a window of the game to the OS desktop or a third-party application (in which case [NOTIFICATION_APPLICATION_FOCUS_OUT] is also emitted).
     */
    public final const val NOTIFICATION_WM_WINDOW_FOCUS_OUT: Long = 1005

    /**
     * Notification received from the OS when a close request is sent (e.g. closing the window with a "Close" button or [kbd]Alt + F4[/kbd]).
     *
     * Implemented on desktop platforms.
     */
    public final const val NOTIFICATION_WM_CLOSE_REQUEST: Long = 1006

    /**
     * Notification received from the OS when a go back request is sent (e.g. pressing the "Back" button on Android).
     *
     * Specific to the Android platform.
     */
    public final const val NOTIFICATION_WM_GO_BACK_REQUEST: Long = 1007

    /**
     *
     */
    public final const val NOTIFICATION_WM_SIZE_CHANGED: Long = 1008

    /**
     *
     */
    public final const val NOTIFICATION_WM_DPI_CHANGE: Long = 1009

    /**
     * Notification received when the mouse enters the viewport.
     */
    public final const val NOTIFICATION_VP_MOUSE_ENTER: Long = 1010

    /**
     * Notification received when the mouse leaves the viewport.
     */
    public final const val NOTIFICATION_VP_MOUSE_EXIT: Long = 1011

    /**
     * Notification received from the OS when the application is exceeding its allocated memory.
     *
     * Specific to the iOS platform.
     */
    public final const val NOTIFICATION_OS_MEMORY_WARNING: Long = 2009

    /**
     * Notification received when translations may have changed. Can be triggered by the user changing the locale. Can be used to respond to language changes, for example to change the UI strings on the fly. Useful when working with the built-in translation support, like [godot.Object.tr].
     */
    public final const val NOTIFICATION_TRANSLATION_CHANGED: Long = 2010

    /**
     * Notification received from the OS when a request for "About" information is sent.
     *
     * Specific to the macOS platform.
     */
    public final const val NOTIFICATION_WM_ABOUT: Long = 2011

    /**
     * Notification received from Godot's crash handler when the engine is about to crash.
     *
     * Implemented on desktop platforms if the crash handler is enabled.
     */
    public final const val NOTIFICATION_CRASH: Long = 2012

    /**
     * Notification received from the OS when an update of the Input Method Engine occurs (e.g. change of IME cursor position or composition string).
     *
     * Specific to the macOS platform.
     */
    public final const val NOTIFICATION_OS_IME_UPDATE: Long = 2013

    /**
     * Notification received from the OS when the application is resumed.
     *
     * Specific to the Android platform.
     */
    public final const val NOTIFICATION_APPLICATION_RESUMED: Long = 2014

    /**
     * Notification received from the OS when the application is paused.
     *
     * Specific to the Android platform.
     */
    public final const val NOTIFICATION_APPLICATION_PAUSED: Long = 2015

    /**
     * Notification received from the OS when the application is focused, i.e. when changing the focus from the OS desktop or a thirdparty application to any open window of the Godot instance.
     *
     * Implemented on desktop platforms.
     */
    public final const val NOTIFICATION_APPLICATION_FOCUS_IN: Long = 2016

    /**
     * Notification received from the OS when the application is defocused, i.e. when changing the focus from any open window of the Godot instance to the OS desktop or a thirdparty application.
     *
     * Implemented on desktop platforms.
     */
    public final const val NOTIFICATION_APPLICATION_FOCUS_OUT: Long = 2017

    /**
     * Notification received when text server is changed.
     */
    public final const val NOTIFICATION_TEXT_SERVER_CHANGED: Long = 2018
  }
}
