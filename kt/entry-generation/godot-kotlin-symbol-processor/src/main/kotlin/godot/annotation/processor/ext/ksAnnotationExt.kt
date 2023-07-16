package godot.annotation.processor.ext

import com.google.devtools.ksp.symbol.ClassKind
import com.google.devtools.ksp.symbol.KSAnnotation
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSDeclaration
import com.google.devtools.ksp.symbol.KSPropertyDeclaration
import com.google.devtools.ksp.symbol.KSType
import godot.annotation.ColorNoAlpha
import godot.annotation.Dir
import godot.annotation.EnumFlag
import godot.annotation.EnumTypeHint
import godot.annotation.ExpEasing
import godot.annotation.Export
import godot.annotation.IntFlag
import godot.annotation.MultilineText
import godot.annotation.PlaceHolderText
import godot.annotation.RegisterClass
import godot.annotation.RegisterConstructor
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.annotation.Rpc
import godot.annotation.Tool
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
import godot.entrygenerator.model.RegisterConstructorAnnotation
import godot.entrygenerator.model.RegisterFunctionAnnotation
import godot.entrygenerator.model.RegisterPropertyAnnotation
import godot.entrygenerator.model.RegisterSignalAnnotation
import godot.entrygenerator.model.RpcAnnotation
import godot.entrygenerator.model.RpcMode
import godot.entrygenerator.model.Sync
import godot.entrygenerator.model.ToolAnnotation
import godot.entrygenerator.model.TransferMode

internal val KSAnnotation.fqNameUnsafe: String
    get() = requireNotNull(this.annotationType.resolve().declaration.qualifiedName?.asString()) {
        "$this has no resolvable fqName"
    }

internal val KSAnnotation.rangeEnum: Range
    get() = ((arguments.firstOrNull { it.name?.asString() == "or" }?.value ?: arguments[3].value) as? KSType)
        ?.declaration
        ?.qualifiedName
        ?.asString()
        ?.let { enumFqName ->
            when (enumFqName) {
                "${godot.registration.Range::class.qualifiedName}.${godot.registration.Range.NONE.name}" -> Range.NONE
                "${godot.registration.Range::class.qualifiedName}.${godot.registration.Range.OR_GREATER.name}" -> Range.OR_GREATER
                "${godot.registration.Range::class.qualifiedName}.${godot.registration.Range.OR_LESSER.name}" -> Range.OR_LESSER
                else -> throw IllegalArgumentException("Unknown enum $enumFqName for hint annotation IntRange")
            }
        } ?: Range.NONE

internal val KSAnnotation.rpcModeEnum: RpcMode
    get() = when (((arguments.firstOrNull { it.name?.asString() == "rpcMode" }?.value ?: arguments[0].value) as? KSType)?.declaration?.qualifiedName?.asString()) {
        "${godot.annotation.RpcMode.ANY::class.qualifiedName}.${godot.annotation.RpcMode.ANY.name}" -> RpcMode.ANY
        "${godot.annotation.RpcMode.AUTHORITY::class.qualifiedName}.${godot.annotation.RpcMode.AUTHORITY.name}" -> RpcMode.AUTHORITY
        else -> RpcMode.DISABLED
    }

internal val KSAnnotation.rpcSyncEnum: Sync
    get() = when (((arguments.firstOrNull { it.name?.asString() == "sync" }?.value ?: arguments[1].value) as? KSType)?.declaration?.qualifiedName?.asString()) {
        "${godot.annotation.Sync.SYNC::class.qualifiedName}.${godot.annotation.Sync.SYNC.name}" -> Sync.SYNC
        "${godot.annotation.Sync.NO_SYNC::class.qualifiedName}.${godot.annotation.Sync.NO_SYNC.name}" -> Sync.NO_SYNC
        else -> Sync.NO_SYNC
    }

internal val KSAnnotation.rpcTransferModeEnum: TransferMode
    get() = when (((arguments.firstOrNull { it.name?.asString() == "transferMode" }?.value ?: arguments[2].value) as? KSType)?.declaration?.qualifiedName?.asString()) {
        "${godot.annotation.TransferMode.RELIABLE::class.qualifiedName}.${godot.annotation.TransferMode.RELIABLE.name}" -> TransferMode.RELIABLE
        "${godot.annotation.TransferMode.UNRELIABLE::class.qualifiedName}.${godot.annotation.TransferMode.UNRELIABLE.name}" -> TransferMode.UNRELIABLE
        "${godot.annotation.TransferMode.UNRELIABLE_ORDERED::class.qualifiedName}.${godot.annotation.TransferMode.UNRELIABLE_ORDERED.name}" -> TransferMode.UNRELIABLE_ORDERED
        else -> TransferMode.RELIABLE
    }

internal val KSAnnotation.rpcChannel: Int
    get() = (arguments.firstOrNull { it.name?.asString() == "transferChannel" }?.value ?: arguments[3].value) as Int

