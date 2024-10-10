// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantCaster.ANY
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_JVMSCRIPT_INDEX: Int = 341

@GodotBaseType
public open class JvmScript internal constructor() : Script() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_JVMSCRIPT_INDEX, scriptIndex)
  }

  public final fun new(vararg __var_args: Any?): Any? {
    Internals.writeArguments( *__var_args.map { ANY to it }.toTypedArray())
    Internals.callMethod(rawPtr, MethodBindings.newPtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
  }

  public companion object

  internal object MethodBindings {
    public val newPtr: VoidPtr = Internals.getMethodBindPtr("JvmScript", "new", 1545262638)
  }
}
