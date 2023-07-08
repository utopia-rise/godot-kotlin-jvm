// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.VariantType.ANY
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Efficiently packs and serializes [godot.Array] or [godot.core.Dictionary].
 *
 * [godot.PackedDataContainer] can be used to efficiently store data from untyped containers. The data is packed into raw bytes and can be saved to file. Only [godot.Array] and [godot.core.Dictionary] can be stored this way.
 *
 * You can retrieve the data by iterating on the container, which will work as if iterating on the packed data itself. If the packed container is a [godot.core.Dictionary], the data can be retrieved by key names ([godot.String]/[godot.StringName] only).
 *
 * ```
 * 		var data = { "key": "value", "another_key": 123, "lock": Vector2() }
 * 		var packed = PackedDataContainer.new()
 * 		packed.pack(data)
 * 		ResourceSaver.save(packed, "packed_data.res")
 * 		```
 *
 * ```
 * 		var container = load("packed_data.res")
 * 		for key in container:
 * 		    prints(key, container[key])
 *
 * 		# Prints:
 * 		# key value
 * 		# lock (0, 0)
 * 		# another_key 123
 * 		```
 *
 * Nested containers will be packed recursively. While iterating, they will be returned as [godot.PackedDataContainerRef].
 */
@GodotBaseType
public open class PackedDataContainer : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PACKEDDATACONTAINER, scriptIndex)
    return true
  }

  /**
   * Packs the given container into a binary representation. The [value] must be either [godot.Array] or [godot.core.Dictionary], any other type will result in invalid data error.
   *
   * **Note:** Subsequent calls to this method will overwrite the existing data.
   */
  public fun pack(`value`: Any): GodotError {
    TransferContext.writeArguments(ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDDATACONTAINER_PACK, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the size of the packed container (see [godot.Array.size] and [godot.Dictionary.size]).
   */
  public fun size(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDDATACONTAINER_SIZE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public companion object
}
