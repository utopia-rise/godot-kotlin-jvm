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
    createNativeObject(672, scriptIndex)
  }

  public final fun setInnerRadius(radius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setInnerRadiusPtr, NIL)
  }

  public final fun getInnerRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInnerRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setOuterRadius(radius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setOuterRadiusPtr, NIL)
  }

  public final fun getOuterRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOuterRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRings(rings: Int): Unit {
    TransferContext.writeArguments(LONG to rings.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setRingsPtr, NIL)
  }

  public final fun getRings(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRingsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setRingSegments(rings: Int): Unit {
    TransferContext.writeArguments(LONG to rings.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setRingSegmentsPtr, NIL)
  }

  public final fun getRingSegments(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRingSegmentsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  public object MethodBindings {
    internal val setInnerRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TorusMesh", "set_inner_radius", 373806689)

    internal val getInnerRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TorusMesh", "get_inner_radius", 1740695150)

    internal val setOuterRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TorusMesh", "set_outer_radius", 373806689)

    internal val getOuterRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TorusMesh", "get_outer_radius", 1740695150)

    internal val setRingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TorusMesh", "set_rings", 1286410249)

    internal val getRingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TorusMesh", "get_rings", 3905245786)

    internal val setRingSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TorusMesh", "set_ring_segments", 1286410249)

    internal val getRingSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TorusMesh", "get_ring_segments", 3905245786)
  }
}
