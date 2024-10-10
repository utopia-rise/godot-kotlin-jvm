// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_OPENXRCOMPOSITIONLAYEREQUIRECT_INDEX: Int = 385

/**
 * An OpenXR composition layer that allows rendering a [SubViewport] on an internal slice of a
 * sphere.
 */
@GodotBaseType
public open class OpenXRCompositionLayerEquirect : OpenXRCompositionLayer() {
  /**
   * The radius of the sphere.
   */
  public final inline var radius: Float
    @JvmName("radiusProperty")
    get() = getRadius()
    @JvmName("radiusProperty")
    set(`value`) {
      setRadius(value)
    }

  /**
   * The central horizontal angle of the sphere. Used to set the width.
   */
  public final inline var centralHorizontalAngle: Float
    @JvmName("centralHorizontalAngleProperty")
    get() = getCentralHorizontalAngle()
    @JvmName("centralHorizontalAngleProperty")
    set(`value`) {
      setCentralHorizontalAngle(value)
    }

  /**
   * The upper vertical angle of the sphere. Used (together with [lowerVerticalAngle]) to set the
   * height.
   */
  public final inline var upperVerticalAngle: Float
    @JvmName("upperVerticalAngleProperty")
    get() = getUpperVerticalAngle()
    @JvmName("upperVerticalAngleProperty")
    set(`value`) {
      setUpperVerticalAngle(value)
    }

  /**
   * The lower vertical angle of the sphere. Used (together with [upperVerticalAngle]) to set the
   * height.
   */
  public final inline var lowerVerticalAngle: Float
    @JvmName("lowerVerticalAngleProperty")
    get() = getLowerVerticalAngle()
    @JvmName("lowerVerticalAngleProperty")
    set(`value`) {
      setLowerVerticalAngle(value)
    }

  /**
   * The number of segments to use in the fallback mesh.
   */
  public final inline var fallbackSegments: Long
    @JvmName("fallbackSegmentsProperty")
    get() = getFallbackSegments()
    @JvmName("fallbackSegmentsProperty")
    set(`value`) {
      setFallbackSegments(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_OPENXRCOMPOSITIONLAYEREQUIRECT_INDEX, scriptIndex)
  }

  public final fun setRadius(radius: Float): Unit {
    Internals.writeArguments(DOUBLE to radius.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRadiusPtr, NIL)
  }

  public final fun getRadius(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRadiusPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setCentralHorizontalAngle(angle: Float): Unit {
    Internals.writeArguments(DOUBLE to angle.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setCentralHorizontalAnglePtr, NIL)
  }

  public final fun getCentralHorizontalAngle(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCentralHorizontalAnglePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setUpperVerticalAngle(angle: Float): Unit {
    Internals.writeArguments(DOUBLE to angle.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setUpperVerticalAnglePtr, NIL)
  }

  public final fun getUpperVerticalAngle(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUpperVerticalAnglePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setLowerVerticalAngle(angle: Float): Unit {
    Internals.writeArguments(DOUBLE to angle.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setLowerVerticalAnglePtr, NIL)
  }

  public final fun getLowerVerticalAngle(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLowerVerticalAnglePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFallbackSegments(segments: Long): Unit {
    Internals.writeArguments(LONG to segments)
    Internals.callMethod(rawPtr, MethodBindings.setFallbackSegmentsPtr, NIL)
  }

  public final fun getFallbackSegments(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFallbackSegmentsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val setRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayerEquirect", "set_radius", 373806689)

    public val getRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayerEquirect", "get_radius", 1740695150)

    public val setCentralHorizontalAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayerEquirect", "set_central_horizontal_angle", 373806689)

    public val getCentralHorizontalAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayerEquirect", "get_central_horizontal_angle", 1740695150)

    public val setUpperVerticalAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayerEquirect", "set_upper_vertical_angle", 373806689)

    public val getUpperVerticalAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayerEquirect", "get_upper_vertical_angle", 1740695150)

    public val setLowerVerticalAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayerEquirect", "set_lower_vertical_angle", 373806689)

    public val getLowerVerticalAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayerEquirect", "get_lower_vertical_angle", 1740695150)

    public val setFallbackSegmentsPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayerEquirect", "set_fallback_segments", 1286410249)

    public val getFallbackSegmentsPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayerEquirect", "get_fallback_segments", 3905245786)
  }
}
