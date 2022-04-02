// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.Image
import godot.PortableCompressedTexture2D
import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Provides a compressed texture for disk and/or VRAM in a way that is portable.
 *
 * This class allows storing compressed textures as self contained (not imported) resources.
 *
 * For 2D usage (compressed on disk, uncompressed on VRAM), the lossy and lossless modes are recommended. For 3D usage (compressed on VRAM) it depends on the target platform.
 *
 * If you intend to only use desktop, S3TC or BPTC are recommended. For only mobile, ETC2 is recommended.
 *
 * For portable, self contained 3D textures that work on both desktop and mobile, Basis Universal is recommended (although it has a small quality cost and longer compression time as a tradeoff).
 *
 * This resource is intended to be created from code.
 */
@GodotBaseType
public open class PortableCompressedTexture2D : Texture2D() {
  /**
   * Allow overriding the texture size (for 2D only).
   */
  public open var sizeOverride: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PORTABLECOMPRESSEDTEXTURE2D_GET_SIZE_OVERRIDE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PORTABLECOMPRESSEDTEXTURE2D_SET_SIZE_OVERRIDE, NIL)
    }

  /**
   * When running on the editor, this class will keep the source compressed data in memory. Otherwise, the source compressed data is lost after loading and the resource can't be re saved.
   *
   * This flag allows to keep the compressed data in memory if you intend it to persist after loading.
   */
  public open var keepCompressedBuffer: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PORTABLECOMPRESSEDTEXTURE2D_IS_KEEPING_COMPRESSED_BUFFER, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PORTABLECOMPRESSEDTEXTURE2D_SET_KEEP_COMPRESSED_BUFFER, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PORTABLECOMPRESSEDTEXTURE2D)
  }

  /**
   * Initializes the compressed texture from a base image. The compression mode must be provided.
   *
   * If this image will be used as a normal map, the "normal map" flag is recommended, to ensure optimum quality.
   *
   * If lossy compression is requested, the quality setting can optionally be provided. This maps to Lossy WEBP compression quality.
   */
  public open fun createFromImage(
    image: Image,
    compressionMode: PortableCompressedTexture2D.CompressionMode,
    normalMap: Boolean = false,
    lossyQuality: Double = 0.8
  ): Unit {
    TransferContext.writeArguments(OBJECT to image, LONG to compressionMode.id, BOOL to normalMap, DOUBLE to lossyQuality)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PORTABLECOMPRESSEDTEXTURE2D_CREATE_FROM_IMAGE, NIL)
  }

  /**
   * Return the image format used (valid after initialized).
   */
  public open fun getFormat(): Image.Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PORTABLECOMPRESSEDTEXTURE2D_GET_FORMAT, LONG)
    return Image.Format.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Return the compression mode used (valid after initialized).
   */
  public open fun getCompressionMode(): PortableCompressedTexture2D.CompressionMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PORTABLECOMPRESSEDTEXTURE2D_GET_COMPRESSION_MODE, LONG)
    return PortableCompressedTexture2D.CompressionMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public enum class CompressionMode(
    id: Long
  ) {
    /**
     *
     */
    COMPRESSION_MODE_LOSSLESS(0),
    /**
     *
     */
    COMPRESSION_MODE_LOSSY(1),
    /**
     *
     */
    COMPRESSION_MODE_BASIS_UNIVERSAL(2),
    /**
     *
     */
    COMPRESSION_MODE_S3TC(3),
    /**
     *
     */
    COMPRESSION_MODE_ETC2(4),
    /**
     *
     */
    COMPRESSION_MODE_BPTC(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
