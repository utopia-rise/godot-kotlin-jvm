package godot.extensions

import godot.Object
import godot.core.Callable
import godot.core.asStringName
import godot.util.camelToSnakeCase
import kotlin.reflect.KCallable

fun <T : Object> (T.() -> Unit).toCallable(
    target: T
) = Callable(target, (this as KCallable<*>).name.camelToSnakeCase().asStringName())

fun <T : Object, P0> (T.(P0) -> Unit).toCallable(
    target: T
) = Callable(target, (this as KCallable<*>).name.camelToSnakeCase().asStringName())

fun <T : Object, P0, P1> (T.(P0, P1) -> Unit).toCallable(
    target: T
) = Callable(target, (this as KCallable<*>).name.camelToSnakeCase().asStringName())

fun <T : Object, P0, P1, P2> (T.(P0, P1, P2) -> Unit).toCallable(
    target: T
) = Callable(target, (this as KCallable<*>).name.camelToSnakeCase().asStringName())

fun <T : Object, P0, P1, P2, P3> (T.(P0, P1, P2, P3) -> Unit).toCallable(
    target: T
) = Callable(target, (this as KCallable<*>).name.camelToSnakeCase().asStringName())

fun <T : Object, P0, P1, P2, P3, P4> (T.(P0, P1, P2, P3, P4) -> Unit).toCallable(
    target: T
) = Callable(target, (this as KCallable<*>).name.camelToSnakeCase().asStringName())

fun <T : Object, P0, P1, P2, P3, P4, P5> (T.(P0, P1, P2, P3, P4, P5) -> Unit).toCallable(
    target: T
) = Callable(target, (this as KCallable<*>).name.camelToSnakeCase().asStringName())

fun <T : Object, P0, P1, P2, P3, P4, P5, P6> (T.(P0, P1, P2, P3, P4, P5, P6) -> Unit).toCallable(
    target: T
) = Callable(target, (this as KCallable<*>).name.camelToSnakeCase().asStringName())

fun <T : Object, P0, P1, P2, P3, P4, P5, P6, P7> (T.(P0, P1, P2, P3, P4, P5, P6, P7) -> Unit).toCallable(
    target: T
) = Callable(target, (this as KCallable<*>).name.camelToSnakeCase().asStringName())

fun <T : Object, P0, P1, P2, P3, P4, P5, P6, P7, P8> (T.(P0, P1, P2, P3, P4, P5, P6, P7, P8) -> Unit).toCallable(
    target: T
) = Callable(target, (this as KCallable<*>).name.camelToSnakeCase().asStringName())

fun <T : Object, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> (T.(P0, P1, P2, P3, P4, P5, P6, P7, P8, P9) -> Unit).toCallable(
    target: T
) = Callable(target, (this as KCallable<*>).name.camelToSnakeCase().asStringName())
