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
import godot.core.Dictionary
import godot.core.RID
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR2I
import godot.core.VariantParser._RID
import godot.core.Vector2i
import kotlin.Any
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * An automatically scalable [Texture2D] based on an SVG image. [DPITexture]s are used to
 * automatically re-rasterize icons and other texture based UI theme elements to match viewport scale
 * and font oversampling. See also [ProjectSettings.display/window/stretch/mode] ("canvas_items" mode)
 * and [Viewport.oversamplingOverride].
 */
@GodotBaseType
public open class DPITexture : Texture2D() {
  /**
   * Texture scale. `1.0` is the original SVG size. Higher values result in a larger image.
   */
  public final inline var baseScale: Float
    @JvmName("baseScaleProperty")
    get() = getBaseScale()
    @JvmName("baseScaleProperty")
    set(`value`) {
      setBaseScale(value)
    }

  /**
   * Overrides texture saturation.
   */
  public final inline var saturation: Float
    @JvmName("saturationProperty")
    get() = getSaturation()
    @JvmName("saturationProperty")
    set(`value`) {
      setSaturation(value)
    }

  /**
   * If set, remaps texture colors according to [Color]-[Color] map.
   */
  public final inline var colorMap: Dictionary<Any?, Any?>
    @JvmName("colorMapProperty")
    get() = getColorMap()
    @JvmName("colorMapProperty")
    set(`value`) {
      setColorMap(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(197, scriptIndex)
  }

  /**
   * Sets SVG source code.
   */
  public final fun setSource(source: String): Unit {
    TransferContext.writeArguments(STRING to source)
    TransferContext.callMethod(ptr, MethodBindings.setSourcePtr, NIL)
  }

  /**
   * Returns SVG source code.
   */
  public final fun getSource(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSourcePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setBaseScale(baseScale: Float): Unit {
    TransferContext.writeArguments(DOUBLE to baseScale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setBaseScalePtr, NIL)
  }

  public final fun getBaseScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBaseScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSaturation(saturation: Float): Unit {
    TransferContext.writeArguments(DOUBLE to saturation.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSaturationPtr, NIL)
  }

  public final fun getSaturation(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSaturationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setColorMap(colorMap: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(DICTIONARY to colorMap)
    TransferContext.callMethod(ptr, MethodBindings.setColorMapPtr, NIL)
  }

  public final fun getColorMap(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColorMapPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Resizes the texture to the specified dimensions.
   */
  public final fun setSizeOverride(size: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(ptr, MethodBindings.setSizeOverridePtr, NIL)
  }

  /**
   * Returns the [RID] of the texture rasterized to match the oversampling of the currently drawn
   * canvas item.
   */
  public final fun getScaledRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getScaledRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getWidth(): Int {
    throw NotImplementedError("DPITexture::_getWidth can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getHeight(): Int {
    throw NotImplementedError("DPITexture::_getHeight can't be called from the JVM.")
  }

  public companion object {
    /**
     * Creates a new [DPITexture] and initializes it by allocating and setting the SVG data from
     * string.
     */
    @JvmOverloads
    @JvmStatic
    public final fun createFromString(
      source: String,
      scale: Float = 1.0f,
      saturation: Float = 1.0f,
      colorMap: Dictionary<Any?, Any?> = Dictionary(),
    ): DPITexture? {
      TransferContext.writeArguments(STRING to source, DOUBLE to scale.toDouble(), DOUBLE to saturation.toDouble(), DICTIONARY to colorMap)
      TransferContext.callMethod(0, MethodBindings.createFromStringPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as DPITexture?)
    }
  }

  public object MethodBindings {
    internal val createFromStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DPITexture", "create_from_string", 755140520)

    internal val setSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DPITexture", "set_source", 83702148)

    internal val getSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DPITexture", "get_source", 201670096)

    internal val setBaseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DPITexture", "set_base_scale", 373806689)

    internal val getBaseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DPITexture", "get_base_scale", 1740695150)

    internal val setSaturationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DPITexture", "set_saturation", 373806689)

    internal val getSaturationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DPITexture", "get_saturation", 1740695150)

    internal val setColorMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DPITexture", "set_color_map", 4155329257)

    internal val getColorMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DPITexture", "get_color_map", 3102165223)

    internal val setSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DPITexture", "set_size_override", 1130785943)

    internal val getScaledRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DPITexture", "get_scaled_rid", 2944877500)
  }
}
