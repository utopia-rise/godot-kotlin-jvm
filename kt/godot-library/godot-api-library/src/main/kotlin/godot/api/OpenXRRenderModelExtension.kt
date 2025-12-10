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
import godot.core.PackedStringArray
import godot.core.RID
import godot.core.Signal1
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import godot.core.VariantParser.TRANSFORM3D
import godot.core.VariantParser._RID
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * This class implements the OpenXR Render Model Extension, if enabled it will maintain a list of
 * active render models and provides an interface to the render model data.
 */
@GodotBaseType
public open class OpenXRRenderModelExtension : OpenXRExtensionWrapper() {
  /**
   * Emitted when a new render model is added.
   */
  public val renderModelAdded: Signal1<RID> by Signal1

  /**
   * Emitted when a render model is removed.
   */
  public val renderModelRemoved: Signal1<RID> by Signal1

  /**
   * Emitted when the top level path associated with a render model changed.
   */
  public val renderModelTopLevelPathChanged: Signal1<RID> by Signal1

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(444, scriptPtr)
  }

  /**
   * Returns `true` if OpenXR's render model extension is supported and enabled.
   *
   * **Note:** This only returns a valid value after OpenXR has been initialized.
   */
  public final fun isActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Creates a render model object within OpenXR using a render model id.
   *
   * **Note:** This function is exposed for dependent OpenXR extensions that provide render model
   * ids to be used with the render model extension.
   */
  public final fun renderModelCreate(renderModelId: Long): RID {
    TransferContext.writeArguments(LONG to renderModelId)
    TransferContext.callMethod(ptr, MethodBindings.renderModelCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Destroys a render model object within OpenXR that was previously created with
   * [renderModelCreate].
   *
   * **Note:** This function is exposed for dependent OpenXR extensions that provide render model
   * ids to be used with the render model extension.
   */
  public final fun renderModelDestroy(renderModel: RID): Unit {
    TransferContext.writeArguments(_RID to renderModel)
    TransferContext.callMethod(ptr, MethodBindings.renderModelDestroyPtr, NIL)
  }

  /**
   * Returns an array of all currently active render models registered with this extension.
   */
  public final fun renderModelGetAll(): VariantArray<RID> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.renderModelGetAllPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<RID>)
  }

  /**
   * Returns an instance of a subscene that contains all [MeshInstance3D] nodes that allow you to
   * visualize the render model.
   */
  public final fun renderModelNewSceneInstance(renderModel: RID): Node3D? {
    TransferContext.writeArguments(_RID to renderModel)
    TransferContext.callMethod(ptr, MethodBindings.renderModelNewSceneInstancePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Node3D?)
  }

  /**
   * Returns a list of active subaction paths for this [renderModel].
   *
   * **Note:** If different devices are bound to your actions than available in suggested
   * interaction bindings, this information shows paths related to the interaction bindings being
   * mimicked by that device.
   */
  public final fun renderModelGetSubactionPaths(renderModel: RID): PackedStringArray {
    TransferContext.writeArguments(_RID to renderModel)
    TransferContext.callMethod(ptr, MethodBindings.renderModelGetSubactionPathsPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns the top level path associated with this [renderModel]. If provided this identifies
   * whether the render model is associated with the player's hands or other body part.
   */
  public final fun renderModelGetTopLevelPath(renderModel: RID): String {
    TransferContext.writeArguments(_RID to renderModel)
    TransferContext.callMethod(ptr, MethodBindings.renderModelGetTopLevelPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the tracking confidence of the tracking data for the render model.
   */
  public final fun renderModelGetConfidence(renderModel: RID): XRPose.TrackingConfidence {
    TransferContext.writeArguments(_RID to renderModel)
    TransferContext.callMethod(ptr, MethodBindings.renderModelGetConfidencePtr, LONG)
    return XRPose.TrackingConfidence.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the root transform of a render model. This is the tracked position relative to our
   * [XROrigin3D] node.
   */
  public final fun renderModelGetRootTransform(renderModel: RID): Transform3D {
    TransferContext.writeArguments(_RID to renderModel)
    TransferContext.callMethod(ptr, MethodBindings.renderModelGetRootTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Returns the number of animatable nodes this render model has.
   */
  public final fun renderModelGetAnimatableNodeCount(renderModel: RID): Long {
    TransferContext.writeArguments(_RID to renderModel)
    TransferContext.callMethod(ptr, MethodBindings.renderModelGetAnimatableNodeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the name of the given animatable node.
   */
  public final fun renderModelGetAnimatableNodeName(renderModel: RID, index: Long): String {
    TransferContext.writeArguments(_RID to renderModel, LONG to index)
    TransferContext.callMethod(ptr, MethodBindings.renderModelGetAnimatableNodeNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if this animatable node should be visible.
   */
  public final fun renderModelIsAnimatableNodeVisible(renderModel: RID, index: Long): Boolean {
    TransferContext.writeArguments(_RID to renderModel, LONG to index)
    TransferContext.callMethod(ptr, MethodBindings.renderModelIsAnimatableNodeVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the current local transform for an animatable node. This is updated every frame.
   */
  public final fun renderModelGetAnimatableNodeTransform(renderModel: RID, index: Long):
      Transform3D {
    TransferContext.writeArguments(_RID to renderModel, LONG to index)
    TransferContext.callMethod(ptr, MethodBindings.renderModelGetAnimatableNodeTransformPtr,
        TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  public companion object

  public object MethodBindings {
    internal val isActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRRenderModelExtension", "is_active", 36873697)

    internal val renderModelCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRRenderModelExtension", "render_model_create", 937000113)

    internal val renderModelDestroyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRRenderModelExtension", "render_model_destroy", 2722037293)

    internal val renderModelGetAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRRenderModelExtension", "render_model_get_all", 2915620761)

    internal val renderModelNewSceneInstancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRRenderModelExtension", "render_model_new_scene_instance", 788010739)

    internal val renderModelGetSubactionPathsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRRenderModelExtension", "render_model_get_subaction_paths", 2801473409)

    internal val renderModelGetTopLevelPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRRenderModelExtension", "render_model_get_top_level_path", 642473191)

    internal val renderModelGetConfidencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRRenderModelExtension", "render_model_get_confidence", 2350330949)

    internal val renderModelGetRootTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRRenderModelExtension", "render_model_get_root_transform", 1128465797)

    internal val renderModelGetAnimatableNodeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRRenderModelExtension", "render_model_get_animatable_node_count", 2198884583)

    internal val renderModelGetAnimatableNodeNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRRenderModelExtension", "render_model_get_animatable_node_name", 1464764419)

    internal val renderModelIsAnimatableNodeVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRRenderModelExtension", "render_model_is_animatable_node_visible", 3120086654)

    internal val renderModelGetAnimatableNodeTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRRenderModelExtension", "render_model_get_animatable_node_transform", 1050775521)
  }
}
