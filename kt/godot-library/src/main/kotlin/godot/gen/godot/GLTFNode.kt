// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.Quaternion
import godot.core.StringName
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.QUATERNION
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Represents a GLTF node. GLTF nodes may have names, transforms, children (other GLTF nodes), and
 * more specialized properties (represented by their own classes).
 * GLTF nodes generally exist inside of [GLTFState] which represents all data of a GLTF file. Most
 * of GLTFNode's properties are indices of other data in the GLTF file. You can extend a GLTF node with
 * additional properties by using [getAdditionalData] and [setAdditionalData].
 */
@GodotBaseType
public open class GLTFNode : Resource() {
  /**
   * The index of the parent node in the [GLTFState]. If -1, this node is a root node.
   */
  public var parent: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getParentPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setParentPtr, NIL)
    }

  /**
   * How deep into the node hierarchy this node is. A root node will have a height of 0, its
   * children will have a height of 1, and so on. If -1, the height has not been calculated.
   */
  public var height: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHeightPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setHeightPtr, NIL)
    }

  /**
   * The transform of the GLTF node relative to its parent. This property is usually unused since
   * the position, rotation, and scale properties are preferred.
   */
  @CoreTypeLocalCopy
  public var xform: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getXformPtr, TRANSFORM3D)
      return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setXformPtr, NIL)
    }

  /**
   * If this GLTF node is a mesh, the index of the [GLTFMesh] in the [GLTFState] that describes the
   * mesh's properties. If -1, this node is not a mesh.
   */
  public var mesh: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMeshPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMeshPtr, NIL)
    }

  /**
   * If this GLTF node is a camera, the index of the [GLTFCamera] in the [GLTFState] that describes
   * the camera's properties. If -1, this node is not a camera.
   */
  public var camera: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCameraPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCameraPtr, NIL)
    }

  /**
   * If this GLTF node has a skin, the index of the [GLTFSkin] in the [GLTFState] that describes the
   * skin's properties. If -1, this node does not have a skin.
   */
  public var skin: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkinPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSkinPtr, NIL)
    }

  /**
   * If this GLTF node has a skeleton, the index of the [GLTFSkeleton] in the [GLTFState] that
   * describes the skeleton's properties. If -1, this node does not have a skeleton.
   */
  public var skeleton: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkeletonPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSkeletonPtr, NIL)
    }

  /**
   * The position of the GLTF node relative to its parent.
   */
  @CoreTypeLocalCopy
  public var position: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionPtr, NIL)
    }

  /**
   * The rotation of the GLTF node relative to its parent.
   */
  @CoreTypeLocalCopy
  public var rotation: Quaternion
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRotationPtr, QUATERNION)
      return (TransferContext.readReturnValue(QUATERNION, false) as Quaternion)
    }
    set(`value`) {
      TransferContext.writeArguments(QUATERNION to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRotationPtr, NIL)
    }

  /**
   * The scale of the GLTF node relative to its parent.
   */
  @CoreTypeLocalCopy
  public var scale: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScalePtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScalePtr, NIL)
    }

  /**
   * The indices of the children nodes in the [GLTFState]. If this GLTF node has no children, this
   * will be an empty array.
   */
  public var children: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getChildrenPtr, PACKED_INT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setChildrenPtr, NIL)
    }

  /**
   * If this GLTF node is a light, the index of the [GLTFLight] in the [GLTFState] that describes
   * the light's properties. If -1, this node is not a light.
   */
  public var light: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLightPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setLightPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GLTFNODE, scriptIndex)
    return true
  }

  /**
   * The transform of the GLTF node relative to its parent. This property is usually unused since
   * the position, rotation, and scale properties are preferred.
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
   * val myCoreType = gltfnode.xform
   * //Your changes
   * gltfnode.xform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun xformMutate(block: Transform3D.() -> Unit): Transform3D = xform.apply{
      block(this)
      xform = this
  }


  /**
   * The position of the GLTF node relative to its parent.
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
   * val myCoreType = gltfnode.position
   * //Your changes
   * gltfnode.position = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun positionMutate(block: Vector3.() -> Unit): Vector3 = position.apply{
      block(this)
      position = this
  }


  /**
   * The rotation of the GLTF node relative to its parent.
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
   * val myCoreType = gltfnode.rotation
   * //Your changes
   * gltfnode.rotation = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun rotationMutate(block: Quaternion.() -> Unit): Quaternion = rotation.apply{
      block(this)
      rotation = this
  }


  /**
   * The scale of the GLTF node relative to its parent.
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
   * val myCoreType = gltfnode.scale
   * //Your changes
   * gltfnode.scale = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun scaleMutate(block: Vector3.() -> Unit): Vector3 = scale.apply{
      block(this)
      scale = this
  }


  /**
   * Gets additional arbitrary data in this [GLTFNode] instance. This can be used to keep per-node
   * state data in [GLTFDocumentExtension] classes, which is important because they are stateless.
   * The argument should be the [GLTFDocumentExtension] name (does not have to match the extension
   * name in the GLTF file), and the return value can be anything you set. If nothing was set, the
   * return value is null.
   */
  public fun getAdditionalData(extensionName: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to extensionName)
    TransferContext.callMethod(rawPtr, MethodBindings.getAdditionalDataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Sets additional arbitrary data in this [GLTFNode] instance. This can be used to keep per-node
   * state data in [GLTFDocumentExtension] classes, which is important because they are stateless.
   * The first argument should be the [GLTFDocumentExtension] name (does not have to match the
   * extension name in the GLTF file), and the second argument can be anything you want.
   */
  public fun setAdditionalData(extensionName: StringName, additionalData: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to extensionName, ANY to additionalData)
    TransferContext.callMethod(rawPtr, MethodBindings.setAdditionalDataPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val getParentPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "get_parent")

    public val setParentPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "set_parent")

    public val getHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "get_height")

    public val setHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "set_height")

    public val getXformPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "get_xform")

    public val setXformPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "set_xform")

    public val getMeshPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "get_mesh")

    public val setMeshPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "set_mesh")

    public val getCameraPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "get_camera")

    public val setCameraPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "set_camera")

    public val getSkinPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "get_skin")

    public val setSkinPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "set_skin")

    public val getSkeletonPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "get_skeleton")

    public val setSkeletonPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "set_skeleton")

    public val getPositionPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "get_position")

    public val setPositionPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "set_position")

    public val getRotationPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "get_rotation")

    public val setRotationPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "set_rotation")

    public val getScalePtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "get_scale")

    public val setScalePtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "set_scale")

    public val getChildrenPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "get_children")

    public val setChildrenPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "set_children")

    public val getLightPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "get_light")

    public val setLightPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFNode", "set_light")

    public val getAdditionalDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "get_additional_data")

    public val setAdditionalDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "set_additional_data")
  }
}
