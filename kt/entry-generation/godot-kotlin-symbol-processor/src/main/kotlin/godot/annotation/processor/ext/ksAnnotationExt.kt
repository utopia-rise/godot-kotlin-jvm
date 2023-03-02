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
import godot.entrygenerator.model.DoubleRangeHintAnnotation
import godot.entrygenerator.model.EnumFlagHintStringAnnotation
import godot.entrygenerator.model.ExpEasingHintAnnotation
import godot.entrygenerator.model.ExportAnnotation
import godot.entrygenerator.model.FileHintAnnotation
import godot.entrygenerator.model.FloatRangeHintAnnotation
import godot.entrygenerator.model.GodotAnnotation
import godot.entrygenerator.model.GodotBaseTypeAnnotation
import godot.entrygenerator.model.IntFlagHintAnnotation
import godot.entrygenerator.model.IntRangeHintAnnotation
import godot.entrygenerator.model.LongRangeHintAnnotation
import godot.entrygenerator.model.MultilineTextHintAnnotation
import godot.entrygenerator.model.PlaceHolderTextHintAnnotation
import godot.entrygenerator.model.Range
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

val KSAnnotation.fqNameUnsafe: String
    get() = requireNotNull(this.annotationType.resolve().declaration.qualifiedName?.asString()) {
        "$this has no resolvable fqName"
    }

val KSAnnotation.rangeEnum: Range
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

val KSAnnotation.rpcModeEnum: RpcMode
    get() = when (((arguments.firstOrNull { it.name?.asString() == "rpcMode" }?.value ?: arguments[0].value) as? KSType)?.declaration?.qualifiedName?.asString()) {
        "${godot.annotation.RpcMode.ANY::class.qualifiedName}.${godot.annotation.RpcMode.ANY.name}" -> RpcMode.ANY
        "${godot.annotation.RpcMode.AUTHORITY::class.qualifiedName}.${godot.annotation.RpcMode.AUTHORITY.name}" -> RpcMode.AUTHORITY
        else -> RpcMode.DISABLED
    }

val KSAnnotation.rpcSyncEnum: Sync
    get() = when (((arguments.firstOrNull { it.name?.asString() == "sync" }?.value ?: arguments[1].value) as? KSType)?.declaration?.qualifiedName?.asString()) {
        "${godot.annotation.Sync.SYNC::class.qualifiedName}.${godot.annotation.Sync.SYNC.name}" -> Sync.SYNC
        "${godot.annotation.Sync.NO_SYNC::class.qualifiedName}.${godot.annotation.Sync.NO_SYNC.name}" -> Sync.NO_SYNC
        else -> Sync.NO_SYNC
    }

val KSAnnotation.rpcTransferModeEnum: TransferMode
    get() = when (((arguments.firstOrNull { it.name?.asString() == "transferMode" }?.value ?: arguments[2].value) as? KSType)?.declaration?.qualifiedName?.asString()) {
        "${godot.annotation.TransferMode.RELIABLE::class.qualifiedName}.${godot.annotation.TransferMode.RELIABLE.name}" -> TransferMode.RELIABLE
        "${godot.annotation.TransferMode.UNRELIABLE::class.qualifiedName}.${godot.annotation.TransferMode.UNRELIABLE.name}" -> TransferMode.UNRELIABLE
        "${godot.annotation.TransferMode.UNRELIABLE_ORDERED::class.qualifiedName}.${godot.annotation.TransferMode.UNRELIABLE_ORDERED.name}" -> TransferMode.UNRELIABLE_ORDERED
        else -> TransferMode.RELIABLE
    }

val KSAnnotation.rpcChannel: Int
    get() = (arguments.firstOrNull { it.name?.asString() == "transferChannel" }?.value ?: arguments[3].value) as Int

