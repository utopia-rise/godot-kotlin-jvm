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
 * cylinder.
 */
@GodotBaseType
public open class OpenXRCompositionLayerCylinder : OpenXRCompositionLayer() {
  /**
   * The radius of the cylinder.
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
   * The aspect ratio of the slice. Used to set the height relative to the width.
   */
  public var aspectRatio: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAspectRatioPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAspectRatioPtr, NIL)
    }

  /**
   * The central angle of the cylinder. Used to set the width.
   */
  public var centralAngle: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCentralAnglePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCentralAnglePtr, NIL)
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
    callConstructor(ENGINECLASS_OPENXRCOMPOSITIONLAYERCYLINDER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerCylinder", "set_radius")

    public val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerCylinder", "get_radius")

    public val setAspectRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerCylinder", "set_aspect_ratio")

    public val getAspectRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerCylinder", "get_aspect_ratio")

    public val setCentralAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerCylinder", "set_central_angle")

    public val getCentralAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerCylinder", "get_central_angle")

    public val setFallbackSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerCylinder", "set_fallback_segments")

    public val getFallbackSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerCylinder", "get_fallback_segments")
  }
}
