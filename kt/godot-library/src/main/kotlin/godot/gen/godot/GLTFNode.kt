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
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
   * The original name of the node.
   */
  public var originalName: String
    @JvmName("originalNameProperty")
    get() = getOriginalName()
    @JvmName("originalNameProperty")
    set(`value`) {
      setOriginalName(value)
    }

  /**
   * The index of the parent node in the [GLTFState]. If -1, this node is a root node.
   */
  public var parent: Int
    @JvmName("parentProperty")
    get() = getParent()
    @JvmName("parentProperty")
    set(`value`) {
      setParent(value)
    }

  /**
   * How deep into the node hierarchy this node is. A root node will have a height of 0, its
   * children will have a height of 1, and so on. If -1, the height has not been calculated.
   */
  public var height: Int
    @JvmName("heightProperty")
    get() = getHeight()
    @JvmName("heightProperty")
    set(`value`) {
      setHeight(value)
    }

  /**
   * The transform of the GLTF node relative to its parent. This property is usually unused since
   * the position, rotation, and scale properties are preferred.
   */
  @CoreTypeLocalCopy
  public var xform: Transform3D
    @JvmName("xformProperty")
    get() = getXform()
    @JvmName("xformProperty")
    set(`value`) {
      setXform(value)
    }

  /**
   * If this GLTF node is a mesh, the index of the [GLTFMesh] in the [GLTFState] that describes the
   * mesh's properties. If -1, this node is not a mesh.
   */
  public var mesh: Int
    @JvmName("meshProperty")
    get() = getMesh()
    @JvmName("meshProperty")
    set(`value`) {
      setMesh(value)
    }

  /**
   * If this GLTF node is a camera, the index of the [GLTFCamera] in the [GLTFState] that describes
   * the camera's properties. If -1, this node is not a camera.
   */
  public var camera: Int
    @JvmName("cameraProperty")
    get() = getCamera()
    @JvmName("cameraProperty")
    set(`value`) {
      setCamera(value)
    }

  /**
   * If this GLTF node has a skin, the index of the [GLTFSkin] in the [GLTFState] that describes the
   * skin's properties. If -1, this node does not have a skin.
   */
  public var skin: Int
    @JvmName("skinProperty")
    get() = getSkin()
    @JvmName("skinProperty")
    set(`value`) {
      setSkin(value)
    }

  /**
   * If this GLTF node has a skeleton, the index of the [GLTFSkeleton] in the [GLTFState] that
   * describes the skeleton's properties. If -1, this node does not have a skeleton.
   */
  public var skeleton: Int
    @JvmName("skeletonProperty")
    get() = getSkeleton()
    @JvmName("skeletonProperty")
    set(`value`) {
      setSkeleton(value)
    }

  /**
   * The position of the GLTF node relative to its parent.
   */
  @CoreTypeLocalCopy
  public var position: Vector3
    @JvmName("positionProperty")
    get() = getPosition()
    @JvmName("positionProperty")
    set(`value`) {
      setPosition(value)
    }

  /**
   * The rotation of the GLTF node relative to its parent.
   */
  @CoreTypeLocalCopy
  public var rotation: Quaternion
    @JvmName("rotationProperty")
    get() = getRotation()
    @JvmName("rotationProperty")
    set(`value`) {
      setRotation(value)
    }

  /**
   * The scale of the GLTF node relative to its parent.
   */
  @CoreTypeLocalCopy
  public var scale: Vector3
    @JvmName("scaleProperty")
    get() = getScale()
    @JvmName("scaleProperty")
    set(`value`) {
      setScale(value)
    }

  /**
   * The indices of the child nodes in the [GLTFState]. If this GLTF node has no children, this will
   * be an empty array.
   */
  public var children: PackedInt32Array
    @JvmName("childrenProperty")
    get() = getChildren()
    @JvmName("childrenProperty")
    set(`value`) {
      setChildren(value)
    }

  /**
   * If this GLTF node is a light, the index of the [GLTFLight] in the [GLTFState] that describes
   * the light's properties. If -1, this node is not a light.
   */
  public var light: Int
    @JvmName("lightProperty")
    get() = getLight()
    @JvmName("lightProperty")
    set(`value`) {
      setLight(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_GLTFNODE, scriptIndex)
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


  public fun getOriginalName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOriginalNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setOriginalName(originalName: String): Unit {
    TransferContext.writeArguments(STRING to originalName)
    TransferContext.callMethod(rawPtr, MethodBindings.setOriginalNamePtr, NIL)
  }

  public fun getParent(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParentPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setParent(parent: Int): Unit {
    TransferContext.writeArguments(LONG to parent.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setParentPtr, NIL)
  }

  public fun getHeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setHeight(height: Int): Unit {
    TransferContext.writeArguments(LONG to height.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setHeightPtr, NIL)
  }

  public fun getXform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getXformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  public fun setXform(xform: Transform3D): Unit {
    TransferContext.writeArguments(TRANSFORM3D to xform)
    TransferContext.callMethod(rawPtr, MethodBindings.setXformPtr, NIL)
  }

  public fun getMesh(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMeshPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setMesh(mesh: Int): Unit {
    TransferContext.writeArguments(LONG to mesh.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setMeshPtr, NIL)
  }

  public fun getCamera(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCameraPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setCamera(camera: Int): Unit {
    TransferContext.writeArguments(LONG to camera.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCameraPtr, NIL)
  }

  public fun getSkin(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSkinPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setSkin(skin: Int): Unit {
    TransferContext.writeArguments(LONG to skin.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSkinPtr, NIL)
  }

  public fun getSkeleton(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSkeletonPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setSkeleton(skeleton: Int): Unit {
    TransferContext.writeArguments(LONG to skeleton.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSkeletonPtr, NIL)
  }

  public fun getPosition(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun setPosition(position: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setPositionPtr, NIL)
  }

  public fun getRotation(): Quaternion {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRotationPtr, QUATERNION)
    return (TransferContext.readReturnValue(QUATERNION, false) as Quaternion)
  }

  public fun setRotation(rotation: Quaternion): Unit {
    TransferContext.writeArguments(QUATERNION to rotation)
    TransferContext.callMethod(rawPtr, MethodBindings.setRotationPtr, NIL)
  }

  public fun getScale(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScalePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun setScale(scale: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to scale)
    TransferContext.callMethod(rawPtr, MethodBindings.setScalePtr, NIL)
  }

  public fun getChildren(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getChildrenPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun setChildren(children: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to children)
    TransferContext.callMethod(rawPtr, MethodBindings.setChildrenPtr, NIL)
  }

  public fun getLight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setLight(light: Int): Unit {
    TransferContext.writeArguments(LONG to light.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setLightPtr, NIL)
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
    public val getOriginalNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "get_original_name", 2841200299)

    public val setOriginalNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "set_original_name", 83702148)

    public val getParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "get_parent", 2455072627)

    public val setParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "set_parent", 1286410249)

    public val getHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "get_height", 2455072627)

    public val setHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "set_height", 1286410249)

    public val getXformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "get_xform", 4183770049)

    public val setXformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "set_xform", 2952846383)

    public val getMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "get_mesh", 2455072627)

    public val setMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "set_mesh", 1286410249)

    public val getCameraPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "get_camera", 2455072627)

    public val setCameraPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "set_camera", 1286410249)

    public val getSkinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "get_skin", 2455072627)

    public val setSkinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "set_skin", 1286410249)

    public val getSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "get_skeleton", 2455072627)

    public val setSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "set_skeleton", 1286410249)

    public val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "get_position", 3783033775)

    public val setPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "set_position", 3460891852)

    public val getRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "get_rotation", 2916281908)

    public val setRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "set_rotation", 1727505552)

    public val getScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "get_scale", 3783033775)

    public val setScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "set_scale", 3460891852)

    public val getChildrenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "get_children", 969006518)

    public val setChildrenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "set_children", 3614634198)

    public val getLightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "get_light", 2455072627)

    public val setLightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "set_light", 1286410249)

    public val getAdditionalDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "get_additional_data", 2138907829)

    public val setAdditionalDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFNode", "set_additional_data", 3776071444)
  }
}
