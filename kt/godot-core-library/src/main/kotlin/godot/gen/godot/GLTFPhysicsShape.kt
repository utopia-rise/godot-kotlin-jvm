// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.Dictionary
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Any
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
 * Represents a physics shape as defined by the `OMI_physics_shape` or `OMI_collider` GLTF
 * extensions. This class is an intermediary between the GLTF data and Godot's nodes, and it's
 * abstracted in a way that allows adding support for different GLTF physics extensions in the future.
 */
@GodotBaseType
public open class GLTFPhysicsShape : Resource() {
  /**
   * The type of shape this shape represents. Valid values are "box", "capsule", "cylinder",
   * "sphere", "hull", and "trimesh".
   */
  public final inline var shapeType: String
    @JvmName("shapeTypeProperty")
    get() = getShapeType()
    @JvmName("shapeTypeProperty")
    set(`value`) {
      setShapeType(value)
    }

  /**
   * The size of the shape, in meters. This is only used when the shape type is "box", and it
   * represents the "diameter" of the box. This value should not be negative.
   */
  @CoreTypeLocalCopy
  public final inline var size: Vector3
    @JvmName("sizeProperty")
    get() = getSize()
    @JvmName("sizeProperty")
    set(`value`) {
      setSize(value)
    }

  /**
   * The radius of the shape, in meters. This is only used when the shape type is "capsule",
   * "cylinder", or "sphere". This value should not be negative.
   */
  public final inline var radius: Float
    @JvmName("radiusProperty")
    get() = getRadius()
    @JvmName("radiusProperty")
    set(`value`) {
      setRadius(value)
    }

  /**
   * The height of the shape, in meters. This is only used when the shape type is "capsule" or
   * "cylinder". This value should not be negative, and for "capsule" it should be at least twice the
   * radius.
   */
  public final inline var height: Float
    @JvmName("heightProperty")
    get() = getHeight()
    @JvmName("heightProperty")
    set(`value`) {
      setHeight(value)
    }

  /**
   * If `true`, indicates that this shape is a trigger. For Godot, this means that the shape should
   * be a child of an Area3D node.
   * This is the only variable not used in the [toNode] method, it's intended to be used alongside
   * when deciding where to add the generated node as a child.
   */
  public final inline var isTrigger: Boolean
    @JvmName("isTriggerProperty")
    get() = getIsTrigger()
    @JvmName("isTriggerProperty")
    set(`value`) {
      setIsTrigger(value)
    }

  /**
   * The index of the shape's mesh in the GLTF file. This is only used when the shape type is "hull"
   * (convex hull) or "trimesh" (concave trimesh).
   */
  public final inline var meshIndex: Int
    @JvmName("meshIndexProperty")
    get() = getMeshIndex()
    @JvmName("meshIndexProperty")
    set(`value`) {
      setMeshIndex(value)
    }

  /**
   * The [ImporterMesh] resource of the shape. This is only used when the shape type is "hull"
   * (convex hull) or "trimesh" (concave trimesh).
   */
  public final inline var importerMesh: ImporterMesh?
    @JvmName("importerMeshProperty")
    get() = getImporterMesh()
    @JvmName("importerMeshProperty")
    set(`value`) {
      setImporterMesh(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_GLTFPHYSICSSHAPE, scriptIndex)
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
  public final fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
      block(this)
      size = this
  }


  /**
   * Converts this GLTFPhysicsShape instance into a Godot [CollisionShape3D] node.
   */
  @JvmOverloads
  public final fun toNode(cacheShapes: Boolean = false): CollisionShape3D? {
    TransferContext.writeArguments(BOOL to cacheShapes)
    TransferContext.callMethod(ptr, MethodBindings.toNodePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as CollisionShape3D?)
  }

  /**
   * Converts this GLTFPhysicsShape instance into a Godot [Shape3D] resource.
   */
  @JvmOverloads
  public final fun toResource(cacheShapes: Boolean = false): Shape3D? {
    TransferContext.writeArguments(BOOL to cacheShapes)
    TransferContext.callMethod(ptr, MethodBindings.toResourcePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Shape3D?)
  }

