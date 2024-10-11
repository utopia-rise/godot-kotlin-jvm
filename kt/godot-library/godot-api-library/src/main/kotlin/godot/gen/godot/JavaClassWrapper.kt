// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic

private const val ENGINE_CLASS_JAVACLASSWRAPPER_INDEX: Int = 26

/**
 * The JavaClassWrapper singleton provides a way for the Godot application to send and receive data
 * through the [url=https://developer.android.com/training/articles/perf-jni]Java Native
 * Interface[/url] (JNI).
 * **Note:** This singleton is only available in Android builds.
 */
@GodotBaseType
public object JavaClassWrapper : Object() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.getSingleton(this, ENGINE_CLASS_JAVACLASSWRAPPER_INDEX)
  }

  /**
   * Wraps a class defined in Java, and returns it as a [JavaClass] [Object] type that Godot can
   * interact with.
   * **Note:** This method only works on Android. On every other platform, this method does nothing
   * and returns an empty [JavaClass].
   */
  @JvmStatic
  public final fun wrap(name: String): JavaClass? {
    Internals.writeArguments(STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.wrapPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as JavaClass?)
  }

  public object MethodBindings {
    internal val wrapPtr: VoidPtr =
        Internals.getMethodBindPtr("JavaClassWrapper", "wrap", 1124367868)
  }
}
