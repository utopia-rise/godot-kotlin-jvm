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
import godot.wrapPtr
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic

private const val ENGINECLASS_JAVACLASSWRAPPER: Int = 26

/**
 * The JavaClassWrapper singleton provides a way for the Godot application to send and receive data
 * through the [url=https://developer.android.com/training/articles/perf-jni]Java Native
 * Interface[/url] (JNI).
 * **Note:** This singleton is only available in Android builds.
 */
@GodotBaseType
public object JavaClassWrapper : Object() {
  public override fun new(scriptIndex: Int): Unit {
    getSingleton(this, ENGINECLASS_JAVACLASSWRAPPER)
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

  public object MethodBindings {
    internal val wrapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaClassWrapper", "wrap", 1124367868)
  }
}
