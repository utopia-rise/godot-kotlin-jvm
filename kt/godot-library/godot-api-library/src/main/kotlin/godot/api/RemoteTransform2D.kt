// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.NodePath
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.asCachedNodePath
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * RemoteTransform2D pushes its own [Transform2D] to another [Node2D] derived node (called the remote node) in the scene.
 *
 * It can be set to update another node's position, rotation and/or scale. It can use either global or local coordinates.
 */
@GodotBaseType
public open class RemoteTransform2D : Node2D() {
  /**
   * The [NodePath] to the remote node, relative to the RemoteTransform2D's position in the scene.
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

  override fun new(scriptIndex: Int) {
    createNativeObject(538, scriptIndex)
  }

  public final fun setRemoteNode(path: NodePath) {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.setRemoteNodePtr, NIL)
  }

  public final fun getRemoteNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRemoteNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * [RemoteTransform2D] caches the remote node. It may not notice if the remote node disappears; [forceUpdateCache] forces it to update the cache again.
   */
  public final fun forceUpdateCache() {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.forceUpdateCachePtr, NIL)
  }

  public final fun setUseGlobalCoordinates(useGlobalCoordinates: Boolean) {
    TransferContext.writeArguments(BOOL to useGlobalCoordinates)
    TransferContext.callMethod(ptr, MethodBindings.setUseGlobalCoordinatesPtr, NIL)
  }

  public final fun getUseGlobalCoordinates(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUseGlobalCoordinatesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUpdatePosition(updateRemotePosition: Boolean) {
    TransferContext.writeArguments(BOOL to updateRemotePosition)
    TransferContext.callMethod(ptr, MethodBindings.setUpdatePositionPtr, NIL)
  }

  public final fun getUpdatePosition(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUpdatePositionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUpdateRotation(updateRemoteRotation: Boolean) {
    TransferContext.writeArguments(BOOL to updateRemoteRotation)
    TransferContext.callMethod(ptr, MethodBindings.setUpdateRotationPtr, NIL)
  }

  public final fun getUpdateRotation(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUpdateRotationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUpdateScale(updateRemoteScale: Boolean) {
    TransferContext.writeArguments(BOOL to updateRemoteScale)
    TransferContext.callMethod(ptr, MethodBindings.setUpdateScalePtr, NIL)
  }

  public final fun getUpdateScale(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUpdateScalePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setRemoteNode(path: String): Unit = setRemoteNode(path.asCachedNodePath())

  public companion object

  public object MethodBindings {
    internal val setRemoteNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform2D", "set_remote_node", 1_348_162_250)

    internal val getRemoteNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform2D", "get_remote_node", 4_075_236_667)

    internal val forceUpdateCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform2D", "force_update_cache", 3_218_959_716)

    internal val setUseGlobalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform2D", "set_use_global_coordinates", 2_586_408_642)

    internal val getUseGlobalCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform2D", "get_use_global_coordinates", 36_873_697)

    internal val setUpdatePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform2D", "set_update_position", 2_586_408_642)

    internal val getUpdatePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform2D", "get_update_position", 36_873_697)

    internal val setUpdateRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform2D", "set_update_rotation", 2_586_408_642)

    internal val getUpdateRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform2D", "get_update_rotation", 36_873_697)

    internal val setUpdateScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform2D", "set_update_scale", 2_586_408_642)

    internal val getUpdateScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RemoteTransform2D", "get_update_scale", 36_873_697)
  }
}
