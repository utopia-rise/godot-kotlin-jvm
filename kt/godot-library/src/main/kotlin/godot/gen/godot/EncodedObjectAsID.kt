// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.TypeManager
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Utility class which holds a reference to the internal identifier of an [Object] instance, as
 * given by [Object.getInstanceId]. This ID can then be used to retrieve the object instance with
 * [@GlobalScope.instanceFromId].
 * This class is used internally by the editor inspector and script debugger, but can also be used
 * in plugins to pass and display objects as their IDs.
 */
@GodotBaseType
public open class EncodedObjectAsID : RefCounted() {
  /**
   * The [Object] identifier stored in this [EncodedObjectAsID] instance. The object instance can be
   * retrieved with [@GlobalScope.instanceFromId].
   */
  public final inline var objectId: Long
    @JvmName("objectIdProperty")
    get() = getObjectId()
    @JvmName("objectIdProperty")
    set(`value`) {
      setObjectId(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_ENCODEDOBJECTASID, scriptIndex)
  }

  public final fun setObjectId(id: Long): Unit {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(ptr, MethodBindings.setObjectIdPtr, NIL)
  }

  public final fun getObjectId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getObjectIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val setObjectIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EncodedObjectAsID", "set_object_id", 1286410249)

    public val getObjectIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EncodedObjectAsID", "get_object_id", 3905245786)
  }
}
