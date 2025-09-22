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
import godot.core.GodotEnum
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

/**
 * The [Node3D] node is the base representation of a node in 3D space. All other 3D nodes inherit
 * from this class.
 *
 * Affine operations (translation, rotation, scale) are calculated in the coordinate system relative
 * to the parent, unless the [Node3D]'s [topLevel] is `true`. In this coordinate system, affine
 * operations correspond to direct affine operations on the [Node3D]'s [transform]. The term *parent
 * space* refers to this coordinate system. The coordinate system that is attached to the [Node3D]
 * itself is referred to as object-local coordinate system, or *local space*.
 *
 * **Note:** Unless otherwise specified, all methods that need angle parameters must receive angles
 * in *radians*. To convert degrees to radians, use [@GlobalScope.degToRad].
 *
 * **Note:** In Godot 3 and older, [Node3D] was named *Spatial*.
 */
@GodotBaseType
public open class Node3D : Node() {
  /**
   * Emitted when this node's visibility changes (see [visible] and [isVisibleInTree]).
   *
   * This signal is emitted *after* the related [NOTIFICATION_VISIBILITY_CHANGED] notification.
   */
  public val visibilityChanged: Signal0 by Signal0

  /**
   * The local transformation of this node, in parent space (relative to the parent node). Contains
   * and represents this node's [position], [rotation], and [scale].
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
   * The transformation of this node, in global space (relative to the world). Contains and
   * represents this node's [globalPosition], [globalRotation], and global scale.
   *
   * **Note:** If the node is not inside the tree, getting this property fails and returns
   * [Transform3D.IDENTITY].
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
   * Position (translation) of this node in parent space (relative to the parent node). This is
   * equivalent to the [transform]'s [Transform3D.origin].
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
   * Rotation of this node as [url=https://en.wikipedia.org/wiki/Euler_angles]Euler angles[/url], in
   * radians and in parent space (relative to the parent node). This value is obtained from [basis]'s
   * rotation.
   *
   * - The [Vector3.x] is the angle around the local X axis (pitch);
   *
   * - The [Vector3.y] is the angle around the local Y axis (yaw);
   *
   * - The [Vector3.z] is the angle around the local Z axis (roll).
   *
   * The order of each consecutive rotation can be changed with [rotationOrder] (see [EulerOrder]
   * constants). By default, the YXZ convention is used ([EULER_ORDER_YXZ]).
   *
   * **Note:** This property is edited in degrees in the inspector. If you want to use degrees in a
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
   * The [rotation] of this node, in degrees instead of radians.
   *
   * **Note:** This is **not** the property available in the Inspector dock.
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
   * Rotation of this node represented as a [Quaternion] in parent space (relative to the parent
   * node). This value is obtained from [basis]'s rotation.
   *
   * **Note:** Quaternions are much more suitable for 3D math but are less intuitive. Setting this
   * property can be useful for interpolation (see [Quaternion.slerp]).
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
   * Basis of the [transform] property. Represents the rotation, scale, and shear of this node in
   * parent space (relative to the parent node).
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
   * Scale of this node in local space (relative to this node). This value is obtained from
   * [basis]'s scale.
   *
   * **Note:** The behavior of some 3D node types is not affected by this property. These include
   * [Light3D], [Camera3D], [AudioStreamPlayer3D], and more.
   *
   * **Warning:** The scale's components must either be all positive or all negative, and **not**
   * exactly `0.0`. Otherwise, it won't be possible to obtain the scale from the [basis]. This may
   * cause the intended scale to be lost when reloaded from disk, and potentially other unstable
   * behavior.
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
   * How this node's rotation and scale are displayed in the Inspector dock.
   */
  public final inline var rotationEditMode: RotationEditMode
    @JvmName("rotationEditModeProperty")
    get() = getRotationEditMode()
    @JvmName("rotationEditModeProperty")
    set(`value`) {
      setRotationEditMode(value)
    }

  /**
   * The axis rotation order of the [rotation] property. The final orientation is calculated by
   * rotating around the local X, Y, and Z axis in this order.
   */
  public final inline var rotationOrder: EulerOrder
    @JvmName("rotationOrderProperty")
    get() = getRotationOrder()
    @JvmName("rotationOrderProperty")
    set(`value`) {
      setRotationOrder(value)
    }

