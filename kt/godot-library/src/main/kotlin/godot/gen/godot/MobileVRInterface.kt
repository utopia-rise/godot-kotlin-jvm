// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Suppress

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
 *     get_viewport().xr = true
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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MOBILEVRINTERFACE, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setEyeHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_eye_height")

    public val getEyeHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_eye_height")

    public val setIodPtr: VoidPtr = TypeManager.getMethodBindPtr("MobileVRInterface", "set_iod")

    public val getIodPtr: VoidPtr = TypeManager.getMethodBindPtr("MobileVRInterface", "get_iod")

    public val setDisplayWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_display_width")

    public val getDisplayWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_display_width")

    public val setDisplayToLensPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_display_to_lens")

    public val getDisplayToLensPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_display_to_lens")

    public val setOversamplePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "set_oversample")

    public val getOversamplePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MobileVRInterface", "get_oversample")

    public val setK1Ptr: VoidPtr = TypeManager.getMethodBindPtr("MobileVRInterface", "set_k1")

    public val getK1Ptr: VoidPtr = TypeManager.getMethodBindPtr("MobileVRInterface", "get_k1")

    public val setK2Ptr: VoidPtr = TypeManager.getMethodBindPtr("MobileVRInterface", "set_k2")

    public val getK2Ptr: VoidPtr = TypeManager.getMethodBindPtr("MobileVRInterface", "get_k2")
  }
}
