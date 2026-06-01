package godot.registration.model.exceptions

/** Base exception for the registration tooling — shared by the model's sanity checks and the registrar generator. */
open class RegistrationException(message: String) : Exception(message)
