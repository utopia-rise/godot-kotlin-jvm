// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Texture with optional normal and specular maps for use in 2D rendering.
 *
 * [godot.CanvasTexture] is an alternative to [godot.ImageTexture] for 2D rendering. It allows using normal maps and specular maps in any node that inherits from [godot.CanvasItem]. [godot.CanvasTexture] also allows overriding the texture's filter and repeat mode independently of the node's properties (or the project settings).
 *
 * **Note:** [godot.CanvasTexture] cannot be used in 3D rendering. For physically-based materials in 3D, use [godot.BaseMaterial3D] instead.
 */
@GodotBaseType
public open class CanvasTexture : Texture2D() {
  /**
   * The diffuse (color) texture to use. This is the main texture you want to set in most cases.
   */
  public var diffuseTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASTEXTURE_GET_DIFFUSE_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASTEXTURE_SET_DIFFUSE_TEXTURE,
          NIL)
    }

  /**
   * The normal map texture to use. Only has a visible effect if [godot.Light2D]s are affecting this [godot.CanvasTexture].
   *
   * **Note:** Godot expects the normal map to use X+, Y+, and Z+ coordinates. See [this page](http://wiki.polycount.com/wiki/Normal_Map_Technical_Details#Common_Swizzle_Coordinates) for a comparison of normal map coordinates expected by popular engines.
   */
  public var normalTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASTEXTURE_GET_NORMAL_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASTEXTURE_SET_NORMAL_TEXTURE,
          NIL)
    }

  /**
   * The specular map to use for [godot.Light2D] specular reflections. This should be a grayscale or colored texture, with brighter areas resulting in a higher [specularShininess] value. Using a colored [specularTexture] allows controlling specular shininess on a per-channel basis. Only has a visible effect if [godot.Light2D]s are affecting this [godot.CanvasTexture].
   */
  public var specularTexture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASTEXTURE_GET_SPECULAR_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASTEXTURE_SET_SPECULAR_TEXTURE, NIL)
    }

  /**
   * The multiplier for specular reflection colors. The [godot.Light2D]'s color is also taken into account when determining the reflection color. Only has a visible effect if [godot.Light2D]s are affecting this [godot.CanvasTexture].
   */
  public var specularColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASTEXTURE_GET_SPECULAR_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASTEXTURE_SET_SPECULAR_COLOR,
          NIL)
    }

  /**
   * The specular exponent for [godot.Light2D] specular reflections. Higher values result in a more glossy/"wet" look, with reflections becoming more localized and less visible overall. The default value of `1.0` disables specular reflections entirely. Only has a visible effect if [godot.Light2D]s are affecting this [godot.CanvasTexture].
   */
  public var specularShininess: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASTEXTURE_GET_SPECULAR_SHININESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASTEXTURE_SET_SPECULAR_SHININESS, NIL)
    }

  /**
   * The texture filtering mode to use when drawing this [godot.CanvasTexture].
   */
  public var textureFilter: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASTEXTURE_GET_TEXTURE_FILTER,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASTEXTURE_SET_TEXTURE_FILTER,
          NIL)
    }

  /**
   * The texture repeat mode to use when drawing this [godot.CanvasTexture].
   */
  public var textureRepeat: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASTEXTURE_GET_TEXTURE_REPEAT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASTEXTURE_SET_TEXTURE_REPEAT,
          NIL)
    }

  public override fun __new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CANVASTEXTURE, scriptIndex)
  }

  public companion object
}
