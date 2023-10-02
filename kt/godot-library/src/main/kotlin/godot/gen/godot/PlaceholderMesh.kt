// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Placeholder class for a mesh.
 *
 * This class is used when loading a project that uses a [godot.Mesh] subclass in 2 conditions:
 *
 * - When running the project exported in dedicated server mode, only the texture's dimensions are kept (as they may be relied upon for gameplay purposes or positioning of other elements). This allows reducing the exported PCK's size significantly.
 *
 * - When this subclass is missing due to using a different engine version or build (e.g. modules disabled).
 */
@GodotBaseType
public open class PlaceholderMesh : Mesh() {
  /**
   * The smallest [AABB] enclosing this mesh in local space.
   */
  public var aabb: AABB
    @JvmName("getAabb_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getAabb()
    set(`value`) {
      TransferContext.writeArguments(godot.core.VariantType.AABB to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PLACEHOLDERMESH_SET_AABB, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PLACEHOLDERMESH, scriptIndex)
    return true
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
  public open fun aabb(block: AABB.() -> Unit): AABB = aabb.apply{
      block(this)
      aabb = this
  }


  public companion object
}
