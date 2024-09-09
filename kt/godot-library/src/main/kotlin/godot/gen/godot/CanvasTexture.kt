// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TypeManager
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * [CanvasTexture] is an alternative to [ImageTexture] for 2D rendering. It allows using normal maps
 * and specular maps in any node that inherits from [CanvasItem]. [CanvasTexture] also allows
 * overriding the texture's filter and repeat mode independently of the node's properties (or the
 * project settings).
 * **Note:** [CanvasTexture] cannot be used in 3D. It will not display correctly when applied to any
 * [VisualInstance3D], such as [Sprite3D] or [Decal]. For physically-based materials in 3D, use
 * [BaseMaterial3D] instead.
 */
@GodotBaseType
public open class CanvasTexture : Texture2D() {
  /**
   * The diffuse (color) texture to use. This is the main texture you want to set in most cases.
   */
  public var diffuseTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDiffuseTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDiffuseTexturePtr, NIL)
    }

  /**
   * The normal map texture to use. Only has a visible effect if [Light2D]s are affecting this
   * [CanvasTexture].
   * **Note:** Godot expects the normal map to use X+, Y+, and Z+ coordinates. See
   * [url=http://wiki.polycount.com/wiki/Normal_Map_Technical_Details#Common_Swizzle_Coordinates]this
   * page[/url] for a comparison of normal map coordinates expected by popular engines.
   */
  public var normalTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNormalTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNormalTexturePtr, NIL)
    }

  /**
   * The specular map to use for [Light2D] specular reflections. This should be a grayscale or
   * colored texture, with brighter areas resulting in a higher [specularShininess] value. Using a
   * colored [specularTexture] allows controlling specular shininess on a per-channel basis. Only has a
   * visible effect if [Light2D]s are affecting this [CanvasTexture].
   */
  public var specularTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpecularTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSpecularTexturePtr, NIL)
    }

  /**
   * The multiplier for specular reflection colors. The [Light2D]'s color is also taken into account
   * when determining the reflection color. Only has a visible effect if [Light2D]s are affecting this
   * [CanvasTexture].
   */
  @CoreTypeLocalCopy
  public var specularColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpecularColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSpecularColorPtr, NIL)
    }

  /**
   * The specular exponent for [Light2D] specular reflections. Higher values result in a more
   * glossy/"wet" look, with reflections becoming more localized and less visible overall. The default
   * value of `1.0` disables specular reflections entirely. Only has a visible effect if [Light2D]s are
   * affecting this [CanvasTexture].
   */
  public var specularShininess: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpecularShininessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSpecularShininessPtr, NIL)
    }

  /**
   * The texture filtering mode to use when drawing this [CanvasTexture].
   */
  public var textureFilter: CanvasItem.TextureFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureFilterPtr, LONG)
      return CanvasItem.TextureFilter.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureFilterPtr, NIL)
    }

  /**
   * The texture repeat mode to use when drawing this [CanvasTexture].
   */
  public var textureRepeat: CanvasItem.TextureRepeat
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureRepeatPtr, LONG)
      return CanvasItem.TextureRepeat.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureRepeatPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CANVASTEXTURE, scriptIndex)
  }

  /**
   * The multiplier for specular reflection colors. The [Light2D]'s color is also taken into account
   * when determining the reflection color. Only has a visible effect if [Light2D]s are affecting this
   * [CanvasTexture].
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = canvastexture.specularColor
   * //Your changes
   * canvastexture.specularColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun specularColorMutate(block: Color.() -> Unit): Color = specularColor.apply{
      block(this)
      specularColor = this
  }


  public companion object

  internal object MethodBindings {
    public val setDiffuseTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "set_diffuse_texture", 4051416890)

    public val getDiffuseTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "get_diffuse_texture", 3635182373)

    public val setNormalTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "set_normal_texture", 4051416890)

    public val getNormalTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "get_normal_texture", 3635182373)

    public val setSpecularTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "set_specular_texture", 4051416890)

    public val getSpecularTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "get_specular_texture", 3635182373)

    public val setSpecularColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "set_specular_color", 2920490490)

    public val getSpecularColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "get_specular_color", 3444240500)

    public val setSpecularShininessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "set_specular_shininess", 373806689)

    public val getSpecularShininessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "get_specular_shininess", 1740695150)

    public val setTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "set_texture_filter", 1037999706)

    public val getTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "get_texture_filter", 121960042)

    public val setTextureRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "set_texture_repeat", 1716472974)

    public val getTextureRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "get_texture_repeat", 2667158319)
  }
}
