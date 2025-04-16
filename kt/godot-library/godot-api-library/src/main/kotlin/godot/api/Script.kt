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
import godot.core.Dictionary
import godot.core.Error
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.asCachedStringName
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * A class stored as a resource. A script extends the functionality of all objects that instantiate
 * it.
 *
 * This is the base class for all scripts and should not be used directly. Trying to create a new
 * script with this class will result in an error.
 *
 * The `new` method of a script subclass creates a new instance. [Object.setScript] extends an
 * existing object, if that object's class matches one of the script's base classes.
 */
@GodotBaseType
public open class Script internal constructor() : Resource() {
  /**
   * The script source code or an empty string if source code is not available. When set, does not
   * reload the class implementation automatically.
   */
  public final inline var sourceCode: String
    @JvmName("sourceCodeProperty")
    get() = getSourceCode()
    @JvmName("sourceCodeProperty")
    set(`value`) {
      setSourceCode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(573, scriptIndex)
  }

  /**
   * Returns `true` if the script can be instantiated.
   */
  public final fun canInstantiate(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.canInstantiatePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if [baseObject] is an instance of this script.
   */
  public final fun instanceHas(baseObject: Object?): Boolean {
    TransferContext.writeArguments(OBJECT to baseObject)
    TransferContext.callMethod(ptr, MethodBindings.instanceHasPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the script contains non-empty source code.
   *
   * **Note:** If a script does not have source code, this does not mean that it is invalid or
   * unusable. For example, a [GDScript] that was exported with binary tokenization has no source code,
   * but still behaves as expected and could be instantiated. This can be checked with
   * [canInstantiate].
   */
  public final fun hasSourceCode(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasSourceCodePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun getSourceCode(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSourceCodePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setSourceCode(source: String): Unit {
    TransferContext.writeArguments(STRING to source)
    TransferContext.callMethod(ptr, MethodBindings.setSourceCodePtr, NIL)
  }

  /**
   * Reloads the script's class implementation. Returns an error code.
   */
  @JvmOverloads
  public final fun reload(keepState: Boolean = false): Error {
    TransferContext.writeArguments(BOOL to keepState)
    TransferContext.callMethod(ptr, MethodBindings.reloadPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the script directly inherited by this script.
   */
  public final fun getBaseScript(): Script? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBaseScriptPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Script?)
  }

  /**
   * Returns the script's base type.
   */
  public final fun getInstanceBaseType(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInstanceBaseTypePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Returns the class name associated with the script, if there is one. Returns an empty string
   * otherwise.
   *
   * To give the script a global name, you can use the `class_name` keyword in GDScript and the
   * `[GlobalClass]` attribute in C#.
   *
   * ```gdscript
   * //gdscript
   * class_name MyNode
   * extends Node
   * ```
   *
   * ```csharp
   * //csharp
   * using Godot;
   *
   * [GlobalClass]
   * public partial class MyNode : Node
   * {
   * }
   * ```
   */
  public final fun getGlobalName(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlobalNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Returns `true` if the script, or a base class, defines a signal with the given name.
   */
  public final fun hasScriptSignal(signalName: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to signalName)
    TransferContext.callMethod(ptr, MethodBindings.hasScriptSignalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the list of properties in this [Script].
   */
  public final fun getScriptPropertyList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getScriptPropertyListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns the list of methods in this [Script].
   */
  public final fun getScriptMethodList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getScriptMethodListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns the list of user signals defined in this [Script].
   */
  public final fun getScriptSignalList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getScriptSignalListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns a dictionary containing constant names and their values.
   */
  public final fun getScriptConstantMap(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getScriptConstantMapPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns the default value of the specified property.
   */
  public final fun getPropertyDefaultValue(`property`: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to property)
    TransferContext.callMethod(ptr, MethodBindings.getPropertyDefaultValuePtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns `true` if the script is a tool script. A tool script can run in the editor.
   */
  public final fun isTool(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isToolPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the script is an abstract script. An abstract script does not have a
   * constructor and cannot be instantiated.
   */
  public final fun isAbstract(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isAbstractPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns a [Dictionary] mapping method names to their RPC configuration defined by this script.
   */
  public final fun getRpcConfig(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRpcConfigPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns `true` if the script, or a base class, defines a signal with the given name.
   */
  public final fun hasScriptSignal(signalName: String): Boolean =
      hasScriptSignal(signalName.asCachedStringName())

  /**
   * Returns the default value of the specified property.
   */
  public final fun getPropertyDefaultValue(`property`: String): Any? =
      getPropertyDefaultValue(property.asCachedStringName())

  public companion object

  public object MethodBindings {
    internal val canInstantiatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "can_instantiate", 36873697)

    internal val instanceHasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "instance_has", 397768994)

    internal val hasSourceCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "has_source_code", 36873697)

    internal val getSourceCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "get_source_code", 201670096)

    internal val setSourceCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "set_source_code", 83702148)

    internal val reloadPtr: VoidPtr = TypeManager.getMethodBindPtr("Script", "reload", 1633102583)

    internal val getBaseScriptPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "get_base_script", 278624046)

    internal val getInstanceBaseTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "get_instance_base_type", 2002593661)

    internal val getGlobalNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "get_global_name", 2002593661)

    internal val hasScriptSignalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "has_script_signal", 2619796661)

    internal val getScriptPropertyListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "get_script_property_list", 2915620761)

    internal val getScriptMethodListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "get_script_method_list", 2915620761)

    internal val getScriptSignalListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "get_script_signal_list", 2915620761)

    internal val getScriptConstantMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "get_script_constant_map", 2382534195)

    internal val getPropertyDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "get_property_default_value", 2138907829)

    internal val isToolPtr: VoidPtr = TypeManager.getMethodBindPtr("Script", "is_tool", 36873697)

    internal val isAbstractPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "is_abstract", 36873697)

    internal val getRpcConfigPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Script", "get_rpc_config", 1214101251)
  }
}
