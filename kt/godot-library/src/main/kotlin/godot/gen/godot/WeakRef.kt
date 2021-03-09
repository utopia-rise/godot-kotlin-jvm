// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import kotlin.Any
import kotlin.Suppress

/**
 * Holds an [godot.Object], but does not contribute to the reference count if the object is a reference.
 *
 * A weakref can hold a [godot.Reference], without contributing to the reference counter. A weakref can be created from an [godot.Object] using [@GDScript.weakref]. If this object is not a reference, weakref still works, however, it does not have any effect on the object. Weakrefs are useful in cases where multiple classes have variables that refer to each other. Without weakrefs, using these classes could lead to memory leaks, since both references keep each other from being released. Making part of the variables a weakref can prevent this cyclic dependency, and allows the references to be released.
 */
@GodotBaseType
open class WeakRef : Reference() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_WEAKREF)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Returns the [godot.Object] this weakref is referring to.
   */
  open fun getRef(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEAKREF_GET_REF, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }
}
