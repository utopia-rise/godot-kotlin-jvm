// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.NodePath
import godot.core.PackedStringArray
import godot.core.Signal0
import godot.core.Signal1
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.memory.TransferContext
import godot.core.toGodotName
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads
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
 * Nodes are Godot's building blocks. They can be assigned as the child of another node, resulting
 * in a tree arrangement. A given node can contain any number of nodes as children with the requirement
 * that all siblings (direct children of a node) should have unique names.
 * A tree of nodes is called a *scene*. Scenes can be saved to the disk and then instantiated into
 * other scenes. This allows for very high flexibility in the architecture and data model of Godot
 * projects.
 * **Scene tree:** The [SceneTree] contains the active tree of nodes. When a node is added to the
 * scene tree, it receives the [NOTIFICATION_ENTER_TREE] notification and its [_enterTree] callback is
 * triggered. Child nodes are always added *after* their parent node, i.e. the [_enterTree] callback of
 * a parent node will be triggered before its child's.
 * Once all nodes have been added in the scene tree, they receive the [NOTIFICATION_READY]
 * notification and their respective [_ready] callbacks are triggered. For groups of nodes, the
 * [_ready] callback is called in reverse order, starting with the children and moving up to the parent
 * nodes.
 * This means that when adding a node to the scene tree, the following order will be used for the
 * callbacks: [_enterTree] of the parent, [_enterTree] of the children, [_ready] of the children and
 * finally [_ready] of the parent (recursively for the entire scene tree).
 * **Processing:** Nodes can override the "process" state, so that they receive a callback on each
 * frame requesting them to process (do something). Normal processing (callback [_process], toggled
 * with [setProcess]) happens as fast as possible and is dependent on the frame rate, so the processing
 * time *delta* (in seconds) is passed as an argument. Physics processing (callback [_physicsProcess],
 * toggled with [setPhysicsProcess]) happens a fixed number of times per second (60 by default) and is
 * useful for code related to the physics engine.
 * Nodes can also process input events. When present, the [_input] function will be called for each
 * input that the program receives. In many cases, this can be overkill (unless used for simple
 * projects), and the [_unhandledInput] function might be preferred; it is called when the input event
 * was not handled by anyone else (typically, GUI [Control] nodes), ensuring that the node only
 * receives the events that were meant for it.
 * To keep track of the scene hierarchy (especially when instantiating scenes into other scenes), an
 * "owner" can be set for the node with the [owner] property. This keeps track of who instantiated
 * what. This is mostly useful when writing editors and tools, though.
 * Finally, when a node is freed with [Object.free] or [queueFree], it will also free all its
 * children.
 * **Groups:** Nodes can be added to as many groups as you want to be easy to manage, you could
 * create groups like "enemies" or "collectables" for example, depending on your game. See
 * [addToGroup], [isInGroup] and [removeFromGroup]. You can then retrieve all nodes in these groups,
 * iterate them and even call methods on groups via the methods on [SceneTree].
 * **Networking with nodes:** After connecting to a server (or making one, see
 * [ENetMultiplayerPeer]), it is possible to use the built-in RPC (remote procedure call) system to
 * communicate over the network. By calling [rpc] with a method name, it will be called locally and in
 * all connected peers (peers = clients and the server that accepts connections). To identify which
 * node receives the RPC call, Godot will use its [NodePath] (make sure node names are the same on all
 * peers). Also, take a look at the high-level networking tutorial and corresponding demos.
 * **Note:** The `script` property is part of the [Object] class, not [Node]. It isn't exposed like
 * most properties but does have a setter and getter (see [Object.setScript] and [Object.getScript]).
 */
@GodotBaseType
public open class Node : Object() {
  /**
   * Emitted when the node is considered ready, after [_ready] is called.
   */
  public val ready: Signal0 by Signal0

  /**
   * Emitted when the node's [name] is changed, if the node is inside the tree.
   */
  public val renamed: Signal0 by Signal0

  /**
   * Emitted when the node enters the tree.
   * This signal is emitted *after* the related [NOTIFICATION_ENTER_TREE] notification.
   */
  public val treeEntered: Signal0 by Signal0

  /**
   * Emitted when the node is just about to exit the tree. The node is still valid. As such, this is
   * the right place for de-initialization (or a "destructor", if you will).
   * This signal is emitted *after* the node's [_exitTree], and *before* the related
   * [NOTIFICATION_EXIT_TREE].
   */
  public val treeExiting: Signal0 by Signal0

  /**
   * Emitted after the node exits the tree and is no longer active.
   * This signal is emitted *after* the related [NOTIFICATION_EXIT_TREE] notification.
   */
  public val treeExited: Signal0 by Signal0

  /**
   * Emitted when the child [node] enters the [SceneTree], usually because this node entered the
   * tree (see [signal tree_entered]), or [addChild] has been called.
   * This signal is emitted *after* the child node's own [NOTIFICATION_ENTER_TREE] and [signal
   * tree_entered].
   */
  public val childEnteredTree: Signal1<Node> by Signal1

  /**
   * Emitted when the child [node] is about to exit the [SceneTree], usually because this node is
   * exiting the tree (see [signal tree_exiting]), or because the child [node] is being removed or
   * freed.
   * When this signal is received, the child [node] is still accessible inside the tree. This signal
   * is emitted *after* the child node's own [signal tree_exiting] and [NOTIFICATION_EXIT_TREE].
   */
  public val childExitingTree: Signal1<Node> by Signal1

  /**
   * Emitted when the list of children is changed. This happens when child nodes are added, moved or
   * removed.
   */
  public val childOrderChanged: Signal0 by Signal0

  /**
   * Emitted when this node is being replaced by the [node], see [replaceBy].
   * This signal is emitted *after* [node] has been added as a child of the original parent node,
   * but *before* all original child nodes have been reparented to [node].
   */
  public val replacingBy: Signal1<Node> by Signal1

  /**
   * Emitted when the node's editor description field changed.
   */
  public val editorDescriptionChanged: Signal1<Node> by Signal1

  /**
   * The name of the node. This name must be unique among the siblings (other child nodes from the
   * same parent). When set to an existing sibling's name, the node is automatically renamed.
   * **Note:** When changing the name, the following characters will be replaced with an underscore:
   * (`.` `:` `@` `/` `"` `&#37;`). In particular, the `@` character is reserved for auto-generated
   * names. See also [String.validateNodeName].
   */
  public final inline val name: StringName
    @JvmName("nameProperty")
    get() = getName()

  /**
   * If `true`, the node can be accessed from any node sharing the same [owner] or from the [owner]
   * itself, with special `&#37;Name` syntax in [getNode].
   * **Note:** If another node with the same [owner] shares the same [name] as this node, the other
   * node will no longer be accessible as unique.
   */
  public final inline var uniqueNameInOwner: Boolean
    @JvmName("uniqueNameInOwnerProperty")
    get() = isUniqueNameInOwner()
    @JvmName("uniqueNameInOwnerProperty")
    set(`value`) {
      setUniqueNameInOwner(value)
    }

  /**
   * The original scene's file path, if the node has been instantiated from a [PackedScene] file.
   * Only scene root nodes contains this.
   */
  public final inline var sceneFilePath: String
    @JvmName("sceneFilePathProperty")
    get() = getSceneFilePath()
    @JvmName("sceneFilePathProperty")
    set(`value`) {
      setSceneFilePath(value)
    }

  /**
   * The owner of this node. The owner must be an ancestor of this node. When packing the owner node
   * in a [PackedScene], all the nodes it owns are also saved with it.
   * **Note:** In the editor, nodes not owned by the scene root are usually not displayed in the
   * Scene dock, and will **not** be saved. To prevent this, remember to set the owner after calling
   * [addChild]. See also (see [uniqueNameInOwner])
   */
  public final inline var owner: Node?
    @JvmName("ownerProperty")
    get() = getOwner()
    @JvmName("ownerProperty")
    set(`value`) {
      setOwner(value)
    }

  /**
   * The [MultiplayerAPI] instance associated with this node. See [SceneTree.getMultiplayer].
   * **Note:** Renaming the node, or moving it in the tree, will not move the [MultiplayerAPI] to
   * the new path, you will have to update this manually.
   */
  public final inline val multiplayer: MultiplayerAPI?
    @JvmName("multiplayerProperty")
    get() = getMultiplayer()

  /**
   * The node's processing behavior (see [ProcessMode]). To check if the node can process in its
   * current mode, use [canProcess].
   */
  public final inline var processMode: ProcessMode
    @JvmName("processModeProperty")
    get() = getProcessMode()
    @JvmName("processModeProperty")
    set(`value`) {
      setProcessMode(value)
    }

  /**
   * The node's execution order of the process callbacks ([_process], [_physicsProcess], and
   * internal processing). Nodes whose priority value is *lower* call their process callbacks first,
   * regardless of tree order.
   */
  public final inline var processPriority: Int
    @JvmName("processPriorityProperty")
    get() = getProcessPriority()
    @JvmName("processPriorityProperty")
    set(`value`) {
      setProcessPriority(value)
    }

  /**
   * Similar to [processPriority] but for [NOTIFICATION_PHYSICS_PROCESS], [_physicsProcess] or the
   * internal version.
   */
  public final inline var processPhysicsPriority: Int
    @JvmName("processPhysicsPriorityProperty")
    get() = getPhysicsProcessPriority()
    @JvmName("processPhysicsPriorityProperty")
    set(`value`) {
      setPhysicsProcessPriority(value)
    }

  /**
   * Set the process thread group for this node (basically, whether it receives
   * [NOTIFICATION_PROCESS], [NOTIFICATION_PHYSICS_PROCESS], [_process] or [_physicsProcess] (and the
   * internal versions) on the main thread or in a sub-thread.
   * By default, the thread group is [PROCESS_THREAD_GROUP_INHERIT], which means that this node
   * belongs to the same thread group as the parent node. The thread groups means that nodes in a
   * specific thread group will process together, separate to other thread groups (depending on
   * [processThreadGroupOrder]). If the value is set is [PROCESS_THREAD_GROUP_SUB_THREAD], this thread
   * group will occur on a sub thread (not the main thread), otherwise if set to
   * [PROCESS_THREAD_GROUP_MAIN_THREAD] it will process on the main thread. If there is not a parent or
   * grandparent node set to something other than inherit, the node will belong to the *default thread
   * group*. This default group will process on the main thread and its group order is 0.
   * During processing in a sub-thread, accessing most functions in nodes outside the thread group
   * is forbidden (and it will result in an error in debug mode). Use [Object.callDeferred],
   * [callThreadSafe], [callDeferredThreadGroup] and the likes in order to communicate from the thread
   * groups to the main thread (or to other thread groups).
   * To better understand process thread groups, the idea is that any node set to any other value
   * than [PROCESS_THREAD_GROUP_INHERIT] will include any child (and grandchild) nodes set to inherit
   * into its process thread group. This means that the processing of all the nodes in the group will
   * happen together, at the same time as the node including them.
   */
  public final inline var processThreadGroup: ProcessThreadGroup
    @JvmName("processThreadGroupProperty")
    get() = getProcessThreadGroup()
    @JvmName("processThreadGroupProperty")
    set(`value`) {
      setProcessThreadGroup(value)
    }

  /**
   * Change the process thread group order. Groups with a lesser order will process before groups
   * with a greater order. This is useful when a large amount of nodes process in sub thread and,
   * afterwards, another group wants to collect their result in the main thread, as an example.
   */
  public final inline var processThreadGroupOrder: Int
    @JvmName("processThreadGroupOrderProperty")
    get() = getProcessThreadGroupOrder()
    @JvmName("processThreadGroupOrderProperty")
    set(`value`) {
      setProcessThreadGroupOrder(value)
    }

  /**
   * Set whether the current thread group will process messages (calls to [callDeferredThreadGroup]
   * on threads), and whether it wants to receive them during regular process or physics process
   * callbacks.
   */
  public final inline var processThreadMessages: ProcessThreadMessages
    @JvmName("processThreadMessagesProperty")
    get() = getProcessThreadMessages()
    @JvmName("processThreadMessagesProperty")
    set(`value`) {
      setProcessThreadMessages(value)
    }

