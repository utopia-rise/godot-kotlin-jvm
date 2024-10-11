// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Transform2D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.TRANSFORM2D
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_BONE2D_INDEX: Int = 140

/**
 * A hierarchy of [Bone2D]s can be bound to a [Skeleton2D] to control and animate other [Node2D]
 * nodes.
 * You can use [Bone2D] and [Skeleton2D] nodes to animate 2D meshes created with the [Polygon2D] UV
 * editor.
 * Each bone has a [rest] transform that you can reset to with [applyRest]. These rest poses are
 * relative to the bone's parent.
 * If in the editor, you can set the rest pose of an entire skeleton using a menu option, from the
 * code, you need to iterate over the bones to set their individual rest poses.
 */
@GodotBaseType
public open class Bone2D : Node2D() {
  /**
   * Rest transform of the bone. You can reset the node's transforms to this value using
   * [applyRest].
   */
  @CoreTypeLocalCopy
  public final inline var rest: Transform2D
    @JvmName("restProperty")
    get() = getRest()
    @JvmName("restProperty")
    set(`value`) {
      setRest(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_BONE2D_INDEX, scriptIndex)
  }

  /**
   * Rest transform of the bone. You can reset the node's transforms to this value using
   * [applyRest].
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
   * val myCoreType = bone2d.rest
   * //Your changes
   * bone2d.rest = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun restMutate(block: Transform2D.() -> Unit): Transform2D = rest.apply{
      block(this)
      rest = this
  }


  public final fun setRest(rest: Transform2D): Unit {
    Internals.writeArguments(TRANSFORM2D to rest)
    Internals.callMethod(rawPtr, MethodBindings.setRestPtr, NIL)
  }

  public final fun getRest(): Transform2D {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRestPtr, TRANSFORM2D)
    return (Internals.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  /**
   * Resets the bone to the rest pose. This is equivalent to setting [Node2D.transform] to [rest].
   */
  public final fun applyRest(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.applyRestPtr, NIL)
  }

  /**
   * Returns the node's [rest] [Transform2D] if it doesn't have a parent, or its rest pose relative
   * to its parent.
   */
  public final fun getSkeletonRest(): Transform2D {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSkeletonRestPtr, TRANSFORM2D)
    return (Internals.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  /**
   * Returns the node's index as part of the entire skeleton. See [Skeleton2D].
   */
  public final fun getIndexInSkeleton(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getIndexInSkeletonPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * When set to `true`, the [Bone2D] node will attempt to automatically calculate the bone angle
   * and length using the first child [Bone2D] node, if one exists. If none exist, the [Bone2D] cannot
   * automatically calculate these values and will print a warning.
   */
  public final fun setAutocalculateLengthAndAngle(autoCalculate: Boolean): Unit {
    Internals.writeArguments(BOOL to autoCalculate)
    Internals.callMethod(rawPtr, MethodBindings.setAutocalculateLengthAndAnglePtr, NIL)
  }

  /**
   * Returns whether this [Bone2D] is going to autocalculate its length and bone angle using its
   * first [Bone2D] child node, if one exists. If there are no [Bone2D] children, then it cannot
   * autocalculate these values and will print a warning.
   */
  public final fun getAutocalculateLengthAndAngle(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAutocalculateLengthAndAnglePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the length of the bone in the [Bone2D].
   */
  public final fun setLength(length: Float): Unit {
    Internals.writeArguments(DOUBLE to length.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setLengthPtr, NIL)
  }

  /**
   * Returns the length of the bone in the [Bone2D] node.
   */
  public final fun getLength(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLengthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the bone angle for the [Bone2D]. This is typically set to the rotation from the [Bone2D]
   * to a child [Bone2D] node.
   * **Note:** This is different from the [Bone2D]'s rotation. The bone's angle is the rotation of
   * the bone shown by the gizmo, which is unaffected by the [Bone2D]'s [Node2D.transform].
   */
  public final fun setBoneAngle(angle: Float): Unit {
    Internals.writeArguments(DOUBLE to angle.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setBoneAnglePtr, NIL)
  }

  /**
   * Returns the angle of the bone in the [Bone2D].
   * **Note:** This is different from the [Bone2D]'s rotation. The bone's angle is the rotation of
   * the bone shown by the gizmo, which is unaffected by the [Bone2D]'s [Node2D.transform].
   */
  public final fun getBoneAngle(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBoneAnglePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  public object MethodBindings {
    internal val setRestPtr: VoidPtr = Internals.getMethodBindPtr("Bone2D", "set_rest", 2761652528)

    internal val getRestPtr: VoidPtr = Internals.getMethodBindPtr("Bone2D", "get_rest", 3814499831)

    internal val applyRestPtr: VoidPtr =
        Internals.getMethodBindPtr("Bone2D", "apply_rest", 3218959716)

    internal val getSkeletonRestPtr: VoidPtr =
        Internals.getMethodBindPtr("Bone2D", "get_skeleton_rest", 3814499831)

    internal val getIndexInSkeletonPtr: VoidPtr =
        Internals.getMethodBindPtr("Bone2D", "get_index_in_skeleton", 3905245786)

    internal val setAutocalculateLengthAndAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("Bone2D", "set_autocalculate_length_and_angle", 2586408642)

    internal val getAutocalculateLengthAndAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("Bone2D", "get_autocalculate_length_and_angle", 36873697)

    internal val setLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("Bone2D", "set_length", 373806689)

    internal val getLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("Bone2D", "get_length", 1740695150)

    internal val setBoneAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("Bone2D", "set_bone_angle", 373806689)

    internal val getBoneAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("Bone2D", "get_bone_angle", 1740695150)
  }
}
