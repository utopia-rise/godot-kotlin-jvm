// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A texture that crops out part of another Texture2D.
 *
 * [godot.Texture2D] resource that draws only part of its [atlas] texture, as defined by the [region]. An additional [margin] can also be set, which is useful for small adjustments.
 *
 * Multiple [godot.AtlasTexture] resources can be cropped from the same [atlas]. Packing many smaller textures into a singular large texture helps to optimize video memory costs and render calls.
 *
 * **Note:** [godot.AtlasTexture] cannot be used in an [godot.AnimatedTexture], and may not tile properly in nodes such as [godot.TextureRect], when inside other [godot.AtlasTexture] resources.
 */
@GodotBaseType
public open class AtlasTexture : Texture2D() {
  /**
   * The texture that contains the atlas. Can be any type inheriting from [godot.Texture2D], including another [godot.AtlasTexture].
   */
  public var atlas: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ATLASTEXTURE_GET_ATLAS, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ATLASTEXTURE_SET_ATLAS, NIL)
    }

  /**
   * The region used to draw the [atlas].
   */
  public var region: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ATLASTEXTURE_GET_REGION, RECT2)
      return TransferContext.readReturnValue(RECT2, false) as Rect2
    }
    set(`value`) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ATLASTEXTURE_SET_REGION, NIL)
    }

  /**
   * The margin around the [region]. Useful for small adjustments. If the [godot.Rect2.size] of this property ("w" and "h" in the editor) is set, the drawn texture is resized to fit within the margin.
   */
  public var margin: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ATLASTEXTURE_GET_MARGIN, RECT2)
      return TransferContext.readReturnValue(RECT2, false) as Rect2
    }
    set(`value`) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ATLASTEXTURE_SET_MARGIN, NIL)
    }

  /**
   * If `true`, the area outside of the [region] is clipped to avoid bleeding of the surrounding texture pixels.
   */
  public var filterClip: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ATLASTEXTURE_HAS_FILTER_CLIP,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ATLASTEXTURE_SET_FILTER_CLIP, NIL)
    }

  public override fun __new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_ATLASTEXTURE, scriptIndex)
  }

  public companion object
}
