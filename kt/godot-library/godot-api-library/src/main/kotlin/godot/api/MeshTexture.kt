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
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Simple texture that uses a mesh to draw itself. It's limited because flags can't be changed and
 * region drawing is not supported.
 */
@GodotBaseType
public open class MeshTexture : Texture2D() {
  /**
   * Sets the mesh used to draw. It must be a mesh using 2D vertices.
   */
  public final inline var mesh: Mesh?
    @JvmName("meshProperty")
    get() = getMesh()
    @JvmName("meshProperty")
    set(`value`) {
      setMesh(value)
    }

  /**
   * Sets the base texture that the Mesh will use to draw.
   */
  public final inline var baseTexture: Texture2D?
    @JvmName("baseTextureProperty")
    get() = getBaseTexture()
    @JvmName("baseTextureProperty")
    set(`value`) {
      setBaseTexture(value)
    }

  /**
   * Sets the size of the image, needed for reference.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var imageSize: Vector2
    @JvmName("imageSizeProperty")
    get() = getImageSize()
    @JvmName("imageSizeProperty")
    set(`value`) {
      setImageSize(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(357, scriptIndex)
  }

  /**
   * This is a helper function for [imageSize] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = meshtexture.imageSize
   * //Your changes
   * meshtexture.imageSize = myCoreType
   * ``````
   *
   * Sets the size of the image, needed for reference.
   */
  @CoreTypeHelper
  public final fun imageSizeMutate(block: Vector2.() -> Unit): Vector2 = imageSize.apply {
     block(this)
     imageSize = this
  }

  public final fun setMesh(mesh: Mesh?): Unit {
    TransferContext.writeArguments(OBJECT to mesh)
    TransferContext.callMethod(ptr, MethodBindings.setMeshPtr, NIL)
  }

  public final fun getMesh(): Mesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Mesh?)
  }

  public final fun setImageSize(size: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to size)
    TransferContext.callMethod(ptr, MethodBindings.setImageSizePtr, NIL)
  }

  public final fun getImageSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getImageSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setBaseTexture(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setBaseTexturePtr, NIL)
  }

  public final fun getBaseTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBaseTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public companion object

  public object MethodBindings {
    internal val setMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshTexture", "set_mesh", 194775623)

    internal val getMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshTexture", "get_mesh", 1808005922)

    internal val setImageSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshTexture", "set_image_size", 743155724)

    internal val getImageSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshTexture", "get_image_size", 3341600327)

    internal val setBaseTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshTexture", "set_base_texture", 4051416890)

    internal val getBaseTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshTexture", "get_base_texture", 3635182373)
  }
}
