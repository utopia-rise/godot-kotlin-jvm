package godot.signals

import godot.Object
import godot.util.camelToSnakeCase
import kotlin.reflect.KProperty

class SignalDelegate<T : Signal>(val factory: () -> T) {
    @PublishedApi
    internal var signal: T? = null
    inline operator fun getValue(thisRef: Object, property: KProperty<*>): T {
        if (signal == null) {
            signal = factory()
        }
        return signal!!
    }
}

class SignalDelegateProvider<T : Signal>(private val factory: (String) -> T) {
    operator fun provideDelegate(thisRef: Object, property: KProperty<*>): SignalDelegate<T> {
        // not using `camelcaseToUnderscore` to prevent a call to godot for each signal emission
        return SignalDelegate { factory(property.name.camelToSnakeCase()) }
    }
}

fun signal(): SignalDelegateProvider<Signal0> {
    return SignalDelegateProvider(::Signal0)
}

@Suppress("UNUSED_PARAMETER")
fun <P0> signal(p0: String): SignalDelegateProvider<Signal1<P0>> {
    return SignalDelegateProvider(::Signal1)
}

@Suppress("UNUSED_PARAMETER")
fun <P0, P1> signal(p0: String, p1: String): SignalDelegateProvider<Signal2<P0, P1>> {
    return SignalDelegateProvider(::Signal2)
}

@Suppress("UNUSED_PARAMETER")
fun <P0, P1, P2> signal(p0: String, p1: String, p2: String): SignalDelegateProvider<Signal3<P0, P1, P2>> {
    return SignalDelegateProvider(::Signal3)
}

@Suppress("UNUSED_PARAMETER")
fun <P0, P1, P2, P3> signal(
        p0: String,
        p1: String,
        p2: String,
        p3: String
): SignalDelegateProvider<Signal4<P0, P1, P2, P3>> {
    return SignalDelegateProvider(::Signal4)
}

@Suppress("UNUSED_PARAMETER")
fun <P0, P1, P2, P3, P4> signal(
        p0: String,
        p1: String,
        p2: String,
        p3: String,
        p4: String
): SignalDelegateProvider<Signal5<P0, P1, P2, P3, P4>> {
    return SignalDelegateProvider(::Signal5)
}

@Suppress("UNUSED_PARAMETER")
fun <P0, P1, P2, P3, P4, P5> signal(
        p0: String,
        p1: String,
        p2: String,
        p3: String,
        p4: String,
        p5: String
): SignalDelegateProvider<Signal6<P0, P1, P2, P3, P4, P5>> {
    return SignalDelegateProvider(::Signal6)
}

@Suppress("UNUSED_PARAMETER")
fun <P0, P1, P2, P3, P4, P5, P6> signal(
        p0: String,
        p1: String,
        p2: String,
        p3: String,
        p4: String,
        p5: String,
        p6: String
): SignalDelegateProvider<Signal7<P0, P1, P2, P3, P4, P5, P6>> {
    return SignalDelegateProvider(::Signal7)
}

@Suppress("UNUSED_PARAMETER")
fun <P0, P1, P2, P3, P4, P5, P6, P7> signal(
        p0: String,
        p1: String,
        p2: String,
        p3: String,
        p4: String,
        p5: String,
        p6: String,
        p7: String
): SignalDelegateProvider<Signal8<P0, P1, P2, P3, P4, P5, P6, P7>> {
    return SignalDelegateProvider(::Signal8)
}

@Suppress("UNUSED_PARAMETER")
fun <P0, P1, P2, P3, P4, P5, P6, P7, P8> signal(
        p0: String,
        p1: String,
        p2: String,
        p3: String,
        p4: String,
        p5: String,
        p6: String,
        p7: String,
        p8: String
): SignalDelegateProvider<Signal9<P0, P1, P2, P3, P4, P5, P6, P7, P8>> {
    return SignalDelegateProvider(::Signal9)
}

@Suppress("UNUSED_PARAMETER")
fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9> signal(
        p0: String,
        p1: String,
        p2: String,
        p3: String,
        p4: String,
        p5: String,
        p6: String,
        p7: String,
        p8: String,
        p9: String
): SignalDelegateProvider<Signal10<P0, P1, P2, P3, P4, P5, P6, P7, P8, P9>> {
    return SignalDelegateProvider(::Signal10)
}