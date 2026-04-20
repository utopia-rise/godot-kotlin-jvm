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
import godot.core.RID
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.LONG
import godot.core.VariantParser._RID
import kotlin.Any
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Object for storing the queries marker result data when calling
 * [OpenXRSpatialEntityExtension.querySnapshot].
 */
@GodotBaseType
public open class OpenXRSpatialComponentMarkerList : OpenXRSpatialComponentData() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(472, scriptPtr)
  }

  /**
   * Returns the marker type for the marker at this [index].
   */
  public final fun getMarkerType(index: Long): MarkerType {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(ptr, MethodBindings.getMarkerTypePtr, LONG)
    return MarkerType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the marker ID for the marker at this [index]. Only applicable for Aruco or April Tag
   * markers.
   */
  public final fun getMarkerId(index: Long): Long {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(ptr, MethodBindings.getMarkerIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns either a [String] or a [PackedByteArray] buffer with data for the marker at this
   * [index]. Only applicable for QR code markers.
   */
  public final fun getMarkerData(snapshot: RID, index: Long): Any? {
    TransferContext.writeArguments(_RID to snapshot, LONG to index)
    TransferContext.callMethod(ptr, MethodBindings.getMarkerDataPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  public enum class MarkerType(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Unknown or unset marker type.
     */
    UNKNOWN(0),
    /**
     * Marker based on a QR code.
     */
    QRCODE(1),
    /**
     * Marker based on a micro QR code.
     */
    MICRO_QRCODE(2),
    /**
     * Marker based on an Aruco code.
     */
    ARUCO(3),
    /**
     * Marker based on an April Tag.
     */
    APRIL_TAG(4),
    /**
     * Maximum value for this enum.
     */
    MAX(5),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): MarkerType = entries.single { it.`value` == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val getMarkerTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialComponentMarkerList", "get_marker_type", 2627847866)

    internal val getMarkerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialComponentMarkerList", "get_marker_id", 923996154)

    internal val getMarkerDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialComponentMarkerList", "get_marker_data", 4069510997)
  }
}
