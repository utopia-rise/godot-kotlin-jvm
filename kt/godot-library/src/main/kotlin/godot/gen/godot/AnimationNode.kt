// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.NodePath
import godot.core.Signal0
import godot.core.Signal2
import godot.core.Signal3
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantCaster.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.core.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * Base resource for [AnimationTree] nodes. In general, it's not used directly, but you can create
 * custom ones with custom blending formulas.
 * Inherit this when creating animation nodes mainly for use in [AnimationNodeBlendTree], otherwise
 * [AnimationRootNode] should be used instead.
 * You can access the time information as read-only parameter which is processed and stored in the
 * previous frame for all nodes except [AnimationNodeOutput].
 * **Note:** If multiple inputs exist in the [AnimationNode], which time information takes
 * precedence depends on the type of [AnimationNode].
 * [codeblock]
 * var current_length = $AnimationTree[parameters/AnimationNodeName/current_length]
 * var current_position = $AnimationTree[parameters/AnimationNodeName/current_position]
 * var current_delta = $AnimationTree[parameters/AnimationNodeName/current_delta]
 * [/codeblock]
 */
@GodotBaseType
public open class AnimationNode : Resource() {
  /**
   * Emitted by nodes that inherit from this class and that have an internal tree when one of their
   * animation nodes changes. The animation nodes that emit this signal are
   * [AnimationNodeBlendSpace1D], [AnimationNodeBlendSpace2D], [AnimationNodeStateMachine],
   * [AnimationNodeBlendTree] and [AnimationNodeTransition].
   */
  public val treeChanged: Signal0 by signal()

  /**
   * Emitted by nodes that inherit from this class and that have an internal tree when one of their
   * animation node names changes. The animation nodes that emit this signal are
   * [AnimationNodeBlendSpace1D], [AnimationNodeBlendSpace2D], [AnimationNodeStateMachine], and
   * [AnimationNodeBlendTree].
   */
  public val animationNodeRenamed: Signal3<Long, String, String> by signal("objectId", "oldName",
      "newName")

  /**
   * Emitted by nodes that inherit from this class and that have an internal tree when one of their
   * animation nodes removes. The animation nodes that emit this signal are
   * [AnimationNodeBlendSpace1D], [AnimationNodeBlendSpace2D], [AnimationNodeStateMachine], and
   * [AnimationNodeBlendTree].
   */
  public val animationNodeRemoved: Signal2<Long, String> by signal("objectId", "name")

  /**
   * If `true`, filtering is enabled.
   */
  public final inline var filterEnabled: Boolean
    @JvmName("filterEnabledProperty")
    get() = isFilterEnabled()
    @JvmName("filterEnabledProperty")
    set(`value`) {
      setFilterEnabled(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_ANIMATIONNODE, scriptIndex)
  }

  /**
   * When inheriting from [AnimationRootNode], implement this virtual method to return all child
   * animation nodes in order as a `name: node` dictionary.
   */
  public open fun _getChildNodes(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_child_nodes is not implemented for AnimationNode")
  }

  /**
   * When inheriting from [AnimationRootNode], implement this virtual method to return a list of the
   * properties on this animation node. Parameters are custom local memory used for your animation
   * nodes, given a resource can be reused in multiple trees. Format is similar to
   * [Object.getPropertyList].
   */
  public open fun _getParameterList(): VariantArray<Any?> {
    throw NotImplementedError("_get_parameter_list is not implemented for AnimationNode")
  }

  /**
   * When inheriting from [AnimationRootNode], implement this virtual method to return a child
   * animation node by its [name].
   */
  public open fun _getChildByName(name: StringName): AnimationNode? {
    throw NotImplementedError("_get_child_by_name is not implemented for AnimationNode")
  }

  /**
   * When inheriting from [AnimationRootNode], implement this virtual method to return the default
   * value of a [parameter]. Parameters are custom local memory used for your animation nodes, given a
   * resource can be reused in multiple trees.
   */
  public open fun _getParameterDefaultValue(parameter: StringName): Any? {
    throw NotImplementedError("_get_parameter_default_value is not implemented for AnimationNode")
  }

  /**
   * When inheriting from [AnimationRootNode], implement this virtual method to return whether the
   * [parameter] is read-only. Parameters are custom local memory used for your animation nodes, given
   * a resource can be reused in multiple trees.
   */
  public open fun _isParameterReadOnly(parameter: StringName): Boolean {
    throw NotImplementedError("_is_parameter_read_only is not implemented for AnimationNode")
  }

  /**
   * When inheriting from [AnimationRootNode], implement this virtual method to run some code when
   * this animation node is processed. The [time] parameter is a relative delta, unless [seek] is
   * `true`, in which case it is absolute.
   * Here, call the [blendInput], [blendNode] or [blendAnimation] functions. You can also use
   * [getParameter] and [setParameter] to modify local memory.
   * This function should return the delta.
   */
  public open fun _process(
    time: Double,
    seek: Boolean,
    isExternalSeeking: Boolean,
    testOnly: Boolean,
  ): Double {
    throw NotImplementedError("_process is not implemented for AnimationNode")
  }

  /**
   * When inheriting from [AnimationRootNode], implement this virtual method to override the text
   * caption for this animation node.
   */
  public open fun _getCaption(): String {
    throw NotImplementedError("_get_caption is not implemented for AnimationNode")
  }

  /**
   * When inheriting from [AnimationRootNode], implement this virtual method to return whether the
   * blend tree editor should display filter editing on this animation node.
   */
  public open fun _hasFilter(): Boolean {
    throw NotImplementedError("_has_filter is not implemented for AnimationNode")
  }

