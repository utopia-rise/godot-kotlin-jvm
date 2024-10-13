package godot.codegen.exceptions

import godot.codegen.models.enriched.EnrichedMethod
import godot.codegen.models.enriched.EnrichedSignal
import godot.common.constants.Constraints

class TooManyMethodArgument(method: EnrichedMethod) :
    Exception("${method.name} has ${method.arguments.size} arguments but the maximum number is ${Constraints.MAX_FUNCTION_ARG_COUNT}")

class TooManySignalArgument(signal: EnrichedSignal) :
    Exception("${signal.name} has ${signal.arguments.size} arguments but the maximum number is ${Constraints.MAX_SIGNAL_ARG_COUNT}")
