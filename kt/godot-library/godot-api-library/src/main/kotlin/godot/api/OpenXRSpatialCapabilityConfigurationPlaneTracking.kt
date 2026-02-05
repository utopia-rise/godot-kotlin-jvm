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
import godot.core.PackedInt64Array
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.PACKED_INT_64_ARRAY
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * Configuration header for plane tracking. Pass this to
 * [OpenXRSpatialEntityExtension.createSpatialContext] to create a spatial context with plane tracking
 * capabilities.
 */
@GodotBaseType
public open class OpenXRSpatialCapabilityConfigurationPlaneTracking :
    OpenXRSpatialCapabilityConfigurationBaseHeader() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(890, scriptPtr)
  }

  /**
   * Returns `true` if we support the mesh 2D component (only valid after the OpenXR session has
   * started). You can query these using the [OpenXRSpatialComponentMesh2DList] data object.
   */
  public final fun supportsMesh2d(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.supportsMesh2dPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if we support the polygon 2D component (only valid after the OpenXR session has
   * started). You can query these using the [OpenXRSpatialComponentPolygon2DList] data object.
   */
  public final fun supportsPolygons(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.supportsPolygonsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if we support the plane semantic label component (only valid after the OpenXR
   * session has started). You can query these using the [OpenXRSpatialComponentPlaneSemanticLabelList]
   * data object.
   */
  public final fun supportsLabels(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.supportsLabelsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the components enabled by this configuration.
   *
   * **Note:** Only valid after this configuration was used to create a spatial context.
   */
  public final fun getEnabledComponents(): PackedInt64Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnabledComponentsPtr, PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY) as PackedInt64Array)
  }

  public companion object

  public object MethodBindings {
    internal val supportsMesh2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialCapabilityConfigurationPlaneTracking", "supports_mesh_2d", 2240911060)

    internal val supportsPolygonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialCapabilityConfigurationPlaneTracking", "supports_polygons", 2240911060)

    internal val supportsLabelsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialCapabilityConfigurationPlaneTracking", "supports_labels", 2240911060)

    internal val getEnabledComponentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialCapabilityConfigurationPlaneTracking", "get_enabled_components", 235988956)
  }
}
