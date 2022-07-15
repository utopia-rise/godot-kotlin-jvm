// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Virtual class to define custom [godot.VisualShaderNode]s for use in the Visual Shader Editor.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/plugins/editor/visual_shader_plugins.html]($DOCS_URL/tutorials/plugins/editor/visual_shader_plugins.html)
 *
 * By inheriting this class you can create a custom [godot.VisualShader] script addon which will be automatically added to the Visual Shader Editor. The [godot.VisualShaderNode]'s behavior is defined by overriding the provided virtual methods.
 *
 * In order for the node to be registered as an editor addon, you must use the `tool` keyword and provide a `class_name` for your custom script. For example:
 *
 * ```
 * 		tool
 * 		extends VisualShaderNodeCustom
 * 		class_name VisualShaderNodeNoise
 * 		```
 */
@GodotBaseType
public open class VisualShaderNodeCustom : VisualShaderNode() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODECUSTOM)
  }

  /**
   * Override this method to define the category of the associated custom node in the Visual Shader Editor's members dialog. The path may look like `"MyGame/MyFunctions/Noise"`.
   *
   * Defining this method is **optional**. If not overridden, the node will be filed under the "Custom" category.
   */
  public open fun _getCategory(): String {
    throw NotImplementedError("_get_category is not implemented for VisualShaderNodeCustom")
  }

  /**
   * Override this method to define the actual shader code of the associated custom node. The shader code should be returned as a string, which can have multiple lines (the `"""` multiline string construct can be used for convenience).
   *
   * The `input_vars` and `output_vars` arrays contain the string names of the various input and output variables, as defined by `_get_input_*` and `_get_output_*` virtual methods in this class.
   *
   * The output ports can be assigned values in the shader code. For example, `return output_vars[0] + " = " + input_vars[0] + ";"`.
   *
   * You can customize the generated code based on the shader `mode` (see [enum Shader.Mode]) and/or `type` (see [enum VisualShader.Type]).
   *
   * Defining this method is **required**.
   */
  public open fun _getCode(
    inputVars: VariantArray<Any?>,
    outputVars: VariantArray<Any?>,
    mode: Long,
    type: Long
  ): String {
    throw NotImplementedError("_get_code is not implemented for VisualShaderNodeCustom")
  }

  /**
   * Override this method to define the description of the associated custom node in the Visual Shader Editor's members dialog.
   *
   * Defining this method is **optional**.
   */
  public open fun _getDescription(): String {
    throw NotImplementedError("_get_description is not implemented for VisualShaderNodeCustom")
  }

  /**
   * Override this method to add shader code on top of the global shader, to define your own standard library of reusable methods, varyings, constants, uniforms, etc. The shader code should be returned as a string, which can have multiple lines (the `"""` multiline string construct can be used for convenience).
   *
   * Be careful with this functionality as it can cause name conflicts with other custom nodes, so be sure to give the defined entities unique names.
   *
   * You can customize the generated code based on the shader `mode` (see [enum Shader.Mode]).
   *
   * Defining this method is **optional**.
   */
  public open fun _getGlobalCode(mode: Long): String {
    throw NotImplementedError("_get_global_code is not implemented for VisualShaderNodeCustom")
  }

  /**
   * Override this method to define the amount of input ports of the associated custom node.
   *
   * Defining this method is **required**. If not overridden, the node has no input ports.
   */
  public open fun _getInputPortCount(): Long {
    throw NotImplementedError("_get_input_port_count is not implemented for VisualShaderNodeCustom")
  }

  /**
   * Override this method to define the names of input ports of the associated custom node. The names are used both for the input slots in the editor and as identifiers in the shader code, and are passed in the `input_vars` array in [_getCode].
   *
   * Defining this method is **optional**, but recommended. If not overridden, input ports are named as `"in" + str(port)`.
   */
  public open fun _getInputPortName(port: Long): String {
    throw NotImplementedError("_get_input_port_name is not implemented for VisualShaderNodeCustom")
  }

  /**
   * Override this method to define the returned type of each input port of the associated custom node (see [enum VisualShaderNode.PortType] for possible types).
   *
   * Defining this method is **optional**, but recommended. If not overridden, input ports will return the [godot.VisualShaderNode.PORT_TYPE_SCALAR] type.
   */
  public open fun _getInputPortType(port: Long): Long {
    throw NotImplementedError("_get_input_port_type is not implemented for VisualShaderNodeCustom")
  }

  /**
   * Override this method to define the name of the associated custom node in the Visual Shader Editor's members dialog and graph.
   *
   * Defining this method is **optional**, but recommended. If not overridden, the node will be named as "Unnamed".
   */
  public open fun _getName(): String {
    throw NotImplementedError("_get_name is not implemented for VisualShaderNodeCustom")
  }

  /**
   * Override this method to define the amount of output ports of the associated custom node.
   *
   * Defining this method is **required**. If not overridden, the node has no output ports.
   */
  public open fun _getOutputPortCount(): Long {
    throw
        NotImplementedError("_get_output_port_count is not implemented for VisualShaderNodeCustom")
  }

  /**
   * Override this method to define the names of output ports of the associated custom node. The names are used both for the output slots in the editor and as identifiers in the shader code, and are passed in the `output_vars` array in [_getCode].
   *
   * Defining this method is **optional**, but recommended. If not overridden, output ports are named as `"out" + str(port)`.
   */
  public open fun _getOutputPortName(port: Long): String {
    throw NotImplementedError("_get_output_port_name is not implemented for VisualShaderNodeCustom")
  }

  /**
   * Override this method to define the returned type of each output port of the associated custom node (see [enum VisualShaderNode.PortType] for possible types).
   *
   * Defining this method is **optional**, but recommended. If not overridden, output ports will return the [godot.VisualShaderNode.PORT_TYPE_SCALAR] type.
   */
  public open fun _getOutputPortType(port: Long): Long {
    throw NotImplementedError("_get_output_port_type is not implemented for VisualShaderNodeCustom")
  }

  /**
   * Override this method to define the return icon of the associated custom node in the Visual Shader Editor's members dialog.
   *
   * Defining this method is **optional**. If not overridden, no return icon is shown.
   */
  public open fun _getReturnIconType(): Long {
    throw NotImplementedError("_get_return_icon_type is not implemented for VisualShaderNodeCustom")
  }

  /**
   * Override this method to define the subcategory of the associated custom node in the Visual Shader Editor's members dialog.
   *
   * Defining this method is **optional**. If not overridden, the node will be filed under the root of the main category (see [_getCategory]).
   */
  public open fun _getSubcategory(): String {
    throw NotImplementedError("_get_subcategory is not implemented for VisualShaderNodeCustom")
  }

  public open fun _isInitialized(): Boolean {
    throw NotImplementedError("_is_initialized is not implemented for VisualShaderNodeCustom")
  }

  public open fun _setInitialized(enabled: Boolean): Unit {
  }

  public open fun _setInputPortDefaultValue(port: Long, `value`: Any?): Unit {
  }
}
