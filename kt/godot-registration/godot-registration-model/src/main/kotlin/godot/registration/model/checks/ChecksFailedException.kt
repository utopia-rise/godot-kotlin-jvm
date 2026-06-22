package godot.registration.model.checks

import godot.registration.model.exceptions.RegistrationException

class ChecksFailedException : RegistrationException(
    "Some checks failed. See the log above to see what checks failed"
)
