// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.OBJECT
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * An internal object containing a mapping from a [Skin] used within the context of a particular
 * [MeshInstance3D] to refer to the skeleton's [RID] in the RenderingServer.
 * See also [MeshInstance3D.getSkinReference] and [RenderingServer.instanceAttachSkeleton].
 * Note that despite the similar naming, the skeleton RID used in the [RenderingServer] does not
 * have a direct one-to-one correspondence to a [Skeleton3D] node.
 * In particular, a [Skeleton3D] node with no [MeshInstance3D] children may be unknown to the
 * [RenderingServer].
 * On the other hand, a [Skeleton3D] with multiple [MeshInstance3D] nodes which each have different
 * [MeshInstance3D.skin] objects may have multiple SkinReference instances (and hence, multiple
 * skeleton [RID]s).
 */
@GodotBaseType
public open class SkinReference internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SKINREFERENCE, scriptIndex)
  }

  /**
   * Returns the [RID] owned by this SkinReference, as returned by [RenderingServer.skeletonCreate].
   */
  public final fun getSkeleton(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSkeletonPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the [Skin] connected to this SkinReference. In the case of [MeshInstance3D] with no
   * [MeshInstance3D.skin] assigned, this will reference an internal default [Skin] owned by that
   * [MeshInstance3D].
   * Note that a single [Skin] may have more than one [SkinReference] in the case that it is shared
   * by meshes across multiple [Skeleton3D] nodes.
   */
  public final fun getSkin(): Skin? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSkinPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Skin?)
  }

  public companion object

  internal object MethodBindings {
    public val getSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkinReference", "get_skeleton", 2944877500)

    public val getSkinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkinReference", "get_skin", 2074563878)
  }
}
