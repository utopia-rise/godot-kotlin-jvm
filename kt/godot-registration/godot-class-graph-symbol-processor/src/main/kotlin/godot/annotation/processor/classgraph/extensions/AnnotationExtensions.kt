package godot.annotation.processor.classgraph.extensions

import godot.annotation.*
import godot.annotation.processor.classgraph.Context
import godot.annotation.processor.classgraph.constants.SET
import godot.registration.model.RpcConfig
import godot.registration.model.hint.property.*
import godot.registration.model.hint.property.Range
import io.github.classgraph.AnnotationEnumValue
import io.github.classgraph.AnnotationInfo
import io.github.classgraph.ClassRefTypeSignature
import io.github.classgraph.FieldInfo

/**
 * Maps a single annotation found on a property [field] to its model [PropertyHint], or `null` if the
 * annotation does not describe a property hint (e.g. `@Export`, `@RegisterProperty`).
 *
 * NOTE: the `@EnumFlag` branch currently silently yields an empty hint when the field is not a `Set<Enum>`.
 * Those situations should become model-level checks (see report).
 */
@Suppress("UNCHECKED_CAST")
fun AnnotationInfo.toPropertyHint(field: FieldInfo): PropertyHint? = when (name) {
    EnumFlag::class.java.name -> field.toEnumFlagHint()
    IntFlag::class.java.name -> IntFlagHint(parameterValues.getValue("values") as? List<String> ?: emptyList())
    MultilineText::class.java.name -> MultilineTextHint()
    PlaceHolderText::class.java.name -> PlaceHolderTextHint()
    ColorNoAlpha::class.java.name -> ColorNoAlphaHint()
    godot.annotation.IntRange::class.java.name -> provideRangeHint(-1)
    godot.annotation.LongRange::class.java.name -> provideRangeHint(-1L)
    godot.annotation.FloatRange::class.java.name -> provideRangeHint(-1f)
    godot.annotation.DoubleRange::class.java.name -> provideRangeHint(-1.0)
    ExpEasing::class.java.name -> ExpEasingHint(
        attenuation = parameterValues.getValue("attenuation") as? Boolean ?: false,
        isPositiveOnly = parameterValues.getValue("isPositiveOnly") as? Boolean ?: false,
    )

    godot.annotation.File::class.java.name -> FileHint(
        extensions = parameterValues.getValue("extensions") as? List<String> ?: emptyList(),
        global = parameterValues.getValue("global") as? Boolean ?: false,
    )

    Dir::class.java.name -> DirHint(
        global = parameterValues.getValue("global") as? Boolean ?: false,
    )

    else -> null
}

/** Builds the RPC configuration from an `@Rpc` annotation. */
fun AnnotationInfo.toRpcConfig(): RpcConfig = RpcConfig(
    rpcMode = getRpcMode(),
    sync = getSyncMode(),
    transferMode = getTransferMode(),
    transferChannel = parameterValues.getValue("transferChannel") as Int,
)

private fun FieldInfo.toEnumFlagHint(): EnumFlagHintStringHint {
    val typeSignature = this.typeSignature
    if (typeSignature !is ClassRefTypeSignature || typeSignature.fullyQualifiedClassName != SET) {
        // Parse-only fallback: without a Set<Enum> there are no enum values to read.
        return EnumFlagHintStringHint(enumValueNames = listOf())
    }

    val typeArgument = typeSignature.typeArguments.first().typeSignature as ClassRefTypeSignature

    val enumValues = Context.enumValueNamesByClass.getOrPut(typeArgument.fullyQualifiedClassName) {
        requireNotNull(Context.getClassInfoOrNull(typeArgument.fullyQualifiedClassName)) {
            "Could not resolve enum class info for ${typeArgument.fullyQualifiedClassName}"
        }
            .fieldInfo
            .filter { it.typeDescriptor == typeArgument }
            .map { it.name }
    }
    return EnumFlagHintStringHint(enumValueNames = enumValues)
}

private fun AnnotationInfo.getRpcMode(): RpcMode {
    val rpcModeName = parameterValues.getValue("rpcMode")?.toString()
    return when (rpcModeName) {
        RpcMode.ANY.fqName -> RpcMode.ANY
        RpcMode.AUTHORITY.fqName -> RpcMode.AUTHORITY
        else -> RpcMode.DISABLED
    }
}

private fun AnnotationInfo.getSyncMode(): Sync {
    val syncName = parameterValues.getValue("sync")?.toString()
    return when (syncName) {
        Sync.SYNC.fqName -> Sync.SYNC
        Sync.NO_SYNC.fqName -> Sync.NO_SYNC
        else -> Sync.NO_SYNC
    }
}

private fun AnnotationInfo.getTransferMode(): TransferMode {
    val transferModeName = parameterValues.getValue("transferMode")?.toString()
    return when (transferModeName) {
        TransferMode.RELIABLE.fqName -> TransferMode.RELIABLE
        TransferMode.UNRELIABLE.fqName -> TransferMode.UNRELIABLE
        TransferMode.UNRELIABLE_ORDERED.fqName -> TransferMode.UNRELIABLE_ORDERED
        else -> TransferMode.RELIABLE
    }
}

@Suppress("UNCHECKED_CAST")
private fun <T : Number> AnnotationInfo.provideRangeHint(stepDefault: T): RangeHint<T> {
    val start = parameterValues.getValue("min") as T
    val end = parameterValues.getValue("max") as T
    val step = parameterValues.getValue("step") as? T ?: stepDefault
    val or = Range.valueOf((parameterValues.getValue("or") as AnnotationEnumValue).valueName)
    val hideSlider = parameterValues.getValue("hideSlider") as? Boolean ?: false
    val isRadians = parameterValues.getValue("isRadians") as? Boolean ?: false
    val isDegrees = parameterValues.getValue("isDegrees") as? Boolean ?: false
    val isExp = parameterValues.getValue("isExp") as? Boolean ?: false
    val suffix = parameterValues.getValue("suffix")?.toString()?.takeIf { it != "<none>" }

    return RangeHint(
        start = start,
        end = end,
        step = step,
        or = or,
        hideSlider = hideSlider,
        isRadians = isRadians,
        isDegrees = isDegrees,
        isExp = isExp,
        suffix = suffix,
    )
}

private val Enum<*>.fqName
    get() = "${this::class.qualifiedName}.$name"
