// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * This class can be used to implement custom profilers that are able to interact with the engine
 * and editor debugger.
 * See [EngineDebugger] and [EditorDebuggerPlugin] for more information.
 */
@GodotBaseType
public open class EngineProfiler : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_ENGINEPROFILER, scriptIndex)
  }

  /**
   * Called when the profiler is enabled/disabled, along with a set of [options].
   */
  public open fun _toggle(enable: Boolean, options: VariantArray<Any?>): Unit {
  }

  /**
   * Called when data is added to profiler using [EngineDebugger.profilerAddFrameData].
   */
  public open fun _addFrame(`data`: VariantArray<Any?>): Unit {
  }

  /**
   * Called once every engine iteration when the profiler is active with information about the
   * current frame. All time values are in seconds. Lower values represent faster processing times and
   * are therefore considered better.
   */
  public open fun _tick(
    frameTime: Double,
    processTime: Double,
    physicsTime: Double,
    physicsFrameTime: Double,
  ): Unit {
  }

  public companion object

  internal object MethodBindings
}
