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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Child [CanvasItem] nodes of a [CanvasGroup] are drawn as a single object. It allows to e.g. draw
 * overlapping translucent 2D nodes without blending (set [CanvasItem.selfModulate] property of
 * [CanvasGroup] to achieve this effect).
 * **Note:** The [CanvasGroup] uses a custom shader to read from the backbuffer to draw its
 * children. Assigning a [Material] to the [CanvasGroup] overrides the builtin shader. To duplicate the
 * behavior of the builtin shader in a custom [Shader] use the following:
 * [codeblock]
 * shader_type canvas_item;
 * render_mode unshaded;
 *
 * uniform sampler2D screen_texture : hint_screen_texture, repeat_disable, filter_nearest;
 *
 * void fragment() {
 *     vec4 c = textureLod(screen_texture, SCREEN_UV, 0.0);
 *
 *     if (c.a > 0.0001) {
 *         c.rgb /= c.a;
 *     }
 *
 *     COLOR *= c;
 * }
 * [/codeblock]
 * **Note:** Since [CanvasGroup] and [CanvasItem.clipChildren] both utilize the backbuffer, children
 * of a [CanvasGroup] who have their [CanvasItem.clipChildren] set to anything other than
 * [CanvasItem.CLIP_CHILDREN_DISABLED] will not function correctly.
 */
@GodotBaseType
public open class CanvasGroup : Node2D() {
  /**
   * Sets the size of a margin used to expand the drawable rect of this [CanvasGroup]. The size of
   * the [CanvasGroup] is determined by fitting a rect around its children then expanding that rect by
   * [fitMargin]. This increases both the backbuffer area used and the area covered by the
   * [CanvasGroup] both of which can reduce performance. This should be kept as small as possible and
   * should only be expanded when an increased size is needed (e.g. for custom shader effects).
   */
  public final inline var fitMargin: Float
    @JvmName("fitMarginProperty")
    get() = getFitMargin()
    @JvmName("fitMarginProperty")
    set(`value`) {
      setFitMargin(value)
    }

  /**
   * Sets the size of the margin used to expand the clearing rect of this [CanvasGroup]. This
   * expands the area of the backbuffer that will be used by the [CanvasGroup]. A smaller margin will
   * reduce the area of the backbuffer used which can increase performance, however if [useMipmaps] is
   * enabled, a small margin may result in mipmap errors at the edge of the [CanvasGroup]. Accordingly,
   * this should be left as small as possible, but should be increased if artifacts appear along the
   * edges of the canvas group.
   */
  public final inline var clearMargin: Float
    @JvmName("clearMarginProperty")
    get() = getClearMargin()
    @JvmName("clearMarginProperty")
    set(`value`) {
      setClearMargin(value)
    }

  /**
   * If `true`, calculates mipmaps for the backbuffer before drawing the [CanvasGroup] so that
   * mipmaps can be used in a custom [ShaderMaterial] attached to the [CanvasGroup]. Generating mipmaps
   * has a performance cost so this should not be enabled unless required.
   */
  public final inline var useMipmaps: Boolean
    @JvmName("useMipmapsProperty")
    get() = isUsingMipmaps()
    @JvmName("useMipmapsProperty")
    set(`value`) {
      setUseMipmaps(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(135, scriptIndex)
  }

  public final fun setFitMargin(fitMargin: Float): Unit {
    TransferContext.writeArguments(DOUBLE to fitMargin.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFitMarginPtr, NIL)
  }

  public final fun getFitMargin(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFitMarginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setClearMargin(clearMargin: Float): Unit {
    TransferContext.writeArguments(DOUBLE to clearMargin.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setClearMarginPtr, NIL)
  }

  public final fun getClearMargin(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getClearMarginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setUseMipmaps(useMipmaps: Boolean): Unit {
    TransferContext.writeArguments(BOOL to useMipmaps)
    TransferContext.callMethod(ptr, MethodBindings.setUseMipmapsPtr, NIL)
  }

  public final fun isUsingMipmaps(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUsingMipmapsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setFitMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasGroup", "set_fit_margin", 373806689)

    internal val getFitMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasGroup", "get_fit_margin", 1740695150)

    internal val setClearMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasGroup", "set_clear_margin", 373806689)

    internal val getClearMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasGroup", "get_clear_margin", 1740695150)

    internal val setUseMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasGroup", "set_use_mipmaps", 2586408642)

    internal val isUsingMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasGroup", "is_using_mipmaps", 36873697)
  }
}
