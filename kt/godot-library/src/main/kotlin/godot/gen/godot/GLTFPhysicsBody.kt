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
import godot.core.TypeManager
import godot.core.VariantType.BASIS
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
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
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Represents a physics body as defined by the `OMI_physics_body` GLTF extension. This class is an
 * intermediary between the GLTF data and Godot's nodes, and it's abstracted in a way that allows
 * adding support for different GLTF physics extensions in the future.
 */
@GodotBaseType
public open class GLTFPhysicsBody : Resource() {
  /**
   * The type of the body. When importing, this controls what type of [CollisionObject3D] node Godot
   * should generate. Valid values are "static", "kinematic", "character", "rigid", "vehicle", and
   * "trigger".
   */
  public var bodyType: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBodyTypePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBodyTypePtr, NIL)
    }

  /**
   * The mass of the physics body, in kilograms. This is only used when the body type is "rigid" or
   * "vehicle".
   */
  public var mass: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMassPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMassPtr, NIL)
    }

  /**
   * The linear velocity of the physics body, in meters per second. This is only used when the body
   * type is "rigid" or "vehicle".
   */
  @CoreTypeLocalCopy
  public var linearVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLinearVelocityPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLinearVelocityPtr, NIL)
    }

  /**
   * The angular velocity of the physics body, in radians per second. This is only used when the
   * body type is "rigid" or "vehicle".
   */
  @CoreTypeLocalCopy
  public var angularVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAngularVelocityPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAngularVelocityPtr, NIL)
    }

  /**
   * The center of mass of the body, in meters. This is in local space relative to the body. By
   * default, the center of the mass is the body's origin.
   */
  @CoreTypeLocalCopy
  public var centerOfMass: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCenterOfMassPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCenterOfMassPtr, NIL)
    }

  /**
   * The inertia tensor of the physics body, in kilogram meter squared (kg⋅m²). This is only used
   * when the body type is "rigid" or "vehicle".
   * When converted to a Godot [RigidBody3D] node, if this value is zero, then the inertia will be
   * calculated automatically.
   */
  @CoreTypeLocalCopy
  public var inertiaTensor: Basis
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInertiaTensorPtr, BASIS)
      return (TransferContext.readReturnValue(BASIS, false) as Basis)
    }
    set(`value`) {
      TransferContext.writeArguments(BASIS to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setInertiaTensorPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GLTFPHYSICSBODY, scriptIndex)
    return true
  }

  /**
   * The linear velocity of the physics body, in meters per second. This is only used when the body
   * type is "rigid" or "vehicle".
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
   * The angular velocity of the physics body, in radians per second. This is only used when the
   * body type is "rigid" or "vehicle".
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
   * The center of mass of the body, in meters. This is in local space relative to the body. By
   * default, the center of the mass is the body's origin.
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
   * val myCoreType = gltfphysicsbody.centerOfMass
   * //Your changes
   * gltfphysicsbody.centerOfMass = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun centerOfMassMutate(block: Vector3.() -> Unit): Vector3 = centerOfMass.apply{
      block(this)
      centerOfMass = this
  }


  /**
   * The inertia tensor of the physics body, in kilogram meter squared (kg⋅m²). This is only used
   * when the body type is "rigid" or "vehicle".
   * When converted to a Godot [RigidBody3D] node, if this value is zero, then the inertia will be
   * calculated automatically.
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


  /**
   * Converts this GLTFPhysicsBody instance into a Godot [CollisionObject3D] node.
   */
  public fun toNode(): CollisionObject3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.toNodePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as CollisionObject3D?)
  }

  /**
   * Serializes this GLTFPhysicsBody instance into a [Dictionary].
   */
  public fun toDictionary(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.toDictionaryPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public companion object {
    /**
     * Create a new GLTFPhysicsBody instance from the given Godot [CollisionObject3D] node.
     */
    public fun fromNode(bodyNode: CollisionObject3D): GLTFPhysicsBody? {
      TransferContext.writeArguments(OBJECT to bodyNode)
      TransferContext.callMethod(0, MethodBindings.fromNodePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as GLTFPhysicsBody?)
    }

    /**
     * Creates a new GLTFPhysicsBody instance by parsing the given [Dictionary].
     */
    public fun fromDictionary(dictionary: Dictionary<Any?, Any?>): GLTFPhysicsBody? {
      TransferContext.writeArguments(DICTIONARY to dictionary)
      TransferContext.callMethod(0, MethodBindings.fromDictionaryPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as GLTFPhysicsBody?)
    }
  }

  internal object MethodBindings {
    public val fromNodePtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFPhysicsBody", "from_node")

    public val toNodePtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFPhysicsBody", "to_node")

    public val fromDictionaryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "from_dictionary")

    public val toDictionaryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "to_dictionary")

    public val getBodyTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "get_body_type")

    public val setBodyTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "set_body_type")

    public val getMassPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFPhysicsBody", "get_mass")

    public val setMassPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFPhysicsBody", "set_mass")

    public val getLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "get_linear_velocity")

    public val setLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "set_linear_velocity")

    public val getAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "get_angular_velocity")

    public val setAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "set_angular_velocity")

    public val getCenterOfMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "get_center_of_mass")

    public val setCenterOfMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "set_center_of_mass")

    public val getInertiaTensorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "get_inertia_tensor")

    public val setInertiaTensorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "set_inertia_tensor")
  }
}
