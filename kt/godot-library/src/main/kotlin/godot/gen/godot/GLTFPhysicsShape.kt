// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Represents a physics shape as defined by the `OMI_collider` GLTF extension. This class is an
 * intermediary between the GLTF data and Godot's nodes, and it's abstracted in a way that allows
 * adding support for different GLTF physics extensions in the future.
 */
@GodotBaseType
public open class GLTFPhysicsShape : Resource() {
  /**
   * The type of shape this shape represents. Valid values are "box", "capsule", "cylinder",
   * "sphere", "hull", and "trimesh".
   */
  public var shapeType: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShapeTypePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShapeTypePtr, NIL)
    }

  /**
   * The size of the shape, in meters. This is only used when the shape type is "box", and it
   * represents the "diameter" of the box. This value should not be negative.
   */
  @CoreTypeLocalCopy
  public var size: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
    }

  /**
   * The radius of the shape, in meters. This is only used when the shape type is "capsule",
   * "cylinder", or "sphere". This value should not be negative.
   */
  public var radius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRadiusPtr, NIL)
    }

  /**
   * The height of the shape, in meters. This is only used when the shape type is "capsule" or
   * "cylinder". This value should not be negative, and for "capsule" it should be at least twice the
   * radius.
   */
  public var height: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHeightPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setHeightPtr, NIL)
    }

  /**
   * If `true`, indicates that this shape is a trigger. For Godot, this means that the shape should
   * be a child of an Area3D node.
   * This is the only variable not used in the [toNode] method, it's intended to be used alongside
   * when deciding where to add the generated node as a child.
   */
  public var isTrigger: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIsTriggerPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIsTriggerPtr, NIL)
    }

  /**
   * The index of the shape's mesh in the GLTF file. This is only used when the shape type is "hull"
   * (convex hull) or "trimesh" (concave trimesh).
   */
  public var meshIndex: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMeshIndexPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMeshIndexPtr, NIL)
    }

  /**
   * The [ImporterMesh] resource of the shape. This is only used when the shape type is "hull"
   * (convex hull) or "trimesh" (concave trimesh).
   */
  public var importerMesh: ImporterMesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getImporterMeshPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as ImporterMesh?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setImporterMeshPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GLTFPHYSICSSHAPE, scriptIndex)
    return true
  }

  /**
   * The size of the shape, in meters. This is only used when the shape type is "box", and it
   * represents the "diameter" of the box. This value should not be negative.
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
   * val myCoreType = gltfphysicsshape.size
   * //Your changes
   * gltfphysicsshape.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
      block(this)
      size = this
  }


  /**
   * Converts this GLTFPhysicsShape instance into a Godot [CollisionShape3D] node.
   */
  @JvmOverloads
  public fun toNode(cacheShapes: Boolean = false): CollisionShape3D? {
    TransferContext.writeArguments(BOOL to cacheShapes)
    TransferContext.callMethod(rawPtr, MethodBindings.toNodePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as CollisionShape3D?)
  }

  /**
   * Serializes this GLTFPhysicsShape instance into a [Dictionary].
   */
  public fun toDictionary(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.toDictionaryPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public companion object {
    /**
     * Create a new GLTFPhysicsShape instance from the given Godot [CollisionShape3D] node.
     */
    public fun fromNode(shapeNode: CollisionShape3D): GLTFPhysicsShape? {
      TransferContext.writeArguments(OBJECT to shapeNode)
      TransferContext.callMethod(0, MethodBindings.fromNodePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as GLTFPhysicsShape?)
    }

    /**
     * Creates a new GLTFPhysicsShape instance by parsing the given [Dictionary].
     */
    public fun fromDictionary(dictionary: Dictionary<Any?, Any?>): GLTFPhysicsShape? {
      TransferContext.writeArguments(DICTIONARY to dictionary)
      TransferContext.callMethod(0, MethodBindings.fromDictionaryPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as GLTFPhysicsShape?)
    }
  }

  internal object MethodBindings {
    public val fromNodePtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFPhysicsShape", "from_node")

    public val toNodePtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFPhysicsShape", "to_node")

    public val fromDictionaryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "from_dictionary")

    public val toDictionaryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "to_dictionary")

    public val getShapeTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "get_shape_type")

    public val setShapeTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "set_shape_type")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFPhysicsShape", "get_size")

    public val setSizePtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFPhysicsShape", "set_size")

    public val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "get_radius")

    public val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "set_radius")

    public val getHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "get_height")

    public val setHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "set_height")

    public val getIsTriggerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "get_is_trigger")

    public val setIsTriggerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "set_is_trigger")

    public val getMeshIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "get_mesh_index")

    public val setMeshIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "set_mesh_index")

    public val getImporterMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "get_importer_mesh")

    public val setImporterMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "set_importer_mesh")
  }
}
