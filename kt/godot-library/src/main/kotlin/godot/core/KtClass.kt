package godot.core

@Suppress("unused")
data class KtClass<T : KtObject>(
    val registeredName: String,
    val relativeSourcePath: String,
    private val _registeredSupertypes: List<String>,
    private val _constructors: List<KtConstructor<T>?>,
    private val _properties: Map<String, KtProperty<T, *>>,
    private val _functions: Map<String, KtFunction<T, *>>,
    private val _signalInfos: Map<String, KtSignalInfo>,
    val baseGodotClass: String
) {
    val registeredSupertypes: Array<String>
        get() = _registeredSupertypes.toTypedArray()
    val constructors: Array<KtConstructor<T>?>
        get() = _constructors.toTypedArray()
    val functions: Array<KtFunction<T, *>>
        get() = _functions.values.toTypedArray()
    val properties: Array<KtProperty<T, *>>
        get() = _properties.values.toTypedArray()
    val signalInfos: Array<KtSignalInfo>
        get() = _signalInfos.values.toTypedArray()
}
