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

@GodotBaseType
object CameraServer : Object() {
  final const val FEED_CBCR_IMAGE: Long = 1

  final const val FEED_RGBA_IMAGE: Long = 0

  final const val FEED_YCBCR_IMAGE: Long = 0

  final const val FEED_Y_IMAGE: Long = 0

  val cameraFeedAdded: Signal1<Long> by signal("id")

  val cameraFeedRemoved: Signal1<Long> by signal("id")

  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINESINGLETON_CAMERASERVER)

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  fun addFeed(feed: CameraFeed) {
    TransferContext.writeArguments(OBJECT to feed)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERASERVER_ADD_FEED, NIL)
  }

  fun feeds(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERASERVER_FEEDS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun getFeed(index: Long): CameraFeed? {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERASERVER_GET_FEED, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as CameraFeed?
  }

  fun getFeedCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERASERVER_GET_FEED_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun removeFeed(feed: CameraFeed) {
    TransferContext.writeArguments(OBJECT to feed)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERASERVER_REMOVE_FEED, NIL)
  }

  enum class FeedImage(
    id: Long
  ) {
    FEED_RGBA_IMAGE(0),

    FEED_YCBCR_IMAGE(0),

    FEED_Y_IMAGE(0),

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
