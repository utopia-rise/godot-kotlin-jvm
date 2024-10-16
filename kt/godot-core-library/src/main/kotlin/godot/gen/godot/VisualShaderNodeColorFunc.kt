// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Accept a [Color] to the input port and transform it according to [function].
 */
@GodotBaseType
public open class VisualShaderNodeColorFunc : VisualShaderNode() {
  /**
   * A function to be applied to the input color. See [Function] for options.
   */
  public final inline var function: Function
    @JvmName("functionProperty")
    get() = getFunction()
    @JvmName("functionProperty")
    set(`value`) {
      setFunction(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_VISUALSHADERNODECOLORFUNC, scriptIndex)
  }

  public final fun setFunction(func: Function): Unit {
    TransferContext.writeArguments(LONG to func.id)
    TransferContext.callMethod(ptr, MethodBindings.setFunctionPtr, NIL)
  }

  public final fun getFunction(): Function {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFunctionPtr, LONG)
    return VisualShaderNodeColorFunc.Function.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Function(
    id: Long,
  ) {
    /**
     * Converts the color to grayscale using the following formula:
     * [codeblock]
     * vec3 c = input;
     * float max1 = max(c.r, c.g);
     * float max2 = max(max1, c.b);
     * float max3 = max(max1, max2);
     * return vec3(max3, max3, max3);
     * [/codeblock]
     */
    FUNC_GRAYSCALE(0),
    /**
     * Converts HSV vector to RGB equivalent.
     */
    FUNC_HSV2RGB(1),
    /**
     * Converts RGB vector to HSV equivalent.
     */
    FUNC_RGB2HSV(2),
    /**
     * Applies sepia tone effect using the following formula:
     * [codeblock]
     * vec3 c = input;
     * float r = (c.r * 0.393) + (c.g * 0.769) + (c.b * 0.189);
     * float g = (c.r * 0.349) + (c.g * 0.686) + (c.b * 0.168);
     * float b = (c.r * 0.272) + (c.g * 0.534) + (c.b * 0.131);
     * return vec3(r, g, b);
     * [/codeblock]
     */
    FUNC_SEPIA(3),
    /**
     * Represents the size of the [Function] enum.
     */
    FUNC_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Function = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeColorFunc", "set_function", 3973396138)

    public val getFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeColorFunc", "get_function", 554863321)
  }
}