  /**
   * Adds an input to the animation node. This is only useful for animation nodes created for use in
   * an [AnimationNodeBlendTree]. If the addition fails, returns `false`.
   */
  public final fun addInput(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.addInputPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Removes an input, call this only when inactive.
   */
  public final fun removeInput(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeInputPtr, NIL)
  }

  /**
   * Sets the name of the input at the given [input] index. If the setting fails, returns `false`.
   */
  public final fun setInputName(input: Int, name: String): Boolean {
    TransferContext.writeArguments(LONG to input.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setInputNamePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Gets the name of an input by index.
   */
  public final fun getInputName(input: Int): String {
    TransferContext.writeArguments(LONG to input.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInputNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Amount of inputs in this animation node, only useful for animation nodes that go into
   * [AnimationNodeBlendTree].
   */
  public final fun getInputCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInputCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the input index which corresponds to [name]. If not found, returns `-1`.
   */
  public final fun findInput(name: String): Int {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.findInputPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adds or removes a path for the filter.
   */
  public final fun setFilterPath(path: NodePath, enable: Boolean): Unit {
    TransferContext.writeArguments(NODE_PATH to path, BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setFilterPathPtr, NIL)
  }

  /**
   * Returns whether the given path is filtered.
   */
  public final fun isPathFiltered(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, MethodBindings.isPathFilteredPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFilterEnabled(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setFilterEnabledPtr, NIL)
  }

  public final fun isFilterEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isFilterEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Blend an animation by [blend] amount (name must be valid in the linked [AnimationPlayer]). A
   * [time] and [delta] may be passed, as well as whether [seeked] happened.
   * A [loopedFlag] is used by internal processing immediately after the loop. See also
   * [Animation.LoopedFlag].
   */
  @JvmOverloads
  public final fun blendAnimation(
    animation: StringName,
    time: Double,
    delta: Double,
    seeked: Boolean,
    isExternalSeeking: Boolean,
    blend: Float,
    loopedFlag: Animation.LoopedFlag = Animation.LoopedFlag.LOOPED_FLAG_NONE,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to animation, DOUBLE to time, DOUBLE to delta, BOOL to seeked, BOOL to isExternalSeeking, DOUBLE to blend.toDouble(), LONG to loopedFlag.id)
    TransferContext.callMethod(rawPtr, MethodBindings.blendAnimationPtr, NIL)
  }

  /**
   * Blend another animation node (in case this animation node contains child animation nodes). This
   * function is only useful if you inherit from [AnimationRootNode] instead, otherwise editors will
   * not display your animation node for addition.
   */
  @JvmOverloads
  public final fun blendNode(
    name: StringName,
    node: AnimationNode?,
    time: Double,
    seek: Boolean,
    isExternalSeeking: Boolean,
    blend: Float,
    filter: FilterAction = AnimationNode.FilterAction.FILTER_IGNORE,
    sync: Boolean = true,
    testOnly: Boolean = false,
  ): Double {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to node, DOUBLE to time, BOOL to seek, BOOL to isExternalSeeking, DOUBLE to blend.toDouble(), LONG to filter.id, BOOL to sync, BOOL to testOnly)
    TransferContext.callMethod(rawPtr, MethodBindings.blendNodePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Blend an input. This is only useful for animation nodes created for an
   * [AnimationNodeBlendTree]. The [time] parameter is a relative delta, unless [seek] is `true`, in
   * which case it is absolute. A filter mode may be optionally passed (see [FilterAction] for
   * options).
   */
  @JvmOverloads
  public final fun blendInput(
    inputIndex: Int,
    time: Double,
    seek: Boolean,
    isExternalSeeking: Boolean,
    blend: Float,
    filter: FilterAction = AnimationNode.FilterAction.FILTER_IGNORE,
    sync: Boolean = true,
    testOnly: Boolean = false,
  ): Double {
    TransferContext.writeArguments(LONG to inputIndex.toLong(), DOUBLE to time, BOOL to seek, BOOL to isExternalSeeking, DOUBLE to blend.toDouble(), LONG to filter.id, BOOL to sync, BOOL to testOnly)
    TransferContext.callMethod(rawPtr, MethodBindings.blendInputPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Sets a custom parameter. These are used as local memory, because resources can be reused across
   * the tree or scenes.
   */
  public final fun setParameter(name: StringName, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setParameterPtr, NIL)
  }

  /**
   * Gets the value of a parameter. Parameters are custom local memory used for your animation
   * nodes, given a resource can be reused in multiple trees.
   */
  public final fun getParameter(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getParameterPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  public enum class FilterAction(
    id: Long,
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
      public fun from(`value`: Long): FilterAction = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val addInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "add_input", 2323990056)

    public val removeInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "remove_input", 1286410249)

    public val setInputNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "set_input_name", 215573526)

    public val getInputNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "get_input_name", 844755477)

    public val getInputCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "get_input_count", 3905245786)

    public val findInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "find_input", 1321353865)

    public val setFilterPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "set_filter_path", 3868023870)

    public val isPathFilteredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "is_path_filtered", 861721659)

    public val setFilterEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "set_filter_enabled", 2586408642)

    public val isFilterEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "is_filter_enabled", 36873697)

    public val blendAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "blend_animation", 1630801826)

    public val blendNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "blend_node", 1746075988)

    public val blendInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "blend_input", 1361527350)

    public val setParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "set_parameter", 3776071444)

    public val getParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNode", "get_parameter", 2760726917)
  }
}
