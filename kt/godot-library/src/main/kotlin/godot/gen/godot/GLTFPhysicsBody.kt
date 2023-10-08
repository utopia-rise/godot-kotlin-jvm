// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Basis
import godot.core.Dictionary
import godot.core.VariantType.BASIS
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GLTFPhysicsBody : Resource() {
  public var bodyType: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFPHYSICSBODY_GET_BODY_TYPE,
          STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFPHYSICSBODY_SET_BODY_TYPE,
          NIL)
    }

  public var mass: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFPHYSICSBODY_GET_MASS, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFPHYSICSBODY_SET_MASS, NIL)
    }

  @CoreTypeLocalCopy
  public var linearVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GLTFPHYSICSBODY_GET_LINEAR_VELOCITY, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GLTFPHYSICSBODY_SET_LINEAR_VELOCITY, NIL)
    }

  @CoreTypeLocalCopy
  public var angularVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GLTFPHYSICSBODY_GET_ANGULAR_VELOCITY, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GLTFPHYSICSBODY_SET_ANGULAR_VELOCITY, NIL)
    }

  @CoreTypeLocalCopy
  public var inertiaTensor: Basis
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GLTFPHYSICSBODY_GET_INERTIA_TENSOR, BASIS)
      return (TransferContext.readReturnValue(BASIS, false) as Basis)
    }
    set(`value`) {
      TransferContext.writeArguments(BASIS to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GLTFPHYSICSBODY_SET_INERTIA_TENSOR, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GLTFPHYSICSBODY, scriptIndex)
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
   * val myCoreType = gltfphysicsbody.linearVelocity
   * //Your changes
   * gltfphysicsbody.linearVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun linearVelocityMutate(block: Vector3.() -> Unit): Vector3 = linearVelocity.apply{
      block(this)
      linearVelocity = this
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
   * val myCoreType = gltfphysicsbody.angularVelocity
   * //Your changes
   * gltfphysicsbody.angularVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun angularVelocityMutate(block: Vector3.() -> Unit): Vector3 = angularVelocity.apply{
      block(this)
      angularVelocity = this
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
   * val myCoreType = gltfphysicsbody.inertiaTensor
   * //Your changes
   * gltfphysicsbody.inertiaTensor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun inertiaTensorMutate(block: Basis.() -> Unit): Basis = inertiaTensor.apply{
      block(this)
      inertiaTensor = this
  }


  public fun toNode(): CollisionObject3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFPHYSICSBODY_TO_NODE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as CollisionObject3D?)
  }

  public fun toDictionary(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFPHYSICSBODY_TO_DICTIONARY,
        DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public companion object {
    public fun fromNode(bodyNode: CollisionObject3D): GLTFPhysicsBody? {
      TransferContext.writeArguments(OBJECT to bodyNode)
      TransferContext.callMethod(0, ENGINEMETHOD_ENGINECLASS_GLTFPHYSICSBODY_FROM_NODE, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as GLTFPhysicsBody?)
    }

    public fun fromDictionary(dictionary: Dictionary<Any?, Any?>): GLTFPhysicsBody? {
      TransferContext.writeArguments(DICTIONARY to dictionary)
      TransferContext.callMethod(0, ENGINEMETHOD_ENGINECLASS_GLTFPHYSICSBODY_FROM_DICTIONARY,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as GLTFPhysicsBody?)
    }
  }
}