  /**
   * Allows enabling or disabling physics interpolation per node, offering a finer grain of control
   * than turning physics interpolation on and off globally. See
   * [ProjectSettings.physics/common/physicsInterpolation] and [SceneTree.physicsInterpolation] for the
   * global setting.
   * **Note:** When teleporting a node to a distant position you should temporarily disable
   * interpolation with [Node.resetPhysicsInterpolation].
   */
  public final inline var physicsInterpolationMode: PhysicsInterpolationMode
    @JvmName("physicsInterpolationModeProperty")
    get() = getPhysicsInterpolationMode()
    @JvmName("physicsInterpolationModeProperty")
    set(`value`) {
      setPhysicsInterpolationMode(value)
    }

  /**
   * Defines if any text should automatically change to its translated version depending on the
   * current locale (for nodes such as [Label], [RichTextLabel], [Window], etc.). Also decides if the
   * node's strings should be parsed for POT generation.
   * **Note:** For the root node, auto translate mode can also be set via
   * [ProjectSettings.internationalization/rendering/rootNodeAutoTranslate].
   */
  public final inline var autoTranslateMode: AutoTranslateMode
    @JvmName("autoTranslateModeProperty")
    get() = getAutoTranslateMode()
    @JvmName("autoTranslateModeProperty")
    set(`value`) {
      setAutoTranslateMode(value)
    }

  /**
   * An optional description to the node. It will be displayed as a tooltip when hovering over the
   * node in the editor's Scene dock.
   */
  public final inline var editorDescription: String
    @JvmName("editorDescriptionProperty")
    get() = getEditorDescription()
    @JvmName("editorDescriptionProperty")
    set(`value`) {
      setEditorDescription(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_NODE, scriptIndex)
  }

  public inline fun <reified FUNCTION : KFunction0<*>> rpc(function: FUNCTION): Error =
      rpc(function.name.toGodotName())

  public inline fun <reified FUNCTION : KFunction0<*>> rpcId(id: Long, function: FUNCTION): Error =
      rpcId(id, function.name.toGodotName())

  public inline fun <ARG0, reified FUNCTION : KFunction1<ARG0, *>> rpc(function: FUNCTION,
      arg0: ARG0): Error = rpc(function.name.toGodotName(), arg0)

