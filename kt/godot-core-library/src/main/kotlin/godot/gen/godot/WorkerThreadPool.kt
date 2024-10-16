// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Callable
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.CALLABLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * The [WorkerThreadPool] singleton allocates a set of [Thread]s (called worker threads) on project
 * startup and provides methods for offloading tasks to them. This can be used for simple
 * multithreading without having to create [Thread]s.
 * Tasks hold the [Callable] to be run by the threads. [WorkerThreadPool] can be used to create
 * regular tasks, which will be taken by one worker thread, or group tasks, which can be distributed
 * between multiple worker threads. Group tasks execute the [Callable] multiple times, which makes them
 * useful for iterating over a lot of elements, such as the enemies in an arena.
 * Here's a sample on how to offload an expensive function to worker threads:
 *
 * gdscript:
 * ```gdscript
 * var enemies = [] # An array to be filled with enemies.
 *
 * func process_enemy_ai(enemy_index):
 *     var processed_enemy = enemies[enemy_index]
 *     # Expensive logic...
 *
 * func _process(delta):
 *     var task_id = WorkerThreadPool.add_group_task(process_enemy_ai, enemies.size())
 *     # Other code...
 *     WorkerThreadPool.wait_for_group_task_completion(task_id)
 *     # Other code that depends on the enemy AI already being processed.
 * ```
 * csharp:
 * ```csharp
 * private List<Node> _enemies = new List<Node>(); // A list to be filled with enemies.
 *
 * private void ProcessEnemyAI(int enemyIndex)
 * {
 *     Node processedEnemy = _enemies[enemyIndex];
 *     // Expensive logic here.
 * }
 *
 * public override void _Process(double delta)
 * {
 *     long taskId = WorkerThreadPool.AddGroupTask(Callable.From<int>(ProcessEnemyAI),
 * _enemies.Count);
 *     // Other code...
 *     WorkerThreadPool.WaitForGroupTaskCompletion(taskId);
 *     // Other code that depends on the enemy AI already being processed.
 * }
 * ```
 *
 * The above code relies on the number of elements in the `enemies` array remaining constant during
 * the multithreaded part.
 * **Note:** Using this singleton could affect performance negatively if the task being distributed
 * between threads is not computationally expensive.
 */
@GodotBaseType
public object WorkerThreadPool : Object() {
  public override fun new(scriptIndex: Int): Unit {
    getSingleton(ENGINECLASS_WORKERTHREADPOOL)
  }

  /**
   * Adds [action] as a task to be executed by a worker thread. [highPriority] determines if the
   * task has a high priority or a low priority (default). You can optionally provide a [description]
   * to help with debugging.
   * Returns a task ID that can be used by other methods.
   * **Warning:** Every task must be waited for completion using [waitForTaskCompletion] or
   * [waitForGroupTaskCompletion] at some point so that any allocated resources inside the task can be
   * cleaned up.
   */
  @JvmOverloads
  @JvmStatic
  public final fun addTask(
    action: Callable,
    highPriority: Boolean = false,
    description: String = "",
  ): Long {
    TransferContext.writeArguments(CALLABLE to action, BOOL to highPriority, STRING to description)
    TransferContext.callMethod(ptr, MethodBindings.addTaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the task with the given ID is completed.
   * **Note:** You should only call this method between adding the task and awaiting its completion.
   */
  @JvmStatic
  public final fun isTaskCompleted(taskId: Long): Boolean {
    TransferContext.writeArguments(LONG to taskId)
    TransferContext.callMethod(ptr, MethodBindings.isTaskCompletedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Pauses the thread that calls this method until the task with the given ID is completed.
   * Returns [@GlobalScope.OK] if the task could be successfully awaited.
   * Returns [@GlobalScope.ERR_INVALID_PARAMETER] if a task with the passed ID does not exist (maybe
   * because it was already awaited and disposed of).
   * Returns [@GlobalScope.ERR_BUSY] if the call is made from another running task and, due to task
   * scheduling, there's potential for deadlocking (e.g., the task to await may be at a lower level in
   * the call stack and therefore can't progress). This is an advanced situation that should only
   * matter when some tasks depend on others (in the current implementation, the tricky case is a task
   * trying to wait on an older one).
   */
  @JvmStatic
  public final fun waitForTaskCompletion(taskId: Long): Error {
    TransferContext.writeArguments(LONG to taskId)
    TransferContext.callMethod(ptr, MethodBindings.waitForTaskCompletionPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Adds [action] as a group task to be executed by the worker threads. The [Callable] will be
   * called a number of times based on [elements], with the first thread calling it with the value `0`
   * as a parameter, and each consecutive execution incrementing this value by 1 until it reaches
   * `element - 1`.
   * The number of threads the task is distributed to is defined by [tasksNeeded], where the default
   * value `-1` means it is distributed to all worker threads. [highPriority] determines if the task
   * has a high priority or a low priority (default). You can optionally provide a [description] to
   * help with debugging.
   * Returns a group task ID that can be used by other methods.
   * **Warning:** Every task must be waited for completion using [waitForTaskCompletion] or
   * [waitForGroupTaskCompletion] at some point so that any allocated resources inside the task can be
   * cleaned up.
   */
  @JvmOverloads
  @JvmStatic
  public final fun addGroupTask(
    action: Callable,
    elements: Int,
    tasksNeeded: Int = -1,
    highPriority: Boolean = false,
    description: String = "",
  ): Long {
    TransferContext.writeArguments(CALLABLE to action, LONG to elements.toLong(), LONG to tasksNeeded.toLong(), BOOL to highPriority, STRING to description)
    TransferContext.callMethod(ptr, MethodBindings.addGroupTaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the group task with the given ID is completed.
   * **Note:** You should only call this method between adding the group task and awaiting its
   * completion.
   */
  @JvmStatic
  public final fun isGroupTaskCompleted(groupId: Long): Boolean {
    TransferContext.writeArguments(LONG to groupId)
    TransferContext.callMethod(ptr, MethodBindings.isGroupTaskCompletedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns how many times the [Callable] of the group task with the given ID has already been
   * executed by the worker threads.
   * **Note:** If a thread has started executing the [Callable] but is yet to finish, it won't be
   * counted.
   */
  @JvmStatic
  public final fun getGroupProcessedElementCount(groupId: Long): Long {
    TransferContext.writeArguments(LONG to groupId)
    TransferContext.callMethod(ptr, MethodBindings.getGroupProcessedElementCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Pauses the thread that calls this method until the group task with the given ID is completed.
   */
  @JvmStatic
  public final fun waitForGroupTaskCompletion(groupId: Long): Unit {
    TransferContext.writeArguments(LONG to groupId)
    TransferContext.callMethod(ptr, MethodBindings.waitForGroupTaskCompletionPtr, NIL)
  }

  internal object MethodBindings {
    public val addTaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorkerThreadPool", "add_task", 3745067146)

    public val isTaskCompletedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorkerThreadPool", "is_task_completed", 1116898809)

    public val waitForTaskCompletionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorkerThreadPool", "wait_for_task_completion", 844576869)

    public val addGroupTaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorkerThreadPool", "add_group_task", 1801953219)

    public val isGroupTaskCompletedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorkerThreadPool", "is_group_task_completed", 1116898809)

    public val getGroupProcessedElementCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorkerThreadPool", "get_group_processed_element_count", 923996154)

    public val waitForGroupTaskCompletionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WorkerThreadPool", "wait_for_group_task_completion", 1286410249)
  }
}
