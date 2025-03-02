// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.AABB
import godot.core.VariantParser.NIL
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This class is used when loading a project that uses a [Mesh] subclass in 2 conditions:
 * - When running the project exported in dedicated server mode, only the texture's dimensions are
 * kept (as they may be relied upon for gameplay purposes or positioning of other elements). This
 * allows reducing the exported PCK's size significantly.
 * - When this subclass is missing due to using a different engine version or build (e.g. modules
 * disabled).
 */
@GodotBaseType
public open class PlaceholderMesh : Mesh() {
  /**
   * The smallest [AABB] enclosing this mesh in local space.
   */
  @CoreTypeLocalCopy
  public final inline var aabb: AABB
    @JvmName("aabbProperty")
    get() = getAabb()
    @JvmName("aabbProperty")
    set(`value`) {
      setAabb(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(504, scriptIndex)
  }

  /**
   * The smallest [AABB] enclosing this mesh in local space.
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
   * val myCoreType = placeholdermesh.aabb
   * //Your changes
   * placeholdermesh.aabb = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun aabbMutate(block: AABB.() -> Unit): AABB = aabb.apply{
      block(this)
      aabb = this
  }


  public final fun setAabb(aabb: AABB): Unit {
    TransferContext.writeArguments(godot.core.VariantParser.AABB to aabb)
    TransferContext.callMethod(ptr, MethodBindings.setAabbPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val setAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PlaceholderMesh", "set_aabb", 259215842)
  }
}
