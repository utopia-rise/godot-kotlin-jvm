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
import godot.core.VariantParser.OBJECT
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Represents an object from the Java Native Interface. It can be returned from Java methods called
 * on [JavaClass] or other [JavaObject]s. See [JavaClassWrapper] for an example.
 *
 * **Note:** This class only works on Android. On any other platform, this class does nothing.
 *
 * **Note:** This class is not to be confused with [JavaScriptObject].
 */
@GodotBaseType
public open class JavaObject : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(325, scriptIndex)
  }

  /**
   * Returns the [JavaClass] that this object is an instance of.
   */
  public final fun getJavaClass(): JavaClass? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getJavaClassPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as JavaClass?)
  }

  public companion object

  public object MethodBindings {
    internal val getJavaClassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaObject", "get_java_class", 541536347)
  }
}
