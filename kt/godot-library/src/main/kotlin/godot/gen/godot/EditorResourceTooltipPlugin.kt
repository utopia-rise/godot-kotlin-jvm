// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A plugin that advanced tooltip for its handled resource type.
 *
 * Resource tooltip plugins are used by [godot.FileSystemDock] to generate customized tooltips for specific resources. E.g. tooltip for a [godot.Texture2D] displays a bigger preview and the texture's dimensions.
 *
 * A plugin must be first registered with [godot.FileSystemDock.addResourceTooltipPlugin]. When the user hovers a resource in filesystem dock which is handled by the plugin, [_makeTooltipForPath] is called to create the tooltip. It works similarly to [godot.Control.MakeCustomTooltip].
 */
@GodotBaseType
public open class EditorResourceTooltipPlugin internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORRESOURCETOOLTIPPLUGIN, scriptIndex)
    return true
  }

  /**
   * Return `true` if the plugin is going to handle the given [godot.Resource] [type].
   */
  public open fun _handles(type: String): Boolean {
    throw NotImplementedError("_handles is not implemented for EditorResourceTooltipPlugin")
  }

  /**
   * Create and return a tooltip that will be displayed when the user hovers a resource under the given [path] in filesystem dock.
   *
   * The [metadata] dictionary is provided by preview generator (see method EditorResourcePreviewGenerator._generate]).
   *
   * [base] is the base default tooltip, which is a [godot.VBoxContainer] with a file name, type and size labels. If another plugin handled the same file type, [base] will be output from the previous plugin. For best result, make sure the base tooltip is part of the returned [godot.Control].
   *
   * **Note:** It's unadvised to use [godot.ResourceLoader.load], especially with heavy resources like models or textures, because it will make the editor unresponsive when creating the tooltip. You can use [requestThumbnail] if you want to display a preview in your tooltip.
   *
   * **Note:** If you decide to discard the [base], make sure to call [godot.Node.queueFree], because it's not freed automatically.
   *
   * ```
   * 				func _make_tooltip_for_path(path, metadata, base):
   * 				    var t_rect = TextureRect.new()
   * 				    request_thumbnail(path, t_rect)
   * 				    base.add_child(t_rect) # The TextureRect will appear at the bottom of the tooltip.
   * 				    return base
   * 				```
   */
  public open fun _makeTooltipForPath(
    path: String,
    metadata: Dictionary<Any?, Any?>,
    base: Control,
  ): Control? {
    throw NotImplementedError("_make_tooltip_for_path is not implemented for EditorResourceTooltipPlugin")
  }

  /**
   * Requests a thumbnail for the given [godot.TextureRect]. The thumbnail is created asynchronously by [godot.EditorResourcePreview] and automatically set when available.
   */
  public fun requestThumbnail(path: String, control: TextureRect): Unit {
    TransferContext.writeArguments(STRING to path, OBJECT to control)
    TransferContext.callMethod(rawPtr, MethodBindings.requestThumbnailPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val _handlesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourceTooltipPlugin", "_handles")

    public val _makeTooltipForPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourceTooltipPlugin", "_make_tooltip_for_path")

    public val requestThumbnailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourceTooltipPlugin", "request_thumbnail")
  }
}
