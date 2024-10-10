// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_IMPORTERMESHINSTANCE3D_INDEX: Int = 312

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
    Internals.callConstructor(this, ENGINE_CLASS_IMPORTERMESHINSTANCE3D_INDEX, scriptIndex)
  }

  public final fun setMesh(mesh: ImporterMesh?): Unit {
    Internals.writeArguments(OBJECT to mesh)
    Internals.callMethod(rawPtr, MethodBindings.setMeshPtr, NIL)
  }

  public final fun getMesh(): ImporterMesh? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMeshPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as ImporterMesh?)
  }

  public final fun setSkin(skin: Skin?): Unit {
    Internals.writeArguments(OBJECT to skin)
    Internals.callMethod(rawPtr, MethodBindings.setSkinPtr, NIL)
  }

  public final fun getSkin(): Skin? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSkinPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Skin?)
  }

  public final fun setSkeletonPath(skeletonPath: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to skeletonPath)
    Internals.callMethod(rawPtr, MethodBindings.setSkeletonPathPtr, NIL)
  }

  public final fun getSkeletonPath(): NodePath {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSkeletonPathPtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setLayerMask(layerMask: Long): Unit {
    Internals.writeArguments(LONG to layerMask)
    Internals.callMethod(rawPtr, MethodBindings.setLayerMaskPtr, NIL)
  }

  public final fun getLayerMask(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLayerMaskPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final
      fun setCastShadowsSetting(shadowCastingSetting: GeometryInstance3D.ShadowCastingSetting):
      Unit {
    Internals.writeArguments(LONG to shadowCastingSetting.id)
    Internals.callMethod(rawPtr, MethodBindings.setCastShadowsSettingPtr, NIL)
  }

  public final fun getCastShadowsSetting(): GeometryInstance3D.ShadowCastingSetting {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCastShadowsSettingPtr, LONG)
    return GeometryInstance3D.ShadowCastingSetting.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setVisibilityRangeEndMargin(distance: Float): Unit {
    Internals.writeArguments(DOUBLE to distance.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setVisibilityRangeEndMarginPtr, NIL)
  }

  public final fun getVisibilityRangeEndMargin(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVisibilityRangeEndMarginPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVisibilityRangeEnd(distance: Float): Unit {
    Internals.writeArguments(DOUBLE to distance.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setVisibilityRangeEndPtr, NIL)
  }

  public final fun getVisibilityRangeEnd(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVisibilityRangeEndPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVisibilityRangeBeginMargin(distance: Float): Unit {
    Internals.writeArguments(DOUBLE to distance.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setVisibilityRangeBeginMarginPtr, NIL)
  }

  public final fun getVisibilityRangeBeginMargin(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVisibilityRangeBeginMarginPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVisibilityRangeBegin(distance: Float): Unit {
    Internals.writeArguments(DOUBLE to distance.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setVisibilityRangeBeginPtr, NIL)
  }

  public final fun getVisibilityRangeBegin(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVisibilityRangeBeginPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVisibilityRangeFadeMode(mode: GeometryInstance3D.VisibilityRangeFadeMode):
      Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setVisibilityRangeFadeModePtr, NIL)
  }

  public final fun getVisibilityRangeFadeMode(): GeometryInstance3D.VisibilityRangeFadeMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVisibilityRangeFadeModePtr, LONG)
    return GeometryInstance3D.VisibilityRangeFadeMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val setMeshPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMeshInstance3D", "set_mesh", 2255166972)

    public val getMeshPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMeshInstance3D", "get_mesh", 3161779525)

    public val setSkinPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMeshInstance3D", "set_skin", 3971435618)

    public val getSkinPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMeshInstance3D", "get_skin", 2074563878)

    public val setSkeletonPathPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMeshInstance3D", "set_skeleton_path", 1348162250)

    public val getSkeletonPathPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMeshInstance3D", "get_skeleton_path", 4075236667)

    public val setLayerMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMeshInstance3D", "set_layer_mask", 1286410249)

    public val getLayerMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMeshInstance3D", "get_layer_mask", 3905245786)

    public val setCastShadowsSettingPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMeshInstance3D", "set_cast_shadows_setting", 856677339)

    public val getCastShadowsSettingPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMeshInstance3D", "get_cast_shadows_setting", 3383019359)

    public val setVisibilityRangeEndMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMeshInstance3D", "set_visibility_range_end_margin", 373806689)

    public val getVisibilityRangeEndMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMeshInstance3D", "get_visibility_range_end_margin", 1740695150)

    public val setVisibilityRangeEndPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMeshInstance3D", "set_visibility_range_end", 373806689)

    public val getVisibilityRangeEndPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMeshInstance3D", "get_visibility_range_end", 1740695150)

    public val setVisibilityRangeBeginMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMeshInstance3D", "set_visibility_range_begin_margin", 373806689)

    public val getVisibilityRangeBeginMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMeshInstance3D", "get_visibility_range_begin_margin", 1740695150)

    public val setVisibilityRangeBeginPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMeshInstance3D", "set_visibility_range_begin", 373806689)

    public val getVisibilityRangeBeginPtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMeshInstance3D", "get_visibility_range_begin", 1740695150)

    public val setVisibilityRangeFadeModePtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMeshInstance3D", "set_visibility_range_fade_mode", 1440117808)

    public val getVisibilityRangeFadeModePtr: VoidPtr =
        Internals.getMethodBindPtr("ImporterMeshInstance3D", "get_visibility_range_fade_mode", 2067221882)
  }
}
