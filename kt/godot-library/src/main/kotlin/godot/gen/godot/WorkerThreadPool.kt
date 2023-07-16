// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.GodotError
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
import kotlin.jvm.JvmOverloads

/**
 * A singleton that allocates some [godot.Thread]s on startup, used to offload tasks to these threads.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/performance/thread_safe_apis.html]($DOCS_URL/tutorials/performance/thread_safe_apis.html)
 *
 * The [godot.WorkerThreadPool] singleton allocates a set of [godot.Thread]s (called worker threads) on project startup and provides methods for offloading tasks to them. This can be used for simple multithreading without having to create [godot.Thread]s.
 *
 * Tasks hold the [godot.Callable] to be run by the threads. [godot.WorkerThreadPool] can be used to create regular tasks, which will be taken by one worker thread, or group tasks, which can be distributed between multiple worker threads. Group tasks execute the [godot.Callable] multiple times, which makes them useful for iterating over a lot of elements, such as the enemies in an arena.
 *
 * Here's a sample on how to offload an expensive function to worker threads:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var enemies = [] # An array to be filled with enemies.
 *
 *
 *
 * func process_enemy_ai(enemy_index):
 *
 *     var processed_enemy = enemies[enemy_index]
 *
 *     # Expensive logic...
 *
 *
 *
 * func _process(delta):
 *
 *     var task_id = WorkerThreadPool.add_group_task(process_enemy_ai, enemies.size())
 *
 *     # Other code...
 *
 *     WorkerThreadPool.wait_for_group_task_completion(task_id)
 *
 *     # Other code that depends on the enemy AI already being processed.
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * private List<Node> _enemies = new List<Node>(); // A list to be filled with enemies.
 *
 *
 *
 * private void ProcessEnemyAI(int enemyIndex)
 *
 * {
 *
 *     Node processedEnemy = _enemies[enemyIndex];
 *
 *     // Expensive logic here.
 *
 * }
 *
 *
 *
 * public override void _Process(double delta)
 *
 * {
 *
 *     long taskId = WorkerThreadPool.AddGroupTask(Callable.From<int>(ProcessEnemyAI), _enemies.Count);
 *
 *     // Other code...
 *
 *     WorkerThreadPool.WaitForGroupTaskCompletion(taskId);
 *
 *     // Other code that depends on the enemy AI already being processed.
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * The above code relies on the number of elements in the `enemies` array remaining constant during the multithreaded part.
 *
 * **Note:** Using this singleton could affect performance negatively if the task being distributed between threads is not computationally expensive.
 */
@GodotBaseType
public object WorkerThreadPool : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_WORKERTHREADPOOL)
    return false
  }

  /**
   * Adds [action] as a task to be executed by a worker thread. [highPriority] determines if the task has a high priority or a low priority (default). You can optionally provide a [description] to help with debugging.
   *
   * Returns a task ID that can be used by other methods.
   */
  @JvmOverloads
  public fun addTask(
    action: Callable,
    highPriority: Boolean = false,
    description: String = "",
  ): Long {
    TransferContext.writeArguments(CALLABLE to action, BOOL to highPriority, STRING to description)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORKERTHREADPOOL_ADD_TASK, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns `true` if the task with the given ID is completed.
   */
  public fun isTaskCompleted(taskId: Long): Boolean {
    TransferContext.writeArguments(LONG to taskId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORKERTHREADPOOL_IS_TASK_COMPLETED,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Pauses the thread that calls this method until the task with the given ID is completed.
   *
   * Returns [@GlobalScope.OK] if the task could be successfully awaited.
   *
   * Returns [@GlobalScope.ERR_INVALID_PARAMETER] if a task with the passed ID does not exist (maybe because it was already awaited and disposed of).
   *
   * Returns [@GlobalScope.ERR_BUSY] if the call is made from another running task and, due to task scheduling, the task to await is at a lower level in the call stack and therefore can't progress. This is an advanced situation that should only matter when some tasks depend on others.
   */
  public fun waitForTaskCompletion(taskId: Long): GodotError {
    TransferContext.writeArguments(LONG to taskId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WORKERTHREADPOOL_WAIT_FOR_TASK_COMPLETION, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Adds [action] as a group task to be executed by the worker threads. The [godot.Callable] will be called a number of times based on [elements], with the first thread calling it with the value `0` as a parameter, and each consecutive execution incrementing this value by 1 until it reaches `element - 1`.
   *
   * The number of threads the task is distributed to is defined by [tasksNeeded], where the default value `-1` means it is distributed to all worker threads. [highPriority] determines if the task has a high priority or a low priority (default). You can optionally provide a [description] to help with debugging.
   *
   * Returns a group task ID that can be used by other methods.
   */
  @JvmOverloads
  public fun addGroupTask(
    action: Callable,
    elements: Int,
    tasksNeeded: Int = -1,
    highPriority: Boolean = false,
    description: String = "",
  ): Long {
    TransferContext.writeArguments(CALLABLE to action, LONG to elements.toLong(), LONG to tasksNeeded.toLong(), BOOL to highPriority, STRING to description)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORKERTHREADPOOL_ADD_GROUP_TASK,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns `true` if the group task with the given ID is completed.
   */
  public fun isGroupTaskCompleted(groupId: Long): Boolean {
    TransferContext.writeArguments(LONG to groupId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WORKERTHREADPOOL_IS_GROUP_TASK_COMPLETED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns how many times the [godot.Callable] of the group task with the given ID has already been executed by the worker threads.
   *
   * **Note:** If a thread has started executing the [godot.Callable] but is yet to finish, it won't be counted.
   */
  public fun getGroupProcessedElementCount(groupId: Long): Int {
    TransferContext.writeArguments(LONG to groupId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WORKERTHREADPOOL_GET_GROUP_PROCESSED_ELEMENT_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Pauses the thread that calls this method until the group task with the given ID is completed.
   */
  public fun waitForGroupTaskCompletion(groupId: Long): Unit {
    TransferContext.writeArguments(LONG to groupId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WORKERTHREADPOOL_WAIT_FOR_GROUP_TASK_COMPLETION, NIL)
  }
}
