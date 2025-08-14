// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Basis
import godot.core.Dictionary
import godot.core.Quaternion
import godot.core.VariantParser.BASIS
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.QUATERNION
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import kotlin.Any
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmStatic

/**
 * Represents a physics body as an intermediary between the `OMI_physics_body` glTF data and Godot's nodes, and it's abstracted in a way that allows adding support for different glTF physics extensions in the future.
 */
@GodotBaseType
public open class GLTFPhysicsBody : Resource() {
  /**
   * The type of the body. When importing, this controls what type of [CollisionObject3D] node Godot should generate. Valid values are "static", "animatable", "character", "rigid", "vehicle", and "trigger". When exporting, this will be squashed down to one of "static", "kinematic", or "dynamic" motion types, or the "trigger" property.
   */
  public final inline var bodyType: String
    @JvmName("bodyTypeProperty")
    get() = getBodyType()
    @JvmName("bodyTypeProperty")
    set(`value`) {
      setBodyType(value)
    }

  /**
   * The mass of the physics body, in kilograms. This is only used when the body type is "rigid" or "vehicle".
   */
  public final inline var mass: Float
    @JvmName("massProperty")
    get() = getMass()
    @JvmName("massProperty")
    set(`value`) {
      setMass(value)
    }

  /**
   * The linear velocity of the physics body, in meters per second. This is only used when the body type is "rigid" or "vehicle".
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
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
   * The angular velocity of the physics body, in radians per second. This is only used when the body type is "rigid" or "vehicle".
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
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
   * The center of mass of the body, in meters. This is in local space relative to the body. By default, the center of the mass is the body's origin.
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
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
   * The inertia strength of the physics body, in kilogram meter squared (kg⋅m²). This represents the inertia around the principle axes, the diagonal of the inertia tensor matrix. This is only used when the body type is "rigid" or "vehicle".
   *
   * When converted to a Godot [RigidBody3D] node, if this value is zero, then the inertia will be calculated automatically.
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
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
   * The inertia orientation of the physics body. This defines the rotation of the inertia's principle axes relative to the object's local axes. This is only used when the body type is "rigid" or "vehicle" and [inertiaDiagonal] is set to a non-zero value.
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
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
   * The inertia tensor of the physics body, in kilogram meter squared (kg⋅m²). This is only used when the body type is "rigid" or "vehicle".
   *
   * When converted to a Godot [RigidBody3D] node, if this value is zero, then the inertia will be calculated automatically.
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var inertiaTensor: Basis
    @JvmName("inertiaTensorProperty")
    get() = getInertiaTensor()
    @JvmName("inertiaTensorProperty")
    set(`value`) {
      setInertiaTensor(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(235, scriptIndex)
  }

  /**
   * This is a helper function for [linearVelocity] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = gltfphysicsbody.linearVelocity
   * //Your changes
   * gltfphysicsbody.linearVelocity = myCoreType
   * ``````
   *
   * The linear velocity of the physics body, in meters per second. This is only used when the body type is "rigid" or "vehicle".
   */
  @CoreTypeHelper
  public final fun linearVelocityMutate(block: Vector3.() -> Unit): Vector3 = linearVelocity.apply {
     block(this)
     linearVelocity = this
  }

  /**
   * This is a helper function for [angularVelocity] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = gltfphysicsbody.angularVelocity
   * //Your changes
   * gltfphysicsbody.angularVelocity = myCoreType
   * ``````
   *
   * The angular velocity of the physics body, in radians per second. This is only used when the body type is "rigid" or "vehicle".
   */
  @CoreTypeHelper
  public final fun angularVelocityMutate(block: Vector3.() -> Unit): Vector3 = angularVelocity.apply {
     block(this)
     angularVelocity = this
  }

  /**
   * This is a helper function for [centerOfMass] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = gltfphysicsbody.centerOfMass
   * //Your changes
   * gltfphysicsbody.centerOfMass = myCoreType
   * ``````
   *
   * The center of mass of the body, in meters. This is in local space relative to the body. By default, the center of the mass is the body's origin.
   */
  @CoreTypeHelper
  public final fun centerOfMassMutate(block: Vector3.() -> Unit): Vector3 = centerOfMass.apply {
     block(this)
     centerOfMass = this
  }

  /**
   * This is a helper function for [inertiaDiagonal] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = gltfphysicsbody.inertiaDiagonal
   * //Your changes
   * gltfphysicsbody.inertiaDiagonal = myCoreType
   * ``````
   *
   * The inertia strength of the physics body, in kilogram meter squared (kg⋅m²). This represents the inertia around the principle axes, the diagonal of the inertia tensor matrix. This is only used when the body type is "rigid" or "vehicle".
   *
   * When converted to a Godot [RigidBody3D] node, if this value is zero, then the inertia will be calculated automatically.
   */
  @CoreTypeHelper
  public final fun inertiaDiagonalMutate(block: Vector3.() -> Unit): Vector3 = inertiaDiagonal.apply {
     block(this)
     inertiaDiagonal = this
  }

  /**
   * This is a helper function for [inertiaOrientation] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = gltfphysicsbody.inertiaOrientation
   * //Your changes
   * gltfphysicsbody.inertiaOrientation = myCoreType
   * ``````
   *
   * The inertia orientation of the physics body. This defines the rotation of the inertia's principle axes relative to the object's local axes. This is only used when the body type is "rigid" or "vehicle" and [inertiaDiagonal] is set to a non-zero value.
   */
  @CoreTypeHelper
  public final fun inertiaOrientationMutate(block: Quaternion.() -> Unit): Quaternion = inertiaOrientation.apply {
     block(this)
     inertiaOrientation = this
  }

