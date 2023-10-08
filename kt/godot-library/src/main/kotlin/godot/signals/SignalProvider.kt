package godot.signals

import godot.Object
import kotlin.reflect.KProperty

/**
 * For java convenience usage
 */
object SignalProvider {
    @JvmStatic
    fun signal(thisRef: Object, name: String): Signal0 = Signal0(thisRef, name)
    @JvmStatic
    @Suppress("UNUSED_PARAMETER")
    fun <P0> signal(thisRef: Object, name: String, p0: String) = Signal1<P0>(thisRef, name)
    @JvmStatic
    @Suppress("UNUSED_PARAMETER")
    fun <P0, P1> signal(thisRef: Object, name: String, p0: String, p1: String) = Signal2<P0, P1>(thisRef, name)
    @JvmStatic
    @Suppress("UNUSED_PARAMETER")
    fun <P0, P1, P2> signal(thisRef: Object, name: String, p0: String, p1: String, p2: String) = Signal3<P0, P1, P2>(thisRef, name)
    @JvmStatic
    @Suppress("UNUSED_PARAMETER")
    fun <P0, P1, P2, P3> signal(thisRef: Object, name: String, p0: String, p1: String, p2: String, p3: String) = Signal4<P0, P1, P2, P3>(thisRef, name)
    @JvmStatic
    @Suppress("UNUSED_PARAMETER")
    fun <P0, P1, P2, P3, P4> signal(thisRef: Object, name: String, p0: String, p1: String, p2: String, p3: String, p4: String) = Signal5<P0, P1, P2, P3, P4>(thisRef, name)
    @JvmStatic
    @Suppress("UNUSED_PARAMETER")
    fun <P0, P1, P2, P3, P4, P5> signal(thisRef: Object, name: String, p0: String, p1: String, p2: String, p3: String, p4: String, p5: String) = Signal6<P0, P1, P2, P3, P4, P5>(thisRef, name)
    @JvmStatic
    @Suppress("UNUSED_PARAMETER")
    fun <P0, P1, P2, P3, P4, P5, P6> signal(thisRef: Object, name: String, p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String) = Signal7<P0, P1, P2, P3, P4, P5, P6>(thisRef, name)
    @JvmStatic
    @Suppress("UNUSED_PARAMETER")
    fun <P0, P1, P2, P3, P4, P5, P6, P7> signal(thisRef: Object, name: String, p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String) = Signal8<P0, P1, P2, P3, P4, P5, P6, P7>(thisRef, name)
}

class SignalDelegate<T : Signal>(val factory: () -> T) {
    @PublishedApi
    internal var signal: T? = null
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun getValue(thisRef: Object, property: KProperty<*>): T {
        if (signal == null) {
            signal = factory()
        }
        return signal!!
    }
}

class SignalDelegateProvider<T : Signal>(private val factory: (Object, String) -> T) {
    operator fun provideDelegate(thisRef: Object, property: KProperty<*>): SignalDelegate<T> {
        return SignalDelegate { factory(thisRef, property.name) }
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
