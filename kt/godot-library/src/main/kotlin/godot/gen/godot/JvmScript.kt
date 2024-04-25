// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class JvmScript internal constructor() : Script() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_JVMSCRIPT, scriptIndex)
    return true
  }

  public fun new(vararg __var_args: Any?): Any? {
    TransferContext.writeArguments( *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, MethodBindings.newPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public companion object

  internal object MethodBindings {
    public val newPtr: VoidPtr = TypeManager.getMethodBindPtr("JvmScript", "new")
  }
}
