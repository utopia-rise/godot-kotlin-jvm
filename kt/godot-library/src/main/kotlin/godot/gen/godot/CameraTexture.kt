// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress

/**
 * Texture provided by a [godot.CameraFeed].
 *
 * This texture gives access to the camera texture provided by a [godot.CameraFeed].
 *
 * **Note:** Many cameras supply YCbCr images which need to be converted in a shader.
 */
@GodotBaseType
open class CameraTexture : Texture() {
  /**
   * The ID of the [godot.CameraFeed] for which we want to display the image.
   */
  open var cameraFeedId: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERATEXTURE_GET_CAMERA_FEED_ID,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERATEXTURE_SET_CAMERA_FEED_ID,
          NIL)
    }

  /**
   * Convenience property that gives access to the active property of the [godot.CameraFeed].
   */
  open var cameraIsActive: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERATEXTURE_GET_CAMERA_IS_ACTIVE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERATEXTURE_SET_CAMERA_IS_ACTIVE, NIL)
    }

  /**
   * Which image within the [godot.CameraFeed] we want access to, important if the camera image is split in a Y and CbCr component.
   */
  open var whichFeed: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERATEXTURE_GET_WHICH_FEED,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERATEXTURE_SET_WHICH_FEED, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_CAMERATEXTURE)
}
