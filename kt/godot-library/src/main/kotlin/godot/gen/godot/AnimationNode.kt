// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class AnimationNode : Resource() {
  val removedFromGraph: Signal0 by signal()

  val treeChanged: Signal0 by signal()

  open var filterEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_GET_FILTER_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_SET_FILTER_ENABLED,
          NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_ANIMATIONNODE)

  open fun _getFilters(): VariantArray<Any?> {
    throw NotImplementedError("_get_filters is not implemented for AnimationNode")
  }

  open fun _setFilters(filters: VariantArray<Any?>) {
  }

  open fun addInput(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_ADD_INPUT, NIL)
  }

  open fun blendAnimation(
    animation: String,
    time: Double,
    delta: Double,
    seeked: Boolean,
    blend: Double
  ) {
    TransferContext.writeArguments(STRING to animation, DOUBLE to time, DOUBLE to delta, BOOL to
        seeked, DOUBLE to blend)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_BLEND_ANIMATION, NIL)
  }

  open fun blendInput(
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

  open fun blendNode(
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

  open fun _getCaption(): String {
    throw NotImplementedError("get_caption is not implemented for AnimationNode")
  }

  open fun _getChildByName(name: String): Object? {
    throw NotImplementedError("get_child_by_name is not implemented for AnimationNode")
  }

  open fun _getChildNodes(): Dictionary<Any?, Any?> {
    throw NotImplementedError("get_child_nodes is not implemented for AnimationNode")
  }

  open fun getInputCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_GET_INPUT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getInputName(input: Long): String {
    TransferContext.writeArguments(LONG to input)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_GET_INPUT_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getParameter(name: String): Any? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_GET_PARAMETER, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun _getParameterDefaultValue(name: String): Any? {
    throw NotImplementedError("get_parameter_default_value is not implemented for AnimationNode")
  }

  open fun _getParameterList(): VariantArray<Any?> {
    throw NotImplementedError("get_parameter_list is not implemented for AnimationNode")
  }

  open fun _hasFilter(): String {
    throw NotImplementedError("has_filter is not implemented for AnimationNode")
  }

  open fun isPathFiltered(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_IS_PATH_FILTERED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun _process(time: Double, seek: Boolean) {
  }

  open fun removeInput(index: Long) {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_REMOVE_INPUT, NIL)
  }

  open fun setFilterPath(path: NodePath, enable: Boolean) {
    TransferContext.writeArguments(NODE_PATH to path, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_SET_FILTER_PATH, NIL)
  }

  open fun setParameter(name: String, value: Any) {
    TransferContext.writeArguments(STRING to name, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_SET_PARAMETER, NIL)
  }

  enum class FilterAction(
    id: Long
  ) {
    FILTER_IGNORE(0),

    FILTER_PASS(1),

    FILTER_STOP(2),

    FILTER_BLEND(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val FILTER_BLEND: Long = 3

    final const val FILTER_IGNORE: Long = 0

    final const val FILTER_PASS: Long = 1

    final const val FILTER_STOP: Long = 2
  }
}
