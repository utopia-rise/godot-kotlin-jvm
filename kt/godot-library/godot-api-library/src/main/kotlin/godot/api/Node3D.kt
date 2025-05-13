// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Basis
import godot.core.EulerOrder
import godot.core.MethodStringName0
import godot.core.MethodStringName1
import godot.core.MethodStringName2
import godot.core.MethodStringName3
import godot.core.MethodStringName4
import godot.core.NodePath
import godot.core.Quaternion
import godot.core.Signal0
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BASIS
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.QUATERNION
import godot.core.VariantParser.TRANSFORM3D
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import godot.core.asCachedNodePath
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Most basic 3D game object, with a [Transform3D] and visibility settings. All other 3D game
 * objects inherit from [Node3D]. Use [Node3D] as a parent node to move, scale, rotate and show/hide
 * children in a 3D project.
 *
 * Affine operations (rotate, scale, translate) happen in parent's local coordinate system, unless
 * the [Node3D] object is set as top-level. Affine operations in this coordinate system correspond to
 * direct affine operations on the [Node3D]'s transform. The word local below refers to this coordinate
 * system. The coordinate system that is attached to the [Node3D] object itself is referred to as
 * object-local coordinate system.
 *
 * **Note:** Unless otherwise specified, all methods that have angle parameters must have angles
 * specified as *radians*. To convert degrees to radians, use [@GlobalScope.degToRad].
 *
 * **Note:** Be aware that "Spatial" nodes are now called "Node3D" starting with Godot 4. Any Godot
 * 3.x references to "Spatial" nodes refer to "Node3D" in Godot 4.
 */
@GodotBaseType
public open class Node3D : Node() {
  /**
   * Emitted when node visibility changes.
   */
  public val visibilityChanged: Signal0 by Signal0

  /**
   * Local space [Transform3D] of this node, with respect to the parent node.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var transform: Transform3D
    @JvmName("transformProperty")
    get() = getTransform()
    @JvmName("transformProperty")
    set(`value`) {
      setTransform(value)
    }

  /**
   * World3D space (global) [Transform3D] of this node.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var globalTransform: Transform3D
    @JvmName("globalTransformProperty")
    get() = getGlobalTransform()
    @JvmName("globalTransformProperty")
    set(`value`) {
      setGlobalTransform(value)
    }

  /**
   * Local position or translation of this node relative to the parent. This is equivalent to
   * `transform.origin`.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
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
   * Rotation part of the local transformation in radians, specified in terms of Euler angles. The
   * angles construct a rotation in the order specified by the [rotationOrder] property.
   *
   * **Note:** In the mathematical sense, rotation is a matrix and not a vector. The three Euler
   * angles, which are the three independent parameters of the Euler-angle parametrization of the
   * rotation matrix, are stored in a [Vector3] data structure not because the rotation is a vector,
   * but only because [Vector3] exists as a convenient data-structure to store 3 floating-point
   * numbers. Therefore, applying affine operations on the rotation "vector" is not meaningful.
   *
   * **Note:** This property is edited in the inspector in degrees. If you want to use degrees in a
   * script, use [rotationDegrees].
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var rotation: Vector3
    @JvmName("rotationProperty")
    get() = getRotation()
    @JvmName("rotationProperty")
    set(`value`) {
      setRotation(value)
    }

  /**
   * Helper property to access [rotation] in degrees instead of radians.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var rotationDegrees: Vector3
    @JvmName("rotationDegreesProperty")
    get() = getRotationDegrees()
    @JvmName("rotationDegreesProperty")
    set(`value`) {
      setRotationDegrees(value)
    }

  /**
   * Access to the node rotation as a [Quaternion]. This property is ideal for tweening complex
   * rotations.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var quaternion: Quaternion
    @JvmName("quaternionProperty")
    get() = getQuaternion()
    @JvmName("quaternionProperty")
    set(`value`) {
      setQuaternion(value)
    }

  /**
   * Basis of the [transform] property. Represents the rotation, scale, and shear of this node.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var basis: Basis
    @JvmName("basisProperty")
    get() = getBasis()
    @JvmName("basisProperty")
    set(`value`) {
      setBasis(value)
    }

  /**
   * Scale part of the local transformation.
   *
   * **Note:** Mixed negative scales in 3D are not decomposable from the transformation matrix. Due
   * to the way scale is represented with transformation matrices in Godot, the scale values will
   * either be all positive or all negative.
   *
   * **Note:** Not all nodes are visually scaled by the [scale] property. For example, [Light3D]s
   * are not visually affected by [scale].
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
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
   * Specify how rotation (and scale) will be presented in the editor.
   */
  public final inline var rotationEditMode: RotationEditMode
    @JvmName("rotationEditModeProperty")
    get() = getRotationEditMode()
    @JvmName("rotationEditModeProperty")
    set(`value`) {
      setRotationEditMode(value)
    }

  /**
   * Specify the axis rotation order of the [rotation] property. The final orientation is
   * constructed by rotating the Euler angles in the order specified by this property.
   */
  public final inline var rotationOrder: EulerOrder
    @JvmName("rotationOrderProperty")
    get() = getRotationOrder()
    @JvmName("rotationOrderProperty")
    set(`value`) {
      setRotationOrder(value)
    }

  /**
   * If `true`, the node will not inherit its transformations from its parent. Node transformations
   * are only in global space.
   */
  public final inline var topLevel: Boolean
    @JvmName("topLevelProperty")
    get() = isSetAsTopLevel()
    @JvmName("topLevelProperty")
    set(`value`) {
      setAsTopLevel(value)
    }