fun KSAnnotation.mapToAnnotation(parentDeclaration: KSDeclaration): GodotAnnotation? {
    return when (fqNameUnsafe) {
        RegisterClass::class.qualifiedName -> RegisterClassAnnotation(
            arguments.first().value as? String
        )
        RegisterConstructor::class.qualifiedName -> RegisterConstructorAnnotation
        RegisterFunction::class.qualifiedName -> RegisterFunctionAnnotation
        RegisterProperty::class.qualifiedName -> RegisterPropertyAnnotation
        RegisterSignal::class.qualifiedName -> RegisterSignalAnnotation
        Tool::class.qualifiedName -> ToolAnnotation
        Export::class.qualifiedName -> ExportAnnotation
        Rpc::class.qualifiedName -> RpcAnnotation(
            rpcMode = rpcModeEnum,
            sync = rpcSyncEnum,
            transferMode = rpcTransferModeEnum,
            transferChannel = rpcChannel
        )
        "godot.annotation.GodotBaseType" -> GodotBaseTypeAnnotation //is internal
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

            EnumFlagHintStringAnnotation(enumValueNames)
        }
        IntFlag::class.qualifiedName -> IntFlagHintAnnotation(
            @Suppress("UNCHECKED_CAST")
            (arguments.firstOrNull()?.value as? ArrayList<String>)?.toList() ?: emptyList()
        )
        MultilineText::class.qualifiedName -> MultilineTextHintAnnotation
        PlaceHolderText::class.qualifiedName -> PlaceHolderTextHintAnnotation
        ColorNoAlpha::class.qualifiedName -> ColorNoAlphaHintAnnotation
        godot.annotation.IntRange::class.qualifiedName -> {
            val start = (arguments.firstOrNull { it.name?.asString() == "start" }?.value ?: arguments.first().value) as Int
            val end = (arguments.firstOrNull { it.name?.asString() == "end" }?.value ?: arguments[1].value) as Int
            val step = ((arguments.firstOrNull { it.name?.asString() == "step" }?.value ?: arguments[2].value) as? Int) ?: -1
            val or = rangeEnum

            IntRangeHintAnnotation(
                start,
                end,
                step,
                or
            )
        }
        godot.annotation.LongRange::class.qualifiedName -> {
            val start = (arguments.firstOrNull { it.name?.asString() == "start" }?.value ?: arguments.first().value) as Long
            val end = (arguments.firstOrNull { it.name?.asString() == "end" }?.value ?: arguments[1].value) as Long
            val step = ((arguments.firstOrNull { it.name?.asString() == "step" }?.value ?: arguments[2].value) as? Long) ?: -1
            val or = rangeEnum

            LongRangeHintAnnotation(
                start,
                end,
                step,
                or
            )
        }
        godot.annotation.FloatRange::class.qualifiedName -> {
            val start = (arguments.firstOrNull { it.name?.asString() == "start" }?.value ?: arguments.first().value) as Float
            val end = (arguments.firstOrNull { it.name?.asString() == "end" }?.value ?: arguments[1].value) as Float
            val step = ((arguments.firstOrNull { it.name?.asString() == "step" }?.value ?: arguments[2].value) as? Float) ?: -1f
            val or = rangeEnum

            FloatRangeHintAnnotation(
                start,
                end,
                step,
                or
            )
        }
        godot.annotation.DoubleRange::class.qualifiedName -> {
            val start = (arguments.firstOrNull { it.name?.asString() == "start" }?.value ?: arguments.first().value) as Double
            val end = (arguments.firstOrNull { it.name?.asString() == "end" }?.value ?: arguments[1].value) as Double
            val step = ((arguments.firstOrNull { it.name?.asString() == "step" }?.value ?: arguments[2].value) as? Double) ?: -1.0
            val or = rangeEnum

            DoubleRangeHintAnnotation(
                start,
                end,
                step,
                or
            )
        }
        EnumTypeHint::class.qualifiedName -> null
        ExpEasing::class.qualifiedName -> {
            val attenuation = ((arguments.firstOrNull { it.name?.asString() == "attenuation" }?.value ?: arguments.firstOrNull()?.value) as? Boolean) ?: false
            val inout = ((arguments.firstOrNull { it.name?.asString() == "inout" }?.value ?: arguments[1].value) as? Boolean) ?: false
            ExpEasingHintAnnotation(
                attenuation,
                inout
            )
        }
        godot.annotation.File::class.qualifiedName -> {
            @Suppress("UNCHECKED_CAST")
            val extensions = ((arguments.firstOrNull { it.name?.asString() == "extensions" }?.value ?: arguments.firstOrNull()?.value) as? ArrayList<String>)?.toList() ?: emptyList()
            val global = ((arguments.firstOrNull { it.name?.asString() == "global" }?.value ?: arguments[1].value) as? Boolean) ?: false
            FileHintAnnotation(
                extensions, global
            )
        }
        Dir::class.qualifiedName -> {
            val global = ((arguments.firstOrNull { it.name?.asString() == "global" }?.value ?: arguments.firstOrNull()?.value) as? Boolean) ?: false
            DirHintAnnotation(
                global
            )
        }
        else -> null
    }
}
