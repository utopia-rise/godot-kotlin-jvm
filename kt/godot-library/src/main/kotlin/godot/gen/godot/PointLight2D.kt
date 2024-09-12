// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Casts light in a 2D environment. This light's shape is defined by a (usually grayscale) texture.
 */
@GodotBaseType
public open class PointLight2D : Light2D() {
  /**
   * [Texture2D] used for the light's appearance.
   */
  public final inline var texture: Texture2D?
    @JvmName("textureProperty")
    get() = getTexture()
    @JvmName("textureProperty")
    set(`value`) {
      setTexture(value)
    }

  /**
   * The offset of the light's [texture].
   */
  @CoreTypeLocalCopy
  public final inline var offset: Vector2
    @JvmName("offsetProperty")
    get() = getTextureOffset()
    @JvmName("offsetProperty")
    set(`value`) {
      setTextureOffset(value)
    }

  /**
   * The [texture]'s scale factor.
   */
  public final inline var textureScale: Float
    @JvmName("textureScaleProperty")
    get() = getTextureScale()
    @JvmName("textureScaleProperty")
    set(`value`) {
      setTextureScale(value)
    }

  /**
   * The height of the light. Used with 2D normal mapping. The units are in pixels, e.g. if the
   * height is 100, then it will illuminate an object 100 pixels away at a 45° angle to the plane.
   */
  public final inline var height: Float
    @JvmName("heightProperty")
    get() = getHeight()
    @JvmName("heightProperty")
    set(`value`) {
      setHeight(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_POINTLIGHT2D, scriptIndex)
  }

  /**
   * The offset of the light's [texture].
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
   * val myCoreType = pointlight2d.offset
   * //Your changes
   * pointlight2d.offset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply{
      block(this)
      offset = this
  }


  public final fun setTexture(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
  }

  public final fun getTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setTextureOffset(textureOffset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to textureOffset)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextureOffsetPtr, NIL)
  }

  public final fun getTextureOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setTextureScale(textureScale: Float): Unit {
    TransferContext.writeArguments(DOUBLE to textureScale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setTextureScalePtr, NIL)
  }

  public final fun getTextureScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PointLight2D", "set_texture", 4051416890)

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PointLight2D", "get_texture", 3635182373)

    public val setTextureOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PointLight2D", "set_texture_offset", 743155724)

    public val getTextureOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PointLight2D", "get_texture_offset", 3341600327)

    public val setTextureScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PointLight2D", "set_texture_scale", 373806689)

    public val getTextureScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PointLight2D", "get_texture_scale", 1740695150)
  }
}