  /**
   * This is a helper function for [inertiaTensor] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = gltfphysicsbody.inertiaTensor
   * //Your changes
   * gltfphysicsbody.inertiaTensor = myCoreType
   * ``````
   *
   * The inertia tensor of the physics body, in kilogram meter squared (kg⋅m²). This is only used when the body type is "rigid" or "vehicle".
   *
   * When converted to a Godot [RigidBody3D] node, if this value is zero, then the inertia will be calculated automatically.
   */
  @CoreTypeHelper
  public final fun inertiaTensorMutate(block: Basis.() -> Unit): Basis = inertiaTensor.apply {
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
   * Serializes this GLTFPhysicsBody instance into a [Dictionary]. It will be in the format expected by the `OMI_physics_body` glTF extension.
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

  public final fun setBodyType(bodyType: String) {
    TransferContext.writeArguments(STRING to bodyType)
    TransferContext.callMethod(ptr, MethodBindings.setBodyTypePtr, NIL)
  }

  public final fun getMass(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMassPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMass(mass: Float) {
    TransferContext.writeArguments(DOUBLE to mass.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMassPtr, NIL)
  }

  public final fun getLinearVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLinearVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setLinearVelocity(linearVelocity: Vector3) {
    TransferContext.writeArguments(VECTOR3 to linearVelocity)
    TransferContext.callMethod(ptr, MethodBindings.setLinearVelocityPtr, NIL)
  }

  public final fun getAngularVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAngularVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setAngularVelocity(angularVelocity: Vector3) {
    TransferContext.writeArguments(VECTOR3 to angularVelocity)
    TransferContext.callMethod(ptr, MethodBindings.setAngularVelocityPtr, NIL)
  }

  public final fun getCenterOfMass(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCenterOfMassPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setCenterOfMass(centerOfMass: Vector3) {
    TransferContext.writeArguments(VECTOR3 to centerOfMass)
    TransferContext.callMethod(ptr, MethodBindings.setCenterOfMassPtr, NIL)
  }

  public final fun getInertiaDiagonal(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInertiaDiagonalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setInertiaDiagonal(inertiaDiagonal: Vector3) {
    TransferContext.writeArguments(VECTOR3 to inertiaDiagonal)
    TransferContext.callMethod(ptr, MethodBindings.setInertiaDiagonalPtr, NIL)
  }

  public final fun getInertiaOrientation(): Quaternion {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInertiaOrientationPtr, QUATERNION)
    return (TransferContext.readReturnValue(QUATERNION) as Quaternion)
  }

  public final fun setInertiaOrientation(inertiaOrientation: Quaternion) {
    TransferContext.writeArguments(QUATERNION to inertiaOrientation)
    TransferContext.callMethod(ptr, MethodBindings.setInertiaOrientationPtr, NIL)
  }

  public final fun getInertiaTensor(): Basis {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInertiaTensorPtr, BASIS)
    return (TransferContext.readReturnValue(BASIS) as Basis)
  }

  public final fun setInertiaTensor(inertiaTensor: Basis) {
    TransferContext.writeArguments(BASIS to inertiaTensor)
    TransferContext.callMethod(ptr, MethodBindings.setInertiaTensorPtr, NIL)
  }

  public companion object {
    /**
     * Creates a new GLTFPhysicsBody instance from the given Godot [CollisionObject3D] node.
     */
    @JvmStatic
    public final fun fromNode(bodyNode: CollisionObject3D?): GLTFPhysicsBody? {
      TransferContext.writeArguments(OBJECT to bodyNode)
      TransferContext.callMethod(0, MethodBindings.fromNodePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as GLTFPhysicsBody?)
    }

    /**
     * Creates a new GLTFPhysicsBody instance by parsing the given [Dictionary] in the `OMI_physics_body` glTF extension format.
     */
    @JvmStatic
    public final fun fromDictionary(dictionary: Dictionary<Any?, Any?>): GLTFPhysicsBody? {
      TransferContext.writeArguments(DICTIONARY to dictionary)
      TransferContext.callMethod(0, MethodBindings.fromDictionaryPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as GLTFPhysicsBody?)
    }
  }

  public object MethodBindings {
    internal val fromNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "from_node", 420_544_174)

    internal val toNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "to_node", 3_224_013_656)

    internal val fromDictionaryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "from_dictionary", 1_177_544_336)

    internal val toDictionaryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "to_dictionary", 3_102_165_223)

    internal val getBodyTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "get_body_type", 201_670_096)

    internal val setBodyTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "set_body_type", 83_702_148)

    internal val getMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "get_mass", 1_740_695_150)

    internal val setMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "set_mass", 373_806_689)

    internal val getLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "get_linear_velocity", 3_360_562_783)

    internal val setLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "set_linear_velocity", 3_460_891_852)

    internal val getAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "get_angular_velocity", 3_360_562_783)

    internal val setAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "set_angular_velocity", 3_460_891_852)

    internal val getCenterOfMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "get_center_of_mass", 3_360_562_783)

    internal val setCenterOfMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "set_center_of_mass", 3_460_891_852)

    internal val getInertiaDiagonalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "get_inertia_diagonal", 3_360_562_783)

    internal val setInertiaDiagonalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "set_inertia_diagonal", 3_460_891_852)

    internal val getInertiaOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "get_inertia_orientation", 1_222_331_677)

    internal val setInertiaOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "set_inertia_orientation", 1_727_505_552)

    internal val getInertiaTensorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "get_inertia_tensor", 2_716_978_435)

    internal val setInertiaTensorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFPhysicsBody", "set_inertia_tensor", 1_055_510_324)
  }
}
