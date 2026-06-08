package godot.registration.model.checks

import godot.registration.model.hint.property.EnumFlagHintStringHint
import godot.registration.model.logging.Logger
import godot.registration.model.types.ScriptClass

/**
 * Godot stores a `FLAGS` property as a 32-bit bitmask, so a [godot.core.BitField] enum can hold at most 32
 * entries (one per bit). Larger enums cannot be represented and are rejected.
 */
private const val MAX_BIT_FIELD_ENTRIES = 32

class BitFieldEntryCountCheck(
    logger: Logger,
    registeredClasses: List<ScriptClass>,
) : BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        var hasIssue = false

        registeredClasses
            .flatMap { scriptClass -> scriptClass.properties }
            .forEach { property ->
                val flagHint = property.hints.filterIsInstance<EnumFlagHintStringHint>().firstOrNull()
                if (flagHint != null && flagHint.entryCount > MAX_BIT_FIELD_ENTRIES) {
                    hasIssue = true
                    val enumName = property.type.genericArguments.firstOrNull()?.fqName ?: "the enum"
                    logger.error(
                        "A bitfield (BitField) can have at most $MAX_BIT_FIELD_ENTRIES entries, but $enumName " +
                            "has ${flagHint.entryCount}.",
                        property,
                    )
                }
            }

        return hasIssue
    }
}
