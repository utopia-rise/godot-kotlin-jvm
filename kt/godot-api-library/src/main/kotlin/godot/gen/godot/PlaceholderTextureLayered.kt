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
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This class is used when loading a project that uses a [TextureLayered] subclass in 2 conditions:
 * - When running the project exported in dedicated server mode, only the texture's dimensions are
 * kept (as they may be relied upon for gameplay purposes or positioning of other elements). This
 * allows reducing the exported PCK's size significantly.
 * - When this subclass is missing due to using a different engine version or build (e.g. modules
 * disabled).
 * **Note:** This is not intended to be used as an actual texture for rendering. It is not
 * guaranteed to work like one in shaders or materials (for example when calculating UV).
 */
@GodotBaseType
public open class PlaceholderTextureLayered internal constructor() : TextureLayered() {
  /**
   * The size of each texture layer (in pixels).
   */
  @CoreTypeLocalCopy
  public final inline var size: Vector2i
    @JvmName("sizeProperty")
    get() = getSize()
    @JvmName("sizeProperty")
    set(`value`) {
      setSize(value)
    }

  /**
   * The number of layers in the texture array.
   */
  public final inline var layers: Int
    @JvmName("layersProperty")
    get() = getLayers()
    @JvmName("layersProperty")
    set(`value`) {
      setLayers(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_PLACEHOLDERTEXTURELAYERED_INDEX, scriptIndex)
  }

  /**
   * The size of each texture layer (in pixels).
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
   * val myCoreType = placeholdertexturelayered.size
   * //Your changes
   * placeholdertexturelayered.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun sizeMutate(block: Vector2i.() -> Unit): Vector2i = size.apply{
      block(this)
      size = this
  }


  public final fun setSize(size: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
  }

  public final fun getSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  public final fun setLayers(layers: Int): Unit {
    TransferContext.writeArguments(LONG to layers.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setLayersPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaceholderTextureLayered", "set_size", 1130785943)

    public val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaceholderTextureLayered", "get_size", 3690982128)

    public val setLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaceholderTextureLayered", "set_layers", 1286410249)
  }
}