  /**
   * If `true`, the node does not inherit its transformations from its parent. As such, node
   * transformations will only be in global space, which also means that [globalTransform] and
   * [transform] will be identical.
   */
  public final inline var topLevel: Boolean
    @JvmName("topLevelProperty")
    get() = isSetAsTopLevel()
    @JvmName("topLevelProperty")
    set(`value`) {
      setAsTopLevel(value)
    }

  /**
   * Global position (translation) of this node in global space (relative to the world). This is
   * equivalent to the [globalTransform]'s [Transform3D.origin].
   *
   * **Note:** If the node is not inside the tree, getting this property fails and returns
   * [Vector3.ZERO].
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
   * Basis of the [globalTransform] property. Represents the rotation, scale, and shear of this node
   * in global space (relative to the world).
   *
   * **Note:** If the node is not inside the tree, getting this property fails and returns
   * [Basis.IDENTITY].
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
   * Global rotation of this node as [url=https://en.wikipedia.org/wiki/Euler_angles]Euler
   * angles[/url], in radians and in global space (relative to the world). This value is obtained from
   * [globalBasis]'s rotation.
   *
   * - The [Vector3.x] is the angle around the global X axis (pitch);
   *
   * - The [Vector3.y] is the angle around the global Y axis (yaw);
   *
   * - The [Vector3.z] is the angle around the global Z axis (roll).
   *
   * **Note:** Unlike [rotation], this property always follows the YXZ convention
   * ([EULER_ORDER_YXZ]).
   *
   * **Note:** If the node is not inside the tree, getting this property fails and returns
   * [Vector3.ZERO].
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
   * The [globalRotation] of this node, in degrees instead of radians.
   *
   * **Note:** If the node is not inside the tree, getting this property fails and returns
   * [Vector3.ZERO].
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
   * If `true`, this node can be visible. The node is only rendered when all of its ancestors are
   * visible, as well. That means [isVisibleInTree] must return `true`.
   */
  public final inline var visible: Boolean
    @JvmName("visibleProperty")
    get() = isVisible()
    @JvmName("visibleProperty")
    set(`value`) {
      setVisible(value)
    }

