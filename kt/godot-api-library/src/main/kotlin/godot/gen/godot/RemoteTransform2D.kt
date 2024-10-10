// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_REMOTETRANSFORM2D_INDEX: Int = 534

/**
 * RemoteTransform2D pushes its own [Transform2D] to another [Node2D] derived node (called the
 * remote node) in the scene.
 * It can be set to update another node's position, rotation and/or scale. It can use either global
 * or local coordinates.
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

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_REMOTETRANSFORM2D_INDEX, scriptIndex)
  }

  public final fun setRemoteNode(path: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to path)
    Internals.callMethod(rawPtr, MethodBindings.setRemoteNodePtr, NIL)
  }

  public final fun getRemoteNode(): NodePath {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRemoteNodePtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * [RemoteTransform2D] caches the remote node. It may not notice if the remote node disappears;
   * [forceUpdateCache] forces it to update the cache again.
   */
  public final fun forceUpdateCache(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.forceUpdateCachePtr, NIL)
  }

  public final fun setUseGlobalCoordinates(useGlobalCoordinates: Boolean): Unit {
    Internals.writeArguments(BOOL to useGlobalCoordinates)
    Internals.callMethod(rawPtr, MethodBindings.setUseGlobalCoordinatesPtr, NIL)
  }

  public final fun getUseGlobalCoordinates(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUseGlobalCoordinatesPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUpdatePosition(updateRemotePosition: Boolean): Unit {
    Internals.writeArguments(BOOL to updateRemotePosition)
    Internals.callMethod(rawPtr, MethodBindings.setUpdatePositionPtr, NIL)
  }

  public final fun getUpdatePosition(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUpdatePositionPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUpdateRotation(updateRemoteRotation: Boolean): Unit {
    Internals.writeArguments(BOOL to updateRemoteRotation)
    Internals.callMethod(rawPtr, MethodBindings.setUpdateRotationPtr, NIL)
  }

  public final fun getUpdateRotation(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUpdateRotationPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUpdateScale(updateRemoteScale: Boolean): Unit {
    Internals.writeArguments(BOOL to updateRemoteScale)
    Internals.callMethod(rawPtr, MethodBindings.setUpdateScalePtr, NIL)
  }

  public final fun getUpdateScale(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUpdateScalePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setRemoteNodePtr: VoidPtr =
        Internals.getMethodBindPtr("RemoteTransform2D", "set_remote_node", 1348162250)

    public val getRemoteNodePtr: VoidPtr =
        Internals.getMethodBindPtr("RemoteTransform2D", "get_remote_node", 4075236667)

    public val forceUpdateCachePtr: VoidPtr =
        Internals.getMethodBindPtr("RemoteTransform2D", "force_update_cache", 3218959716)

    public val setUseGlobalCoordinatesPtr: VoidPtr =
        Internals.getMethodBindPtr("RemoteTransform2D", "set_use_global_coordinates", 2586408642)

    public val getUseGlobalCoordinatesPtr: VoidPtr =
        Internals.getMethodBindPtr("RemoteTransform2D", "get_use_global_coordinates", 36873697)

    public val setUpdatePositionPtr: VoidPtr =
        Internals.getMethodBindPtr("RemoteTransform2D", "set_update_position", 2586408642)

    public val getUpdatePositionPtr: VoidPtr =
        Internals.getMethodBindPtr("RemoteTransform2D", "get_update_position", 36873697)

    public val setUpdateRotationPtr: VoidPtr =
        Internals.getMethodBindPtr("RemoteTransform2D", "set_update_rotation", 2586408642)

    public val getUpdateRotationPtr: VoidPtr =
        Internals.getMethodBindPtr("RemoteTransform2D", "get_update_rotation", 36873697)

    public val setUpdateScalePtr: VoidPtr =
        Internals.getMethodBindPtr("RemoteTransform2D", "set_update_scale", 2586408642)

    public val getUpdateScalePtr: VoidPtr =
        Internals.getMethodBindPtr("RemoteTransform2D", "get_update_scale", 36873697)
  }
}
