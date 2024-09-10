// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

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
  public var layerViewport: SubViewport?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLayerViewportPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as SubViewport?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLayerViewportPtr, NIL)
    }

  /**
   * The sort order for this composition layer. Higher numbers will be shown in front of lower
   * numbers.
   * **Note:** This will have no effect if a fallback mesh is being used.
   */
  public var sortOrder: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSortOrderPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSortOrderPtr, NIL)
    }

  /**
   * Enables the blending the layer using its alpha channel.
   * Can be combined with [Viewport.transparentBg] to give the layer a transparent background.
   */
  public var alphaBlend: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlphaBlendPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAlphaBlendPtr, NIL)
    }

  /**
   * Enables a technique called "hole punching", which allows putting the composition layer behind
   * the main projection layer (i.e. setting [sortOrder] to a negative value) while "punching a hole"
   * through everything rendered by Godot so that the layer is still visible.
   * This can be used to create the illusion that the composition layer exists in the same 3D space
   * as everything rendered by Godot, allowing objects to appear to pass both behind or in front of the
   * composition layer.
   */
  public var enableHolePunch: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnableHolePunchPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableHolePunchPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_OPENXRCOMPOSITIONLAYER, scriptIndex)
  }

  /**
   * Returns true if the OpenXR runtime natively supports this composition layer type.
   * **Note:** This will only return an accurate result after the OpenXR session has started.
   */
  public fun isNativelySupported(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isNativelySupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns UV coordinates where the given ray intersects with the composition layer. [origin] and
   * [direction] must be in global space.
   * Returns `Vector2(-1.0, -1.0)` if the ray doesn't intersect.
   */
  public fun intersectsRay(origin: Vector3, direction: Vector3): Vector2 {
    TransferContext.writeArguments(VECTOR3 to origin, VECTOR3 to direction)
    TransferContext.callMethod(rawPtr, MethodBindings.intersectsRayPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public companion object

  internal object MethodBindings {
    public val setLayerViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "set_layer_viewport", 3888077664)

    public val getLayerViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "get_layer_viewport", 3750751911)

    public val setEnableHolePunchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "set_enable_hole_punch", 2586408642)

    public val getEnableHolePunchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "get_enable_hole_punch", 36873697)

    public val setSortOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "set_sort_order", 1286410249)

    public val getSortOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "get_sort_order", 3905245786)

    public val setAlphaBlendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "set_alpha_blend", 2586408642)

    public val getAlphaBlendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "get_alpha_blend", 36873697)

    public val isNativelySupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "is_natively_supported", 36873697)

    public val intersectsRayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayer", "intersects_ray", 1091262597)
  }
}
