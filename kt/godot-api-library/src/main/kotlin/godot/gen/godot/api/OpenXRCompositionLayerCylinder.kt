// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    createNativeObject(ENGINECLASS_OPENXRCOMPOSITIONLAYERCYLINDER, scriptIndex)
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

  public final fun setAspectRatio(aspectRatio: Float): Unit {
    TransferContext.writeArguments(DOUBLE to aspectRatio.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAspectRatioPtr, NIL)
  }

  public final fun getAspectRatio(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAspectRatioPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setCentralAngle(angle: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setCentralAnglePtr, NIL)
  }

  public final fun getCentralAngle(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCentralAnglePtr, DOUBLE)
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
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerCylinder", "set_radius", 373806689)

    public val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerCylinder", "get_radius", 1740695150)

    public val setAspectRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerCylinder", "set_aspect_ratio", 373806689)

    public val getAspectRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerCylinder", "get_aspect_ratio", 1740695150)

    public val setCentralAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerCylinder", "set_central_angle", 373806689)

    public val getCentralAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerCylinder", "get_central_angle", 1740695150)

    public val setFallbackSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerCylinder", "set_fallback_segments", 1286410249)

    public val getFallbackSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRCompositionLayerCylinder", "get_fallback_segments", 3905245786)
  }
}
