// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Node that instances meshes into a scenario.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * MeshInstance is a node that takes a [godot.Mesh] resource and adds it to the current scenario by creating an instance of it. This is the class most often used to get 3D geometry rendered and can be used to instance a single [godot.Mesh] in many places. This allows to reuse geometry and save on resources. When a [godot.Mesh] has to be instanced more than thousands of times at close proximity, consider using a [godot.MultiMesh] in a [godot.MultiMeshInstance] instead.
 */
@GodotBaseType
public open class MeshInstance : GeometryInstance() {
  /**
   * The [godot.Mesh] resource for the instance.
   */
  public open var mesh: Mesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_GET_MESH, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Mesh?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_SET_MESH, NIL)
    }

  /**
   * [godot.core.NodePath] to the [godot.Skeleton] associated with the instance.
   */
  public open var skeleton: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_GET_SKELETON,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_SET_SKELETON, NIL)
    }

  /**
   * Sets the skin to be used by this instance.
   */
  public open var skin: Skin?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_GET_SKIN, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Skin?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_SET_SKIN, NIL)
    }

  /**
   * If `true`, normals are transformed when software skinning is used. Set to `false` when normals are not needed for better performance.
   *
   * See [godot.ProjectSettings.rendering/quality/skinning/softwareSkinningFallback] for details about how software skinning is enabled.
   */
  public open var softwareSkinningTransformNormals: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_GET_SOFTWARE_SKINNING_TRANSFORM_NORMALS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_SET_SOFTWARE_SKINNING_TRANSFORM_NORMALS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_MESHINSTANCE)
  }

  public open fun _meshChanged(): Unit {
  }

  public open fun _updateSkinning(): Unit {
  }

  /**
   * This helper creates a [godot.StaticBody] child node with a [godot.ConvexPolygonShape] collision shape calculated from the mesh geometry. It's mainly used for testing.
   *
   * If `clean` is `true` (default), duplicate and interior vertices are removed automatically. You can set it to `false` to make the process faster if not needed.
   *
   * If `simplify` is `true`, the geometry can be further simplified to reduce the amount of vertices. Disabled by default.
   */
  public open fun createConvexCollision(clean: Boolean = true, simplify: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to clean, BOOL to simplify)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_CREATE_CONVEX_COLLISION, NIL)
  }

  /**
   * This helper creates a [godot.MeshInstance] child node with gizmos at every vertex calculated from the mesh geometry. It's mainly used for testing.
   */
  public open fun createDebugTangents(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_CREATE_DEBUG_TANGENTS,
        NIL)
  }

  /**
   * This helper creates a [godot.StaticBody] child node with multiple [godot.ConvexPolygonShape] collision shapes calculated from the mesh geometry via convex decomposition. It's mainly used for testing.
   */
  public open fun createMultipleConvexCollisions(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_CREATE_MULTIPLE_CONVEX_COLLISIONS, NIL)
  }

  /**
   * This helper creates a [godot.StaticBody] child node with a [godot.ConcavePolygonShape] collision shape calculated from the mesh geometry. It's mainly used for testing.
   */
  public open fun createTrimeshCollision(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_CREATE_TRIMESH_COLLISION, NIL)
  }

  /**
   * Returns the [godot.Material] that will be used by the [godot.Mesh] when drawing. This can return the [godot.GeometryInstance.materialOverride], the surface override [godot.Material] defined in this [godot.MeshInstance], or the surface [godot.Material] defined in the [godot.Mesh]. For example, if [godot.GeometryInstance.materialOverride] is used, all surfaces will return the override material.
   */
  public open fun getActiveMaterial(surface: Long): Material? {
    TransferContext.writeArguments(LONG to surface)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_GET_ACTIVE_MATERIAL,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Material?
  }

  /**
   * Returns the override [godot.Material] for a surface of the [godot.Mesh] resource.
   *
   * **Note:** This function only returns *override* materials associated with this [godot.MeshInstance]. Consider using [getActiveMaterial] or [godot.Mesh.surfaceGetMaterial] to get materials associated with the [godot.Mesh] resource.
   */
  public open fun getSurfaceMaterial(surface: Long): Material? {
    TransferContext.writeArguments(LONG to surface)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_GET_SURFACE_MATERIAL,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Material?
  }

  /**
   * Returns the number of surface override materials.
   */
  public open fun getSurfaceMaterialCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_GET_SURFACE_MATERIAL_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if this [godot.MeshInstance] can be merged with the specified `other_mesh_instance`, using the [godot.MeshInstance.mergeMeshes] function.
   *
   * In order to be mergeable, properties of the [godot.MeshInstance] must match, and each surface must match, in terms of material, attributes and vertex format.
   */
  public open fun isMergeableWith(otherMeshInstance: Node): Boolean {
    TransferContext.writeArguments(OBJECT to otherMeshInstance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_IS_MERGEABLE_WITH,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * This function can merge together the data from several source [godot.MeshInstance]s into a single destination [godot.MeshInstance] (the MeshInstance the function is called from). This is primarily useful for improving performance by reducing the number of drawcalls and [godot.Node]s.
   *
   * Merging should only be attempted for simple meshes that do not contain animation.
   *
   * The final vertices can either be returned in global space, or in local space relative to the destination [godot.MeshInstance] global transform (the destination Node must be inside the [godot.SceneTree] for local space to work).
   *
   * The function will make a final check for compatibility between the [godot.MeshInstance]s by default, this should always be used unless you have previously checked for compatibility using [godot.MeshInstance.isMergeableWith]. If the compatibility check is omitted and the meshes are merged, you may see rendering errors.
   *
   * **Note:** The requirements for similarity between meshes are quite stringent. They can be checked using the [godot.MeshInstance.isMergeableWith] function prior to calling [godot.MeshInstance.mergeMeshes].
   *
   * Also note that any initial data in the destination [godot.MeshInstance] data will be discarded.
   */
  public open fun mergeMeshes(
    meshInstances: VariantArray<Any?> = VariantArray(),
    useGlobalSpace: Boolean = false,
    checkCompatibility: Boolean = true
  ): Boolean {
    TransferContext.writeArguments(ARRAY to meshInstances, BOOL to useGlobalSpace, BOOL to
        checkCompatibility)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_MERGE_MESHES, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the override [godot.Material] for the specified surface of the [godot.Mesh] resource. This material is associated with this [godot.MeshInstance] rather than with the [godot.Mesh] resource.
   */
  public open fun setSurfaceMaterial(surface: Long, material: Material): Unit {
    TransferContext.writeArguments(LONG to surface, OBJECT to material)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_SET_SURFACE_MATERIAL,
        NIL)
  }
}
