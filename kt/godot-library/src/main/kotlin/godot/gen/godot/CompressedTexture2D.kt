// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * A texture that is loaded from a `.ctex` file. This file format is internal to Godot; it is
 * created by importing other image formats with the import system. [CompressedTexture2D] can use one
 * of 4 compression methods (including a lack of any compression):
 * - Lossless (WebP or PNG, uncompressed on the GPU)
 * - Lossy (WebP, uncompressed on the GPU)
 * - VRAM Compressed (compressed on the GPU)
 * - VRAM Uncompressed (uncompressed on the GPU)
 * - Basis Universal (compressed on the GPU. Lower file sizes than VRAM Compressed, but slower to
 * compress and lower quality than VRAM Compressed)
 * Only **VRAM Compressed** actually reduces the memory usage on the GPU. The **Lossless** and
 * **Lossy** compression methods will reduce the required storage on disk, but they will not reduce
 * memory usage on the GPU as the texture is sent to the GPU uncompressed.
 * Using **VRAM Compressed** also improves loading times, as VRAM-compressed textures are faster to
 * load compared to textures using lossless or lossy compression. VRAM compression can exhibit
 * noticeable artifacts and is intended to be used for 3D rendering, not 2D.
 */
@GodotBaseType
public open class CompressedTexture2D : Texture2D() {
  /**
   * The [CompressedTexture2D]'s file path to a `.ctex` file.
   */
  public val loadPath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLoadPathPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_COMPRESSEDTEXTURE2D, scriptIndex)
    return true
  }

  /**
   * Loads the texture from the specified [path].
   */
  public fun load(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.loadPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val loadPtr: VoidPtr = TypeManager.getMethodBindPtr("CompressedTexture2D", "load")

    public val getLoadPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompressedTexture2D", "get_load_path")
  }
}
