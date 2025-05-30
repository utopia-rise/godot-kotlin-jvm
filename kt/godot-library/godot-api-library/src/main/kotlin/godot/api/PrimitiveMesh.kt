// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.AABB
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Base class for all primitive meshes. Handles applying a [Material] to a primitive mesh. Examples
 * include [BoxMesh], [CapsuleMesh], [CylinderMesh], [PlaneMesh], [PrismMesh], and [SphereMesh].
 */
@GodotBaseType
public open class PrimitiveMesh : Mesh() {
  /**
   * The current [Material] of the primitive mesh.
   */
  public final inline var material: Material?
    @JvmName("materialProperty")
    get() = getMaterial()
    @JvmName("materialProperty")
    set(`value`) {
      setMaterial(value)
    }

  /**
   * Overrides the [AABB] with one defined by user for use with frustum culling. Especially useful
   * to avoid unexpected culling when using a shader to offset vertices.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var customAabb: AABB
    @JvmName("customAabbProperty")
    get() = getCustomAabb()
    @JvmName("customAabbProperty")
    set(`value`) {
      setCustomAabb(value)
    }

  /**
   * If set, the order of the vertices in each triangle are reversed resulting in the backside of
   * the mesh being drawn.
   *
   * This gives the same result as using [BaseMaterial3D.CULL_FRONT] in [BaseMaterial3D.cullMode].
   */
  public final inline var flipFaces: Boolean
    @JvmName("flipFacesProperty")
    get() = getFlipFaces()
    @JvmName("flipFacesProperty")
    set(`value`) {
      setFlipFaces(value)
    }

  /**
   * If set, generates UV2 UV coordinates applying a padding using the [uv2Padding] setting. UV2 is
   * needed for lightmapping.
   */
  public final inline var addUv2: Boolean
    @JvmName("addUv2Property")
    get() = getAddUv2()
    @JvmName("addUv2Property")
    set(`value`) {
      setAddUv2(value)
    }

  /**
   * If [addUv2] is set, specifies the padding in pixels applied along seams of the mesh. Lower
   * padding values allow making better use of the lightmap texture (resulting in higher texel
   * density), but may introduce visible lightmap bleeding along edges.
   *
   * If the size of the lightmap texture can't be determined when generating the mesh, UV2 is
   * calculated assuming a texture size of 1024x1024.
   */
  public final inline var uv2Padding: Float
    @JvmName("uv2PaddingProperty")
    get() = getUv2Padding()
    @JvmName("uv2PaddingProperty")
    set(`value`) {
      setUv2Padding(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(505, scriptIndex)
  }

  /**
   * This is a helper function for [customAabb] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = primitivemesh.customAabb
   * //Your changes
   * primitivemesh.customAabb = myCoreType
   * ``````
   *
   * Overrides the [AABB] with one defined by user for use with frustum culling. Especially useful
   * to avoid unexpected culling when using a shader to offset vertices.
   */
  @CoreTypeHelper
  public final fun customAabbMutate(block: AABB.() -> Unit): AABB = customAabb.apply {
     block(this)
     customAabb = this
  }

  /**
   * Override this method to customize how this primitive mesh should be generated. Should return an
   * [Array] where each element is another Array of values required for the mesh (see the
   * [Mesh.ArrayType] constants).
   */
  public open fun _createMeshArray(): VariantArray<Any?> {
    throw NotImplementedError("_createMeshArray is not implemented for PrimitiveMesh")
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

  /**
   * Returns the mesh arrays used to make up the surface of this primitive mesh.
   *
   * **Example:** Pass the result to [ArrayMesh.addSurfaceFromArrays] to create a new surface:
   *
   * ```gdscript
   * //gdscript
   * var c = CylinderMesh.new()
   * var arr_mesh = ArrayMesh.new()
   * arr_mesh.add_surface_from_arrays(Mesh.PRIMITIVE_TRIANGLES, c.get_mesh_arrays())
   * ```
   *
   * ```csharp
   * //csharp
   * var c = new CylinderMesh();
   * var arrMesh = new ArrayMesh();
   * arrMesh.AddSurfaceFromArrays(Mesh.PrimitiveType.Triangles, c.GetMeshArrays());
   * ```
   */
  public final fun getMeshArrays(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMeshArraysPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  public final fun setCustomAabb(aabb: AABB): Unit {
    TransferContext.writeArguments(godot.core.VariantParser.AABB to aabb)
    TransferContext.callMethod(ptr, MethodBindings.setCustomAabbPtr, NIL)
  }

  public final fun getCustomAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCustomAabbPtr, godot.core.VariantParser.AABB)
    return (TransferContext.readReturnValue(godot.core.VariantParser.AABB) as AABB)
  }

  public final fun setFlipFaces(flipFaces: Boolean): Unit {
    TransferContext.writeArguments(BOOL to flipFaces)
    TransferContext.callMethod(ptr, MethodBindings.setFlipFacesPtr, NIL)
  }

  public final fun getFlipFaces(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFlipFacesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAddUv2(addUv2: Boolean): Unit {
    TransferContext.writeArguments(BOOL to addUv2)
    TransferContext.callMethod(ptr, MethodBindings.setAddUv2Ptr, NIL)
  }

  public final fun getAddUv2(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAddUv2Ptr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUv2Padding(uv2Padding: Float): Unit {
    TransferContext.writeArguments(DOUBLE to uv2Padding.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setUv2PaddingPtr, NIL)
  }

  public final fun getUv2Padding(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUv2PaddingPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Request an update of this primitive mesh based on its properties.
   */
  public final fun requestUpdate(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.requestUpdatePtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val setMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrimitiveMesh", "set_material", 2757459619)

    internal val getMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrimitiveMesh", "get_material", 5934680)

    internal val getMeshArraysPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrimitiveMesh", "get_mesh_arrays", 3995934104)

    internal val setCustomAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrimitiveMesh", "set_custom_aabb", 259215842)

    internal val getCustomAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrimitiveMesh", "get_custom_aabb", 1068685055)

    internal val setFlipFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrimitiveMesh", "set_flip_faces", 2586408642)

    internal val getFlipFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrimitiveMesh", "get_flip_faces", 36873697)

    internal val setAddUv2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("PrimitiveMesh", "set_add_uv2", 2586408642)

    internal val getAddUv2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("PrimitiveMesh", "get_add_uv2", 36873697)

    internal val setUv2PaddingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrimitiveMesh", "set_uv2_padding", 373806689)

    internal val getUv2PaddingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrimitiveMesh", "get_uv2_padding", 1740695150)

    internal val requestUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PrimitiveMesh", "request_update", 3218959716)
  }
}
