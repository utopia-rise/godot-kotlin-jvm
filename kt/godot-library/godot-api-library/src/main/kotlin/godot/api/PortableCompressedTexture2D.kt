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
import godot.core.MethodStringName0
import godot.core.MethodStringName1
import godot.core.MethodStringName4
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
import kotlin.jvm.JvmField
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * This class allows storing compressed textures as self contained (not imported) resources.
 *
 * For 2D usage (compressed on disk, uncompressed on VRAM), the lossy and lossless modes are
 * recommended. For 3D usage (compressed on VRAM) it depends on the target platform.
 *
 * If you intend to only use desktop, S3TC or BPTC are recommended. For only mobile, ETC2 is
 * recommended.
 *
 * For portable, self contained 3D textures that work on both desktop and mobile, Basis Universal is
 * recommended (although it has a small quality cost and longer compression time as a tradeoff).
 *
 * This resource is intended to be created from code.
 */
@GodotBaseType
public open class PortableCompressedTexture2D : Texture2D() {
  /**
   * Allow overriding the texture size (for 2D only).
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
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
   *
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
    createNativeObject(504, scriptIndex)
  }

  /**
   * This is a helper function for [sizeOverride] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = portablecompressedtexture2d.sizeOverride
   * //Your changes
   * portablecompressedtexture2d.sizeOverride = myCoreType
   * ``````
   *
   * Allow overriding the texture size (for 2D only).
   */
  @CoreTypeHelper
  public final fun sizeOverrideMutate(block: Vector2.() -> Unit): Vector2 = sizeOverride.apply {
     block(this)
     sizeOverride = this
  }

  /**
   * Initializes the compressed texture from a base image. The compression mode must be provided.
   *
   * [normalMap] is recommended to ensure optimum quality if this image will be used as a normal
   * map.
   *
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
    return CompressionMode.from(TransferContext.readReturnValue(LONG) as Long)
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
    LOSSLESS(0),
    LOSSY(1),
    BASIS_UNIVERSAL(2),
    S3TC(3),
    ETC2(4),
    BPTC(5),
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
    @JvmField
    public val createFromImageName:
        MethodStringName4<PortableCompressedTexture2D, Unit, Image?, CompressionMode, Boolean, Float>
        =
        MethodStringName4<PortableCompressedTexture2D, Unit, Image?, CompressionMode, Boolean, Float>("create_from_image")

    @JvmField
    public val getFormatName: MethodStringName0<PortableCompressedTexture2D, Image.Format> =
        MethodStringName0<PortableCompressedTexture2D, Image.Format>("get_format")

    @JvmField
    public val getCompressionModeName:
        MethodStringName0<PortableCompressedTexture2D, CompressionMode> =
        MethodStringName0<PortableCompressedTexture2D, CompressionMode>("get_compression_mode")

    @JvmField
    public val setSizeOverrideName: MethodStringName1<PortableCompressedTexture2D, Unit, Vector2> =
        MethodStringName1<PortableCompressedTexture2D, Unit, Vector2>("set_size_override")

    @JvmField
    public val getSizeOverrideName: MethodStringName0<PortableCompressedTexture2D, Vector2> =
        MethodStringName0<PortableCompressedTexture2D, Vector2>("get_size_override")

    @JvmField
    public val setKeepCompressedBufferName:
        MethodStringName1<PortableCompressedTexture2D, Unit, Boolean> =
        MethodStringName1<PortableCompressedTexture2D, Unit, Boolean>("set_keep_compressed_buffer")

    @JvmField
    public val isKeepingCompressedBufferName:
        MethodStringName0<PortableCompressedTexture2D, Boolean> =
        MethodStringName0<PortableCompressedTexture2D, Boolean>("is_keeping_compressed_buffer")

    @JvmField
    public val setKeepAllCompressedBuffersName:
        MethodStringName1<PortableCompressedTexture2D, Unit, Boolean> =
        MethodStringName1<PortableCompressedTexture2D, Unit, Boolean>("set_keep_all_compressed_buffers")

    @JvmField
    public val isKeepingAllCompressedBuffersName:
        MethodStringName0<PortableCompressedTexture2D, Boolean> =
        MethodStringName0<PortableCompressedTexture2D, Boolean>("is_keeping_all_compressed_buffers")

    /**
     * Overrides the flag globally for all textures of this type. This is used primarily by the
     * editor.
     */
    @JvmStatic
    public final fun setKeepAllCompressedBuffers(keep: Boolean): Unit {
      TransferContext.writeArguments(BOOL to keep)
      TransferContext.callMethod(0, MethodBindings.setKeepAllCompressedBuffersPtr, NIL)
    }

    /**
     * Return whether the flag is overridden for all textures of this type.
     */
    @JvmStatic
    public final fun isKeepingAllCompressedBuffers(): Boolean {
      TransferContext.writeArguments()
      TransferContext.callMethod(0, MethodBindings.isKeepingAllCompressedBuffersPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL) as Boolean)
    }
  }

  public object MethodBindings {
    internal val createFromImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "create_from_image", 3679243433)

    internal val getFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "get_format", 3847873762)

    internal val getCompressionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "get_compression_mode", 3265612739)

    internal val setSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "set_size_override", 743155724)

    internal val getSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "get_size_override", 3341600327)

    internal val setKeepCompressedBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "set_keep_compressed_buffer", 2586408642)

    internal val isKeepingCompressedBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "is_keeping_compressed_buffer", 36873697)

    internal val setKeepAllCompressedBuffersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "set_keep_all_compressed_buffers", 2586408642)

    internal val isKeepingAllCompressedBuffersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PortableCompressedTexture2D", "is_keeping_all_compressed_buffers", 2240911060)
  }
}
