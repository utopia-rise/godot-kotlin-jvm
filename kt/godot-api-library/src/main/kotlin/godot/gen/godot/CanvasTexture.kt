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
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline var diffuseTexture: Texture2D?
    @JvmName("diffuseTextureProperty")
    get() = getDiffuseTexture()
    @JvmName("diffuseTextureProperty")
    set(`value`) {
      setDiffuseTexture(value)
    }

  /**
   * The normal map texture to use. Only has a visible effect if [Light2D]s are affecting this
   * [CanvasTexture].
   * **Note:** Godot expects the normal map to use X+, Y+, and Z+ coordinates. See
   * [url=http://wiki.polycount.com/wiki/Normal_Map_Technical_Details#Common_Swizzle_Coordinates]this
   * page[/url] for a comparison of normal map coordinates expected by popular engines.
   */
  public final inline var normalTexture: Texture2D?
    @JvmName("normalTextureProperty")
    get() = getNormalTexture()
    @JvmName("normalTextureProperty")
    set(`value`) {
      setNormalTexture(value)
    }

  /**
   * The specular map to use for [Light2D] specular reflections. This should be a grayscale or
   * colored texture, with brighter areas resulting in a higher [specularShininess] value. Using a
   * colored [specularTexture] allows controlling specular shininess on a per-channel basis. Only has a
   * visible effect if [Light2D]s are affecting this [CanvasTexture].
   */
  public final inline var specularTexture: Texture2D?
    @JvmName("specularTextureProperty")
    get() = getSpecularTexture()
    @JvmName("specularTextureProperty")
    set(`value`) {
      setSpecularTexture(value)
    }

  /**
   * The multiplier for specular reflection colors. The [Light2D]'s color is also taken into account
   * when determining the reflection color. Only has a visible effect if [Light2D]s are affecting this
   * [CanvasTexture].
   */
  @CoreTypeLocalCopy
  public final inline var specularColor: Color
    @JvmName("specularColorProperty")
    get() = getSpecularColor()
    @JvmName("specularColorProperty")
    set(`value`) {
      setSpecularColor(value)
    }

  /**
   * The specular exponent for [Light2D] specular reflections. Higher values result in a more
   * glossy/"wet" look, with reflections becoming more localized and less visible overall. The default
   * value of `1.0` disables specular reflections entirely. Only has a visible effect if [Light2D]s are
   * affecting this [CanvasTexture].
   */
  public final inline var specularShininess: Float
    @JvmName("specularShininessProperty")
    get() = getSpecularShininess()
    @JvmName("specularShininessProperty")
    set(`value`) {
      setSpecularShininess(value)
    }

  /**
   * The texture filtering mode to use when drawing this [CanvasTexture].
   */
  public final inline var textureFilter: CanvasItem.TextureFilter
    @JvmName("textureFilterProperty")
    get() = getTextureFilter()
    @JvmName("textureFilterProperty")
    set(`value`) {
      setTextureFilter(value)
    }

  /**
   * The texture repeat mode to use when drawing this [CanvasTexture].
   */
  public final inline var textureRepeat: CanvasItem.TextureRepeat
    @JvmName("textureRepeatProperty")
    get() = getTextureRepeat()
    @JvmName("textureRepeatProperty")
    set(`value`) {
      setTextureRepeat(value)
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
  public final fun specularColorMutate(block: Color.() -> Unit): Color = specularColor.apply{
      block(this)
      specularColor = this
  }


  public final fun setDiffuseTexture(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setDiffuseTexturePtr, NIL)
  }

  public final fun getDiffuseTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDiffuseTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setNormalTexture(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setNormalTexturePtr, NIL)
  }

  public final fun getNormalTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNormalTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setSpecularTexture(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setSpecularTexturePtr, NIL)
  }

  public final fun getSpecularTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSpecularTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setSpecularColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setSpecularColorPtr, NIL)
  }

  public final fun getSpecularColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSpecularColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setSpecularShininess(shininess: Float): Unit {
    TransferContext.writeArguments(DOUBLE to shininess.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setSpecularShininessPtr, NIL)
  }

  public final fun getSpecularShininess(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSpecularShininessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTextureFilter(filter: CanvasItem.TextureFilter): Unit {
    TransferContext.writeArguments(LONG to filter.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextureFilterPtr, NIL)
  }

  public final fun getTextureFilter(): CanvasItem.TextureFilter {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureFilterPtr, LONG)
    return CanvasItem.TextureFilter.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTextureRepeat(repeat: CanvasItem.TextureRepeat): Unit {
    TransferContext.writeArguments(LONG to repeat.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextureRepeatPtr, NIL)
  }

  public final fun getTextureRepeat(): CanvasItem.TextureRepeat {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureRepeatPtr, LONG)
    return CanvasItem.TextureRepeat.from(TransferContext.readReturnValue(LONG) as Long)
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
