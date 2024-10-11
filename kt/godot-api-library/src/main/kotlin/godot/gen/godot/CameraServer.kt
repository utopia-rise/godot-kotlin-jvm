// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Signal1
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic

private const val ENGINE_CLASS_CAMERASERVER_INDEX: Int = 29

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
  @JvmStatic
  public val cameraFeedAdded: Signal1<Long> by Signal1

  /**
   * Emitted when a [CameraFeed] is removed (e.g. a webcam is unplugged).
   */
  @JvmStatic
  public val cameraFeedRemoved: Signal1<Long> by Signal1

  public override fun new(scriptIndex: Int): Unit {
    Internals.getSingleton(this, ENGINE_CLASS_CAMERASERVER_INDEX)
  }

  /**
   * Returns the [CameraFeed] corresponding to the camera with the given [index].
   */
  @JvmStatic
  public final fun getFeed(index: Int): CameraFeed? {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getFeedPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as CameraFeed?)
  }

  /**
   * Returns the number of [CameraFeed]s registered.
   */
  @JvmStatic
  public final fun getFeedCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFeedCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns an array of [CameraFeed]s.
   */
  @JvmStatic
  public final fun feeds(): VariantArray<CameraFeed> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.feedsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<CameraFeed>)
  }

  /**
   * Adds the camera [feed] to the camera server.
   */
  @JvmStatic
  public final fun addFeed(feed: CameraFeed?): Unit {
    Internals.writeArguments(OBJECT to feed)
    Internals.callMethod(rawPtr, MethodBindings.addFeedPtr, NIL)
  }

  /**
   * Removes the specified camera [feed].
   */
  @JvmStatic
  public final fun removeFeed(feed: CameraFeed?): Unit {
    Internals.writeArguments(OBJECT to feed)
    Internals.callMethod(rawPtr, MethodBindings.removeFeedPtr, NIL)
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
      public fun from(`value`: Long): FeedImage = entries.single { it.id == `value` }
    }
  }

  public object MethodBindings {
    internal val getFeedPtr: VoidPtr =
        Internals.getMethodBindPtr("CameraServer", "get_feed", 361927068)

    internal val getFeedCountPtr: VoidPtr =
        Internals.getMethodBindPtr("CameraServer", "get_feed_count", 2455072627)

    internal val feedsPtr: VoidPtr = Internals.getMethodBindPtr("CameraServer", "feeds", 2915620761)

    internal val addFeedPtr: VoidPtr =
        Internals.getMethodBindPtr("CameraServer", "add_feed", 3204782488)

    internal val removeFeedPtr: VoidPtr =
        Internals.getMethodBindPtr("CameraServer", "remove_feed", 3204782488)
  }
}
