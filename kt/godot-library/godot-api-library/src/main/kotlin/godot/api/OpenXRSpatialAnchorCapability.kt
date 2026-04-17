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
import godot.core.Callable
import godot.core.GodotEnum
import godot.core.RID
import godot.core.Transform3D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.CALLABLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.TRANSFORM3D
import godot.core.VariantParser._RID
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * This is an internal class that handles the OpenXR anchor spatial entity extension.
 */
@GodotBaseType
public open class OpenXRSpatialAnchorCapability : OpenXRExtensionWrapper() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(876, scriptPtr)
  }

  /**
   * Returns `true` if spatial anchors are supported by the hardware. Only returns a valid value
   * after OpenXR has been initialized.
   */
  public final fun isSpatialAnchorSupported(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSpatialAnchorSupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if persistent spatial anchors are supported by the hardware. Only returns a
   * valid value after OpenXR has been initialized.
   */
  public final fun isSpatialPersistenceSupported(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSpatialPersistenceSupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if this persistence scope is supported by our spatial anchor capability.
   *
   * **Note:** Only valid after an OpenXR instance has been created.
   */
  public final fun isPersistenceScopeSupported(scope: PersistenceScope): Boolean {
    TransferContext.writeArguments(LONG to scope.value)
    TransferContext.callMethod(ptr, MethodBindings.isPersistenceScopeSupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Creates a new persistence context for storing persistent data.
   *
   * **Note:** This is an asynchronous method and returns an [OpenXRFutureResult] object with which
   * to track the status, discarding this object will not cancel the creation process. On success
   * [userCallback] will be called if specified. The result value for this function is the [RID] for
   * our persistence context.
   */
  @JvmOverloads
  public final fun createPersistenceContext(scope: PersistenceScope, userCallback: Callable =
      Callable()): OpenXRFutureResult? {
    TransferContext.writeArguments(LONG to scope.value, CALLABLE to userCallback)
    TransferContext.callMethod(ptr, MethodBindings.createPersistenceContextPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as OpenXRFutureResult?)
  }

  /**
   * Returns the internal handle for this persistence context.
   *
   * **Note:** For GDExtension implementations.
   */
  public final fun getPersistenceContextHandle(persistenceContext: RID): Long {
    TransferContext.writeArguments(_RID to persistenceContext)
    TransferContext.callMethod(ptr, MethodBindings.getPersistenceContextHandlePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Frees a persistence context previously created with [createPersistenceContext].
   */
  public final fun freePersistenceContext(persistenceContext: RID): Unit {
    TransferContext.writeArguments(_RID to persistenceContext)
    TransferContext.callMethod(ptr, MethodBindings.freePersistenceContextPtr, NIL)
  }

  /**
   * Creates a new anchor that will be tracked by the XR runtime. The [transform] should be a
   * transform in the local space of your [XROrigin3D] node. If [spatialContext] is not specified the
   * default will be used, this requires
   * [ProjectSettings.xr/openxr/extensions/spatialEntity/enableBuiltinAnchorDetection] to be set. The
   * returned tracker will track the location in case our reference space changes.
   */
  @JvmOverloads
  public final fun createNewAnchor(transform: Transform3D, spatialContext: RID = RID()):
      OpenXRAnchorTracker? {
    TransferContext.writeArguments(TRANSFORM3D to transform, _RID to spatialContext)
    TransferContext.callMethod(ptr, MethodBindings.createNewAnchorPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as OpenXRAnchorTracker?)
  }

  /**
   * Remove an anchor previously created with [createNewAnchor]. If this anchor was persistent you
   * must first call [unpersistAnchor] and await its callback.
   */
  public final fun removeAnchor(anchorTracker: OpenXRAnchorTracker?): Unit {
    TransferContext.writeArguments(OBJECT to anchorTracker)
    TransferContext.callMethod(ptr, MethodBindings.removeAnchorPtr, NIL)
  }

  /**
   * Changes this anchor into a persistent anchor. This means its location will be stored on the
   * device and the anchor will be restored the next time your application starts. If
   * [persistenceContext] is not specified the default will be used, this requires
   * [ProjectSettings.xr/openxr/extensions/spatialEntity/enableBuiltinAnchorDetection] to be set.
   *
   * **Note:** This is an asynchronous method and returns an [OpenXRFutureResult] object with which
   * to track the status, discarding this object will not cancel the creation process. On success
   * [userCallback] will be called if specified. The result value for this function is a boolean which
   * will be set to `true` on successful completion.
   */
  @JvmOverloads
  public final fun persistAnchor(
    anchorTracker: OpenXRAnchorTracker?,
    persistenceContext: RID = RID(),
    userCallback: Callable = Callable(),
  ): OpenXRFutureResult? {
    TransferContext.writeArguments(OBJECT to anchorTracker, _RID to persistenceContext, CALLABLE to userCallback)
    TransferContext.callMethod(ptr, MethodBindings.persistAnchorPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as OpenXRFutureResult?)
  }

  /**
   * Removes the persistent data from this anchor. The runtime will not recreate the anchor when
   * your application restarts. If [persistenceContext] is not specified the default will be used, this
   * requires [ProjectSettings.xr/openxr/extensions/spatialEntity/enabled] to be set.
   *
   * **Note:** This is an asynchronous method and returns an [OpenXRFutureResult] object with which
   * to track the status, discarding this object will not cancel the creation process. On success
   * [userCallback] will be called if specified. The result value for this function is a boolean which
   * will be set to `true` on successful completion.
   */
  @JvmOverloads
  public final fun unpersistAnchor(
    anchorTracker: OpenXRAnchorTracker?,
    persistenceContext: RID = RID(),
    userCallback: Callable = Callable(),
  ): OpenXRFutureResult? {
    TransferContext.writeArguments(OBJECT to anchorTracker, _RID to persistenceContext, CALLABLE to userCallback)
    TransferContext.callMethod(ptr, MethodBindings.unpersistAnchorPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as OpenXRFutureResult?)
  }

  public enum class PersistenceScope(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Provides the application with read-only access (i.e. application cannot modify this scope) to
     * spatial entities persisted and managed by the system. The application can use the UUID in the
     * persistence component for this scope to correlate entities across spatial contexts and device
     * reboots.
     */
    SYSTEM_MANAGED(1),
    /**
     * Persistence operations and data access is limited to spatial anchors, on the same device, for
     * the same user and same app (using [persistAnchor] and [unpersistAnchor] functions)
     */
    LOCAL_ANCHORS(1000781000),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): PersistenceScope = entries.single { it.`value` == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val isSpatialAnchorSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialAnchorCapability", "is_spatial_anchor_supported", 2240911060)

    internal val isSpatialPersistenceSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialAnchorCapability", "is_spatial_persistence_supported", 2240911060)

    internal val isPersistenceScopeSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialAnchorCapability", "is_persistence_scope_supported", 3651771626)

    internal val createPersistenceContextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialAnchorCapability", "create_persistence_context", 856276630)

    internal val getPersistenceContextHandlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialAnchorCapability", "get_persistence_context_handle", 2198884583)

    internal val freePersistenceContextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialAnchorCapability", "free_persistence_context", 2722037293)

    internal val createNewAnchorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialAnchorCapability", "create_new_anchor", 607100373)

    internal val removeAnchorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialAnchorCapability", "remove_anchor", 3579451518)

    internal val persistAnchorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialAnchorCapability", "persist_anchor", 4244202513)

    internal val unpersistAnchorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRSpatialAnchorCapability", "unpersist_anchor", 4244202513)
  }
}
