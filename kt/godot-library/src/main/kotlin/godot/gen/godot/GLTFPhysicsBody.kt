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
import godot.core.Basis
import godot.core.Dictionary
import godot.core.Quaternion
import godot.core.TypeManager
import godot.core.VariantParser.BASIS
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.QUATERNION
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents a physics body as an intermediary between the `OMI_physics_body` GLTF data and Godot's
 * nodes, and it's abstracted in a way that allows adding support for different GLTF physics extensions
 * in the future.
 */
@GodotBaseType
public open class GLTFPhysicsBody : Resource() {
  /**
   * The type of the body. When importing, this controls what type of [CollisionObject3D] node Godot
   * should generate. Valid values are "static", "animatable", "character", "rigid", "vehicle", and
   * "trigger". When exporting, this will be squashed down to one of "static", "kinematic", or
   * "dynamic" motion types, or the "trigger" property.
   */
  public final inline var bodyType: String
    @JvmName("bodyTypeProperty")
    get() = getBodyType()
    @JvmName("bodyTypeProperty")
    set(`value`) {
      setBodyType(value)
    }

  /**
   * The mass of the physics body, in kilograms. This is only used when the body type is "rigid" or
   * "vehicle".
   */
  public final inline var mass: Float
    @JvmName("massProperty")
    get() = getMass()
    @JvmName("massProperty")
    set(`value`) {
      setMass(value)
    }

  /**
   * The linear velocity of the physics body, in meters per second. This is only used when the body
   * type is "rigid" or "vehicle".
   */
  @CoreTypeLocalCopy
  public final inline var linearVelocity: Vector3
    @JvmName("linearVelocityProperty")
    get() = getLinearVelocity()
    @JvmName("linearVelocityProperty")
    set(`value`) {
      setLinearVelocity(value)
    }

  /**
   * The angular velocity of the physics body, in radians per second. This is only used when the
   * body type is "rigid" or "vehicle".
   */
  @CoreTypeLocalCopy
  public final inline var angularVelocity: Vector3
    @JvmName("angularVelocityProperty")
    get() = getAngularVelocity()
    @JvmName("angularVelocityProperty")
    set(`value`) {
      setAngularVelocity(value)
    }

  /**
   * The center of mass of the body, in meters. This is in local space relative to the body. By
   * default, the center of the mass is the body's origin.
   */
  @CoreTypeLocalCopy
  public final inline var centerOfMass: Vector3
    @JvmName("centerOfMassProperty")
    get() = getCenterOfMass()
    @JvmName("centerOfMassProperty")
    set(`value`) {
      setCenterOfMass(value)
    }

  /**
   * The inertia strength of the physics body, in kilogram meter squared (kg⋅m²). This represents
   * the inertia around the principle axes, the diagonal of the inertia tensor matrix. This is only
   * used when the body type is "rigid" or "vehicle".
   * When converted to a Godot [RigidBody3D] node, if this value is zero, then the inertia will be
   * calculated automatically.
   */
  @CoreTypeLocalCopy
  public final inline var inertiaDiagonal: Vector3
    @JvmName("inertiaDiagonalProperty")
    get() = getInertiaDiagonal()
    @JvmName("inertiaDiagonalProperty")
    set(`value`) {
      setInertiaDiagonal(value)
    }

  /**
   * The inertia orientation of the physics body. This defines the rotation of the inertia's
   * principle axes relative to the object's local axes. This is only used when the body type is
   * "rigid" or "vehicle" and [inertiaDiagonal] is set to a non-zero value.
   */
  @CoreTypeLocalCopy
  public final inline var inertiaOrientation: Quaternion
    @JvmName("inertiaOrientationProperty")
    get() = getInertiaOrientation()
    @JvmName("inertiaOrientationProperty")
    set(`value`) {
      setInertiaOrientation(value)
    }

