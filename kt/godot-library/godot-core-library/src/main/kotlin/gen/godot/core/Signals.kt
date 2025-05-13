@file:Suppress(
    "PackageDirectoryMismatch",
    "NOTHING_TO_INLINE",
    "UNUSED_PARAMETER",
    "unused",
)

package godot.core

import godot.api.Object
import kotlin.Any
import kotlin.PublishedApi
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

public class Signal0 @PublishedApi internal constructor(
    instance: Object,
    name: StringName,
) : Signal(instance, name) {
    public fun emit(): Unit {
        emitUnsafe()
    }

    public fun connect(callable: Callable0<*>, flags: Object.ConnectFlags =
            Object.ConnectFlags.DEFAULT): Unit {
        connectUnsafe(callable, flags)
    }

    public fun disconnect(callable: Callable0<*>): Unit {
        disconnectUnsafe(callable)
    }

    public companion object {
        @PublishedApi
        internal val `delegate`: ReadOnlyProperty<Object, Signal0> =
                ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun getValue(thisRef: Object, `property`: KProperty<*>): Signal0 =
                Signal0(thisRef, property.toGodotName())

        @JvmStatic
        public fun create(godotObject: Object, signalName: String): Signal0 =
                Signal0(godotObject, signalName.toGodotName())
    }
}

@Suppress("FUNCTION_NAME")
public inline fun Object.Signal0(signalName: String) = Signal0(this, signalName.toGodotName())

public inline fun Object.signal0() = Signal0.delegate

