package godot.core

import godot.util.VoidPtr

@Suppress("unused")
class KtClass<T : KtObject>(
        val name: String,
        val registeredName: String,
        val superClass: String,
        val constructors: Array<KtConstructor<T>?>,
        private val _properties: Map<String, KtProperty<T, *>>,
        private val _functions: Map<String, KtFunction<T, *>>,
        private val _signalInfos: Map<String, KtSignalInfo>,
        val baseGodotClass: String
) {
    val functions: Array<KtFunction<T, *>>
        get() = _functions.values.toTypedArray()
    val properties: Array<KtProperty<T, *>>
        get() = _properties.values.toTypedArray()
    val signalInfos: Array<KtSignalInfo>
        get() = _signalInfos.values.toTypedArray()
}