  /**
   * Global position of this node. This is equivalent to `global_transform.origin`.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var globalPosition: Vector3
    @JvmName("globalPositionProperty")
    get() = getGlobalPosition()
    @JvmName("globalPositionProperty")
    set(`value`) {
      setGlobalPosition(value)
    }

  /**
   * Global basis of this node. This is equivalent to `global_transform.basis`.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var globalBasis: Basis
    @JvmName("globalBasisProperty")
    get() = getGlobalBasis()
    @JvmName("globalBasisProperty")
    set(`value`) {
      setGlobalBasis(value)
    }

  /**
   * Rotation part of the global transformation in radians, specified in terms of YXZ-Euler angles
   * in the format (X angle, Y angle, Z angle).
   *
   * **Note:** In the mathematical sense, rotation is a matrix and not a vector. The three Euler
   * angles, which are the three independent parameters of the Euler-angle parametrization of the
   * rotation matrix, are stored in a [Vector3] data structure not because the rotation is a vector,
   * but only because [Vector3] exists as a convenient data-structure to store 3 floating-point
   * numbers. Therefore, applying affine operations on the rotation "vector" is not meaningful.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var globalRotation: Vector3
    @JvmName("globalRotationProperty")
    get() = getGlobalRotation()
    @JvmName("globalRotationProperty")
    set(`value`) {
      setGlobalRotation(value)
    }

  /**
   * Helper property to access [globalRotation] in degrees instead of radians.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var globalRotationDegrees: Vector3
    @JvmName("globalRotationDegreesProperty")
    get() = getGlobalRotationDegrees()
    @JvmName("globalRotationDegreesProperty")
    set(`value`) {
      setGlobalRotationDegrees(value)
    }

  /**
   * If `true`, this node is drawn. The node is only visible if all of its ancestors are visible as
   * well (in other words, [isVisibleInTree] must return `true`).
   */
  public final inline var visible: Boolean
    @JvmName("visibleProperty")
    get() = isVisible()
    @JvmName("visibleProperty")
    set(`value`) {
      setVisible(value)
    }

  /**
   * Defines the visibility range parent for this node and its subtree. The visibility parent must
   * be a GeometryInstance3D. Any visual instance will only be visible if the visibility parent (and
   * all of its visibility ancestors) is hidden by being closer to the camera than its own
   * [GeometryInstance3D.visibilityRangeBegin]. Nodes hidden via the [Node3D.visible] property are
   * essentially removed from the visibility dependency tree, so dependent instances will not take the
   * hidden node or its ancestors into account.
   */
  public final inline var visibilityParent: NodePath
    @JvmName("visibilityParentProperty")
    get() = getVisibilityParent()
    @JvmName("visibilityParentProperty")
    set(`value`) {
      setVisibilityParent(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(396, scriptIndex)
  }

  /**
   * This is a helper function for [transform] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = node3d.transform
   * //Your changes
   * node3d.transform = myCoreType
   * ``````
   *
   * Local space [Transform3D] of this node, with respect to the parent node.
   */
  @CoreTypeHelper
  public final fun transformMutate(block: Transform3D.() -> Unit): Transform3D = transform.apply {
     block(this)
     transform = this
  }

  /**
   * This is a helper function for [globalTransform] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = node3d.globalTransform
   * //Your changes
   * node3d.globalTransform = myCoreType
   * ``````
   *
   * World3D space (global) [Transform3D] of this node.
   */
  @CoreTypeHelper
  public final fun globalTransformMutate(block: Transform3D.() -> Unit): Transform3D =
      globalTransform.apply {
     block(this)
     globalTransform = this
  }

  /**
   * This is a helper function for [position] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = node3d.position
   * //Your changes
   * node3d.position = myCoreType
   * ``````
   *
   * Local position or translation of this node relative to the parent. This is equivalent to
   * `transform.origin`.
   */
  @CoreTypeHelper
  public final fun positionMutate(block: Vector3.() -> Unit): Vector3 = position.apply {
     block(this)
     position = this
  }

  /**
   * This is a helper function for [rotation] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = node3d.rotation
   * //Your changes
   * node3d.rotation = myCoreType
   * ``````
   *
   * Rotation part of the local transformation in radians, specified in terms of Euler angles. The
   * angles construct a rotation in the order specified by the [rotationOrder] property.
   *
   * **Note:** In the mathematical sense, rotation is a matrix and not a vector. The three Euler
   * angles, which are the three independent parameters of the Euler-angle parametrization of the
   * rotation matrix, are stored in a [Vector3] data structure not because the rotation is a vector,
   * but only because [Vector3] exists as a convenient data-structure to store 3 floating-point
   * numbers. Therefore, applying affine operations on the rotation "vector" is not meaningful.
   *
   * **Note:** This property is edited in the inspector in degrees. If you want to use degrees in a
   * script, use [rotationDegrees].
   */
  @CoreTypeHelper
  public final fun rotationMutate(block: Vector3.() -> Unit): Vector3 = rotation.apply {
     block(this)
     rotation = this
  }

  /**
   * This is a helper function for [rotationDegrees] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = node3d.rotationDegrees
   * //Your changes
   * node3d.rotationDegrees = myCoreType
   * ``````
   *
   * Helper property to access [rotation] in degrees instead of radians.
   */
  @CoreTypeHelper
  public final fun rotationDegreesMutate(block: Vector3.() -> Unit): Vector3 =
      rotationDegrees.apply {
     block(this)
     rotationDegrees = this
  }

  /**
   * This is a helper function for [quaternion] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = node3d.quaternion
   * //Your changes
   * node3d.quaternion = myCoreType
   * ``````
   *
   * Access to the node rotation as a [Quaternion]. This property is ideal for tweening complex
   * rotations.
   */
  @CoreTypeHelper
  public final fun quaternionMutate(block: Quaternion.() -> Unit): Quaternion = quaternion.apply {
     block(this)
     quaternion = this
  }

  /**
   * This is a helper function for [basis] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = node3d.basis
   * //Your changes
   * node3d.basis = myCoreType
   * ``````
   *
   * Basis of the [transform] property. Represents the rotation, scale, and shear of this node.
   */
  @CoreTypeHelper
  public final fun basisMutate(block: Basis.() -> Unit): Basis = basis.apply {
     block(this)
     basis = this
  }

  /**
   * This is a helper function for [scale] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = node3d.scale
   * //Your changes
   * node3d.scale = myCoreType
   * ``````
   *
   * Scale part of the local transformation.
   *
   * **Note:** Mixed negative scales in 3D are not decomposable from the transformation matrix. Due
   * to the way scale is represented with transformation matrices in Godot, the scale values will
   * either be all positive or all negative.
   *
   * **Note:** Not all nodes are visually scaled by the [scale] property. For example, [Light3D]s
   * are not visually affected by [scale].
   */
  @CoreTypeHelper
  public final fun scaleMutate(block: Vector3.() -> Unit): Vector3 = scale.apply {
     block(this)
     scale = this
  }

  /**
   * This is a helper function for [globalPosition] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = node3d.globalPosition
   * //Your changes
   * node3d.globalPosition = myCoreType
   * ``````
   *
   * Global position of this node. This is equivalent to `global_transform.origin`.
   */
  @CoreTypeHelper
  public final fun globalPositionMutate(block: Vector3.() -> Unit): Vector3 = globalPosition.apply {
     block(this)
     globalPosition = this
  }

  /**
   * This is a helper function for [globalBasis] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = node3d.globalBasis
   * //Your changes
   * node3d.globalBasis = myCoreType
   * ``````
   *
   * Global basis of this node. This is equivalent to `global_transform.basis`.
   */
  @CoreTypeHelper
  public final fun globalBasisMutate(block: Basis.() -> Unit): Basis = globalBasis.apply {
     block(this)
     globalBasis = this
  }

  /**
   * This is a helper function for [globalRotation] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = node3d.globalRotation
   * //Your changes
   * node3d.globalRotation = myCoreType
   * ``````
   *
   * Rotation part of the global transformation in radians, specified in terms of YXZ-Euler angles
   * in the format (X angle, Y angle, Z angle).
   *
   * **Note:** In the mathematical sense, rotation is a matrix and not a vector. The three Euler
   * angles, which are the three independent parameters of the Euler-angle parametrization of the
   * rotation matrix, are stored in a [Vector3] data structure not because the rotation is a vector,
   * but only because [Vector3] exists as a convenient data-structure to store 3 floating-point
   * numbers. Therefore, applying affine operations on the rotation "vector" is not meaningful.
   */
  @CoreTypeHelper
  public final fun globalRotationMutate(block: Vector3.() -> Unit): Vector3 = globalRotation.apply {
     block(this)
     globalRotation = this
  }

  /**
   * This is a helper function for [globalRotationDegrees] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = node3d.globalRotationDegrees
   * //Your changes
   * node3d.globalRotationDegrees = myCoreType
   * ``````
   *
   * Helper property to access [globalRotation] in degrees instead of radians.
   */
  @CoreTypeHelper
  public final fun globalRotationDegreesMutate(block: Vector3.() -> Unit): Vector3 =
      globalRotationDegrees.apply {
     block(this)
     globalRotationDegrees = this
  }

  public final fun setTransform(local: Transform3D): Unit {
    TransferContext.writeArguments(TRANSFORM3D to local)
    TransferContext.callMethod(ptr, MethodBindings.setTransformPtr, NIL)
  }

  public final fun getTransform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  public final fun setPosition(position: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to position)
    TransferContext.callMethod(ptr, MethodBindings.setPositionPtr, NIL)
  }