internal fun KSAnnotation.mapToAnnotation(parentDeclaration: KSDeclaration): GodotAnnotation? {
    return when (fqNameUnsafe) {
        RegisterClass::class.qualifiedName -> RegisterClassAnnotation(
            customName = arguments.first().value as? String,
            source = this
        )
        RegisterConstructor::class.qualifiedName -> RegisterConstructorAnnotation(this)
        RegisterFunction::class.qualifiedName -> RegisterFunctionAnnotation(this)
        RegisterProperty::class.qualifiedName -> RegisterPropertyAnnotation(this)
        RegisterSignal::class.qualifiedName -> RegisterSignalAnnotation(this)
        Tool::class.qualifiedName -> ToolAnnotation(this)
        Export::class.qualifiedName -> ExportAnnotation(this)
        Rpc::class.qualifiedName -> RpcAnnotation(
            rpcMode = rpcModeEnum,
            sync = rpcSyncEnum,
            transferMode = rpcTransferModeEnum,
            transferChannel = rpcChannel,
            source = this
        )
        "godot.annotation.GodotBaseType" -> GodotBaseTypeAnnotation(this) //is internal
        EnumFlag::class.qualifiedName -> {
            val setType = (parentDeclaration as KSPropertyDeclaration).type.resolve()
            require(setType.declaration.qualifiedName?.asString()?.matches(Regex("^kotlin\\.collections\\..*Set\$")) ?: false) {
                "Property annotated with @EnumFlag has to be of type kotlin.collection.Set but was of type ${setType.declaration.qualifiedName?.asString()}"
            }
            val enumDeclaration = setType.arguments.first().type?.resolve()?.declaration
            require(enumDeclaration is KSClassDeclaration) {
                "Type parameter of EnumFlag set has to be a class declaration"
            }
            require(enumDeclaration.classKind == ClassKind.ENUM_CLASS) {
                "Content type of enumFlag set has to be of class kind ENUM but was class kind ${enumDeclaration.classKind}. Property: ${parentDeclaration.qualifiedName}"
            }
            val enumValueNames = enumDeclaration
                .declarations
                .filterIsInstance<KSClassDeclaration>()
                .filter { it.classKind == ClassKind.ENUM_ENTRY }
                .map { it.simpleName.asString() }
                .toList()

            EnumFlagHintStringAnnotation(enumValueNames = enumValueNames, source = this)
        }
        IntFlag::class.qualifiedName -> IntFlagHintAnnotation(
            @Suppress("UNCHECKED_CAST")
            (arguments.firstOrNull()?.value as? ArrayList<String>)?.toList() ?: emptyList(),
            this
        )
        MultilineText::class.qualifiedName -> MultilineTextHintAnnotation
        PlaceHolderText::class.qualifiedName -> PlaceHolderTextHintAnnotation
        ColorNoAlpha::class.qualifiedName -> ColorNoAlphaHintAnnotation
        godot.annotation.IntRange::class.qualifiedName -> provideRangeHintAnnotation(-1)
        godot.annotation.LongRange::class.qualifiedName -> provideRangeHintAnnotation(-1L)
        godot.annotation.FloatRange::class.qualifiedName -> provideRangeHintAnnotation(-1f)
        godot.annotation.DoubleRange::class.qualifiedName -> provideRangeHintAnnotation(-1.0)
        EnumTypeHint::class.qualifiedName -> null
        ExpEasing::class.qualifiedName -> {
            val attenuation = ((arguments.firstOrNull { it.name?.asString() == "attenuation" }?.value ?: arguments.firstOrNull()?.value) as? Boolean) ?: false
            val isPositiveOnly = ((arguments.firstOrNull { it.name?.asString() == "isPositiveOnly" }?.value ?: arguments[1].value) as? Boolean) ?: false
            ExpEasingHintAnnotation(
                attenuation = attenuation,
                isPositiveOnly = isPositiveOnly,
                source = this
            )
        }
        godot.annotation.File::class.qualifiedName -> {
            @Suppress("UNCHECKED_CAST")
            val extensions = ((arguments.firstOrNull { it.name?.asString() == "extensions" }?.value ?: arguments.firstOrNull()?.value) as? ArrayList<String>)?.toList() ?: emptyList()
            val global = ((arguments.firstOrNull { it.name?.asString() == "global" }?.value ?: arguments[1].value) as? Boolean) ?: false
            FileHintAnnotation(
                extensions = extensions,
                global = global,
                source = this
            )
        }
        Dir::class.qualifiedName -> {
            val global = ((arguments.firstOrNull { it.name?.asString() == "global" }?.value ?: arguments.firstOrNull()?.value) as? Boolean) ?: false
            DirHintAnnotation(
                global = global,
                source = this
            )
        }
        else -> null
    }
}

private fun <T: Number> KSAnnotation.provideRangeHintAnnotation(stepDefault: T): RangeHintAnnotation<T> {
    val start = (arguments.firstOrNull { it.name?.asString() == "start" }?.value ?: arguments.first().value) as T
    val end = (arguments.firstOrNull { it.name?.asString() == "end" }?.value ?: arguments[1].value) as T
    val step = ((arguments.firstOrNull { it.name?.asString() == "step" }?.value ?: arguments[2].value) as? T) ?: stepDefault
    val or = rangeEnum
    val hideSlider = (arguments.firstOrNull { it.name?.asString() == "hideSlider" }?.value ?: arguments[4].value) as Boolean
    val isRadians = (arguments.firstOrNull { it.name?.asString() == "isRadians" }?.value ?: arguments[5].value) as Boolean
    val isDegrees = (arguments.firstOrNull { it.name?.asString() == "isDegrees" }?.value ?: arguments[6].value) as Boolean
    val isExp = (arguments.firstOrNull { it.name?.asString() == "isExp" }?.value ?: arguments[7].value) as Boolean
    val suffix = ((arguments.firstOrNull { it.name?.asString() == "suffix" }?.value ?: arguments[8].value) as String).let { suffix ->
        if (suffix == "<none>") {
            null
        } else {
            suffix
        }
    }

    return RangeHintAnnotation(
        start = start,
        end = end,
        step = step,
        or = or,
        hideSlider = hideSlider,
        isRadians = isRadians,
        isDegrees = isDegrees,
        isExp = isExp,
        suffix = suffix
    )
}
