// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Error
import godot.core.VariantParser.LONG
import godot.core.VariantParser.STRING
import godot.getLoadPathPtr
import godot.loadPtr
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_COMPRESSEDTEXTURE3D: Int = 201

/**
 * [CompressedTexture3D] is the VRAM-compressed counterpart of [ImageTexture3D]. The file extension
 * for [CompressedTexture3D] files is `.ctex3d`. This file format is internal to Godot; it is created
 * by importing other image formats with the import system.
 * [CompressedTexture3D] uses VRAM compression, which allows to reduce memory usage on the GPU when
 * rendering the texture. This also improves loading times, as VRAM-compressed textures are faster to
 * load compared to textures using lossless compression. VRAM compression can exhibit noticeable
 * artifacts and is intended to be used for 3D rendering, not 2D.
 * See [Texture3D] for a general description of 3D textures.
 */
@GodotBaseType
public open class CompressedTexture3D : Texture3D() {
  /**
   * The [CompressedTexture3D]'s file path to a `.ctex3d` file.
   */
  public final inline val loadPath: String
    @JvmName("loadPathProperty")
    get() = getLoadPath()

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_COMPRESSEDTEXTURE3D, scriptIndex)
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

  public object MethodBindings {
    internal val loadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompressedTexture3D", "load", 166001499)

    internal val getLoadPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompressedTexture3D", "get_load_path", 201670096)
  }
}
