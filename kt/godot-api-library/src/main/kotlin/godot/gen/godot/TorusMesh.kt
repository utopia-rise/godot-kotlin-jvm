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

private const val ENGINE_CLASS_TORUSMESH_INDEX: Int = 601

/**
 * Class representing a torus [PrimitiveMesh].
 */
@GodotBaseType
public open class TorusMesh : PrimitiveMesh() {
  /**
   * The inner radius of the torus.
   */
  public final inline var innerRadius: Float
    @JvmName("innerRadiusProperty")
    get() = getInnerRadius()
    @JvmName("innerRadiusProperty")
    set(`value`) {
      setInnerRadius(value)
    }

  /**
   * The outer radius of the torus.
   */
  public final inline var outerRadius: Float
    @JvmName("outerRadiusProperty")
    get() = getOuterRadius()
    @JvmName("outerRadiusProperty")
    set(`value`) {
      setOuterRadius(value)
    }

  /**
   * The number of slices the torus is constructed of.
   */
  public final inline var rings: Int
    @JvmName("ringsProperty")
    get() = getRings()
    @JvmName("ringsProperty")
    set(`value`) {
      setRings(value)
    }

  /**
   * The number of edges each ring of the torus is constructed of.
   */
  public final inline var ringSegments: Int
    @JvmName("ringSegmentsProperty")
    get() = getRingSegments()
    @JvmName("ringSegmentsProperty")
    set(`value`) {
      setRingSegments(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_TORUSMESH_INDEX, scriptIndex)
  }

  public final fun setInnerRadius(radius: Float): Unit {
    Internals.writeArguments(DOUBLE to radius.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setInnerRadiusPtr, NIL)
  }

  public final fun getInnerRadius(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInnerRadiusPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setOuterRadius(radius: Float): Unit {
    Internals.writeArguments(DOUBLE to radius.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setOuterRadiusPtr, NIL)
  }

  public final fun getOuterRadius(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOuterRadiusPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
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

  public final fun setRingSegments(rings: Int): Unit {
    Internals.writeArguments(LONG to rings.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setRingSegmentsPtr, NIL)
  }

  public final fun getRingSegments(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRingSegmentsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val setInnerRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("TorusMesh", "set_inner_radius", 373806689)

    public val getInnerRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("TorusMesh", "get_inner_radius", 1740695150)

    public val setOuterRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("TorusMesh", "set_outer_radius", 373806689)

    public val getOuterRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("TorusMesh", "get_outer_radius", 1740695150)

    public val setRingsPtr: VoidPtr =
        Internals.getMethodBindPtr("TorusMesh", "set_rings", 1286410249)

    public val getRingsPtr: VoidPtr =
        Internals.getMethodBindPtr("TorusMesh", "get_rings", 3905245786)

    public val setRingSegmentsPtr: VoidPtr =
        Internals.getMethodBindPtr("TorusMesh", "set_ring_segments", 1286410249)

    public val getRingSegmentsPtr: VoidPtr =
        Internals.getMethodBindPtr("TorusMesh", "get_ring_segments", 3905245786)
  }
}
