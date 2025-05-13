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
import godot.core.MethodStringName0
import godot.core.MethodStringName1
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmStatic

/**
 * This texture gives access to the camera texture provided by a [CameraFeed].
 *
 * **Note:** Many cameras supply YCbCr images which need to be converted in a shader.
 */
@GodotBaseType
public open class CameraTexture : Texture2D() {
  /**
   * The ID of the [CameraFeed] for which we want to display the image.
   */
  public final inline var cameraFeedId: Int
    @JvmName("cameraFeedIdProperty")
    get() = getCameraFeedId()
    @JvmName("cameraFeedIdProperty")
    set(`value`) {
      setCameraFeedId(value)
    }

  /**
   * Which image within the [CameraFeed] we want access to, important if the camera image is split
   * in a Y and CbCr component.
   */
  public final inline var whichFeed: CameraServer.FeedImage
    @JvmName("whichFeedProperty")
    get() = getWhichFeed()
    @JvmName("whichFeedProperty")
    set(`value`) {
      setWhichFeed(value)
    }

  /**
   * Convenience property that gives access to the active property of the [CameraFeed].
   */
  public final inline var cameraIsActive: Boolean
    @JvmName("cameraIsActiveProperty")
    get() = getCameraActive()
    @JvmName("cameraIsActiveProperty")
    set(`value`) {
      setCameraActive(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(134, scriptIndex)
  }

  public final fun setCameraFeedId(feedId: Int): Unit {
    TransferContext.writeArguments(LONG to feedId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setCameraFeedIdPtr, NIL)
  }

  public final fun getCameraFeedId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCameraFeedIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setWhichFeed(whichFeed: CameraServer.FeedImage): Unit {
    TransferContext.writeArguments(LONG to whichFeed.id)
    TransferContext.callMethod(ptr, MethodBindings.setWhichFeedPtr, NIL)
  }

  public final fun getWhichFeed(): CameraServer.FeedImage {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWhichFeedPtr, LONG)
    return CameraServer.FeedImage.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setCameraActive(active: Boolean): Unit {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(ptr, MethodBindings.setCameraActivePtr, NIL)
  }

  public final fun getCameraActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCameraActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object {
    @JvmStatic
    public val setCameraFeedIdName: MethodStringName1<CameraTexture, Unit, Int> =
        MethodStringName1<CameraTexture, Unit, Int>("set_camera_feed_id")

    @JvmStatic
    public val getCameraFeedIdName: MethodStringName0<CameraTexture, Int> =
        MethodStringName0<CameraTexture, Int>("get_camera_feed_id")

    @JvmStatic
    public val setWhichFeedName: MethodStringName1<CameraTexture, Unit, CameraServer.FeedImage> =
        MethodStringName1<CameraTexture, Unit, CameraServer.FeedImage>("set_which_feed")

    @JvmStatic
    public val getWhichFeedName: MethodStringName0<CameraTexture, CameraServer.FeedImage> =
        MethodStringName0<CameraTexture, CameraServer.FeedImage>("get_which_feed")

    @JvmStatic
    public val setCameraActiveName: MethodStringName1<CameraTexture, Unit, Boolean> =
        MethodStringName1<CameraTexture, Unit, Boolean>("set_camera_active")

    @JvmStatic
    public val getCameraActiveName: MethodStringName0<CameraTexture, Boolean> =
        MethodStringName0<CameraTexture, Boolean>("get_camera_active")
  }

  public object MethodBindings {
    internal val setCameraFeedIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraTexture", "set_camera_feed_id", 1286410249)

    internal val getCameraFeedIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraTexture", "get_camera_feed_id", 3905245786)

    internal val setWhichFeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraTexture", "set_which_feed", 1595299230)

    internal val getWhichFeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraTexture", "get_which_feed", 91039457)

    internal val setCameraActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraTexture", "set_camera_active", 2586408642)

    internal val getCameraActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraTexture", "get_camera_active", 36873697)
  }
}
