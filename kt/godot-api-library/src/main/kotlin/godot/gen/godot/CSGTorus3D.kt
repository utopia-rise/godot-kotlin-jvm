// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_CSGTORUS3D_INDEX: Int = 159

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
    Internals.callConstructor(this, ENGINE_CLASS_CSGTORUS3D_INDEX, scriptIndex)
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

  public final fun setSides(sides: Int): Unit {
    Internals.writeArguments(LONG to sides.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setSidesPtr, NIL)
  }

  public final fun getSides(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSidesPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setRingSides(sides: Int): Unit {
    Internals.writeArguments(LONG to sides.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setRingSidesPtr, NIL)
  }

  public final fun getRingSides(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRingSidesPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMaterial(material: Material?): Unit {
    Internals.writeArguments(OBJECT to material)
    Internals.callMethod(rawPtr, MethodBindings.setMaterialPtr, NIL)
  }

  public final fun getMaterial(): Material? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaterialPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Material?)
  }

  public final fun setSmoothFaces(smoothFaces: Boolean): Unit {
    Internals.writeArguments(BOOL to smoothFaces)
    Internals.callMethod(rawPtr, MethodBindings.setSmoothFacesPtr, NIL)
  }

  public final fun getSmoothFaces(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSmoothFacesPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setInnerRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGTorus3D", "set_inner_radius", 373806689)

    public val getInnerRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGTorus3D", "get_inner_radius", 1740695150)

    public val setOuterRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGTorus3D", "set_outer_radius", 373806689)

    public val getOuterRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGTorus3D", "get_outer_radius", 1740695150)

    public val setSidesPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGTorus3D", "set_sides", 1286410249)

    public val getSidesPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGTorus3D", "get_sides", 3905245786)

    public val setRingSidesPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGTorus3D", "set_ring_sides", 1286410249)

    public val getRingSidesPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGTorus3D", "get_ring_sides", 3905245786)

    public val setMaterialPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGTorus3D", "set_material", 2757459619)

    public val getMaterialPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGTorus3D", "get_material", 5934680)

    public val setSmoothFacesPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGTorus3D", "set_smooth_faces", 2586408642)

    public val getSmoothFacesPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGTorus3D", "get_smooth_faces", 36873697)
  }
}
