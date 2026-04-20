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
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.asCachedStringName
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Represents a class from the Java Native Interface. It is returned from [JavaClassWrapper.wrap].
 *
 * **Note:** This class only works on Android. On any other platform, this class does nothing.
 *
 * **Note:** This class is not to be confused with [JavaScriptObject].
 */
@GodotBaseType
public open class JavaClass : RefCounted() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(330, scriptPtr)
  }

  /**
   * Returns the Java class name.
   */
  public final fun getJavaClassName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getJavaClassNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the object's Java methods and their signatures as an [Array] of dictionaries, in the
   * same format as [Object.getMethodList].
   */
  public final fun getJavaMethodList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getJavaMethodListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns a [JavaClass] representing the Java parent class of this class.
   */
  public final fun getJavaParentClass(): JavaClass? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getJavaParentClassPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as JavaClass?)
  }

  /**
   * Returns `true` if the given [method] name exists in the object's Java methods.
   */
  public final fun hasJavaMethod(method: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to method)
    TransferContext.callMethod(ptr, MethodBindings.hasJavaMethodPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the given [method] name exists in the object's Java methods.
   */
  public final fun hasJavaMethod(method: String): Boolean =
      hasJavaMethod(method.asCachedStringName())

  public companion object

  public object MethodBindings {
    internal val getJavaClassNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaClass", "get_java_class_name", 201670096)

    internal val getJavaMethodListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaClass", "get_java_method_list", 3995934104)

    internal val getJavaParentClassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaClass", "get_java_parent_class", 541536347)

    internal val hasJavaMethodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaClass", "has_java_method", 2619796661)
  }
}
