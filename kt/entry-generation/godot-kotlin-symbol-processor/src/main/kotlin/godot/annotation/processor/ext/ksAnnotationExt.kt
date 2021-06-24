package godot.annotation.processor.ext

import com.google.devtools.ksp.symbol.KSAnnotation
import com.google.devtools.ksp.symbol.KSType
import godot.MultiplayerAPI
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
import godot.annotation.Tool
import godot.entrygenerator.model.ColorNoAlphaHintAnnotation
import godot.entrygenerator.model.DirHintAnnotation
import godot.entrygenerator.model.DoubleRangeHintAnnotation
import godot.entrygenerator.model.EnumFlagHintAnnotation
import godot.entrygenerator.model.ExpEasingHintAnnotation
import godot.entrygenerator.model.ExpRangeHintAnnotation
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
import godot.entrygenerator.model.RpcMode
import godot.entrygenerator.model.ToolAnnotation

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
                godot.registration.Range.NONE::class.qualifiedName -> Range.NONE
                godot.registration.Range.OR_GREATER::class.qualifiedName -> Range.OR_GREATER
                godot.registration.Range.OR_LESSER::class.qualifiedName -> Range.OR_LESSER
                else -> throw IllegalArgumentException("Unknown enum $enumFqName for hint annotation IntRange")
            }
        } ?: Range.NONE

val KSAnnotation.rpcModeEnum: RpcMode
    get() = when ((arguments.firstOrNull()?.value as? KSType)?.declaration?.qualifiedName?.asString()) {
        "${MultiplayerAPI.RPCMode.REMOTE::class.qualifiedName}.${MultiplayerAPI.RPCMode.REMOTE.name}" -> RpcMode.REMOTE
        "${MultiplayerAPI.RPCMode.MASTER::class.qualifiedName}.${MultiplayerAPI.RPCMode.MASTER.name}" -> RpcMode.MASTER
        "${MultiplayerAPI.RPCMode.PUPPET::class.qualifiedName}.${MultiplayerAPI.RPCMode.PUPPET.name}" -> RpcMode.PUPPET
        "${MultiplayerAPI.RPCMode.SLAVE::class.qualifiedName}.${MultiplayerAPI.RPCMode.SLAVE.name}" -> RpcMode.SLAVE
        "${MultiplayerAPI.RPCMode.REMOTESYNC::class.qualifiedName}.${MultiplayerAPI.RPCMode.REMOTESYNC.name}" -> RpcMode.REMOTE_SYNC
        "${MultiplayerAPI.RPCMode.SYNC::class.qualifiedName}.${MultiplayerAPI.RPCMode.SYNC.name}" -> RpcMode.SYNC
        "${MultiplayerAPI.RPCMode.MASTERSYNC::class.qualifiedName}.${MultiplayerAPI.RPCMode.MASTERSYNC.name}" -> RpcMode.MASTER_SYNC
        "${MultiplayerAPI.RPCMode.PUPPETSYNC::class.qualifiedName}.${MultiplayerAPI.RPCMode.PUPPETSYNC.name}" -> RpcMode.PUPPET_SYNC
        else -> RpcMode.DISABLED
    }

fun KSAnnotation.mapToAnnotation(): GodotAnnotation? {
    return when (fqNameUnsafe) {
        RegisterClass::class.qualifiedName -> RegisterClassAnnotation(
            arguments.first().value as? String
        )
        RegisterConstructor::class.qualifiedName -> RegisterConstructorAnnotation
        RegisterFunction::class.qualifiedName -> {
            val rpcMode = rpcModeEnum
            RegisterFunctionAnnotation(
                rpcMode
            )
        }
        RegisterProperty::class.qualifiedName -> {
            val rpcMode = rpcModeEnum
            RegisterPropertyAnnotation(
                rpcMode
            )
        }
        RegisterSignal::class.qualifiedName -> RegisterSignalAnnotation
        Tool::class.qualifiedName -> ToolAnnotation
        Export::class.qualifiedName -> ExportAnnotation
        "godot.annotation.GodotBaseType" -> GodotBaseTypeAnnotation //is internal
        EnumFlag::class.qualifiedName -> EnumFlagHintAnnotation
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
        godot.annotation.ExpRange::class.qualifiedName -> {
            val start = (arguments.firstOrNull { it.name?.asString() == "start" }?.value ?: arguments.first().value) as Float
            val end = (arguments.firstOrNull { it.name?.asString() == "end" }?.value ?: arguments[1].value) as Float
            val step = ((arguments.firstOrNull { it.name?.asString() == "step" }?.value ?: arguments[2].value) as? Float) ?: -1f

            ExpRangeHintAnnotation(
                start,
                end,
                step
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
        else -> throw IllegalArgumentException(
            "Unknown annotation: ${this.fqNameUnsafe}"
        )
    }
}
