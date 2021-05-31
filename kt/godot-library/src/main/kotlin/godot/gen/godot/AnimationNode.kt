// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Base resource for [godot.AnimationTree] nodes.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.3/tutorials/animation/animation_tree.html](https://docs.godotengine.org/en/3.3/tutorials/animation/animation_tree.html)
 *
 * Base resource for [godot.AnimationTree] nodes. In general, it's not used directly, but you can create custom ones with custom blending formulas.
 *
 * Inherit this when creating nodes mainly for use in [godot.AnimationNodeBlendTree], otherwise [godot.AnimationRootNode] should be used instead.
 */
@GodotBaseType
public open class AnimationNode : Resource() {
  /**
   * Called when the node was removed from the graph.
   */
  public val removedFromGraph: Signal0 by signal()

  /**
   * Emitted by nodes that inherit from this class and that have an internal tree when one of their nodes changes. The nodes that emit this signal are [godot.AnimationNodeBlendSpace1D], [godot.AnimationNodeBlendSpace2D], [godot.AnimationNodeStateMachine], and [godot.AnimationNodeBlendTree].
   */
  public val treeChanged: Signal0 by signal()

  /**
   * If `true`, filtering is enabled.
   */
  public open var filterEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_GET_FILTER_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_SET_FILTER_ENABLED,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODE)
  }

  public open fun _getFilters(): VariantArray<Any?> {
    throw NotImplementedError("_get_filters is not implemented for AnimationNode")
  }

  public open fun _setFilters(filters: VariantArray<Any?>): Unit {
  }

  /**
   * Adds an input to the node. This is only useful for nodes created for use in an [godot.AnimationNodeBlendTree].
   */
  public open fun addInput(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_ADD_INPUT, NIL)
  }

  /**
   * Blend an animation by `blend` amount (name must be valid in the linked [godot.AnimationPlayer]). A `time` and `delta` may be passed, as well as whether `seek` happened.
   */
  public open fun blendAnimation(
    animation: String,
    time: Double,
    delta: Double,
    seeked: Boolean,
    blend: Double
  ): Unit {
    TransferContext.writeArguments(STRING to animation, DOUBLE to time, DOUBLE to delta, BOOL to
        seeked, DOUBLE to blend)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_BLEND_ANIMATION, NIL)
  }

  /**
   * Blend an input. This is only useful for nodes created for an [godot.AnimationNodeBlendTree]. The `time` parameter is a relative delta, unless `seek` is `true`, in which case it is absolute. A filter mode may be optionally passed (see [enum FilterAction] for options).
   */
  public open fun blendInput(
    inputIndex: Long,
    time: Double,
    seek: Boolean,
    blend: Double,
    filter: Long = 0,
    optimize: Boolean = true
  ): Double {
    TransferContext.writeArguments(LONG to inputIndex, DOUBLE to time, BOOL to seek, DOUBLE to
        blend, LONG to filter, BOOL to optimize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_BLEND_INPUT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Blend another animation node (in case this node contains children animation nodes). This function is only useful if you inherit from [godot.AnimationRootNode] instead, else editors will not display your node for addition.
   */
  public open fun blendNode(
    name: String,
    node: AnimationNode,
    time: Double,
    seek: Boolean,
    blend: Double,
    filter: Long = 0,
    optimize: Boolean = true
  ): Double {
    TransferContext.writeArguments(STRING to name, OBJECT to node, DOUBLE to time, BOOL to seek,
        DOUBLE to blend, LONG to filter, BOOL to optimize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_BLEND_NODE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Gets the text caption for this node (used by some editors).
   */
  public open fun _getCaption(): String {
    throw NotImplementedError("get_caption is not implemented for AnimationNode")
  }

  /**
   * Gets a child node by index (used by editors inheriting from [godot.AnimationRootNode]).
   */
  public open fun _getChildByName(name: String): Object? {
    throw NotImplementedError("get_child_by_name is not implemented for AnimationNode")
  }

  /**
   * Gets all children nodes in order as a `name: node` dictionary. Only useful when inheriting [godot.AnimationRootNode].
   */
  public open fun _getChildNodes(): Dictionary<Any?, Any?> {
    throw NotImplementedError("get_child_nodes is not implemented for AnimationNode")
  }

  /**
   * Amount of inputs in this node, only useful for nodes that go into [godot.AnimationNodeBlendTree].
   */
  public open fun getInputCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_GET_INPUT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets the name of an input by index.
   */
  public open fun getInputName(input: Long): String {
    TransferContext.writeArguments(LONG to input)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_GET_INPUT_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Gets the value of a parameter. Parameters are custom local memory used for your nodes, given a resource can be reused in multiple trees.
   */
  public open fun getParameter(name: String): Any? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_GET_PARAMETER, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Gets the default value of a parameter. Parameters are custom local memory used for your nodes, given a resource can be reused in multiple trees.
   */
  public open fun _getParameterDefaultValue(name: String): Any? {
    throw NotImplementedError("get_parameter_default_value is not implemented for AnimationNode")
  }

  /**
   * Gets the property information for parameter. Parameters are custom local memory used for your nodes, given a resource can be reused in multiple trees. Format is similar to [godot.Object.getPropertyList].
   */
  public open fun _getParameterList(): VariantArray<Any?> {
    throw NotImplementedError("get_parameter_list is not implemented for AnimationNode")
  }

  /**
   * Returns `true` whether you want the blend tree editor to display filter editing on this node.
   */
  public open fun _hasFilter(): String {
    throw NotImplementedError("has_filter is not implemented for AnimationNode")
  }

  /**
   * Returns `true` whether a given path is filtered.
   */
  public open fun isPathFiltered(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_IS_PATH_FILTERED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * User-defined callback called when a custom node is processed. The `time` parameter is a relative delta, unless `seek` is `true`, in which case it is absolute.
   *
   * Here, call the [blendInput], [blendNode] or [blendAnimation] functions. You can also use [getParameter] and [setParameter] to modify local memory.
   *
   * This function should return the time left for the current animation to finish (if unsure, pass the value from the main blend being called).
   */
  public open fun _process(time: Double, seek: Boolean): Unit {
  }

  /**
   * Removes an input, call this only when inactive.
   */
  public open fun removeInput(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_REMOVE_INPUT, NIL)
  }

  /**
   * Adds or removes a path for the filter.
   */
  public open fun setFilterPath(path: NodePath, enable: Boolean): Unit {
    TransferContext.writeArguments(NODE_PATH to path, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_SET_FILTER_PATH, NIL)
  }

  /**
   * Sets a custom parameter. These are used as local storage, because resources can be reused across the tree or scenes.
   */
  public open fun setParameter(name: String, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING to name, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_SET_PARAMETER, NIL)
  }

  public enum class FilterAction(
    id: Long
  ) {
    /**
     * Do not use filtering.
     */
    FILTER_IGNORE(0),
    /**
     * Paths matching the filter will be allowed to pass.
     */
    FILTER_PASS(1),
    /**
     * Paths matching the filter will be discarded.
     */
    FILTER_STOP(2),
    /**
     * Paths matching the filter will be blended (by the blend value).
     */
    FILTER_BLEND(3),
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
     * Paths matching the filter will be blended (by the blend value).
     */
    public final const val FILTER_BLEND: Long = 3

    /**
     * Do not use filtering.
     */
    public final const val FILTER_IGNORE: Long = 0

    /**
     * Paths matching the filter will be allowed to pass.
     */
    public final const val FILTER_PASS: Long = 1

    /**
     * Paths matching the filter will be discarded.
     */
    public final const val FILTER_STOP: Long = 2
  }
}
