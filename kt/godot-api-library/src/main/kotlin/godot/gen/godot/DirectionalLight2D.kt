// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_DIRECTIONALLIGHT2D_INDEX: Int = 227

/**
 * A directional light is a type of [Light2D] node that models an infinite number of parallel rays
 * covering the entire scene. It is used for lights with strong intensity that are located far away
 * from the scene (for example: to model sunlight or moonlight).
 * **Note:** [DirectionalLight2D] does not support light cull masks (but it supports shadow cull
 * masks). It will always light up 2D nodes, regardless of the 2D node's [CanvasItem.lightMask].
 */
@GodotBaseType
public open class DirectionalLight2D : Light2D() {
  /**
   * The height of the light. Used with 2D normal mapping. Ranges from 0 (parallel to the plane) to
   * 1 (perpendicular to the plane).
   */
  public final inline var height: Float
    @JvmName("heightProperty")
    get() = getHeight()
    @JvmName("heightProperty")
    set(`value`) {
      setHeight(value)
    }

  /**
   * The maximum distance from the camera center objects can be before their shadows are culled (in
   * pixels). Decreasing this value can prevent objects located outside the camera from casting shadows
   * (while also improving performance). [Camera2D.zoom] is not taken into account by [maxDistance],
   * which means that at higher zoom values, shadows will appear to fade out sooner when zooming onto a
   * given point.
   */
  public final inline var maxDistance: Float
    @JvmName("maxDistanceProperty")
    get() = getMaxDistance()
    @JvmName("maxDistanceProperty")
    set(`value`) {
      setMaxDistance(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_DIRECTIONALLIGHT2D_INDEX, scriptIndex)
  }

  public final fun setMaxDistance(pixels: Float): Unit {
    Internals.writeArguments(DOUBLE to pixels.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setMaxDistancePtr, NIL)
  }

  public final fun getMaxDistance(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxDistancePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setMaxDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("DirectionalLight2D", "set_max_distance", 373806689)

    public val getMaxDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("DirectionalLight2D", "get_max_distance", 1740695150)
  }
}
