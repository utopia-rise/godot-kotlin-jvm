// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_CAMERATEXTURE_INDEX: Int = 167

/**
 * This texture gives access to the camera texture provided by a [CameraFeed].
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
    Internals.callConstructor(this, ENGINE_CLASS_CAMERATEXTURE_INDEX, scriptIndex)
  }

  public final fun setCameraFeedId(feedId: Int): Unit {
    Internals.writeArguments(LONG to feedId.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setCameraFeedIdPtr, NIL)
  }

  public final fun getCameraFeedId(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCameraFeedIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setWhichFeed(whichFeed: CameraServer.FeedImage): Unit {
    Internals.writeArguments(LONG to whichFeed.id)
    Internals.callMethod(rawPtr, MethodBindings.setWhichFeedPtr, NIL)
  }

  public final fun getWhichFeed(): CameraServer.FeedImage {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getWhichFeedPtr, LONG)
    return CameraServer.FeedImage.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setCameraActive(active: Boolean): Unit {
    Internals.writeArguments(BOOL to active)
    Internals.callMethod(rawPtr, MethodBindings.setCameraActivePtr, NIL)
  }

  public final fun getCameraActive(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCameraActivePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setCameraFeedIdPtr: VoidPtr =
        Internals.getMethodBindPtr("CameraTexture", "set_camera_feed_id", 1286410249)

    internal val getCameraFeedIdPtr: VoidPtr =
        Internals.getMethodBindPtr("CameraTexture", "get_camera_feed_id", 3905245786)

    internal val setWhichFeedPtr: VoidPtr =
        Internals.getMethodBindPtr("CameraTexture", "set_which_feed", 1595299230)

    internal val getWhichFeedPtr: VoidPtr =
        Internals.getMethodBindPtr("CameraTexture", "get_which_feed", 91039457)

    internal val setCameraActivePtr: VoidPtr =
        Internals.getMethodBindPtr("CameraTexture", "set_camera_active", 2586408642)

    internal val getCameraActivePtr: VoidPtr =
        Internals.getMethodBindPtr("CameraTexture", "get_camera_active", 36873697)
  }
}
