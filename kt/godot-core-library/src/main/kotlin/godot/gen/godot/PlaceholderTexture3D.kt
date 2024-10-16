// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR3I
import godot.core.Vector3i
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This class is used when loading a project that uses a [Texture3D] subclass in 2 conditions:
 * - When running the project exported in dedicated server mode, only the texture's dimensions are
 * kept (as they may be relied upon for gameplay purposes or positioning of other elements). This
 * allows reducing the exported PCK's size significantly.
 * - When this subclass is missing due to using a different engine version or build (e.g. modules
 * disabled).
 * **Note:** This is not intended to be used as an actual texture for rendering. It is not
 * guaranteed to work like one in shaders or materials (for example when calculating UV).
 */
@GodotBaseType
public open class PlaceholderTexture3D : Texture3D() {
  /**
   * The texture's size (in pixels).
   */
  @CoreTypeLocalCopy
  public final inline var size: Vector3i
    @JvmName("sizeProperty")
    get() = getSize()
    @JvmName("sizeProperty")
    set(`value`) {
      setSize(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_PLACEHOLDERTEXTURE3D, scriptIndex)
  }

  /**
   * The texture's size (in pixels).
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
   * val myCoreType = placeholdertexture3d.size
   * //Your changes
   * placeholdertexture3d.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun sizeMutate(block: Vector3i.() -> Unit): Vector3i = size.apply{
      block(this)
      size = this
  }


  public final fun setSize(size: Vector3i): Unit {
    TransferContext.writeArguments(VECTOR3I to size)
    TransferContext.callMethod(ptr, MethodBindings.setSizePtr, NIL)
  }

  public final fun getSize(): Vector3i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSizePtr, VECTOR3I)
    return (TransferContext.readReturnValue(VECTOR3I) as Vector3i)
  }

  public companion object

  internal object MethodBindings {
    public val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaceholderTexture3D", "set_size", 560364750)

    public val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaceholderTexture3D", "get_size", 2785653706)
  }
}
