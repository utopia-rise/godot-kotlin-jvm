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
import godot.core.NodePath
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING_NAME
import godot.core.asCachedStringName
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * MeshInstance3D is a node that takes a [Mesh] resource and adds it to the current scenario by
 * creating an instance of it. This is the class most often used render 3D geometry and can be used to
 * instance a single [Mesh] in many places. This allows reusing geometry, which can save on resources.
 * When a [Mesh] has to be instantiated more than thousands of times at close proximity, consider using
 * a [MultiMesh] in a [MultiMeshInstance3D] instead.
 */
@GodotBaseType
public open class MeshInstance3D : GeometryInstance3D() {
  /**
   * The [Mesh] resource for the instance.
   */
  public final inline var mesh: Mesh?
    @JvmName("meshProperty")
    get() = getMesh()
    @JvmName("meshProperty")
    set(`value`) {
      setMesh(value)
    }

  /**
   * The [Skin] to be used by this instance.
   */
  public final inline var skin: Skin?
    @JvmName("skinProperty")
    get() = getSkin()
    @JvmName("skinProperty")
    set(`value`) {
      setSkin(value)
    }

  /**
   * [NodePath] to the [Skeleton3D] associated with the instance.
   */
  public final inline var skeleton: NodePath
    @JvmName("skeletonProperty")
    get() = getSkeletonPath()
    @JvmName("skeletonProperty")
    set(`value`) {
      setSkeletonPath(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(355, scriptIndex)
  }

  public final fun setMesh(mesh: Mesh?): Unit {
    TransferContext.writeArguments(OBJECT to mesh)
    TransferContext.callMethod(ptr, MethodBindings.setMeshPtr, NIL)
  }

  public final fun getMesh(): Mesh? {
    TransferContext.callMethod(ptr, MethodBindings.getMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Mesh?)
  }

  public final fun setSkeletonPath(skeletonPath: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to skeletonPath)
    TransferContext.callMethod(ptr, MethodBindings.setSkeletonPathPtr, NIL)
  }