  /**
   * Serializes this GLTFPhysicsShape instance into a [Dictionary] in the format defined by
   * `OMI_physics_shape`.
   */
  public final fun toDictionary(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.toDictionaryPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public final fun getShapeType(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getShapeTypePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setShapeType(shapeType: String): Unit {
    TransferContext.writeArguments(STRING to shapeType)
    TransferContext.callMethod(ptr, MethodBindings.setShapeTypePtr, NIL)
  }

  public final fun getSize(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSizePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setSize(size: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to size)
    TransferContext.callMethod(ptr, MethodBindings.setSizePtr, NIL)
  }

  public final fun getRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRadius(radius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRadiusPtr, NIL)
  }

  public final fun getHeight(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setHeight(height: Float): Unit {
    TransferContext.writeArguments(DOUBLE to height.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setHeightPtr, NIL)
  }

  public final fun getIsTrigger(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIsTriggerPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setIsTrigger(isTrigger: Boolean): Unit {
    TransferContext.writeArguments(BOOL to isTrigger)
    TransferContext.callMethod(ptr, MethodBindings.setIsTriggerPtr, NIL)
  }

  public final fun getMeshIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMeshIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMeshIndex(meshIndex: Int): Unit {
    TransferContext.writeArguments(LONG to meshIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMeshIndexPtr, NIL)
  }

  public final fun getImporterMesh(): ImporterMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getImporterMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as ImporterMesh?)
  }

  public final fun setImporterMesh(importerMesh: ImporterMesh?): Unit {
    TransferContext.writeArguments(OBJECT to importerMesh)
    TransferContext.callMethod(ptr, MethodBindings.setImporterMeshPtr, NIL)
  }

  public companion object {
    /**
     * Creates a new GLTFPhysicsShape instance from the given Godot [CollisionShape3D] node.
     */
    public final fun fromNode(shapeNode: CollisionShape3D?): GLTFPhysicsShape? {
      TransferContext.writeArguments(OBJECT to shapeNode)
      TransferContext.callMethod(0, MethodBindings.fromNodePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as GLTFPhysicsShape?)
    }

    /**
     * Creates a new GLTFPhysicsShape instance from the given Godot [Shape3D] resource.
     */
    public final fun fromResource(shapeResource: Shape3D?): GLTFPhysicsShape? {
      TransferContext.writeArguments(OBJECT to shapeResource)
      TransferContext.callMethod(0, MethodBindings.fromResourcePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as GLTFPhysicsShape?)
    }

    /**
     * Creates a new GLTFPhysicsShape instance by parsing the given [Dictionary].
     */
    public final fun fromDictionary(dictionary: Dictionary<Any?, Any?>): GLTFPhysicsShape? {
      TransferContext.writeArguments(DICTIONARY to dictionary)
      TransferContext.callMethod(0, MethodBindings.fromDictionaryPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as GLTFPhysicsShape?)
    }
  }

  internal object MethodBindings {
    public val fromNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "from_node", 3613751275)

    public val toNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "to_node", 563689933)

    public val fromResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "from_resource", 3845569786)

    public val toResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "to_resource", 1913542110)

    public val fromDictionaryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "from_dictionary", 2390691823)

    public val toDictionaryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "to_dictionary", 3102165223)

    public val getShapeTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "get_shape_type", 201670096)

    public val setShapeTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "set_shape_type", 83702148)

    public val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "get_size", 3360562783)

    public val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "set_size", 3460891852)

    public val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "get_radius", 1740695150)

    public val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "set_radius", 373806689)

    public val getHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "get_height", 1740695150)

    public val setHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "set_height", 373806689)

    public val getIsTriggerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "get_is_trigger", 36873697)

    public val setIsTriggerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "set_is_trigger", 2586408642)

    public val getMeshIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "get_mesh_index", 3905245786)

    public val setMeshIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "set_mesh_index", 1286410249)

    public val getImporterMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "get_importer_mesh", 3161779525)

    public val setImporterMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsShape", "set_importer_mesh", 2255166972)
  }
}
