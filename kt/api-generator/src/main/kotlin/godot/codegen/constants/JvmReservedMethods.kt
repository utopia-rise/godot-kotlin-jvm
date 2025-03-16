package godot.codegen.constants

import godot.codegen.models.Method
import godot.codegen.models.enriched.EnrichedMethod

val jvmReservedMethods = listOf(
    EnrichedMethod(
        Method(
            "wait",
            isConst = false,
            isVararg = false,
            isVirtual = false,
            isStatic = false,
            isRequired = false,
            hash = Long.MIN_VALUE,
            hashCompatibility = listOf(),
            returnValue = null,
            returnType = null,
            arguments = null,
            description = null,
            briefDescription = null
        )
    )
)
