// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.LONG
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * [PackedDataContainer] can be used to efficiently store data from untyped containers. The data is
 * packed into raw bytes and can be saved to file. Only [Array] and [Dictionary] can be stored this
 * way.
 * You can retrieve the data by iterating on the container, which will work as if iterating on the
 * packed data itself. If the packed container is a [Dictionary], the data can be retrieved by key
 * names ([String]/[StringName] only).
 * [codeblock]
 * var data = { "key": "value", "another_key": 123, "lock": Vector2() }
 * var packed = PackedDataContainer.new()
 * packed.pack(data)
 * ResourceSaver.save(packed, "packed_data.res")
 * [/codeblock]
 * [codeblock]
 * var container = load("packed_data.res")
 * for key in container:
 *     prints(key, container[key])
 *
 * # Prints:
 * # key value
 * # lock (0, 0)
 * # another_key 123
 * [/codeblock]
 * Nested containers will be packed recursively. While iterating, they will be returned as
 * [PackedDataContainerRef].
 */
@GodotBaseType
public open class PackedDataContainer : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_PACKEDDATACONTAINER, this, scriptIndex)
  }

  /**
   * Packs the given container into a binary representation. The [value] must be either [Array] or
   * [Dictionary], any other type will result in invalid data error.
   * **Note:** Subsequent calls to this method will overwrite the existing data.
   */
  public final fun pack(`value`: Any?): Error {
    TransferContext.writeArguments(ANY to value)
    TransferContext.callMethod(ptr, MethodBindings.packPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the size of the packed container (see [Array.size] and [Dictionary.size]).
   */
  public final fun size(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.sizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val packPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PackedDataContainer", "pack", 966674026)

    public val sizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PackedDataContainer", "size", 3905245786)
  }
}
