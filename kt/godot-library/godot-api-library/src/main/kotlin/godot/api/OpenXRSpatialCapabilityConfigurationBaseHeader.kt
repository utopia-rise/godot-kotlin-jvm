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
import godot.core.VariantParser.BOOL
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Wrapper base class for OpenXR Spatial Capability Configuration headers. This class needs to be
 * implemented for each capability configuration structure usable within OpenXR's spatial entities
 * system.
 */
@GodotBaseType
public open class OpenXRSpatialCapabilityConfigurationBaseHeader : RefCounted() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(897, scriptPtr)
  }

  /**
   * Return `true` if this object contains a valid configuration that can be retrieved when calling
   * [_getConfiguration].
   */
  public open fun _hasValidConfiguration(): Boolean {
    throw NotImplementedError("OpenXRSpatialCapabilityConfigurationBaseHeader::_hasValidConfiguration is not implemented.")
  }

  /**
   * Return a pointer (encoded as an `int64_t`) to a struct holding the spatial capability
   * configuration data. The memory for this struct should remain accessible as long as this object
   * remains instantiated.
   */
  public open fun _getConfiguration(): Long {
    throw NotImplementedError("OpenXRSpatialCapabilityConfigurationBaseHeader::_getConfiguration is not implemented.")
  }

  /**
   * Returns `true` if this object contains a valid configuration that can be used when calling
   * [OpenXRSpatialEntityExtension.createSpatialContext].
   */
  public final fun hasValidConfiguration(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasValidConfigurationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val hasValidConfigurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialCapabilityConfigurationBaseHeader", "has_valid_configuration", 36873697)
  }
}
