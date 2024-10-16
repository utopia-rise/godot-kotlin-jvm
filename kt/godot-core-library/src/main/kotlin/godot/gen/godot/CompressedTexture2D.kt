// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.LONG
import godot.core.VariantParser.STRING
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline val loadPath: String
    @JvmName("loadPathProperty")
    get() = getLoadPath()

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_COMPRESSEDTEXTURE2D, scriptIndex)
  }

  /**
   * Loads the texture from the specified [path].
   */
  public final fun load(path: String): Error {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.loadPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun getLoadPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLoadPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public companion object

  internal object MethodBindings {
    public val loadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompressedTexture2D", "load", 166001499)

    public val getLoadPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompressedTexture2D", "get_load_path", 201670096)
  }
}
