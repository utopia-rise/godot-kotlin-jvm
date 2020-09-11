package godot.registration.annotation

/**
 * Registeres a property in godot so it can be used from another language or from godot
 *
 * **Note:** If a property is registered. Only compile time constant assignments can be used. If this is not possible you have to use lateinit and set the value either in the constructor or in `_ready`
 *
 * @param visibleInEditor If set to true, the property can be set through the inspector. Use one of the many PropertyHintAnnotations to tell the inspector of what kind this property is. **Note:** if also a default value is set in code, the inspector uses that value as the default value. If different the value set in the inspector overrides the one set in code.
 * @param rpcMode Defines the RPC mode for this function. Default: RPCMode.DISABLED
 */
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterProperty(
    val visibleInEditor: Boolean = true,
    val rpcMode: RPCMode = RPCMode.DISABLED
)

//TODO: dummy!!!!
enum class RPCMode {
    DISABLED
}