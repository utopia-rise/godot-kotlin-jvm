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
    ): KtClass<T> = KtClassBuilder(registeredName, registeredSupertypes, baseGodotClass, kClass, block)
}
