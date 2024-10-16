// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantCaster.ANY
import kotlin.Any
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class JvmScript internal constructor() : Script() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_JVMSCRIPT, scriptIndex)
  }

  public final fun new(vararg __var_args: Any?): Any? {
    TransferContext.writeArguments( *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(ptr, MethodBindings.newPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  public companion object

  internal object MethodBindings {
    public val newPtr: VoidPtr = TypeManager.getMethodBindPtr("JvmScript", "new", 1545262638)
  }
}
