// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantCaster.ANY
import kotlin.Any
import kotlin.Int
import kotlin.Suppress

/**
 * A script implemented in the GDScript programming language, saved with the `.gd` extension. The script extends the functionality of all objects that instantiate it.
 *
 * Calling [new] creates a new instance of the script. [Object.setScript] extends an existing object, if that object's class matches one of the script's base classes.
 *
 * If you are looking for GDScript's built-in functions, see [@GDScript] instead.
 */
@GodotBaseType
public open class GDScript : Script() {
  override fun new(scriptIndex: Int) {
    createNativeObject(223, scriptIndex)
  }

  /**
   * Returns a new instance of the script.
   *
   * ```
   * var MyClass = load("myclass.gd")
   * var instance = MyClass.new()
   * print(instance.get_script() == MyClass) # Prints true
   * ```
   */
  public final fun new(vararg args: Any?): Any? {
    TransferContext.writeArguments( *args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(ptr, MethodBindings.newPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  public companion object

  public object MethodBindings {
    internal val newPtr: VoidPtr = TypeManager.getMethodBindPtr("GDScript", "new", 1_545_262_638)
  }
}
