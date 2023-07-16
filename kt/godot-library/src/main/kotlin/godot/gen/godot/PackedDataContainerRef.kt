// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.LONG
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * An internal class used by [godot.PackedDataContainer] to pack nested arrays and dictionaries.
 *
 * When packing nested containers using [godot.PackedDataContainer], they are recursively packed into [godot.PackedDataContainerRef] (only applies to [godot.Array] and [godot.core.Dictionary]). Their data can be retrieved the same way as from [godot.PackedDataContainer].
 *
 * ```
 * 		var packed = PackedDataContainer.new()
 * 		packed.pack([1, 2, 3, ["abc", "def"], 4, 5, 6])
 *
 * 		for element in packed:
 * 		    if element is PackedDataContainerRef:
 * 		        for subelement in element:
 * 		            print("::", subelement)
 * 		    else:
 * 		        print(element)
 *
 * 		# Prints:
 * 		# 1
 * 		# 2
 * 		# 3
 * 		# ::abc
 * 		# ::def
 * 		# 4
 * 		# 5
 * 		# 6
 * 		```
 */
@GodotBaseType
public open class PackedDataContainerRef internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PACKEDDATACONTAINERREF, scriptIndex)
    return true
  }

  /**
   * Returns the size of the packed container (see [godot.Array.size] and [godot.Dictionary.size]).
   */
  public fun size(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDDATACONTAINERREF_SIZE, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object
}
