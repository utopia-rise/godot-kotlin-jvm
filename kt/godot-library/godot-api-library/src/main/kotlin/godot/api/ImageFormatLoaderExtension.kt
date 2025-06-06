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
import godot.core.PackedStringArray
import godot.core.VariantParser.NIL
import kotlin.Float
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * The engine supports multiple image formats out of the box (PNG, SVG, JPEG, WebP to name a few),
 * but you can choose to implement support for additional image formats by extending this class.
 *
 * Be sure to respect the documented return types and values. You should create an instance of it,
 * and call [addFormatLoader] to register that loader during the initialization phase.
 */
@GodotBaseType
public open class ImageFormatLoaderExtension : ImageFormatLoader() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(284, scriptIndex)
  }

  /**
   * Returns the list of file extensions for this image format. Files with the given extensions will
   * be treated as image file and loaded using this class.
   */
  public open fun _getRecognizedExtensions(): PackedStringArray {
    throw NotImplementedError("_getRecognizedExtensions is not implemented for ImageFormatLoaderExtension")
  }

  /**
   * Loads the content of [fileaccess] into the provided [image].
   */
  public open fun _loadImage(
    image: Image?,
    fileaccess: FileAccess?,
    flags: ImageFormatLoader.LoaderFlags,
    scale: Float,
  ): Error {
    throw NotImplementedError("_loadImage is not implemented for ImageFormatLoaderExtension")
  }

  /**
   * Add this format loader to the engine, allowing it to recognize the file extensions returned by
   * [_getRecognizedExtensions].
   */
  public final fun addFormatLoader(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.addFormatLoaderPtr, NIL)
  }

  /**
   * Remove this format loader from the engine.
   */
  public final fun removeFormatLoader(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.removeFormatLoaderPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val addFormatLoaderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImageFormatLoaderExtension", "add_format_loader", 3218959716)

    internal val removeFormatLoaderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImageFormatLoaderExtension", "remove_format_loader", 3218959716)
  }
}
