// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * The [CameraServer] keeps track of different cameras accessible in Godot. These are external
 * cameras such as webcams or the cameras on your phone.
 * It is notably used to provide AR modules with a video feed from the camera.
 * **Note:** This class is currently only implemented on macOS and iOS. To get a [CameraFeed] on
 * iOS, the camera plugin from
 * [url=https://github.com/godotengine/godot-ios-plugins]godot-ios-plugins[/url] is required. On other
 * platforms, no [CameraFeed]s will be available.
 */
@GodotBaseType
public object CameraServer : Object() {
  /**
   * Emitted when a [CameraFeed] is added (e.g. a webcam is plugged in).
   */
  public val cameraFeedAdded: Signal1<Long> by signal("id")

  /**
   * Emitted when a [CameraFeed] is removed (e.g. a webcam is unplugged).
   */
  public val cameraFeedRemoved: Signal1<Long> by signal("id")

  public override fun new(scriptIndex: Int): Unit {
    getSingleton(ENGINECLASS_CAMERASERVER)
  }

  /**
   * Returns the [CameraFeed] corresponding to the camera with the given [index].
   */
  public fun getFeed(index: Int): CameraFeed? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFeedPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as CameraFeed?)
  }

  /**
   * Returns the number of [CameraFeed]s registered.
   */
  public fun getFeedCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFeedCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns an array of [CameraFeed]s.
   */
  public fun feeds(): VariantArray<CameraFeed> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.feedsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<CameraFeed>)
  }

  /**
   * Adds the camera [feed] to the camera server.
   */
  public fun addFeed(feed: CameraFeed): Unit {
    TransferContext.writeArguments(OBJECT to feed)
    TransferContext.callMethod(rawPtr, MethodBindings.addFeedPtr, NIL)
  }

  /**
   * Removes the specified camera [feed].
   */
  public fun removeFeed(feed: CameraFeed): Unit {
    TransferContext.writeArguments(OBJECT to feed)
    TransferContext.callMethod(rawPtr, MethodBindings.removeFeedPtr, NIL)
  }

  public enum class FeedImage(
    id: Long,
  ) {
    /**
     * The RGBA camera image.
     */
    FEED_RGBA_IMAGE(0),
    /**
     * The [url=https://en.wikipedia.org/wiki/YCbCr]YCbCr[/url] camera image.
     */
    FEED_YCBCR_IMAGE(0),
    /**
     * The Y component camera image.
     */
    FEED_Y_IMAGE(0),
    /**
     * The CbCr component camera image.
     */
    FEED_CBCR_IMAGE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  internal object MethodBindings {
    public val getFeedPtr: VoidPtr = TypeManager.getMethodBindPtr("CameraServer", "get_feed")

    public val getFeedCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraServer", "get_feed_count")

    public val feedsPtr: VoidPtr = TypeManager.getMethodBindPtr("CameraServer", "feeds")

    public val addFeedPtr: VoidPtr = TypeManager.getMethodBindPtr("CameraServer", "add_feed")

    public val removeFeedPtr: VoidPtr = TypeManager.getMethodBindPtr("CameraServer", "remove_feed")
  }
}
