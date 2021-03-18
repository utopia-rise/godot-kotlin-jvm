// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Long
import kotlin.Suppress

/**
 * Server keeping track of different cameras accessible in Godot.
 *
 * The [godot.CameraServer] keeps track of different cameras accessible in Godot. These are external cameras such as webcams or the cameras on your phone.
 *
 * It is notably used to provide AR modules with a video feed from the camera.
 */
@GodotBaseType
object CameraServer : Object() {
  /**
   * The CbCr component camera image.
   */
  final const val FEED_CBCR_IMAGE: Long = 1

  /**
   * The RGBA camera image.
   */
  final const val FEED_RGBA_IMAGE: Long = 0

  /**
   * The YCbCr camera image.
   */
  final const val FEED_YCBCR_IMAGE: Long = 0

  /**
   * The Y component camera image.
   */
  final const val FEED_Y_IMAGE: Long = 0

  /**
   * Emitted when a [godot.CameraFeed] is added (e.g. webcam is plugged in).
   */
  val cameraFeedAdded: Signal1<Long> by signal("id")

  /**
   * Emitted when a [godot.CameraFeed] is removed (e.g. webcam is unplugged).
   */
  val cameraFeedRemoved: Signal1<Long> by signal("id")

  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINESINGLETON_CAMERASERVER)

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Adds a camera feed to the camera server.
   */
  fun addFeed(feed: CameraFeed) {
    TransferContext.writeArguments(OBJECT to feed)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERASERVER_ADD_FEED, NIL)
  }

  /**
   * Returns an array of [godot.CameraFeed]s.
   */
  fun feeds(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERASERVER_FEEDS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the [godot.CameraFeed] with this id.
   */
  fun getFeed(index: Long): CameraFeed? {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERASERVER_GET_FEED, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as CameraFeed?
  }

  /**
   * Returns the number of [godot.CameraFeed]s registered.
   */
  fun getFeedCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERASERVER_GET_FEED_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes a [godot.CameraFeed].
   */
  fun removeFeed(feed: CameraFeed) {
    TransferContext.writeArguments(OBJECT to feed)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERASERVER_REMOVE_FEED, NIL)
  }

  enum class FeedImage(
    id: Long
  ) {
    /**
     * The RGBA camera image.
     */
    FEED_RGBA_IMAGE(0),

    /**
     * The YCbCr camera image.
     */
    FEED_YCBCR_IMAGE(0),

    /**
     * The Y component camera image.
     */
    FEED_Y_IMAGE(0),

    /**
     * The CbCr component camera image.
     */
    FEED_CBCR_IMAGE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }
}
