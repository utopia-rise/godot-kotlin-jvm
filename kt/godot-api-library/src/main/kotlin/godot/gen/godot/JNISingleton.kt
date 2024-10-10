// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.util.Internals
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_JNISINGLETON_INDEX: Int = 333

/**
 * The JNISingleton is implemented only in the Android export. It's used to call methods and connect
 * signals from an Android plugin written in Java or Kotlin. Methods and signals can be called and
 * connected to the JNISingleton as if it is a Node. See
 * [url=https://en.wikipedia.org/wiki/Java_Native_Interface]Java Native Interface - Wikipedia[/url] for
 * more information.
 */
@GodotBaseType
public open class JNISingleton : Object() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_JNISINGLETON_INDEX, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
