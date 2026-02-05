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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.asCachedNodePath
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A [SkeletonModifier3D] for aligning bones along a [Path3D]. The smoothness of the fitting depends
 * on the [Curve3D.bakeInterval].
 *
 * If you want the [Path3D] to attach to a specific bone, it is recommended to place a
 * [ModifierBoneTarget3D] before the [SplineIK3D] in the [SkeletonModifier3D] list (children of the
 * [Skeleton3D]), and then place a [Path3D] as the [ModifierBoneTarget3D]'s child.
 *
 * Bone twist is determined based on the [Curve3D.getPointTilt].
 *
 * If the root bone joint and the start point of the [Curve3D] are separated, it assumes that there
 * is a linear line segment between them. This means that the vector pointing toward the start point of
 * the [Curve3D] takes precedence over the shortest intersection point along the [Curve3D].
 *
 * If the end bone joint exceeds the path length, it is bent as close as possible to the end point
 * of the [Curve3D].
 */
@GodotBaseType
public open class SplineIK3D : ChainIK3D() {
  /**
   * The number of settings.
   */
  public final inline var settingCount: Int
    @JvmName("settingCountProperty")
    get() = getSettingCount()
    @JvmName("settingCountProperty")
    set(`value`) {
      setSettingCount(value)
    }

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(639, scriptPtr)
  }

  /**
   * Sets the node path of the [Path3D] which is describing the path.
   */
  public final fun setPath3d(index: Int, path3d: NodePath): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), NODE_PATH to path3d)
    TransferContext.callMethod(ptr, MethodBindings.setPath3dPtr, NIL)
  }

  /**
   * Returns the node path of the [Path3D] which is describing the path.
   */
  public final fun getPath3d(index: Int): NodePath {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getPath3dPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Sets if the tilt property of the [Curve3D] should affect the bone twist.
   */
  public final fun setTiltEnabled(index: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setTiltEnabledPtr, NIL)
  }

  /**
   * Returns if the tilt property of the [Curve3D] affects the bone twist.
   */
  public final fun isTiltEnabled(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isTiltEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If [size] is greater than `0`, the tilt is interpolated between [size] start bones from the
   * start point of the [Curve3D] when they are apart.
   *
   * If [size] is equal `0`, the tilts between the root bone head and the start point of the
   * [Curve3D] are unified with a tilt of the start point of the [Curve3D].
   *
   * If [size] is less than `0`, the tilts between the root bone and the start point of the
   * [Curve3D] are `0.0`.
   */
  public final fun setTiltFadeIn(index: Int, size: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to size.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setTiltFadeInPtr, NIL)
  }

  /**
   * Returns the tilt interpolation method used between the root bone and the start point of the
   * [Curve3D] when they are apart. See also [setTiltFadeIn].
   */
  public final fun getTiltFadeIn(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTiltFadeInPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * If [size] is greater than `0`, the tilt is interpolated between [size] end bones from the end
   * point of the [Curve3D] when they are apart.
   *
   * If [size] is equal `0`, the tilts between the end bone tail and the end point of the [Curve3D]
   * are unified with a tilt of the end point of the [Curve3D].
   *
   * If [size] is less than `0`, the tilts between the end bone and the end point of the [Curve3D]
   * are `0.0`.
   */
  public final fun setTiltFadeOut(index: Int, size: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to size.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setTiltFadeOutPtr, NIL)
  }

  /**
   * Returns the tilt interpolation method used between the end bone and the end point of the
   * [Curve3D] when they are apart. See also [setTiltFadeOut].
   */
  public final fun getTiltFadeOut(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTiltFadeOutPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the node path of the [Path3D] which is describing the path.
   */
  public final fun setPath3d(index: Int, path3d: String) =
      setPath3d(index, path3d.asCachedNodePath())

  public companion object

  public object MethodBindings {
    internal val setPath3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplineIK3D", "set_path_3d", 2761262315)

    internal val getPath3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplineIK3D", "get_path_3d", 408788394)

    internal val setTiltEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplineIK3D", "set_tilt_enabled", 300928843)

    internal val isTiltEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplineIK3D", "is_tilt_enabled", 1116898809)

    internal val setTiltFadeInPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplineIK3D", "set_tilt_fade_in", 3937882851)

    internal val getTiltFadeInPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplineIK3D", "get_tilt_fade_in", 923996154)

    internal val setTiltFadeOutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplineIK3D", "set_tilt_fade_out", 3937882851)

    internal val getTiltFadeOutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SplineIK3D", "get_tilt_fade_out", 923996154)
  }
}
