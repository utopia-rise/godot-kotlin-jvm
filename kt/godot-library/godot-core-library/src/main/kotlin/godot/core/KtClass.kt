package godot.core

import godot.internal.memory.TransferContext

@Suppress("unused")
data class KtClass<T : KtObject>(
    val registeredName: String,
    val fqdn: String,
    private val _registeredSupertypes: List<String>,
    val constructor: KtConstructor<T>,
    private val _properties: Map<String, KtProperty<T, *>>,
    private val _functions: Map<String, KtFunction<T, *>>,
    private val _notificationFunctions: List<NotificationFunction<out KtObject>>,
    private val _signalInfos: Map<String, KtSignalInfo>,
    val baseGodotClass: String
) {
    val registeredSupertypes: Array<String>
        get() = _registeredSupertypes.toTypedArray()
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
                doNotification(notificationFunction, instance, notification.toInt())
            }
            return
        }

        for (i in _notificationFunctions.size - 1 downTo 0) {
            doNotification(_notificationFunctions[i], instance, notification.toInt())
        }
    }

    @Suppress("UNCHECKED_CAST")
    private fun doNotification(notificationFunction: NotificationFunction<out KtObject>, instance: T, notification: Int) {
        (notificationFunction as NotificationFunction<T>).invoke(instance, notification)
    }
}
