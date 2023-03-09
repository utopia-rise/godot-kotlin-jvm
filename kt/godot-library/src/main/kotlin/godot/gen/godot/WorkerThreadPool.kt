// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public object WorkerThreadPool : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_WORKERTHREADPOOL)
    return false
  }

  /**
   *
   */
  public fun addTask(
    action: Callable,
    highPriority: Boolean = false,
    description: String = "",
  ): Long {
    TransferContext.writeArguments(CALLABLE to action, BOOL to highPriority, STRING to description)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORKERTHREADPOOL_ADD_TASK, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun isTaskCompleted(taskId: Long): Boolean {
    TransferContext.writeArguments(LONG to taskId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORKERTHREADPOOL_IS_TASK_COMPLETED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public fun waitForTaskCompletion(taskId: Long): Unit {
    TransferContext.writeArguments(LONG to taskId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WORKERTHREADPOOL_WAIT_FOR_TASK_COMPLETION, NIL)
  }

  /**
   *
   */
  public fun addGroupTask(
    action: Callable,
    elements: Long,
    tasksNeeded: Long = -1,
    highPriority: Boolean = false,
    description: String = "",
  ): Long {
    TransferContext.writeArguments(CALLABLE to action, LONG to elements, LONG to tasksNeeded, BOOL to highPriority, STRING to description)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORKERTHREADPOOL_ADD_GROUP_TASK,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun isGroupTaskCompleted(groupId: Long): Boolean {
    TransferContext.writeArguments(LONG to groupId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WORKERTHREADPOOL_IS_GROUP_TASK_COMPLETED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public fun getGroupProcessedElementCount(groupId: Long): Long {
    TransferContext.writeArguments(LONG to groupId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WORKERTHREADPOOL_GET_GROUP_PROCESSED_ELEMENT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun waitForGroupTaskCompletion(groupId: Long): Unit {
    TransferContext.writeArguments(LONG to groupId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WORKERTHREADPOOL_WAIT_FOR_GROUP_TASK_COMPLETION, NIL)
  }
}
