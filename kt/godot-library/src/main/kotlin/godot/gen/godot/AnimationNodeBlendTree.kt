// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A sub-tree of many type [godot.AnimationNode]s used for complex animations. Used by [godot.AnimationTree].
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/animation/animation_tree.html]($DOCS_URL/tutorials/animation/animation_tree.html)
 *
 * This animation node may contain a sub-tree of any other type animation nodes, such as [godot.AnimationNodeTransition], [godot.AnimationNodeBlend2], [godot.AnimationNodeBlend3], [godot.AnimationNodeOneShot], etc. This is one of the most commonly used animation node roots.
 *
 * An [godot.AnimationNodeOutput] node named `output` is created by default.
 */
@GodotBaseType
public open class AnimationNodeBlendTree : AnimationRootNode() {
  /**
   * Emitted when the input port information is changed.
   */
  public val nodeChanged: Signal1<StringName> by signal("nodeName")

  /**
   * The global offset of all sub animation nodes.
   */
  public var graphOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_GET_GRAPH_OFFSET, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_SET_GRAPH_OFFSET, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODEBLENDTREE, scriptIndex)
    return true
  }

  /**
   * Adds an [godot.AnimationNode] at the given [position]. The [name] is used to identify the created sub animation node later.
   */
  @JvmOverloads
  public fun addNode(
    name: StringName,
    node: AnimationNode,
    position: Vector2 = Vector2(0, 0),
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to node, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_ADD_NODE,
        NIL)
  }

  /**
   * Returns the sub animation node with the specified [name].
   */
  public fun getNode(name: StringName): AnimationNode? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_GET_NODE,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AnimationNode?)
  }

  /**
   * Removes a sub animation node.
   */
  public fun removeNode(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_REMOVE_NODE,
        NIL)
  }

  /**
   * Changes the name of a sub animation node.
   */
  public fun renameNode(name: StringName, newName: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to newName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_RENAME_NODE,
        NIL)
  }

  /**
   * Returns `true` if a sub animation node with specified [name] exists.
   */
  public fun hasNode(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_HAS_NODE,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Connects the output of an [godot.AnimationNode] as input for another [godot.AnimationNode], at the input port specified by [inputIndex].
   */
  public fun connectNode(
    inputNode: StringName,
    inputIndex: Int,
    outputNode: StringName,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to inputNode, LONG to inputIndex.toLong(), STRING_NAME to outputNode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_CONNECT_NODE,
        NIL)
  }

  /**
   * Disconnects the animation node connected to the specified input.
   */
  public fun disconnectNode(inputNode: StringName, inputIndex: Int): Unit {
    TransferContext.writeArguments(STRING_NAME to inputNode, LONG to inputIndex.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_DISCONNECT_NODE, NIL)
  }

  /**
   * Modifies the position of a sub animation node.
   */
  public fun setNodePosition(name: StringName, position: Vector2): Unit {
    TransferContext.writeArguments(STRING_NAME to name, VECTOR2 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_SET_NODE_POSITION, NIL)
  }

  /**
   * Returns the position of the sub animation node with the specified [name].
   */
  public fun getNodePosition(name: StringName): Vector2 {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDTREE_GET_NODE_POSITION, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public companion object {
    /**
     * The connection was successful.
     */
    public final const val CONNECTION_OK: Long = 0

    /**
     * The input node is `null`.
     */
    public final const val CONNECTION_ERROR_NO_INPUT: Long = 1

    /**
     * The specified input port is out of range.
     */
    public final const val CONNECTION_ERROR_NO_INPUT_INDEX: Long = 2

    /**
     * The output node is `null`.
     */
    public final const val CONNECTION_ERROR_NO_OUTPUT: Long = 3

    /**
     * Input and output nodes are the same.
     */
    public final const val CONNECTION_ERROR_SAME_NODE: Long = 4

    /**
     * The specified connection already exists.
     */
    public final const val CONNECTION_ERROR_CONNECTION_EXISTS: Long = 5
  }
}
