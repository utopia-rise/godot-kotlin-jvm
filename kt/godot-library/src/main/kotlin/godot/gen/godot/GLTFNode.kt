// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.Quaternion
import godot.core.TransferContext
import godot.core.Transform3D
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.QUATERNION
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GLTFNode : Resource() {
  public open var parent: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_GET_PARENT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_SET_PARENT, NIL)
    }

  public open var height: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_GET_HEIGHT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_SET_HEIGHT, NIL)
    }

  public open var xform: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_GET_XFORM, TRANSFORM3D)
      return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_SET_XFORM, NIL)
    }

  public open var mesh: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_GET_MESH, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_SET_MESH, NIL)
    }

  public open var camera: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_GET_CAMERA, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_SET_CAMERA, NIL)
    }

  public open var skin: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_GET_SKIN, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_SET_SKIN, NIL)
    }

  public open var skeleton: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_GET_SKELETON, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_SET_SKELETON, NIL)
    }

  public open var joint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_GET_JOINT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_SET_JOINT, NIL)
    }

  public open var position: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_GET_POSITION, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_SET_POSITION, NIL)
    }

  public open var rotation: Quaternion
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_GET_ROTATION, QUATERNION)
      return TransferContext.readReturnValue(QUATERNION, false) as Quaternion
    }
    set(`value`) {
      TransferContext.writeArguments(QUATERNION to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_SET_ROTATION, NIL)
    }

  public open var scale: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_GET_SCALE, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_SET_SCALE, NIL)
    }

  public open var children: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_GET_CHILDREN,
          PACKED_INT_32_ARRAY)
      return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_SET_CHILDREN, NIL)
    }

  public open var light: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_GET_LIGHT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFNODE_SET_LIGHT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GLTFNODE)
  }

  public companion object
}
