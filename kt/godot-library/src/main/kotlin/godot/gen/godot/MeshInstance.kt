// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import kotlin.Long
import kotlin.Suppress

/**
 * Node that instances meshes into a scenario.
 *
 * MeshInstance is a node that takes a [godot.Mesh] resource and adds it to the current scenario by creating an instance of it. This is the class most often used to get 3D geometry rendered and can be used to instance a single [godot.Mesh] in many places. This allows to reuse geometry and save on resources. When a [godot.Mesh] has to be instanced more than thousands of times at close proximity, consider using a [godot.MultiMesh] in a [godot.MultiMeshInstance] instead.
 */
@GodotBaseType
open class MeshInstance : GeometryInstance() {
  /**
   * The [godot.Mesh] resource for the instance.
   */
  open var mesh: Mesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_GET_MESH, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Mesh?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_SET_MESH, NIL)
    }

  /**
   * [godot.core.NodePath] to the [godot.Skeleton] associated with the instance.
   */
  open var skeleton: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_GET_SKELETON,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(value) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_SET_SKELETON, NIL)
    }

  /**
   * Sets the skin to be used by this instance.
   */
  open var skin: Skin?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_GET_SKIN, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Skin?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_SET_SKIN, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_MESHINSTANCE, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _meshChanged() {
  }

  /**
   * This helper creates a [godot.StaticBody] child node with a [godot.ConvexPolygonShape] collision shape calculated from the mesh geometry. It's mainly used for testing.
   */
  open fun createConvexCollision() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_CREATE_CONVEX_COLLISION, NIL)
  }

  /**
   * This helper creates a [godot.MeshInstance] child node with gizmos at every vertex calculated from the mesh geometry. It's mainly used for testing.
   */
  open fun createDebugTangents() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_CREATE_DEBUG_TANGENTS,
        NIL)
  }

  /**
   * This helper creates a [godot.StaticBody] child node with a [godot.ConcavePolygonShape] collision shape calculated from the mesh geometry. It's mainly used for testing.
   */
  open fun createTrimeshCollision() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_CREATE_TRIMESH_COLLISION, NIL)
  }

  /**
   * Returns the [godot.Material] for a surface of the [godot.Mesh] resource.
   */
  open fun getSurfaceMaterial(surface: Long): Material? {
    TransferContext.writeArguments(LONG to surface)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_GET_SURFACE_MATERIAL,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Material?
  }

  /**
   * Returns the number of surface materials.
   */
  open fun getSurfaceMaterialCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_GET_SURFACE_MATERIAL_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the [godot.Material] for a surface of the [godot.Mesh] resource.
   */
  open fun setSurfaceMaterial(surface: Long, material: Material) {
    TransferContext.writeArguments(LONG to surface, OBJECT to material)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_SET_SURFACE_MATERIAL,
        NIL)
  }
}
