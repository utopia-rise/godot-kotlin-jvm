// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.GodotEnum
import godot.core.VariantArray
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * Visual shader graphs consist of various nodes. Each node in the graph is a separate object and
 * they are represented as a rectangular boxes with title and a set of properties. Each node also has
 * connection ports that allow to connect it to another nodes and control the flow of the shader.
 */
@GodotBaseType
public abstract class VisualShaderNode : Resource() {
  /**
   * Sets the output port index which will be showed for preview. If set to `-1` no port will be
   * open for preview.
   */
  public final inline var outputPortForPreview: Int
    @JvmName("outputPortForPreviewProperty")
    get() = getOutputPortForPreview()
    @JvmName("outputPortForPreviewProperty")
    set(`value`) {
      setOutputPortForPreview(value)
    }

  public final inline var defaultInputValues: VariantArray<Any?>
    @JvmName("defaultInputValuesProperty")
    get() = getDefaultInputValues()
    @JvmName("defaultInputValuesProperty")
    set(`value`) {
      setDefaultInputValues(value)
    }

  /**
   * Represents the index of the frame this node is linked to. If set to `-1` the node is not linked
   * to any frame.
   */
  public final inline var linkedParentGraphFrame: Int
    @JvmName("linkedParentGraphFrameProperty")
    get() = getFrame()
    @JvmName("linkedParentGraphFrameProperty")
    set(`value`) {
      setFrame(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(743, scriptIndex)
  }

  /**
   * Returns the input port which should be connected by default when this node is created as a
   * result of dragging a connection from an existing node to the empty space on the graph.
   */
  public final fun getDefaultInputPort(type: PortType): Int {
    TransferContext.writeArguments(LONG to type.value)
    TransferContext.callMethod(ptr, MethodBindings.getDefaultInputPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setOutputPortForPreview(port: Int): Unit {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setOutputPortForPreviewPtr, NIL)
  }

  public final fun getOutputPortForPreview(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOutputPortForPreviewPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the default [value] for the selected input [port].
   */
  @JvmOverloads
  public final fun setInputPortDefaultValue(
    port: Int,
    `value`: Any?,
    prevValue: Any? = null,
  ): Unit {
    TransferContext.writeArguments(LONG to port.toLong(), ANY to value, ANY to prevValue)
    TransferContext.callMethod(ptr, MethodBindings.setInputPortDefaultValuePtr, NIL)
  }

  /**
   * Returns the default value of the input [port].
   */
  public final fun getInputPortDefaultValue(port: Int): Any? {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getInputPortDefaultValuePtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Removes the default value of the input [port].
   */
  public final fun removeInputPortDefaultValue(port: Int): Unit {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeInputPortDefaultValuePtr, NIL)
  }

  /**
   * Clears the default input ports value.
   */
  public final fun clearDefaultInputValues(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearDefaultInputValuesPtr, NIL)
  }

  /**
   * Sets the default input ports values using an [Array] of the form `[index0, value0, index1,
   * value1, ...]`. For example: `[0, Vector3(0, 0, 0), 1, Vector3(0, 0, 0)]`.
   */
  public final fun setDefaultInputValues(values: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to values)
    TransferContext.callMethod(ptr, MethodBindings.setDefaultInputValuesPtr, NIL)
  }

  /**
   * Returns an [Array] containing default values for all of the input ports of the node in the form
   * `[index0, value0, index1, value1, ...]`.
   */
  public final fun getDefaultInputValues(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDefaultInputValuesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  public final fun setFrame(frame: Int): Unit {
    TransferContext.writeArguments(LONG to frame.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setFramePtr, NIL)
  }

  public final fun getFrame(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFramePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public enum class PortType(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Floating-point scalar. Translated to [code skip-lint]float[/code] type in shader code.
     */
    SCALAR(0),
    /**
     * Integer scalar. Translated to [code skip-lint]int[/code] type in shader code.
     */
    SCALAR_INT(1),
    /**
     * Unsigned integer scalar. Translated to [code skip-lint]uint[/code] type in shader code.
     */
    SCALAR_UINT(2),
    /**
     * 2D vector of floating-point values. Translated to [code skip-lint]vec2[/code] type in shader
     * code.
     */
    VECTOR_2D(3),
    /**
     * 3D vector of floating-point values. Translated to [code skip-lint]vec3[/code] type in shader
     * code.
     */
    VECTOR_3D(4),
    /**
     * 4D vector of floating-point values. Translated to [code skip-lint]vec4[/code] type in shader
     * code.
     */
    VECTOR_4D(5),
    /**
     * Boolean type. Translated to [code skip-lint]bool[/code] type in shader code.
     */
    BOOLEAN(6),
    /**
     * Transform type. Translated to [code skip-lint]mat4[/code] type in shader code.
     */
    TRANSFORM(7),
    /**
     * Sampler type. Translated to reference of sampler uniform in shader code. Can only be used for
     * input ports in non-uniform nodes.
     */
    SAMPLER(8),
    /**
     * Represents the size of the [PortType] enum.
     */
    MAX(9),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): PortType = entries.single { it.`value` == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val getDefaultInputPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "get_default_input_port", 1894493699)

    internal val setOutputPortForPreviewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "set_output_port_for_preview", 1286410249)

    internal val getOutputPortForPreviewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "get_output_port_for_preview", 3905245786)

    internal val setInputPortDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "set_input_port_default_value", 150923387)

    internal val getInputPortDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "get_input_port_default_value", 4227898402)

    internal val removeInputPortDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "remove_input_port_default_value", 1286410249)

    internal val clearDefaultInputValuesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "clear_default_input_values", 3218959716)

    internal val setDefaultInputValuesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "set_default_input_values", 381264803)

    internal val getDefaultInputValuesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "get_default_input_values", 3995934104)

    internal val setFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "set_frame", 1286410249)

    internal val getFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNode", "get_frame", 3905245786)
  }
}
