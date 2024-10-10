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
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_NODE3D_INDEX: Int = 407

/**
 * Most basic 3D game object, with a [Transform3D] and visibility settings. All other 3D game
 * objects inherit from [Node3D]. Use [Node3D] as a parent node to move, scale, rotate and show/hide
 * children in a 3D project.
 * Affine operations (rotate, scale, translate) happen in parent's local coordinate system, unless
 * the [Node3D] object is set as top-level. Affine operations in this coordinate system correspond to
 * direct affine operations on the [Node3D]'s transform. The word local below refers to this coordinate
 * system. The coordinate system that is attached to the [Node3D] object itself is referred to as
 * object-local coordinate system.
 * **Note:** Unless otherwise specified, all methods that have angle parameters must have angles
 * specified as *radians*. To convert degrees to radians, use [@GlobalScope.degToRad].
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
   * **Note:** In the mathematical sense, rotation is a matrix and not a vector. The three Euler
   * angles, which are the three independent parameters of the Euler-angle parametrization of the
   * rotation matrix, are stored in a [Vector3] data structure not because the rotation is a vector,
   * but only because [Vector3] exists as a convenient data-structure to store 3 floating-point
   * numbers. Therefore, applying affine operations on the rotation "vector" is not meaningful.
   * **Note:** This property is edited in the inspector in degrees. If you want to use degrees in a
   * script, use [rotationDegrees].
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
   * **Note:** Mixed negative scales in 3D are not decomposable from the transformation matrix. Due
   * to the way scale is represented with transformation matrices in Godot, the scale values will
   * either be all positive or all negative.
   * **Note:** Not all nodes are visually scaled by the [scale] property. For example, [Light3D]s
   * are not visually affected by [scale].
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
   * **Note:** In the mathematical sense, rotation is a matrix and not a vector. The three Euler
   * angles, which are the three independent parameters of the Euler-angle parametrization of the
   * rotation matrix, are stored in a [Vector3] data structure not because the rotation is a vector,
   * but only because [Vector3] exists as a convenient data-structure to store 3 floating-point
   * numbers. Therefore, applying affine operations on the rotation "vector" is not meaningful.
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
    Internals.callConstructor(this, ENGINE_CLASS_NODE3D_INDEX, scriptIndex)
  }

  /**
   * Local space [Transform3D] of this node, with respect to the parent node.
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
   * val myCoreType = node3d.transform
   * //Your changes
   * node3d.transform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun transformMutate(block: Transform3D.() -> Unit): Transform3D = transform.apply{
      block(this)
      transform = this
  }


  /**
   * World3D space (global) [Transform3D] of this node.
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
   * val myCoreType = node3d.globalTransform
   * //Your changes
   * node3d.globalTransform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun globalTransformMutate(block: Transform3D.() -> Unit): Transform3D =
      globalTransform.apply{
      block(this)
      globalTransform = this
  }


  /**
   * Local position or translation of this node relative to the parent. This is equivalent to
   * `transform.origin`.
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
   * val myCoreType = node3d.position
   * //Your changes
   * node3d.position = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun positionMutate(block: Vector3.() -> Unit): Vector3 = position.apply{
      block(this)
      position = this
  }


  /**
   * Rotation part of the local transformation in radians, specified in terms of Euler angles. The
   * angles construct a rotation in the order specified by the [rotationOrder] property.
   * **Note:** In the mathematical sense, rotation is a matrix and not a vector. The three Euler
   * angles, which are the three independent parameters of the Euler-angle parametrization of the
   * rotation matrix, are stored in a [Vector3] data structure not because the rotation is a vector,
   * but only because [Vector3] exists as a convenient data-structure to store 3 floating-point
   * numbers. Therefore, applying affine operations on the rotation "vector" is not meaningful.
   * **Note:** This property is edited in the inspector in degrees. If you want to use degrees in a
   * script, use [rotationDegrees].
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
   * val myCoreType = node3d.rotation
   * //Your changes
   * node3d.rotation = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun rotationMutate(block: Vector3.() -> Unit): Vector3 = rotation.apply{
      block(this)
      rotation = this
  }


  /**
   * Helper property to access [rotation] in degrees instead of radians.
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
   * val myCoreType = node3d.rotationDegrees
   * //Your changes
   * node3d.rotationDegrees = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun rotationDegreesMutate(block: Vector3.() -> Unit): Vector3 =
      rotationDegrees.apply{
      block(this)
      rotationDegrees = this
  }


  /**
   * Access to the node rotation as a [Quaternion]. This property is ideal for tweening complex
   * rotations.
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
   * val myCoreType = node3d.quaternion
   * //Your changes
   * node3d.quaternion = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun quaternionMutate(block: Quaternion.() -> Unit): Quaternion = quaternion.apply{
      block(this)
      quaternion = this
  }


  /**
   * Basis of the [transform] property. Represents the rotation, scale, and shear of this node.
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
   * val myCoreType = node3d.basis
   * //Your changes
   * node3d.basis = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun basisMutate(block: Basis.() -> Unit): Basis = basis.apply{
      block(this)
      basis = this
  }


  /**
   * Scale part of the local transformation.
   * **Note:** Mixed negative scales in 3D are not decomposable from the transformation matrix. Due
   * to the way scale is represented with transformation matrices in Godot, the scale values will
   * either be all positive or all negative.
   * **Note:** Not all nodes are visually scaled by the [scale] property. For example, [Light3D]s
   * are not visually affected by [scale].
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
   * val myCoreType = node3d.scale
   * //Your changes
   * node3d.scale = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun scaleMutate(block: Vector3.() -> Unit): Vector3 = scale.apply{
      block(this)
      scale = this
  }


  /**
   * Global position of this node. This is equivalent to `global_transform.origin`.
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
   * val myCoreType = node3d.globalPosition
   * //Your changes
   * node3d.globalPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun globalPositionMutate(block: Vector3.() -> Unit): Vector3 = globalPosition.apply{
      block(this)
      globalPosition = this
  }


  /**
   * Global basis of this node. This is equivalent to `global_transform.basis`.
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
   * val myCoreType = node3d.globalBasis
   * //Your changes
   * node3d.globalBasis = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun globalBasisMutate(block: Basis.() -> Unit): Basis = globalBasis.apply{
      block(this)
      globalBasis = this
  }


  /**
   * Rotation part of the global transformation in radians, specified in terms of YXZ-Euler angles
   * in the format (X angle, Y angle, Z angle).
   * **Note:** In the mathematical sense, rotation is a matrix and not a vector. The three Euler
   * angles, which are the three independent parameters of the Euler-angle parametrization of the
   * rotation matrix, are stored in a [Vector3] data structure not because the rotation is a vector,
   * but only because [Vector3] exists as a convenient data-structure to store 3 floating-point
   * numbers. Therefore, applying affine operations on the rotation "vector" is not meaningful.
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
   * val myCoreType = node3d.globalRotation
   * //Your changes
   * node3d.globalRotation = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun globalRotationMutate(block: Vector3.() -> Unit): Vector3 = globalRotation.apply{
      block(this)
      globalRotation = this
  }


  /**
   * Helper property to access [globalRotation] in degrees instead of radians.
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
   * val myCoreType = node3d.globalRotationDegrees
   * //Your changes
   * node3d.globalRotationDegrees = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun globalRotationDegreesMutate(block: Vector3.() -> Unit): Vector3 =
      globalRotationDegrees.apply{
      block(this)
      globalRotationDegrees = this
  }


  public final fun setTransform(local: Transform3D): Unit {
    Internals.writeArguments(TRANSFORM3D to local)
    Internals.callMethod(rawPtr, MethodBindings.setTransformPtr, NIL)
  }

  public final fun getTransform(): Transform3D {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTransformPtr, TRANSFORM3D)
    return (Internals.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  public final fun setPosition(position: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to position)
    Internals.callMethod(rawPtr, MethodBindings.setPositionPtr, NIL)
  }

  public final fun getPosition(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPositionPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setRotation(eulerRadians: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to eulerRadians)
    Internals.callMethod(rawPtr, MethodBindings.setRotationPtr, NIL)
  }

  public final fun getRotation(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRotationPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setRotationDegrees(eulerDegrees: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to eulerDegrees)
    Internals.callMethod(rawPtr, MethodBindings.setRotationDegreesPtr, NIL)
  }

  public final fun getRotationDegrees(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRotationDegreesPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setRotationOrder(order: EulerOrder): Unit {
    Internals.writeArguments(LONG to order.id)
    Internals.callMethod(rawPtr, MethodBindings.setRotationOrderPtr, NIL)
  }

  public final fun getRotationOrder(): EulerOrder {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRotationOrderPtr, LONG)
    return EulerOrder.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setRotationEditMode(editMode: RotationEditMode): Unit {
    Internals.writeArguments(LONG to editMode.id)
    Internals.callMethod(rawPtr, MethodBindings.setRotationEditModePtr, NIL)
  }

  public final fun getRotationEditMode(): RotationEditMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRotationEditModePtr, LONG)
    return Node3D.RotationEditMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setScale(scale: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to scale)
    Internals.callMethod(rawPtr, MethodBindings.setScalePtr, NIL)
  }

  public final fun getScale(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getScalePtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setQuaternion(quaternion: Quaternion): Unit {
    Internals.writeArguments(QUATERNION to quaternion)
    Internals.callMethod(rawPtr, MethodBindings.setQuaternionPtr, NIL)
  }

  public final fun getQuaternion(): Quaternion {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getQuaternionPtr, QUATERNION)
    return (Internals.readReturnValue(QUATERNION) as Quaternion)
  }

  public final fun setBasis(basis: Basis): Unit {
    Internals.writeArguments(BASIS to basis)
    Internals.callMethod(rawPtr, MethodBindings.setBasisPtr, NIL)
  }

  public final fun getBasis(): Basis {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBasisPtr, BASIS)
    return (Internals.readReturnValue(BASIS) as Basis)
  }

  public final fun setGlobalTransform(global: Transform3D): Unit {
    Internals.writeArguments(TRANSFORM3D to global)
    Internals.callMethod(rawPtr, MethodBindings.setGlobalTransformPtr, NIL)
  }

  public final fun getGlobalTransform(): Transform3D {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGlobalTransformPtr, TRANSFORM3D)
    return (Internals.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  public final fun setGlobalPosition(position: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to position)
    Internals.callMethod(rawPtr, MethodBindings.setGlobalPositionPtr, NIL)
  }

  public final fun getGlobalPosition(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGlobalPositionPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setGlobalBasis(basis: Basis): Unit {
    Internals.writeArguments(BASIS to basis)
    Internals.callMethod(rawPtr, MethodBindings.setGlobalBasisPtr, NIL)
  }

  public final fun getGlobalBasis(): Basis {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGlobalBasisPtr, BASIS)
    return (Internals.readReturnValue(BASIS) as Basis)
  }

  public final fun setGlobalRotation(eulerRadians: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to eulerRadians)
    Internals.callMethod(rawPtr, MethodBindings.setGlobalRotationPtr, NIL)
  }

  public final fun getGlobalRotation(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGlobalRotationPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setGlobalRotationDegrees(eulerDegrees: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to eulerDegrees)
    Internals.callMethod(rawPtr, MethodBindings.setGlobalRotationDegreesPtr, NIL)
  }

  public final fun getGlobalRotationDegrees(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGlobalRotationDegreesPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the parent [Node3D], or `null` if no parent exists, the parent is not of type [Node3D],
   * or [topLevel] is `true`.
   * **Note:** Calling this method is not equivalent to `get_parent() as Node3D`, which does not
   * take [topLevel] into account.
   */
  public final fun getParentNode3d(): Node3D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getParentNode3dPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Node3D?)
  }

  /**
   * Sets whether the node ignores notification that its transformation (global or local) changed.
   */
  public final fun setIgnoreTransformNotification(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setIgnoreTransformNotificationPtr, NIL)
  }

  public final fun setAsTopLevel(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setAsTopLevelPtr, NIL)
  }

  public final fun isSetAsTopLevel(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isSetAsTopLevelPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets whether the node uses a scale of `(1, 1, 1)` or its local transformation scale. Changes to
   * the local transformation scale are preserved.
   */
  public final fun setDisableScale(disable: Boolean): Unit {
    Internals.writeArguments(BOOL to disable)
    Internals.callMethod(rawPtr, MethodBindings.setDisableScalePtr, NIL)
  }

  /**
   * Returns whether this node uses a scale of `(1, 1, 1)` or its local transformation scale.
   */
  public final fun isScaleDisabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isScaleDisabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the current [World3D] resource this [Node3D] node is registered to.
   */
  public final fun getWorld3d(): World3D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getWorld3dPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as World3D?)
  }

  /**
   * Forces the transform to update. Transform changes in physics are not instant for performance
   * reasons. Transforms are accumulated and then set. Use this if you need an up-to-date transform
   * when doing physics operations.
   */
  public final fun forceUpdateTransform(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.forceUpdateTransformPtr, NIL)
  }

  public final fun setVisibilityParent(path: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to path)
    Internals.callMethod(rawPtr, MethodBindings.setVisibilityParentPtr, NIL)
  }

  public final fun getVisibilityParent(): NodePath {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVisibilityParentPtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Updates all the [Node3D] gizmos attached to this node.
   */
  public final fun updateGizmos(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.updateGizmosPtr, NIL)
  }

  /**
   * Attach an editor gizmo to this [Node3D].
   * **Note:** The gizmo object would typically be an instance of [EditorNode3DGizmo], but the
   * argument type is kept generic to avoid creating a dependency on editor classes in [Node3D].
   */
  public final fun addGizmo(gizmo: Node3DGizmo?): Unit {
    Internals.writeArguments(OBJECT to gizmo)
    Internals.callMethod(rawPtr, MethodBindings.addGizmoPtr, NIL)
  }

  /**
   * Returns all the gizmos attached to this [Node3D].
   */
  public final fun getGizmos(): VariantArray<Node3DGizmo> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGizmosPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Node3DGizmo>)
  }

  /**
   * Clear all gizmos attached to this [Node3D].
   */
  public final fun clearGizmos(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearGizmosPtr, NIL)
  }

  /**
   * Set subgizmo selection for this node in the editor.
   * **Note:** The gizmo object would typically be an instance of [EditorNode3DGizmo], but the
   * argument type is kept generic to avoid creating a dependency on editor classes in [Node3D].
   */
  public final fun setSubgizmoSelection(
    gizmo: Node3DGizmo?,
    id: Int,
    transform: Transform3D,
  ): Unit {
    Internals.writeArguments(OBJECT to gizmo, LONG to id.toLong(), TRANSFORM3D to transform)
    Internals.callMethod(rawPtr, MethodBindings.setSubgizmoSelectionPtr, NIL)
  }

  /**
   * Clears subgizmo selection for this node in the editor. Useful when subgizmo IDs become invalid
   * after a property change.
   */
  public final fun clearSubgizmoSelection(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearSubgizmoSelectionPtr, NIL)
  }

  public final fun setVisible(visible: Boolean): Unit {
    Internals.writeArguments(BOOL to visible)
    Internals.callMethod(rawPtr, MethodBindings.setVisiblePtr, NIL)
  }

  public final fun isVisible(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isVisiblePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the node is present in the [SceneTree], its [visible] property is `true` and
   * all its ancestors are also visible. If any ancestor is hidden, this node will not be visible in
   * the scene tree.
   */
  public final fun isVisibleInTree(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isVisibleInTreePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Enables rendering of this node. Changes [visible] to `true`.
   */
  public final fun show(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.showPtr, NIL)
  }

  /**
   * Disables rendering of this node. Changes [visible] to `false`.
   */
  public final fun hide(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.hidePtr, NIL)
  }

  /**
   * Sets whether the node notifies about its local transformation changes. [Node3D] will not
   * propagate this by default.
   */
  public final fun setNotifyLocalTransform(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setNotifyLocalTransformPtr, NIL)
  }

  /**
   * Returns whether node notifies about its local transformation changes. [Node3D] will not
   * propagate this by default.
   */
  public final fun isLocalTransformNotificationEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isLocalTransformNotificationEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets whether the node notifies about its global and local transformation changes. [Node3D] will
   * not propagate this by default, unless it is in the editor context and it has a valid gizmo.
   */
  public final fun setNotifyTransform(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setNotifyTransformPtr, NIL)
  }

  /**
   * Returns whether the node notifies about its global and local transformation changes. [Node3D]
   * will not propagate this by default.
   */
  public final fun isTransformNotificationEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isTransformNotificationEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Rotates the local transformation around axis, a unit [Vector3], by specified angle in radians.
   */
  public final fun rotate(axis: Vector3, angle: Float): Unit {
    Internals.writeArguments(VECTOR3 to axis, DOUBLE to angle.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.rotatePtr, NIL)
  }

  /**
   * Rotates the global (world) transformation around axis, a unit [Vector3], by specified angle in
   * radians. The rotation axis is in global coordinate system.
   */
  public final fun globalRotate(axis: Vector3, angle: Float): Unit {
    Internals.writeArguments(VECTOR3 to axis, DOUBLE to angle.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.globalRotatePtr, NIL)
  }

  /**
   * Scales the global (world) transformation by the given [Vector3] scale factors.
   */
  public final fun globalScale(scale: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to scale)
    Internals.callMethod(rawPtr, MethodBindings.globalScalePtr, NIL)
  }

  /**
   * Moves the global (world) transformation by [Vector3] offset. The offset is in global coordinate
   * system.
   */
  public final fun globalTranslate(offset: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to offset)
    Internals.callMethod(rawPtr, MethodBindings.globalTranslatePtr, NIL)
  }

  /**
   * Rotates the local transformation around axis, a unit [Vector3], by specified angle in radians.
   * The rotation axis is in object-local coordinate system.
   */
  public final fun rotateObjectLocal(axis: Vector3, angle: Float): Unit {
    Internals.writeArguments(VECTOR3 to axis, DOUBLE to angle.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.rotateObjectLocalPtr, NIL)
  }

  /**
   * Scales the local transformation by given 3D scale factors in object-local coordinate system.
   */
  public final fun scaleObjectLocal(scale: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to scale)
    Internals.callMethod(rawPtr, MethodBindings.scaleObjectLocalPtr, NIL)
  }

  /**
   * Changes the node's position by the given offset [Vector3] in local space.
   */
  public final fun translateObjectLocal(offset: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to offset)
    Internals.callMethod(rawPtr, MethodBindings.translateObjectLocalPtr, NIL)
  }

  /**
   * Rotates the local transformation around the X axis by angle in radians.
   */
  public final fun rotateX(angle: Float): Unit {
    Internals.writeArguments(DOUBLE to angle.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.rotateXPtr, NIL)
  }

  /**
   * Rotates the local transformation around the Y axis by angle in radians.
   */
  public final fun rotateY(angle: Float): Unit {
    Internals.writeArguments(DOUBLE to angle.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.rotateYPtr, NIL)
  }

  /**
   * Rotates the local transformation around the Z axis by angle in radians.
   */
  public final fun rotateZ(angle: Float): Unit {
    Internals.writeArguments(DOUBLE to angle.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.rotateZPtr, NIL)
  }

  /**
   * Changes the node's position by the given offset [Vector3].
   * Note that the translation [offset] is affected by the node's scale, so if scaled by e.g. `(10,
   * 1, 1)`, a translation by an offset of `(2, 0, 0)` would actually add 20 (`2 * 10`) to the X
   * coordinate.
   */
  public final fun translate(offset: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to offset)
    Internals.callMethod(rawPtr, MethodBindings.translatePtr, NIL)
  }

  /**
   * Resets this node's transformations (like scale, skew and taper) preserving its rotation and
   * translation by performing Gram-Schmidt orthonormalization on this node's [Transform3D].
   */
  public final fun orthonormalize(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.orthonormalizePtr, NIL)
  }

  /**
   * Reset all transformations for this node (sets its [Transform3D] to the identity matrix).
   */
  public final fun setIdentity(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.setIdentityPtr, NIL)
  }

  /**
   * Rotates the node so that the local forward axis (-Z, [Vector3.FORWARD]) points toward the
   * [target] position.
   * The local up axis (+Y) points as close to the [up] vector as possible while staying
   * perpendicular to the local forward axis. The resulting transform is orthogonal, and the scale is
   * preserved. Non-uniform scaling may not work correctly.
   * The [target] position cannot be the same as the node's position, the [up] vector cannot be
   * zero, and the direction from the node's position to the [target] vector cannot be parallel to the
   * [up] vector.
   * Operations take place in global space, which means that the node must be in the scene tree.
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
    Internals.writeArguments(VECTOR3 to target, VECTOR3 to up, BOOL to useModelFront)
    Internals.callMethod(rawPtr, MethodBindings.lookAtPtr, NIL)
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
    Internals.writeArguments(VECTOR3 to position, VECTOR3 to target, VECTOR3 to up, BOOL to useModelFront)
    Internals.callMethod(rawPtr, MethodBindings.lookAtFromPositionPtr, NIL)
  }

  /**
   * Transforms [globalPoint] from world space to this node's local space.
   */
  public final fun toLocal(globalPoint: Vector3): Vector3 {
    Internals.writeArguments(VECTOR3 to globalPoint)
    Internals.callMethod(rawPtr, MethodBindings.toLocalPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Transforms [localPoint] from this node's local space to world space.
   */
  public final fun toGlobal(localPoint: Vector3): Vector3 {
    Internals.writeArguments(VECTOR3 to localPoint)
    Internals.callMethod(rawPtr, MethodBindings.toGlobalPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public enum class RotationEditMode(
    id: Long,
  ) {
    /**
     * The rotation is edited using [Vector3] Euler angles.
     */
    ROTATION_EDIT_MODE_EULER(0),
    /**
     * The rotation is edited using a [Quaternion].
     */
    ROTATION_EDIT_MODE_QUATERNION(1),
    /**
     * The rotation is edited using a [Basis]. In this mode, [scale] can't be edited separately.
     */
    ROTATION_EDIT_MODE_BASIS(2),
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
    /**
     * [Node3D] nodes receive this notification when their global transform changes. This means that
     * either the current or a parent node changed its transform.
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
     * In order for [NOTIFICATION_LOCAL_TRANSFORM_CHANGED] to work, users first need to ask for it,
     * with [setNotifyLocalTransform].
     */
    public final const val NOTIFICATION_LOCAL_TRANSFORM_CHANGED: Long = 44
  }

  internal object MethodBindings {
    public val setTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "set_transform", 2952846383)

    public val getTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "get_transform", 3229777777)

    public val setPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "set_position", 3460891852)

    public val getPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "get_position", 3360562783)

    public val setRotationPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "set_rotation", 3460891852)

    public val getRotationPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "get_rotation", 3360562783)

    public val setRotationDegreesPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "set_rotation_degrees", 3460891852)

    public val getRotationDegreesPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "get_rotation_degrees", 3360562783)

    public val setRotationOrderPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "set_rotation_order", 1820889989)

    public val getRotationOrderPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "get_rotation_order", 916939469)

    public val setRotationEditModePtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "set_rotation_edit_mode", 141483330)

    public val getRotationEditModePtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "get_rotation_edit_mode", 1572188370)

    public val setScalePtr: VoidPtr = Internals.getMethodBindPtr("Node3D", "set_scale", 3460891852)

    public val getScalePtr: VoidPtr = Internals.getMethodBindPtr("Node3D", "get_scale", 3360562783)

    public val setQuaternionPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "set_quaternion", 1727505552)

    public val getQuaternionPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "get_quaternion", 1222331677)

    public val setBasisPtr: VoidPtr = Internals.getMethodBindPtr("Node3D", "set_basis", 1055510324)

    public val getBasisPtr: VoidPtr = Internals.getMethodBindPtr("Node3D", "get_basis", 2716978435)

    public val setGlobalTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "set_global_transform", 2952846383)

    public val getGlobalTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "get_global_transform", 3229777777)

    public val setGlobalPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "set_global_position", 3460891852)

    public val getGlobalPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "get_global_position", 3360562783)

    public val setGlobalBasisPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "set_global_basis", 1055510324)

    public val getGlobalBasisPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "get_global_basis", 2716978435)

    public val setGlobalRotationPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "set_global_rotation", 3460891852)

    public val getGlobalRotationPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "get_global_rotation", 3360562783)

    public val setGlobalRotationDegreesPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "set_global_rotation_degrees", 3460891852)

    public val getGlobalRotationDegreesPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "get_global_rotation_degrees", 3360562783)

    public val getParentNode3dPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "get_parent_node_3d", 151077316)

    public val setIgnoreTransformNotificationPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "set_ignore_transform_notification", 2586408642)

    public val setAsTopLevelPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "set_as_top_level", 2586408642)

    public val isSetAsTopLevelPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "is_set_as_top_level", 36873697)

    public val setDisableScalePtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "set_disable_scale", 2586408642)

    public val isScaleDisabledPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "is_scale_disabled", 36873697)

    public val getWorld3dPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "get_world_3d", 317588385)

    public val forceUpdateTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "force_update_transform", 3218959716)

    public val setVisibilityParentPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "set_visibility_parent", 1348162250)

    public val getVisibilityParentPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "get_visibility_parent", 4075236667)

    public val updateGizmosPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "update_gizmos", 3218959716)

    public val addGizmoPtr: VoidPtr = Internals.getMethodBindPtr("Node3D", "add_gizmo", 1544533845)

    public val getGizmosPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "get_gizmos", 3995934104)

    public val clearGizmosPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "clear_gizmos", 3218959716)

    public val setSubgizmoSelectionPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "set_subgizmo_selection", 3317607635)

    public val clearSubgizmoSelectionPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "clear_subgizmo_selection", 3218959716)

    public val setVisiblePtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "set_visible", 2586408642)

    public val isVisiblePtr: VoidPtr = Internals.getMethodBindPtr("Node3D", "is_visible", 36873697)

    public val isVisibleInTreePtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "is_visible_in_tree", 36873697)

    public val showPtr: VoidPtr = Internals.getMethodBindPtr("Node3D", "show", 3218959716)

    public val hidePtr: VoidPtr = Internals.getMethodBindPtr("Node3D", "hide", 3218959716)

    public val setNotifyLocalTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "set_notify_local_transform", 2586408642)

    public val isLocalTransformNotificationEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "is_local_transform_notification_enabled", 36873697)

    public val setNotifyTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "set_notify_transform", 2586408642)

    public val isTransformNotificationEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "is_transform_notification_enabled", 36873697)

    public val rotatePtr: VoidPtr = Internals.getMethodBindPtr("Node3D", "rotate", 3436291937)

    public val globalRotatePtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "global_rotate", 3436291937)

    public val globalScalePtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "global_scale", 3460891852)

    public val globalTranslatePtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "global_translate", 3460891852)

    public val rotateObjectLocalPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "rotate_object_local", 3436291937)

    public val scaleObjectLocalPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "scale_object_local", 3460891852)

    public val translateObjectLocalPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "translate_object_local", 3460891852)

    public val rotateXPtr: VoidPtr = Internals.getMethodBindPtr("Node3D", "rotate_x", 373806689)

    public val rotateYPtr: VoidPtr = Internals.getMethodBindPtr("Node3D", "rotate_y", 373806689)

    public val rotateZPtr: VoidPtr = Internals.getMethodBindPtr("Node3D", "rotate_z", 373806689)

    public val translatePtr: VoidPtr = Internals.getMethodBindPtr("Node3D", "translate", 3460891852)

    public val orthonormalizePtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "orthonormalize", 3218959716)

    public val setIdentityPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "set_identity", 3218959716)

    public val lookAtPtr: VoidPtr = Internals.getMethodBindPtr("Node3D", "look_at", 2882425029)

    public val lookAtFromPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("Node3D", "look_at_from_position", 2086826090)

    public val toLocalPtr: VoidPtr = Internals.getMethodBindPtr("Node3D", "to_local", 192990374)

    public val toGlobalPtr: VoidPtr = Internals.getMethodBindPtr("Node3D", "to_global", 192990374)
  }
}