  /**
   * The inertia tensor of the physics body, in kilogram meter squared (kg⋅m²). This is only used
   * when the body type is "rigid" or "vehicle".
   * When converted to a Godot [RigidBody3D] node, if this value is zero, then the inertia will be
   * calculated automatically.
   */
  @CoreTypeLocalCopy
  public final inline var inertiaTensor: Basis
    @JvmName("inertiaTensorProperty")
    get() = getInertiaTensor()
    @JvmName("inertiaTensorProperty")
    set(`value`) {
      setInertiaTensor(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_GLTFPHYSICSBODY, scriptIndex)
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
  public final fun linearVelocityMutate(block: Vector3.() -> Unit): Vector3 = linearVelocity.apply{
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
  public final fun angularVelocityMutate(block: Vector3.() -> Unit): Vector3 =
      angularVelocity.apply{
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
  public final fun centerOfMassMutate(block: Vector3.() -> Unit): Vector3 = centerOfMass.apply{
      block(this)
      centerOfMass = this
  }


  /**
   * The inertia strength of the physics body, in kilogram meter squared (kg⋅m²). This represents
   * the inertia around the principle axes, the diagonal of the inertia tensor matrix. This is only
   * used when the body type is "rigid" or "vehicle".
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
   * val myCoreType = gltfphysicsbody.inertiaDiagonal
   * //Your changes
   * gltfphysicsbody.inertiaDiagonal = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun inertiaDiagonalMutate(block: Vector3.() -> Unit): Vector3 =
      inertiaDiagonal.apply{
      block(this)
      inertiaDiagonal = this
  }


  /**
   * The inertia orientation of the physics body. This defines the rotation of the inertia's
   * principle axes relative to the object's local axes. This is only used when the body type is
   * "rigid" or "vehicle" and [inertiaDiagonal] is set to a non-zero value.
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
   * val myCoreType = gltfphysicsbody.inertiaOrientation
   * //Your changes
   * gltfphysicsbody.inertiaOrientation = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun inertiaOrientationMutate(block: Quaternion.() -> Unit): Quaternion =
      inertiaOrientation.apply{
      block(this)
      inertiaOrientation = this
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
  public final fun inertiaTensorMutate(block: Basis.() -> Unit): Basis = inertiaTensor.apply{
      block(this)
      inertiaTensor = this
  }


  /**
   * Converts this GLTFPhysicsBody instance into a Godot [CollisionObject3D] node.
   */
  public final fun toNode(): CollisionObject3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.toNodePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as CollisionObject3D?)
  }

  /**
   * Serializes this GLTFPhysicsBody instance into a [Dictionary]. It will be in the format expected
   * by the `OMI_physics_body` GLTF extension.
   */
  public final fun toDictionary(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.toDictionaryPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public final fun getBodyType(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBodyTypePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setBodyType(bodyType: String): Unit {
    TransferContext.writeArguments(STRING to bodyType)
    TransferContext.callMethod(ptr, MethodBindings.setBodyTypePtr, NIL)
  }

  public final fun getMass(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMassPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMass(mass: Float): Unit {
    TransferContext.writeArguments(DOUBLE to mass.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMassPtr, NIL)
  }

  public final fun getLinearVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLinearVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setLinearVelocity(linearVelocity: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to linearVelocity)
    TransferContext.callMethod(ptr, MethodBindings.setLinearVelocityPtr, NIL)
  }

  public final fun getAngularVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAngularVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setAngularVelocity(angularVelocity: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to angularVelocity)
    TransferContext.callMethod(ptr, MethodBindings.setAngularVelocityPtr, NIL)
  }

  public final fun getCenterOfMass(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCenterOfMassPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setCenterOfMass(centerOfMass: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to centerOfMass)
    TransferContext.callMethod(ptr, MethodBindings.setCenterOfMassPtr, NIL)
  }

  public final fun getInertiaDiagonal(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInertiaDiagonalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setInertiaDiagonal(inertiaDiagonal: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to inertiaDiagonal)
    TransferContext.callMethod(ptr, MethodBindings.setInertiaDiagonalPtr, NIL)
  }

  public final fun getInertiaOrientation(): Quaternion {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInertiaOrientationPtr, QUATERNION)
    return (TransferContext.readReturnValue(QUATERNION) as Quaternion)
  }

  public final fun setInertiaOrientation(inertiaOrientation: Quaternion): Unit {
    TransferContext.writeArguments(QUATERNION to inertiaOrientation)
    TransferContext.callMethod(ptr, MethodBindings.setInertiaOrientationPtr, NIL)
  }

  public final fun getInertiaTensor(): Basis {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInertiaTensorPtr, BASIS)
    return (TransferContext.readReturnValue(BASIS) as Basis)
  }

  public final fun setInertiaTensor(inertiaTensor: Basis): Unit {
    TransferContext.writeArguments(BASIS to inertiaTensor)
    TransferContext.callMethod(ptr, MethodBindings.setInertiaTensorPtr, NIL)
  }

  public companion object {
    /**
     * Creates a new GLTFPhysicsBody instance from the given Godot [CollisionObject3D] node.
     */
    public final fun fromNode(bodyNode: CollisionObject3D?): GLTFPhysicsBody? {
      TransferContext.writeArguments(OBJECT to bodyNode)
      TransferContext.callMethod(0, MethodBindings.fromNodePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as GLTFPhysicsBody?)
    }

    /**
     * Creates a new GLTFPhysicsBody instance by parsing the given [Dictionary] in the
     * `OMI_physics_body` GLTF extension format.
     */
    public final fun fromDictionary(dictionary: Dictionary<Any?, Any?>): GLTFPhysicsBody? {
      TransferContext.writeArguments(DICTIONARY to dictionary)
      TransferContext.callMethod(0, MethodBindings.fromDictionaryPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as GLTFPhysicsBody?)
    }
  }

  internal object MethodBindings {
    public val fromNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "from_node", 420544174)

    public val toNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "to_node", 3224013656)

    public val fromDictionaryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "from_dictionary", 1177544336)

    public val toDictionaryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "to_dictionary", 3102165223)

    public val getBodyTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "get_body_type", 201670096)

    public val setBodyTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "set_body_type", 83702148)

    public val getMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "get_mass", 1740695150)

    public val setMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "set_mass", 373806689)

    public val getLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "get_linear_velocity", 3360562783)

    public val setLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "set_linear_velocity", 3460891852)

    public val getAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "get_angular_velocity", 3360562783)

    public val setAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "set_angular_velocity", 3460891852)

    public val getCenterOfMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "get_center_of_mass", 3360562783)

    public val setCenterOfMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "set_center_of_mass", 3460891852)

    public val getInertiaDiagonalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "get_inertia_diagonal", 3360562783)

    public val setInertiaDiagonalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "set_inertia_diagonal", 3460891852)

    public val getInertiaOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "get_inertia_orientation", 1222331677)

    public val setInertiaOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "set_inertia_orientation", 1727505552)

    public val getInertiaTensorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "get_inertia_tensor", 2716978435)

    public val setInertiaTensorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "set_inertia_tensor", 1055510324)
  }
}
