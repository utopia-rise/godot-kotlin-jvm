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
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_GLTFSPECGLOSS_INDEX: Int = 246

/**
 * KHR_materials_pbrSpecularGlossiness is an archived GLTF extension. This means that it is
 * deprecated and not recommended for new files. However, it is still supported for loading old files.
 */
@GodotBaseType
public open class GLTFSpecGloss : Resource() {
  /**
   * The diffuse texture.
   */
  public final inline var diffuseImg: Image?
    @JvmName("diffuseImgProperty")
    get() = getDiffuseImg()
    @JvmName("diffuseImgProperty")
    set(`value`) {
      setDiffuseImg(value)
    }

  /**
   * The reflected diffuse factor of the material.
   */
  @CoreTypeLocalCopy
  public final inline var diffuseFactor: Color
    @JvmName("diffuseFactorProperty")
    get() = getDiffuseFactor()
    @JvmName("diffuseFactorProperty")
    set(`value`) {
      setDiffuseFactor(value)
    }

  /**
   * The glossiness or smoothness of the material.
   */
  public final inline var glossFactor: Float
    @JvmName("glossFactorProperty")
    get() = getGlossFactor()
    @JvmName("glossFactorProperty")
    set(`value`) {
      setGlossFactor(value)
    }

  /**
   * The specular RGB color of the material. The alpha channel is unused.
   */
  @CoreTypeLocalCopy
  public final inline var specularFactor: Color
    @JvmName("specularFactorProperty")
    get() = getSpecularFactor()
    @JvmName("specularFactorProperty")
    set(`value`) {
      setSpecularFactor(value)
    }

  /**
   * The specular-glossiness texture.
   */
  public final inline var specGlossImg: Image?
    @JvmName("specGlossImgProperty")
    get() = getSpecGlossImg()
    @JvmName("specGlossImgProperty")
    set(`value`) {
      setSpecGlossImg(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_GLTFSPECGLOSS_INDEX, scriptIndex)
  }

  /**
   * The reflected diffuse factor of the material.
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
   * val myCoreType = gltfspecgloss.diffuseFactor
   * //Your changes
   * gltfspecgloss.diffuseFactor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun diffuseFactorMutate(block: Color.() -> Unit): Color = diffuseFactor.apply{
      block(this)
      diffuseFactor = this
  }


  /**
   * The specular RGB color of the material. The alpha channel is unused.
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
   * val myCoreType = gltfspecgloss.specularFactor
   * //Your changes
   * gltfspecgloss.specularFactor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun specularFactorMutate(block: Color.() -> Unit): Color = specularFactor.apply{
      block(this)
      specularFactor = this
  }


  public final fun getDiffuseImg(): Image? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDiffuseImgPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Image?)
  }

  public final fun setDiffuseImg(diffuseImg: Image?): Unit {
    Internals.writeArguments(OBJECT to diffuseImg)
    Internals.callMethod(rawPtr, MethodBindings.setDiffuseImgPtr, NIL)
  }

  public final fun getDiffuseFactor(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDiffuseFactorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setDiffuseFactor(diffuseFactor: Color): Unit {
    Internals.writeArguments(COLOR to diffuseFactor)
    Internals.callMethod(rawPtr, MethodBindings.setDiffuseFactorPtr, NIL)
  }

  public final fun getGlossFactor(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGlossFactorPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGlossFactor(glossFactor: Float): Unit {
    Internals.writeArguments(DOUBLE to glossFactor.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setGlossFactorPtr, NIL)
  }

  public final fun getSpecularFactor(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSpecularFactorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setSpecularFactor(specularFactor: Color): Unit {
    Internals.writeArguments(COLOR to specularFactor)
    Internals.callMethod(rawPtr, MethodBindings.setSpecularFactorPtr, NIL)
  }

  public final fun getSpecGlossImg(): Image? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSpecGlossImgPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Image?)
  }

  public final fun setSpecGlossImg(specGlossImg: Image?): Unit {
    Internals.writeArguments(OBJECT to specGlossImg)
    Internals.callMethod(rawPtr, MethodBindings.setSpecGlossImgPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val getDiffuseImgPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSpecGloss", "get_diffuse_img", 564927088)

    public val setDiffuseImgPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSpecGloss", "set_diffuse_img", 532598488)

    public val getDiffuseFactorPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSpecGloss", "get_diffuse_factor", 3200896285)

    public val setDiffuseFactorPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSpecGloss", "set_diffuse_factor", 2920490490)

    public val getGlossFactorPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSpecGloss", "get_gloss_factor", 191475506)

    public val setGlossFactorPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSpecGloss", "set_gloss_factor", 373806689)

    public val getSpecularFactorPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSpecGloss", "get_specular_factor", 3200896285)

    public val setSpecularFactorPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSpecGloss", "set_specular_factor", 2920490490)

    public val getSpecGlossImgPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSpecGloss", "get_spec_gloss_img", 564927088)

    public val setSpecGlossImgPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSpecGloss", "set_spec_gloss_img", 532598488)
  }
}
