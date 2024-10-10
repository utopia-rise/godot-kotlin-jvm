// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_CSGMESH3D_INDEX: Int = 154

/**
 * This CSG node allows you to use any mesh resource as a CSG shape, provided it is closed, does not
 * self-intersect, does not contain internal faces and has no edges that connect to more than two
 * faces. See also [CSGPolygon3D] for drawing 2D extruded polygons to be used as CSG nodes.
 * **Note:** CSG nodes are intended to be used for level prototyping. Creating CSG nodes has a
 * significant CPU cost compared to creating a [MeshInstance3D] with a [PrimitiveMesh]. Moving a CSG
 * node within another CSG node also has a significant CPU cost, so it should be avoided during
 * gameplay.
 */
@GodotBaseType
public open class CSGMesh3D : CSGPrimitive3D() {
  /**
   * The [Mesh] resource to use as a CSG shape.
   * **Note:** When using an [ArrayMesh], all vertex attributes except [Mesh.ARRAY_VERTEX],
   * [Mesh.ARRAY_NORMAL] and [Mesh.ARRAY_TEX_UV] are left unused. Only [Mesh.ARRAY_VERTEX] and
   * [Mesh.ARRAY_TEX_UV] will be passed to the GPU.
   * [Mesh.ARRAY_NORMAL] is only used to determine which faces require the use of flat shading. By
   * default, CSGMesh will ignore the mesh's vertex normals, recalculate them for each vertex and use a
   * smooth shader. If a flat shader is required for a face, ensure that all vertex normals of the face
   * are approximately equal.
   */
  public final inline var mesh: Mesh?
    @JvmName("meshProperty")
    get() = getMesh()
    @JvmName("meshProperty")
    set(`value`) {
      setMesh(value)
    }

  /**
   * The [Material] used in drawing the CSG shape.
   */
  public final inline var material: Material?
    @JvmName("materialProperty")
    get() = getMaterial()
    @JvmName("materialProperty")
    set(`value`) {
      setMaterial(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_CSGMESH3D_INDEX, scriptIndex)
  }

  public final fun setMesh(mesh: Mesh?): Unit {
    Internals.writeArguments(OBJECT to mesh)
    Internals.callMethod(rawPtr, MethodBindings.setMeshPtr, NIL)
  }

  public final fun getMesh(): Mesh? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMeshPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Mesh?)
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

  public companion object

  internal object MethodBindings {
    public val setMeshPtr: VoidPtr = Internals.getMethodBindPtr("CSGMesh3D", "set_mesh", 194775623)

    public val getMeshPtr: VoidPtr = Internals.getMethodBindPtr("CSGMesh3D", "get_mesh", 4081188045)

    public val setMaterialPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGMesh3D", "set_material", 2757459619)

    public val getMaterialPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGMesh3D", "get_material", 5934680)
  }
}