  public inline fun <ARG0, reified FUNCTION : KFunction1<ARG0, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
  ): Error = rpcId(id, function.name.toGodotName(), arg0)

  public inline fun <ARG0, ARG1, reified FUNCTION : KFunction2<ARG0, ARG1, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
  ): Error = rpc(function.name.toGodotName(), arg0, arg1)

  public inline fun <ARG0, ARG1, reified FUNCTION : KFunction2<ARG0, ARG1, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
  ): Error = rpcId(id, function.name.toGodotName(), arg0, arg1)

  public inline fun <ARG0, ARG1, ARG2, reified FUNCTION : KFunction3<ARG0, ARG1, ARG2, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
  ): Error = rpc(function.name.toGodotName(), arg0, arg1, arg2)

  public inline fun <ARG0, ARG1, ARG2, reified FUNCTION : KFunction3<ARG0, ARG1, ARG2, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
  ): Error = rpcId(id, function.name.toGodotName(), arg0, arg1, arg2)

  public inline fun <ARG0, ARG1, ARG2, ARG3, reified FUNCTION :
      KFunction4<ARG0, ARG1, ARG2, ARG3, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
  ): Error = rpc(function.name.toGodotName(), arg0, arg1, arg2, arg3)

  public inline fun <ARG0, ARG1, ARG2, ARG3, reified FUNCTION :
      KFunction4<ARG0, ARG1, ARG2, ARG3, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
  ): Error = rpcId(id, function.name.toGodotName(), arg0, arg1, arg2, arg3)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, reified FUNCTION :
      KFunction5<ARG0, ARG1, ARG2, ARG3, ARG4, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
  ): Error = rpc(function.name.toGodotName(), arg0, arg1, arg2, arg3, arg4)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, reified FUNCTION :
      KFunction5<ARG0, ARG1, ARG2, ARG3, ARG4, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
  ): Error = rpcId(id, function.name.toGodotName(), arg0, arg1, arg2, arg3, arg4)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, reified FUNCTION :
      KFunction6<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
  ): Error = rpc(function.name.toGodotName(), arg0, arg1, arg2, arg3, arg4, arg5)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, reified FUNCTION :
      KFunction6<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, *>> rpcId(
    id: Long,
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
  ): Error = rpcId(id, function.name.toGodotName(), arg0, arg1, arg2, arg3, arg4, arg5)

  public inline fun <ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, reified FUNCTION :
      KFunction7<ARG0, ARG1, ARG2, ARG3, ARG4, ARG5, ARG6, *>> rpc(
    function: FUNCTION,
    arg0: ARG0,
    arg1: ARG1,
    arg2: ARG2,
    arg3: ARG3,
    arg4: ARG4,
    arg5: ARG5,
    arg6: ARG6,
  ): Error = rpc(function.name.toGodotName(), arg0, arg1, arg2, arg3, arg4, arg5, arg6)

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
    arg6: ARG6,
  ): Error = rpcId(id, function.name.toGodotName(), arg0, arg1, arg2, arg3, arg4, arg5, arg6)

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
    arg7: ARG7,
  ): Error = rpc(function.name.toGodotName(), arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)

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
    arg7: ARG7,
  ): Error = rpcId(id, function.name.toGodotName(), arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)

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
    arg8: ARG8,
  ): Error = rpc(function.name.toGodotName(), arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)

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
    arg8: ARG8,
  ): Error = rpcId(id, function.name.toGodotName(), arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7,
      arg8)

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
    arg9: ARG9,
  ): Error = rpc(function.name.toGodotName(), arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8,
      arg9)

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
    arg9: ARG9,
  ): Error = rpcId(id, function.name.toGodotName(), arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7,
      arg8, arg9)

  /**
   * Called during the processing step of the main loop. Processing happens at every frame and as
   * fast as possible, so the [delta] time since the previous frame is not constant. [delta] is in
   * seconds.
   * It is only called if processing is enabled, which is done automatically if this method is
   * overridden, and can be toggled with [setProcess].
   * Corresponds to the [NOTIFICATION_PROCESS] notification in [Object.Notification].
   * **Note:** This method is only called if the node is present in the scene tree (i.e. if it's not
   * an orphan).
   */
  public open fun _process(delta: Double): Unit {
  }

  /**
   * Called during the physics processing step of the main loop. Physics processing means that the
   * frame rate is synced to the physics, i.e. the [delta] variable should be constant. [delta] is in
   * seconds.
   * It is only called if physics processing is enabled, which is done automatically if this method
   * is overridden, and can be toggled with [setPhysicsProcess].
   * Corresponds to the [NOTIFICATION_PHYSICS_PROCESS] notification in [Object.Notification].
   * **Note:** This method is only called if the node is present in the scene tree (i.e. if it's not
   * an orphan).
   */
  public open fun _physicsProcess(delta: Double): Unit {
  }

  /**
   * Called when the node enters the [SceneTree] (e.g. upon instantiating, scene changing, or after
   * calling [addChild] in a script). If the node has children, its [_enterTree] callback will be
   * called first, and then that of the children.
   * Corresponds to the [NOTIFICATION_ENTER_TREE] notification in [Object.Notification].
   */
  public open fun _enterTree(): Unit {
  }

  /**
   * Called when the node is about to leave the [SceneTree] (e.g. upon freeing, scene changing, or
   * after calling [removeChild] in a script). If the node has children, its [_exitTree] callback will
   * be called last, after all its children have left the tree.
   * Corresponds to the [NOTIFICATION_EXIT_TREE] notification in [Object.Notification] and signal
   * [signal tree_exiting]. To get notified when the node has already left the active tree, connect to
   * the [signal tree_exited].
   */
  public open fun _exitTree(): Unit {
  }

  /**
   * Called when the node is "ready", i.e. when both the node and its children have entered the
   * scene tree. If the node has children, their [_ready] callbacks get triggered first, and the parent
   * node will receive the ready notification afterwards.
   * Corresponds to the [NOTIFICATION_READY] notification in [Object.Notification]. See also the
   * `@onready` annotation for variables.
   * Usually used for initialization. For even earlier initialization, [Object.Init] may be used.
   * See also [_enterTree].
   * **Note:** This method may be called only once for each node. After removing a node from the
   * scene tree and adding it again, [_ready] will **not** be called a second time. This can be
   * bypassed by requesting another call with [requestReady], which may be called anywhere before
   * adding the node again.
   */
  public open fun _ready(): Unit {
  }

  /**
   * The elements in the array returned from this method are displayed as warnings in the Scene dock
   * if the script that overrides it is a `tool` script.
   * Returning an empty array produces no warnings.
   * Call [updateConfigurationWarnings] when the warnings need to be updated for this node.
   * [codeblock]
   * @export var energy = 0:
   *     set(value):
   *         energy = value
   *         update_configuration_warnings()
   *
   * func _get_configuration_warnings():
   *     if energy < 0:
   *         return ["Energy must be 0 or greater."]
   *     else:
   *         return []
   * [/codeblock]
   */
  public open fun _getConfigurationWarnings(): PackedStringArray {
    throw NotImplementedError("_get_configuration_warnings is not implemented for Node")
  }

  /**
   * Called when there is an input event. The input event propagates up through the node tree until
   * a node consumes it.
   * It is only called if input processing is enabled, which is done automatically if this method is
   * overridden, and can be toggled with [setProcessInput].
   * To consume the input event and stop it propagating further to other nodes,
   * [Viewport.setInputAsHandled] can be called.
   * For gameplay input, [_unhandledInput] and [_unhandledKeyInput] are usually a better fit as they
   * allow the GUI to intercept the events first.
   * **Note:** This method is only called if the node is present in the scene tree (i.e. if it's not
   * an orphan).
   */
  public open fun _input(event: InputEvent?): Unit {
  }

  /**
   * Called when an [InputEventKey], [InputEventShortcut], or [InputEventJoypadButton] hasn't been
   * consumed by [_input] or any GUI [Control] item. It is called before [_unhandledKeyInput] and
   * [_unhandledInput]. The input event propagates up through the node tree until a node consumes it.
   * It is only called if shortcut processing is enabled, which is done automatically if this method
   * is overridden, and can be toggled with [setProcessShortcutInput].
   * To consume the input event and stop it propagating further to other nodes,
   * [Viewport.setInputAsHandled] can be called.
   * This method can be used to handle shortcuts. For generic GUI events, use [_input] instead.
   * Gameplay events should usually be handled with either [_unhandledInput] or [_unhandledKeyInput].
   * **Note:** This method is only called if the node is present in the scene tree (i.e. if it's not
   * orphan).
   */
  public open fun _shortcutInput(event: InputEvent?): Unit {
  }

  /**
   * Called when an [InputEvent] hasn't been consumed by [_input] or any GUI [Control] item. It is
   * called after [_shortcutInput] and after [_unhandledKeyInput]. The input event propagates up
   * through the node tree until a node consumes it.
   * It is only called if unhandled input processing is enabled, which is done automatically if this
   * method is overridden, and can be toggled with [setProcessUnhandledInput].
   * To consume the input event and stop it propagating further to other nodes,
   * [Viewport.setInputAsHandled] can be called.
   * For gameplay input, this method is usually a better fit than [_input], as GUI events need a
   * higher priority. For keyboard shortcuts, consider using [_shortcutInput] instead, as it is called
   * before this method. Finally, to handle keyboard events, consider using [_unhandledKeyInput] for
   * performance reasons.
   * **Note:** This method is only called if the node is present in the scene tree (i.e. if it's not
   * an orphan).
   */
  public open fun _unhandledInput(event: InputEvent?): Unit {
  }

  /**
   * Called when an [InputEventKey] hasn't been consumed by [_input] or any GUI [Control] item. It
   * is called after [_shortcutInput] but before [_unhandledInput]. The input event propagates up
   * through the node tree until a node consumes it.
   * It is only called if unhandled key input processing is enabled, which is done automatically if
   * this method is overridden, and can be toggled with [setProcessUnhandledKeyInput].
   * To consume the input event and stop it propagating further to other nodes,
   * [Viewport.setInputAsHandled] can be called.
   * This method can be used to handle Unicode character input with [kbd]Alt[/kbd], [kbd]Alt +
   * Ctrl[/kbd], and [kbd]Alt + Shift[/kbd] modifiers, after shortcuts were handled.
   * For gameplay input, this and [_unhandledInput] are usually a better fit than [_input], as GUI
   * events should be handled first. This method also performs better than [_unhandledInput], since
   * unrelated events such as [InputEventMouseMotion] are automatically filtered. For shortcuts,
   * consider using [_shortcutInput] instead.
   * **Note:** This method is only called if the node is present in the scene tree (i.e. if it's not
   * an orphan).
   */
  public open fun _unhandledKeyInput(event: InputEvent?): Unit {
  }

  /**
   * Adds a [sibling] node to this node's parent, and moves the added sibling right below this node.
   * If [forceReadableName] is `true`, improves the readability of the added [sibling]. If not
   * named, the [sibling] is renamed to its type, and if it shares [name] with a sibling, a number is
   * suffixed more appropriately. This operation is very slow. As such, it is recommended leaving this
   * to `false`, which assigns a dummy name featuring `@` in both situations.
   * Use [addChild] instead of this method if you don't need the child node to be added below a
   * specific node in the list of children.
   * **Note:** If this node is internal, the added sibling will be internal too (see [addChild]'s
   * `internal` parameter).
   */
  @JvmOverloads
  public final fun addSibling(sibling: Node?, forceReadableName: Boolean = false): Unit {
    TransferContext.writeArguments(OBJECT to sibling, BOOL to forceReadableName)
    TransferContext.callMethod(ptr, MethodBindings.addSiblingPtr, NIL)
  }

  public final fun setName(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.setNamePtr, NIL)
  }

  public final fun getName(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Adds a child [node]. Nodes can have any number of children, but every child must have a unique
   * name. Child nodes are automatically deleted when the parent node is deleted, so an entire scene
   * can be removed by deleting its topmost node.
   * If [forceReadableName] is `true`, improves the readability of the added [node]. If not named,
   * the [node] is renamed to its type, and if it shares [name] with a sibling, a number is suffixed
   * more appropriately. This operation is very slow. As such, it is recommended leaving this to
   * `false`, which assigns a dummy name featuring `@` in both situations.
   * If [internal] is different than [INTERNAL_MODE_DISABLED], the child will be added as internal
   * node. These nodes are ignored by methods like [getChildren], unless their parameter
   * `include_internal` is `true`. The intended usage is to hide the internal nodes from the user, so
   * the user won't accidentally delete or modify them. Used by some GUI nodes, e.g. [ColorPicker]. See
   * [InternalMode] for available modes.
   * **Note:** If [node] already has a parent, this method will fail. Use [removeChild] first to
   * remove [node] from its current parent. For example:
   *
   * gdscript:
   * ```gdscript
   * var child_node = get_child(0)
   * if child_node.get_parent():
   *     child_node.get_parent().remove_child(child_node)
   * add_child(child_node)
   * ```
   * csharp:
   * ```csharp
   * Node childNode = GetChild(0);
   * if (childNode.GetParent() != null)
   * {
   *     childNode.GetParent().RemoveChild(childNode);
   * }
   * AddChild(childNode);
   * ```
   *
   * If you need the child node to be added below a specific node in the list of children, use
   * [addSibling] instead of this method.
   * **Note:** If you want a child to be persisted to a [PackedScene], you must set [owner] in
   * addition to calling [addChild]. This is typically relevant for
   * [url=$DOCS_URL/tutorials/plugins/running_code_in_the_editor.html]tool scripts[/url] and
   * [url=$DOCS_URL/tutorials/plugins/editor/index.html]editor plugins[/url]. If [addChild] is called
   * without setting [owner], the newly added [Node] will not be visible in the scene tree, though it
   * will be visible in the 2D/3D view.
   */
  @JvmOverloads
  public final fun addChild(
    node: Node?,
    forceReadableName: Boolean = false,
    `internal`: InternalMode = Node.InternalMode.INTERNAL_MODE_DISABLED,
  ): Unit {
    TransferContext.writeArguments(OBJECT to node, BOOL to forceReadableName, LONG to internal.id)
    TransferContext.callMethod(ptr, MethodBindings.addChildPtr, NIL)
  }

  /**
   * Removes a child [node]. The [node], along with its children, are **not** deleted. To delete a
   * node, see [queueFree].
   * **Note:** When this node is inside the tree, this method sets the [owner] of the removed [node]
   * (or its descendants) to `null`, if their [owner] is no longer an ancestor (see [isAncestorOf]).
   */
  public final fun removeChild(node: Node?): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(ptr, MethodBindings.removeChildPtr, NIL)
  }

  /**
   * Changes the parent of this [Node] to the [newParent]. The node needs to already have a parent.
   * The node's [owner] is preserved if its owner is still reachable from the new location (i.e., the
   * node is still a descendant of the new parent after the operation).
   * If [keepGlobalTransform] is `true`, the node's global transform will be preserved if supported.
   * [Node2D], [Node3D] and [Control] support this argument (but [Control] keeps only position).
   */
  @JvmOverloads
  public final fun reparent(newParent: Node?, keepGlobalTransform: Boolean = true): Unit {
    TransferContext.writeArguments(OBJECT to newParent, BOOL to keepGlobalTransform)
    TransferContext.callMethod(ptr, MethodBindings.reparentPtr, NIL)
  }

  /**
   * Returns the number of children of this node.
   * If [includeInternal] is `false`, internal children are not counted (see [addChild]'s `internal`
   * parameter).
   */
  @JvmOverloads
  public final fun getChildCount(includeInternal: Boolean = false): Int {
    TransferContext.writeArguments(BOOL to includeInternal)
    TransferContext.callMethod(ptr, MethodBindings.getChildCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns all children of this node inside an [Array].
   * If [includeInternal] is `false`, excludes internal children from the returned array (see
   * [addChild]'s `internal` parameter).
   */
  @JvmOverloads
  public final fun getChildren(includeInternal: Boolean = false): VariantArray<Node> {
    TransferContext.writeArguments(BOOL to includeInternal)
    TransferContext.callMethod(ptr, MethodBindings.getChildrenPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Node>)
  }

  /**
   * Fetches a child node by its index. Each child node has an index relative its siblings (see
   * [getIndex]). The first child is at index 0. Negative values can also be used to start from the end
   * of the list. This method can be used in combination with [getChildCount] to iterate over this
   * node's children. If no child exists at the given index, this method returns `null` and an error is
   * generated.
   * If [includeInternal] is `false`, internal children are ignored (see [addChild]'s `internal`
   * parameter).
   * [codeblock]
   * # Assuming the following are children of this node, in order:
   * # First, Middle, Last.
   *
   * var a = get_child(0).name  # a is "First"
   * var b = get_child(1).name  # b is "Middle"
   * var b = get_child(2).name  # b is "Last"
   * var c = get_child(-1).name # c is "Last"
   * [/codeblock]
   * **Note:** To fetch a node by [NodePath], use [getNode].
   */
  @JvmOverloads
  public final fun getChild(idx: Int, includeInternal: Boolean = false): Node? {
    TransferContext.writeArguments(LONG to idx.toLong(), BOOL to includeInternal)
    TransferContext.callMethod(ptr, MethodBindings.getChildPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Node?)
  }

  /**
   * Returns `true` if the [path] points to a valid node. See also [getNode].
   */
  public final fun hasNode(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.hasNodePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Fetches a node. The [NodePath] can either be a relative path (from this node), or an absolute
   * path (from the [SceneTree.root]) to a node. If [path] does not point to a valid node, generates an
   * error and returns `null`. Attempts to access methods on the return value will result in an
   * *"Attempt to call <method> on a null instance."* error.
   * **Note:** Fetching by absolute path only works when the node is inside the scene tree (see
   * [isInsideTree]).
   * **Example:** Assume this method is called from the Character node, inside the following tree:
   * [codeblock lang=text]
   *  ┖╴root
   *     ┠╴Character (you are here!)
   *     ┃  ┠╴Sword
   *     ┃  ┖╴Backpack
   *     ┃     ┖╴Dagger
   *     ┠╴MyGame
   *     ┖╴Swamp
   *        ┠╴Alligator
   *        ┠╴Mosquito
   *        ┖╴Goblin
   * [/codeblock]
   * The following calls will return a valid node:
   *
   * gdscript:
   * ```gdscript
   * get_node("Sword")
   * get_node("Backpack/Dagger")
   * get_node("../Swamp/Alligator")
   * get_node("/root/MyGame")
   * ```
   * csharp:
   * ```csharp
   * GetNode("Sword");
   * GetNode("Backpack/Dagger");
   * GetNode("../Swamp/Alligator");
   * GetNode("/root/MyGame");
   * ```
   */
  public final fun getNode(path: NodePath): Node? {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.getNodePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Node?)
  }

  /**
   * Fetches a node by [NodePath]. Similar to [getNode], but does not generate an error if [path]
   * does not point to a valid node.
   */
  public final fun getNodeOrNull(path: NodePath): Node? {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.getNodeOrNullPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Node?)
  }

  /**
   * Returns this node's parent node, or `null` if the node doesn't have a parent.
   */
  public final fun getParent(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getParentPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Node?)
  }

  /**
   * Finds the first descendant of this node whose [name] matches [pattern], returning `null` if no
   * match is found. The matching is done against node names, *not* their paths, through
   * [String.match]. As such, it is case-sensitive, `"*"` matches zero or more characters, and `"?"`
   * matches any single character.
   * If [recursive] is `false`, only this node's direct children are checked. Nodes are checked in
   * tree order, so this node's first direct child is checked first, then its own direct children,
   * etc., before moving to the second direct child, and so on. Internal children are also included in
   * the search (see `internal` parameter in [addChild]).
   * If [owned] is `true`, only descendants with a valid [owner] node are checked.
   * **Note:** This method can be very slow. Consider storing a reference to the found node in a
   * variable. Alternatively, use [getNode] with unique names (see [uniqueNameInOwner]).
   * **Note:** To find all descendant nodes matching a pattern or a class type, see [findChildren].
   */
  @JvmOverloads
  public final fun findChild(
    pattern: String,
    recursive: Boolean = true,
    owned: Boolean = true,
  ): Node? {
    TransferContext.writeArguments(STRING to pattern, BOOL to recursive, BOOL to owned)
    TransferContext.callMethod(ptr, MethodBindings.findChildPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Node?)
  }

  /**
   * Finds all descendants of this node whose names match [pattern], returning an empty [Array] if
   * no match is found. The matching is done against node names, *not* their paths, through
   * [String.match]. As such, it is case-sensitive, `"*"` matches zero or more characters, and `"?"`
   * matches any single character.
   * If [type] is not empty, only ancestors inheriting from [type] are included (see
   * [Object.isClass]).
   * If [recursive] is `false`, only this node's direct children are checked. Nodes are checked in
   * tree order, so this node's first direct child is checked first, then its own direct children,
   * etc., before moving to the second direct child, and so on. Internal children are also included in
   * the search (see `internal` parameter in [addChild]).
   * If [owned] is `true`, only descendants with a valid [owner] node are checked.
   * **Note:** This method can be very slow. Consider storing references to the found nodes in a
   * variable.
   * **Note:** To find a single descendant node matching a pattern, see [findChild].
   */
  @JvmOverloads
  public final fun findChildren(
    pattern: String,
    type: String = "",
    recursive: Boolean = true,
    owned: Boolean = true,
  ): VariantArray<Node> {
    TransferContext.writeArguments(STRING to pattern, STRING to type, BOOL to recursive, BOOL to owned)
    TransferContext.callMethod(ptr, MethodBindings.findChildrenPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Node>)
  }

  /**
   * Finds the first ancestor of this node whose [name] matches [pattern], returning `null` if no
   * match is found. The matching is done through [String.match]. As such, it is case-sensitive, `"*"`
   * matches zero or more characters, and `"?"` matches any single character. See also [findChild] and
   * [findChildren].
   * **Note:** As this method walks upwards in the scene tree, it can be slow in large, deeply
   * nested nodes. Consider storing a reference to the found node in a variable. Alternatively, use
   * [getNode] with unique names (see [uniqueNameInOwner]).
   */
  public final fun findParent(pattern: String): Node? {
    TransferContext.writeArguments(STRING to pattern)
    TransferContext.callMethod(ptr, MethodBindings.findParentPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Node?)
  }

  /**
   * Returns `true` if [path] points to a valid node and its subnames point to a valid [Resource],
   * e.g. `Area2D/CollisionShape2D:shape`. Properties that are not [Resource] types (such as nodes or
   * other [Variant] types) are not considered. See also [getNodeAndResource].
   */
  public final fun hasNodeAndResource(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.hasNodeAndResourcePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Fetches a node and its most nested resource as specified by the [NodePath]'s subname. Returns
   * an [Array] of size `3` where:
   * - Element `0` is the [Node], or `null` if not found;
   * - Element `1` is the subname's last nested [Resource], or `null` if not found;
   * - Element `2` is the remaining [NodePath], referring to an existing, non-[Resource] property
   * (see [Object.getIndexed]).
   * **Example:** Assume that the child's [Sprite2D.texture] has been assigned a [AtlasTexture]:
   *
   * gdscript:
   * ```gdscript
   * var a = get_node_and_resource("Area2D/Sprite2D")
   * print(a[0].name) # Prints Sprite2D
   * print(a[1])      # Prints <null>
   * print(a[2])      # Prints ^""
   *
   * var b = get_node_and_resource("Area2D/Sprite2D:texture:atlas")
   * print(b[0].name)        # Prints Sprite2D
   * print(b[1].get_class()) # Prints AtlasTexture
   * print(b[2])             # Prints ^""
   *
   * var c = get_node_and_resource("Area2D/Sprite2D:texture:atlas:region")
   * print(c[0].name)        # Prints Sprite2D
   * print(c[1].get_class()) # Prints AtlasTexture
   * print(c[2])             # Prints ^":region"
   * ```
   * csharp:
   * ```csharp
   * var a = GetNodeAndResource(NodePath("Area2D/Sprite2D"));
   * GD.Print(a[0].Name); // Prints Sprite2D
   * GD.Print(a[1]);      // Prints <null>
   * GD.Print(a[2]);      // Prints ^"
   *
   * var b = GetNodeAndResource(NodePath("Area2D/Sprite2D:texture:atlas"));
   * GD.Print(b[0].name);        // Prints Sprite2D
   * GD.Print(b[1].get_class()); // Prints AtlasTexture
   * GD.Print(b[2]);             // Prints ^""
   *
   * var c = GetNodeAndResource(NodePath("Area2D/Sprite2D:texture:atlas:region"));
   * GD.Print(c[0].name);        // Prints Sprite2D
   * GD.Print(c[1].get_class()); // Prints AtlasTexture
   * GD.Print(c[2]);             // Prints ^":region"
   * ```
   */
  public final fun getNodeAndResource(path: NodePath): VariantArray<Any?> {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.getNodeAndResourcePtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Returns `true` if this node is currently inside a [SceneTree]. See also [getTree].
   */
  public final fun isInsideTree(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isInsideTreePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the node is part of the scene currently opened in the editor.
   */
  public final fun isPartOfEditedScene(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPartOfEditedScenePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the given [node] is a direct or indirect child of this node.
   */
  public final fun isAncestorOf(node: Node?): Boolean {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(ptr, MethodBindings.isAncestorOfPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the given [node] occurs later in the scene hierarchy than this node. A node
   * occurring later is usually processed last.
   */
  public final fun isGreaterThan(node: Node?): Boolean {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(ptr, MethodBindings.isGreaterThanPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the node's absolute path, relative to the [SceneTree.root]. If the node is not inside
   * the scene tree, this method fails and returns an empty [NodePath].
   */
  public final fun getPath(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Returns the relative [NodePath] from this node to the specified [node]. Both nodes must be in
   * the same [SceneTree] or scene hierarchy, otherwise this method fails and returns an empty
   * [NodePath].
   * If [useUniquePath] is `true`, returns the shortest path accounting for this node's unique name
   * (see [uniqueNameInOwner]).
   * **Note:** If you get a relative path which starts from a unique node, the path may be longer
   * than a normal relative path, due to the addition of the unique node's name.
   */
  @JvmOverloads
  public final fun getPathTo(node: Node?, useUniquePath: Boolean = false): NodePath {
    TransferContext.writeArguments(OBJECT to node, BOOL to useUniquePath)
    TransferContext.callMethod(ptr, MethodBindings.getPathToPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Adds the node to the [group]. Groups can be helpful to organize a subset of nodes, for example
   * `"enemies"` or `"collectables"`. See notes in the description, and the group methods in
   * [SceneTree].
   * If [persistent] is `true`, the group will be stored when saved inside a [PackedScene]. All
   * groups created and displayed in the Node dock are persistent.
   * **Note:** To improve performance, the order of group names is *not* guaranteed and may vary
   * between project runs. Therefore, do not rely on the group order.
   * **Note:** [SceneTree]'s group methods will *not* work on this node if not inside the tree (see
   * [isInsideTree]).
   */
  @JvmOverloads
  public final fun addToGroup(group: StringName, persistent: Boolean = false): Unit {
    TransferContext.writeArguments(STRING_NAME to group, BOOL to persistent)
    TransferContext.callMethod(ptr, MethodBindings.addToGroupPtr, NIL)
  }

  /**
   * Removes the node from the given [group]. Does nothing if the node is not in the [group]. See
   * also notes in the description, and the [SceneTree]'s group methods.
   */
  public final fun removeFromGroup(group: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to group)
    TransferContext.callMethod(ptr, MethodBindings.removeFromGroupPtr, NIL)
  }

  /**
   * Returns `true` if this node has been added to the given [group]. See [addToGroup] and
   * [removeFromGroup]. See also notes in the description, and the [SceneTree]'s group methods.
   */
  public final fun isInGroup(group: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to group)
    TransferContext.callMethod(ptr, MethodBindings.isInGroupPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Moves [childNode] to the given index. A node's index is the order among its siblings. If
   * [toIndex] is negative, the index is counted from the end of the list. See also [getChild] and
   * [getIndex].
   * **Note:** The processing order of several engine callbacks ([_ready], [_process], etc.) and
   * notifications sent through [propagateNotification] is affected by tree order. [CanvasItem] nodes
   * are also rendered in tree order. See also [processPriority].
   */
  public final fun moveChild(childNode: Node?, toIndex: Int): Unit {
    TransferContext.writeArguments(OBJECT to childNode, LONG to toIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.moveChildPtr, NIL)
  }

  /**
   * Returns an [Array] of group names that the node has been added to.
   * **Note:** To improve performance, the order of group names is *not* guaranteed and may vary
   * between project runs. Therefore, do not rely on the group order.
   * **Note:** This method may also return some group names starting with an underscore (`_`). These
   * are internally used by the engine. To avoid conflicts, do not use custom groups starting with
   * underscores. To exclude internal groups, see the following code snippet:
   *
   * gdscript:
   * ```gdscript
   * # Stores the node's non-internal groups only (as an array of StringNames).
   * var non_internal_groups = []
   * for group in get_groups():
   *     if not str(group).begins_with("_"):
   *         non_internal_groups.push_back(group)
   * ```
   * csharp:
   * ```csharp
   * // Stores the node's non-internal groups only (as a List of StringNames).
   * List<string> nonInternalGroups = new List<string>();
   * foreach (string group in GetGroups())
   * {
   *     if (!group.BeginsWith("_"))
   *         nonInternalGroups.Add(group);
   * }
   * ```
   */
  public final fun getGroups(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGroupsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<StringName>)
  }

  public final fun setOwner(owner: Node?): Unit {
    TransferContext.writeArguments(OBJECT to owner)
    TransferContext.callMethod(ptr, MethodBindings.setOwnerPtr, NIL)
  }

  public final fun getOwner(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOwnerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Node?)
  }

  /**
   * Returns this node's order among its siblings. The first node's index is `0`. See also
   * [getChild].
   * If [includeInternal] is `false`, returns the index ignoring internal children. The first,
   * non-internal child will have an index of `0` (see [addChild]'s `internal` parameter).
   */
  @JvmOverloads
  public final fun getIndex(includeInternal: Boolean = false): Int {
    TransferContext.writeArguments(BOOL to includeInternal)
    TransferContext.callMethod(ptr, MethodBindings.getIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Prints the node and its children to the console, recursively. The node does not have to be
   * inside the tree. This method outputs [NodePath]s relative to this node, and is good for
   * copy/pasting into [getNode]. See also [printTreePretty].
   * May print, for example:
   * [codeblock lang=text]
   * .
   * Menu
   * Menu/Label
   * Menu/Camera2D
   * SplashScreen
   * SplashScreen/Camera2D
   * [/codeblock]
   */
  public final fun printTree(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.printTreePtr, NIL)
  }

  /**
   * Prints the node and its children to the console, recursively. The node does not have to be
   * inside the tree. Similar to [printTree], but the graphical representation looks like what is
   * displayed in the editor's Scene dock. It is useful for inspecting larger trees.
   * May print, for example:
   * [codeblock lang=text]
   *  ┖╴TheGame
   *     ┠╴Menu
   *     ┃  ┠╴Label
   *     ┃  ┖╴Camera2D
   *     ┖╴SplashScreen
   *        ┖╴Camera2D
   * [/codeblock]
   */
  public final fun printTreePretty(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.printTreePrettyPtr, NIL)
  }

  /**
   * Returns the tree as a [String]. Used mainly for debugging purposes. This version displays the
   * path relative to the current node, and is good for copy/pasting into the [getNode] function. It
   * also can be used in game UI/UX.
   * May print, for example:
   * [codeblock lang=text]
   * TheGame
   * TheGame/Menu
   * TheGame/Menu/Label
   * TheGame/Menu/Camera2D
   * TheGame/SplashScreen
   * TheGame/SplashScreen/Camera2D
   * [/codeblock]
   */
  public final fun getTreeString(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTreeStringPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Similar to [getTreeString], this returns the tree as a [String]. This version displays a more
   * graphical representation similar to what is displayed in the Scene Dock. It is useful for
   * inspecting larger trees.
   * May print, for example:
   * [codeblock lang=text]
   *  ┖╴TheGame
   *     ┠╴Menu
   *     ┃  ┠╴Label
   *     ┃  ┖╴Camera2D
   *     ┖╴SplashScreen
   *        ┖╴Camera2D
   * [/codeblock]
   */
  public final fun getTreeStringPretty(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTreeStringPrettyPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setSceneFilePath(sceneFilePath: String): Unit {
    TransferContext.writeArguments(STRING to sceneFilePath)
    TransferContext.callMethod(ptr, MethodBindings.setSceneFilePathPtr, NIL)
  }

  public final fun getSceneFilePath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSceneFilePathPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Calls [Object.notification] with [what] on this node and all of its children, recursively.
   */
  public final fun propagateNotification(what: Int): Unit {
    TransferContext.writeArguments(LONG to what.toLong())
    TransferContext.callMethod(ptr, MethodBindings.propagateNotificationPtr, NIL)
  }

  /**
   * Calls the given [method] name, passing [args] as arguments, on this node and all of its
   * children, recursively.
   * If [parentFirst] is `true`, the method is called on this node first, then on all of its
   * children. If `false`, the children's methods are called first.
   */
  @JvmOverloads
  public final fun propagateCall(
    method: StringName,
    args: VariantArray<Any?> = godot.core.variantArrayOf(),
    parentFirst: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to method, ARRAY to args, BOOL to parentFirst)
    TransferContext.callMethod(ptr, MethodBindings.propagateCallPtr, NIL)
  }

  /**
   * If set to `true`, enables physics (fixed framerate) processing. When a node is being processed,
   * it will receive a [NOTIFICATION_PHYSICS_PROCESS] at a fixed (usually 60 FPS, see
   * [Engine.physicsTicksPerSecond] to change) interval (and the [_physicsProcess] callback will be
   * called if it exists).
   * **Note:** If [_physicsProcess] is overridden, this will be automatically enabled before
   * [_ready] is called.
   */
  public final fun setPhysicsProcess(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setPhysicsProcessPtr, NIL)
  }

  /**
   * Returns the time elapsed (in seconds) since the last physics callback. This value is identical
   * to [_physicsProcess]'s `delta` parameter, and is often consistent at run-time, unless
   * [Engine.physicsTicksPerSecond] is changed. See also [NOTIFICATION_PHYSICS_PROCESS].
   */
  public final fun getPhysicsProcessDeltaTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPhysicsProcessDeltaTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns `true` if physics processing is enabled (see [setPhysicsProcess]).
   */
  public final fun isPhysicsProcessing(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPhysicsProcessingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the time elapsed (in seconds) since the last process callback. This value is identical
   * to [_process]'s `delta` parameter, and may vary from frame to frame. See also
   * [NOTIFICATION_PROCESS].
   */
  public final fun getProcessDeltaTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getProcessDeltaTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * If set to `true`, enables processing. When a node is being processed, it will receive a
   * [NOTIFICATION_PROCESS] on every drawn frame (and the [_process] callback will be called if it
   * exists).
   * **Note:** If [_process] is overridden, this will be automatically enabled before [_ready] is
   * called.
   * **Note:** This method only affects the [_process] callback, i.e. it has no effect on other
   * callbacks like [_physicsProcess]. If you want to disable all processing for the node, set
   * [processMode] to [PROCESS_MODE_DISABLED].
   */
  public final fun setProcess(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setProcessPtr, NIL)
  }

  public final fun setProcessPriority(priority: Int): Unit {
    TransferContext.writeArguments(LONG to priority.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setProcessPriorityPtr, NIL)
  }

  public final fun getProcessPriority(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getProcessPriorityPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setPhysicsProcessPriority(priority: Int): Unit {
    TransferContext.writeArguments(LONG to priority.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setPhysicsProcessPriorityPtr, NIL)
  }

  public final fun getPhysicsProcessPriority(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPhysicsProcessPriorityPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if processing is enabled (see [setProcess]).
   */
  public final fun isProcessing(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isProcessingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If set to `true`, enables input processing.
   * **Note:** If [_input] is overridden, this will be automatically enabled before [_ready] is
   * called. Input processing is also already enabled for GUI controls, such as [Button] and
   * [TextEdit].
   */
  public final fun setProcessInput(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setProcessInputPtr, NIL)
  }

  /**
   * Returns `true` if the node is processing input (see [setProcessInput]).
   */
  public final fun isProcessingInput(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isProcessingInputPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If set to `true`, enables shortcut processing for this node.
   * **Note:** If [_shortcutInput] is overridden, this will be automatically enabled before [_ready]
   * is called.
   */
  public final fun setProcessShortcutInput(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setProcessShortcutInputPtr, NIL)
  }

  /**
   * Returns `true` if the node is processing shortcuts (see [setProcessShortcutInput]).
   */
  public final fun isProcessingShortcutInput(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isProcessingShortcutInputPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If set to `true`, enables unhandled input processing. It enables the node to receive all input
   * that was not previously handled (usually by a [Control]).
   * **Note:** If [_unhandledInput] is overridden, this will be automatically enabled before
   * [_ready] is called. Unhandled input processing is also already enabled for GUI controls, such as
   * [Button] and [TextEdit].
   */
  public final fun setProcessUnhandledInput(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setProcessUnhandledInputPtr, NIL)
  }

  /**
   * Returns `true` if the node is processing unhandled input (see [setProcessUnhandledInput]).
   */
  public final fun isProcessingUnhandledInput(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isProcessingUnhandledInputPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If set to `true`, enables unhandled key input processing.
   * **Note:** If [_unhandledKeyInput] is overridden, this will be automatically enabled before
   * [_ready] is called.
   */
  public final fun setProcessUnhandledKeyInput(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setProcessUnhandledKeyInputPtr, NIL)
  }

  /**
   * Returns `true` if the node is processing unhandled key input (see
   * [setProcessUnhandledKeyInput]).
   */
  public final fun isProcessingUnhandledKeyInput(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isProcessingUnhandledKeyInputPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setProcessMode(mode: ProcessMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setProcessModePtr, NIL)
  }

  public final fun getProcessMode(): ProcessMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getProcessModePtr, LONG)
    return Node.ProcessMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the node can receive processing notifications and input callbacks
   * ([NOTIFICATION_PROCESS], [_input], etc.) from the [SceneTree] and [Viewport]. The returned value
   * depends on [processMode]:
   * - If set to [PROCESS_MODE_PAUSABLE], returns `true` when the game is processing, i.e.
   * [SceneTree.paused] is `false`;
   * - If set to [PROCESS_MODE_WHEN_PAUSED], returns `true` when the game is paused, i.e.
   * [SceneTree.paused] is `true`;
   * - If set to [PROCESS_MODE_ALWAYS], always returns `true`;
   * - If set to [PROCESS_MODE_DISABLED], always returns `false`;
   * - If set to [PROCESS_MODE_INHERIT], use the parent node's [processMode] to determine the
   * result.
   * If the node is not inside the tree, returns `false` no matter the value of [processMode].
   */
  public final fun canProcess(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.canProcessPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setProcessThreadGroup(mode: ProcessThreadGroup): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setProcessThreadGroupPtr, NIL)
  }

  public final fun getProcessThreadGroup(): ProcessThreadGroup {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getProcessThreadGroupPtr, LONG)
    return Node.ProcessThreadGroup.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setProcessThreadMessages(flags: ProcessThreadMessages): Unit {
    TransferContext.writeArguments(LONG to flags.flag)
    TransferContext.callMethod(ptr, MethodBindings.setProcessThreadMessagesPtr, NIL)
  }

  public final fun getProcessThreadMessages(): ProcessThreadMessages {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getProcessThreadMessagesPtr, LONG)
    return ProcessThreadMessagesValue(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setProcessThreadGroupOrder(order: Int): Unit {
    TransferContext.writeArguments(LONG to order.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setProcessThreadGroupOrderPtr, NIL)
  }

  public final fun getProcessThreadGroupOrder(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getProcessThreadGroupOrderPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * If set to `true`, the node appears folded in the Scene dock. As a result, all of its children
   * are hidden. This method is intended to be used in editor plugins and tools, but it also works in
   * release builds. See also [isDisplayedFolded].
   */
  public final fun setDisplayFolded(fold: Boolean): Unit {
    TransferContext.writeArguments(BOOL to fold)
    TransferContext.callMethod(ptr, MethodBindings.setDisplayFoldedPtr, NIL)
  }

  /**
   * Returns `true` if the node is folded (collapsed) in the Scene dock. This method is intended to
   * be used in editor plugins and tools. See also [setDisplayFolded].
   */
  public final fun isDisplayedFolded(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDisplayedFoldedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If set to `true`, enables internal processing for this node. Internal processing happens in
   * isolation from the normal [_process] calls and is used by some nodes internally to guarantee
   * proper functioning even if the node is paused or processing is disabled for scripting
   * ([setProcess]).
   * **Warning:** Built-in nodes rely on internal processing for their internal logic. Disabling it
   * is unsafe and may lead to unexpected behavior. Use this method if you know what you are doing.
   */
  public final fun setProcessInternal(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setProcessInternalPtr, NIL)
  }

  /**
   * Returns `true` if internal processing is enabled (see [setProcessInternal]).
   */
  public final fun isProcessingInternal(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isProcessingInternalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If set to `true`, enables internal physics for this node. Internal physics processing happens
   * in isolation from the normal [_physicsProcess] calls and is used by some nodes internally to
   * guarantee proper functioning even if the node is paused or physics processing is disabled for
   * scripting ([setPhysicsProcess]).
   * **Warning:** Built-in nodes rely on internal processing for their internal logic. Disabling it
   * is unsafe and may lead to unexpected behavior. Use this method if you know what you are doing.
   */
  public final fun setPhysicsProcessInternal(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setPhysicsProcessInternalPtr, NIL)
  }

  /**
   * Returns `true` if internal physics processing is enabled (see [setPhysicsProcessInternal]).
   */
  public final fun isPhysicsProcessingInternal(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPhysicsProcessingInternalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPhysicsInterpolationMode(mode: PhysicsInterpolationMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setPhysicsInterpolationModePtr, NIL)
  }

  public final fun getPhysicsInterpolationMode(): PhysicsInterpolationMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPhysicsInterpolationModePtr, LONG)
    return Node.PhysicsInterpolationMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if physics interpolation is enabled for this node (see
   * [physicsInterpolationMode]).
   * **Note:** Interpolation will only be active if both the flag is set **and** physics
   * interpolation is enabled within the [SceneTree]. This can be tested using
   * [isPhysicsInterpolatedAndEnabled].
   */
  public final fun isPhysicsInterpolated(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPhysicsInterpolatedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if physics interpolation is enabled (see [physicsInterpolationMode]) **and**
   * enabled in the [SceneTree].
   * This is a convenience version of [isPhysicsInterpolated] that also checks whether physics
   * interpolation is enabled globally.
   * See [SceneTree.physicsInterpolation] and [ProjectSettings.physics/common/physicsInterpolation].
   */
  public final fun isPhysicsInterpolatedAndEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPhysicsInterpolatedAndEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * When physics interpolation is active, moving a node to a radically different transform (such as
   * placement within a level) can result in a visible glitch as the object is rendered moving from the
   * old to new position over the physics tick.
   * That glitch can be prevented by calling this method, which temporarily disables interpolation
   * until the physics tick is complete.
   * The notification [NOTIFICATION_RESET_PHYSICS_INTERPOLATION] will be received by the node and
   * all children recursively.
   * **Note:** This function should be called **after** moving the node, rather than before.
   */
  public final fun resetPhysicsInterpolation(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.resetPhysicsInterpolationPtr, NIL)
  }

  public final fun setAutoTranslateMode(mode: AutoTranslateMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setAutoTranslateModePtr, NIL)
  }

  public final fun getAutoTranslateMode(): AutoTranslateMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAutoTranslateModePtr, LONG)
    return Node.AutoTranslateMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the [Window] that contains this node. If the node is in the main window, this is
   * equivalent to getting the root node (`get_tree().get_root()`).
   */
  public final fun getWindow(): Window? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWindowPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Window?)
  }

  /**
   * Returns the [Window] that contains this node, or the last exclusive child in a chain of windows
   * starting with the one that contains this node.
   */
  public final fun getLastExclusiveWindow(): Window? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLastExclusiveWindowPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Window?)
  }

  /**
   * Returns the [SceneTree] that contains this node. If this node is not inside the tree, generates
   * an error and returns `null`. See also [isInsideTree].
   */
  public final fun getTree(): SceneTree? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTreePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as SceneTree?)
  }

  /**
   * Creates a new [Tween] and binds it to this node.
   * This is the equivalent of doing:
   *
   * gdscript:
   * ```gdscript
   * get_tree().create_tween().bind_node(self)
   * ```
   * csharp:
   * ```csharp
   * GetTree().CreateTween().BindNode(this);
   * ```
   *
   * The Tween will start automatically on the next process frame or physics frame (depending on
   * [Tween.TweenProcessMode]). See [Tween.bindNode] for more info on Tweens bound to nodes.
   * **Note:** The method can still be used when the node is not inside [SceneTree]. It can fail in
   * an unlikely case of using a custom [MainLoop].
   */
  public final fun createTween(): Tween? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.createTweenPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Tween?)
  }

  /**
   * Duplicates the node, returning a new node with all of its properties, signals and groups copied
   * from the original. The behavior can be tweaked through the [flags] (see [DuplicateFlags]).
   * **Note:** For nodes with a [Script] attached, if [Object.Init] has been defined with required
   * parameters, the duplicated node will not have a [Script].
   */
  @JvmOverloads
  public final fun duplicate(flags: Int = 15): Node? {
    TransferContext.writeArguments(LONG to flags.toLong())
    TransferContext.callMethod(ptr, MethodBindings.duplicatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Node?)
  }

  /**
   * Replaces this node by the given [node]. All children of this node are moved to [node].
   * If [keepGroups] is `true`, the [node] is added to the same groups that the replaced node is in
   * (see [addToGroup]).
   * **Warning:** The replaced node is removed from the tree, but it is **not** deleted. To prevent
   * memory leaks, store a reference to the node in a variable, or use [Object.free].
   */
  @JvmOverloads
  public final fun replaceBy(node: Node?, keepGroups: Boolean = false): Unit {
    TransferContext.writeArguments(OBJECT to node, BOOL to keepGroups)
    TransferContext.callMethod(ptr, MethodBindings.replaceByPtr, NIL)
  }

  /**
   * If set to `true`, the node becomes a [InstancePlaceholder] when packed and instantiated from a
   * [PackedScene]. See also [getSceneInstanceLoadPlaceholder].
   */
  public final fun setSceneInstanceLoadPlaceholder(loadPlaceholder: Boolean): Unit {
    TransferContext.writeArguments(BOOL to loadPlaceholder)
    TransferContext.callMethod(ptr, MethodBindings.setSceneInstanceLoadPlaceholderPtr, NIL)
  }

  /**
   * Returns `true` if this node is an instance load placeholder. See [InstancePlaceholder] and
   * [setSceneInstanceLoadPlaceholder].
   */
  public final fun getSceneInstanceLoadPlaceholder(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSceneInstanceLoadPlaceholderPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Set to `true` to allow all nodes owned by [node] to be available, and editable, in the Scene
   * dock, even if their [owner] is not the scene root. This method is intended to be used in editor
   * plugins and tools, but it also works in release builds. See also [isEditableInstance].
   */
  public final fun setEditableInstance(node: Node?, isEditable: Boolean): Unit {
    TransferContext.writeArguments(OBJECT to node, BOOL to isEditable)
    TransferContext.callMethod(ptr, MethodBindings.setEditableInstancePtr, NIL)
  }

  /**
   * Returns `true` if [node] has editable children enabled relative to this node. This method is
   * intended to be used in editor plugins and tools. See also [setEditableInstance].
   */
  public final fun isEditableInstance(node: Node?): Boolean {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(ptr, MethodBindings.isEditableInstancePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the node's closest [Viewport] ancestor, if the node is inside the tree. Otherwise,
   * returns `null`.
   */
  public final fun getViewport(): Viewport? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getViewportPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Viewport?)
  }

  /**
   * Queues this node to be deleted at the end of the current frame. When deleted, all of its
   * children are deleted as well, and all references to the node and its children become invalid.
   * Unlike with [Object.free], the node is not deleted instantly, and it can still be accessed
   * before deletion. It is also safe to call [queueFree] multiple times. Use
   * [Object.isQueuedForDeletion] to check if the node will be deleted at the end of the frame.
   * **Note:** The node will only be freed after all other deferred calls are finished. Using this
   * method is not always the same as calling [Object.free] through [Object.callDeferred].
   */
  public final fun queueFree(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.queueFreePtr, NIL)
  }

  /**
   * Requests [_ready] to be called again the next time the node enters the tree. Does **not**
   * immediately call [_ready].
   * **Note:** This method only affects the current node. If the node's children also need to
   * request ready, this method needs to be called for each one of them. When the node and its children
   * enter the tree again, the order of [_ready] callbacks will be the same as normal.
   */
  public final fun requestReady(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.requestReadyPtr, NIL)
  }

  /**
   * Returns `true` if the node is ready, i.e. it's inside scene tree and all its children are
   * initialized.
   * [requestReady] resets it back to `false`.
   */
  public final fun isNodeReady(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isNodeReadyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the node's multiplayer authority to the peer with the given peer [id]. The multiplayer
   * authority is the peer that has authority over the node on the network. Defaults to peer ID 1 (the
   * server). Useful in conjunction with [rpcConfig] and the [MultiplayerAPI].
   * If [recursive] is `true`, the given peer is recursively set as the authority for all children
   * of this node.
   * **Warning:** This does **not** automatically replicate the new authority to other peers. It is
   * the developer's responsibility to do so. You may replicate the new authority's information using
   * [MultiplayerSpawner.spawnFunction], an RPC, or a [MultiplayerSynchronizer]. Furthermore, the
   * parent's authority does **not** propagate to newly added children.
   */
  @JvmOverloads
  public final fun setMultiplayerAuthority(id: Int, recursive: Boolean = true): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), BOOL to recursive)
    TransferContext.callMethod(ptr, MethodBindings.setMultiplayerAuthorityPtr, NIL)
  }

  /**
   * Returns the peer ID of the multiplayer authority for this node. See [setMultiplayerAuthority].
   */
  public final fun getMultiplayerAuthority(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMultiplayerAuthorityPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the local system is the multiplayer authority of this node.
   */
  public final fun isMultiplayerAuthority(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isMultiplayerAuthorityPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getMultiplayer(): MultiplayerAPI? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMultiplayerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as MultiplayerAPI?)
  }

  /**
   * Changes the RPC configuration for the given [method]. [config] should either be `null` to
   * disable the feature (as by default), or a [Dictionary] containing the following entries:
   * - `rpc_mode`: see [MultiplayerAPI.RPCMode];
   * - `transfer_mode`: see [MultiplayerPeer.TransferMode];
   * - `call_local`: if `true`, the method will also be called locally;
   * - `channel`: an [int] representing the channel to send the RPC on.
   * **Note:** In GDScript, this method corresponds to the [annotation @GDScript.@rpc] annotation,
   * with various parameters passed (`@rpc(any)`, `@rpc(authority)`...). See also the
   * [url=$DOCS_URL/tutorials/networking/high_level_multiplayer.html]high-level multiplayer[/url]
   * tutorial.
   */
  public final fun rpcConfig(method: StringName, config: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to method, ANY to config)
    TransferContext.callMethod(ptr, MethodBindings.rpcConfigPtr, NIL)
  }

  public final fun setEditorDescription(editorDescription: String): Unit {
    TransferContext.writeArguments(STRING to editorDescription)
    TransferContext.callMethod(ptr, MethodBindings.setEditorDescriptionPtr, NIL)
  }

  public final fun getEditorDescription(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEditorDescriptionPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setUniqueNameInOwner(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setUniqueNameInOwnerPtr, NIL)
  }

  public final fun isUniqueNameInOwner(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUniqueNameInOwnerPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Translates a [message], using the translation catalogs configured in the Project Settings.
   * Further [context] can be specified to help with the translation. Note that most [Control] nodes
   * automatically translate their strings, so this method is mostly useful for formatted strings or
   * custom drawn text.
   * This method works the same as [Object.tr], with the addition of respecting the
   * [autoTranslateMode] state.
   * If [Object.canTranslateMessages] is `false`, or no translation is available, this method
   * returns the [message] without changes. See [Object.setMessageTranslation].
   * For detailed examples, see
   * [url=$DOCS_URL/tutorials/i18n/internationalizing_games.html]Internationalizing games[/url].
   */
  @JvmOverloads
  public final fun atr(message: String, context: StringName = StringName("")): String {
    TransferContext.writeArguments(STRING to message, STRING_NAME to context)
    TransferContext.callMethod(ptr, MethodBindings.atrPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Translates a [message] or [pluralMessage], using the translation catalogs configured in the
   * Project Settings. Further [context] can be specified to help with the translation.
   * This method works the same as [Object.trN], with the addition of respecting the
   * [autoTranslateMode] state.
   * If [Object.canTranslateMessages] is `false`, or no translation is available, this method
   * returns [message] or [pluralMessage], without changes. See [Object.setMessageTranslation].
   * The [n] is the number, or amount, of the message's subject. It is used by the translation
   * system to fetch the correct plural form for the current language.
   * For detailed examples, see
   * [url=$DOCS_URL/tutorials/i18n/localization_using_gettext.html]Localization using gettext[/url].
   * **Note:** Negative and [float] numbers may not properly apply to some countable subjects. It's
   * recommended to handle these cases with [atr].
   */
  @JvmOverloads
  public final fun atrN(
    message: String,
    pluralMessage: StringName,
    n: Int,
    context: StringName = StringName(""),
  ): String {
    TransferContext.writeArguments(STRING to message, STRING_NAME to pluralMessage, LONG to n.toLong(), STRING_NAME to context)
    TransferContext.callMethod(ptr, MethodBindings.atrNPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sends a remote procedure call request for the given [method] to peers on the network (and
   * locally), sending additional arguments to the method called by the RPC. The call request will only
   * be received by nodes with the same [NodePath], including the exact same [name]. Behavior depends
   * on the RPC configuration for the given [method] (see [rpcConfig] and [annotation @GDScript.@rpc]).
   * By default, methods are not exposed to RPCs.
   * May return [OK] if the call is successful, [ERR_INVALID_PARAMETER] if the arguments passed in
   * the [method] do not match, [ERR_UNCONFIGURED] if the node's [multiplayer] cannot be fetched (such
   * as when the node is not inside the tree), [ERR_CONNECTION_ERROR] if [multiplayer]'s connection is
   * not available.
   * **Note:** You can only safely use RPCs on clients after you received the [signal
   * MultiplayerAPI.connected_to_server] signal from the [MultiplayerAPI]. You also need to keep track
   * of the connection state, either by the [MultiplayerAPI] signals like [signal
   * MultiplayerAPI.server_disconnected] or by checking
   * (`get_multiplayer().peer.get_connection_status() == CONNECTION_CONNECTED`).
   */
  public final fun rpc(method: StringName, vararg __var_args: Any?): Error {
    TransferContext.writeArguments(STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(ptr, MethodBindings.rpcPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sends a [rpc] to a specific peer identified by [peerId] (see [MultiplayerPeer.setTargetPeer]).
   * May return [OK] if the call is successful, [ERR_INVALID_PARAMETER] if the arguments passed in
   * the [method] do not match, [ERR_UNCONFIGURED] if the node's [multiplayer] cannot be fetched (such
   * as when the node is not inside the tree), [ERR_CONNECTION_ERROR] if [multiplayer]'s connection is
   * not available.
   */
  public final fun rpcId(
    peerId: Long,
    method: StringName,
    vararg __var_args: Any?,
  ): Error {
    TransferContext.writeArguments(LONG to peerId, STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(ptr, MethodBindings.rpcIdPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Refreshes the warnings displayed for this node in the Scene dock. Use
   * [_getConfigurationWarnings] to customize the warning messages to display.
   */
  public final fun updateConfigurationWarnings(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.updateConfigurationWarningsPtr, NIL)
  }

  /**
   * This function is similar to [Object.callDeferred] except that the call will take place when the
   * node thread group is processed. If the node thread group processes in sub-threads, then the call
   * will be done on that thread, right before [NOTIFICATION_PROCESS] or
   * [NOTIFICATION_PHYSICS_PROCESS], the [_process] or [_physicsProcess] or their internal versions are
   * called.
   */
  public final fun callDeferredThreadGroup(method: StringName, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(ptr, MethodBindings.callDeferredThreadGroupPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Similar to [callDeferredThreadGroup], but for setting properties.
   */
  public final fun setDeferredThreadGroup(`property`: StringName, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to property, ANY to value)
    TransferContext.callMethod(ptr, MethodBindings.setDeferredThreadGroupPtr, NIL)
  }

  /**
   * Similar to [callDeferredThreadGroup], but for notifications.
   */
  public final fun notifyDeferredThreadGroup(what: Int): Unit {
    TransferContext.writeArguments(LONG to what.toLong())
    TransferContext.callMethod(ptr, MethodBindings.notifyDeferredThreadGroupPtr, NIL)
  }

  /**
   * This function ensures that the calling of this function will succeed, no matter whether it's
   * being done from a thread or not. If called from a thread that is not allowed to call the function,
   * the call will become deferred. Otherwise, the call will go through directly.
   */
  public final fun callThreadSafe(method: StringName, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(ptr, MethodBindings.callThreadSafePtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Similar to [callThreadSafe], but for setting properties.
   */
  public final fun setThreadSafe(`property`: StringName, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to property, ANY to value)
    TransferContext.callMethod(ptr, MethodBindings.setThreadSafePtr, NIL)
  }

  /**
   * Similar to [callThreadSafe], but for notifications.
   */
  public final fun notifyThreadSafe(what: Int): Unit {
    TransferContext.writeArguments(LONG to what.toLong())
    TransferContext.callMethod(ptr, MethodBindings.notifyThreadSafePtr, NIL)
  }

  public enum class ProcessMode(
    id: Long,
  ) {
    /**
     * Inherits [processMode] from the node's parent. This is the default for any newly created
     * node.
     */
    PROCESS_MODE_INHERIT(0),
    /**
     * Stops processing when [SceneTree.paused] is `true`. This is the inverse of
     * [PROCESS_MODE_WHEN_PAUSED], and the default for the root node.
     */
    PROCESS_MODE_PAUSABLE(1),
    /**
     * Process **only** when [SceneTree.paused] is `true`. This is the inverse of
     * [PROCESS_MODE_PAUSABLE].
     */
    PROCESS_MODE_WHEN_PAUSED(2),
    /**
     * Always process. Keeps processing, ignoring [SceneTree.paused]. This is the inverse of
     * [PROCESS_MODE_DISABLED].
     */
    PROCESS_MODE_ALWAYS(3),
    /**
     * Never process. Completely disables processing, ignoring [SceneTree.paused]. This is the
     * inverse of [PROCESS_MODE_ALWAYS].
     */
    PROCESS_MODE_DISABLED(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ProcessMode = entries.single { it.id == `value` }
    }
  }

  public enum class ProcessThreadGroup(
    id: Long,
  ) {
    /**
     * Process this node based on the thread group mode of the first parent (or grandparent) node
     * that has a thread group mode that is not inherit. See [processThreadGroup] for more information.
     */
    PROCESS_THREAD_GROUP_INHERIT(0),
    /**
     * Process this node (and child nodes set to inherit) on the main thread. See
     * [processThreadGroup] for more information.
     */
    PROCESS_THREAD_GROUP_MAIN_THREAD(1),
    /**
     * Process this node (and child nodes set to inherit) on a sub-thread. See [processThreadGroup]
     * for more information.
     */
    PROCESS_THREAD_GROUP_SUB_THREAD(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ProcessThreadGroup = entries.single { it.id == `value` }
    }
  }

  public sealed interface ProcessThreadMessages {
    public val flag: Long

    public infix fun or(other: ProcessThreadMessages): ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.or(other.flag))

    public infix fun or(other: Long): ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.or(other))

    public infix fun xor(other: ProcessThreadMessages): ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.xor(other.flag))

    public infix fun xor(other: Long): ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.xor(other))

    public infix fun and(other: ProcessThreadMessages): ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.and(other.flag))

    public infix fun and(other: Long): ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.and(other))

    public operator fun plus(other: ProcessThreadMessages): ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.plus(other.flag))

    public operator fun plus(other: Long): ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.plus(other))

    public operator fun minus(other: ProcessThreadMessages): ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.minus(other.flag))

    public operator fun minus(other: Long): ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.minus(other))

    public operator fun times(other: ProcessThreadMessages): ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.times(other.flag))

    public operator fun times(other: Long): ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.times(other))

    public operator fun div(other: ProcessThreadMessages): ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.div(other.flag))

    public operator fun div(other: Long): ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.div(other))

    public operator fun rem(other: ProcessThreadMessages): ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.rem(other.flag))

    public operator fun rem(other: Long): ProcessThreadMessages =
        ProcessThreadMessagesValue(flag.rem(other))

    public fun unaryPlus(): ProcessThreadMessages = ProcessThreadMessagesValue(flag.unaryPlus())

    public fun unaryMinus(): ProcessThreadMessages = ProcessThreadMessagesValue(flag.unaryMinus())

    public fun inv(): ProcessThreadMessages = ProcessThreadMessagesValue(flag.inv())

    public infix fun shl(bits: Int): ProcessThreadMessages =
        ProcessThreadMessagesValue(flag shl bits)

    public infix fun shr(bits: Int): ProcessThreadMessages =
        ProcessThreadMessagesValue(flag shr bits)

    public infix fun ushr(bits: Int): ProcessThreadMessages =
        ProcessThreadMessagesValue(flag ushr bits)

    public companion object {
      public val FLAG_PROCESS_THREAD_MESSAGES: ProcessThreadMessages = ProcessThreadMessagesValue(1)

      public val FLAG_PROCESS_THREAD_MESSAGES_PHYSICS: ProcessThreadMessages =
          ProcessThreadMessagesValue(2)

      public val FLAG_PROCESS_THREAD_MESSAGES_ALL: ProcessThreadMessages =
          ProcessThreadMessagesValue(3)
    }
  }

  @JvmInline
  internal value class ProcessThreadMessagesValue internal constructor(
    public override val flag: Long,
  ) : ProcessThreadMessages

  public enum class PhysicsInterpolationMode(
    id: Long,
  ) {
    /**
     * Inherits [physicsInterpolationMode] from the node's parent. This is the default for any newly
     * created node.
     */
    PHYSICS_INTERPOLATION_MODE_INHERIT(0),
    /**
     * Enables physics interpolation for this node and for children set to
     * [PHYSICS_INTERPOLATION_MODE_INHERIT]. This is the default for the root node.
     */
    PHYSICS_INTERPOLATION_MODE_ON(1),
    /**
     * Disables physics interpolation for this node and for children set to
     * [PHYSICS_INTERPOLATION_MODE_INHERIT].
     */
    PHYSICS_INTERPOLATION_MODE_OFF(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PhysicsInterpolationMode = entries.single { it.id == `value` }
    }
  }

  public enum class DuplicateFlags(
    id: Long,
  ) {
    /**
     * Duplicate the node's signal connections.
     */
    DUPLICATE_SIGNALS(1),
    /**
     * Duplicate the node's groups.
     */
    DUPLICATE_GROUPS(2),
    /**
     * Duplicate the node's script (also overriding the duplicated children's scripts, if combined
     * with [DUPLICATE_USE_INSTANTIATION]).
     */
    DUPLICATE_SCRIPTS(4),
    /**
     * Duplicate using [PackedScene.instantiate]. If the node comes from a scene saved on disk,
     * re-uses [PackedScene.instantiate] as the base for the duplicated node and its children.
     */
    DUPLICATE_USE_INSTANTIATION(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DuplicateFlags = entries.single { it.id == `value` }
    }
  }

  public enum class InternalMode(
    id: Long,
  ) {
    /**
     * The node will not be internal.
     */
    INTERNAL_MODE_DISABLED(0),
    /**
     * The node will be placed at the beginning of the parent's children, before any non-internal
     * sibling.
     */
    INTERNAL_MODE_FRONT(1),
    /**
     * The node will be placed at the end of the parent's children, after any non-internal sibling.
     */
    INTERNAL_MODE_BACK(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): InternalMode = entries.single { it.id == `value` }
    }
  }

  public enum class AutoTranslateMode(
    id: Long,
  ) {
    /**
     * Inherits [autoTranslateMode] from the node's parent. This is the default for any newly
     * created node.
     */
    AUTO_TRANSLATE_MODE_INHERIT(0),
    /**
     * Always automatically translate. This is the inverse of [AUTO_TRANSLATE_MODE_DISABLED], and
     * the default for the root node.
     */
    AUTO_TRANSLATE_MODE_ALWAYS(1),
    /**
     * Never automatically translate. This is the inverse of [AUTO_TRANSLATE_MODE_ALWAYS].
     * String parsing for POT generation will be skipped for this node and children that are set to
     * [AUTO_TRANSLATE_MODE_INHERIT].
     */
    AUTO_TRANSLATE_MODE_DISABLED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AutoTranslateMode = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Notification received when the node enters a [SceneTree]. See [_enterTree].
     * This notification is received *before* the related [signal tree_entered] signal.
     */
    public final const val NOTIFICATION_ENTER_TREE: Long = 10

    /**
     * Notification received when the node is about to exit a [SceneTree]. See [_exitTree].
     * This notification is received *after* the related [signal tree_exiting] signal.
     */
    public final const val NOTIFICATION_EXIT_TREE: Long = 11

    public final const val NOTIFICATION_MOVED_IN_PARENT: Long = 12

    /**
     * Notification received when the node is ready. See [_ready].
     */
    public final const val NOTIFICATION_READY: Long = 13

    /**
     * Notification received when the node is paused. See [processMode].
     */
    public final const val NOTIFICATION_PAUSED: Long = 14

    /**
     * Notification received when the node is unpaused. See [processMode].
     */
    public final const val NOTIFICATION_UNPAUSED: Long = 15

    /**
     * Notification received from the tree every physics frame when [isPhysicsProcessing] returns
     * `true`. See [_physicsProcess].
     */
    public final const val NOTIFICATION_PHYSICS_PROCESS: Long = 16

    /**
     * Notification received from the tree every rendered frame when [isProcessing] returns `true`.
     * See [_process].
     */
    public final const val NOTIFICATION_PROCESS: Long = 17

    /**
     * Notification received when the node is set as a child of another node (see [addChild] and
     * [addSibling]).
     * **Note:** This does *not* mean that the node entered the [SceneTree].
     */
    public final const val NOTIFICATION_PARENTED: Long = 18

    /**
     * Notification received when the parent node calls [removeChild] on this node.
     * **Note:** This does *not* mean that the node exited the [SceneTree].
     */
    public final const val NOTIFICATION_UNPARENTED: Long = 19

    /**
     * Notification received *only* by the newly instantiated scene root node, when
     * [PackedScene.instantiate] is completed.
     */
    public final const val NOTIFICATION_SCENE_INSTANTIATED: Long = 20

    /**
     * Notification received when a drag operation begins. All nodes receive this notification, not
     * only the dragged one.
     * Can be triggered either by dragging a [Control] that provides drag data (see
     * [Control.GetDragData]) or using [Control.forceDrag].
     * Use [Viewport.guiGetDragData] to get the dragged data.
     */
    public final const val NOTIFICATION_DRAG_BEGIN: Long = 21

    /**
     * Notification received when a drag operation ends.
     * Use [Viewport.guiIsDragSuccessful] to check if the drag succeeded.
     */
    public final const val NOTIFICATION_DRAG_END: Long = 22

    /**
     * Notification received when the node's [name] or one of its ancestors' [name] is changed. This
     * notification is *not* received when the node is removed from the [SceneTree].
     */
    public final const val NOTIFICATION_PATH_RENAMED: Long = 23

    /**
     * Notification received when the list of children is changed. This happens when child nodes are
     * added, moved or removed.
     */
    public final const val NOTIFICATION_CHILD_ORDER_CHANGED: Long = 24

    /**
     * Notification received from the tree every rendered frame when [isProcessingInternal] returns
     * `true`.
     */
    public final const val NOTIFICATION_INTERNAL_PROCESS: Long = 25

    /**
     * Notification received from the tree every physics frame when [isPhysicsProcessingInternal]
     * returns `true`.
     */
    public final const val NOTIFICATION_INTERNAL_PHYSICS_PROCESS: Long = 26

    /**
     * Notification received when the node enters the tree, just before [NOTIFICATION_READY] may be
     * received. Unlike the latter, it is sent every time the node enters tree, not just once.
     */
    public final const val NOTIFICATION_POST_ENTER_TREE: Long = 27

    /**
     * Notification received when the node is disabled. See [PROCESS_MODE_DISABLED].
     */
    public final const val NOTIFICATION_DISABLED: Long = 28

    /**
     * Notification received when the node is enabled again after being disabled. See
     * [PROCESS_MODE_DISABLED].
     */
    public final const val NOTIFICATION_ENABLED: Long = 29

    /**
     * Notification received when [resetPhysicsInterpolation] is called on the node or its
     * ancestors.
     */
    public final const val NOTIFICATION_RESET_PHYSICS_INTERPOLATION: Long = 2001

    /**
     * Notification received right before the scene with the node is saved in the editor. This
     * notification is only sent in the Godot editor and will not occur in exported projects.
     */
    public final const val NOTIFICATION_EDITOR_PRE_SAVE: Long = 9001

    /**
     * Notification received right after the scene with the node is saved in the editor. This
     * notification is only sent in the Godot editor and will not occur in exported projects.
     */
    public final const val NOTIFICATION_EDITOR_POST_SAVE: Long = 9002

    /**
     * Notification received when the mouse enters the window.
     * Implemented for embedded windows and on desktop and web platforms.
     */
    public final const val NOTIFICATION_WM_MOUSE_ENTER: Long = 1002

    /**
     * Notification received when the mouse leaves the window.
     * Implemented for embedded windows and on desktop and web platforms.
     */
    public final const val NOTIFICATION_WM_MOUSE_EXIT: Long = 1003

    /**
     * Notification received from the OS when the node's [Window] ancestor is focused. This may be a
     * change of focus between two windows of the same engine instance, or from the OS desktop or a
     * third-party application to a window of the game (in which case
     * [NOTIFICATION_APPLICATION_FOCUS_IN] is also received).
     * A [Window] node receives this notification when it is focused.
     */
    public final const val NOTIFICATION_WM_WINDOW_FOCUS_IN: Long = 1004

    /**
     * Notification received from the OS when the node's [Window] ancestor is defocused. This may be
     * a change of focus between two windows of the same engine instance, or from a window of the game
     * to the OS desktop or a third-party application (in which case
     * [NOTIFICATION_APPLICATION_FOCUS_OUT] is also received).
     * A [Window] node receives this notification when it is defocused.
     */
    public final const val NOTIFICATION_WM_WINDOW_FOCUS_OUT: Long = 1005

    /**
     * Notification received from the OS when a close request is sent (e.g. closing the window with
     * a "Close" button or [kbd]Alt + F4[/kbd]).
     * Implemented on desktop platforms.
     */
    public final const val NOTIFICATION_WM_CLOSE_REQUEST: Long = 1006

    /**
     * Notification received from the OS when a go back request is sent (e.g. pressing the "Back"
     * button on Android).
     * Implemented only on Android.
     */
    public final const val NOTIFICATION_WM_GO_BACK_REQUEST: Long = 1007

    /**
     * Notification received when the window is resized.
     * **Note:** Only the resized [Window] node receives this notification, and it's not propagated
     * to the child nodes.
     */
    public final const val NOTIFICATION_WM_SIZE_CHANGED: Long = 1008

    /**
     * Notification received from the OS when the screen's dots per inch (DPI) scale is changed.
     * Only implemented on macOS.
     */
    public final const val NOTIFICATION_WM_DPI_CHANGE: Long = 1009

    /**
     * Notification received when the mouse cursor enters the [Viewport]'s visible area, that is not
     * occluded behind other [Control]s or [Window]s, provided its [Viewport.guiDisableInput] is
     * `false` and regardless if it's currently focused or not.
     */
    public final const val NOTIFICATION_VP_MOUSE_ENTER: Long = 1010

    /**
     * Notification received when the mouse cursor leaves the [Viewport]'s visible area, that is not
     * occluded behind other [Control]s or [Window]s, provided its [Viewport.guiDisableInput] is
     * `false` and regardless if it's currently focused or not.
     */
    public final const val NOTIFICATION_VP_MOUSE_EXIT: Long = 1011

    /**
     * Notification received from the OS when the application is exceeding its allocated memory.
     * Implemented only on iOS.
     */
    public final const val NOTIFICATION_OS_MEMORY_WARNING: Long = 2009

    /**
     * Notification received when translations may have changed. Can be triggered by the user
     * changing the locale, changing [autoTranslateMode] or when the node enters the scene tree. Can be
     * used to respond to language changes, for example to change the UI strings on the fly. Useful
     * when working with the built-in translation support, like [Object.tr].
     * **Note:** This notification is received alongside [NOTIFICATION_ENTER_TREE], so if you are
     * instantiating a scene, the child nodes will not be initialized yet. You can use it to setup
     * translations for this node, child nodes created from script, or if you want to access child
     * nodes added in the editor, make sure the node is ready using [isNodeReady].
     * [codeblock]
     * func _notification(what):
     *     if what == NOTIFICATION_TRANSLATION_CHANGED:
     *         if not is_node_ready():
     *             await ready # Wait until ready signal.
     *         $Label.text = atr("&#37;d Bananas") &#37; banana_counter
     * [/codeblock]
     */
    public final const val NOTIFICATION_TRANSLATION_CHANGED: Long = 2010

    /**
     * Notification received from the OS when a request for "About" information is sent.
     * Implemented only on macOS.
     */
    public final const val NOTIFICATION_WM_ABOUT: Long = 2011

    /**
     * Notification received from Godot's crash handler when the engine is about to crash.
     * Implemented on desktop platforms, if the crash handler is enabled.
     */
    public final const val NOTIFICATION_CRASH: Long = 2012

    /**
     * Notification received from the OS when an update of the Input Method Engine occurs (e.g.
     * change of IME cursor position or composition string).
     * Implemented only on macOS.
     */
    public final const val NOTIFICATION_OS_IME_UPDATE: Long = 2013

    /**
     * Notification received from the OS when the application is resumed.
     * Specific to the Android and iOS platforms.
     */
    public final const val NOTIFICATION_APPLICATION_RESUMED: Long = 2014

    /**
     * Notification received from the OS when the application is paused.
     * Specific to the Android and iOS platforms.
     * **Note:** On iOS, you only have approximately 5 seconds to finish a task started by this
     * signal. If you go over this allotment, iOS will kill the app instead of pausing it.
     */
    public final const val NOTIFICATION_APPLICATION_PAUSED: Long = 2015

    /**
     * Notification received from the OS when the application is focused, i.e. when changing the
     * focus from the OS desktop or a thirdparty application to any open window of the Godot instance.
     * Implemented on desktop and mobile platforms.
     */
    public final const val NOTIFICATION_APPLICATION_FOCUS_IN: Long = 2016

    /**
     * Notification received from the OS when the application is defocused, i.e. when changing the
     * focus from any open window of the Godot instance to the OS desktop or a thirdparty application.
     * Implemented on desktop and mobile platforms.
     */
    public final const val NOTIFICATION_APPLICATION_FOCUS_OUT: Long = 2017

    /**
     * Notification received when the [TextServer] is changed.
     */
    public final const val NOTIFICATION_TEXT_SERVER_CHANGED: Long = 2018

    /**
     * Prints all orphan nodes (nodes outside the [SceneTree]). Useful for debugging.
     * **Note:** This method only works in debug builds. Does nothing in a project exported in
     * release mode.
     */
    public final fun printOrphanNodes(): Unit {
      TransferContext.writeArguments()
      TransferContext.callMethod(0, MethodBindings.printOrphanNodesPtr, NIL)
    }
  }

  internal object MethodBindings {
    public val printOrphanNodesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "print_orphan_nodes", 3218959716)

    public val addSiblingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "add_sibling", 2570952461)

    public val setNamePtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "set_name", 83702148)

    public val getNamePtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_name", 2002593661)

    public val addChildPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "add_child", 3863233950)

    public val removeChildPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "remove_child", 1078189570)

    public val reparentPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "reparent", 3685795103)

    public val getChildCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_child_count", 894402480)

    public val getChildrenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_children", 873284517)

    public val getChildPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_child", 541253412)

    public val hasNodePtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "has_node", 861721659)

    public val getNodePtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_node", 2734337346)

    public val getNodeOrNullPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_node_or_null", 2734337346)

    public val getParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_parent", 3160264692)

    public val findChildPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "find_child", 2008217037)

    public val findChildrenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "find_children", 2560337219)

    public val findParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "find_parent", 1140089439)

    public val hasNodeAndResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "has_node_and_resource", 861721659)

    public val getNodeAndResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_node_and_resource", 502563882)

    public val isInsideTreePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_inside_tree", 36873697)

    public val isPartOfEditedScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_part_of_edited_scene", 36873697)

    public val isAncestorOfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_ancestor_of", 3093956946)

    public val isGreaterThanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_greater_than", 3093956946)

    public val getPathPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_path", 4075236667)

    public val getPathToPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_path_to", 498846349)

    public val addToGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "add_to_group", 3683006648)

    public val removeFromGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "remove_from_group", 3304788590)

    public val isInGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_in_group", 2619796661)

    public val moveChildPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "move_child", 3315886247)

    public val getGroupsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_groups", 3995934104)

    public val setOwnerPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "set_owner", 1078189570)

    public val getOwnerPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_owner", 3160264692)

    public val getIndexPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_index", 894402480)

    public val printTreePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "print_tree", 3218959716)

    public val printTreePrettyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "print_tree_pretty", 3218959716)

    public val getTreeStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_tree_string", 2841200299)

    public val getTreeStringPrettyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_tree_string_pretty", 2841200299)

    public val setSceneFilePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_scene_file_path", 83702148)

    public val getSceneFilePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_scene_file_path", 201670096)

    public val propagateNotificationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "propagate_notification", 1286410249)

    public val propagateCallPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "propagate_call", 1871007965)

    public val setPhysicsProcessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_physics_process", 2586408642)

    public val getPhysicsProcessDeltaTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_physics_process_delta_time", 1740695150)

    public val isPhysicsProcessingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_physics_processing", 36873697)

    public val getProcessDeltaTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_process_delta_time", 1740695150)

    public val setProcessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_process", 2586408642)

    public val setProcessPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_process_priority", 1286410249)

    public val getProcessPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_process_priority", 3905245786)

    public val setPhysicsProcessPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_physics_process_priority", 1286410249)

    public val getPhysicsProcessPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_physics_process_priority", 3905245786)

    public val isProcessingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_processing", 36873697)

    public val setProcessInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_process_input", 2586408642)

    public val isProcessingInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_processing_input", 36873697)

    public val setProcessShortcutInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_process_shortcut_input", 2586408642)

    public val isProcessingShortcutInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_processing_shortcut_input", 36873697)

    public val setProcessUnhandledInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_process_unhandled_input", 2586408642)

    public val isProcessingUnhandledInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_processing_unhandled_input", 36873697)

    public val setProcessUnhandledKeyInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_process_unhandled_key_input", 2586408642)

    public val isProcessingUnhandledKeyInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_processing_unhandled_key_input", 36873697)

    public val setProcessModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_process_mode", 1841290486)

    public val getProcessModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_process_mode", 739966102)

    public val canProcessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "can_process", 36873697)

    public val setProcessThreadGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_process_thread_group", 2275442745)

    public val getProcessThreadGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_process_thread_group", 1866404740)

    public val setProcessThreadMessagesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_process_thread_messages", 1357280998)

    public val getProcessThreadMessagesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_process_thread_messages", 4228993612)

    public val setProcessThreadGroupOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_process_thread_group_order", 1286410249)

    public val getProcessThreadGroupOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_process_thread_group_order", 3905245786)

    public val setDisplayFoldedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_display_folded", 2586408642)

    public val isDisplayedFoldedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_displayed_folded", 36873697)

    public val setProcessInternalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_process_internal", 2586408642)

    public val isProcessingInternalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_processing_internal", 36873697)

    public val setPhysicsProcessInternalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_physics_process_internal", 2586408642)

    public val isPhysicsProcessingInternalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_physics_processing_internal", 36873697)

    public val setPhysicsInterpolationModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_physics_interpolation_mode", 3202404928)

    public val getPhysicsInterpolationModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_physics_interpolation_mode", 2920385216)

    public val isPhysicsInterpolatedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_physics_interpolated", 36873697)

    public val isPhysicsInterpolatedAndEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_physics_interpolated_and_enabled", 36873697)

    public val resetPhysicsInterpolationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "reset_physics_interpolation", 3218959716)

    public val setAutoTranslateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_auto_translate_mode", 776149714)

    public val getAutoTranslateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_auto_translate_mode", 2498906432)

    public val getWindowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_window", 1757182445)

    public val getLastExclusiveWindowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_last_exclusive_window", 1757182445)

    public val getTreePtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "get_tree", 2958820483)

    public val createTweenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "create_tween", 3426978995)

    public val duplicatePtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "duplicate", 3511555459)

    public val replaceByPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "replace_by", 2570952461)

    public val setSceneInstanceLoadPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_scene_instance_load_placeholder", 2586408642)

    public val getSceneInstanceLoadPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_scene_instance_load_placeholder", 36873697)

    public val setEditableInstancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_editable_instance", 2731852923)

    public val isEditableInstancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_editable_instance", 3093956946)

    public val getViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_viewport", 3596683776)

    public val queueFreePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "queue_free", 3218959716)

    public val requestReadyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "request_ready", 3218959716)

    public val isNodeReadyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_node_ready", 36873697)

    public val setMultiplayerAuthorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_multiplayer_authority", 972357352)

    public val getMultiplayerAuthorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_multiplayer_authority", 3905245786)

    public val isMultiplayerAuthorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_multiplayer_authority", 36873697)

    public val getMultiplayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_multiplayer", 406750475)

    public val rpcConfigPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "rpc_config", 3776071444)

    public val setEditorDescriptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_editor_description", 83702148)

    public val getEditorDescriptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "get_editor_description", 201670096)

    public val setUniqueNameInOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_unique_name_in_owner", 2586408642)

    public val isUniqueNameInOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "is_unique_name_in_owner", 36873697)

    public val atrPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "atr", 3344478075)

    public val atrNPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "atr_n", 259354841)

    public val rpcPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "rpc", 4047867050)

    public val rpcIdPtr: VoidPtr = TypeManager.getMethodBindPtr("Node", "rpc_id", 361499283)

    public val updateConfigurationWarningsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "update_configuration_warnings", 3218959716)

    public val callDeferredThreadGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "call_deferred_thread_group", 3400424181)

    public val setDeferredThreadGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_deferred_thread_group", 3776071444)

    public val notifyDeferredThreadGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "notify_deferred_thread_group", 1286410249)

    public val callThreadSafePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "call_thread_safe", 3400424181)

    public val setThreadSafePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "set_thread_safe", 3776071444)

    public val notifyThreadSafePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node", "notify_thread_safe", 1286410249)
  }
}

public infix fun Long.or(other: godot.Node.ProcessThreadMessages): Long = this.or(other.flag)

public infix fun Long.xor(other: godot.Node.ProcessThreadMessages): Long = this.xor(other.flag)

public infix fun Long.and(other: godot.Node.ProcessThreadMessages): Long = this.and(other.flag)

public operator fun Long.plus(other: godot.Node.ProcessThreadMessages): Long = this.plus(other.flag)

public operator fun Long.minus(other: godot.Node.ProcessThreadMessages): Long =
    this.minus(other.flag)

public operator fun Long.times(other: godot.Node.ProcessThreadMessages): Long =
    this.times(other.flag)

public operator fun Long.div(other: godot.Node.ProcessThreadMessages): Long = this.div(other.flag)

public operator fun Long.rem(other: godot.Node.ProcessThreadMessages): Long = this.rem(other.flag)
