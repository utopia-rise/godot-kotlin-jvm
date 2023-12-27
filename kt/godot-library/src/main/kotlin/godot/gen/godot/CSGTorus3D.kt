// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

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
  public var innerRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInnerRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setInnerRadiusPtr, NIL)
    }

  /**
   * The outer radius of the torus.
   */
  public var outerRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOuterRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setOuterRadiusPtr, NIL)
    }

  /**
   * The number of slices the torus is constructed of.
   */
  public var sides: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSidesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSidesPtr, NIL)
    }

  /**
   * The number of edges each ring of the torus is constructed of.
   */
  public var ringSides: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRingSidesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setRingSidesPtr, NIL)
    }

  /**
   * If `true` the normals of the torus are set to give a smooth effect making the torus seem
   * rounded. If `false` the torus will have a flat shaded look.
   */
  public var smoothFaces: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSmoothFacesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSmoothFacesPtr, NIL)
    }

  /**
   * The material used to render the torus.
   */
  public var material: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaterialPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMaterialPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CSGTORUS3D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setInnerRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGTorus3D", "set_inner_radius")

    public val getInnerRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGTorus3D", "get_inner_radius")

    public val setOuterRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGTorus3D", "set_outer_radius")

    public val getOuterRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGTorus3D", "get_outer_radius")

    public val setSidesPtr: VoidPtr = TypeManager.getMethodBindPtr("CSGTorus3D", "set_sides")

    public val getSidesPtr: VoidPtr = TypeManager.getMethodBindPtr("CSGTorus3D", "get_sides")

    public val setRingSidesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGTorus3D", "set_ring_sides")

    public val getRingSidesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGTorus3D", "get_ring_sides")

    public val setMaterialPtr: VoidPtr = TypeManager.getMethodBindPtr("CSGTorus3D", "set_material")

    public val getMaterialPtr: VoidPtr = TypeManager.getMethodBindPtr("CSGTorus3D", "get_material")

    public val setSmoothFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGTorus3D", "set_smooth_faces")

    public val getSmoothFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGTorus3D", "get_smooth_faces")
  }
}
