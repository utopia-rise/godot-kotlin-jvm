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
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.QUATERNION
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.VariantParser.TRANSFORM3D
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_GLTFNODE_INDEX: Int = 241

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
  public final inline var originalName: String
    @JvmName("originalNameProperty")
    get() = getOriginalName()
    @JvmName("originalNameProperty")
    set(`value`) {
      setOriginalName(value)
    }

  /**
   * The index of the parent node in the [GLTFState]. If -1, this node is a root node.
   */
  public final inline var parent: Int
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
  public final inline var height: Int
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
  public final inline var xform: Transform3D
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
  public final inline var mesh: Int
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
  public final inline var camera: Int
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
  public final inline var skin: Int
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
  public final inline var skeleton: Int
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
  public final inline var position: Vector3
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
  public final inline var rotation: Quaternion
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
  public final inline var scale: Vector3
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
  public final inline var children: PackedInt32Array
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
  public final inline var light: Int
    @JvmName("lightProperty")
    get() = getLight()
    @JvmName("lightProperty")
    set(`value`) {
      setLight(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_GLTFNODE_INDEX, scriptIndex)
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
  public final fun xformMutate(block: Transform3D.() -> Unit): Transform3D = xform.apply{
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
  public final fun positionMutate(block: Vector3.() -> Unit): Vector3 = position.apply{
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
  public final fun rotationMutate(block: Quaternion.() -> Unit): Quaternion = rotation.apply{
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
  public final fun scaleMutate(block: Vector3.() -> Unit): Vector3 = scale.apply{
      block(this)
      scale = this
  }


  public final fun getOriginalName(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOriginalNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setOriginalName(originalName: String): Unit {
    Internals.writeArguments(STRING to originalName)
    Internals.callMethod(rawPtr, MethodBindings.setOriginalNamePtr, NIL)
  }

  public final fun getParent(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getParentPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setParent(parent: Int): Unit {
    Internals.writeArguments(LONG to parent.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setParentPtr, NIL)
  }

  public final fun getHeight(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHeightPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setHeight(height: Int): Unit {
    Internals.writeArguments(LONG to height.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setHeightPtr, NIL)
  }

  public final fun getXform(): Transform3D {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getXformPtr, TRANSFORM3D)
    return (Internals.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  public final fun setXform(xform: Transform3D): Unit {
    Internals.writeArguments(TRANSFORM3D to xform)
    Internals.callMethod(rawPtr, MethodBindings.setXformPtr, NIL)
  }

  public final fun getMesh(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMeshPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMesh(mesh: Int): Unit {
    Internals.writeArguments(LONG to mesh.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setMeshPtr, NIL)
  }

  public final fun getCamera(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCameraPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setCamera(camera: Int): Unit {
    Internals.writeArguments(LONG to camera.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setCameraPtr, NIL)
  }

  public final fun getSkin(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSkinPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSkin(skin: Int): Unit {
    Internals.writeArguments(LONG to skin.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setSkinPtr, NIL)
  }

  public final fun getSkeleton(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSkeletonPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSkeleton(skeleton: Int): Unit {
    Internals.writeArguments(LONG to skeleton.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setSkeletonPtr, NIL)
  }

  public final fun getPosition(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPositionPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setPosition(position: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to position)
    Internals.callMethod(rawPtr, MethodBindings.setPositionPtr, NIL)
  }

  public final fun getRotation(): Quaternion {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRotationPtr, QUATERNION)
    return (Internals.readReturnValue(QUATERNION) as Quaternion)
  }

  public final fun setRotation(rotation: Quaternion): Unit {
    Internals.writeArguments(QUATERNION to rotation)
    Internals.callMethod(rawPtr, MethodBindings.setRotationPtr, NIL)
  }

  public final fun getScale(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getScalePtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setScale(scale: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to scale)
    Internals.callMethod(rawPtr, MethodBindings.setScalePtr, NIL)
  }

  public final fun getChildren(): PackedInt32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getChildrenPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setChildren(children: PackedInt32Array): Unit {
    Internals.writeArguments(PACKED_INT_32_ARRAY to children)
    Internals.callMethod(rawPtr, MethodBindings.setChildrenPtr, NIL)
  }

  public final fun getLight(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLightPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setLight(light: Int): Unit {
    Internals.writeArguments(LONG to light.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setLightPtr, NIL)
  }

  /**
   * Gets additional arbitrary data in this [GLTFNode] instance. This can be used to keep per-node
   * state data in [GLTFDocumentExtension] classes, which is important because they are stateless.
   * The argument should be the [GLTFDocumentExtension] name (does not have to match the extension
   * name in the GLTF file), and the return value can be anything you set. If nothing was set, the
   * return value is null.
   */
  public final fun getAdditionalData(extensionName: StringName): Any? {
    Internals.writeArguments(STRING_NAME to extensionName)
    Internals.callMethod(rawPtr, MethodBindings.getAdditionalDataPtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
  }

  /**
   * Sets additional arbitrary data in this [GLTFNode] instance. This can be used to keep per-node
   * state data in [GLTFDocumentExtension] classes, which is important because they are stateless.
   * The first argument should be the [GLTFDocumentExtension] name (does not have to match the
   * extension name in the GLTF file), and the second argument can be anything you want.
   */
  public final fun setAdditionalData(extensionName: StringName, additionalData: Any?): Unit {
    Internals.writeArguments(STRING_NAME to extensionName, ANY to additionalData)
    Internals.callMethod(rawPtr, MethodBindings.setAdditionalDataPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val getOriginalNamePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "get_original_name", 2841200299)

    public val setOriginalNamePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "set_original_name", 83702148)

    public val getParentPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "get_parent", 2455072627)

    public val setParentPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "set_parent", 1286410249)

    public val getHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "get_height", 2455072627)

    public val setHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "set_height", 1286410249)

    public val getXformPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "get_xform", 4183770049)

    public val setXformPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "set_xform", 2952846383)

    public val getMeshPtr: VoidPtr = Internals.getMethodBindPtr("GLTFNode", "get_mesh", 2455072627)

    public val setMeshPtr: VoidPtr = Internals.getMethodBindPtr("GLTFNode", "set_mesh", 1286410249)

    public val getCameraPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "get_camera", 2455072627)

    public val setCameraPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "set_camera", 1286410249)

    public val getSkinPtr: VoidPtr = Internals.getMethodBindPtr("GLTFNode", "get_skin", 2455072627)

    public val setSkinPtr: VoidPtr = Internals.getMethodBindPtr("GLTFNode", "set_skin", 1286410249)

    public val getSkeletonPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "get_skeleton", 2455072627)

    public val setSkeletonPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "set_skeleton", 1286410249)

    public val getPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "get_position", 3783033775)

    public val setPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "set_position", 3460891852)

    public val getRotationPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "get_rotation", 2916281908)

    public val setRotationPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "set_rotation", 1727505552)

    public val getScalePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "get_scale", 3783033775)

    public val setScalePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "set_scale", 3460891852)

    public val getChildrenPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "get_children", 969006518)

    public val setChildrenPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "set_children", 3614634198)

    public val getLightPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "get_light", 2455072627)

    public val setLightPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "set_light", 1286410249)

    public val getAdditionalDataPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "get_additional_data", 2138907829)

    public val setAdditionalDataPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFNode", "set_additional_data", 3776071444)
  }
}