  public final fun getSkeletonPath(): NodePath {
    TransferContext.callMethod(ptr, MethodBindings.getSkeletonPathPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setSkin(skin: Skin?): Unit {
    TransferContext.writeArguments(OBJECT to skin)
    TransferContext.callMethod(ptr, MethodBindings.setSkinPtr, NIL)
  }

  public final fun getSkin(): Skin? {
    TransferContext.callMethod(ptr, MethodBindings.getSkinPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Skin?)
  }

  /**
   * Returns the internal [SkinReference] containing the skeleton's [RID] attached to this RID. See
   * also [Resource.getRid], [SkinReference.getSkeleton], and [RenderingServer.instanceAttachSkeleton].
   */
  public final fun getSkinReference(): SkinReference? {
    TransferContext.callMethod(ptr, MethodBindings.getSkinReferencePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as SkinReference?)
  }

  /**
   * Returns the number of surface override materials. This is equivalent to [Mesh.getSurfaceCount].
   * See also [getSurfaceOverrideMaterial].
   */
  public final fun getSurfaceOverrideMaterialCount(): Int {
    TransferContext.callMethod(ptr, MethodBindings.getSurfaceOverrideMaterialCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the override [material] for the specified [surface] of the [Mesh] resource. This material
   * is associated with this [MeshInstance3D] rather than with [mesh].
   * **Note:** This assigns the [Material] associated to the [MeshInstance3D]'s Surface Material
   * Override properties, not the material within the [Mesh] resource. To set the material within the
   * [Mesh] resource, use [Mesh.surfaceSetMaterial] instead.
   */
  public final fun setSurfaceOverrideMaterial(surface: Int, material: Material?): Unit {
    TransferContext.writeArguments(LONG to surface.toLong(), OBJECT to material)
    TransferContext.callMethod(ptr, MethodBindings.setSurfaceOverrideMaterialPtr, NIL)
  }

  /**
   * Returns the override [Material] for the specified [surface] of the [Mesh] resource. See also
   * [getSurfaceOverrideMaterialCount].
   * **Note:** This returns the [Material] associated to the [MeshInstance3D]'s Surface Material
   * Override properties, not the material within the [Mesh] resource. To get the material within the
   * [Mesh] resource, use [Mesh.surfaceGetMaterial] instead.
   */
  public final fun getSurfaceOverrideMaterial(surface: Int): Material? {
    TransferContext.writeArguments(LONG to surface.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getSurfaceOverrideMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Material?)
  }

  /**
   * Returns the [Material] that will be used by the [Mesh] when drawing. This can return the
   * [GeometryInstance3D.materialOverride], the surface override [Material] defined in this
   * [MeshInstance3D], or the surface [Material] defined in the [mesh]. For example, if
   * [GeometryInstance3D.materialOverride] is used, all surfaces will return the override material.
   * Returns `null` if no material is active, including when [mesh] is `null`.
   */
  public final fun getActiveMaterial(surface: Int): Material? {
    TransferContext.writeArguments(LONG to surface.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getActiveMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Material?)
  }

  /**
   * This helper creates a [StaticBody3D] child node with a [ConcavePolygonShape3D] collision shape
   * calculated from the mesh geometry. It's mainly used for testing.
   */
  public final fun createTrimeshCollision(): Unit {
    TransferContext.callMethod(ptr, MethodBindings.createTrimeshCollisionPtr, NIL)
  }

  /**
   * This helper creates a [StaticBody3D] child node with a [ConvexPolygonShape3D] collision shape
   * calculated from the mesh geometry. It's mainly used for testing.
   * If [clean] is `true` (default), duplicate and interior vertices are removed automatically. You
   * can set it to `false` to make the process faster if not needed.
   * If [simplify] is `true`, the geometry can be further simplified to reduce the number of
   * vertices. Disabled by default.
   */
  @JvmOverloads
  public final fun createConvexCollision(clean: Boolean = true, simplify: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to clean, BOOL to simplify)
    TransferContext.callMethod(ptr, MethodBindings.createConvexCollisionPtr, NIL)
  }

  /**
   * This helper creates a [StaticBody3D] child node with multiple [ConvexPolygonShape3D] collision
   * shapes calculated from the mesh geometry via convex decomposition. The convex decomposition
   * operation can be controlled with parameters from the optional [settings].
   */
  @JvmOverloads
  public final fun createMultipleConvexCollisions(settings: MeshConvexDecompositionSettings? =
      null): Unit {
    TransferContext.writeArguments(OBJECT to settings)
    TransferContext.callMethod(ptr, MethodBindings.createMultipleConvexCollisionsPtr, NIL)
  }

  /**
   * Returns the number of blend shapes available. Produces an error if [mesh] is `null`.
   */
  public final fun getBlendShapeCount(): Int {
    TransferContext.callMethod(ptr, MethodBindings.getBlendShapeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the index of the blend shape with the given [name]. Returns `-1` if no blend shape with
   * this name exists, including when [mesh] is `null`.
   */
  public final fun findBlendShapeByName(name: StringName): Int {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.findBlendShapeByNamePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the value of the blend shape at the given [blendShapeIdx]. Returns `0.0` and produces
   * an error if [mesh] is `null` or doesn't have a blend shape at that index.
   */
  public final fun getBlendShapeValue(blendShapeIdx: Int): Float {
    TransferContext.writeArguments(LONG to blendShapeIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBlendShapeValuePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the value of the blend shape at [blendShapeIdx] to [value]. Produces an error if [mesh] is
   * `null` or doesn't have a blend shape at that index.
   */
  public final fun setBlendShapeValue(blendShapeIdx: Int, `value`: Float): Unit {
    TransferContext.writeArguments(LONG to blendShapeIdx.toLong(), DOUBLE to value.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setBlendShapeValuePtr, NIL)
  }

  /**
   * This helper creates a [MeshInstance3D] child node with gizmos at every vertex calculated from
   * the mesh geometry. It's mainly used for testing.
   */
  public final fun createDebugTangents(): Unit {
    TransferContext.callMethod(ptr, MethodBindings.createDebugTangentsPtr, NIL)
  }

  /**
   * Takes a snapshot from the current [ArrayMesh] with all blend shapes applied according to their
   * current weights and bakes it to the provided [existing] mesh. If no [existing] mesh is provided a
   * new [ArrayMesh] is created, baked and returned. Mesh surface materials are not copied.
   * **Performance:** [Mesh] data needs to be received from the GPU, stalling the [RenderingServer]
   * in the process.
   */
  @JvmOverloads
  public final fun bakeMeshFromCurrentBlendShapeMix(existing: ArrayMesh? = null): ArrayMesh? {
    TransferContext.writeArguments(OBJECT to existing)
    TransferContext.callMethod(ptr, MethodBindings.bakeMeshFromCurrentBlendShapeMixPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as ArrayMesh?)
  }

  /**
   * Takes a snapshot of the current animated skeleton pose of the skinned mesh and bakes it to the
   * provided [existing] mesh. If no [existing] mesh is provided a new [ArrayMesh] is created, baked,
   * and returned. Requires a skeleton with a registered skin to work. Blendshapes are ignored. Mesh
   * surface materials are not copied.
   * **Performance:** [Mesh] data needs to be retrieved from the GPU, stalling the [RenderingServer]
   * in the process.
   */
  @JvmOverloads
  public final fun bakeMeshFromCurrentSkeletonPose(existing: ArrayMesh? = null): ArrayMesh? {
    TransferContext.writeArguments(OBJECT to existing)
    TransferContext.callMethod(ptr, MethodBindings.bakeMeshFromCurrentSkeletonPosePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as ArrayMesh?)
  }

  /**
   * Returns the index of the blend shape with the given [name]. Returns `-1` if no blend shape with
   * this name exists, including when [mesh] is `null`.
   */
  public final fun findBlendShapeByName(name: String): Int =
      findBlendShapeByName(name.asCachedStringName())

  public companion object

  public object MethodBindings {
    internal val setMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "set_mesh", 194775623)

    internal val getMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "get_mesh", 1808005922)

    internal val setSkeletonPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "set_skeleton_path", 1348162250)

    internal val getSkeletonPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "get_skeleton_path", 277076166)

    internal val setSkinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "set_skin", 3971435618)

    internal val getSkinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "get_skin", 2074563878)

    internal val getSkinReferencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "get_skin_reference", 2060603409)

    internal val getSurfaceOverrideMaterialCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "get_surface_override_material_count", 3905245786)

    internal val setSurfaceOverrideMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "set_surface_override_material", 3671737478)

    internal val getSurfaceOverrideMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "get_surface_override_material", 2897466400)

    internal val getActiveMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "get_active_material", 2897466400)

    internal val createTrimeshCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "create_trimesh_collision", 3218959716)

    internal val createConvexCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "create_convex_collision", 2751962654)

    internal val createMultipleConvexCollisionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "create_multiple_convex_collisions", 628789669)

    internal val getBlendShapeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "get_blend_shape_count", 3905245786)

    internal val findBlendShapeByNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "find_blend_shape_by_name", 4150868206)

    internal val getBlendShapeValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "get_blend_shape_value", 2339986948)

    internal val setBlendShapeValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "set_blend_shape_value", 1602489585)

    internal val createDebugTangentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "create_debug_tangents", 3218959716)

    internal val bakeMeshFromCurrentBlendShapeMixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "bake_mesh_from_current_blend_shape_mix", 1457573577)

    internal val bakeMeshFromCurrentSkeletonPosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshInstance3D", "bake_mesh_from_current_skeleton_pose", 1457573577)
  }
}
