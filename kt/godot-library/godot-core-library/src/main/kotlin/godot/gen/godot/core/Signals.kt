@file:Suppress(
    "PackageDirectoryMismatch",
    "NOTHING_TO_INLINE",
    "UNUSED_PARAMETER",
)

package godot.core

import godot.Error
import godot.api.Object
import kotlin.Any
import kotlin.Int
import kotlin.PublishedApi
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmStatic
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KCallable
import kotlin.reflect.KProperty

public class Signal0 @PublishedApi internal constructor(
    instance: Object,
    name: String,
) : Signal(instance, name) {
    public fun emit(): Unit {
        emitSignal()
    }

    public fun <T : Object> connect(
        target: T,
        method: T.() -> Unit,
        flags: Int = 0,
    ): Error = connect(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

    public fun <T : Object> disconnect(target: T, method: T.() -> Unit): Unit =
            disconnect(Callable(target, (method as KCallable<*>).name.toGodotName()))

    public companion object {
        @PublishedApi
        internal val `delegate`: ReadOnlyProperty<Object, Signal0> =
                ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun getValue(thisRef: Object, `property`: KProperty<*>): Signal0 =
                Signal0(thisRef, property.name)

        @JvmStatic
        @JvmName("create")
        public fun javaCreate(`object`: Object, signalName: String): Signal0 =
                Signal0(`object`, signalName)
    }
}

@Suppress("FUNCTION_NAME")
public inline fun Object.Signal0(signalName: String) = Signal0(this, signalName)

public inline fun Object.signal0() = Signal0.delegate

public inline fun Signal0.connect(flags: Int = 0, noinline method: () -> Unit): Error =
        connect(method.asCallable(), flags)

public class Signal1<P0> @PublishedApi internal constructor(
    instance: Object,
    name: String,
) : Signal(instance, name) {
    public fun emit(p0: P0): Unit {
        emitSignal(p0)
    }

    public fun <T : Object> connect(
        target: T,
        method: T.(p0: P0) -> Unit,
        flags: Int = 0,
    ): Error = connect(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

    public fun <T : Object> disconnect(target: T, method: T.(p0: P0) -> Unit): Unit =
            disconnect(Callable(target, (method as KCallable<*>).name.toGodotName()))

    public companion object {
        @PublishedApi
        internal val `delegate`: ReadOnlyProperty<Object, Signal1<Any>> =
                ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0> getValue(thisRef: Object, `property`: KProperty<*>):
                Signal1<P0> = Signal1(thisRef, property.name)

        @JvmStatic
        @JvmName("create")
        public fun <P0> javaCreate(
            `object`: Object,
            signalName: String,
            p0: String,
        ): Signal1<P0> = Signal1(`object`, signalName)
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0> Object.Signal1(signalName: String, p0: String) =
        Signal1<P0>(this, signalName)

@Suppress("UNCHECKED_CAST")
public inline fun <P0> Object.signal1(p0: String) =
        Signal1.delegate as ReadOnlyProperty<Object, Signal1<P0>>

public inline fun <reified P0> Signal1<P0>.connect(flags: Int = 0, noinline
        method: (p0: P0) -> Unit): Error = connect(method.asCallable(), flags)

public class Signal2<P0, P1> @PublishedApi internal constructor(
    instance: Object,
    name: String,
) : Signal(instance, name) {
    public fun emit(p0: P0, p1: P1): Unit {
        emitSignal(p0, p1)
    }

    public fun <T : Object> connect(
        target: T,
        method: T.(p0: P0, p1: P1) -> Unit,
        flags: Int = 0,
    ): Error = connect(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

    public fun <T : Object> disconnect(target: T, method: T.(p0: P0, p1: P1) -> Unit): Unit =
            disconnect(Callable(target, (method as KCallable<*>).name.toGodotName()))

    public companion object {
        @PublishedApi
        internal val `delegate`: ReadOnlyProperty<Object, Signal2<Any, Any>> =
                ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1> getValue(thisRef: Object, `property`: KProperty<*>):
                Signal2<P0, P1> = Signal2(thisRef, property.name)

        @JvmStatic
        @JvmName("create")
        public fun <P0, P1> javaCreate(
            `object`: Object,
            signalName: String,
            p0: String,
            p1: String,
        ): Signal2<P0, P1> = Signal2(`object`, signalName)
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1> Object.Signal2(
    signalName: String,
    p0: String,
    p1: String,
) = Signal2<P0, P1>(this, signalName)

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1> Object.signal2(p0: String, p1: String) =
        Signal2.delegate as ReadOnlyProperty<Object, Signal2<P0, P1>>

public inline fun <reified P0, reified P1> Signal2<P0, P1>.connect(flags: Int = 0, noinline
        method: (p0: P0, p1: P1) -> Unit): Error = connect(method.asCallable(), flags)

public class Signal3<P0, P1, P2> @PublishedApi internal constructor(
    instance: Object,
    name: String,
) : Signal(instance, name) {
    public fun emit(
        p0: P0,
        p1: P1,
        p2: P2,
    ): Unit {
        emitSignal(p0, p1, p2)
    }

    public fun <T : Object> connect(
        target: T,
        method: T.(
            p0: P0,
            p1: P1,
            p2: P2,
        ) -> Unit,
        flags: Int = 0,
    ): Error = connect(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

    public fun <T : Object> disconnect(target: T, method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
    ) -> Unit): Unit = disconnect(Callable(target, (method as KCallable<*>).name.toGodotName()))

    public companion object {
        @PublishedApi
        internal val `delegate`: ReadOnlyProperty<Object, Signal3<Any, Any, Any>> =
                ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2> getValue(thisRef: Object, `property`: KProperty<*>):
                Signal3<P0, P1, P2> = Signal3(thisRef, property.name)

        @JvmStatic
        @JvmName("create")
        public fun <P0, P1, P2> javaCreate(
            `object`: Object,
            signalName: String,
            p0: String,
            p1: String,
            p2: String,
        ): Signal3<P0, P1, P2> = Signal3(`object`, signalName)
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2> Object.Signal3(
    signalName: String,
    p0: String,
    p1: String,
    p2: String,
) = Signal3<P0, P1, P2>(this, signalName)

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2> Object.signal3(
    p0: String,
    p1: String,
    p2: String,
) = Signal3.delegate as ReadOnlyProperty<Object, Signal3<P0, P1, P2>>

public inline fun <reified P0, reified P1, reified P2> Signal3<P0, P1, P2>.connect(flags: Int = 0,
        noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
) -> Unit): Error = connect(method.asCallable(), flags)

public class Signal4<P0, P1, P2, P3> @PublishedApi internal constructor(
    instance: Object,
    name: String,
) : Signal(instance, name) {
    public fun emit(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
    ): Unit {
        emitSignal(p0, p1, p2, p3)
    }

    public fun <T : Object> connect(
        target: T,
        method: T.(
            p0: P0,
            p1: P1,
            p2: P2,
            p3: P3,
        ) -> Unit,
        flags: Int = 0,
    ): Error = connect(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

    public fun <T : Object> disconnect(target: T, method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
    ) -> Unit): Unit = disconnect(Callable(target, (method as KCallable<*>).name.toGodotName()))

    public companion object {
        @PublishedApi
        internal val `delegate`: ReadOnlyProperty<Object, Signal4<Any, Any, Any, Any>> =
                ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3> getValue(thisRef: Object,
                `property`: KProperty<*>): Signal4<P0, P1, P2, P3> = Signal4(thisRef, property.name)

        @JvmStatic
        @JvmName("create")
        public fun <P0, P1, P2, P3> javaCreate(
            `object`: Object,
            signalName: String,
            p0: String,
            p1: String,
            p2: String,
            p3: String,
        ): Signal4<P0, P1, P2, P3> = Signal4(`object`, signalName)
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3> Object.Signal4(
    signalName: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
) = Signal4<P0, P1, P2, P3>(this, signalName)

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3> Object.signal4(
    p0: String,
    p1: String,
    p2: String,
    p3: String,
) = Signal4.delegate as ReadOnlyProperty<Object, Signal4<P0, P1, P2, P3>>

public inline fun <reified P0, reified P1, reified P2, reified P3>
        Signal4<P0, P1, P2, P3>.connect(flags: Int = 0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
) -> Unit): Error = connect(method.asCallable(), flags)

public class Signal5<P0, P1, P2, P3, P4> @PublishedApi internal constructor(
    instance: Object,
    name: String,
) : Signal(instance, name) {
    public fun emit(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
    ): Unit {
        emitSignal(p0, p1, p2, p3, p4)
    }

    public fun <T : Object> connect(
        target: T,
        method: T.(
            p0: P0,
            p1: P1,
            p2: P2,
            p3: P3,
            p4: P4,
        ) -> Unit,
        flags: Int = 0,
    ): Error = connect(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

    public fun <T : Object> disconnect(target: T, method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
    ) -> Unit): Unit = disconnect(Callable(target, (method as KCallable<*>).name.toGodotName()))

    public companion object {
        @PublishedApi
        internal val `delegate`: ReadOnlyProperty<Object, Signal5<Any, Any, Any, Any, Any>> =
                ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4> getValue(thisRef: Object,
                `property`: KProperty<*>): Signal5<P0, P1, P2, P3, P4> =
                Signal5(thisRef, property.name)

        @JvmStatic
        @JvmName("create")
        public fun <P0, P1, P2, P3, P4> javaCreate(
            `object`: Object,
            signalName: String,
            p0: String,
            p1: String,
            p2: String,
            p3: String,
            p4: String,
        ): Signal5<P0, P1, P2, P3, P4> = Signal5(`object`, signalName)
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4> Object.Signal5(
    signalName: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
) = Signal5<P0, P1, P2, P3, P4>(this, signalName)

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4> Object.signal5(
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
) = Signal5.delegate as ReadOnlyProperty<Object, Signal5<P0, P1, P2, P3, P4>>

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4>
        Signal5<P0, P1, P2, P3, P4>.connect(flags: Int = 0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
) -> Unit): Error = connect(method.asCallable(), flags)

public class Signal6<P0, P1, P2, P3, P4, P5> @PublishedApi internal constructor(
    instance: Object,
    name: String,
) : Signal(instance, name) {
    public fun emit(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
    ): Unit {
        emitSignal(p0, p1, p2, p3, p4, p5)
    }

    public fun <T : Object> connect(
        target: T,
        method: T.(
            p0: P0,
            p1: P1,
            p2: P2,
            p3: P3,
            p4: P4,
            p5: P5,
        ) -> Unit,
        flags: Int = 0,
    ): Error = connect(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

    public fun <T : Object> disconnect(target: T, method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
    ) -> Unit): Unit = disconnect(Callable(target, (method as KCallable<*>).name.toGodotName()))

    public companion object {
        @PublishedApi
        internal val `delegate`: ReadOnlyProperty<Object, Signal6<Any, Any, Any, Any, Any, Any>> =
                ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4, P5> getValue(thisRef: Object,
                `property`: KProperty<*>): Signal6<P0, P1, P2, P3, P4, P5> =
                Signal6(thisRef, property.name)

        @JvmStatic
        @JvmName("create")
        public fun <P0, P1, P2, P3, P4, P5> javaCreate(
            `object`: Object,
            signalName: String,
            p0: String,
            p1: String,
            p2: String,
            p3: String,
            p4: String,
            p5: String,
        ): Signal6<P0, P1, P2, P3, P4, P5> = Signal6(`object`, signalName)
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4, P5> Object.Signal6(
    signalName: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
) = Signal6<P0, P1, P2, P3, P4, P5>(this, signalName)

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4, P5> Object.signal6(
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
) = Signal6.delegate as ReadOnlyProperty<Object, Signal6<P0, P1, P2, P3, P4, P5>>

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5>
        Signal6<P0, P1, P2, P3, P4, P5>.connect(flags: Int = 0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
) -> Unit): Error = connect(method.asCallable(), flags)

public class Signal7<P0, P1, P2, P3, P4, P5, P6> @PublishedApi internal constructor(
    instance: Object,
    name: String,
) : Signal(instance, name) {
    public fun emit(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
    ): Unit {
        emitSignal(p0, p1, p2, p3, p4, p5, p6)
    }

    public fun <T : Object> connect(
        target: T,
        method: T.(
            p0: P0,
            p1: P1,
            p2: P2,
            p3: P3,
            p4: P4,
            p5: P5,
            p6: P6,
        ) -> Unit,
        flags: Int = 0,
    ): Error = connect(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

    public fun <T : Object> disconnect(target: T, method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
    ) -> Unit): Unit = disconnect(Callable(target, (method as KCallable<*>).name.toGodotName()))

    public companion object {
        @PublishedApi
        internal val `delegate`:
                ReadOnlyProperty<Object, Signal7<Any, Any, Any, Any, Any, Any, Any>> =
                ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4, P5, P6> getValue(thisRef: Object,
                `property`: KProperty<*>): Signal7<P0, P1, P2, P3, P4, P5, P6> =
                Signal7(thisRef, property.name)

        @JvmStatic
        @JvmName("create")
        public fun <P0, P1, P2, P3, P4, P5, P6> javaCreate(
            `object`: Object,
            signalName: String,
            p0: String,
            p1: String,
            p2: String,
            p3: String,
            p4: String,
            p5: String,
            p6: String,
        ): Signal7<P0, P1, P2, P3, P4, P5, P6> = Signal7(`object`, signalName)
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4, P5, P6> Object.Signal7(
    signalName: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
) = Signal7<P0, P1, P2, P3, P4, P5, P6>(this, signalName)

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4, P5, P6> Object.signal7(
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
) = Signal7.delegate as ReadOnlyProperty<Object, Signal7<P0, P1, P2, P3, P4, P5, P6>>

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6> Signal7<P0, P1, P2, P3, P4, P5, P6>.connect(flags: Int = 0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
) -> Unit): Error = connect(method.asCallable(), flags)

public class Signal8<P0, P1, P2, P3, P4, P5, P6, P7> @PublishedApi internal constructor(
    instance: Object,
    name: String,
) : Signal(instance, name) {
    public fun emit(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
    ): Unit {
        emitSignal(p0, p1, p2, p3, p4, p5, p6, p7)
    }

    public fun <T : Object> connect(
        target: T,
        method: T.(
            p0: P0,
            p1: P1,
            p2: P2,
            p3: P3,
            p4: P4,
            p5: P5,
            p6: P6,
            p7: P7,
        ) -> Unit,
        flags: Int = 0,
    ): Error = connect(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

    public fun <T : Object> disconnect(target: T, method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
    ) -> Unit): Unit = disconnect(Callable(target, (method as KCallable<*>).name.toGodotName()))

    public companion object {
        @PublishedApi
        internal val `delegate`:
                ReadOnlyProperty<Object, Signal8<Any, Any, Any, Any, Any, Any, Any, Any>> =
                ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4, P5, P6, P7> getValue(thisRef: Object,
                `property`: KProperty<*>): Signal8<P0, P1, P2, P3, P4, P5, P6, P7> =
                Signal8(thisRef, property.name)

        @JvmStatic
        @JvmName("create")
        public fun <P0, P1, P2, P3, P4, P5, P6, P7> javaCreate(
            `object`: Object,
            signalName: String,
            p0: String,
            p1: String,
            p2: String,
            p3: String,
            p4: String,
            p5: String,
            p6: String,
            p7: String,
        ): Signal8<P0, P1, P2, P3, P4, P5, P6, P7> = Signal8(`object`, signalName)
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7> Object.Signal8(
    signalName: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
) = Signal8<P0, P1, P2, P3, P4, P5, P6, P7>(this, signalName)

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7> Object.signal8(
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
) = Signal8.delegate as ReadOnlyProperty<Object, Signal8<P0, P1, P2, P3, P4, P5, P6, P7>>

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7> Signal8<P0, P1, P2, P3, P4, P5, P6, P7>.connect(flags: Int = 0, noinline
        method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
) -> Unit): Error = connect(method.asCallable(), flags)

public class Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8> @PublishedApi internal constructor(
    instance: Object,
    name: String,
) : Signal(instance, name) {
    public fun emit(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
    ): Unit {
        emitSignal(p0, p1, p2, p3, p4, p5, p6, p7, p8)
    }

    public fun <T : Object> connect(
        target: T,
        method: T.(
            p0: P0,
            p1: P1,
            p2: P2,
            p3: P3,
            p4: P4,
            p5: P5,
            p6: P6,
            p7: P7,
            p8: P8,
        ) -> Unit,
        flags: Int = 0,
    ): Error = connect(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

    public fun <T : Object> disconnect(target: T, method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
    ) -> Unit): Unit = disconnect(Callable(target, (method as KCallable<*>).name.toGodotName()))

    public companion object {
        @PublishedApi
        internal val `delegate`:
                ReadOnlyProperty<Object, Signal9<Any, Any, Any, Any, Any, Any, Any, Any, Any>> =
                ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4, P5, P6, P7, P8> getValue(thisRef: Object,
                `property`: KProperty<*>): Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8> =
                Signal9(thisRef, property.name)

        @JvmStatic
        @JvmName("create")
        public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8> javaCreate(
            `object`: Object,
            signalName: String,
            p0: String,
            p1: String,
            p2: String,
            p3: String,
            p4: String,
            p5: String,
            p6: String,
            p7: String,
            p8: String,
        ): Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8> = Signal9(`object`, signalName)
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8> Object.Signal9(
    signalName: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
) = Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8>(this, signalName)

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8> Object.signal9(
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
) = Signal9.delegate as ReadOnlyProperty<Object, Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8>>

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8> Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8>.connect(flags: Int =
        0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
) -> Unit): Error = connect(method.asCallable(), flags)

public class Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> @PublishedApi internal constructor(
    instance: Object,
    name: String,
) : Signal(instance, name) {
    public fun emit(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
    ): Unit {
        emitSignal(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)
    }

    public fun <T : Object> connect(
        target: T,
        method: T.(
            p0: P0,
            p1: P1,
            p2: P2,
            p3: P3,
            p4: P4,
            p5: P5,
            p6: P6,
            p7: P7,
            p8: P8,
            p9: P9,
        ) -> Unit,
        flags: Int = 0,
    ): Error = connect(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

    public fun <T : Object> disconnect(target: T, method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
    ) -> Unit): Unit = disconnect(Callable(target, (method as KCallable<*>).name.toGodotName()))

    public companion object {
        @PublishedApi
        internal val `delegate`:
                ReadOnlyProperty<Object, Signal10<Any, Any, Any, Any, Any, Any, Any, Any, Any, Any>>
                = ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>
                getValue(thisRef: Object, `property`: KProperty<*>):
                Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> = Signal10(thisRef, property.name)

        @JvmStatic
        @JvmName("create")
        public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> javaCreate(
            `object`: Object,
            signalName: String,
            p0: String,
            p1: String,
            p2: String,
            p3: String,
            p4: String,
            p5: String,
            p6: String,
            p7: String,
            p8: String,
            p9: String,
        ): Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> = Signal10(`object`, signalName)
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> Object.Signal10(
    signalName: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
    p9: String,
) = Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(this, signalName)

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> Object.signal10(
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
    p9: String,
) = Signal10.delegate as ReadOnlyProperty<Object, Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>>

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8, reified P9>
        Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>.connect(flags: Int = 0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
) -> Unit): Error = connect(method.asCallable(), flags)

public class Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> @PublishedApi internal
        constructor(
    instance: Object,
    name: String,
) : Signal(instance, name) {
    public fun emit(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
    ): Unit {
        emitSignal(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)
    }

    public fun <T : Object> connect(
        target: T,
        method: T.(
            p0: P0,
            p1: P1,
            p2: P2,
            p3: P3,
            p4: P4,
            p5: P5,
            p6: P6,
            p7: P7,
            p8: P8,
            p9: P9,
            p10: P10,
        ) -> Unit,
        flags: Int = 0,
    ): Error = connect(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

    public fun <T : Object> disconnect(target: T, method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
    ) -> Unit): Unit = disconnect(Callable(target, (method as KCallable<*>).name.toGodotName()))

    public companion object {
        @PublishedApi
        internal val `delegate`:
                ReadOnlyProperty<Object, Signal11<Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any>>
                = ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>
                getValue(thisRef: Object, `property`: KProperty<*>):
                Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> =
                Signal11(thisRef, property.name)

        @JvmStatic
        @JvmName("create")
        public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> javaCreate(
            `object`: Object,
            signalName: String,
            p0: String,
            p1: String,
            p2: String,
            p3: String,
            p4: String,
            p5: String,
            p6: String,
            p7: String,
            p8: String,
            p9: String,
            p10: String,
        ): Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> = Signal11(`object`, signalName)
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> Object.Signal11(
    signalName: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
    p9: String,
    p10: String,
) = Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(this, signalName)

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> Object.signal11(
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
    p9: String,
    p10: String,
) =
        Signal11.delegate as ReadOnlyProperty<Object, Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>>

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8, reified P9, reified P10>
        Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>.connect(flags: Int = 0, noinline
        method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
) -> Unit): Error = connect(method.asCallable(), flags)

public class Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> @PublishedApi internal
        constructor(
    instance: Object,
    name: String,
) : Signal(instance, name) {
    public fun emit(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
    ): Unit {
        emitSignal(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)
    }

    public fun <T : Object> connect(
        target: T,
        method: T.(
            p0: P0,
            p1: P1,
            p2: P2,
            p3: P3,
            p4: P4,
            p5: P5,
            p6: P6,
            p7: P7,
            p8: P8,
            p9: P9,
            p10: P10,
            p11: P11,
        ) -> Unit,
        flags: Int = 0,
    ): Error = connect(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

    public fun <T : Object> disconnect(target: T, method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
    ) -> Unit): Unit = disconnect(Callable(target, (method as KCallable<*>).name.toGodotName()))

    public companion object {
        @PublishedApi
        internal val `delegate`:
                ReadOnlyProperty<Object, Signal12<Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any>>
                = ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>
                getValue(thisRef: Object, `property`: KProperty<*>):
                Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> =
                Signal12(thisRef, property.name)

        @JvmStatic
        @JvmName("create")
        public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> javaCreate(
            `object`: Object,
            signalName: String,
            p0: String,
            p1: String,
            p2: String,
            p3: String,
            p4: String,
            p5: String,
            p6: String,
            p7: String,
            p8: String,
            p9: String,
            p10: String,
            p11: String,
        ): Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> =
                Signal12(`object`, signalName)
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> Object.Signal12(
    signalName: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
    p9: String,
    p10: String,
    p11: String,
) = Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(this, signalName)

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> Object.signal12(
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
    p9: String,
    p10: String,
    p11: String,
) =
        Signal12.delegate as ReadOnlyProperty<Object, Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>>

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8, reified P9, reified P10, reified P11>
        Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>.connect(flags: Int = 0, noinline
        method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
) -> Unit): Error = connect(method.asCallable(), flags)

public class Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> @PublishedApi internal
        constructor(
    instance: Object,
    name: String,
) : Signal(instance, name) {
    public fun emit(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
    ): Unit {
        emitSignal(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)
    }

    public fun <T : Object> connect(
        target: T,
        method: T.(
            p0: P0,
            p1: P1,
            p2: P2,
            p3: P3,
            p4: P4,
            p5: P5,
            p6: P6,
            p7: P7,
            p8: P8,
            p9: P9,
            p10: P10,
            p11: P11,
            p12: P12,
        ) -> Unit,
        flags: Int = 0,
    ): Error = connect(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

    public fun <T : Object> disconnect(target: T, method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
    ) -> Unit): Unit = disconnect(Callable(target, (method as KCallable<*>).name.toGodotName()))

    public companion object {
        @PublishedApi
        internal val `delegate`:
                ReadOnlyProperty<Object, Signal13<Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any>>
                = ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>
                getValue(thisRef: Object, `property`: KProperty<*>):
                Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> =
                Signal13(thisRef, property.name)

        @JvmStatic
        @JvmName("create")
        public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> javaCreate(
            `object`: Object,
            signalName: String,
            p0: String,
            p1: String,
            p2: String,
            p3: String,
            p4: String,
            p5: String,
            p6: String,
            p7: String,
            p8: String,
            p9: String,
            p10: String,
            p11: String,
            p12: String,
        ): Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> =
                Signal13(`object`, signalName)
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> Object.Signal13(
    signalName: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
    p9: String,
    p10: String,
    p11: String,
    p12: String,
) = Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(this, signalName)

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> Object.signal13(
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
    p9: String,
    p10: String,
    p11: String,
    p12: String,
) =
        Signal13.delegate as ReadOnlyProperty<Object, Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>>

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12>
        Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>.connect(flags: Int = 0,
        noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
) -> Unit): Error = connect(method.asCallable(), flags)

public class Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> @PublishedApi
        internal constructor(
    instance: Object,
    name: String,
) : Signal(instance, name) {
    public fun emit(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
    ): Unit {
        emitSignal(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)
    }

    public fun <T : Object> connect(
        target: T,
        method: T.(
            p0: P0,
            p1: P1,
            p2: P2,
            p3: P3,
            p4: P4,
            p5: P5,
            p6: P6,
            p7: P7,
            p8: P8,
            p9: P9,
            p10: P10,
            p11: P11,
            p12: P12,
            p13: P13,
        ) -> Unit,
        flags: Int = 0,
    ): Error = connect(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

    public fun <T : Object> disconnect(target: T, method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
    ) -> Unit): Unit = disconnect(Callable(target, (method as KCallable<*>).name.toGodotName()))

    public companion object {
        @PublishedApi
        internal val `delegate`:
                ReadOnlyProperty<Object, Signal14<Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any>>
                = ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>
                getValue(thisRef: Object, `property`: KProperty<*>):
                Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> =
                Signal14(thisRef, property.name)

        @JvmStatic
        @JvmName("create")
        public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> javaCreate(
            `object`: Object,
            signalName: String,
            p0: String,
            p1: String,
            p2: String,
            p3: String,
            p4: String,
            p5: String,
            p6: String,
            p7: String,
            p8: String,
            p9: String,
            p10: String,
            p11: String,
            p12: String,
            p13: String,
        ): Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> =
                Signal14(`object`, signalName)
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> Object.Signal14(
    signalName: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
    p9: String,
    p10: String,
    p11: String,
    p12: String,
    p13: String,
) = Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>(this, signalName)

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> Object.signal14(
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
    p9: String,
    p10: String,
    p11: String,
    p12: String,
    p13: String,
) =
        Signal14.delegate as ReadOnlyProperty<Object, Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>>

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13>
        Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>.connect(flags: Int = 0,
        noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
) -> Unit): Error = connect(method.asCallable(), flags)

public class Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> @PublishedApi
        internal constructor(
    instance: Object,
    name: String,
) : Signal(instance, name) {
    public fun emit(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
    ): Unit {
        emitSignal(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)
    }

    public fun <T : Object> connect(
        target: T,
        method: T.(
            p0: P0,
            p1: P1,
            p2: P2,
            p3: P3,
            p4: P4,
            p5: P5,
            p6: P6,
            p7: P7,
            p8: P8,
            p9: P9,
            p10: P10,
            p11: P11,
            p12: P12,
            p13: P13,
            p14: P14,
        ) -> Unit,
        flags: Int = 0,
    ): Error = connect(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

    public fun <T : Object> disconnect(target: T, method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
    ) -> Unit): Unit = disconnect(Callable(target, (method as KCallable<*>).name.toGodotName()))

    public companion object {
        @PublishedApi
        internal val `delegate`:
                ReadOnlyProperty<Object, Signal15<Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any>>
                = ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>
                getValue(thisRef: Object, `property`: KProperty<*>):
                Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> =
                Signal15(thisRef, property.name)

        @JvmStatic
        @JvmName("create")
        public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> javaCreate(
            `object`: Object,
            signalName: String,
            p0: String,
            p1: String,
            p2: String,
            p3: String,
            p4: String,
            p5: String,
            p6: String,
            p7: String,
            p8: String,
            p9: String,
            p10: String,
            p11: String,
            p12: String,
            p13: String,
            p14: String,
        ): Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> =
                Signal15(`object`, signalName)
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> Object.Signal15(
    signalName: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
    p9: String,
    p10: String,
    p11: String,
    p12: String,
    p13: String,
    p14: String,
) = Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>(this, signalName)

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> Object.signal15(
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
    p9: String,
    p10: String,
    p11: String,
    p12: String,
    p13: String,
    p14: String,
) =
        Signal15.delegate as ReadOnlyProperty<Object, Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>>

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
        reified P14>
        Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>.connect(flags: Int
        = 0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
) -> Unit): Error = connect(method.asCallable(), flags)

public class Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>
        @PublishedApi internal constructor(
    instance: Object,
    name: String,
) : Signal(instance, name) {
    public fun emit(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
    ): Unit {
        emitSignal(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)
    }

    public fun <T : Object> connect(
        target: T,
        method: T.(
            p0: P0,
            p1: P1,
            p2: P2,
            p3: P3,
            p4: P4,
            p5: P5,
            p6: P6,
            p7: P7,
            p8: P8,
            p9: P9,
            p10: P10,
            p11: P11,
            p12: P12,
            p13: P13,
            p14: P14,
            p15: P15,
        ) -> Unit,
        flags: Int = 0,
    ): Error = connect(Callable(target, (method as KCallable<*>).name.toGodotName()), flags)

    public fun <T : Object> disconnect(target: T, method: T.(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
        p6: P6,
        p7: P7,
        p8: P8,
        p9: P9,
        p10: P10,
        p11: P11,
        p12: P12,
        p13: P13,
        p14: P14,
        p15: P15,
    ) -> Unit): Unit = disconnect(Callable(target, (method as KCallable<*>).name.toGodotName()))

    public companion object {
        @PublishedApi
        internal val `delegate`:
                ReadOnlyProperty<Object, Signal16<Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any>>
                = ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14,
                P15> getValue(thisRef: Object, `property`: KProperty<*>):
                Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15> =
                Signal16(thisRef, property.name)

        @JvmStatic
        @JvmName("create")
        public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>
                javaCreate(
            `object`: Object,
            signalName: String,
            p0: String,
            p1: String,
            p2: String,
            p3: String,
            p4: String,
            p5: String,
            p6: String,
            p7: String,
            p8: String,
            p9: String,
            p10: String,
            p11: String,
            p12: String,
            p13: String,
            p14: String,
            p15: String,
        ): Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15> =
                Signal16(`object`, signalName)
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>
        Object.Signal16(
    signalName: String,
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
    p9: String,
    p10: String,
    p11: String,
    p12: String,
    p13: String,
    p14: String,
    p15: String,
) = Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>(this, signalName)

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>
        Object.signal16(
    p0: String,
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    p8: String,
    p9: String,
    p10: String,
    p11: String,
    p12: String,
    p13: String,
    p14: String,
    p15: String,
) =
        Signal16.delegate as ReadOnlyProperty<Object, Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>>

public inline fun <reified P0, reified P1, reified P2, reified P3, reified P4, reified P5, reified
        P6, reified P7, reified P8, reified P9, reified P10, reified P11, reified P12, reified P13,
        reified P14, reified P15>
        Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>.connect(flags: Int
        = 0, noinline method: (
    p0: P0,
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
    p8: P8,
    p9: P9,
    p10: P10,
    p11: P11,
    p12: P12,
    p13: P13,
    p14: P14,
    p15: P15,
) -> Unit): Error = connect(method.asCallable(), flags)
