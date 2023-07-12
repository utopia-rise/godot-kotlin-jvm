// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * RemoteTransform3D pushes its own [godot.Transform3D] to another [godot.Node3D] derived Node in the scene.
 *
 * RemoteTransform3D pushes its own [godot.Transform3D] to another [godot.Node3D] derived Node (called the remote node) in the scene.
 *
 * It can be set to update another Node's position, rotation and/or scale. It can use either global or local coordinates.
 */
@GodotBaseType
public open class RemoteTransform3D : Node3D() {
  /**
   * The [godot.core.NodePath] to the remote node, relative to the RemoteTransform3D's position in the scene.
   */
  public var remotePath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REMOTETRANSFORM3D_GET_REMOTE_NODE,
          NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REMOTETRANSFORM3D_SET_REMOTE_NODE,
          NIL)
    }

  /**
   * If `true`, global coordinates are used. If `false`, local coordinates are used.
   */
  public var useGlobalCoordinates: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REMOTETRANSFORM3D_GET_USE_GLOBAL_COORDINATES, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REMOTETRANSFORM3D_SET_USE_GLOBAL_COORDINATES, NIL)
    }

  /**
   * If `true`, the remote node's position is updated.
   */
  public var updatePosition: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REMOTETRANSFORM3D_GET_UPDATE_POSITION, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REMOTETRANSFORM3D_SET_UPDATE_POSITION, NIL)
    }

  /**
   * If `true`, the remote node's rotation is updated.
   */
  public var updateRotation: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REMOTETRANSFORM3D_GET_UPDATE_ROTATION, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REMOTETRANSFORM3D_SET_UPDATE_ROTATION, NIL)
    }

  /**
   * If `true`, the remote node's scale is updated.
   */
  public var updateScale: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REMOTETRANSFORM3D_GET_UPDATE_SCALE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REMOTETRANSFORM3D_SET_UPDATE_SCALE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_REMOTETRANSFORM3D, scriptIndex)
    return true
  }

  /**
   * [godot.RemoteTransform3D] caches the remote node. It may not notice if the remote node disappears; [forceUpdateCache] forces it to update the cache again.
   */
  public fun forceUpdateCache(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_REMOTETRANSFORM3D_FORCE_UPDATE_CACHE, NIL)
  }

  public companion object
}
