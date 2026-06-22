package godot.tests.registration

import godot.annotation.Export
import godot.annotation.IntRange
import godot.annotation.Script
import godot.annotation.Register
import godot.annotation.Visible
import godot.annotation.Emit
import godot.annotation.Rpc
import godot.annotation.Sync
import godot.annotation.Tool
import godot.api.Node
import godot.core.signal1

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Script
@Tool
annotation class InferredRegisteredClass

@Target(AnnotationTarget.FIELD, AnnotationTarget.ANNOTATION_CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Visible
@Export
@IntRange(1, 10)
annotation class InferredExportedIntProperty

@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD, AnnotationTarget.ANNOTATION_CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Emit("value")
annotation class InferredValueSignal

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@Register
@Rpc(sync = Sync.SYNC)
annotation class InferredRpcFunction

@InferredRegisteredClass
class MetaAnnotationRegistration : Node() {
    @InferredExportedIntProperty
    var count = 1

    @InferredValueSignal
    val valueChanged by signal1<Int>()

    @InferredRpcFunction
    fun ping(value: Int): Int = value + count
}


