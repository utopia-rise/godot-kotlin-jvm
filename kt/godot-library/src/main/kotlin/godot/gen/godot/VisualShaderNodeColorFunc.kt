// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * A [godot.core.Color] function to be used within the visual shader graph.
 *
 * Accept a [godot.core.Color] to the input port and transform it according to [function].
 */
@GodotBaseType
public open class VisualShaderNodeColorFunc : VisualShaderNode() {
  /**
   * A function to be applied to the input color. See [enum Function] for options.
   */
  public var function: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECOLORFUNC_GET_FUNCTION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECOLORFUNC_SET_FUNCTION, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODECOLORFUNC, scriptIndex)
    return true
  }

  public enum class Function(
    id: Long
  ) {
    /**
     * Converts the color to grayscale using the following formula:
     *
     * ```
     * 			vec3 c = input;
     * 			float max1 = max(c.r, c.g);
     * 			float max2 = max(max1, c.b);
     * 			float max3 = max(max1, max2);
     * 			return vec3(max3, max3, max3);
     * 			```
     */
    FUNC_GRAYSCALE(0),
    /**
     * Applies sepia tone effect using the following formula:
     *
     * ```
     * 			vec3 c = input;
     * 			float r = (c.r * 0.393) + (c.g * 0.769) + (c.b * 0.189);
     * 			float g = (c.r * 0.349) + (c.g * 0.686) + (c.b * 0.168);
     * 			float b = (c.r * 0.272) + (c.g * 0.534) + (c.b * 0.131);
     * 			return vec3(r, g, b);
     * 			```
     */
    FUNC_SEPIA(1),
    /**
     * Represents the size of the [enum Function] enum.
     */
    FUNC_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
