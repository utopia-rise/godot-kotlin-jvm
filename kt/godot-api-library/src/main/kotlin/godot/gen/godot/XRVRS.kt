// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.RID
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser._RID
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_XRVRS_INDEX: Int = 853

/**
 * This class is used by various XR interfaces to generate VRS textures that can be used to speed up
 * rendering.
 */
@GodotBaseType
public open class XRVRS : Object() {
  /**
   * The minimum radius around the focal point where full quality is guaranteed if VRS is used as a
   * percentage of screen size.
   */
  public final inline var vrsMinRadius: Float
    @JvmName("vrsMinRadiusProperty")
    get() = getVrsMinRadius()
    @JvmName("vrsMinRadiusProperty")
    set(`value`) {
      setVrsMinRadius(value)
    }

  /**
   * The strength used to calculate the VRS density map. The greater this value, the more noticeable
   * VRS is.
   */
  public final inline var vrsStrength: Float
    @JvmName("vrsStrengthProperty")
    get() = getVrsStrength()
    @JvmName("vrsStrengthProperty")
    set(`value`) {
      setVrsStrength(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_XRVRS_INDEX, scriptIndex)
  }

  public final fun getVrsMinRadius(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVrsMinRadiusPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVrsMinRadius(radius: Float): Unit {
    Internals.writeArguments(DOUBLE to radius.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setVrsMinRadiusPtr, NIL)
  }

  public final fun getVrsStrength(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVrsStrengthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVrsStrength(strength: Float): Unit {
    Internals.writeArguments(DOUBLE to strength.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setVrsStrengthPtr, NIL)
  }

  /**
   * Generates the VRS texture based on a render [targetSize] adjusted by our VRS tile size. For
   * each eyes focal point passed in [eyeFoci] a layer is created. Focal point should be in NDC.
   * The result will be cached, requesting a VRS texture with unchanged parameters and settings will
   * return the cached RID.
   */
  public final fun makeVrsTexture(targetSize: Vector2, eyeFoci: PackedVector2Array): RID {
    Internals.writeArguments(VECTOR2 to targetSize, PACKED_VECTOR2_ARRAY to eyeFoci)
    Internals.callMethod(rawPtr, MethodBindings.makeVrsTexturePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  public companion object

  internal object MethodBindings {
    public val getVrsMinRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("XRVRS", "get_vrs_min_radius", 1740695150)

    public val setVrsMinRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("XRVRS", "set_vrs_min_radius", 373806689)

    public val getVrsStrengthPtr: VoidPtr =
        Internals.getMethodBindPtr("XRVRS", "get_vrs_strength", 1740695150)

    public val setVrsStrengthPtr: VoidPtr =
        Internals.getMethodBindPtr("XRVRS", "set_vrs_strength", 373806689)

    public val makeVrsTexturePtr: VoidPtr =
        Internals.getMethodBindPtr("XRVRS", "make_vrs_texture", 3647044786)
  }
}
