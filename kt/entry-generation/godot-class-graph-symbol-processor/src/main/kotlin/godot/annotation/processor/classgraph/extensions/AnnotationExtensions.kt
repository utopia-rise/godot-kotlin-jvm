package godot.annotation.processor.classgraph.extensions

import godot.annotation.ColorNoAlpha
import godot.annotation.Dir
import godot.annotation.EnumFlag
import godot.annotation.ExpEasing
import godot.annotation.Export
import godot.annotation.IntFlag
import godot.annotation.MultilineText
import godot.annotation.PlaceHolderText
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.annotation.Rpc
import godot.annotation.RpcMode
import godot.annotation.Sync
import godot.annotation.Tool
import godot.annotation.TransferMode
import godot.annotation.processor.classgraph.Context
import godot.annotation.processor.classgraph.constants.SET
import godot.entrygenerator.model.ColorNoAlphaHintAnnotation
import godot.entrygenerator.model.DirHintAnnotation
import godot.entrygenerator.model.EnumFlagHintStringAnnotation
import godot.entrygenerator.model.ExpEasingHintAnnotation
import godot.entrygenerator.model.ExportAnnotation
import godot.entrygenerator.model.FileHintAnnotation
import godot.entrygenerator.model.GodotAnnotation
import godot.entrygenerator.model.GodotBaseTypeAnnotation
import godot.entrygenerator.model.IntFlagHintAnnotation
import godot.entrygenerator.model.MultilineTextHintAnnotation
import godot.entrygenerator.model.PlaceHolderTextHintAnnotation
import godot.entrygenerator.model.Range
import godot.entrygenerator.model.RangeHintAnnotation
import godot.entrygenerator.model.RegisterClassAnnotation
import godot.entrygenerator.model.RegisterFunctionAnnotation
import godot.entrygenerator.model.RegisterPropertyAnnotation
import godot.entrygenerator.model.RegisterSignalAnnotation
import godot.entrygenerator.model.RpcAnnotation
import godot.entrygenerator.model.ToolAnnotation
import io.github.classgraph.AnnotationEnumValue
import io.github.classgraph.AnnotationInfo
import io.github.classgraph.ClassRefTypeSignature
import io.github.classgraph.FieldInfo

fun AnnotationInfo.mapToGodotAnnotation(parentDeclaration: Any): GodotAnnotation? {
    @Suppress("UNCHECKED_CAST")
    return when (name) {
        RegisterClass::class.java.name -> RegisterClassAnnotation(
            customName = parameterValues.getValue("customName") as? String,
            symbolProcessorSource = this
        )
        RegisterFunction::class.java.name -> RegisterFunctionAnnotation(this)
        RegisterProperty::class.java.name -> RegisterPropertyAnnotation(this)
        RegisterSignal::class.java.name -> RegisterSignalAnnotation(this)
        Tool::class.java.name -> ToolAnnotation(this)
        Export::class.java.name -> ExportAnnotation(this)
        Rpc::class.java.name -> RpcAnnotation(
            rpcMode = getRpcMode(),
            sync = getSyncMode(),
            transferMode = getTransferMode(),
            transferChannel = parameterValues.getValue("transferChannel") as Int,
            symbolProcessorSource = this
        )
        "godot.annotation.GodotBaseType" -> GodotBaseTypeAnnotation(this) // is internal
        EnumFlag::class.java.name -> {
            require(parentDeclaration is FieldInfo) {
                "EnumFlag annotation should be placed on property."
            }

            val typeDescriptor = parentDeclaration.typeSignature

            require(typeDescriptor is ClassRefTypeSignature)

            require(typeDescriptor.fullyQualifiedClassName == SET) {
                "Property annotated with EnumFlag should be of type $SET"
            }

            val typeArgument = typeDescriptor.typeArguments.first().typeSignature as ClassRefTypeSignature

            val enumValues = Context.scanResult.getClassInfo(typeArgument.fullyQualifiedClassName)
                .fieldInfo
                .filter { it.typeDescriptor == typeArgument }
                .map { it.name }
            EnumFlagHintStringAnnotation(enumValueNames = enumValues, source = this)
        }
        IntFlag::class.java.name -> IntFlagHintAnnotation(
            parameterValues.getValue("values") as? List<String> ?: emptyList(),
            this
        )
        MultilineText::class.java.name -> MultilineTextHintAnnotation(this)
        PlaceHolderText::class.java.name -> PlaceHolderTextHintAnnotation(this)
        ColorNoAlpha::class.java.name -> ColorNoAlphaHintAnnotation(this)
        godot.annotation.IntRange::class.java.name -> provideRangeHintAnnotation(-1)
        godot.annotation.LongRange::class.java.name -> provideRangeHintAnnotation(-1L)
        godot.annotation.FloatRange::class.java.name -> provideRangeHintAnnotation(-1f)
        godot.annotation.DoubleRange::class.java.name -> provideRangeHintAnnotation(-1.0)
        ExpEasing::class.java.name -> ExpEasingHintAnnotation(
            attenuation = parameterValues.getValue("attenuation") as? Boolean ?: false,
            isPositiveOnly = parameterValues.getValue("isPositiveOnly") as? Boolean ?: false,
            source = this
        )
        godot.annotation.File::class.java.name -> FileHintAnnotation(
            extensions = parameterValues.getValue("extensions") as? List<String> ?: emptyList(),
            global = parameterValues.getValue("global") as? Boolean ?: false,
            source = this
        )
        Dir::class.java.name -> DirHintAnnotation(
            global = parameterValues.getValue("global") as? Boolean ?: false,
            source = this
        )
        else -> null
    }
}

