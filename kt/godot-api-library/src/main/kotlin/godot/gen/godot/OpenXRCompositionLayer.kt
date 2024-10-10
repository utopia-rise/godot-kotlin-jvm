// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Composition layers allow 2D viewports to be displayed inside of the headset by the XR compositor
 * through special projections that retain their quality. This allows for rendering clear text while
 * keeping the layer at a native resolution.
 * **Note:** If the OpenXR runtime doesn't support the given composition layer type, a fallback mesh
 * can be generated with a [ViewportTexture], in order to emulate the composition layer.
 */
@GodotBaseType
public open class OpenXRCompositionLayer internal constructor() : Node3D() {
  /**
   * The [SubViewport] to render on the composition layer.
   */
  public final inline var layerViewport: SubViewport?
    @JvmName("layerViewportProperty")
    get() = getLayerViewport()
    @JvmName("layerViewportProperty")
    set(`value`) {
      setLayerViewport(value)
    }

  /**
   * The sort order for this composition layer. Higher numbers will be shown in front of lower
   * numbers.
   * **Note:** This will have no effect if a fallback mesh is being used.
   */
  public final inline var sortOrder: Int
    @JvmName("sortOrderProperty")
    get() = getSortOrder()
    @JvmName("sortOrderProperty")
    set(`value`) {
      setSortOrder(value)
    }

  /**
   * Enables the blending the layer using its alpha channel.
   * Can be combined with [Viewport.transparentBg] to give the layer a transparent background.
   */
  public final inline var alphaBlend: Boolean
    @JvmName("alphaBlendProperty")
    get() = getAlphaBlend()
    @JvmName("alphaBlendProperty")
    set(`value`) {
      setAlphaBlend(value)
    }

  /**
   * Enables a technique called "hole punching", which allows putting the composition layer behind
   * the main projection layer (i.e. setting [sortOrder] to a negative value) while "punching a hole"
   * through everything rendered by Godot so that the layer is still visible.
   * This can be used to create the illusion that the composition layer exists in the same 3D space
   * as everything rendered by Godot, allowing objects to appear to pass both behind or in front of the
   * composition layer.
   */
  public final inline var enableHolePunch: Boolean
    @JvmName("enableHolePunchProperty")
    get() = getEnableHolePunch()
    @JvmName("enableHolePunchProperty")
    set(`value`) {
      setEnableHolePunch(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_OPENXRCOMPOSITIONLAYER_INDEX, scriptIndex)
  }

  public final fun setLayerViewport(viewport: SubViewport?): Unit {
    Internals.writeArguments(OBJECT to viewport)
    Internals.callMethod(rawPtr, MethodBindings.setLayerViewportPtr, NIL)
  }

  public final fun getLayerViewport(): SubViewport? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLayerViewportPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as SubViewport?)
  }

  public final fun setEnableHolePunch(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setEnableHolePunchPtr, NIL)
  }

  public final fun getEnableHolePunch(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEnableHolePunchPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSortOrder(order: Int): Unit {
    Internals.writeArguments(LONG to order.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setSortOrderPtr, NIL)
  }

  public final fun getSortOrder(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSortOrderPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setAlphaBlend(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setAlphaBlendPtr, NIL)
  }

  public final fun getAlphaBlend(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAlphaBlendPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns true if the OpenXR runtime natively supports this composition layer type.
   * **Note:** This will only return an accurate result after the OpenXR session has started.
   */
  public final fun isNativelySupported(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isNativelySupportedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns UV coordinates where the given ray intersects with the composition layer. [origin] and
   * [direction] must be in global space.
   * Returns `Vector2(-1.0, -1.0)` if the ray doesn't intersect.
   */
  public final fun intersectsRay(origin: Vector3, direction: Vector3): Vector2 {
    Internals.writeArguments(VECTOR3 to origin, VECTOR3 to direction)
    Internals.callMethod(rawPtr, MethodBindings.intersectsRayPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public companion object

  internal object MethodBindings {
    public val setLayerViewportPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayer", "set_layer_viewport", 3888077664)

    public val getLayerViewportPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayer", "get_layer_viewport", 3750751911)

    public val setEnableHolePunchPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayer", "set_enable_hole_punch", 2586408642)

    public val getEnableHolePunchPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayer", "get_enable_hole_punch", 36873697)

    public val setSortOrderPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayer", "set_sort_order", 1286410249)

    public val getSortOrderPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayer", "get_sort_order", 3905245786)

    public val setAlphaBlendPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayer", "set_alpha_blend", 2586408642)

    public val getAlphaBlendPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayer", "get_alpha_blend", 36873697)

    public val isNativelySupportedPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayer", "is_natively_supported", 36873697)

    public val intersectsRayPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayer", "intersects_ray", 1091262597)
  }
}
