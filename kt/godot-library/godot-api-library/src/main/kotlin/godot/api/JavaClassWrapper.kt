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
import godot.core.VariantParser.STRING
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic

/**
 * The JavaClassWrapper singleton provides a way for the Godot application to send and receive data
 * through the [url=https://developer.android.com/training/articles/perf-jni]Java Native
 * Interface[/url] (JNI).
 * **Note:** This singleton is only available in Android builds.
 * [codeblock]
 * var LocalDateTime = JavaClassWrapper.wrap("java.time.LocalDateTime")
 * var DateTimeFormatter = JavaClassWrapper.wrap("java.time.format.DateTimeFormatter")
 *
 * var datetime = LocalDateTime.now()
 * var formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
 *
 * print(datetime.format(formatter))
 * [/codeblock]
 * **Warning:** When calling Java methods, be sure to check [JavaClassWrapper.getException] to check
 * if the method threw an exception.
 */
@GodotBaseType
public object JavaClassWrapper : Object() {
  public override fun new(scriptIndex: Int): Unit {
    getSingleton(12)
  }

  /**
   * Wraps a class defined in Java, and returns it as a [JavaClass] [Object] type that Godot can
   * interact with.
   * **Note:** This method only works on Android. On every other platform, this method does nothing
   * and returns an empty [JavaClass].
   */
  @JvmStatic
  public final fun wrap(name: String): JavaClass? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.wrapPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as JavaClass?)
  }

  /**
   * Returns the Java exception from the last call into a Java class. If there was no exception, it
   * will return `null`.
   * **Note:** This method only works on Android. On every other platform, this method will always
   * return `null`.
   */
  @JvmStatic
  public final fun getException(): JavaObject? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getExceptionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as JavaObject?)
  }

  public object MethodBindings {
    internal val wrapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaClassWrapper", "wrap", 1124367868)

    internal val getExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaClassWrapper", "get_exception", 3277089691)
  }
}
