// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Base class for nodes in a visual shader graph.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/shaders/visual_shaders.html]($DOCS_URL/tutorials/shaders/visual_shaders.html)
 *
 * Visual shader graphs consist of various nodes. Each node in the graph is a separate object and they are represented as a rectangular boxes with title and a set of properties. Each node has also connection ports that allow to connect it to another nodes and control the flow of the shader.
 */
@GodotBaseType
public open class VisualShaderNode internal constructor() : Resource() {
  /**
   * Sets the output port index which will be showed for preview. If set to `-1` no port will be open for preview.
   */
  public var outputPortForPreview: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODE_GET_OUTPUT_PORT_FOR_PREVIEW, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODE_SET_OUTPUT_PORT_FOR_PREVIEW, NIL)
    }

  public var defaultInputValues: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODE_GET_DEFAULT_INPUT_VALUES, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODE_SET_DEFAULT_INPUT_VALUES, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODE, scriptIndex)
    return true
  }

  /**
   * Sets the default [value] for the selected input [port].
   */
  @JvmOverloads
  public fun setInputPortDefaultValue(
    port: Int,
    `value`: Any,
    prevValue: Any? = null,
  ): Unit {
    TransferContext.writeArguments(LONG to port.toLong(), ANY to value, ANY to prevValue)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODE_SET_INPUT_PORT_DEFAULT_VALUE, NIL)
  }

  /**
   * Returns the default value of the input [port].
   */
  public fun getInputPortDefaultValue(port: Int): Any? {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODE_GET_INPUT_PORT_DEFAULT_VALUE, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Removes the default value of the input [port].
   */
  public fun removeInputPortDefaultValue(port: Int): Unit {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODE_REMOVE_INPUT_PORT_DEFAULT_VALUE, NIL)
  }

  /**
   * Clears the default input ports value.
   */
  public fun clearDefaultInputValues(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODE_CLEAR_DEFAULT_INPUT_VALUES, NIL)
  }

  public enum class PortType(
    id: Long,
  ) {
    /**
     * Floating-point scalar. Translated to `float` type in shader code.
     */
    PORT_TYPE_SCALAR(0),
    /**
     * Integer scalar. Translated to `int` type in shader code.
     */
    PORT_TYPE_SCALAR_INT(1),
    /**
     * Unsigned integer scalar. Translated to `uint` type in shader code.
     */
    PORT_TYPE_SCALAR_UINT(2),
    /**
     * 2D vector of floating-point values. Translated to `vec2` type in shader code.
     */
    PORT_TYPE_VECTOR_2D(3),
    /**
     * 3D vector of floating-point values. Translated to `vec3` type in shader code.
     */
    PORT_TYPE_VECTOR_3D(4),
    /**
     * 4D vector of floating-point values. Translated to `vec4` type in shader code.
     */
    PORT_TYPE_VECTOR_4D(5),
    /**
     * Boolean type. Translated to `bool` type in shader code.
     */
    PORT_TYPE_BOOLEAN(6),
    /**
     * Transform type. Translated to `mat4` type in shader code.
     */
    PORT_TYPE_TRANSFORM(7),
    /**
     * Sampler type. Translated to reference of sampler uniform in shader code. Can only be used for input ports in non-uniform nodes.
     */
    PORT_TYPE_SAMPLER(8),
    /**
     * Represents the size of the [enum PortType] enum.
     */
    PORT_TYPE_MAX(9),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object
}
