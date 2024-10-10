// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_PRIMITIVEMESH_INDEX: Int = 452

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
    Internals.callConstructor(this, ENGINE_CLASS_PRIMITIVEMESH_INDEX, scriptIndex)
  }

  /**
   * Overrides the [AABB] with one defined by user for use with frustum culling. Especially useful
   * to avoid unexpected culling when using a shader to offset vertices.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = primitivemesh.customAabb
   * //Your changes
   * primitivemesh.customAabb = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun customAabbMutate(block: AABB.() -> Unit): AABB = customAabb.apply{
      block(this)
      customAabb = this
  }


  /**
   * Override this method to customize how this primitive mesh should be generated. Should return an
   * [Array] where each element is another Array of values required for the mesh (see the
   * [Mesh.ArrayType] constants).
   */
  public open fun _createMeshArray(): VariantArray<Any?> {
    throw NotImplementedError("_create_mesh_array is not implemented for PrimitiveMesh")
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

  /**
   * Returns mesh arrays used to constitute surface of [Mesh]. The result can be passed to
   * [ArrayMesh.addSurfaceFromArrays] to create a new surface. For example:
   *
   * gdscript:
   * ```gdscript
   * var c = CylinderMesh.new()
   * var arr_mesh = ArrayMesh.new()
   * arr_mesh.add_surface_from_arrays(Mesh.PRIMITIVE_TRIANGLES, c.get_mesh_arrays())
   * ```
   * csharp:
   * ```csharp
   * var c = new CylinderMesh();
   * var arrMesh = new ArrayMesh();
   * arrMesh.AddSurfaceFromArrays(Mesh.PrimitiveType.Triangles, c.GetMeshArrays());
   * ```
   */
  public final fun getMeshArrays(): VariantArray<Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMeshArraysPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  public final fun setCustomAabb(aabb: AABB): Unit {
    Internals.writeArguments(godot.core.VariantParser.AABB to aabb)
    Internals.callMethod(rawPtr, MethodBindings.setCustomAabbPtr, NIL)
  }

  public final fun getCustomAabb(): AABB {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCustomAabbPtr, godot.core.VariantParser.AABB)
    return (Internals.readReturnValue(godot.core.VariantParser.AABB) as AABB)
  }

  public final fun setFlipFaces(flipFaces: Boolean): Unit {
    Internals.writeArguments(BOOL to flipFaces)
    Internals.callMethod(rawPtr, MethodBindings.setFlipFacesPtr, NIL)
  }

  public final fun getFlipFaces(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFlipFacesPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAddUv2(addUv2: Boolean): Unit {
    Internals.writeArguments(BOOL to addUv2)
    Internals.callMethod(rawPtr, MethodBindings.setAddUv2Ptr, NIL)
  }

  public final fun getAddUv2(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAddUv2Ptr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUv2Padding(uv2Padding: Float): Unit {
    Internals.writeArguments(DOUBLE to uv2Padding.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setUv2PaddingPtr, NIL)
  }

  public final fun getUv2Padding(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUv2PaddingPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Request an update of this primitive mesh based on its properties.
   */
  public final fun requestUpdate(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.requestUpdatePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setMaterialPtr: VoidPtr =
        Internals.getMethodBindPtr("PrimitiveMesh", "set_material", 2757459619)

    public val getMaterialPtr: VoidPtr =
        Internals.getMethodBindPtr("PrimitiveMesh", "get_material", 5934680)

    public val getMeshArraysPtr: VoidPtr =
        Internals.getMethodBindPtr("PrimitiveMesh", "get_mesh_arrays", 3995934104)

    public val setCustomAabbPtr: VoidPtr =
        Internals.getMethodBindPtr("PrimitiveMesh", "set_custom_aabb", 259215842)

    public val getCustomAabbPtr: VoidPtr =
        Internals.getMethodBindPtr("PrimitiveMesh", "get_custom_aabb", 1068685055)

    public val setFlipFacesPtr: VoidPtr =
        Internals.getMethodBindPtr("PrimitiveMesh", "set_flip_faces", 2586408642)

    public val getFlipFacesPtr: VoidPtr =
        Internals.getMethodBindPtr("PrimitiveMesh", "get_flip_faces", 36873697)

    public val setAddUv2Ptr: VoidPtr =
        Internals.getMethodBindPtr("PrimitiveMesh", "set_add_uv2", 2586408642)

    public val getAddUv2Ptr: VoidPtr =
        Internals.getMethodBindPtr("PrimitiveMesh", "get_add_uv2", 36873697)

    public val setUv2PaddingPtr: VoidPtr =
        Internals.getMethodBindPtr("PrimitiveMesh", "set_uv2_padding", 373806689)

    public val getUv2PaddingPtr: VoidPtr =
        Internals.getMethodBindPtr("PrimitiveMesh", "get_uv2_padding", 1740695150)

    public val requestUpdatePtr: VoidPtr =
        Internals.getMethodBindPtr("PrimitiveMesh", "request_update", 3218959716)
  }
}
