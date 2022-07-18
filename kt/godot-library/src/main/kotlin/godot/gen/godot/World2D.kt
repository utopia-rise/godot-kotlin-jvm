// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.OBJECT
import godot.core.VariantType._RID
import kotlin.Suppress
import kotlin.Unit

/**
 * Class that has everything pertaining to a 2D world.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/physics/ray-casting.html]($DOCS_URL/tutorials/physics/ray-casting.html)
 *
 * Class that has everything pertaining to a 2D world. A physics space, a visual scenario and a sound space. 2D nodes register their resources into the current 2D world.
 */
@GodotBaseType
public open class World2D : Resource() {
  /**
   * The [RID] of this world's canvas resource. Used by the [godot.RenderingServer] for 2D drawing.
   */
  public val canvas: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD2D_GET_CANVAS, _RID.ordinal)
      return TransferContext.readReturnValue(_RID, false) as RID
    }

  /**
   * The [RID] of this world's physics space resource. Used by the [godot.PhysicsServer2D] for 2D physics, treating it as both a space and an area.
   */
  public val space: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD2D_GET_SPACE, _RID.ordinal)
      return TransferContext.readReturnValue(_RID, false) as RID
    }

  /**
   * The [RID] of this world's navigation map. Used by the [godot.NavigationServer2D].
   */
  public val navigationMap: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD2D_GET_NAVIGATION_MAP,
          _RID.ordinal)
      return TransferContext.readReturnValue(_RID, false) as RID
    }

  /**
   * Direct access to the world's physics 2D space state. Used for querying current and potential collisions. When using multi-threaded physics, access is limited to `_physics_process(delta)` in the main thread.
   */
  public val directSpaceState: PhysicsDirectSpaceState2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLD2D_GET_DIRECT_SPACE_STATE,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as PhysicsDirectSpaceState2D?
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_WORLD2D)
  }

  public companion object
}
