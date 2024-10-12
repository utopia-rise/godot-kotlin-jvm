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

private const val ENGINE_CLASS_OPENXRCOMPOSITIONLAYERCYLINDER_INDEX: Int = 425

/**
 * An OpenXR composition layer that allows rendering a [SubViewport] on an internal slice of a
 * cylinder.
 */
@GodotBaseType
public open class OpenXRCompositionLayerCylinder : OpenXRCompositionLayer() {
  /**
   * The radius of the cylinder.
   */
  public final inline var radius: Float
    @JvmName("radiusProperty")
    get() = getRadius()
    @JvmName("radiusProperty")
    set(`value`) {
      setRadius(value)
    }

  /**
   * The aspect ratio of the slice. Used to set the height relative to the width.
   */
  public final inline var aspectRatio: Float
    @JvmName("aspectRatioProperty")
    get() = getAspectRatio()
    @JvmName("aspectRatioProperty")
    set(`value`) {
      setAspectRatio(value)
    }

  /**
   * The central angle of the cylinder. Used to set the width.
   */
  public final inline var centralAngle: Float
    @JvmName("centralAngleProperty")
    get() = getCentralAngle()
    @JvmName("centralAngleProperty")
    set(`value`) {
      setCentralAngle(value)
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
    Internals.callConstructor(this, ENGINE_CLASS_OPENXRCOMPOSITIONLAYERCYLINDER_INDEX, scriptIndex)
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

  public final fun setAspectRatio(aspectRatio: Float): Unit {
    Internals.writeArguments(DOUBLE to aspectRatio.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAspectRatioPtr, NIL)
  }

  public final fun getAspectRatio(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAspectRatioPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setCentralAngle(angle: Float): Unit {
    Internals.writeArguments(DOUBLE to angle.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setCentralAnglePtr, NIL)
  }

  public final fun getCentralAngle(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCentralAnglePtr, DOUBLE)
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

  public object MethodBindings {
    internal val setRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayerCylinder", "set_radius", 373806689)

    internal val getRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayerCylinder", "get_radius", 1740695150)

    internal val setAspectRatioPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayerCylinder", "set_aspect_ratio", 373806689)

    internal val getAspectRatioPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayerCylinder", "get_aspect_ratio", 1740695150)

    internal val setCentralAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayerCylinder", "set_central_angle", 373806689)

    internal val getCentralAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayerCylinder", "get_central_angle", 1740695150)

    internal val setFallbackSegmentsPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayerCylinder", "set_fallback_segments", 1286410249)

    internal val getFallbackSegmentsPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRCompositionLayerCylinder", "get_fallback_segments", 3905245786)
  }
}
