// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Holds a reference to an [godot.Object]'s instance ID.
 *
 * Utility class which holds a reference to the internal identifier of an [godot.Object] instance, as given by [godot.Object.getInstanceId]. This ID can then be used to retrieve the object instance with [@GlobalScope.instanceFromId].
 *
 * This class is used internally by the editor inspector and script debugger, but can also be used in plugins to pass and display objects as their IDs.
 */
@GodotBaseType
public open class EncodedObjectAsID : RefCounted() {
  /**
   * The [godot.Object] identifier stored in this [godot.EncodedObjectAsID] instance. The object instance can be retrieved with [@GlobalScope.instanceFromId].
   */
  public var objectId: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getObjectIdPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setObjectIdPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ENCODEDOBJECTASID, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setObjectIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EncodedObjectAsID", "set_object_id")

    public val getObjectIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EncodedObjectAsID", "get_object_id")
  }
}
