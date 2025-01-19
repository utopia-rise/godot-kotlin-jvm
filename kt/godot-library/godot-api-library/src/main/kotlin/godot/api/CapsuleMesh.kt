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
    createNativeObject(174, scriptIndex)
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

  public final fun setHeight(height: Float): Unit {
    TransferContext.writeArguments(DOUBLE to height.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setHeightPtr, NIL)
  }

  public final fun getHeight(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRadialSegments(segments: Int): Unit {
    TransferContext.writeArguments(LONG to segments.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setRadialSegmentsPtr, NIL)
  }

  public final fun getRadialSegments(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRadialSegmentsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
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

  public companion object

  public object MethodBindings {
    internal val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CapsuleMesh", "set_radius", 373806689)

    internal val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CapsuleMesh", "get_radius", 1740695150)

    internal val setHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CapsuleMesh", "set_height", 373806689)

    internal val getHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CapsuleMesh", "get_height", 1740695150)

    internal val setRadialSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CapsuleMesh", "set_radial_segments", 1286410249)

    internal val getRadialSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CapsuleMesh", "get_radial_segments", 3905245786)

    internal val setRingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CapsuleMesh", "set_rings", 1286410249)

    internal val getRingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CapsuleMesh", "get_rings", 3905245786)
  }
}
