package godot.annotation


/**
 * Registeres a signal to make it usable
 *
 * **Note:** Properties annotated with this signal have to have the prefix `signal` and have to be assigned through one of the signal delegates.
 *
 * A signal without the delegate, without the prefix or without this annotation WILL NOT WORK.
 *
 * The `signal` prefix is dropped during registration: `signalReverseChanged` becomes `reverseChanged` in Godot
 *
 * Use the signals `connect` method to register receivers in a typesafe way.
 */
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterSignal
