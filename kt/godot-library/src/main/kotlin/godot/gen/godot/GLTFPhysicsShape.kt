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

@GodotBaseType
public open class GLTFPhysicsShape : Resource() {
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


  @JvmOverloads
  public fun toNode(cacheShapes: Boolean = false): CollisionShape3D? {
    TransferContext.writeArguments(BOOL to cacheShapes)
    TransferContext.callMethod(rawPtr, MethodBindings.toNodePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as CollisionShape3D?)
  }

  public fun toDictionary(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.toDictionaryPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public companion object {
    public fun fromNode(shapeNode: CollisionShape3D): GLTFPhysicsShape? {
      TransferContext.writeArguments(OBJECT to shapeNode)
      TransferContext.callMethod(0, MethodBindings.fromNodePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as GLTFPhysicsShape?)
    }

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
