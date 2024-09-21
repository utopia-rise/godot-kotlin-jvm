package godot.core

import godot.Object
import kotlin.reflect.KProperty

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
