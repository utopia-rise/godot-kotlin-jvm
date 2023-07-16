// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

/**
 * Merges several 2D nodes into a single draw operation.
 *
 * Child [godot.CanvasItem] nodes of a [godot.CanvasGroup] are drawn as a single object. It allows to e.g. draw overlapping translucent 2D nodes without blending (set [godot.CanvasItem.selfModulate] property of [godot.CanvasGroup] to achieve this effect).
 *
 * **Note:** The [godot.CanvasGroup] uses a custom shader to read from the backbuffer to draw its children. Assigning a [godot.Material] to the [godot.CanvasGroup] overrides the builtin shader. To duplicate the behavior of the builtin shader in a custom [godot.Shader] use the following:
 *
 * ```
 * 		shader_type canvas_item;
 * 		render_mode unshaded;
 *
 * 		uniform sampler2D screen_texture : hint_screen_texture, repeat_disable, filter_nearest;
 *
 * 		void fragment() {
 * 		    vec4 c = textureLod(screen_texture, SCREEN_UV, 0.0);
 *
 * 		    if (c.a > 0.0001) {
 * 		        c.rgb /= c.a;
 * 		    }
 *
 * 		    COLOR *= c;
 * 		}
 * 		```
 *
 * **Note:** Since [godot.CanvasGroup] and [godot.CanvasItem.clipChildren] both utilize the backbuffer, children of a [godot.CanvasGroup] who have their [godot.CanvasItem.clipChildren] set to anything other than [godot.CanvasItem.CLIP_CHILDREN_DISABLED] will not function correctly.
 */
@GodotBaseType
public open class CanvasGroup : Node2D() {
  /**
   * Sets the size of a margin used to expand the drawable rect of this [godot.CanvasGroup]. The size of the [godot.CanvasGroup] is determined by fitting a rect around its children then expanding that rect by [fitMargin]. This increases both the backbuffer area used and the area covered by the [godot.CanvasGroup] both of which can reduce performance. This should be kept as small as possible and should only be expanded when an increased size is needed (e.g. for custom shader effects).
   */
  public var fitMargin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASGROUP_GET_FIT_MARGIN,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASGROUP_SET_FIT_MARGIN, NIL)
    }

  /**
   * Sets the size of the margin used to expand the clearing rect of this [godot.CanvasGroup]. This expands the area of the backbuffer that will be used by the [godot.CanvasGroup]. A smaller margin will reduce the area of the backbuffer used which can increase performance, however if [useMipmaps] is enabled, a small margin may result in mipmap errors at the edge of the [godot.CanvasGroup]. Accordingly, this should be left as small as possible, but should be increased if artifacts appear along the edges of the canvas group.
   */
  public var clearMargin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASGROUP_GET_CLEAR_MARGIN,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASGROUP_SET_CLEAR_MARGIN, NIL)
    }

  /**
   * If `true`, calculates mipmaps for the backbuffer before drawing the [godot.CanvasGroup] so that mipmaps can be used in a custom [godot.ShaderMaterial] attached to the [godot.CanvasGroup]. Generating mipmaps has a performance cost so this should not be enabled unless required.
   */
  public var useMipmaps: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASGROUP_IS_USING_MIPMAPS,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASGROUP_SET_USE_MIPMAPS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CANVASGROUP, scriptIndex)
    return true
  }

  public companion object
}
