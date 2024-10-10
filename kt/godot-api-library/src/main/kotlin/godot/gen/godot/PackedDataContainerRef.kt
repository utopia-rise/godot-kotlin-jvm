// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.LONG
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * When packing nested containers using [PackedDataContainer], they are recursively packed into
 * [PackedDataContainerRef] (only applies to [Array] and [Dictionary]). Their data can be retrieved the
 * same way as from [PackedDataContainer].
 * [codeblock]
 * var packed = PackedDataContainer.new()
 * packed.pack([1, 2, 3, ["abc", "def"], 4, 5, 6])
 *
 * for element in packed:
 *     if element is PackedDataContainerRef:
 *         for subelement in element:
 *             print("::", subelement)
 *     else:
 *         print(element)
 *
 * # Prints:
 * # 1
 * # 2
 * # 3
 * # ::abc
 * # ::def
 * # 4
 * # 5
 * # 6
 * [/codeblock]
 */
@GodotBaseType
public open class PackedDataContainerRef internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_PACKEDDATACONTAINERREF_INDEX, scriptIndex)
  }

  /**
   * Returns the size of the packed container (see [Array.size] and [Dictionary.size]).
   */
  public final fun size(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.sizePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val sizePtr: VoidPtr =
        Internals.getMethodBindPtr("PackedDataContainerRef", "size", 3905245786)
  }
}
