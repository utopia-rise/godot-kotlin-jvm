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
import godot.util.VoidPtr
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class MeshInstance : GeometryInstance() {
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

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_MESHINSTANCE)

  open fun _meshChanged() {
  }

  open fun createConvexCollision() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_CREATE_CONVEX_COLLISION, NIL)
  }

  open fun createDebugTangents() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_CREATE_DEBUG_TANGENTS,
        NIL)
  }

  open fun createTrimeshCollision() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_CREATE_TRIMESH_COLLISION, NIL)
  }

  open fun getSurfaceMaterial(surface: Long): Material? {
    TransferContext.writeArguments(LONG to surface)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_GET_SURFACE_MATERIAL,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Material?
  }

  open fun getSurfaceMaterialCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_GET_SURFACE_MATERIAL_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun setSurfaceMaterial(surface: Long, material: Material) {
    TransferContext.writeArguments(LONG to surface, OBJECT to material)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHINSTANCE_SET_SURFACE_MATERIAL,
        NIL)
  }
}
