// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * An OpenXR composition layer that allows rendering a [SubViewport] on an internal slice of a
 * sphere.
 */
@GodotBaseType
public open class OpenXRCompositionLayerEquirect : OpenXRCompositionLayer() {
  /**
   * The radius of the sphere.
   */
  public var radius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRadiusPtr, NIL)
    }

  /**
   * The central horizontal angle of the sphere. Used to set the width.
   */
  public var centralHorizontalAngle: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCentralHorizontalAnglePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCentralHorizontalAnglePtr, NIL)
    }

  /**
   * The upper vertical angle of the sphere. Used (together with [lowerVerticalAngle]) to set the
   * height.
   */
  public var upperVerticalAngle: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUpperVerticalAnglePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setUpperVerticalAnglePtr, NIL)
    }

  /**
   * The lower vertical angle of the sphere. Used (together with [upperVerticalAngle]) to set the
   * height.
   */
  public var lowerVerticalAngle: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLowerVerticalAnglePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLowerVerticalAnglePtr, NIL)
    }

  /**
   * The number of segments to use in the fallback mesh.
   */
  public var fallbackSegments: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFallbackSegmentsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFallbackSegmentsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OPENXRCOMPOSITIONLAYEREQUIRECT, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerEquirect", "set_radius")

    public val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerEquirect", "get_radius")

    public val setCentralHorizontalAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerEquirect", "set_central_horizontal_angle")

    public val getCentralHorizontalAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerEquirect", "get_central_horizontal_angle")

    public val setUpperVerticalAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerEquirect", "set_upper_vertical_angle")

    public val getUpperVerticalAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerEquirect", "get_upper_vertical_angle")

    public val setLowerVerticalAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerEquirect", "set_lower_vertical_angle")

    public val getLowerVerticalAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerEquirect", "get_lower_vertical_angle")

    public val setFallbackSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerEquirect", "set_fallback_segments")

    public val getFallbackSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerEquirect", "get_fallback_segments")
  }
}
