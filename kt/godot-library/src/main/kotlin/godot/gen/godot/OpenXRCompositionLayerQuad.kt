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
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * An OpenXR composition layer that allows rendering a [SubViewport] on a quad.
 */
@GodotBaseType
public open class OpenXRCompositionLayerQuad : OpenXRCompositionLayer() {
  /**
   * The dimensions of the quad.
   */
  @CoreTypeLocalCopy
  public var quadSize: Vector2
    @JvmName("quadSizeProperty")
    get() = getQuadSize()
    @JvmName("quadSizeProperty")
    set(`value`) {
      setQuadSize(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_OPENXRCOMPOSITIONLAYERQUAD, scriptIndex)
  }

  /**
   * The dimensions of the quad.
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
   * val myCoreType = openxrcompositionlayerquad.quadSize
   * //Your changes
   * openxrcompositionlayerquad.quadSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun quadSizeMutate(block: Vector2.() -> Unit): Vector2 = quadSize.apply{
      block(this)
      quadSize = this
  }


  public fun setQuadSize(size: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to size)
    TransferContext.callMethod(rawPtr, MethodBindings.setQuadSizePtr, NIL)
  }

  public fun getQuadSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getQuadSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public companion object

  internal object MethodBindings {
    public val setQuadSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerQuad", "set_quad_size", 743155724)

    public val getQuadSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerQuad", "get_quad_size", 3341600327)
  }
}
