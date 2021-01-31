// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.AABB
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class PrimitiveMesh : Mesh() {
  open var customAabb: AABB
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_GET_CUSTOM_AABB,
          godot.core.VariantType.AABB)
      return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
    }
    set(value) {
      TransferContext.writeArguments(godot.core.VariantType.AABB to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_SET_CUSTOM_AABB,
          NIL)
    }

  open var flipFaces: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_GET_FLIP_FACES,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_SET_FLIP_FACES, NIL)
    }

  open var material: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_GET_MATERIAL,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Material?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_SET_MATERIAL, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_PRIMITIVEMESH)

  open fun customAabb(schedule: AABB.() -> Unit): AABB = customAabb.apply{
      schedule(this)
      customAabb = this
  }


  open fun _update() {
  }

  open fun getMeshArrays(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PRIMITIVEMESH_GET_MESH_ARRAYS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }
}
