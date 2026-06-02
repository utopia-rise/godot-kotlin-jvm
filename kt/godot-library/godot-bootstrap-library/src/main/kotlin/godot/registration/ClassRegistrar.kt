package godot.registration

import godot.core.KtObject
import kotlin.reflect.KClass

interface ClassRegistrar {
    fun register(): KtClass<*>

    fun <T : KtObject> register(
        registeredName: String,
        registeredSupertypes: List<String>,
        baseGodotClass: String,
        kClass: KClass<T>,
        block: KtClassBuilder<T>.() -> Unit,
    ): KtClass<T> {
        val builder = KtClassBuilder(
            registeredName = registeredName,
            superClasses = registeredSupertypes,
            baseGodotClass = baseGodotClass,
            kClassField = kClass,
        )
        builder.block()
        return builder.build()
    }
}
