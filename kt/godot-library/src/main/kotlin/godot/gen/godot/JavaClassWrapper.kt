// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * The JavaClassWrapper singleton provides a way for the Godot application to send and receive data
 * through the [url=https://developer.android.com/training/articles/perf-jni]Java Native
 * Interface[/url] (JNI).
 * **Note:** This singleton is only available in Android builds.
 */
@GodotBaseType
public object JavaClassWrapper : Object() {
  public override fun new(scriptIndex: Int): Unit {
    getSingleton(ENGINECLASS_JAVACLASSWRAPPER)
  }

  /**
   * Wraps a class defined in Java, and returns it as a [JavaClass] [Object] type that Godot can
   * interact with.
   * **Note:** This method only works on Android. On every other platform, this method does nothing
   * and returns an empty [JavaClass].
   */
  public fun wrap(name: String): JavaClass? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.wrapPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as JavaClass?)
  }

  internal object MethodBindings {
    public val wrapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JavaClassWrapper", "wrap", 1124367868)
  }
}
