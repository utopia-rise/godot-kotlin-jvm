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
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import kotlin.Any
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Represents a class from the Java Native Interface. It is returned from [JavaClassWrapper.wrap].
 * **Note:** This class only works on Android. On any other platform, this class does nothing.
 * **Note:** This class is not to be confused with [JavaScriptObject].
 */
@GodotBaseType
public open class JavaClass : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(316, scriptIndex)
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

  public companion object

  public object MethodBindings {
    internal val getJavaClassNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaClass", "get_java_class_name", 201670096)

    internal val getJavaMethodListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaClass", "get_java_method_list", 3995934104)

    internal val getJavaParentClassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaClass", "get_java_parent_class", 541536347)
  }
}