  public final fun getPosition(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setRotation(eulerRadians: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to eulerRadians)
    TransferContext.callMethod(ptr, MethodBindings.setRotationPtr, NIL)
  }

  public final fun getRotation(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRotationPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setRotationDegrees(eulerDegrees: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to eulerDegrees)
    TransferContext.callMethod(ptr, MethodBindings.setRotationDegreesPtr, NIL)
  }

  public final fun getRotationDegrees(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRotationDegreesPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setRotationOrder(order: EulerOrder): Unit {
    TransferContext.writeArguments(LONG to order.id)
    TransferContext.callMethod(ptr, MethodBindings.setRotationOrderPtr, NIL)
  }

  public final fun getRotationOrder(): EulerOrder {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRotationOrderPtr, LONG)
    return EulerOrder.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setRotationEditMode(editMode: RotationEditMode): Unit {
    TransferContext.writeArguments(LONG to editMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setRotationEditModePtr, NIL)
  }

  public final fun getRotationEditMode(): RotationEditMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRotationEditModePtr, LONG)
    return RotationEditMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setScale(scale: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to scale)
    TransferContext.callMethod(ptr, MethodBindings.setScalePtr, NIL)
  }

  public final fun getScale(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getScalePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setQuaternion(quaternion: Quaternion): Unit {
    TransferContext.writeArguments(QUATERNION to quaternion)
    TransferContext.callMethod(ptr, MethodBindings.setQuaternionPtr, NIL)
  }

  public final fun getQuaternion(): Quaternion {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getQuaternionPtr, QUATERNION)
    return (TransferContext.readReturnValue(QUATERNION) as Quaternion)
  }

  public final fun setBasis(basis: Basis): Unit {
    TransferContext.writeArguments(BASIS to basis)
    TransferContext.callMethod(ptr, MethodBindings.setBasisPtr, NIL)
  }

  public final fun getBasis(): Basis {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBasisPtr, BASIS)
    return (TransferContext.readReturnValue(BASIS) as Basis)
  }

  public final fun setGlobalTransform(global: Transform3D): Unit {
    TransferContext.writeArguments(TRANSFORM3D to global)
    TransferContext.callMethod(ptr, MethodBindings.setGlobalTransformPtr, NIL)
  }

  public final fun getGlobalTransform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlobalTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * When using physics interpolation, there will be circumstances in which you want to know the
   * interpolated (displayed) transform of a node rather than the standard transform (which may only be
   * accurate to the most recent physics tick).
   *
   * This is particularly important for frame-based operations that take place in [Node.Process],
   * rather than [Node.PhysicsProcess]. Examples include [Camera3D]s focusing on a node, or finding
   * where to fire lasers from on a frame rather than physics tick.
   *
   * **Note:** This function creates an interpolation pump on the [Node3D] the first time it is
   * called, which can respond to physics interpolation resets. If you get problems with "streaking"
   * when initially following a [Node3D], be sure to call [getGlobalTransformInterpolated] at least
   * once *before* resetting the [Node3D] physics interpolation.
   */
  public final fun getGlobalTransformInterpolated(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlobalTransformInterpolatedPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  public final fun setGlobalPosition(position: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to position)
    TransferContext.callMethod(ptr, MethodBindings.setGlobalPositionPtr, NIL)
  }

  public final fun getGlobalPosition(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlobalPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setGlobalBasis(basis: Basis): Unit {
    TransferContext.writeArguments(BASIS to basis)
    TransferContext.callMethod(ptr, MethodBindings.setGlobalBasisPtr, NIL)
  }

  public final fun getGlobalBasis(): Basis {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlobalBasisPtr, BASIS)
    return (TransferContext.readReturnValue(BASIS) as Basis)
  }

  public final fun setGlobalRotation(eulerRadians: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to eulerRadians)
    TransferContext.callMethod(ptr, MethodBindings.setGlobalRotationPtr, NIL)
  }

  public final fun getGlobalRotation(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlobalRotationPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setGlobalRotationDegrees(eulerDegrees: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to eulerDegrees)
    TransferContext.callMethod(ptr, MethodBindings.setGlobalRotationDegreesPtr, NIL)
  }

  public final fun getGlobalRotationDegrees(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlobalRotationDegreesPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the parent [Node3D], or `null` if no parent exists, the parent is not of type [Node3D],
   * or [topLevel] is `true`.
   *
   * **Note:** Calling this method is not equivalent to `get_parent() as Node3D`, which does not
   * take [topLevel] into account.
   */
  public final fun getParentNode3d(): Node3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getParentNode3dPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Node3D?)
  }

  /**
   * Sets whether the node ignores notification that its transformation (global or local) changed.
   */
  public final fun setIgnoreTransformNotification(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setIgnoreTransformNotificationPtr, NIL)
  }

  public final fun setAsTopLevel(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setAsTopLevelPtr, NIL)
  }

  public final fun isSetAsTopLevel(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSetAsTopLevelPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets whether the node uses a scale of `(1, 1, 1)` or its local transformation scale. Changes to
   * the local transformation scale are preserved.
   */
  public final fun setDisableScale(disable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to disable)
    TransferContext.callMethod(ptr, MethodBindings.setDisableScalePtr, NIL)
  }

  /**
   * Returns whether this node uses a scale of `(1, 1, 1)` or its local transformation scale.
   */
  public final fun isScaleDisabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isScaleDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the current [World3D] resource this [Node3D] node is registered to.
   */
  public final fun getWorld3d(): World3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWorld3dPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as World3D?)
  }

  /**
   * Forces the transform to update. Transform changes in physics are not instant for performance
   * reasons. Transforms are accumulated and then set. Use this if you need an up-to-date transform
   * when doing physics operations.
   */
  public final fun forceUpdateTransform(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.forceUpdateTransformPtr, NIL)
  }

  public final fun setVisibilityParent(path: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.setVisibilityParentPtr, NIL)
  }

  public final fun getVisibilityParent(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVisibilityParentPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Updates all the [Node3D] gizmos attached to this node.
   */
  public final fun updateGizmos(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.updateGizmosPtr, NIL)
  }

  /**
   * Attach an editor gizmo to this [Node3D].
   *
   * **Note:** The gizmo object would typically be an instance of [EditorNode3DGizmo], but the
   * argument type is kept generic to avoid creating a dependency on editor classes in [Node3D].
   */
  public final fun addGizmo(gizmo: Node3DGizmo?): Unit {
    TransferContext.writeArguments(OBJECT to gizmo)
    TransferContext.callMethod(ptr, MethodBindings.addGizmoPtr, NIL)
  }

  /**
   * Returns all the gizmos attached to this [Node3D].
   */
  public final fun getGizmos(): VariantArray<Node3DGizmo> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGizmosPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Node3DGizmo>)
  }

  /**
   * Clear all gizmos attached to this [Node3D].
   */
  public final fun clearGizmos(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearGizmosPtr, NIL)
  }

  /**
   * Set subgizmo selection for this node in the editor.
   *
   * **Note:** The gizmo object would typically be an instance of [EditorNode3DGizmo], but the
   * argument type is kept generic to avoid creating a dependency on editor classes in [Node3D].
   */
  public final fun setSubgizmoSelection(
    gizmo: Node3DGizmo?,
    id: Int,
    transform: Transform3D,
  ): Unit {
    TransferContext.writeArguments(OBJECT to gizmo, LONG to id.toLong(), TRANSFORM3D to transform)
    TransferContext.callMethod(ptr, MethodBindings.setSubgizmoSelectionPtr, NIL)
  }

  /**
   * Clears subgizmo selection for this node in the editor. Useful when subgizmo IDs become invalid
   * after a property change.
   */
  public final fun clearSubgizmoSelection(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearSubgizmoSelectionPtr, NIL)
  }

  public final fun setVisible(visible: Boolean): Unit {
    TransferContext.writeArguments(BOOL to visible)
    TransferContext.callMethod(ptr, MethodBindings.setVisiblePtr, NIL)
  }

  public final fun isVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the node is present in the [SceneTree], its [visible] property is `true` and
   * all its ancestors are also visible. If any ancestor is hidden, this node will not be visible in
   * the scene tree.
   *
   * Visibility is checked only in parent nodes that inherit from [Node3D]. If the parent is of any
   * other type (such as [Node], [AnimationPlayer], or [Node2D]), it is assumed to be visible.
   *
   * **Note:** This method does not take [VisualInstance3D.layers] into account, so even if this
   * method returns `true`, the node might end up not being rendered.
   */
  public final fun isVisibleInTree(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isVisibleInTreePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Enables rendering of this node. Changes [visible] to `true`.
   */
  public final fun show(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.showPtr, NIL)
  }

  /**
   * Disables rendering of this node. Changes [visible] to `false`.
   */
  public final fun hide(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hidePtr, NIL)
  }

  /**
   * Sets whether the node notifies about its local transformation changes. [Node3D] will not
   * propagate this by default.
   */
  public final fun setNotifyLocalTransform(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setNotifyLocalTransformPtr, NIL)
  }

  /**
   * Returns whether node notifies about its local transformation changes. [Node3D] will not
   * propagate this by default.
   */
  public final fun isLocalTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isLocalTransformNotificationEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets whether the node notifies about its global and local transformation changes. [Node3D] will
   * not propagate this by default, unless it is in the editor context and it has a valid gizmo.
   */
  public final fun setNotifyTransform(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setNotifyTransformPtr, NIL)
  }

  /**
   * Returns whether the node notifies about its global and local transformation changes. [Node3D]
   * will not propagate this by default.
   */
  public final fun isTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isTransformNotificationEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Rotates the local transformation around axis, a unit [Vector3], by specified angle in radians.
   */
  public final fun rotate(axis: Vector3, angle: Float): Unit {
    TransferContext.writeArguments(VECTOR3 to axis, DOUBLE to angle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.rotatePtr, NIL)
  }

  /**
   * Rotates the global (world) transformation around axis, a unit [Vector3], by specified angle in
   * radians. The rotation axis is in global coordinate system.
   */
  public final fun globalRotate(axis: Vector3, angle: Float): Unit {
    TransferContext.writeArguments(VECTOR3 to axis, DOUBLE to angle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.globalRotatePtr, NIL)
  }

  /**
   * Scales the global (world) transformation by the given [Vector3] scale factors.
   */
  public final fun globalScale(scale: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to scale)
    TransferContext.callMethod(ptr, MethodBindings.globalScalePtr, NIL)
  }

  /**
   * Moves the global (world) transformation by [Vector3] offset. The offset is in global coordinate
   * system.
   */
  public final fun globalTranslate(offset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(ptr, MethodBindings.globalTranslatePtr, NIL)
  }

  /**
   * Rotates the local transformation around axis, a unit [Vector3], by specified angle in radians.
   * The rotation axis is in object-local coordinate system.
   */
  public final fun rotateObjectLocal(axis: Vector3, angle: Float): Unit {
    TransferContext.writeArguments(VECTOR3 to axis, DOUBLE to angle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.rotateObjectLocalPtr, NIL)
  }

  /**
   * Scales the local transformation by given 3D scale factors in object-local coordinate system.
   */
  public final fun scaleObjectLocal(scale: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to scale)
    TransferContext.callMethod(ptr, MethodBindings.scaleObjectLocalPtr, NIL)
  }

  /**
   * Changes the node's position by the given offset [Vector3] in local space.
   */
  public final fun translateObjectLocal(offset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(ptr, MethodBindings.translateObjectLocalPtr, NIL)
  }

  /**
   * Rotates the local transformation around the X axis by angle in radians.
   */
  public final fun rotateX(angle: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.rotateXPtr, NIL)
  }

  /**
   * Rotates the local transformation around the Y axis by angle in radians.
   */
  public final fun rotateY(angle: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.rotateYPtr, NIL)
  }

  /**
   * Rotates the local transformation around the Z axis by angle in radians.
   */
  public final fun rotateZ(angle: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.rotateZPtr, NIL)
  }

  /**
   * Changes the node's position by the given offset [Vector3].
   *
   * Note that the translation [offset] is affected by the node's scale, so if scaled by e.g. `(10,
   * 1, 1)`, a translation by an offset of `(2, 0, 0)` would actually add 20 (`2 * 10`) to the X
   * coordinate.
   */
  public final fun translate(offset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(ptr, MethodBindings.translatePtr, NIL)
  }

  /**
   * Resets this node's transformations (like scale, skew and taper) preserving its rotation and
   * translation by performing Gram-Schmidt orthonormalization on this node's [Transform3D].
   */
  public final fun orthonormalize(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.orthonormalizePtr, NIL)
  }

  /**
   * Reset all transformations for this node (sets its [Transform3D] to the identity matrix).
   */
  public final fun setIdentity(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.setIdentityPtr, NIL)
  }

  /**
   * Rotates the node so that the local forward axis (-Z, [Vector3.FORWARD]) points toward the
   * [target] position.
   *
   * The local up axis (+Y) points as close to the [up] vector as possible while staying
   * perpendicular to the local forward axis. The resulting transform is orthogonal, and the scale is
   * preserved. Non-uniform scaling may not work correctly.
   *
   * The [target] position cannot be the same as the node's position, the [up] vector cannot be
   * zero.
   *
   * The [target] and the [up] cannot be [Vector3.ZERO], and shouldn't be colinear to avoid
   * unintended rotation around local Z axis.
   *
   * Operations take place in global space, which means that the node must be in the scene tree.
   *
   * If [useModelFront] is `true`, the +Z axis (asset front) is treated as forward (implies +X is
   * left) and points toward the [target] position. By default, the -Z axis (camera forward) is treated
   * as forward (implies +X is right).
   */
  @JvmOverloads
  public final fun lookAt(
    target: Vector3,
    up: Vector3 = Vector3(0, 1, 0),
    useModelFront: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(VECTOR3 to target, VECTOR3 to up, BOOL to useModelFront)
    TransferContext.callMethod(ptr, MethodBindings.lookAtPtr, NIL)
  }

  /**
   * Moves the node to the specified [position], and then rotates the node to point toward the
   * [target] as per [lookAt]. Operations take place in global space.
   */
  @JvmOverloads
  public final fun lookAtFromPosition(
    position: Vector3,
    target: Vector3,
    up: Vector3 = Vector3(0, 1, 0),
    useModelFront: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(VECTOR3 to position, VECTOR3 to target, VECTOR3 to up, BOOL to useModelFront)
    TransferContext.callMethod(ptr, MethodBindings.lookAtFromPositionPtr, NIL)
  }

  /**
   * Transforms [globalPoint] from world space to this node's local space.
   */
  public final fun toLocal(globalPoint: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to globalPoint)
    TransferContext.callMethod(ptr, MethodBindings.toLocalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Transforms [localPoint] from this node's local space to world space.
   */
  public final fun toGlobal(localPoint: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to localPoint)
    TransferContext.callMethod(ptr, MethodBindings.toGlobalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setVisibilityParent(path: String) = setVisibilityParent(path.asCachedNodePath())

  public enum class RotationEditMode(
    id: Long,
  ) {
    /**
     * The rotation is edited using [Vector3] Euler angles.
     */
    EULER(0),
    /**
     * The rotation is edited using a [Quaternion].
     */
    QUATERNION(1),
    /**
     * The rotation is edited using a [Basis]. In this mode, [scale] can't be edited separately.
     */
    BASIS(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): RotationEditMode = entries.single { it.id == `value` }
    }
  }

  public companion object {
    @JvmStatic
    public val setTransformName: MethodStringName1<Node3D, Unit, Transform3D> =
        MethodStringName1<Node3D, Unit, Transform3D>("set_transform")

    @JvmStatic
    public val getTransformName: MethodStringName0<Node3D, Transform3D> =
        MethodStringName0<Node3D, Transform3D>("get_transform")

    @JvmStatic
    public val setPositionName: MethodStringName1<Node3D, Unit, Vector3> =
        MethodStringName1<Node3D, Unit, Vector3>("set_position")

    @JvmStatic
    public val getPositionName: MethodStringName0<Node3D, Vector3> =
        MethodStringName0<Node3D, Vector3>("get_position")

    @JvmStatic
    public val setRotationName: MethodStringName1<Node3D, Unit, Vector3> =
        MethodStringName1<Node3D, Unit, Vector3>("set_rotation")

    @JvmStatic
    public val getRotationName: MethodStringName0<Node3D, Vector3> =
        MethodStringName0<Node3D, Vector3>("get_rotation")

    @JvmStatic
    public val setRotationDegreesName: MethodStringName1<Node3D, Unit, Vector3> =
        MethodStringName1<Node3D, Unit, Vector3>("set_rotation_degrees")

    @JvmStatic
    public val getRotationDegreesName: MethodStringName0<Node3D, Vector3> =
        MethodStringName0<Node3D, Vector3>("get_rotation_degrees")

    @JvmStatic
    public val setRotationOrderName: MethodStringName1<Node3D, Unit, EulerOrder> =
        MethodStringName1<Node3D, Unit, EulerOrder>("set_rotation_order")

    @JvmStatic
    public val getRotationOrderName: MethodStringName0<Node3D, EulerOrder> =
        MethodStringName0<Node3D, EulerOrder>("get_rotation_order")

    @JvmStatic
    public val setRotationEditModeName: MethodStringName1<Node3D, Unit, RotationEditMode> =
        MethodStringName1<Node3D, Unit, RotationEditMode>("set_rotation_edit_mode")

    @JvmStatic
    public val getRotationEditModeName: MethodStringName0<Node3D, RotationEditMode> =
        MethodStringName0<Node3D, RotationEditMode>("get_rotation_edit_mode")

    @JvmStatic
    public val setScaleName: MethodStringName1<Node3D, Unit, Vector3> =
        MethodStringName1<Node3D, Unit, Vector3>("set_scale")

    @JvmStatic
    public val getScaleName: MethodStringName0<Node3D, Vector3> =
        MethodStringName0<Node3D, Vector3>("get_scale")

    @JvmStatic
    public val setQuaternionName: MethodStringName1<Node3D, Unit, Quaternion> =
        MethodStringName1<Node3D, Unit, Quaternion>("set_quaternion")

    @JvmStatic
    public val getQuaternionName: MethodStringName0<Node3D, Quaternion> =
        MethodStringName0<Node3D, Quaternion>("get_quaternion")

    @JvmStatic
    public val setBasisName: MethodStringName1<Node3D, Unit, Basis> =
        MethodStringName1<Node3D, Unit, Basis>("set_basis")

    @JvmStatic
    public val getBasisName: MethodStringName0<Node3D, Basis> =
        MethodStringName0<Node3D, Basis>("get_basis")

    @JvmStatic
    public val setGlobalTransformName: MethodStringName1<Node3D, Unit, Transform3D> =
        MethodStringName1<Node3D, Unit, Transform3D>("set_global_transform")

    @JvmStatic
    public val getGlobalTransformName: MethodStringName0<Node3D, Transform3D> =
        MethodStringName0<Node3D, Transform3D>("get_global_transform")

    @JvmStatic
    public val getGlobalTransformInterpolatedName: MethodStringName0<Node3D, Transform3D> =
        MethodStringName0<Node3D, Transform3D>("get_global_transform_interpolated")

    @JvmStatic
    public val setGlobalPositionName: MethodStringName1<Node3D, Unit, Vector3> =
        MethodStringName1<Node3D, Unit, Vector3>("set_global_position")

    @JvmStatic
    public val getGlobalPositionName: MethodStringName0<Node3D, Vector3> =
        MethodStringName0<Node3D, Vector3>("get_global_position")

    @JvmStatic
    public val setGlobalBasisName: MethodStringName1<Node3D, Unit, Basis> =
        MethodStringName1<Node3D, Unit, Basis>("set_global_basis")

    @JvmStatic
    public val getGlobalBasisName: MethodStringName0<Node3D, Basis> =
        MethodStringName0<Node3D, Basis>("get_global_basis")

    @JvmStatic
    public val setGlobalRotationName: MethodStringName1<Node3D, Unit, Vector3> =
        MethodStringName1<Node3D, Unit, Vector3>("set_global_rotation")

    @JvmStatic
    public val getGlobalRotationName: MethodStringName0<Node3D, Vector3> =
        MethodStringName0<Node3D, Vector3>("get_global_rotation")

    @JvmStatic
    public val setGlobalRotationDegreesName: MethodStringName1<Node3D, Unit, Vector3> =
        MethodStringName1<Node3D, Unit, Vector3>("set_global_rotation_degrees")

    @JvmStatic
    public val getGlobalRotationDegreesName: MethodStringName0<Node3D, Vector3> =
        MethodStringName0<Node3D, Vector3>("get_global_rotation_degrees")

    @JvmStatic
    public val getParentNode3dName: MethodStringName0<Node3D, Node3D?> =
        MethodStringName0<Node3D, Node3D?>("get_parent_node_3d")

    @JvmStatic
    public val setIgnoreTransformNotificationName: MethodStringName1<Node3D, Unit, Boolean> =
        MethodStringName1<Node3D, Unit, Boolean>("set_ignore_transform_notification")

    @JvmStatic
    public val setAsTopLevelName: MethodStringName1<Node3D, Unit, Boolean> =
        MethodStringName1<Node3D, Unit, Boolean>("set_as_top_level")

    @JvmStatic
    public val isSetAsTopLevelName: MethodStringName0<Node3D, Boolean> =
        MethodStringName0<Node3D, Boolean>("is_set_as_top_level")

    @JvmStatic
    public val setDisableScaleName: MethodStringName1<Node3D, Unit, Boolean> =
        MethodStringName1<Node3D, Unit, Boolean>("set_disable_scale")

    @JvmStatic
    public val isScaleDisabledName: MethodStringName0<Node3D, Boolean> =
        MethodStringName0<Node3D, Boolean>("is_scale_disabled")

    @JvmStatic
    public val getWorld3dName: MethodStringName0<Node3D, World3D?> =
        MethodStringName0<Node3D, World3D?>("get_world_3d")

    @JvmStatic
    public val forceUpdateTransformName: MethodStringName0<Node3D, Unit> =
        MethodStringName0<Node3D, Unit>("force_update_transform")

    @JvmStatic
    public val setVisibilityParentName: MethodStringName1<Node3D, Unit, NodePath> =
        MethodStringName1<Node3D, Unit, NodePath>("set_visibility_parent")

    @JvmStatic
    public val getVisibilityParentName: MethodStringName0<Node3D, NodePath> =
        MethodStringName0<Node3D, NodePath>("get_visibility_parent")

    @JvmStatic
    public val updateGizmosName: MethodStringName0<Node3D, Unit> =
        MethodStringName0<Node3D, Unit>("update_gizmos")

    @JvmStatic
    public val addGizmoName: MethodStringName1<Node3D, Unit, Node3DGizmo?> =
        MethodStringName1<Node3D, Unit, Node3DGizmo?>("add_gizmo")

    @JvmStatic
    public val getGizmosName: MethodStringName0<Node3D, VariantArray<Node3DGizmo>> =
        MethodStringName0<Node3D, VariantArray<Node3DGizmo>>("get_gizmos")

    @JvmStatic
    public val clearGizmosName: MethodStringName0<Node3D, Unit> =
        MethodStringName0<Node3D, Unit>("clear_gizmos")

    @JvmStatic
    public val setSubgizmoSelectionName:
        MethodStringName3<Node3D, Unit, Node3DGizmo?, Int, Transform3D> =
        MethodStringName3<Node3D, Unit, Node3DGizmo?, Int, Transform3D>("set_subgizmo_selection")

    @JvmStatic
    public val clearSubgizmoSelectionName: MethodStringName0<Node3D, Unit> =
        MethodStringName0<Node3D, Unit>("clear_subgizmo_selection")

    @JvmStatic
    public val setVisibleName: MethodStringName1<Node3D, Unit, Boolean> =
        MethodStringName1<Node3D, Unit, Boolean>("set_visible")

    @JvmStatic
    public val isVisibleName: MethodStringName0<Node3D, Boolean> =
        MethodStringName0<Node3D, Boolean>("is_visible")

    @JvmStatic
    public val isVisibleInTreeName: MethodStringName0<Node3D, Boolean> =
        MethodStringName0<Node3D, Boolean>("is_visible_in_tree")

    @JvmStatic
    public val showName: MethodStringName0<Node3D, Unit> = MethodStringName0<Node3D, Unit>("show")

    @JvmStatic
    public val hideName: MethodStringName0<Node3D, Unit> = MethodStringName0<Node3D, Unit>("hide")

    @JvmStatic
    public val setNotifyLocalTransformName: MethodStringName1<Node3D, Unit, Boolean> =
        MethodStringName1<Node3D, Unit, Boolean>("set_notify_local_transform")

    @JvmStatic
    public val isLocalTransformNotificationEnabledName: MethodStringName0<Node3D, Boolean> =
        MethodStringName0<Node3D, Boolean>("is_local_transform_notification_enabled")

    @JvmStatic
    public val setNotifyTransformName: MethodStringName1<Node3D, Unit, Boolean> =
        MethodStringName1<Node3D, Unit, Boolean>("set_notify_transform")

    @JvmStatic
    public val isTransformNotificationEnabledName: MethodStringName0<Node3D, Boolean> =
        MethodStringName0<Node3D, Boolean>("is_transform_notification_enabled")

    @JvmStatic
    public val rotateName: MethodStringName2<Node3D, Unit, Vector3, Float> =
        MethodStringName2<Node3D, Unit, Vector3, Float>("rotate")

    @JvmStatic
    public val globalRotateName: MethodStringName2<Node3D, Unit, Vector3, Float> =
        MethodStringName2<Node3D, Unit, Vector3, Float>("global_rotate")

    @JvmStatic
    public val globalScaleName: MethodStringName1<Node3D, Unit, Vector3> =
        MethodStringName1<Node3D, Unit, Vector3>("global_scale")

    @JvmStatic
    public val globalTranslateName: MethodStringName1<Node3D, Unit, Vector3> =
        MethodStringName1<Node3D, Unit, Vector3>("global_translate")

    @JvmStatic
    public val rotateObjectLocalName: MethodStringName2<Node3D, Unit, Vector3, Float> =
        MethodStringName2<Node3D, Unit, Vector3, Float>("rotate_object_local")

    @JvmStatic
    public val scaleObjectLocalName: MethodStringName1<Node3D, Unit, Vector3> =
        MethodStringName1<Node3D, Unit, Vector3>("scale_object_local")

    @JvmStatic
    public val translateObjectLocalName: MethodStringName1<Node3D, Unit, Vector3> =
        MethodStringName1<Node3D, Unit, Vector3>("translate_object_local")

    @JvmStatic
    public val rotateXName: MethodStringName1<Node3D, Unit, Float> =
        MethodStringName1<Node3D, Unit, Float>("rotate_x")

    @JvmStatic
    public val rotateYName: MethodStringName1<Node3D, Unit, Float> =
        MethodStringName1<Node3D, Unit, Float>("rotate_y")

    @JvmStatic
    public val rotateZName: MethodStringName1<Node3D, Unit, Float> =
        MethodStringName1<Node3D, Unit, Float>("rotate_z")

    @JvmStatic
    public val translateName: MethodStringName1<Node3D, Unit, Vector3> =
        MethodStringName1<Node3D, Unit, Vector3>("translate")

    @JvmStatic
    public val orthonormalizeName: MethodStringName0<Node3D, Unit> =
        MethodStringName0<Node3D, Unit>("orthonormalize")

    @JvmStatic
    public val setIdentityName: MethodStringName0<Node3D, Unit> =
        MethodStringName0<Node3D, Unit>("set_identity")

    @JvmStatic
    public val lookAtName: MethodStringName3<Node3D, Unit, Vector3, Vector3, Boolean> =
        MethodStringName3<Node3D, Unit, Vector3, Vector3, Boolean>("look_at")

    @JvmStatic
    public val lookAtFromPositionName:
        MethodStringName4<Node3D, Unit, Vector3, Vector3, Vector3, Boolean> =
        MethodStringName4<Node3D, Unit, Vector3, Vector3, Vector3, Boolean>("look_at_from_position")

    @JvmStatic
    public val toLocalName: MethodStringName1<Node3D, Vector3, Vector3> =
        MethodStringName1<Node3D, Vector3, Vector3>("to_local")

    @JvmStatic
    public val toGlobalName: MethodStringName1<Node3D, Vector3, Vector3> =
        MethodStringName1<Node3D, Vector3, Vector3>("to_global")

    /**
     * [Node3D] nodes receive this notification when their global transform changes. This means that
     * either the current or a parent node changed its transform.
     *
     * In order for [NOTIFICATION_TRANSFORM_CHANGED] to work, users first need to ask for it, with
     * [setNotifyTransform]. The notification is also sent if the node is in the editor context and it
     * has at least one valid gizmo.
     */
    public final const val NOTIFICATION_TRANSFORM_CHANGED: Long = 2000

    /**
     * [Node3D] nodes receive this notification when they are registered to new [World3D] resource.
     */
    public final const val NOTIFICATION_ENTER_WORLD: Long = 41

    /**
     * [Node3D] nodes receive this notification when they are unregistered from current [World3D]
     * resource.
     */
    public final const val NOTIFICATION_EXIT_WORLD: Long = 42

    /**
     * [Node3D] nodes receive this notification when their visibility changes.
     */
    public final const val NOTIFICATION_VISIBILITY_CHANGED: Long = 43

    /**
     * [Node3D] nodes receive this notification when their local transform changes. This is not
     * received when the transform of a parent node is changed.
     *
     * In order for [NOTIFICATION_LOCAL_TRANSFORM_CHANGED] to work, users first need to ask for it,
     * with [setNotifyLocalTransform].
     */
    public final const val NOTIFICATION_LOCAL_TRANSFORM_CHANGED: Long = 44
  }

  public object MethodBindings {
    internal val setTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_transform", 2952846383)

    internal val getTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_transform", 3229777777)

    internal val setPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_position", 3460891852)

    internal val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_position", 3360562783)

    internal val setRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_rotation", 3460891852)

    internal val getRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_rotation", 3360562783)

    internal val setRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_rotation_degrees", 3460891852)

    internal val getRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_rotation_degrees", 3360562783)

    internal val setRotationOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_rotation_order", 1820889989)

    internal val getRotationOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_rotation_order", 916939469)

    internal val setRotationEditModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_rotation_edit_mode", 141483330)

    internal val getRotationEditModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_rotation_edit_mode", 1572188370)

    internal val setScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_scale", 3460891852)

    internal val getScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_scale", 3360562783)

    internal val setQuaternionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_quaternion", 1727505552)

    internal val getQuaternionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_quaternion", 1222331677)

    internal val setBasisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_basis", 1055510324)

    internal val getBasisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_basis", 2716978435)

    internal val setGlobalTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_global_transform", 2952846383)

    internal val getGlobalTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_global_transform", 3229777777)

    internal val getGlobalTransformInterpolatedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_global_transform_interpolated", 4183770049)

    internal val setGlobalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_global_position", 3460891852)

    internal val getGlobalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_global_position", 3360562783)

    internal val setGlobalBasisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_global_basis", 1055510324)

    internal val getGlobalBasisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_global_basis", 2716978435)

    internal val setGlobalRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_global_rotation", 3460891852)

    internal val getGlobalRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_global_rotation", 3360562783)

    internal val setGlobalRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_global_rotation_degrees", 3460891852)

    internal val getGlobalRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_global_rotation_degrees", 3360562783)

    internal val getParentNode3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_parent_node_3d", 151077316)

    internal val setIgnoreTransformNotificationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_ignore_transform_notification", 2586408642)

    internal val setAsTopLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_as_top_level", 2586408642)

    internal val isSetAsTopLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "is_set_as_top_level", 36873697)

    internal val setDisableScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_disable_scale", 2586408642)

    internal val isScaleDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "is_scale_disabled", 36873697)

    internal val getWorld3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_world_3d", 317588385)

    internal val forceUpdateTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "force_update_transform", 3218959716)

    internal val setVisibilityParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_visibility_parent", 1348162250)

    internal val getVisibilityParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_visibility_parent", 4075236667)

    internal val updateGizmosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "update_gizmos", 3218959716)

    internal val addGizmoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "add_gizmo", 1544533845)

    internal val getGizmosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_gizmos", 3995934104)

    internal val clearGizmosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "clear_gizmos", 3218959716)

    internal val setSubgizmoSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_subgizmo_selection", 3317607635)

    internal val clearSubgizmoSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "clear_subgizmo_selection", 3218959716)

    internal val setVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_visible", 2586408642)

    internal val isVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "is_visible", 36873697)

    internal val isVisibleInTreePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "is_visible_in_tree", 36873697)

    internal val showPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "show", 3218959716)

    internal val hidePtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "hide", 3218959716)

    internal val setNotifyLocalTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_notify_local_transform", 2586408642)

    internal val isLocalTransformNotificationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "is_local_transform_notification_enabled", 36873697)

    internal val setNotifyTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_notify_transform", 2586408642)

    internal val isTransformNotificationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "is_transform_notification_enabled", 36873697)

    internal val rotatePtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "rotate", 3436291937)

    internal val globalRotatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "global_rotate", 3436291937)

    internal val globalScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "global_scale", 3460891852)

    internal val globalTranslatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "global_translate", 3460891852)

    internal val rotateObjectLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "rotate_object_local", 3436291937)

    internal val scaleObjectLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "scale_object_local", 3460891852)

    internal val translateObjectLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "translate_object_local", 3460891852)

    internal val rotateXPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "rotate_x", 373806689)

    internal val rotateYPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "rotate_y", 373806689)

    internal val rotateZPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "rotate_z", 373806689)

    internal val translatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "translate", 3460891852)

    internal val orthonormalizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "orthonormalize", 3218959716)

    internal val setIdentityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_identity", 3218959716)

    internal val lookAtPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "look_at", 2882425029)

    internal val lookAtFromPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "look_at_from_position", 2086826090)

    internal val toLocalPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "to_local", 192990374)

    internal val toGlobalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "to_global", 192990374)
  }
}
