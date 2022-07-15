// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * Singleton that connects the engine with Android plugins to interface with native Android code.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/platform/android/android_plugin.html#doc-android-plugin]($DOCS_URL/tutorials/platform/android/android_plugin.html#doc-android-plugin)
 *
 * The JNISingleton is implemented only in the Android export. It's used to call methods and connect signals from an Android plugin written in Java or Kotlin. Methods and signals can be called and connected to the JNISingleton as if it is a Node. See [godot.Java Native Interface - Wikipedia](https://en.wikipedia.org/wiki/Java_Native_Interface) for more information.
 */
@GodotBaseType
public open class JNISingleton : Object() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_JNISINGLETON)
  }

  public companion object
}
