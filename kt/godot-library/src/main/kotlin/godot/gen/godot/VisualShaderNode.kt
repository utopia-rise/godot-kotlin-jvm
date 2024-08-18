// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Visual shader graphs consist of various nodes. Each node in the graph is a separate object and
 * they are represented as a rectangular boxes with title and a set of properties. Each node also has
 * connection ports that allow to connect it to another nodes and control the flow of the shader.
 */
@GodotBaseType
public open class VisualShaderNode internal constructor() : Resource() {
  /**
   * Sets the output port index which will be showed for preview. If set to `-1` no port will be
   * open for preview.
   */
  public var outputPortForPreview: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOutputPortForPreviewPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setOutputPortForPreviewPtr, NIL)
    }

  public var defaultInputValues: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultInputValuesPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultInputValuesPtr, NIL)
    }

  /**
   * Represents the index of the frame this node is linked to. If set to `-1` the node is not linked
   * to any frame.
   */
  public var linkedParentGraphFrame: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFramePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFramePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODE, scriptIndex)
    return true
  }

  /**
   * Returns the input port which should be connected by default when this node is created as a
   * result of dragging a connection from an existing node to the empty space on the graph.
   */
  public fun getDefaultInputPort(type: PortType): Int {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getDefaultInputPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the default [value] for the selected input [port].
   */
  @JvmOverloads
  public fun setInputPortDefaultValue(
    port: Int,
    `value`: Any?,
    prevValue: Any? = null,
  ): Unit {
    TransferContext.writeArguments(LONG to port.toLong(), ANY to value, ANY to prevValue)
    TransferContext.callMethod(rawPtr, MethodBindings.setInputPortDefaultValuePtr, NIL)
  }

  /**
   * Returns the default value of the input [port].
   */
  public fun getInputPortDefaultValue(port: Int): Any? {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInputPortDefaultValuePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Removes the default value of the input [port].
   */
  public fun removeInputPortDefaultValue(port: Int): Unit {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeInputPortDefaultValuePtr, NIL)
  }

  /**
   * Clears the default input ports value.
   */
  public fun clearDefaultInputValues(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearDefaultInputValuesPtr, NIL)
  }

  public enum class PortType(
    id: Long,
  ) {
    /**
     * Floating-point scalar. Translated to [code skip-lint]float[/code] type in shader code.
     */
    PORT_TYPE_SCALAR(0),
    /**
     * Integer scalar. Translated to [code skip-lint]int[/code] type in shader code.
     */
    PORT_TYPE_SCALAR_INT(1),
    /**
     * Unsigned integer scalar. Translated to [code skip-lint]uint[/code] type in shader code.
     */
    PORT_TYPE_SCALAR_UINT(2),
    /**
     * 2D vector of floating-point values. Translated to [code skip-lint]vec2[/code] type in shader
     * code.
     */
    PORT_TYPE_VECTOR_2D(3),
    /**
     * 3D vector of floating-point values. Translated to [code skip-lint]vec3[/code] type in shader
     * code.
     */
    PORT_TYPE_VECTOR_3D(4),
    /**
     * 4D vector of floating-point values. Translated to [code skip-lint]vec4[/code] type in shader
     * code.
     */
    PORT_TYPE_VECTOR_4D(5),
    /**
     * Boolean type. Translated to [code skip-lint]bool[/code] type in shader code.
     */
    PORT_TYPE_BOOLEAN(6),
    /**
     * Transform type. Translated to [code skip-lint]mat4[/code] type in shader code.
     */
    PORT_TYPE_TRANSFORM(7),
    /**
     * Sampler type. Translated to reference of sampler uniform in shader code. Can only be used for
     * input ports in non-uniform nodes.
     */
    PORT_TYPE_SAMPLER(8),
    /**
     * Represents the size of the [PortType] enum.
     */
    PORT_TYPE_MAX(9),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PortType = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getDefaultInputPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "get_default_input_port")

    public val setOutputPortForPreviewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "set_output_port_for_preview")

    public val getOutputPortForPreviewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "get_output_port_for_preview")

    public val setInputPortDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "set_input_port_default_value")

    public val getInputPortDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "get_input_port_default_value")

    public val removeInputPortDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "remove_input_port_default_value")

    public val clearDefaultInputValuesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "clear_default_input_values")

    public val setDefaultInputValuesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "set_default_input_values")

    public val getDefaultInputValuesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "get_default_input_values")

    public val setFramePtr: VoidPtr = TypeManager.getMethodBindPtr("VisualShaderNode", "set_frame")

    public val getFramePtr: VoidPtr = TypeManager.getMethodBindPtr("VisualShaderNode", "get_frame")
  }
}
