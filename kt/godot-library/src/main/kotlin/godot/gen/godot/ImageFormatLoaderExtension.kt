// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for creating [godot.ImageFormatLoader] extensions (adding support for extra image formats).
 *
 * The engine supports multiple image formats out of the box (PNG, SVG, JPEG, WebP to name a few), but you can choose to implement support for additional image formats by extending this class.
 *
 * Be sure to respect the documented return types and values. You should create an instance of it, and call [addFormatLoader] to register that loader during the initialization phase.
 */
@GodotBaseType
public open class ImageFormatLoaderExtension : ImageFormatLoader() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_IMAGEFORMATLOADEREXTENSION, scriptIndex)
    return true
  }

  /**
   * Returns the list of file extensions for this image format. Files with the given extensions will be treated as image file and loaded using this class.
   */
  public open fun _getRecognizedExtensions(): PackedStringArray {
    throw NotImplementedError("_get_recognized_extensions is not implemented for ImageFormatLoaderExtension")
  }

  /**
   * Loads the content of [fileaccess] into the provided [image].
   */
  public open fun _loadImage(
    image: Image,
    fileaccess: FileAccess,
    flags: Long,
    scale: Float,
  ): GodotError {
    throw NotImplementedError("_load_image is not implemented for ImageFormatLoaderExtension")
  }

  /**
   * Add this format loader to the engine, allowing it to recognize the file extensions returned by [_getRecognizedExtensions].
   */
  public fun addFormatLoader(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_IMAGEFORMATLOADEREXTENSION_ADD_FORMAT_LOADER, NIL)
  }

  /**
   * Remove this format loader from the engine.
   */
  public fun removeFormatLoader(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_IMAGEFORMATLOADEREXTENSION_REMOVE_FORMAT_LOADER, NIL)
  }

  public companion object
}
