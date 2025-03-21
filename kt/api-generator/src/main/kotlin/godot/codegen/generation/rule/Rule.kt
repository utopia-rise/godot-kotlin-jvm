package godot.codegen.generation.rule

import godot.codegen.generation.GenerationContext
import godot.codegen.generation.task.GenerationTask

@DslMarker
annotation class RuleMarker

@RuleMarker
abstract class Rule<CONTEXT : Any, TASK : GenerationTask<*>> {

    protected inline fun <T : Any> configure(receiver: T, block: T.() -> Unit) {
        receiver.block()
    }

    abstract fun apply(task: TASK, context: CONTEXT)

    operator fun invoke(block: Rule<CONTEXT, TASK>.() -> Unit) {
        block()
    }
}


@RuleMarker
class RuleSet<CONTEXT : Any, TASK : GenerationTask<*>> : Rule<CONTEXT, TASK>() {
    private val rules = mutableListOf<Pair<TASK.() -> Iterable<GenerationTask<Any>>, Rule<CONTEXT, GenerationTask<Any>>>>()

    @Suppress("UNCHECKED_CAST")

    fun <R : GenerationTask<*>> subRule(
        getter: TASK.() -> Iterable<R>,
        constructor: () -> Rule<CONTEXT, R>,
    ) {
        rules.add(getter as TASK.() -> Iterable<GenerationTask<Any>> to constructor() as Rule<CONTEXT, GenerationTask<Any>>)
    }

    @Suppress("UNCHECKED_CAST")
    fun <R : GenerationTask<*>> subRules(
        getter: TASK.() -> Iterable<R>,
        block: RuleSet<CONTEXT, R>.() -> Unit
    ) {
        val ruleset = RuleSet<CONTEXT, R>()
        ruleset.block()
        rules.add(getter as TASK.() -> Iterable<GenerationTask<Any>> to ruleset as Rule<CONTEXT, GenerationTask<Any>>)
    }

    @Suppress("UNCHECKED_CAST")
    fun rule(block: () -> Rule<CONTEXT, TASK>) {
        val getter: TASK.() -> Iterable<GenerationTask<*>> = { listOf(this) }
        rules.add(getter as TASK.() -> Iterable<GenerationTask<Any>> to block() as Rule<CONTEXT, GenerationTask<Any>>)
    }

    override fun apply(task: TASK, context: CONTEXT) {
        for ((getter, rule) in rules) {
            for (subtask in task.getter()) {
                rule.apply(subtask, context)
            }
        }
    }

    companion object {
        operator fun <CONTEXT : Any, TASK : GenerationTask<*>> invoke(block: RuleSet<CONTEXT, TASK>.() -> Unit) = RuleSet<CONTEXT, TASK>().apply(block)
    }
}

abstract class GodotApiRule<TASK : GenerationTask<*>> : Rule<GenerationContext, TASK>()

@RuleMarker
fun <OUTPUT : Any, CONTEXT : Any, S : GenerationTask<OUTPUT>> S.compile(
    context: CONTEXT, block: RuleSet<CONTEXT, S>.() -> Unit
): OUTPUT {
    val ruleset = RuleSet<CONTEXT, S>()
    ruleset.block()
    ruleset.apply(this, context)
    return execute()
}
