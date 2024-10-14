// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.RID
import godot.internal.reflection.TypeManager
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser._RID
import godot.internal.memory.TransferContext
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Class that has everything pertaining to a 2D world: A physics space, a canvas, and a sound space.
 * 2D nodes register their resources into the current 2D world.
 */
@GodotBaseType
public open class World2D : Resource() {
  /**
   * The [RID] of this world's canvas resource. Used by the [RenderingServer] for 2D drawing.
   */
  public final inline val canvas: RID
    @JvmName("canvasProperty")
    get() = getCanvas()

  /**
   * The [RID] of this world's physics space resource. Used by the [PhysicsServer2D] for 2D physics,
   * treating it as both a space and an area.
   */
  public final inline val space: RID
    @JvmName("spaceProperty")
    get() = getSpace()

  /**
   * The [RID] of this world's navigation map. Used by the [NavigationServer2D].
   */
  public final inline val navigationMap: RID
    @JvmName("navigationMapProperty")
    get() = getNavigationMap()

  /**
   * Direct access to the world's physics 2D space state. Used for querying current and potential
   * collisions. When using multi-threaded physics, access is limited to [Node.PhysicsProcess] in the
   * main thread.
   */
  public final inline val directSpaceState: PhysicsDirectSpaceState2D?
    @JvmName("directSpaceStateProperty")
    get() = getDirectSpaceState()

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_WORLD2D, scriptIndex)
  }

  public final fun getCanvas(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCanvasPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun getSpace(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpacePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun getNavigationMap(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNavigationMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun getDirectSpaceState(): PhysicsDirectSpaceState2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDirectSpaceStatePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as PhysicsDirectSpaceState2D?)
  }

  public companion object

  internal object MethodBindings {
    public val getCanvasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World2D", "get_canvas", 2944877500)

    public val getSpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("World2D", "get_space", 2944877500)

    public val getNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("World2D", "get_navigation_map", 2944877500)

    public val getDirectSpaceStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("World2D", "get_direct_space_state", 2506717822)
  }
}