public class Signal1<P0> @PublishedApi internal constructor(
    instance: Object,
    name: StringName,
) : Signal(instance, name) {
    public fun emit(p0: P0): Unit {
        emitUnsafe(p0)
    }

    public fun connect(callable: Callable1<*, P0>, flags: Object.ConnectFlags =
            Object.ConnectFlags.DEFAULT): Unit {
        connectUnsafe(callable, flags)
    }

    public fun disconnect(callable: Callable1<*, P0>): Unit {
        disconnectUnsafe(callable)
    }

    public companion object {
        @PublishedApi
        internal val `delegate`: ReadOnlyProperty<Object, Signal1<Any>> =
                ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0> getValue(thisRef: Object, `property`: KProperty<*>):
                Signal1<P0> = Signal1(thisRef, property.toGodotName())

        @JvmStatic
        public fun <P0> create(godotObject: Object, signalName: String): Signal1<P0> =
                Signal1(godotObject, signalName.toGodotName())
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0> Object.Signal1(signalName: String) =
        Signal1<P0>(this, signalName.toGodotName())

@Suppress("UNCHECKED_CAST")
public inline fun <P0> Object.signal1() = Signal1.delegate as ReadOnlyProperty<Object, Signal1<P0>>

public class Signal2<P0, P1> @PublishedApi internal constructor(
    instance: Object,
    name: StringName,
) : Signal(instance, name) {
    public fun emit(p0: P0, p1: P1): Unit {
        emitUnsafe(p0, p1)
    }

    public fun connect(callable: Callable2<*, P0, P1>, flags: Object.ConnectFlags =
            Object.ConnectFlags.DEFAULT): Unit {
        connectUnsafe(callable, flags)
    }

    public fun disconnect(callable: Callable2<*, P0, P1>): Unit {
        disconnectUnsafe(callable)
    }

    public companion object {
        @PublishedApi
        internal val `delegate`: ReadOnlyProperty<Object, Signal2<Any, Any>> =
                ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1> getValue(thisRef: Object, `property`: KProperty<*>):
                Signal2<P0, P1> = Signal2(thisRef, property.toGodotName())

        @JvmStatic
        public fun <P0, P1> create(godotObject: Object, signalName: String): Signal2<P0, P1> =
                Signal2(godotObject, signalName.toGodotName())
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1> Object.Signal2(signalName: String) =
        Signal2<P0, P1>(this, signalName.toGodotName())

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1> Object.signal2() =
        Signal2.delegate as ReadOnlyProperty<Object, Signal2<P0, P1>>

public class Signal3<P0, P1, P2> @PublishedApi internal constructor(
    instance: Object,
    name: StringName,
) : Signal(instance, name) {
    public fun emit(
        p0: P0,
        p1: P1,
        p2: P2,
    ): Unit {
        emitUnsafe(p0, p1, p2)
    }

    public fun connect(callable: Callable3<*, P0, P1, P2>, flags: Object.ConnectFlags =
            Object.ConnectFlags.DEFAULT): Unit {
        connectUnsafe(callable, flags)
    }

    public fun disconnect(callable: Callable3<*, P0, P1, P2>): Unit {
        disconnectUnsafe(callable)
    }

    public companion object {
        @PublishedApi
        internal val `delegate`: ReadOnlyProperty<Object, Signal3<Any, Any, Any>> =
                ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2> getValue(thisRef: Object, `property`: KProperty<*>):
                Signal3<P0, P1, P2> = Signal3(thisRef, property.toGodotName())

        @JvmStatic
        public fun <P0, P1, P2> create(godotObject: Object, signalName: String): Signal3<P0, P1, P2>
                = Signal3(godotObject, signalName.toGodotName())
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2> Object.Signal3(signalName: String) =
        Signal3<P0, P1, P2>(this, signalName.toGodotName())

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2> Object.signal3() =
        Signal3.delegate as ReadOnlyProperty<Object, Signal3<P0, P1, P2>>

public class Signal4<P0, P1, P2, P3> @PublishedApi internal constructor(
    instance: Object,
    name: StringName,
) : Signal(instance, name) {
    public fun emit(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
    ): Unit {
        emitUnsafe(p0, p1, p2, p3)
    }

    public fun connect(callable: Callable4<*, P0, P1, P2, P3>, flags: Object.ConnectFlags =
            Object.ConnectFlags.DEFAULT): Unit {
        connectUnsafe(callable, flags)
    }

    public fun disconnect(callable: Callable4<*, P0, P1, P2, P3>): Unit {
        disconnectUnsafe(callable)
    }

    public companion object {
        @PublishedApi
        internal val `delegate`: ReadOnlyProperty<Object, Signal4<Any, Any, Any, Any>> =
                ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3> getValue(thisRef: Object,
                `property`: KProperty<*>): Signal4<P0, P1, P2, P3> =
                Signal4(thisRef, property.toGodotName())

        @JvmStatic
        public fun <P0, P1, P2, P3> create(godotObject: Object, signalName: String):
                Signal4<P0, P1, P2, P3> = Signal4(godotObject, signalName.toGodotName())
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3> Object.Signal4(signalName: String) =
        Signal4<P0, P1, P2, P3>(this, signalName.toGodotName())

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3> Object.signal4() =
        Signal4.delegate as ReadOnlyProperty<Object, Signal4<P0, P1, P2, P3>>

public class Signal5<P0, P1, P2, P3, P4> @PublishedApi internal constructor(
    instance: Object,
    name: StringName,
) : Signal(instance, name) {
    public fun emit(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
    ): Unit {
        emitUnsafe(p0, p1, p2, p3, p4)
    }

    public fun connect(callable: Callable5<*, P0, P1, P2, P3, P4>, flags: Object.ConnectFlags =
            Object.ConnectFlags.DEFAULT): Unit {
        connectUnsafe(callable, flags)
    }

    public fun disconnect(callable: Callable5<*, P0, P1, P2, P3, P4>): Unit {
        disconnectUnsafe(callable)
    }

    public companion object {
        @PublishedApi
        internal val `delegate`: ReadOnlyProperty<Object, Signal5<Any, Any, Any, Any, Any>> =
                ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4> getValue(thisRef: Object,
                `property`: KProperty<*>): Signal5<P0, P1, P2, P3, P4> =
                Signal5(thisRef, property.toGodotName())

        @JvmStatic
        public fun <P0, P1, P2, P3, P4> create(godotObject: Object, signalName: String):
                Signal5<P0, P1, P2, P3, P4> = Signal5(godotObject, signalName.toGodotName())
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4> Object.Signal5(signalName: String) =
        Signal5<P0, P1, P2, P3, P4>(this, signalName.toGodotName())

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4> Object.signal5() =
        Signal5.delegate as ReadOnlyProperty<Object, Signal5<P0, P1, P2, P3, P4>>

public class Signal6<P0, P1, P2, P3, P4, P5> @PublishedApi internal constructor(
    instance: Object,
    name: StringName,
) : Signal(instance, name) {
    public fun emit(
        p0: P0,
        p1: P1,
        p2: P2,
        p3: P3,
        p4: P4,
        p5: P5,
    ): Unit {
        emitUnsafe(p0, p1, p2, p3, p4, p5)
    }

    public fun connect(callable: Callable6<*, P0, P1, P2, P3, P4, P5>, flags: Object.ConnectFlags =
            Object.ConnectFlags.DEFAULT): Unit {
        connectUnsafe(callable, flags)
    }

    public fun disconnect(callable: Callable6<*, P0, P1, P2, P3, P4, P5>): Unit {
        disconnectUnsafe(callable)
    }

    public companion object {
        @PublishedApi
        internal val `delegate`: ReadOnlyProperty<Object, Signal6<Any, Any, Any, Any, Any, Any>> =
                ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4, P5> getValue(thisRef: Object,
                `property`: KProperty<*>): Signal6<P0, P1, P2, P3, P4, P5> =
                Signal6(thisRef, property.toGodotName())

        @JvmStatic
        public fun <P0, P1, P2, P3, P4, P5> create(godotObject: Object, signalName: String):
                Signal6<P0, P1, P2, P3, P4, P5> = Signal6(godotObject, signalName.toGodotName())
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4, P5> Object.Signal6(signalName: String) =
        Signal6<P0, P1, P2, P3, P4, P5>(this, signalName.toGodotName())

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4, P5> Object.signal6() =
        Signal6.delegate as ReadOnlyProperty<Object, Signal6<P0, P1, P2, P3, P4, P5>>

public class Signal7<P0, P1, P2, P3, P4, P5, P6> @PublishedApi internal constructor(
    instance: Object,
    name: StringName,
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
        emitUnsafe(p0, p1, p2, p3, p4, p5, p6)
    }

    public fun connect(callable: Callable7<*, P0, P1, P2, P3, P4, P5, P6>,
            flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT): Unit {
        connectUnsafe(callable, flags)
    }

    public fun disconnect(callable: Callable7<*, P0, P1, P2, P3, P4, P5, P6>): Unit {
        disconnectUnsafe(callable)
    }

    public companion object {
        @PublishedApi
        internal val `delegate`:
                ReadOnlyProperty<Object, Signal7<Any, Any, Any, Any, Any, Any, Any>> =
                ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4, P5, P6> getValue(thisRef: Object,
                `property`: KProperty<*>): Signal7<P0, P1, P2, P3, P4, P5, P6> =
                Signal7(thisRef, property.toGodotName())

        @JvmStatic
        public fun <P0, P1, P2, P3, P4, P5, P6> create(godotObject: Object, signalName: String):
                Signal7<P0, P1, P2, P3, P4, P5, P6> = Signal7(godotObject, signalName.toGodotName())
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4, P5, P6> Object.Signal7(signalName: String) =
        Signal7<P0, P1, P2, P3, P4, P5, P6>(this, signalName.toGodotName())

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4, P5, P6> Object.signal7() =
        Signal7.delegate as ReadOnlyProperty<Object, Signal7<P0, P1, P2, P3, P4, P5, P6>>

public class Signal8<P0, P1, P2, P3, P4, P5, P6, P7> @PublishedApi internal constructor(
    instance: Object,
    name: StringName,
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
        emitUnsafe(p0, p1, p2, p3, p4, p5, p6, p7)
    }

    public fun connect(callable: Callable8<*, P0, P1, P2, P3, P4, P5, P6, P7>,
            flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT): Unit {
        connectUnsafe(callable, flags)
    }

    public fun disconnect(callable: Callable8<*, P0, P1, P2, P3, P4, P5, P6, P7>): Unit {
        disconnectUnsafe(callable)
    }

    public companion object {
        @PublishedApi
        internal val `delegate`:
                ReadOnlyProperty<Object, Signal8<Any, Any, Any, Any, Any, Any, Any, Any>> =
                ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4, P5, P6, P7> getValue(thisRef: Object,
                `property`: KProperty<*>): Signal8<P0, P1, P2, P3, P4, P5, P6, P7> =
                Signal8(thisRef, property.toGodotName())

        @JvmStatic
        public fun <P0, P1, P2, P3, P4, P5, P6, P7> create(godotObject: Object, signalName: String):
                Signal8<P0, P1, P2, P3, P4, P5, P6, P7> =
                Signal8(godotObject, signalName.toGodotName())
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7> Object.Signal8(signalName: String) =
        Signal8<P0, P1, P2, P3, P4, P5, P6, P7>(this, signalName.toGodotName())

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7> Object.signal8() =
        Signal8.delegate as ReadOnlyProperty<Object, Signal8<P0, P1, P2, P3, P4, P5, P6, P7>>

public class Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8> @PublishedApi internal constructor(
    instance: Object,
    name: StringName,
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
        emitUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8)
    }

    public fun connect(callable: Callable9<*, P0, P1, P2, P3, P4, P5, P6, P7, P8>,
            flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT): Unit {
        connectUnsafe(callable, flags)
    }

    public fun disconnect(callable: Callable9<*, P0, P1, P2, P3, P4, P5, P6, P7, P8>): Unit {
        disconnectUnsafe(callable)
    }

    public companion object {
        @PublishedApi
        internal val `delegate`:
                ReadOnlyProperty<Object, Signal9<Any, Any, Any, Any, Any, Any, Any, Any, Any>> =
                ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4, P5, P6, P7, P8> getValue(thisRef: Object,
                `property`: KProperty<*>): Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8> =
                Signal9(thisRef, property.toGodotName())

        @JvmStatic
        public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8> create(godotObject: Object,
                signalName: String): Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8> =
                Signal9(godotObject, signalName.toGodotName())
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8> Object.Signal9(signalName: String) =
        Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8>(this, signalName.toGodotName())

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8> Object.signal9() =
        Signal9.delegate as ReadOnlyProperty<Object, Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8>>

public class Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> @PublishedApi internal constructor(
    instance: Object,
    name: StringName,
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
        emitUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)
    }

    public fun connect(callable: Callable10<*, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>,
            flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT): Unit {
        connectUnsafe(callable, flags)
    }

    public fun disconnect(callable: Callable10<*, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>): Unit {
        disconnectUnsafe(callable)
    }

    public companion object {
        @PublishedApi
        internal val `delegate`:
                ReadOnlyProperty<Object, Signal10<Any, Any, Any, Any, Any, Any, Any, Any, Any, Any>>
                = ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>
                getValue(thisRef: Object, `property`: KProperty<*>):
                Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> =
                Signal10(thisRef, property.toGodotName())

        @JvmStatic
        public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> create(godotObject: Object,
                signalName: String): Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> =
                Signal10(godotObject, signalName.toGodotName())
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> Object.Signal10(signalName: String) =
        Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>(this, signalName.toGodotName())

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> Object.signal10() =
        Signal10.delegate as ReadOnlyProperty<Object, Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>>

public class Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> @PublishedApi internal
        constructor(
    instance: Object,
    name: StringName,
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
        emitUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)
    }

    public fun connect(callable: Callable11<*, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>,
            flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT): Unit {
        connectUnsafe(callable, flags)
    }

    public fun disconnect(callable: Callable11<*, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>):
            Unit {
        disconnectUnsafe(callable)
    }

    public companion object {
        @PublishedApi
        internal val `delegate`:
                ReadOnlyProperty<Object, Signal11<Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any>>
                = ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>
                getValue(thisRef: Object, `property`: KProperty<*>):
                Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> =
                Signal11(thisRef, property.toGodotName())

        @JvmStatic
        public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> create(godotObject: Object,
                signalName: String): Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> =
                Signal11(godotObject, signalName.toGodotName())
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> Object.Signal11(signalName: String)
        = Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>(this, signalName.toGodotName())

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10> Object.signal11() =
        Signal11.delegate as ReadOnlyProperty<Object, Signal11<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10>>

public class Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> @PublishedApi internal
        constructor(
    instance: Object,
    name: StringName,
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
        emitUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)
    }

    public fun connect(callable: Callable12<*, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>,
            flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT): Unit {
        connectUnsafe(callable, flags)
    }

    public
            fun disconnect(callable: Callable12<*, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>):
            Unit {
        disconnectUnsafe(callable)
    }

    public companion object {
        @PublishedApi
        internal val `delegate`:
                ReadOnlyProperty<Object, Signal12<Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any>>
                = ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>
                getValue(thisRef: Object, `property`: KProperty<*>):
                Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> =
                Signal12(thisRef, property.toGodotName())

        @JvmStatic
        public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> create(godotObject: Object,
                signalName: String): Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> =
                Signal12(godotObject, signalName.toGodotName())
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>
        Object.Signal12(signalName: String) =
        Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>(this, signalName.toGodotName())

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11> Object.signal12() =
        Signal12.delegate as ReadOnlyProperty<Object, Signal12<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11>>

public class Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> @PublishedApi internal
        constructor(
    instance: Object,
    name: StringName,
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
        emitUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)
    }

    public
            fun connect(callable: Callable13<*, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>,
            flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT): Unit {
        connectUnsafe(callable, flags)
    }

    public
            fun disconnect(callable: Callable13<*, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>):
            Unit {
        disconnectUnsafe(callable)
    }

    public companion object {
        @PublishedApi
        internal val `delegate`:
                ReadOnlyProperty<Object, Signal13<Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any>>
                = ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>
                getValue(thisRef: Object, `property`: KProperty<*>):
                Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> =
                Signal13(thisRef, property.toGodotName())

        @JvmStatic
        public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>
                create(godotObject: Object, signalName: String):
                Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> =
                Signal13(godotObject, signalName.toGodotName())
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>
        Object.Signal13(signalName: String) =
        Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>(this, signalName.toGodotName())

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12> Object.signal13() =
        Signal13.delegate as ReadOnlyProperty<Object, Signal13<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12>>

public class Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> @PublishedApi
        internal constructor(
    instance: Object,
    name: StringName,
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
        emitUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)
    }

    public
            fun connect(callable: Callable14<*, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>,
            flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT): Unit {
        connectUnsafe(callable, flags)
    }

    public
            fun disconnect(callable: Callable14<*, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>):
            Unit {
        disconnectUnsafe(callable)
    }

    public companion object {
        @PublishedApi
        internal val `delegate`:
                ReadOnlyProperty<Object, Signal14<Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any>>
                = ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>
                getValue(thisRef: Object, `property`: KProperty<*>):
                Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> =
                Signal14(thisRef, property.toGodotName())

        @JvmStatic
        public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>
                create(godotObject: Object, signalName: String):
                Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> =
                Signal14(godotObject, signalName.toGodotName())
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>
        Object.Signal14(signalName: String) =
        Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>(this, signalName.toGodotName())

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> Object.signal14() =
        Signal14.delegate as ReadOnlyProperty<Object, Signal14<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>>

public class Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> @PublishedApi
        internal constructor(
    instance: Object,
    name: StringName,
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
        emitUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)
    }

    public
            fun connect(callable: Callable15<*, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>,
            flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT): Unit {
        connectUnsafe(callable, flags)
    }

    public
            fun disconnect(callable: Callable15<*, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>):
            Unit {
        disconnectUnsafe(callable)
    }

    public companion object {
        @PublishedApi
        internal val `delegate`:
                ReadOnlyProperty<Object, Signal15<Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any>>
                = ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>
                getValue(thisRef: Object, `property`: KProperty<*>):
                Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> =
                Signal15(thisRef, property.toGodotName())

        @JvmStatic
        public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>
                create(godotObject: Object, signalName: String):
                Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14> =
                Signal15(godotObject, signalName.toGodotName())
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>
        Object.Signal15(signalName: String) =
        Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>(this, signalName.toGodotName())

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>
        Object.signal15() =
        Signal15.delegate as ReadOnlyProperty<Object, Signal15<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14>>

public class Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>
        @PublishedApi internal constructor(
    instance: Object,
    name: StringName,
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
        emitUnsafe(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)
    }

    public
            fun connect(callable: Callable16<*, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>,
            flags: Object.ConnectFlags = Object.ConnectFlags.DEFAULT): Unit {
        connectUnsafe(callable, flags)
    }

    public
            fun disconnect(callable: Callable16<*, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>):
            Unit {
        disconnectUnsafe(callable)
    }

    public companion object {
        @PublishedApi
        internal val `delegate`:
                ReadOnlyProperty<Object, Signal16<Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any>>
                = ReadOnlyProperty { thisRef, property -> getValue(thisRef, property) }

        public inline operator fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14,
                P15> getValue(thisRef: Object, `property`: KProperty<*>):
                Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15> =
                Signal16(thisRef, property.toGodotName())

        @JvmStatic
        public fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>
                create(godotObject: Object, signalName: String):
                Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15> =
                Signal16(godotObject, signalName.toGodotName())
    }
}

@Suppress("FUNCTION_NAME")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>
        Object.Signal16(signalName: String) =
        Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>(this, signalName.toGodotName())

@Suppress("UNCHECKED_CAST")
public inline fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>
        Object.signal16() =
        Signal16.delegate as ReadOnlyProperty<Object, Signal16<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15>>
