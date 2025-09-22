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
import godot.core.GodotEnum
import godot.core.Signal0
import godot.core.Signal1
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmStatic

/**
 * The [CameraServer] keeps track of different cameras accessible in Godot. These are external
 * cameras such as webcams or the cameras on your phone.
 *
 * It is notably used to provide AR modules with a video feed from the camera.
 *
 * **Note:** This class is currently only implemented on Linux, Android, macOS, and iOS. On other
 * platforms no [CameraFeed]s will be available. To get a [CameraFeed] on iOS, the camera plugin from
 * [url=https://github.com/godotengine/godot-ios-plugins]godot-ios-plugins[/url] is required.
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

  /**
   * Emitted when camera feeds are updated.
   */
  @JvmStatic
  public val cameraFeedsUpdated: Signal0 by Signal0

  /**
   * If `true`, the server is actively monitoring available camera feeds.
   *
   * This has a performance cost, so only set it to `true` when you're actively accessing the
   * camera.
   *
   * **Note:** After setting it to `true`, you can receive updated camera feeds through the [signal
   * camera_feeds_updated] signal.
   *
   * ```gdscript
   * //gdscript
   * func _ready():
   * CameraServer.camera_feeds_updated.connect(_on_camera_feeds_updated)
   * CameraServer.monitoring_feeds = true
   *
   * func _on_camera_feeds_updated():
   * var feeds = CameraServer.feeds()
   * ```
   *
   * ```csharp
   * //csharp
   * public override void _Ready()
   * {
   * CameraServer.CameraFeedsUpdated += OnCameraFeedsUpdated;
   * CameraServer.MonitoringFeeds = true;
   * }
   *
   * void OnCameraFeedsUpdated()
   * {
   * var feeds = CameraServer.Feeds();
   * }
   * ```
   */
  @JvmStatic
  public final inline var monitoringFeeds: Boolean
    @JvmName("monitoringFeedsProperty")
    get() = isMonitoringFeeds()
    @JvmName("monitoringFeedsProperty")
    set(`value`) {
      setMonitoringFeeds(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    getSingleton(1)
  }

  @JvmStatic
  public final fun setMonitoringFeeds(isMonitoringFeeds: Boolean): Unit {
    TransferContext.writeArguments(BOOL to isMonitoringFeeds)
    TransferContext.callMethod(ptr, MethodBindings.setMonitoringFeedsPtr, NIL)
  }

  @JvmStatic
  public final fun isMonitoringFeeds(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isMonitoringFeedsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the [CameraFeed] corresponding to the camera with the given [index].
   */
  @JvmStatic
  public final fun getFeed(index: Int): CameraFeed? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getFeedPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as CameraFeed?)
  }

  /**
   * Returns the number of [CameraFeed]s registered.
   */
  @JvmStatic
  public final fun getFeedCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFeedCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns an array of [CameraFeed]s.
   */
  @JvmStatic
  public final fun feeds(): VariantArray<CameraFeed> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.feedsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<CameraFeed>)
  }

  /**
   * Adds the camera [feed] to the camera server.
   */
  @JvmStatic
  public final fun addFeed(feed: CameraFeed?): Unit {
    TransferContext.writeArguments(OBJECT to feed)
    TransferContext.callMethod(ptr, MethodBindings.addFeedPtr, NIL)
  }

  /**
   * Removes the specified camera [feed].
   */
  @JvmStatic
  public final fun removeFeed(feed: CameraFeed?): Unit {
    TransferContext.writeArguments(OBJECT to feed)
    TransferContext.callMethod(ptr, MethodBindings.removeFeedPtr, NIL)
  }

  public enum class FeedImage(
    `value`: Long,
  ) : GodotEnum {
    /**
     * The RGBA camera image.
     */
    RGBA(0),
    /**
     * The [url=https://en.wikipedia.org/wiki/YCbCr]YCbCr[/url] camera image.
     */
    YCBCR(0),
    /**
     * The Y component camera image.
     */
    Y(0),
    /**
     * The CbCr component camera image.
     */
    CBCR(1),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): FeedImage = entries.single { it.`value` == `value` }
    }
  }

  public object MethodBindings {
    internal val setMonitoringFeedsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraServer", "set_monitoring_feeds", 2586408642)

    internal val isMonitoringFeedsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraServer", "is_monitoring_feeds", 36873697)

    internal val getFeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraServer", "get_feed", 361927068)

    internal val getFeedCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraServer", "get_feed_count", 2455072627)

    internal val feedsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraServer", "feeds", 2915620761)

    internal val addFeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraServer", "add_feed", 3204782488)

    internal val removeFeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraServer", "remove_feed", 3204782488)
  }
}
