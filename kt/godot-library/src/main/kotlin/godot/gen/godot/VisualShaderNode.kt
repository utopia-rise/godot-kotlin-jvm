// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class VisualShaderNode : Resource() {
  val editorRefreshRequest: Signal0 by signal()

  open var defaultInputValues: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODE_GET_DEFAULT_INPUT_VALUES, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(value) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODE_SET_DEFAULT_INPUT_VALUES, NIL)
    }

  open var outputPortForPreview: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODE_GET_OUTPUT_PORT_FOR_PREVIEW, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODE_SET_OUTPUT_PORT_FOR_PREVIEW, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODE)

  open fun getInputPortDefaultValue(port: Long): Any? {
    TransferContext.writeArguments(LONG to port)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODE_GET_INPUT_PORT_DEFAULT_VALUE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun setInputPortDefaultValue(port: Long, value: Any?) {
    TransferContext.writeArguments(LONG to port, ANY to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODE_SET_INPUT_PORT_DEFAULT_VALUE, NIL)
  }

  enum class PortType(
    id: Long
  ) {
    PORT_TYPE_SCALAR(0),

    PORT_TYPE_VECTOR(1),

    PORT_TYPE_BOOLEAN(2),

    PORT_TYPE_TRANSFORM(3),

    PORT_TYPE_SAMPLER(4),

    PORT_TYPE_MAX(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val PORT_TYPE_BOOLEAN: Long = 2

    final const val PORT_TYPE_MAX: Long = 5

    final const val PORT_TYPE_SAMPLER: Long = 4

    final const val PORT_TYPE_SCALAR: Long = 0

    final const val PORT_TYPE_TRANSFORM: Long = 3

    final const val PORT_TYPE_VECTOR: Long = 1
  }
}
