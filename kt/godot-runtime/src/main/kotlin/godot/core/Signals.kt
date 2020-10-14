package godot.core

data class KtSignalInfo(
        val name: String,
        val _arguments: List<KtPropertyInfo>
) {
    val arguments: Array<KtPropertyInfo>
        get() = _arguments.toTypedArray()
}

abstract class Signal(
        val name: String
) {
    protected fun <I : KtObject> emitSignal(instance: I, vararg args: Any?) {
        instance.emitSignal(name, *args)
    }

    @PublishedApi
    internal fun <I : KtObject, T: KtObject> connect(
            instance: I,
            target: T,
            method: String,
            binds: VariantArray?,
            flags: Long
    ) {
        instance.connect(name, target, method, binds ?: VariantArray(), flags)
    }
}