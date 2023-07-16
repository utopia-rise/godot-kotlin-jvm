// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.StringName
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Node that instances meshes into a scenario.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * MeshInstance3D is a node that takes a [godot.Mesh] resource and adds it to the current scenario by creating an instance of it. This is the class most often used render 3D geometry and can be used to instance a single [godot.Mesh] in many places. This allows reusing geometry, which can save on resources. When a [godot.Mesh] has to be instantiated more than thousands of times at close proximity, consider using a [godot.MultiMesh] in a [godot.MultiMeshInstance3D] instead.
 */
@GodotBaseType
public open class MeshInstance3D : GeometryInstance3D() {
  /**
   * The [godot.Mesh] resource for the instance.
   */
  public var mesh: Mesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE3D_GET_MESH, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Mesh?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE3D_SET_MESH, NIL)
    }

  /**
   * The [godot.Skin] to be used by this instance.
   */
  public var skin: Skin?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE3D_GET_SKIN, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Skin?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE3D_SET_SKIN, NIL)
    }

  /**
   * [godot.core.NodePath] to the [godot.Skeleton3D] associated with the instance.
   */
  public var skeleton: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE3D_GET_SKELETON_PATH,
          NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE3D_SET_SKELETON_PATH,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MESHINSTANCE3D, scriptIndex)
    return true
  }

  /**
   * Returns the number of surface override materials. This is equivalent to [godot.Mesh.getSurfaceCount].
   */
  public fun getSurfaceOverrideMaterialCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHINSTANCE3D_GET_SURFACE_OVERRIDE_MATERIAL_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the override [material] for the specified [surface] of the [godot.Mesh] resource. This material is associated with this [godot.MeshInstance3D] rather than with [mesh].
   */
  public fun setSurfaceOverrideMaterial(surface: Int, material: Material): Unit {
    TransferContext.writeArguments(LONG to surface.toLong(), OBJECT to material)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHINSTANCE3D_SET_SURFACE_OVERRIDE_MATERIAL, NIL)
  }

  /**
   * Returns the override [godot.Material] for the specified [surface] of the [godot.Mesh] resource.
   */
  public fun getSurfaceOverrideMaterial(surface: Int): Material? {
    TransferContext.writeArguments(LONG to surface.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHINSTANCE3D_GET_SURFACE_OVERRIDE_MATERIAL, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Material?)
  }

  /**
   * Returns the [godot.Material] that will be used by the [godot.Mesh] when drawing. This can return the [godot.GeometryInstance3D.materialOverride], the surface override [godot.Material] defined in this [godot.MeshInstance3D], or the surface [godot.Material] defined in the [mesh]. For example, if [godot.GeometryInstance3D.materialOverride] is used, all surfaces will return the override material.
   *
   * Returns `null` if no material is active, including when [mesh] is `null`.
   */
  public fun getActiveMaterial(surface: Int): Material? {
    TransferContext.writeArguments(LONG to surface.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE3D_GET_ACTIVE_MATERIAL,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Material?)
  }

  /**
   * This helper creates a [godot.StaticBody3D] child node with a [godot.ConcavePolygonShape3D] collision shape calculated from the mesh geometry. It's mainly used for testing.
   */
  public fun createTrimeshCollision(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHINSTANCE3D_CREATE_TRIMESH_COLLISION, NIL)
  }

  /**
   * This helper creates a [godot.StaticBody3D] child node with a [godot.ConvexPolygonShape3D] collision shape calculated from the mesh geometry. It's mainly used for testing.
   *
   * If [clean] is `true` (default), duplicate and interior vertices are removed automatically. You can set it to `false` to make the process faster if not needed.
   *
   * If [simplify] is `true`, the geometry can be further simplified to reduce the number of vertices. Disabled by default.
   */
  @JvmOverloads
  public fun createConvexCollision(clean: Boolean = true, simplify: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to clean, BOOL to simplify)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHINSTANCE3D_CREATE_CONVEX_COLLISION, NIL)
  }

  /**
   * This helper creates a [godot.StaticBody3D] child node with multiple [godot.ConvexPolygonShape3D] collision shapes calculated from the mesh geometry via convex decomposition. The convex decomposition operation can be controlled with parameters from the optional [settings].
   */
  @JvmOverloads
  public fun createMultipleConvexCollisions(settings: MeshConvexDecompositionSettings? = null):
      Unit {
    TransferContext.writeArguments(OBJECT to settings)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHINSTANCE3D_CREATE_MULTIPLE_CONVEX_COLLISIONS, NIL)
  }

  /**
   * Returns the number of blend shapes available. Produces an error if [mesh] is `null`.
   */
  public fun getBlendShapeCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHINSTANCE3D_GET_BLEND_SHAPE_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the index of the blend shape with the given [name]. Returns `-1` if no blend shape with this name exists, including when [mesh] is `null`.
   */
  public fun findBlendShapeByName(name: StringName): Int {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHINSTANCE3D_FIND_BLEND_SHAPE_BY_NAME, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the value of the blend shape at the given [blendShapeIdx]. Returns `0.0` and produces an error if [mesh] is `null` or doesn't have a blend shape at that index.
   */
  public fun getBlendShapeValue(blendShapeIdx: Int): Float {
    TransferContext.writeArguments(LONG to blendShapeIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHINSTANCE3D_GET_BLEND_SHAPE_VALUE, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the value of the blend shape at [blendShapeIdx] to [value]. Produces an error if [mesh] is `null` or doesn't have a blend shape at that index.
   */
  public fun setBlendShapeValue(blendShapeIdx: Int, `value`: Float): Unit {
    TransferContext.writeArguments(LONG to blendShapeIdx.toLong(), DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHINSTANCE3D_SET_BLEND_SHAPE_VALUE, NIL)
  }

  /**
   * This helper creates a [godot.MeshInstance3D] child node with gizmos at every vertex calculated from the mesh geometry. It's mainly used for testing.
   */
  public fun createDebugTangents(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHINSTANCE3D_CREATE_DEBUG_TANGENTS, NIL)
  }

  public companion object
}