  /**
   * Path to the visibility range parent for this node and its descendants. The visibility parent
   * must be a [GeometryInstance3D].
   *
   * Any visual instance will only be visible if the visibility parent (and all of its visibility
   * ancestors) is hidden by being closer to the camera than its own
   * [GeometryInstance3D.visibilityRangeBegin]. Nodes hidden via the [Node3D.visible] property are
   * essentially removed from the visibility dependency tree, so dependent instances will not take the
   * hidden node or its descendants into account.
   */
  public final inline var visibilityParent: NodePath
    @JvmName("visibilityParentProperty")
    get() = getVisibilityParent()
    @JvmName("visibilityParentProperty")
    set(`value`) {
      setVisibilityParent(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(406, scriptIndex)
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
   * The local transformation of this node, in parent space (relative to the parent node). Contains
   * and represents this node's [position], [rotation], and [scale].
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
   * The transformation of this node, in global space (relative to the world). Contains and
   * represents this node's [globalPosition], [globalRotation], and global scale.
   *
   * **Note:** If the node is not inside the tree, getting this property fails and returns
   * [Transform3D.IDENTITY].
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
   * Position (translation) of this node in parent space (relative to the parent node). This is
   * equivalent to the [transform]'s [Transform3D.origin].
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
   * Rotation of this node as [url=https://en.wikipedia.org/wiki/Euler_angles]Euler angles[/url], in
   * radians and in parent space (relative to the parent node). This value is obtained from [basis]'s
   * rotation.
   *
   * - The [Vector3.x] is the angle around the local X axis (pitch);
   *
   * - The [Vector3.y] is the angle around the local Y axis (yaw);
   *
   * - The [Vector3.z] is the angle around the local Z axis (roll).
   *
   * The order of each consecutive rotation can be changed with [rotationOrder] (see [EulerOrder]
   * constants). By default, the YXZ convention is used ([EULER_ORDER_YXZ]).
   *
   * **Note:** This property is edited in degrees in the inspector. If you want to use degrees in a
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
   * The [rotation] of this node, in degrees instead of radians.
   *
   * **Note:** This is **not** the property available in the Inspector dock.
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
   * Rotation of this node represented as a [Quaternion] in parent space (relative to the parent
   * node). This value is obtained from [basis]'s rotation.
   *
   * **Note:** Quaternions are much more suitable for 3D math but are less intuitive. Setting this
   * property can be useful for interpolation (see [Quaternion.slerp]).
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
   * Basis of the [transform] property. Represents the rotation, scale, and shear of this node in
   * parent space (relative to the parent node).
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
   * Scale of this node in local space (relative to this node). This value is obtained from
   * [basis]'s scale.
   *
   * **Note:** The behavior of some 3D node types is not affected by this property. These include
   * [Light3D], [Camera3D], [AudioStreamPlayer3D], and more.
   *
   * **Warning:** The scale's components must either be all positive or all negative, and **not**
   * exactly `0.0`. Otherwise, it won't be possible to obtain the scale from the [basis]. This may
   * cause the intended scale to be lost when reloaded from disk, and potentially other unstable
   * behavior.
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
   * Global position (translation) of this node in global space (relative to the world). This is
   * equivalent to the [globalTransform]'s [Transform3D.origin].
   *
   * **Note:** If the node is not inside the tree, getting this property fails and returns
   * [Vector3.ZERO].
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
   * Basis of the [globalTransform] property. Represents the rotation, scale, and shear of this node
   * in global space (relative to the world).
   *
   * **Note:** If the node is not inside the tree, getting this property fails and returns
   * [Basis.IDENTITY].
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
   * Global rotation of this node as [url=https://en.wikipedia.org/wiki/Euler_angles]Euler
   * angles[/url], in radians and in global space (relative to the world). This value is obtained from
   * [globalBasis]'s rotation.
   *
   * - The [Vector3.x] is the angle around the global X axis (pitch);
   *
   * - The [Vector3.y] is the angle around the global Y axis (yaw);
   *
   * - The [Vector3.z] is the angle around the global Z axis (roll).
   *
   * **Note:** Unlike [rotation], this property always follows the YXZ convention
   * ([EULER_ORDER_YXZ]).
   *
   * **Note:** If the node is not inside the tree, getting this property fails and returns
   * [Vector3.ZERO].
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
   * The [globalRotation] of this node, in degrees instead of radians.
   *
   * **Note:** If the node is not inside the tree, getting this property fails and returns
   * [Vector3.ZERO].
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
    TransferContext.writeArguments(LONG to order.value)
    TransferContext.callMethod(ptr, MethodBindings.setRotationOrderPtr, NIL)
  }

  public final fun getRotationOrder(): EulerOrder {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRotationOrderPtr, LONG)
    return EulerOrder.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setRotationEditMode(editMode: RotationEditMode): Unit {
    TransferContext.writeArguments(LONG to editMode.value)
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
   * Returns the parent [Node3D] that directly affects this node's [globalTransform]. Returns `null`
   * if no parent exists, the parent is not a [Node3D], or [topLevel] is `true`.
   *
   * **Note:** This method is not always equivalent to [Node.getParent], which does not take
   * [topLevel] into account.
   */
  public final fun getParentNode3d(): Node3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getParentNode3dPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Node3D?)
  }

  /**
   * If `true`, the node will not receive [NOTIFICATION_TRANSFORM_CHANGED] or
   * [NOTIFICATION_LOCAL_TRANSFORM_CHANGED].
   *
   * It may useful to call this method when handling these notifications to prevent infinite
   * recursion.
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
   * If `true`, this node's [globalTransform] is automatically orthonormalized. This results in this
   * node not appearing distorted, as if its global scale were set to [Vector3.ONE] (or its negative
   * counterpart). See also [isScaleDisabled] and [orthonormalize].
   *
   * **Note:** [transform] is not affected by this setting.
   */
  public final fun setDisableScale(disable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to disable)
    TransferContext.callMethod(ptr, MethodBindings.setDisableScalePtr, NIL)
  }

  /**
   * Returns `true` if this node's [globalTransform] is automatically orthonormalized. This results
   * in this node not appearing distorted, as if its global scale were set to [Vector3.ONE] (or its
   * negative counterpart). See also [setDisableScale] and [orthonormalize].
   *
   * **Note:** [transform] is not affected by this setting.
   */
  public final fun isScaleDisabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isScaleDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the [World3D] this node is registered to.
   *
   * Usually, this is the same as the world used by this node's viewport (see [Node.getViewport] and
   * [Viewport.findWorld3d]).
   */
  public final fun getWorld3d(): World3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWorld3dPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as World3D?)
  }

  /**
   * Forces the node's [globalTransform] to update, by sending [NOTIFICATION_TRANSFORM_CHANGED].
   * Fails if the node is not inside the tree.
   *
   * **Note:** For performance reasons, transform changes are usually accumulated and applied *once*
   * at the end of the frame. The update propagates through [Node3D] children, as well. Therefore, use
   * this method only when you need an up-to-date transform (such as during physics operations).
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
   * Updates all the [EditorNode3DGizmo] objects attached to this node. Only works in the editor.
   */
  public final fun updateGizmos(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.updateGizmosPtr, NIL)
  }

  /**
   * Attaches the given [gizmo] to this node. Only works in the editor.
   *
   * **Note:** [gizmo] should be an [EditorNode3DGizmo]. The argument type is [Node3DGizmo] to avoid
   * depending on editor classes in [Node3D].
   */
  public final fun addGizmo(gizmo: Node3DGizmo?): Unit {
    TransferContext.writeArguments(OBJECT to gizmo)
    TransferContext.callMethod(ptr, MethodBindings.addGizmoPtr, NIL)
  }

  /**
   * Returns all the [EditorNode3DGizmo] objects attached to this node. Only works in the editor.
   */
  public final fun getGizmos(): VariantArray<Node3DGizmo> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGizmosPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Node3DGizmo>)
  }

  /**
   * Clears all [EditorNode3DGizmo] objects attached to this node. Only works in the editor.
   */
  public final fun clearGizmos(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearGizmosPtr, NIL)
  }

  /**
   * Selects the [gizmo]'s subgizmo with the given [id] and sets its transform. Only works in the
   * editor.
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
   * Deselects all subgizmos for this node. Useful to call when the selected subgizmo may no longer
   * exist after a property change. Only works in the editor.
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
   * Returns `true` if this node is inside the scene tree and the [visible] property is `true` for
   * this node and all of its [Node3D] ancestors *in sequence*. An ancestor of any other type (such as
   * [Node] or [Node2D]) breaks the sequence. See also [Node.getParent].
   *
   * **Note:** This method cannot take [VisualInstance3D.layers] into account, so even if this
   * method returns `true`, the node may not be rendered.
   */
  public final fun isVisibleInTree(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isVisibleInTreePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Allows this node to be rendered. Equivalent to setting [visible] to `true`. This is the
   * opposite of [hide].
   */
  public final fun show(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.showPtr, NIL)
  }

  /**
   * Prevents this node from being rendered. Equivalent to setting [visible] to `false`. This is the
   * opposite of [show].
   */
  public final fun hide(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hidePtr, NIL)
  }

  /**
   * If `true`, the node will receive [NOTIFICATION_LOCAL_TRANSFORM_CHANGED] whenever [transform]
   * changes.
   *
   * **Note:** Some 3D nodes such as [CSGShape3D] or [CollisionShape3D] automatically enable this to
   * function correctly.
   */
  public final fun setNotifyLocalTransform(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setNotifyLocalTransformPtr, NIL)
  }

  /**
   * Returns `true` if the node receives [NOTIFICATION_LOCAL_TRANSFORM_CHANGED] whenever [transform]
   * changes. This is enabled with [setNotifyLocalTransform].
   */
  public final fun isLocalTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isLocalTransformNotificationEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If `true`, the node will receive [NOTIFICATION_TRANSFORM_CHANGED] whenever [globalTransform]
   * changes.
   *
   * **Note:** Most 3D nodes such as [VisualInstance3D] or [CollisionObject3D] automatically enable
   * this to function correctly.
   *
   * **Note:** In the editor, nodes will propagate this notification to their children if a gizmo is
   * attached (see [addGizmo]).
   */
  public final fun setNotifyTransform(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setNotifyTransformPtr, NIL)
  }

  /**
   * Returns `true` if the node receives [NOTIFICATION_TRANSFORM_CHANGED] whenever [globalTransform]
   * changes. This is enabled with [setNotifyTransform].
   */
  public final fun isTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isTransformNotificationEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Rotates this node's [basis] around the [axis] by the given [angle], in radians. This operation
   * is calculated in parent space (relative to the parent) and preserves the [position].
   */
  public final fun rotate(axis: Vector3, angle: Float): Unit {
    TransferContext.writeArguments(VECTOR3 to axis, DOUBLE to angle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.rotatePtr, NIL)
  }

  /**
   * Rotates this node's [globalBasis] around the global [axis] by the given [angle], in radians.
   * This operation is calculated in global space (relative to the world) and preserves the
   * [globalPosition].
   */
  public final fun globalRotate(axis: Vector3, angle: Float): Unit {
    TransferContext.writeArguments(VECTOR3 to axis, DOUBLE to angle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.globalRotatePtr, NIL)
  }

  /**
   * Scales this node's [globalBasis] by the given [scale] factor. This operation is calculated in
   * global space (relative to the world) and preserves the [globalPosition].
   *
   * **Note:** This method is not to be confused with the [scale] property.
   */
  public final fun globalScale(scale: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to scale)
    TransferContext.callMethod(ptr, MethodBindings.globalScalePtr, NIL)
  }

  /**
   * Adds the given translation [offset] to the node's [globalPosition] in global space (relative to
   * the world).
   */
  public final fun globalTranslate(offset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(ptr, MethodBindings.globalTranslatePtr, NIL)
  }

  /**
   * Rotates this node's [basis] around the [axis] by the given [angle], in radians. This operation
   * is calculated in local space (relative to this node) and preserves the [position].
   */
  public final fun rotateObjectLocal(axis: Vector3, angle: Float): Unit {
    TransferContext.writeArguments(VECTOR3 to axis, DOUBLE to angle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.rotateObjectLocalPtr, NIL)
  }

  /**
   * Scales this node's [basis] by the given [scale] factor. This operation is calculated in local
   * space (relative to this node) and preserves the [position].
   */
  public final fun scaleObjectLocal(scale: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to scale)
    TransferContext.callMethod(ptr, MethodBindings.scaleObjectLocalPtr, NIL)
  }

  /**
   * Adds the given translation [offset] to the node's position, in local space (relative to this
   * node).
   */
  public final fun translateObjectLocal(offset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(ptr, MethodBindings.translateObjectLocalPtr, NIL)
  }

  /**
   * Rotates this node's [basis] around the X axis by the given [angle], in radians. This operation
   * is calculated in parent space (relative to the parent) and preserves the [position].
   */
  public final fun rotateX(angle: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.rotateXPtr, NIL)
  }

  /**
   * Rotates this node's [basis] around the Y axis by the given [angle], in radians. This operation
   * is calculated in parent space (relative to the parent) and preserves the [position].
   */
  public final fun rotateY(angle: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.rotateYPtr, NIL)
  }

  /**
   * Rotates this node's [basis] around the Z axis by the given [angle], in radians. This operation
   * is calculated in parent space (relative to the parent) and preserves the [position].
   */
  public final fun rotateZ(angle: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.rotateZPtr, NIL)
  }

  /**
   * Adds the given translation [offset] to the node's position, in local space (relative to this
   * node).
   *
   * **Note:** Prefer using [translateObjectLocal], instead, as this method may be changed in a
   * future release.
   *
   * **Note:** Despite the naming convention, this operation is **not** calculated in parent space
   * for compatibility reasons. To translate in parent space, add [offset] to the [position]
   * (`node_3d.position += offset`).
   */
  public final fun translate(offset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(ptr, MethodBindings.translatePtr, NIL)
  }

  /**
   * Orthonormalizes this node's [basis]. This method sets this node's [scale] to [Vector3.ONE] (or
   * its negative counterpart), but preserves the [position] and [rotation]. See also
   * [Transform3D.orthonormalized].
   */
  public final fun orthonormalize(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.orthonormalizePtr, NIL)
  }

  /**
   * Sets this node's [transform] to [Transform3D.IDENTITY], which resets all transformations in
   * parent space ([position], [rotation], and [scale]).
   */
  public final fun setIdentity(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.setIdentityPtr, NIL)
  }

  /**
   * Rotates the node so that the local forward axis (-Z, [Vector3.FORWARD]) points toward the
   * [target] position. This operation is calculated in global space (relative to the world).
   *
   * The local up axis (+Y) points as close to the [up] vector as possible while staying
   * perpendicular to the local forward axis. The resulting transform is orthogonal, and the scale is
   * preserved. Non-uniform scaling may not work correctly.
   *
   * The [target] position cannot be the same as the node's position, the [up] vector cannot be
   * [Vector3.ZERO]. Furthermore, the direction from the node's position to the [target] position
   * cannot be parallel to the [up] vector, to avoid an unintended rotation around the local Z axis.
   *
   * If [useModelFront] is `true`, the +Z axis (asset front) is treated as forward (implies +X is
   * left) and points toward the [target] position. By default, the -Z axis (camera forward) is treated
   * as forward (implies +X is right).
   *
   * **Note:** This method fails if the node is not in the scene tree. If necessary, use
   * [lookAtFromPosition] instead.
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
   * Moves the node to the specified [position], then rotates the node to point toward the [target]
   * position, similar to [lookAt]. This operation is calculated in global space (relative to the
   * world).
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
   * Returns the [globalPoint] converted from global space to this node's local space. This is the
   * opposite of [toGlobal].
   */
  public final fun toLocal(globalPoint: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to globalPoint)
    TransferContext.callMethod(ptr, MethodBindings.toLocalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the [localPoint] converted from this node's local space to global space. This is the
   * opposite of [toLocal].
   */
  public final fun toGlobal(localPoint: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to localPoint)
    TransferContext.callMethod(ptr, MethodBindings.toGlobalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setVisibilityParent(path: String) = setVisibilityParent(path.asCachedNodePath())

  public enum class RotationEditMode(
    `value`: Long,
  ) : GodotEnum {
    /**
     * The rotation is edited using a [Vector3] in
     * [url=https://en.wikipedia.org/wiki/Euler_angles]Euler angles[/url].
     */
    EULER(0),
    /**
     * The rotation is edited using a [Quaternion].
     */
    QUATERNION(1),
    /**
     * The rotation is edited using a [Basis]. In this mode, the raw [basis]'s axes can be freely
     * modified, but the [scale] property is not available.
     */
    BASIS(2),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): RotationEditMode = entries.single { it.`value` == `value` }
    }
  }

  public companion object {
    /**
     * Notification received when this node's [globalTransform] changes, if
     * [isTransformNotificationEnabled] is `true`. See also [setNotifyTransform].
     *
     * **Note:** Most 3D nodes such as [VisualInstance3D] or [CollisionObject3D] automatically
     * enable this to function correctly.
     *
     * **Note:** In the editor, nodes will propagate this notification to their children if a gizmo
     * is attached (see [addGizmo]).
     */
    public final const val NOTIFICATION_TRANSFORM_CHANGED: Long = 2000

    /**
     * Notification received when this node is registered to a new [World3D] (see [getWorld3d]).
     */
    public final const val NOTIFICATION_ENTER_WORLD: Long = 41

    /**
     * Notification received when this node is unregistered from the current [World3D] (see
     * [getWorld3d]).
     */
    public final const val NOTIFICATION_EXIT_WORLD: Long = 42

    /**
     * Notification received when this node's visibility changes (see [visible] and
     * [isVisibleInTree]).
     *
     * This notification is received *before* the related [signal visibility_changed] signal.
     */
    public final const val NOTIFICATION_VISIBILITY_CHANGED: Long = 43

    /**
     * Notification received when this node's [transform] changes, if
     * [isLocalTransformNotificationEnabled] is `true`. This is not received when a parent [Node3D]'s
     * [transform] changes. See also [setNotifyLocalTransform].
     *
     * **Note:** Some 3D nodes such as [CSGShape3D] or [CollisionShape3D] automatically enable this
     * to function correctly.
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
