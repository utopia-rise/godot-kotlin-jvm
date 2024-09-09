// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class ImporterMeshInstance3D : Node3D() {
  public var mesh: ImporterMesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMeshPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as ImporterMesh?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMeshPtr, NIL)
    }

  public var skin: Skin?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkinPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Skin?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSkinPtr, NIL)
    }

  public var skeletonPath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkeletonPathPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSkeletonPathPtr, NIL)
    }

  public var layerMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLayerMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLayerMaskPtr, NIL)
    }

  public var castShadow: GeometryInstance3D.ShadowCastingSetting
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCastShadowsSettingPtr, LONG)
      return GeometryInstance3D.ShadowCastingSetting.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCastShadowsSettingPtr, NIL)
    }

  public var visibilityRangeBegin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityRangeBeginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityRangeBeginPtr, NIL)
    }

  public var visibilityRangeBeginMargin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityRangeBeginMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityRangeBeginMarginPtr, NIL)
    }

  public var visibilityRangeEnd: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityRangeEndPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityRangeEndPtr, NIL)
    }

  public var visibilityRangeEndMargin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityRangeEndMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityRangeEndMarginPtr, NIL)
    }

  public var visibilityRangeFadeMode: GeometryInstance3D.VisibilityRangeFadeMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityRangeFadeModePtr, LONG)
      return GeometryInstance3D.VisibilityRangeFadeMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityRangeFadeModePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_IMPORTERMESHINSTANCE3D, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "set_mesh", 2255166972)

    public val getMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "get_mesh", 3161779525)

    public val setSkinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "set_skin", 3971435618)

    public val getSkinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "get_skin", 2074563878)

    public val setSkeletonPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "set_skeleton_path", 1348162250)

    public val getSkeletonPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "get_skeleton_path", 4075236667)

    public val setLayerMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "set_layer_mask", 1286410249)

    public val getLayerMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "get_layer_mask", 3905245786)

    public val setCastShadowsSettingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "set_cast_shadows_setting", 856677339)

    public val getCastShadowsSettingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "get_cast_shadows_setting", 3383019359)

    public val setVisibilityRangeEndMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "set_visibility_range_end_margin", 373806689)

    public val getVisibilityRangeEndMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "get_visibility_range_end_margin", 1740695150)

    public val setVisibilityRangeEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "set_visibility_range_end", 373806689)

    public val getVisibilityRangeEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "get_visibility_range_end", 1740695150)

    public val setVisibilityRangeBeginMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "set_visibility_range_begin_margin", 373806689)

    public val getVisibilityRangeBeginMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "get_visibility_range_begin_margin", 1740695150)

    public val setVisibilityRangeBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "set_visibility_range_begin", 373806689)

    public val getVisibilityRangeBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "get_visibility_range_begin", 1740695150)

    public val setVisibilityRangeFadeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "set_visibility_range_fade_mode", 1440117808)

    public val getVisibilityRangeFadeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "get_visibility_range_fade_mode", 2067221882)
  }
}
