// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.String
import kotlin.Suppress

/**
 * 
 * 
 * 
 */
@GodotBaseType
object JavaClassWrapper : Object() {
  override fun __new() {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_JAVACLASSWRAPPER)
  }

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   *
   */
  fun wrap(name: String): JavaClass? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JAVACLASSWRAPPER_WRAP, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as JavaClass?
  }
}
