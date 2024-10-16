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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * This class allows storing compressed textures as self contained (not imported) resources.
 * For 2D usage (compressed on disk, uncompressed on VRAM), the lossy and lossless modes are
 * recommended. For 3D usage (compressed on VRAM) it depends on the target platform.
 * If you intend to only use desktop, S3TC or BPTC are recommended. For only mobile, ETC2 is
 * recommended.
 * For portable, self contained 3D textures that work on both desktop and mobile, Basis Universal is
 * recommended (although it has a small quality cost and longer compression time as a tradeoff).
 * This resource is intended to be created from code.
 */
@GodotBaseType
public open class PortableCompressedTexture2D : Texture2D() {
  /**
   * Allow overriding the texture size (for 2D only).
   */
  @CoreTypeLocalCopy
  public final inline var sizeOverride: Vector2
    @JvmName("sizeOverrideProperty")
    get() = getSizeOverride()
    @JvmName("sizeOverrideProperty")
    set(`value`) {
      setSizeOverride(value)
    }

  /**
   * When running on the editor, this class will keep the source compressed data in memory.
   * Otherwise, the source compressed data is lost after loading and the resource can't be re saved.
   * This flag allows to keep the compressed data in memory if you intend it to persist after
   * loading.
   */
  public final inline var keepCompressedBuffer: Boolean
    @JvmName("keepCompressedBufferProperty")
    get() = isKeepingCompressedBuffer()
    @JvmName("keepCompressedBufferProperty")
    set(`value`) {
      setKeepCompressedBuffer(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_PORTABLECOMPRESSEDTEXTURE2D, scriptIndex)
  }

  /**
   * Allow overriding the texture size (for 2D only).
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
   * val myCoreType = portablecompressedtexture2d.sizeOverride
   * //Your changes
   * portablecompressedtexture2d.sizeOverride = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun sizeOverrideMutate(block: Vector2.() -> Unit): Vector2 = sizeOverride.apply{
      block(this)
      sizeOverride = this
  }


  /**
   * Initializes the compressed texture from a base image. The compression mode must be provided.
   * [normalMap] is recommended to ensure optimum quality if this image will be used as a normal
   * map.
   * If lossy compression is requested, the quality setting can optionally be provided. This maps to
   * Lossy WebP compression quality.
   */
  @JvmOverloads
  public final fun createFromImage(
    image: Image?,
    compressionMode: CompressionMode,
    normalMap: Boolean = false,
    lossyQuality: Float = 0.8f,
  ): Unit {
    TransferContext.writeArguments(OBJECT to image, LONG to compressionMode.id, BOOL to normalMap, DOUBLE to lossyQuality.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.createFromImagePtr, NIL)
  }

  /**
   * Return the image format used (valid after initialized).
   */
  public final fun getFormat(): Image.Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFormatPtr, LONG)
    return Image.Format.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Return the compression mode used (valid after initialized).
   */
  public final fun getCompressionMode(): CompressionMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCompressionModePtr, LONG)
    return PortableCompressedTexture2D.CompressionMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSizeOverride(size: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to size)
    TransferContext.callMethod(ptr, MethodBindings.setSizeOverridePtr, NIL)
  }

  public final fun getSizeOverride(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSizeOverridePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setKeepCompressedBuffer(keep: Boolean): Unit {
    TransferContext.writeArguments(BOOL to keep)
    TransferContext.callMethod(ptr, MethodBindings.setKeepCompressedBufferPtr, NIL)
  }

  public final fun isKeepingCompressedBuffer(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isKeepingCompressedBufferPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public enum class CompressionMode(
    id: Long,
  ) {
    COMPRESSION_MODE_LOSSLESS(0),
    COMPRESSION_MODE_LOSSY(1),
    COMPRESSION_MODE_BASIS_UNIVERSAL(2),
    COMPRESSION_MODE_S3TC(3),
    COMPRESSION_MODE_ETC2(4),
    COMPRESSION_MODE_BPTC(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CompressionMode = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Overrides the flag globally for all textures of this type. This is used primarily by the
     * editor.
     */
    public final fun setKeepAllCompressedBuffers(keep: Boolean): Unit {
      TransferContext.writeArguments(BOOL to keep)
      TransferContext.callMethod(0, MethodBindings.setKeepAllCompressedBuffersPtr, NIL)
    }

    /**
     * Return whether the flag is overridden for all textures of this type.
     */
    public final fun isKeepingAllCompressedBuffers(): Boolean {
      TransferContext.writeArguments()
      TransferContext.callMethod(0, MethodBindings.isKeepingAllCompressedBuffersPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL) as Boolean)
    }
  }

  internal object MethodBindings {
    public val createFromImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "create_from_image", 3679243433)

    public val getFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "get_format", 3847873762)

    public val getCompressionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "get_compression_mode", 3265612739)

    public val setSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "set_size_override", 743155724)

    public val getSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "get_size_override", 3341600327)

    public val setKeepCompressedBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "set_keep_compressed_buffer", 2586408642)

    public val isKeepingCompressedBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "is_keeping_compressed_buffer", 36873697)

    public val setKeepAllCompressedBuffersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "set_keep_all_compressed_buffers", 2586408642)

    public val isKeepingAllCompressedBuffersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "is_keeping_all_compressed_buffers", 2240911060)
  }
}
