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
import godot.core.VariantParser.BOOL
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmField

/**
 * This class handles the OpenXR marker tracking spatial entity extension.
 */
@GodotBaseType
public open class OpenXRSpatialMarkerTrackingCapability : OpenXRExtensionWrapper() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(483, scriptPtr)
  }

  /**
   * Returns `true` if QR code marker tracking is supported by the current device.
   */
  public final fun isQrcodeSupported(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isQrcodeSupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if micro QR code marker tracking is supported by the current device.
   */
  public final fun isMicroQrcodeSupported(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isMicroQrcodeSupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if Aruco marker tracking is supported by the current device.
   */
  public final fun isArucoSupported(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isArucoSupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if April tag marker tracking is supported by the current device.
   */
  public final fun isAprilTagSupported(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isAprilTagSupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object {
    @JvmField
    public val isQrcodeSupportedName:
        MethodStringName0<OpenXRSpatialMarkerTrackingCapability, Boolean> =
        MethodStringName0<OpenXRSpatialMarkerTrackingCapability, Boolean>("is_qrcode_supported")

    @JvmField
    public val isMicroQrcodeSupportedName:
        MethodStringName0<OpenXRSpatialMarkerTrackingCapability, Boolean> =
        MethodStringName0<OpenXRSpatialMarkerTrackingCapability, Boolean>("is_micro_qrcode_supported")

    @JvmField
    public val isArucoSupportedName:
        MethodStringName0<OpenXRSpatialMarkerTrackingCapability, Boolean> =
        MethodStringName0<OpenXRSpatialMarkerTrackingCapability, Boolean>("is_aruco_supported")

    @JvmField
    public val isAprilTagSupportedName:
        MethodStringName0<OpenXRSpatialMarkerTrackingCapability, Boolean> =
        MethodStringName0<OpenXRSpatialMarkerTrackingCapability, Boolean>("is_april_tag_supported")
  }

  public object MethodBindings {
    internal val isQrcodeSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialMarkerTrackingCapability", "is_qrcode_supported", 2240911060)

    internal val isMicroQrcodeSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialMarkerTrackingCapability", "is_micro_qrcode_supported", 2240911060)

    internal val isArucoSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialMarkerTrackingCapability", "is_aruco_supported", 2240911060)

    internal val isAprilTagSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialMarkerTrackingCapability", "is_april_tag_supported", 2240911060)
  }
}
