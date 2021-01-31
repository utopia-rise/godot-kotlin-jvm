// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class VisualShaderNodeCustom : VisualShaderNode() {
  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODECUSTOM)

  open fun _get_category(): String {
    throw NotImplementedError("_get_category is not implemented for VisualShaderNodeCustom")
  }

  open fun _get_code(
    inputVars: VariantArray<Any?>,
    outputVars: VariantArray<Any?>,
    mode: Long,
    type: Long
  ): String {
    throw NotImplementedError("_get_code is not implemented for VisualShaderNodeCustom")
  }

  open fun _get_description(): String {
    throw NotImplementedError("_get_description is not implemented for VisualShaderNodeCustom")
  }

  open fun _get_global_code(mode: Long): String {
    throw NotImplementedError("_get_global_code is not implemented for VisualShaderNodeCustom")
  }

  open fun _get_input_port_count(): Long {
    throw NotImplementedError("_get_input_port_count is not implemented for VisualShaderNodeCustom")
  }

  open fun _get_input_port_name(port: Long): String {
    throw NotImplementedError("_get_input_port_name is not implemented for VisualShaderNodeCustom")
  }

  open fun _get_input_port_type(port: Long): Long {
    throw NotImplementedError("_get_input_port_type is not implemented for VisualShaderNodeCustom")
  }

  open fun _get_name(): String {
    throw NotImplementedError("_get_name is not implemented for VisualShaderNodeCustom")
  }

  open fun _get_output_port_count(): Long {
    throw
        NotImplementedError("_get_output_port_count is not implemented for VisualShaderNodeCustom")
  }

  open fun _get_output_port_name(port: Long): String {
    throw NotImplementedError("_get_output_port_name is not implemented for VisualShaderNodeCustom")
  }

  open fun _get_output_port_type(port: Long): Long {
    throw NotImplementedError("_get_output_port_type is not implemented for VisualShaderNodeCustom")
  }

  open fun _get_return_icon_type(): Long {
    throw NotImplementedError("_get_return_icon_type is not implemented for VisualShaderNodeCustom")
  }

  open fun _get_subcategory(): String {
    throw NotImplementedError("_get_subcategory is not implemented for VisualShaderNodeCustom")
  }

  companion object
}
