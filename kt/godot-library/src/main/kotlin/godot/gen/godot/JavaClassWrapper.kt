// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.String
import kotlin.Suppress

/**
 *
 */
@GodotBaseType
object JavaClassWrapper : Object() {
  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINESINGLETON_JAVACLASSWRAPPER)

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
