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
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BASIS
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.QUATERNION
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Most basic 3D game object, parent of all 3D-related nodes.
 *
 * Tutorials:
 * [https://github.com/godotengine/godot-demo-projects/tree/master/3d](https://github.com/godotengine/godot-demo-projects/tree/master/3d)
 *
 * Most basic 3D game object, with a [godot.Transform3D] and visibility settings. All other 3D game objects inherit from Node3D. Use [godot.Node3D] as a parent node to move, scale, rotate and show/hide children in a 3D project.
 *
 * Affine operations (rotate, scale, translate) happen in parent's local coordinate system, unless the [godot.Node3D] object is set as top-level. Affine operations in this coordinate system correspond to direct affine operations on the [godot.Node3D]'s transform. The word local below refers to this coordinate system. The coordinate system that is attached to the [godot.Node3D] object itself is referred to as object-local coordinate system.
 *
 * **Note:** Unless otherwise specified, all methods that have angle parameters must have angles specified as *radians*. To convert degrees to radians, use [@GlobalScope.degToRad].
 *
 * **Note:** Be aware that "Spatial" nodes are now called "Node3D" starting with Godot 4. Any Godot 3.x references to "Spatial" nodes refer to "Node3D" in Godot 4.
 */
@GodotBaseType
public open class Node3D : Node() {
  /**
   * Emitted when node visibility changes.
   */
  public val visibilityChanged: Signal0 by signal()

  /**
   * Local space [godot.Transform3D] of this node, with respect to the parent node.
   */
  @CoreTypeLocalCopy
  public var transform: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTransformPtr, TRANSFORM3D)
      return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTransformPtr, NIL)
    }

  /**
   * World3D space (global) [godot.Transform3D] of this node.
   */
  @CoreTypeLocalCopy
  public var globalTransform: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlobalTransformPtr, TRANSFORM3D)
      return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalTransformPtr, NIL)
    }

  /**
   * Local position or translation of this node relative to the parent. This is equivalent to `transform.origin`.
   */
  @CoreTypeLocalCopy
  public var position: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionPtr, NIL)
    }

  /**
   * Rotation part of the local transformation in radians, specified in terms of Euler angles. The angles construct a rotaton in the order specified by the [rotationOrder] property.
   *
   * **Note:** In the mathematical sense, rotation is a matrix and not a vector. The three Euler angles, which are the three independent parameters of the Euler-angle parametrization of the rotation matrix, are stored in a [godot.core.Vector3] data structure not because the rotation is a vector, but only because [godot.core.Vector3] exists as a convenient data-structure to store 3 floating-point numbers. Therefore, applying affine operations on the rotation "vector" is not meaningful.
   *
   * **Note:** This property is edited in the inspector in degrees. If you want to use degrees in a script, use [rotationDegrees].
   */
  @CoreTypeLocalCopy
  public var rotation: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRotationPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRotationPtr, NIL)
    }

  /**
   * Helper property to access [rotation] in degrees instead of radians.
   */
  @CoreTypeLocalCopy
  public var rotationDegrees: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRotationDegreesPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRotationDegreesPtr, NIL)
    }

  /**
   * Access to the node rotation as a [godot.Quaternion]. This property is ideal for tweening complex rotations.
   */
  @CoreTypeLocalCopy
  public var quaternion: Quaternion
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getQuaternionPtr, QUATERNION)
      return (TransferContext.readReturnValue(QUATERNION, false) as Quaternion)
    }
    set(`value`) {
      TransferContext.writeArguments(QUATERNION to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setQuaternionPtr, NIL)
    }

  /**
   * Direct access to the 3x3 basis of the [godot.Transform3D] property.
   */
  @CoreTypeLocalCopy
  public var basis: Basis
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBasisPtr, BASIS)
      return (TransferContext.readReturnValue(BASIS, false) as Basis)
    }
    set(`value`) {
      TransferContext.writeArguments(BASIS to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBasisPtr, NIL)
    }

  /**
   * Scale part of the local transformation.
   *
   * **Note:** Mixed negative scales in 3D are not decomposable from the transformation matrix. Due to the way scale is represented with transformation matrices in Godot, the scale values will either be all positive or all negative.
   *
   * **Note:** Not all nodes are visually scaled by the [scale] property. For example, [godot.Light3D]s are not visually affected by [scale].
   */
  @CoreTypeLocalCopy
  public var scale: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScalePtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScalePtr, NIL)
    }

  /**
   * Specify how rotation (and scale) will be presented in the editor.
   */
  public var rotationEditMode: RotationEditMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRotationEditModePtr, LONG)
      return Node3D.RotationEditMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setRotationEditModePtr, NIL)
    }

  /**
   * Specify the axis rotation order of the [rotation] property. The final orientation is constructed by rotating the Euler angles in the order specified by this property.
   */
  public var rotationOrder: EulerOrder
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRotationOrderPtr, LONG)
      return EulerOrder.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setRotationOrderPtr, NIL)
    }

  /**
   * If `true`, the node will not inherit its transformations from its parent. Node transformations are only in global space.
   */
  public var topLevel: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSetAsTopLevelPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAsTopLevelPtr, NIL)
    }

  /**
   * Global position of this node. This is equivalent to `global_transform.origin`.
   */
  @CoreTypeLocalCopy
  public var globalPosition: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlobalPositionPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalPositionPtr, NIL)
    }

  /**
   * Rotation part of the global transformation in radians, specified in terms of YXZ-Euler angles in the format (X angle, Y angle, Z angle).
   *
   * **Note:** In the mathematical sense, rotation is a matrix and not a vector. The three Euler angles, which are the three independent parameters of the Euler-angle parametrization of the rotation matrix, are stored in a [godot.core.Vector3] data structure not because the rotation is a vector, but only because [godot.core.Vector3] exists as a convenient data-structure to store 3 floating-point numbers. Therefore, applying affine operations on the rotation "vector" is not meaningful.
   */
  @CoreTypeLocalCopy
  public var globalRotation: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlobalRotationPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalRotationPtr, NIL)
    }

  /**
   * Helper property to access [globalRotation] in degrees instead of radians.
   */
  @CoreTypeLocalCopy
  public var globalRotationDegrees: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlobalRotationDegreesPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalRotationDegreesPtr, NIL)
    }

  /**
   * If `true`, this node is drawn. The node is only visible if all of its ancestors are visible as well (in other words, [isVisibleInTree] must return `true`).
   */
  public var visible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVisiblePtr, NIL)
    }

  /**
   * Defines the visibility range parent for this node and its subtree. The visibility parent must be a GeometryInstance3D. Any visual instance will only be visible if the visibility parent (and all of its visibility ancestors) is hidden by being closer to the camera than its own [godot.GeometryInstance3D.visibilityRangeBegin]. Nodes hidden via the [godot.Node3D.visible] property are essentially removed from the visibility dependency tree, so dependent instances will not take the hidden node or its ancestors into account.
   */
  public var visibilityParent: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityParentPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityParentPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NODE3D, scriptIndex)
    return true
  }

  /**
   * Local space [godot.Transform3D] of this node, with respect to the parent node.
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
  public open fun transformMutate(block: Transform3D.() -> Unit): Transform3D = transform.apply{
      block(this)
      transform = this
  }


  /**
   * World3D space (global) [godot.Transform3D] of this node.
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
  public open fun globalTransformMutate(block: Transform3D.() -> Unit): Transform3D =
      globalTransform.apply{
      block(this)
      globalTransform = this
  }


  /**
   * Local position or translation of this node relative to the parent. This is equivalent to `transform.origin`.
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
  public open fun positionMutate(block: Vector3.() -> Unit): Vector3 = position.apply{
      block(this)
      position = this
  }


  /**
   * Rotation part of the local transformation in radians, specified in terms of Euler angles. The angles construct a rotaton in the order specified by the [rotationOrder] property.
   *
   * **Note:** In the mathematical sense, rotation is a matrix and not a vector. The three Euler angles, which are the three independent parameters of the Euler-angle parametrization of the rotation matrix, are stored in a [godot.core.Vector3] data structure not because the rotation is a vector, but only because [godot.core.Vector3] exists as a convenient data-structure to store 3 floating-point numbers. Therefore, applying affine operations on the rotation "vector" is not meaningful.
   *
   * **Note:** This property is edited in the inspector in degrees. If you want to use degrees in a script, use [rotationDegrees].
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
  public open fun rotationMutate(block: Vector3.() -> Unit): Vector3 = rotation.apply{
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
  public open fun rotationDegreesMutate(block: Vector3.() -> Unit): Vector3 = rotationDegrees.apply{
      block(this)
      rotationDegrees = this
  }


  /**
   * Access to the node rotation as a [godot.Quaternion]. This property is ideal for tweening complex rotations.
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
  public open fun quaternionMutate(block: Quaternion.() -> Unit): Quaternion = quaternion.apply{
      block(this)
      quaternion = this
  }


  /**
   * Direct access to the 3x3 basis of the [godot.Transform3D] property.
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
  public open fun basisMutate(block: Basis.() -> Unit): Basis = basis.apply{
      block(this)
      basis = this
  }


  /**
   * Scale part of the local transformation.
   *
   * **Note:** Mixed negative scales in 3D are not decomposable from the transformation matrix. Due to the way scale is represented with transformation matrices in Godot, the scale values will either be all positive or all negative.
   *
   * **Note:** Not all nodes are visually scaled by the [scale] property. For example, [godot.Light3D]s are not visually affected by [scale].
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
  public open fun scaleMutate(block: Vector3.() -> Unit): Vector3 = scale.apply{
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
  public open fun globalPositionMutate(block: Vector3.() -> Unit): Vector3 = globalPosition.apply{
      block(this)
      globalPosition = this
  }


  /**
   * Rotation part of the global transformation in radians, specified in terms of YXZ-Euler angles in the format (X angle, Y angle, Z angle).
   *
   * **Note:** In the mathematical sense, rotation is a matrix and not a vector. The three Euler angles, which are the three independent parameters of the Euler-angle parametrization of the rotation matrix, are stored in a [godot.core.Vector3] data structure not because the rotation is a vector, but only because [godot.core.Vector3] exists as a convenient data-structure to store 3 floating-point numbers. Therefore, applying affine operations on the rotation "vector" is not meaningful.
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
  public open fun globalRotationMutate(block: Vector3.() -> Unit): Vector3 = globalRotation.apply{
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
  public open fun globalRotationDegreesMutate(block: Vector3.() -> Unit): Vector3 =
      globalRotationDegrees.apply{
      block(this)
      globalRotationDegrees = this
  }


  /**
   * Returns the parent [godot.Node3D], or an empty [godot.Object] if no parent exists or parent is not of type [godot.Node3D].
   */
  public fun getParentNode3d(): Node3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParentNode3dPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Node3D?)
  }

  /**
   * Sets whether the node ignores notification that its transformation (global or local) changed.
   */
  public fun setIgnoreTransformNotification(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setIgnoreTransformNotificationPtr, NIL)
  }

  /**
   * Sets whether the node uses a scale of `(1, 1, 1)` or its local transformation scale. Changes to the local transformation scale are preserved.
   */
  public fun setDisableScale(disable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to disable)
    TransferContext.callMethod(rawPtr, MethodBindings.setDisableScalePtr, NIL)
  }

  /**
   * Returns whether this node uses a scale of `(1, 1, 1)` or its local transformation scale.
   */
  public fun isScaleDisabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isScaleDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the current [godot.World3D] resource this [godot.Node3D] node is registered to.
   */
  public fun getWorld3d(): World3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWorld3dPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as World3D?)
  }

  /**
   * Forces the transform to update. Transform changes in physics are not instant for performance reasons. Transforms are accumulated and then set. Use this if you need an up-to-date transform when doing physics operations.
   */
  public fun forceUpdateTransform(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.forceUpdateTransformPtr, NIL)
  }

  /**
   * Updates all the [godot.Node3DGizmo]s attached to this node.
   */
  public fun updateGizmos(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.updateGizmosPtr, NIL)
  }

  /**
   * Attach a gizmo to this `Node3D`.
   */
  public fun addGizmo(gizmo: Node3DGizmo): Unit {
    TransferContext.writeArguments(OBJECT to gizmo)
    TransferContext.callMethod(rawPtr, MethodBindings.addGizmoPtr, NIL)
  }

  /**
   * Returns all the gizmos attached to this `Node3D`.
   */
  public fun getGizmos(): VariantArray<Node3DGizmo> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGizmosPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Node3DGizmo>)
  }

  /**
   * Clear all gizmos attached to this `Node3D`.
   */
  public fun clearGizmos(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearGizmosPtr, NIL)
  }

  /**
   * Set subgizmo selection for this node in the editor.
   */
  public fun setSubgizmoSelection(
    gizmo: Node3DGizmo,
    id: Int,
    transform: Transform3D,
  ): Unit {
    TransferContext.writeArguments(OBJECT to gizmo, LONG to id.toLong(), TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.setSubgizmoSelectionPtr, NIL)
  }

  /**
   * Clears subgizmo selection for this node in the editor. Useful when subgizmo IDs become invalid after a property change.
   */
  public fun clearSubgizmoSelection(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearSubgizmoSelectionPtr, NIL)
  }

  /**
   * Returns `true` if the node is present in the [godot.SceneTree], its [visible] property is `true` and all its ancestors are also visible. If any ancestor is hidden, this node will not be visible in the scene tree.
   */
  public fun isVisibleInTree(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isVisibleInTreePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Enables rendering of this node. Changes [visible] to `true`.
   */
  public fun show(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.showPtr, NIL)
  }

  /**
   * Disables rendering of this node. Changes [visible] to `false`.
   */
  public fun hide(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hidePtr, NIL)
  }

  /**
   * Sets whether the node notifies about its local transformation changes. [godot.Node3D] will not propagate this by default.
   */
  public fun setNotifyLocalTransform(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setNotifyLocalTransformPtr, NIL)
  }

  /**
   * Returns whether node notifies about its local transformation changes. [godot.Node3D] will not propagate this by default.
   */
  public fun isLocalTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isLocalTransformNotificationEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets whether the node notifies about its global and local transformation changes. [godot.Node3D] will not propagate this by default, unless it is in the editor context and it has a valid gizmo.
   */
  public fun setNotifyTransform(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setNotifyTransformPtr, NIL)
  }

  /**
   * Returns whether the node notifies about its global and local transformation changes. [godot.Node3D] will not propagate this by default.
   */
  public fun isTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isTransformNotificationEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Rotates the local transformation around axis, a unit [godot.core.Vector3], by specified angle in radians.
   */
  public fun rotate(axis: Vector3, angle: Float): Unit {
    TransferContext.writeArguments(VECTOR3 to axis, DOUBLE to angle.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.rotatePtr, NIL)
  }

  /**
   * Rotates the global (world) transformation around axis, a unit [godot.core.Vector3], by specified angle in radians. The rotation axis is in global coordinate system.
   */
  public fun globalRotate(axis: Vector3, angle: Float): Unit {
    TransferContext.writeArguments(VECTOR3 to axis, DOUBLE to angle.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.globalRotatePtr, NIL)
  }

  /**
   * Scales the global (world) transformation by the given [godot.core.Vector3] scale factors.
   */
  public fun globalScale(scale: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to scale)
    TransferContext.callMethod(rawPtr, MethodBindings.globalScalePtr, NIL)
  }

  /**
   * Moves the global (world) transformation by [godot.core.Vector3] offset. The offset is in global coordinate system.
   */
  public fun globalTranslate(offset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.globalTranslatePtr, NIL)
  }

  /**
   * Rotates the local transformation around axis, a unit [godot.core.Vector3], by specified angle in radians. The rotation axis is in object-local coordinate system.
   */
  public fun rotateObjectLocal(axis: Vector3, angle: Float): Unit {
    TransferContext.writeArguments(VECTOR3 to axis, DOUBLE to angle.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.rotateObjectLocalPtr, NIL)
  }

  /**
   * Scales the local transformation by given 3D scale factors in object-local coordinate system.
   */
  public fun scaleObjectLocal(scale: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to scale)
    TransferContext.callMethod(rawPtr, MethodBindings.scaleObjectLocalPtr, NIL)
  }

  /**
   * Changes the node's position by the given offset [godot.core.Vector3] in local space.
   */
  public fun translateObjectLocal(offset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.translateObjectLocalPtr, NIL)
  }

  /**
   * Rotates the local transformation around the X axis by angle in radians.
   */
  public fun rotateX(angle: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.rotateXPtr, NIL)
  }

  /**
   * Rotates the local transformation around the Y axis by angle in radians.
   */
  public fun rotateY(angle: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.rotateYPtr, NIL)
  }

  /**
   * Rotates the local transformation around the Z axis by angle in radians.
   */
  public fun rotateZ(angle: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.rotateZPtr, NIL)
  }

  /**
   * Changes the node's position by the given offset [godot.core.Vector3].
   *
   * Note that the translation [offset] is affected by the node's scale, so if scaled by e.g. `(10, 1, 1)`, a translation by an offset of `(2, 0, 0)` would actually add 20 (`2 * 10`) to the X coordinate.
   */
  public fun translate(offset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.translatePtr, NIL)
  }

  /**
   * Resets this node's transformations (like scale, skew and taper) preserving its rotation and translation by performing Gram-Schmidt orthonormalization on this node's [godot.Transform3D].
   */
  public fun orthonormalize(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.orthonormalizePtr, NIL)
  }

  /**
   * Reset all transformations for this node (sets its [godot.Transform3D] to the identity matrix).
   */
  public fun setIdentity(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.setIdentityPtr, NIL)
  }

  /**
   * Rotates the node so that the local forward axis (-Z, [godot.Vector3.FORWARD]) points toward the [target] position.
   *
   * The local up axis (+Y) points as close to the [up] vector as possible while staying perpendicular to the local forward axis. The resulting transform is orthogonal, and the scale is preserved. Non-uniform scaling may not work correctly.
   *
   * The [target] position cannot be the same as the node's position, the [up] vector cannot be zero, and the direction from the node's position to the [target] vector cannot be parallel to the [up] vector.
   *
   * Operations take place in global space, which means that the node must be in the scene tree.
   *
   * If [useModelFront] is `true`, the +Z axis (asset front) is treated as forward (implies +X is left) and points toward the [target] position. By default, the -Z axis (camera forward) is treated as forward (implies +X is right).
   */
  @JvmOverloads
  public fun lookAt(
    target: Vector3,
    up: Vector3 = Vector3(0, 1, 0),
    useModelFront: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(VECTOR3 to target, VECTOR3 to up, BOOL to useModelFront)
    TransferContext.callMethod(rawPtr, MethodBindings.lookAtPtr, NIL)
  }

  /**
   * Moves the node to the specified [position], and then rotates the node to point toward the [target] as per [lookAt]. Operations take place in global space.
   */
  @JvmOverloads
  public fun lookAtFromPosition(
    position: Vector3,
    target: Vector3,
    up: Vector3 = Vector3(0, 1, 0),
    useModelFront: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(VECTOR3 to position, VECTOR3 to target, VECTOR3 to up, BOOL to useModelFront)
    TransferContext.callMethod(rawPtr, MethodBindings.lookAtFromPositionPtr, NIL)
  }

  /**
   * Transforms [globalPoint] from world space to this node's local space.
   */
  public fun toLocal(globalPoint: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to globalPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.toLocalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Transforms [localPoint] from this node's local space to world space.
   */
  public fun toGlobal(localPoint: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to localPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.toGlobalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public enum class RotationEditMode(
    id: Long,
  ) {
    /**
     * The rotation is edited using [godot.core.Vector3] Euler angles.
     */
    ROTATION_EDIT_MODE_EULER(0),
    /**
     * The rotation is edited using a [godot.Quaternion].
     */
    ROTATION_EDIT_MODE_QUATERNION(1),
    /**
     * The rotation is edited using a [godot.core.Basis]. In this mode, [scale] can't be edited separately.
     */
    ROTATION_EDIT_MODE_BASIS(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Node3D nodes receives this notification when their global transform changes. This means that either the current or a parent node changed its transform.
     *
     * In order for [NOTIFICATION_TRANSFORM_CHANGED] to work, users first need to ask for it, with [setNotifyTransform]. The notification is also sent if the node is in the editor context and it has at least one valid gizmo.
     */
    public final const val NOTIFICATION_TRANSFORM_CHANGED: Long = 2000

    /**
     * Node3D nodes receives this notification when they are registered to new [godot.World3D] resource.
     */
    public final const val NOTIFICATION_ENTER_WORLD: Long = 41

    /**
     * Node3D nodes receives this notification when they are unregistered from current [godot.World3D] resource.
     */
    public final const val NOTIFICATION_EXIT_WORLD: Long = 42

    /**
     * Node3D nodes receives this notification when their visibility changes.
     */
    public final const val NOTIFICATION_VISIBILITY_CHANGED: Long = 43

    /**
     * Node3D nodes receives this notification when their local transform changes. This is not received when the transform of a parent node is changed.
     *
     * In order for [NOTIFICATION_LOCAL_TRANSFORM_CHANGED] to work, users first need to ask for it, with [setNotifyLocalTransform].
     */
    public final const val NOTIFICATION_LOCAL_TRANSFORM_CHANGED: Long = 44
  }

  internal object MethodBindings {
    public val setTransformPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "set_transform")

    public val getTransformPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "get_transform")

    public val setPositionPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "set_position")

    public val getPositionPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "get_position")

    public val setRotationPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "set_rotation")

    public val getRotationPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "get_rotation")

    public val setRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_rotation_degrees")

    public val getRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_rotation_degrees")

    public val setRotationOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_rotation_order")

    public val getRotationOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_rotation_order")

    public val setRotationEditModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_rotation_edit_mode")

    public val getRotationEditModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_rotation_edit_mode")

    public val setScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "set_scale")

    public val getScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "get_scale")

    public val setQuaternionPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "set_quaternion")

    public val getQuaternionPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "get_quaternion")

    public val setBasisPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "set_basis")

    public val getBasisPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "get_basis")

    public val setGlobalTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_global_transform")

    public val getGlobalTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_global_transform")

    public val setGlobalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_global_position")

    public val getGlobalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_global_position")

    public val setGlobalRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_global_rotation")

    public val getGlobalRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_global_rotation")

    public val setGlobalRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_global_rotation_degrees")

    public val getGlobalRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_global_rotation_degrees")

    public val getParentNode3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_parent_node_3d")

    public val setIgnoreTransformNotificationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_ignore_transform_notification")

    public val setAsTopLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_as_top_level")

    public val isSetAsTopLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "is_set_as_top_level")

    public val setDisableScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_disable_scale")

    public val isScaleDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "is_scale_disabled")

    public val getWorld3dPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "get_world_3d")

    public val forceUpdateTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "force_update_transform")

    public val setVisibilityParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_visibility_parent")

    public val getVisibilityParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "get_visibility_parent")

    public val updateGizmosPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "update_gizmos")

    public val addGizmoPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "add_gizmo")

    public val getGizmosPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "get_gizmos")

    public val clearGizmosPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "clear_gizmos")

    public val setSubgizmoSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_subgizmo_selection")

    public val clearSubgizmoSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "clear_subgizmo_selection")

    public val setVisiblePtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "set_visible")

    public val isVisiblePtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "is_visible")

    public val isVisibleInTreePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "is_visible_in_tree")

    public val showPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "show")

    public val hidePtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "hide")

    public val setNotifyLocalTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_notify_local_transform")

    public val isLocalTransformNotificationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "is_local_transform_notification_enabled")

    public val setNotifyTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "set_notify_transform")

    public val isTransformNotificationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "is_transform_notification_enabled")

    public val rotatePtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "rotate")

    public val globalRotatePtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "global_rotate")

    public val globalScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "global_scale")

    public val globalTranslatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "global_translate")

    public val rotateObjectLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "rotate_object_local")

    public val scaleObjectLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "scale_object_local")

    public val translateObjectLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "translate_object_local")

    public val rotateXPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "rotate_x")

    public val rotateYPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "rotate_y")

    public val rotateZPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "rotate_z")

    public val translatePtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "translate")

    public val orthonormalizePtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "orthonormalize")

    public val setIdentityPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "set_identity")

    public val lookAtPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "look_at")

    public val lookAtFromPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node3D", "look_at_from_position")

    public val toLocalPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "to_local")

    public val toGlobalPtr: VoidPtr = TypeManager.getMethodBindPtr("Node3D", "to_global")
  }
}
