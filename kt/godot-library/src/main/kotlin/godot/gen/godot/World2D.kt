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
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * A resource that holds all components of a 2D world, such as a canvas and a physics space.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/physics/ray-casting.html]($DOCS_URL/tutorials/physics/ray-casting.html)
 *
 * Class that has everything pertaining to a 2D world: A physics space, a canvas, and a sound space. 2D nodes register their resources into the current 2D world.
 */
@GodotBaseType
public open class World2D : Resource() {
  /**
   * The [RID] of this world's canvas resource. Used by the [godot.RenderingServer] for 2D drawing.
   */
  public val canvas: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCanvasPtr, _RID)
      return (TransferContext.readReturnValue(_RID, false) as RID)
    }

  /**
   * The [RID] of this world's physics space resource. Used by the [godot.PhysicsServer2D] for 2D physics, treating it as both a space and an area.
   */
  public val space: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpacePtr, _RID)
      return (TransferContext.readReturnValue(_RID, false) as RID)
    }

  /**
   * The [RID] of this world's navigation map. Used by the [godot.NavigationServer2D].
   */
  public val navigationMap: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNavigationMapPtr, _RID)
      return (TransferContext.readReturnValue(_RID, false) as RID)
    }

  /**
   * Direct access to the world's physics 2D space state. Used for querying current and potential collisions. When using multi-threaded physics, access is limited to [godot.Node.PhysicsProcess] in the main thread.
   */
  public val directSpaceState: PhysicsDirectSpaceState2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDirectSpaceStatePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectSpaceState2D?)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WORLD2D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val getCanvasPtr: VoidPtr = TypeManager.getMethodBindPtr("World2D", "get_canvas")

    public val getSpacePtr: VoidPtr = TypeManager.getMethodBindPtr("World2D", "get_space")

    public val getNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World2D", "get_navigation_map")

    public val getDirectSpaceStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("World2D", "get_direct_space_state")
  }
}
