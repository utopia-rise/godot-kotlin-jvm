// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for texture arrays that can optionally be compressed.
 *
 * A texture array that is loaded from a `.ctexarray` file. This file format is internal to Godot; it is created by importing other image formats with the import system. [godot.CompressedTexture2D] can use one of 4 compresson methods:
 *
 * - Uncompressed (uncompressed on the GPU)
 *
 * - Lossless (WebP or PNG, uncompressed on the GPU)
 *
 * - Lossy (WebP, uncompressed on the GPU)
 *
 * - VRAM Compressed (compressed on the GPU)
 *
 * Only **VRAM Compressed** actually reduces the memory usage on the GPU. The **Lossless** and **Lossy** compression methods will reduce the required storage on disk, but they will not reduce memory usage on the GPU as the texture is sent to the GPU uncompressed.
 *
 * Using **VRAM Compressed** also improves loading times, as VRAM-compressed textures are faster to load compared to textures using lossless or lossy compression. VRAM compression can exhibit noticeable artifacts and is intended to be used for 3D rendering, not 2D.
 */
@GodotBaseType
public open class CompressedTextureLayered internal constructor() : TextureLayered() {
  /**
   * The path the texture should be loaded from.
   */
  public val loadPath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COMPRESSEDTEXTURELAYERED_GET_LOAD_PATH, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_COMPRESSEDTEXTURELAYERED)
  }

  /**
   * Loads the texture at [path].
   */
  public fun load(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COMPRESSEDTEXTURELAYERED_LOAD, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public companion object
}
