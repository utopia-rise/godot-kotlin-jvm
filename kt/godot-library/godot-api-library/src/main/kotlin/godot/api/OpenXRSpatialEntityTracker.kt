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
import godot.core.MethodStringName0
import godot.core.MethodStringName1
import godot.core.RID
import godot.core.Signal1
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser._RID
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmField
import kotlin.jvm.JvmName

/**
 * These are trackers created and managed by OpenXR's spatial entity extensions that give access to
 * specific data related to OpenXR's spatial entities. They will always be of type `TRACKER_ANCHOR`.
 */
@GodotBaseType
public open class OpenXRSpatialEntityTracker : XRPositionalTracker() {
  public val spatialTrackingStateChanged: Signal1<Long> by Signal1

  /**
   * The spatial entity associated with this tracker.
   */
  public final inline var entity: RID
    @JvmName("entityProperty")
    get() = getEntity()
    @JvmName("entityProperty")
    set(`value`) {
      setEntity(value)
    }

  /**
   * The spatial tracking state for this tracker.
   */
  public final inline var spatialTrackingState: EntityTrackingState
    @JvmName("spatialTrackingStateProperty")
    get() = getSpatialTrackingState()
    @JvmName("spatialTrackingStateProperty")
    set(`value`) {
      setSpatialTrackingState(value)
    }

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(482, scriptPtr)
  }

  public final fun setEntity(entity: RID): Unit {
    TransferContext.writeArguments(_RID to entity)
    TransferContext.callMethod(ptr, MethodBindings.setEntityPtr, NIL)
  }

  public final fun getEntity(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEntityPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setSpatialTrackingState(spatialTrackingState: EntityTrackingState): Unit {
    TransferContext.writeArguments(LONG to spatialTrackingState.value)
    TransferContext.callMethod(ptr, MethodBindings.setSpatialTrackingStatePtr, NIL)
  }

  public final fun getSpatialTrackingState(): EntityTrackingState {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpatialTrackingStatePtr, LONG)
    return EntityTrackingState.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class EntityTrackingState(
    public override val `value`: Long,
  ) : GodotEnum {
    /**
     * This anchor has stopped tracking.
     */
    STOPPED(1),
    /**
     * Tracking is currently paused.
     */
    PAUSED(2),
    /**
     * This anchor is currently being tracked.
     */
    TRACKING(3),
    ;

    public companion object {
      public fun from(`value`: Long): EntityTrackingState = entries.single { it.`value` == `value` }
    }
  }

  public companion object {
    @JvmField
    public val setEntityName: MethodStringName1<OpenXRSpatialEntityTracker, Unit, RID> =
        MethodStringName1<OpenXRSpatialEntityTracker, Unit, RID>("set_entity")

    @JvmField
    public val getEntityName: MethodStringName0<OpenXRSpatialEntityTracker, RID> =
        MethodStringName0<OpenXRSpatialEntityTracker, RID>("get_entity")

    @JvmField
    public val setSpatialTrackingStateName:
        MethodStringName1<OpenXRSpatialEntityTracker, Unit, EntityTrackingState> =
        MethodStringName1<OpenXRSpatialEntityTracker, Unit, EntityTrackingState>("set_spatial_tracking_state")

    @JvmField
    public val getSpatialTrackingStateName:
        MethodStringName0<OpenXRSpatialEntityTracker, EntityTrackingState> =
        MethodStringName0<OpenXRSpatialEntityTracker, EntityTrackingState>("get_spatial_tracking_state")
  }

  public object MethodBindings {
    internal val setEntityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialEntityTracker", "set_entity", 2722037293)

    internal val getEntityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialEntityTracker", "get_entity", 2944877500)

    internal val setSpatialTrackingStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialEntityTracker", "set_spatial_tracking_state", 2170234447)

    internal val getSpatialTrackingStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialEntityTracker", "get_spatial_tracking_state", 3351876560)
  }
}
