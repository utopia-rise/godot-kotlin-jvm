// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Signal1
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING_NAME
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_ANIMATIONNODEBLENDTREE_INDEX: Int = 59

/**
 * This animation node may contain a sub-tree of any other type animation nodes, such as
 * [AnimationNodeTransition], [AnimationNodeBlend2], [AnimationNodeBlend3], [AnimationNodeOneShot],
 * etc. This is one of the most commonly used animation node roots.
 * An [AnimationNodeOutput] node named `output` is created by default.
 */
@GodotBaseType
public open class AnimationNodeBlendTree : AnimationRootNode() {
  /**
   * Emitted when the input port information is changed.
   */
  public val nodeChanged: Signal1<StringName> by Signal1

  /**
   * The global offset of all sub animation nodes.
   */
  @CoreTypeLocalCopy
  public final inline var graphOffset: Vector2
    @JvmName("graphOffsetProperty")
    get() = getGraphOffset()
    @JvmName("graphOffsetProperty")
    set(`value`) {
      setGraphOffset(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_ANIMATIONNODEBLENDTREE_INDEX, scriptIndex)
  }

  /**
   * The global offset of all sub animation nodes.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = animationnodeblendtree.graphOffset
   * //Your changes
   * animationnodeblendtree.graphOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun graphOffsetMutate(block: Vector2.() -> Unit): Vector2 = graphOffset.apply{
      block(this)
      graphOffset = this
  }


  /**
   * Adds an [AnimationNode] at the given [position]. The [name] is used to identify the created sub
   * animation node later.
   */
  @JvmOverloads
  public final fun addNode(
    name: StringName,
    node: AnimationNode?,
    position: Vector2 = Vector2(0, 0),
  ): Unit {
    Internals.writeArguments(STRING_NAME to name, OBJECT to node, VECTOR2 to position)
    Internals.callMethod(rawPtr, MethodBindings.addNodePtr, NIL)
  }

  /**
   * Returns the sub animation node with the specified [name].
   */
  public final fun getNode(name: StringName): AnimationNode? {
    Internals.writeArguments(STRING_NAME to name)
    Internals.callMethod(rawPtr, MethodBindings.getNodePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as AnimationNode?)
  }

  /**
   * Removes a sub animation node.
   */
  public final fun removeNode(name: StringName): Unit {
    Internals.writeArguments(STRING_NAME to name)
    Internals.callMethod(rawPtr, MethodBindings.removeNodePtr, NIL)
  }

  /**
   * Changes the name of a sub animation node.
   */
  public final fun renameNode(name: StringName, newName: StringName): Unit {
    Internals.writeArguments(STRING_NAME to name, STRING_NAME to newName)
    Internals.callMethod(rawPtr, MethodBindings.renameNodePtr, NIL)
  }

  /**
   * Returns `true` if a sub animation node with specified [name] exists.
   */
  public final fun hasNode(name: StringName): Boolean {
    Internals.writeArguments(STRING_NAME to name)
    Internals.callMethod(rawPtr, MethodBindings.hasNodePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Connects the output of an [AnimationNode] as input for another [AnimationNode], at the input
   * port specified by [inputIndex].
   */
  public final fun connectNode(
    inputNode: StringName,
    inputIndex: Int,
    outputNode: StringName,
  ): Unit {
    Internals.writeArguments(STRING_NAME to inputNode, LONG to inputIndex.toLong(), STRING_NAME to outputNode)
    Internals.callMethod(rawPtr, MethodBindings.connectNodePtr, NIL)
  }

  /**
   * Disconnects the animation node connected to the specified input.
   */
  public final fun disconnectNode(inputNode: StringName, inputIndex: Int): Unit {
    Internals.writeArguments(STRING_NAME to inputNode, LONG to inputIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.disconnectNodePtr, NIL)
  }

  /**
   * Modifies the position of a sub animation node.
   */
  public final fun setNodePosition(name: StringName, position: Vector2): Unit {
    Internals.writeArguments(STRING_NAME to name, VECTOR2 to position)
    Internals.callMethod(rawPtr, MethodBindings.setNodePositionPtr, NIL)
  }

  /**
   * Returns the position of the sub animation node with the specified [name].
   */
  public final fun getNodePosition(name: StringName): Vector2 {
    Internals.writeArguments(STRING_NAME to name)
    Internals.callMethod(rawPtr, MethodBindings.getNodePositionPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setGraphOffset(offset: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to offset)
    Internals.callMethod(rawPtr, MethodBindings.setGraphOffsetPtr, NIL)
  }

  public final fun getGraphOffset(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGraphOffsetPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
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

  internal object MethodBindings {
    public val addNodePtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendTree", "add_node", 1980270704)

    public val getNodePtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendTree", "get_node", 625644256)

    public val removeNodePtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendTree", "remove_node", 3304788590)

    public val renameNodePtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendTree", "rename_node", 3740211285)

    public val hasNodePtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendTree", "has_node", 2619796661)

    public val connectNodePtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendTree", "connect_node", 2168001410)

    public val disconnectNodePtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendTree", "disconnect_node", 2415702435)

    public val setNodePositionPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendTree", "set_node_position", 1999414630)

    public val getNodePositionPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendTree", "get_node_position", 3100822709)

    public val setGraphOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendTree", "set_graph_offset", 743155724)

    public val getGraphOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimationNodeBlendTree", "get_graph_offset", 3341600327)
  }
}
