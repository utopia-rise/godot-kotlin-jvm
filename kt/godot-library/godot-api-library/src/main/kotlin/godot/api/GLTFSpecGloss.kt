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
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * KHR_materials_pbrSpecularGlossiness is an archived glTF extension. This means that it is
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
    createNativeObject(239, scriptIndex)
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
    TransferContext.callMethod(ptr, MethodBindings.getDiffuseImgPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Image?)
  }

  public final fun setDiffuseImg(diffuseImg: Image?): Unit {
    TransferContext.writeArguments(OBJECT to diffuseImg)
    TransferContext.callMethod(ptr, MethodBindings.setDiffuseImgPtr, NIL)
  }

  public final fun getDiffuseFactor(): Color {
    TransferContext.callMethod(ptr, MethodBindings.getDiffuseFactorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setDiffuseFactor(diffuseFactor: Color): Unit {
    TransferContext.writeArguments(COLOR to diffuseFactor)
    TransferContext.callMethod(ptr, MethodBindings.setDiffuseFactorPtr, NIL)
  }

  public final fun getGlossFactor(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getGlossFactorPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGlossFactor(glossFactor: Float): Unit {
    TransferContext.writeArguments(DOUBLE to glossFactor.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setGlossFactorPtr, NIL)
  }

  public final fun getSpecularFactor(): Color {
    TransferContext.callMethod(ptr, MethodBindings.getSpecularFactorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setSpecularFactor(specularFactor: Color): Unit {
    TransferContext.writeArguments(COLOR to specularFactor)
    TransferContext.callMethod(ptr, MethodBindings.setSpecularFactorPtr, NIL)
  }

  public final fun getSpecGlossImg(): Image? {
    TransferContext.callMethod(ptr, MethodBindings.getSpecGlossImgPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Image?)
  }

  public final fun setSpecGlossImg(specGlossImg: Image?): Unit {
    TransferContext.writeArguments(OBJECT to specGlossImg)
    TransferContext.callMethod(ptr, MethodBindings.setSpecGlossImgPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val getDiffuseImgPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSpecGloss", "get_diffuse_img", 564927088)

    internal val setDiffuseImgPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSpecGloss", "set_diffuse_img", 532598488)

    internal val getDiffuseFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSpecGloss", "get_diffuse_factor", 3200896285)

    internal val setDiffuseFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSpecGloss", "set_diffuse_factor", 2920490490)

    internal val getGlossFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSpecGloss", "get_gloss_factor", 191475506)

    internal val setGlossFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSpecGloss", "set_gloss_factor", 373806689)

    internal val getSpecularFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSpecGloss", "get_specular_factor", 3200896285)

    internal val setSpecularFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSpecGloss", "set_specular_factor", 2920490490)

    internal val getSpecGlossImgPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSpecGloss", "get_spec_gloss_img", 564927088)

    internal val setSpecGlossImgPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSpecGloss", "set_spec_gloss_img", 532598488)
  }
}
