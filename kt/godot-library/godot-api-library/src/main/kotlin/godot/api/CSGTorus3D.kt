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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.getInnerRadiusPtr
import godot.getMaterialPtr
import godot.getOuterRadiusPtr
import godot.getRingSidesPtr
import godot.getSidesPtr
import godot.getSmoothFacesPtr
import godot.setInnerRadiusPtr
import godot.setMaterialPtr
import godot.setOuterRadiusPtr
import godot.setRingSidesPtr
import godot.setSidesPtr
import godot.setSmoothFacesPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_CSGTORUS3D: Int = 159

/**
 * This node allows you to create a torus for use with the CSG system.
 * **Note:** CSG nodes are intended to be used for level prototyping. Creating CSG nodes has a
 * significant CPU cost compared to creating a [MeshInstance3D] with a [PrimitiveMesh]. Moving a CSG
 * node within another CSG node also has a significant CPU cost, so it should be avoided during
 * gameplay.
 */
@GodotBaseType
public open class CSGTorus3D : CSGPrimitive3D() {
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
  public final inline var sides: Int
    @JvmName("sidesProperty")
    get() = getSides()
    @JvmName("sidesProperty")
    set(`value`) {
      setSides(value)
    }

  /**
   * The number of edges each ring of the torus is constructed of.
   */
  public final inline var ringSides: Int
    @JvmName("ringSidesProperty")
    get() = getRingSides()
    @JvmName("ringSidesProperty")
    set(`value`) {
      setRingSides(value)
    }

  /**
   * If `true` the normals of the torus are set to give a smooth effect making the torus seem
   * rounded. If `false` the torus will have a flat shaded look.
   */
  public final inline var smoothFaces: Boolean
    @JvmName("smoothFacesProperty")
    get() = getSmoothFaces()
    @JvmName("smoothFacesProperty")
    set(`value`) {
      setSmoothFaces(value)
    }

  /**
   * The material used to render the torus.
   */
  public final inline var material: Material?
    @JvmName("materialProperty")
    get() = getMaterial()
    @JvmName("materialProperty")
    set(`value`) {
      setMaterial(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_CSGTORUS3D, scriptIndex)
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

  public final fun setSides(sides: Int): Unit {
    TransferContext.writeArguments(LONG to sides.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSidesPtr, NIL)
  }

  public final fun getSides(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSidesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setRingSides(sides: Int): Unit {
    TransferContext.writeArguments(LONG to sides.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setRingSidesPtr, NIL)
  }

  public final fun getRingSides(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRingSidesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMaterial(material: Material?): Unit {
    TransferContext.writeArguments(OBJECT to material)
    TransferContext.callMethod(ptr, MethodBindings.setMaterialPtr, NIL)
  }

  public final fun getMaterial(): Material? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Material?)
  }

  public final fun setSmoothFaces(smoothFaces: Boolean): Unit {
    TransferContext.writeArguments(BOOL to smoothFaces)
    TransferContext.callMethod(ptr, MethodBindings.setSmoothFacesPtr, NIL)
  }

  public final fun getSmoothFaces(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSmoothFacesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setInnerRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGTorus3D", "set_inner_radius", 373806689)

    internal val getInnerRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGTorus3D", "get_inner_radius", 1740695150)

    internal val setOuterRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGTorus3D", "set_outer_radius", 373806689)

    internal val getOuterRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGTorus3D", "get_outer_radius", 1740695150)

    internal val setSidesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGTorus3D", "set_sides", 1286410249)

    internal val getSidesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGTorus3D", "get_sides", 3905245786)

    internal val setRingSidesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGTorus3D", "set_ring_sides", 1286410249)

    internal val getRingSidesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGTorus3D", "get_ring_sides", 3905245786)

    internal val setMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGTorus3D", "set_material", 2757459619)

    internal val getMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGTorus3D", "get_material", 5934680)

    internal val setSmoothFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGTorus3D", "set_smooth_faces", 2586408642)

    internal val getSmoothFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGTorus3D", "get_smooth_faces", 36873697)
  }
}
