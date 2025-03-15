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
import godot.core.NodePath
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.OBJECT
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

@GodotBaseType
public open class ImporterMeshInstance3D : Node3D() {
  public final inline var mesh: ImporterMesh?
    @JvmName("meshProperty")
    get() = getMesh()
    @JvmName("meshProperty")
    set(`value`) {
      setMesh(value)
    }

  public final inline var skin: Skin?
    @JvmName("skinProperty")
    get() = getSkin()
    @JvmName("skinProperty")
    set(`value`) {
      setSkin(value)
    }

  public final inline var skeletonPath: NodePath
    @JvmName("skeletonPathProperty")
    get() = getSkeletonPath()
    @JvmName("skeletonPathProperty")
    set(`value`) {
      setSkeletonPath(value)
    }

  public final inline var layerMask: Long
    @JvmName("layerMaskProperty")
    get() = getLayerMask()
    @JvmName("layerMaskProperty")
    set(`value`) {
      setLayerMask(value)
    }

  public final inline var castShadow: GeometryInstance3D.ShadowCastingSetting
    @JvmName("castShadowProperty")
    get() = getCastShadowsSetting()
    @JvmName("castShadowProperty")
    set(`value`) {
      setCastShadowsSetting(value)
    }

  public final inline var visibilityRangeBegin: Float
    @JvmName("visibilityRangeBeginProperty")
    get() = getVisibilityRangeBegin()
    @JvmName("visibilityRangeBeginProperty")
    set(`value`) {
      setVisibilityRangeBegin(value)
    }

  public final inline var visibilityRangeBeginMargin: Float
    @JvmName("visibilityRangeBeginMarginProperty")
    get() = getVisibilityRangeBeginMargin()
    @JvmName("visibilityRangeBeginMarginProperty")
    set(`value`) {
      setVisibilityRangeBeginMargin(value)
    }

  public final inline var visibilityRangeEnd: Float
    @JvmName("visibilityRangeEndProperty")
    get() = getVisibilityRangeEnd()
    @JvmName("visibilityRangeEndProperty")
    set(`value`) {
      setVisibilityRangeEnd(value)
    }

  public final inline var visibilityRangeEndMargin: Float
    @JvmName("visibilityRangeEndMarginProperty")
    get() = getVisibilityRangeEndMargin()
    @JvmName("visibilityRangeEndMarginProperty")
    set(`value`) {
      setVisibilityRangeEndMargin(value)
    }

  public final inline var visibilityRangeFadeMode: GeometryInstance3D.VisibilityRangeFadeMode
    @JvmName("visibilityRangeFadeModeProperty")
    get() = getVisibilityRangeFadeMode()
    @JvmName("visibilityRangeFadeModeProperty")
    set(`value`) {
      setVisibilityRangeFadeMode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(290, scriptIndex)
  }

  public final fun setMesh(mesh: ImporterMesh?): Unit {
    TransferContext.writeArguments(OBJECT to mesh)
    TransferContext.callMethod(ptr, MethodBindings.setMeshPtr, NIL)
  }

  public final fun getMesh(): ImporterMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as ImporterMesh?)
  }

  public final fun setSkin(skin: Skin?): Unit {
    TransferContext.writeArguments(OBJECT to skin)
    TransferContext.callMethod(ptr, MethodBindings.setSkinPtr, NIL)
  }

  public final fun getSkin(): Skin? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkinPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Skin?)
  }

  public final fun setSkeletonPath(skeletonPath: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to skeletonPath)
    TransferContext.callMethod(ptr, MethodBindings.setSkeletonPathPtr, NIL)
  }

  public final fun getSkeletonPath(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkeletonPathPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setLayerMask(layerMask: Long): Unit {
    TransferContext.writeArguments(LONG to layerMask)
    TransferContext.callMethod(ptr, MethodBindings.setLayerMaskPtr, NIL)
  }

  public final fun getLayerMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLayerMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final
      fun setCastShadowsSetting(shadowCastingSetting: GeometryInstance3D.ShadowCastingSetting):
      Unit {
    TransferContext.writeArguments(LONG to shadowCastingSetting.id)
    TransferContext.callMethod(ptr, MethodBindings.setCastShadowsSettingPtr, NIL)
  }

  public final fun getCastShadowsSetting(): GeometryInstance3D.ShadowCastingSetting {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCastShadowsSettingPtr, LONG)
    return GeometryInstance3D.ShadowCastingSetting.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setVisibilityRangeEndMargin(distance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to distance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVisibilityRangeEndMarginPtr, NIL)
  }

  public final fun getVisibilityRangeEndMargin(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVisibilityRangeEndMarginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVisibilityRangeEnd(distance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to distance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVisibilityRangeEndPtr, NIL)
  }

  public final fun getVisibilityRangeEnd(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVisibilityRangeEndPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVisibilityRangeBeginMargin(distance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to distance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVisibilityRangeBeginMarginPtr, NIL)
  }

  public final fun getVisibilityRangeBeginMargin(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVisibilityRangeBeginMarginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVisibilityRangeBegin(distance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to distance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVisibilityRangeBeginPtr, NIL)
  }

  public final fun getVisibilityRangeBegin(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVisibilityRangeBeginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVisibilityRangeFadeMode(mode: GeometryInstance3D.VisibilityRangeFadeMode):
      Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setVisibilityRangeFadeModePtr, NIL)
  }

  public final fun getVisibilityRangeFadeMode(): GeometryInstance3D.VisibilityRangeFadeMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVisibilityRangeFadeModePtr, LONG)
    return GeometryInstance3D.VisibilityRangeFadeMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  public object MethodBindings {
    internal val setMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "set_mesh", 2255166972)

    internal val getMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "get_mesh", 3161779525)

    internal val setSkinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "set_skin", 3971435618)

    internal val getSkinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "get_skin", 2074563878)

    internal val setSkeletonPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "set_skeleton_path", 1348162250)

    internal val getSkeletonPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "get_skeleton_path", 4075236667)

    internal val setLayerMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "set_layer_mask", 1286410249)

    internal val getLayerMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "get_layer_mask", 3905245786)

    internal val setCastShadowsSettingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "set_cast_shadows_setting", 856677339)

    internal val getCastShadowsSettingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "get_cast_shadows_setting", 3383019359)

    internal val setVisibilityRangeEndMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "set_visibility_range_end_margin", 373806689)

    internal val getVisibilityRangeEndMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "get_visibility_range_end_margin", 1740695150)

    internal val setVisibilityRangeEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "set_visibility_range_end", 373806689)

    internal val getVisibilityRangeEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "get_visibility_range_end", 1740695150)

    internal val setVisibilityRangeBeginMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "set_visibility_range_begin_margin", 373806689)

    internal val getVisibilityRangeBeginMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "get_visibility_range_begin_margin", 1740695150)

    internal val setVisibilityRangeBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "set_visibility_range_begin", 373806689)

    internal val getVisibilityRangeBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "get_visibility_range_begin", 1740695150)

    internal val setVisibilityRangeFadeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "set_visibility_range_fade_mode", 1440117808)

    internal val getVisibilityRangeFadeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImporterMeshInstance3D", "get_visibility_range_fade_mode", 2067221882)
  }
}
