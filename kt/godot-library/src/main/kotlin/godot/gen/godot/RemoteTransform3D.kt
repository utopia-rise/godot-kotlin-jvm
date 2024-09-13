// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * RemoteTransform3D pushes its own [Transform3D] to another [Node3D] derived Node (called the
 * remote node) in the scene.
 * It can be set to update another Node's position, rotation and/or scale. It can use either global
 * or local coordinates.
 */
@GodotBaseType
public open class RemoteTransform3D : Node3D() {
  /**
   * The [NodePath] to the remote node, relative to the RemoteTransform3D's position in the scene.
   */
  public final inline var remotePath: NodePath
    @JvmName("remotePathProperty")
    get() = getRemoteNode()
    @JvmName("remotePathProperty")
    set(`value`) {
      setRemoteNode(value)
    }

  /**
   * If `true`, global coordinates are used. If `false`, local coordinates are used.
   */
  public final inline var useGlobalCoordinates: Boolean
    @JvmName("useGlobalCoordinatesProperty")
    get() = getUseGlobalCoordinates()
    @JvmName("useGlobalCoordinatesProperty")
    set(`value`) {
      setUseGlobalCoordinates(value)
    }

  /**
   * If `true`, the remote node's position is updated.
   */
  public final inline var updatePosition: Boolean
    @JvmName("updatePositionProperty")
    get() = getUpdatePosition()
    @JvmName("updatePositionProperty")
    set(`value`) {
      setUpdatePosition(value)
    }

  /**
   * If `true`, the remote node's rotation is updated.
   */
  public final inline var updateRotation: Boolean
    @JvmName("updateRotationProperty")
    get() = getUpdateRotation()
    @JvmName("updateRotationProperty")
    set(`value`) {
      setUpdateRotation(value)
    }

  /**
   * If `true`, the remote node's scale is updated.
   */
  public final inline var updateScale: Boolean
    @JvmName("updateScaleProperty")
    get() = getUpdateScale()
    @JvmName("updateScaleProperty")
    set(`value`) {
      setUpdateScale(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_REMOTETRANSFORM3D, scriptIndex)
  }

  public final fun setRemoteNode(path: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, MethodBindings.setRemoteNodePtr, NIL)
  }

  public final fun getRemoteNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRemoteNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * [RemoteTransform3D] caches the remote node. It may not notice if the remote node disappears;
   * [forceUpdateCache] forces it to update the cache again.
   */
  public final fun forceUpdateCache(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.forceUpdateCachePtr, NIL)
  }

  public final fun setUseGlobalCoordinates(useGlobalCoordinates: Boolean): Unit {
    TransferContext.writeArguments(BOOL to useGlobalCoordinates)
    TransferContext.callMethod(rawPtr, MethodBindings.setUseGlobalCoordinatesPtr, NIL)
  }

  public final fun getUseGlobalCoordinates(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUseGlobalCoordinatesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUpdatePosition(updateRemotePosition: Boolean): Unit {
    TransferContext.writeArguments(BOOL to updateRemotePosition)
    TransferContext.callMethod(rawPtr, MethodBindings.setUpdatePositionPtr, NIL)
  }

  public final fun getUpdatePosition(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUpdatePositionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUpdateRotation(updateRemoteRotation: Boolean): Unit {
    TransferContext.writeArguments(BOOL to updateRemoteRotation)
    TransferContext.callMethod(rawPtr, MethodBindings.setUpdateRotationPtr, NIL)
  }

  public final fun getUpdateRotation(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUpdateRotationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUpdateScale(updateRemoteScale: Boolean): Unit {
    TransferContext.writeArguments(BOOL to updateRemoteScale)
    TransferContext.callMethod(rawPtr, MethodBindings.setUpdateScalePtr, NIL)
  }

  public final fun getUpdateScale(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUpdateScalePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setRemoteNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform3D", "set_remote_node", 1348162250)

    public val getRemoteNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform3D", "get_remote_node", 4075236667)

    public val forceUpdateCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform3D", "force_update_cache", 3218959716)

    public val setUseGlobalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform3D", "set_use_global_coordinates", 2586408642)

    public val getUseGlobalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform3D", "get_use_global_coordinates", 36873697)

    public val setUpdatePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform3D", "set_update_position", 2586408642)

    public val getUpdatePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform3D", "get_update_position", 36873697)

    public val setUpdateRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform3D", "set_update_rotation", 2586408642)

    public val getUpdateRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform3D", "get_update_rotation", 36873697)

    public val setUpdateScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform3D", "set_update_scale", 2586408642)

    public val getUpdateScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform3D", "get_update_scale", 36873697)
  }
}
