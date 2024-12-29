// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantCaster.ANY
import godot.newPtr
import kotlin.Any
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINECLASS_GDSCRIPT: Int = 249

/**
 * A script implemented in the GDScript programming language, saved with the `.gd` extension. The
 * script extends the functionality of all objects that instantiate it.
 * Calling [new] creates a new instance of the script. [Object.setScript] extends an existing
 * object, if that object's class matches one of the script's base classes.
 * If you are looking for GDScript's built-in functions, see [@GDScript] instead.
 */
@GodotBaseType
public open class GDScript : Script() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_GDSCRIPT, scriptIndex)
  }

  /**
   * Returns a new instance of the script.
   * For example:
   * [codeblock]
   * var MyClass = load("myclass.gd")
   * var instance = MyClass.new()
   * assert(instance.get_script() == MyClass)
   * [/codeblock]
   */
  public final fun new(vararg __var_args: Any?): Any? {
    TransferContext.writeArguments( *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(ptr, MethodBindings.newPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  public companion object

  public object MethodBindings {
    internal val newPtr: VoidPtr = TypeManager.getMethodBindPtr("GDScript", "new", 1545262638)
  }
}
