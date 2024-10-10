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

private const val ENGINE_CLASS_CAPSULEMESH_INDEX: Int = 163

/**
 * Class representing a capsule-shaped [PrimitiveMesh].
 */
@GodotBaseType
public open class CapsuleMesh : PrimitiveMesh() {
  /**
   * Radius of the capsule mesh.
   */
  public final inline var radius: Float
    @JvmName("radiusProperty")
    get() = getRadius()
    @JvmName("radiusProperty")
    set(`value`) {
      setRadius(value)
    }

  /**
   * Total height of the capsule mesh (including the hemispherical ends).
   */
  public final inline var height: Float
    @JvmName("heightProperty")
    get() = getHeight()
    @JvmName("heightProperty")
    set(`value`) {
      setHeight(value)
    }

  /**
   * Number of radial segments on the capsule mesh.
   */
  public final inline var radialSegments: Int
    @JvmName("radialSegmentsProperty")
    get() = getRadialSegments()
    @JvmName("radialSegmentsProperty")
    set(`value`) {
      setRadialSegments(value)
    }

  /**
   * Number of rings along the height of the capsule.
   */
  public final inline var rings: Int
    @JvmName("ringsProperty")
    get() = getRings()
    @JvmName("ringsProperty")
    set(`value`) {
      setRings(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_CAPSULEMESH_INDEX, scriptIndex)
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

  public final fun setHeight(height: Float): Unit {
    Internals.writeArguments(DOUBLE to height.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setHeightPtr, NIL)
  }

  public final fun getHeight(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHeightPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRadialSegments(segments: Int): Unit {
    Internals.writeArguments(LONG to segments.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setRadialSegmentsPtr, NIL)
  }

  public final fun getRadialSegments(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRadialSegmentsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setRings(rings: Int): Unit {
    Internals.writeArguments(LONG to rings.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setRingsPtr, NIL)
  }

  public final fun getRings(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRingsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val setRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("CapsuleMesh", "set_radius", 373806689)

    public val getRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("CapsuleMesh", "get_radius", 1740695150)

    public val setHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("CapsuleMesh", "set_height", 373806689)

    public val getHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("CapsuleMesh", "get_height", 1740695150)

    public val setRadialSegmentsPtr: VoidPtr =
        Internals.getMethodBindPtr("CapsuleMesh", "set_radial_segments", 1286410249)

    public val getRadialSegmentsPtr: VoidPtr =
        Internals.getMethodBindPtr("CapsuleMesh", "get_radial_segments", 3905245786)

    public val setRingsPtr: VoidPtr =
        Internals.getMethodBindPtr("CapsuleMesh", "set_rings", 1286410249)

    public val getRingsPtr: VoidPtr =
        Internals.getMethodBindPtr("CapsuleMesh", "get_rings", 3905245786)
  }
}
