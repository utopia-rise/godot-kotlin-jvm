package godot.runtime

import godot.core.KtObject
import godot.core.KtReference
import godot.core.TransferContext
import kotlin.reflect.KProperty

class KtReferenceDelegate<T : KtReference>(val defaultValue: () -> T) {
    private var backingField: T? = null

    operator fun getValue(thisRef: KtObject, property: KProperty<*>): T {
        if (backingField == null) {
            backingField = defaultValue()
            TransferContext.updateREF(thisRef, property.name, backingField!!)
        }
        return backingField!!
    }

    operator fun setValue(thisRef: KtObject, property: KProperty<*>, value: T) {
        backingField = value
        TransferContext.updateREF(thisRef, property.name, value)
    }
}

class KtReferenceDelegateProvider<T : KtReference>(private val defaultValue: () -> T) {
    operator fun provideDelegate(thisRef: KtObject, property: KProperty<*>): KtReferenceDelegate<T> {
        return KtReferenceDelegate(defaultValue)
    }
}

fun <T : KtReference> refProperty(defaultValue: () -> T): KtReferenceDelegateProvider<T> {
    return KtReferenceDelegateProvider(defaultValue)
}
