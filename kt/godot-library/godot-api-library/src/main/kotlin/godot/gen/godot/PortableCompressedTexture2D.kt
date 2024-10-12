// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_PORTABLECOMPRESSEDTEXTURE2D_INDEX: Int = 501

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
    Internals.callConstructor(this, ENGINE_CLASS_PORTABLECOMPRESSEDTEXTURE2D_INDEX, scriptIndex)
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
    Internals.writeArguments(OBJECT to image, LONG to compressionMode.id, BOOL to normalMap, DOUBLE to lossyQuality.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.createFromImagePtr, NIL)
  }

  /**
   * Return the image format used (valid after initialized).
   */
  public final fun getFormat(): Image.Format {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFormatPtr, LONG)
    return Image.Format.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Return the compression mode used (valid after initialized).
   */
  public final fun getCompressionMode(): CompressionMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCompressionModePtr, LONG)
    return PortableCompressedTexture2D.CompressionMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setSizeOverride(size: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to size)
    Internals.callMethod(rawPtr, MethodBindings.setSizeOverridePtr, NIL)
  }

  public final fun getSizeOverride(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSizeOverridePtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setKeepCompressedBuffer(keep: Boolean): Unit {
    Internals.writeArguments(BOOL to keep)
    Internals.callMethod(rawPtr, MethodBindings.setKeepCompressedBufferPtr, NIL)
  }

  public final fun isKeepingCompressedBuffer(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isKeepingCompressedBufferPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
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
      Internals.writeArguments(BOOL to keep)
      Internals.callMethod(0, MethodBindings.setKeepAllCompressedBuffersPtr, NIL)
    }

    /**
     * Return whether the flag is overridden for all textures of this type.
     */
    public final fun isKeepingAllCompressedBuffers(): Boolean {
      Internals.writeArguments()
      Internals.callMethod(0, MethodBindings.isKeepingAllCompressedBuffersPtr, BOOL)
      return (Internals.readReturnValue(BOOL) as Boolean)
    }
  }

  public object MethodBindings {
    internal val createFromImagePtr: VoidPtr =
        Internals.getMethodBindPtr("PortableCompressedTexture2D", "create_from_image", 3679243433)

    internal val getFormatPtr: VoidPtr =
        Internals.getMethodBindPtr("PortableCompressedTexture2D", "get_format", 3847873762)

    internal val getCompressionModePtr: VoidPtr =
        Internals.getMethodBindPtr("PortableCompressedTexture2D", "get_compression_mode", 3265612739)

    internal val setSizeOverridePtr: VoidPtr =
        Internals.getMethodBindPtr("PortableCompressedTexture2D", "set_size_override", 743155724)

    internal val getSizeOverridePtr: VoidPtr =
        Internals.getMethodBindPtr("PortableCompressedTexture2D", "get_size_override", 3341600327)

    internal val setKeepCompressedBufferPtr: VoidPtr =
        Internals.getMethodBindPtr("PortableCompressedTexture2D", "set_keep_compressed_buffer", 2586408642)

    internal val isKeepingCompressedBufferPtr: VoidPtr =
        Internals.getMethodBindPtr("PortableCompressedTexture2D", "is_keeping_compressed_buffer", 36873697)

    internal val setKeepAllCompressedBuffersPtr: VoidPtr =
        Internals.getMethodBindPtr("PortableCompressedTexture2D", "set_keep_all_compressed_buffers", 2586408642)

    internal val isKeepingAllCompressedBuffersPtr: VoidPtr =
        Internals.getMethodBindPtr("PortableCompressedTexture2D", "is_keeping_all_compressed_buffers", 2240911060)
  }
}
