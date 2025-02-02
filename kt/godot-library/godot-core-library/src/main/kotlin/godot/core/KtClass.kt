package godot.core

import godot.internal.memory.TransferContext

@Suppress("unused")
data class KtClass<T : KtObject>(
    val registeredName: String,
    val fqdn: String,
    val compilationTimeRelativeRegistrationFilePath: String,
    private val _registeredSupertypes: List<String>,
    private val _constructors: List<KtConstructor<T>?>,
    private val _properties: Map<String, KtProperty<T, *>>,
    private val _functions: Map<String, KtFunction<T, *>>,
    private val _notificationFunctions: List<Any.(Int) -> Unit>,
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
    val hasNotification: Boolean
        get() = _notificationFunctions.isNotEmpty()

    fun doNotification(instance: T) {
        val parameters = arrayOfNulls<Any>(2)
        TransferContext.readArguments(
            arrayOf(VariantParser.LONG, VariantParser.BOOL),
            parameters
        )

        val notification = parameters[0]
        val reversed = parameters[1]

        require(notification is Long)
        require(reversed is Boolean)

        if (reversed) {
            for (notificationFunction in _notificationFunctions) {
                notificationFunction(instance, notification.toInt())
            }
            return
        }

        for (i in _notificationFunctions.size - 1 downTo 0) {
            _notificationFunctions[i](instance, notification.toInt())
        }
    }
}
