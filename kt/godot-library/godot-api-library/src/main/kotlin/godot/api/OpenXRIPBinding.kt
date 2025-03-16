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
import godot.core.PackedStringArray
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This binding resource binds an [OpenXRAction] to an input or output. As most controllers have
 * left hand and right versions that are handled by the same interaction profile we can specify
 * multiple bindings. For instance an action "Fire" could be bound to both
 * "/user/hand/left/input/trigger" and "/user/hand/right/input/trigger". This would require two binding
 * entries.
 */
@GodotBaseType
public open class OpenXRIPBinding : Resource() {
  /**
   * [OpenXRAction] that is bound to [bindingPath].
   */
  public final inline var action: OpenXRAction?
    @JvmName("actionProperty")
    get() = getAction()
    @JvmName("actionProperty")
    set(`value`) {
      setAction(value)
    }

  /**
   * Binding path that defines the input or output bound to [action].
   *
   * **Note:** Binding paths are suggestions, an XR runtime may choose to bind the action to a
   * different input or output emulating this input or output.
   */
  public final inline var bindingPath: String
    @JvmName("bindingPathProperty")
    get() = getBindingPath()
    @JvmName("bindingPathProperty")
    set(`value`) {
      setBindingPath(value)
    }

  /**
   * Binding modifiers for this binding.
   */
  public final inline var bindingModifiers: VariantArray<Any?>
    @JvmName("bindingModifiersProperty")
    get() = getBindingModifiers()
    @JvmName("bindingModifiersProperty")
    set(`value`) {
      setBindingModifiers(value)
    }

  /**
   * Paths that define the inputs or outputs bound on the device.
   */
  public final inline var paths: PackedStringArray
    @JvmName("pathsProperty")
    get() = getPaths()
    @JvmName("pathsProperty")
    set(`value`) {
      setPaths(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(427, scriptIndex)
  }

  public final fun setAction(action: OpenXRAction?): Unit {
    TransferContext.writeArguments(OBJECT to action)
    TransferContext.callMethod(ptr, MethodBindings.setActionPtr, NIL)
  }

  public final fun getAction(): OpenXRAction? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getActionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as OpenXRAction?)
  }

  public final fun setBindingPath(bindingPath: String): Unit {
    TransferContext.writeArguments(STRING to bindingPath)
    TransferContext.callMethod(ptr, MethodBindings.setBindingPathPtr, NIL)
  }

  public final fun getBindingPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBindingPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Get the number of binding modifiers for this binding.
   */
  public final fun getBindingModifierCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBindingModifierCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Get the [OpenXRBindingModifier] at this index.
   */
  public final fun getBindingModifier(index: Int): OpenXRActionBindingModifier? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBindingModifierPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as OpenXRActionBindingModifier?)
  }

  public final fun setBindingModifiers(bindingModifiers: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to bindingModifiers)
    TransferContext.callMethod(ptr, MethodBindings.setBindingModifiersPtr, NIL)
  }

  public final fun getBindingModifiers(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBindingModifiersPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  public final fun setPaths(paths: PackedStringArray): Unit {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to paths)
    TransferContext.callMethod(ptr, MethodBindings.setPathsPtr, NIL)
  }

  public final fun getPaths(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Get the number of input/output paths in this binding.
   */
  public final fun getPathCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if this input/output path is part of this binding.
   */
  public final fun hasPath(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.hasPathPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Add an input/output path to this binding.
   */
  public final fun addPath(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.addPathPtr, NIL)
  }

  /**
   * Removes this input/output path from this binding.
   */
  public final fun removePath(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.removePathPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val setActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRIPBinding", "set_action", 349361333)

    internal val getActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRIPBinding", "get_action", 4072409085)

    internal val setBindingPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRIPBinding", "set_binding_path", 83702148)

    internal val getBindingPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRIPBinding", "get_binding_path", 201670096)

    internal val getBindingModifierCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRIPBinding", "get_binding_modifier_count", 3905245786)

    internal val getBindingModifierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRIPBinding", "get_binding_modifier", 3538296211)

    internal val setBindingModifiersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRIPBinding", "set_binding_modifiers", 381264803)

    internal val getBindingModifiersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRIPBinding", "get_binding_modifiers", 3995934104)

    internal val setPathsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRIPBinding", "set_paths", 4015028928)

    internal val getPathsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRIPBinding", "get_paths", 1139954409)

    internal val getPathCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRIPBinding", "get_path_count", 3905245786)

    internal val hasPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRIPBinding", "has_path", 3927539163)

    internal val addPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRIPBinding", "add_path", 83702148)

    internal val removePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRIPBinding", "remove_path", 83702148)
  }
}
