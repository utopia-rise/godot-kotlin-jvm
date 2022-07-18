// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.StringName
import godot.core.TransferContext
import godot.core.Transform3D
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 *
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/523](https://godotengine.org/asset-library/asset/523)
 */
@GodotBaseType
public open class SkeletonIK3D : Node() {
  /**
   *
   */
  public var rootBone: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_ROOT_BONE,
          STRING_NAME.ordinal)
      return TransferContext.readReturnValue(STRING_NAME, false) as StringName
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_ROOT_BONE,
          NIL.ordinal)
    }

  /**
   *
   */
  public var tipBone: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_TIP_BONE,
          STRING_NAME.ordinal)
      return TransferContext.readReturnValue(STRING_NAME, false) as StringName
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_TIP_BONE, NIL.ordinal)
    }

  /**
   *
   */
  public var interpolation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_INTERPOLATION,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_INTERPOLATION,
          NIL.ordinal)
    }

  /**
   *
   */
  public var target: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_TARGET_TRANSFORM,
          TRANSFORM3D.ordinal)
      return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_TARGET_TRANSFORM,
          NIL.ordinal)
    }

  /**
   *
   */
  public var overrideTipBasis: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_IS_OVERRIDE_TIP_BASIS,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_OVERRIDE_TIP_BASIS,
          NIL.ordinal)
    }

  /**
   *
   */
  public var useMagnet: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_IS_USING_MAGNET,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_USE_MAGNET,
          NIL.ordinal)
    }

  /**
   *
   */
  public var magnet: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_MAGNET_POSITION,
          VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_MAGNET_POSITION,
          NIL.ordinal)
    }

  /**
   *
   */
  public var targetNode: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_TARGET_NODE,
          NODE_PATH.ordinal)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_TARGET_NODE,
          NIL.ordinal)
    }

  /**
   *
   */
  public var minDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_MIN_DISTANCE,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_MIN_DISTANCE,
          NIL.ordinal)
    }

  /**
   *
   */
  public var maxIterations: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_MAX_ITERATIONS,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_MAX_ITERATIONS,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SKELETONIK3D)
  }

  /**
   *
   */
  public fun getParentSkeleton(): Skeleton3D? {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_PARENT_SKELETON,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Skeleton3D?
  }

  /**
   *
   */
  public fun isRunning(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_IS_RUNNING, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public fun start(oneTime: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to oneTime)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_START, NIL.ordinal)
  }

  /**
   *
   */
  public fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_STOP, NIL.ordinal)
  }

  public companion object
}
