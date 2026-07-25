package godot.registration

import godot.core.KtObject
import kotlin.reflect.KClass

interface ClassRegistrar {
    fun register(): KtClass<*>

    fun <T : KtObject> register(
        registeredName: String,
        sourceFilePath: String = "",
        registeredSupertypes: List<String>,
        baseGodotClass: String,
        isAbstract: Boolean,
        kClass: KClass<T>,
        block: KtClassBuilder<T>.() -> Unit,
    ): KtClass<T> {
        val builder = KtClassBuilder(
            registeredName = registeredName,
            sourceFilePath = sourceFilePath,
            registeredSupertypes = registeredSupertypes,
            baseGodotClass = baseGodotClass,
            isAbstract = isAbstract,
            kClassField = kClass,
        )
        builder.block()
        return builder.build()
    }
}
