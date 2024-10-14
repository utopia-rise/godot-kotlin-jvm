// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.TypeManager
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    callConstructor(ENGINECLASS_OPENXRCOMPOSITIONLAYEREQUIRECT, scriptIndex)
  }

  public final fun setRadius(radius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRadiusPtr, NIL)
  }

  public final fun getRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setCentralHorizontalAngle(angle: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setCentralHorizontalAnglePtr, NIL)
  }

  public final fun getCentralHorizontalAngle(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCentralHorizontalAnglePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setUpperVerticalAngle(angle: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setUpperVerticalAnglePtr, NIL)
  }

  public final fun getUpperVerticalAngle(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUpperVerticalAnglePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setLowerVerticalAngle(angle: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setLowerVerticalAnglePtr, NIL)
  }

  public final fun getLowerVerticalAngle(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLowerVerticalAnglePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFallbackSegments(segments: Long): Unit {
    TransferContext.writeArguments(LONG to segments)
    TransferContext.callMethod(ptr, MethodBindings.setFallbackSegmentsPtr, NIL)
  }

  public final fun getFallbackSegments(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFallbackSegmentsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerEquirect", "set_radius", 373806689)

    public val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerEquirect", "get_radius", 1740695150)

    public val setCentralHorizontalAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerEquirect", "set_central_horizontal_angle", 373806689)

    public val getCentralHorizontalAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerEquirect", "get_central_horizontal_angle", 1740695150)

    public val setUpperVerticalAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerEquirect", "set_upper_vertical_angle", 373806689)

    public val getUpperVerticalAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerEquirect", "get_upper_vertical_angle", 1740695150)

    public val setLowerVerticalAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerEquirect", "set_lower_vertical_angle", 373806689)

    public val getLowerVerticalAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerEquirect", "get_lower_vertical_angle", 1740695150)

    public val setFallbackSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerEquirect", "set_fallback_segments", 1286410249)

    public val getFallbackSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerEquirect", "get_fallback_segments", 3905245786)
  }
}