private fun AnnotationInfo.getRpcMode(): godot.entrygenerator.model.RpcMode {
    val rpcModeName = parameterValues.getValue("rpcMode")?.toString()
    return when (rpcModeName) {
        RpcMode.ANY.fqName -> godot.entrygenerator.model.RpcMode.ANY
        RpcMode.AUTHORITY.fqName -> godot.entrygenerator.model.RpcMode.AUTHORITY
        else -> godot.entrygenerator.model.RpcMode.DISABLED
    }
}

private fun AnnotationInfo.getSyncMode(): godot.entrygenerator.model.Sync {
    val syncName = parameterValues.getValue("sync")?.toString()
    return when (syncName) {
        Sync.SYNC.fqName -> godot.entrygenerator.model.Sync.SYNC
        Sync.NO_SYNC.fqName -> godot.entrygenerator.model.Sync.NO_SYNC
        else -> godot.entrygenerator.model.Sync.NO_SYNC
    }
}

private fun AnnotationInfo.getTransferMode(): godot.entrygenerator.model.TransferMode {
    val transferModeName = parameterValues.getValue("transferMode")?.toString()
    return when (transferModeName) {
        TransferMode.RELIABLE.fqName -> godot.entrygenerator.model.TransferMode.RELIABLE
        TransferMode.UNRELIABLE.fqName -> godot.entrygenerator.model.TransferMode.UNRELIABLE
        TransferMode.UNRELIABLE_ORDERED.fqName -> godot.entrygenerator.model.TransferMode.UNRELIABLE_ORDERED
        else -> godot.entrygenerator.model.TransferMode.RELIABLE
    }
}

@Suppress("UNCHECKED_CAST")
private fun <T : Number> AnnotationInfo.provideRangeHintAnnotation(stepDefault: T): RangeHintAnnotation<T> {
    val start = parameterValues.getValue("min") as T
    val end = parameterValues.getValue("max") as T
    val step = parameterValues.getValue("step") as? T ?: stepDefault
    val or = Range.valueOf((parameterValues.getValue("or") as AnnotationEnumValue).valueName) // Adjust this logic based on available data
    val hideSlider = parameterValues.getValue("hideSlider") as? Boolean ?: false
    val isRadians = parameterValues.getValue("isRadians") as? Boolean ?: false
    val isDegrees = parameterValues.getValue("isDegrees") as? Boolean ?: false
    val isExp = parameterValues.getValue("isExp") as? Boolean ?: false
    val suffix = parameterValues.getValue("suffix")?.toString()?.takeIf { it != "<none>" }

    return RangeHintAnnotation(
        start = start,
        end = end,
        step = step,
        or = or,
        hideSlider = hideSlider,
        isRadians = isRadians,
        isDegrees = isDegrees,
        isExp = isExp,
        suffix = suffix,
        symbolProcessorSource = this
    )
}

@Suppress("UNCHECKED_CAST")
fun <T> AnnotationInfo.getParameterValue(parameterName: String): T = parameterValues.getValue(parameterName) as T

private val Enum<*>.fqName
    get() = "${this::class.qualifiedName}.$name"
