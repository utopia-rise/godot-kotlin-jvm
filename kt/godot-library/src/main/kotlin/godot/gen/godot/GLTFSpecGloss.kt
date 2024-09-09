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
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * KHR_materials_pbrSpecularGlossiness is an archived GLTF extension. This means that it is
 * deprecated and not recommended for new files. However, it is still supported for loading old files.
 */
@GodotBaseType
public open class GLTFSpecGloss : Resource() {
  /**
   * The diffuse texture.
   */
  public var diffuseImg: Image?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDiffuseImgPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Image?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDiffuseImgPtr, NIL)
    }

  /**
   * The reflected diffuse factor of the material.
   */
  @CoreTypeLocalCopy
  public var diffuseFactor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDiffuseFactorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDiffuseFactorPtr, NIL)
    }

  /**
   * The glossiness or smoothness of the material.
   */
  public var glossFactor: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlossFactorPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlossFactorPtr, NIL)
    }

  /**
   * The specular RGB color of the material. The alpha channel is unused.
   */
  @CoreTypeLocalCopy
  public var specularFactor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpecularFactorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSpecularFactorPtr, NIL)
    }

  /**
   * The specular-glossiness texture.
   */
  public var specGlossImg: Image?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpecGlossImgPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Image?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSpecGlossImgPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_GLTFSPECGLOSS, scriptIndex)
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
  public open fun diffuseFactorMutate(block: Color.() -> Unit): Color = diffuseFactor.apply{
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
  public open fun specularFactorMutate(block: Color.() -> Unit): Color = specularFactor.apply{
      block(this)
      specularFactor = this
  }


  public companion object

  internal object MethodBindings {
    public val getDiffuseImgPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSpecGloss", "get_diffuse_img", 564927088)

    public val setDiffuseImgPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSpecGloss", "set_diffuse_img", 532598488)

    public val getDiffuseFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSpecGloss", "get_diffuse_factor", 3200896285)

    public val setDiffuseFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSpecGloss", "set_diffuse_factor", 2920490490)

    public val getGlossFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSpecGloss", "get_gloss_factor", 191475506)

    public val setGlossFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSpecGloss", "set_gloss_factor", 373806689)

    public val getSpecularFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSpecGloss", "get_specular_factor", 3200896285)

    public val setSpecularFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSpecGloss", "set_specular_factor", 2920490490)

    public val getSpecGlossImgPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSpecGloss", "get_spec_gloss_img", 564927088)

    public val setSpecGlossImgPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSpecGloss", "set_spec_gloss_img", 532598488)
  }
}
