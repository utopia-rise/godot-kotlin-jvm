// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [CanvasTexture] is an alternative to [ImageTexture] for 2D rendering. It allows using normal maps
 * and specular maps in any node that inherits from [CanvasItem]. [CanvasTexture] also allows
 * overriding the texture's filter and repeat mode independently of the node's properties (or the
 * project settings).
 *
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
   *
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
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
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
    createNativeObject(140, scriptIndex)
  }

  /**
   * This is a helper function for [specularColor] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = canvastexture.specularColor
   * //Your changes
   * canvastexture.specularColor = myCoreType
   * ``````
   *
   * The multiplier for specular reflection colors. The [Light2D]'s color is also taken into account
   * when determining the reflection color. Only has a visible effect if [Light2D]s are affecting this
   * [CanvasTexture].
   */
  @CoreTypeHelper
  public final fun specularColorMutate(block: Color.() -> Unit): Color = specularColor.apply {
     block(this)
     specularColor = this
  }

  public final fun setDiffuseTexture(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setDiffuseTexturePtr, NIL)
  }

  public final fun getDiffuseTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDiffuseTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setNormalTexture(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setNormalTexturePtr, NIL)
  }

  public final fun getNormalTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNormalTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setSpecularTexture(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setSpecularTexturePtr, NIL)
  }

  public final fun getSpecularTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpecularTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setSpecularColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setSpecularColorPtr, NIL)
  }

  public final fun getSpecularColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpecularColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setSpecularShininess(shininess: Float): Unit {
    TransferContext.writeArguments(DOUBLE to shininess.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSpecularShininessPtr, NIL)
  }

  public final fun getSpecularShininess(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpecularShininessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTextureFilter(filter: CanvasItem.TextureFilter): Unit {
    TransferContext.writeArguments(LONG to filter.value)
    TransferContext.callMethod(ptr, MethodBindings.setTextureFilterPtr, NIL)
  }

  public final fun getTextureFilter(): CanvasItem.TextureFilter {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureFilterPtr, LONG)
    return CanvasItem.TextureFilter.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTextureRepeat(repeat: CanvasItem.TextureRepeat): Unit {
    TransferContext.writeArguments(LONG to repeat.value)
    TransferContext.callMethod(ptr, MethodBindings.setTextureRepeatPtr, NIL)
  }

  public final fun getTextureRepeat(): CanvasItem.TextureRepeat {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureRepeatPtr, LONG)
    return CanvasItem.TextureRepeat.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getWidth(): Int {
    throw NotImplementedError("CanvasTexture::_getWidth can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getHeight(): Int {
    throw NotImplementedError("CanvasTexture::_getHeight can't be called from the JVM.")
  }

  public companion object

  public object MethodBindings {
    internal val setDiffuseTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "set_diffuse_texture", 4051416890)

    internal val getDiffuseTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "get_diffuse_texture", 3635182373)

    internal val setNormalTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "set_normal_texture", 4051416890)

    internal val getNormalTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "get_normal_texture", 3635182373)

    internal val setSpecularTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "set_specular_texture", 4051416890)

    internal val getSpecularTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "get_specular_texture", 3635182373)

    internal val setSpecularColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "set_specular_color", 2920490490)

    internal val getSpecularColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "get_specular_color", 3444240500)

    internal val setSpecularShininessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "set_specular_shininess", 373806689)

    internal val getSpecularShininessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "get_specular_shininess", 1740695150)

    internal val setTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "set_texture_filter", 1037999706)

    internal val getTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "get_texture_filter", 121960042)

    internal val setTextureRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "set_texture_repeat", 1716472974)

    internal val getTextureRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasTexture", "get_texture_repeat", 2667158319)
  }
}
