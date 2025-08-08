// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
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

  override fun new(scriptIndex: Int) {
    createNativeObject(733, scriptIndex)
  }

  public final fun setFunction(func: Function) {
    TransferContext.writeArguments(LONG to func.id)
    TransferContext.callMethod(ptr, MethodBindings.setFunctionPtr, NIL)
  }

  public final fun getFunction(): Function {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFunctionPtr, LONG)
    return Function.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Function(
    id: Long,
  ) {
    /**
     * Converts the color to grayscale using the following formula:
     *
     * ```
     * vec3 c = input;
     * float max1 = max(c.r, c.g);
     * float max2 = max(max1, c.b);
     * float max3 = max(max1, max2);
     * return vec3(max3, max3, max3);
     * ```
     */
    GRAYSCALE(0),
    /**
     * Converts HSV vector to RGB equivalent.
     */
    HSV2RGB(1),
    /**
     * Converts RGB vector to HSV equivalent.
     */
    RGB2HSV(2),
    /**
     * Applies sepia tone effect using the following formula:
     *
     * ```
     * vec3 c = input;
     * float r = (c.r * 0.393) + (c.g * 0.769) + (c.b * 0.189);
     * float g = (c.r * 0.349) + (c.g * 0.686) + (c.b * 0.168);
     * float b = (c.r * 0.272) + (c.g * 0.534) + (c.b * 0.131);
     * return vec3(r, g, b);
     * ```
     */
    SEPIA(3),
    /**
     * Converts color from linear color space to sRGB color space using the following formula:
     *
     * ```
     * vec3 c = clamp(c, vec3(0.0), vec3(1.0));
     * const vec3 a = vec3(0.055f);
     * return mix((vec3(1.0f) + a) * pow(c.rgb, vec3(1.0f / 2.4f)) - a, 12.92f * c.rgb, lessThan(c.rgb, vec3(0.0031308f)));
     * ```
     *
     * The Compatibility renderer uses a simpler formula:
     *
     * ```
     * vec3 c = input;
     * return max(vec3(1.055) * pow(c, vec3(0.416666667)) - vec3(0.055), vec3(0.0));
     * ```
     */
    LINEAR_TO_SRGB(4),
    /**
     * Converts color from sRGB color space to linear color space using the following formula:
     *
     * ```
     * vec3 c = input;
     * return mix(pow((c.rgb + vec3(0.055)) * (1.0 / (1.0 + 0.055)), vec3(2.4)), c.rgb * (1.0 / 12.92), lessThan(c.rgb, vec3(0.04045)));
     * ```
     *
     * The Compatibility renderer uses a simpler formula:
     *
     * ```
     * vec3 c = input;
     * return c * (c * (c * 0.305306011 + 0.682171111) + 0.012522878);
     * ```
     */
    SRGB_TO_LINEAR(5),
    /**
     * Represents the size of the [Function] enum.
     */
    MAX(6),
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

  public object MethodBindings {
    internal val setFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeColorFunc", "set_function", 3_973_396_138)

    internal val getFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeColorFunc", "get_function", 554_863_321)
  }
}
