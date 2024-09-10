// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Rect2
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.RECT2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * This is a generic mobile VR implementation where you need to provide details about the phone and
 * HMD used. It does not rely on any existing framework. This is the most basic interface we have. For
 * the best effect, you need a mobile phone with a gyroscope and accelerometer.
 * Note that even though there is no positional tracking, the camera will assume the headset is at a
 * height of 1.85 meters. You can change this by setting [eyeHeight].
 * You can initialize this interface as follows:
 * [codeblock]
 * var interface = XRServer.find_interface("Native mobile")
 * if interface and interface.initialize():
 *     get_viewport().use_xr = true
 * [/codeblock]
 */
@GodotBaseType
public open class MobileVRInterface : XRInterface() {
  /**
   * The height at which the camera is placed in relation to the ground (i.e. [XROrigin3D] node).
   */
  public var eyeHeight: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEyeHeightPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEyeHeightPtr, NIL)
    }

  /**
   * The interocular distance, also known as the interpupillary distance. The distance between the
   * pupils of the left and right eye.
   */
  public var iod: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIodPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIodPtr, NIL)
    }

  /**
   * The width of the display in centimeters.
   */
  public var displayWidth: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDisplayWidthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisplayWidthPtr, NIL)
    }

  /**
   * The distance between the display and the lenses inside of the device in centimeters.
   */
  public var displayToLens: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDisplayToLensPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisplayToLensPtr, NIL)
    }

  /**
   * Set the offset rect relative to the area being rendered. A length of 1 represents the whole
   * rendering area on that axis.
   */
  @CoreTypeLocalCopy
  public var offsetRect: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOffsetRectPtr, RECT2)
      return (TransferContext.readReturnValue(RECT2, false) as Rect2)
    }
    set(`value`) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOffsetRectPtr, NIL)
    }

  /**
   * The oversample setting. Because of the lens distortion we have to render our buffers at a
   * higher resolution then the screen can natively handle. A value between 1.5 and 2.0 often provides
   * good results but at the cost of performance.
   */
  public var oversample: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOversamplePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOversamplePtr, NIL)
    }

  /**
   * The k1 lens factor is one of the two constants that define the strength of the lens used and
   * directly influences the lens distortion effect.
   */
  public var k1: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getK1Ptr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setK1Ptr, NIL)
    }

  /**
   * The k2 lens factor, see k1.
   */
  public var k2: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getK2Ptr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setK2Ptr, NIL)
    }

  /**
   * The minimum radius around the focal point where full quality is guaranteed if VRS is used as a
   * percentage of screen size.
   * **Note:** Mobile and Forward+ renderers only. Requires [Viewport.vrsMode] to be set to
   * [Viewport.VRS_XR].
   */
  public var vrsMinRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVrsMinRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVrsMinRadiusPtr, NIL)
    }

  /**
   * The strength used to calculate the VRS density map. The greater this value, the more noticeable
   * VRS is. This improves performance at the cost of quality.
   * **Note:** Mobile and Forward+ renderers only. Requires [Viewport.vrsMode] to be set to
   * [Viewport.VRS_XR].
   */
  public var vrsStrength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVrsStrengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVrsStrengthPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_MOBILEVRINTERFACE, scriptIndex)
  }

  /**
   * Set the offset rect relative to the area being rendered. A length of 1 represents the whole
   * rendering area on that axis.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = mobilevrinterface.offsetRect
   * //Your changes
   * mobilevrinterface.offsetRect = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun offsetRectMutate(block: Rect2.() -> Unit): Rect2 = offsetRect.apply{
      block(this)
      offsetRect = this
  }


  public companion object

  internal object MethodBindings {
    public val setEyeHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_eye_height", 373806689)

    public val getEyeHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_eye_height", 1740695150)

    public val setIodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_iod", 373806689)

    public val getIodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_iod", 1740695150)

    public val setDisplayWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_display_width", 373806689)

    public val getDisplayWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_display_width", 1740695150)

    public val setDisplayToLensPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_display_to_lens", 373806689)

    public val getDisplayToLensPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_display_to_lens", 1740695150)

    public val setOffsetRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_offset_rect", 2046264180)

    public val getOffsetRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_offset_rect", 1639390495)

    public val setOversamplePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_oversample", 373806689)

    public val getOversamplePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_oversample", 1740695150)

    public val setK1Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_k1", 373806689)

    public val getK1Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_k1", 1740695150)

    public val setK2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_k2", 373806689)

    public val getK2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_k2", 1740695150)

    public val getVrsMinRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_vrs_min_radius", 1740695150)

    public val setVrsMinRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_vrs_min_radius", 373806689)

    public val getVrsStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_vrs_strength", 1740695150)

    public val setVrsStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_vrs_strength", 373806689)
  }
}
