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
import godot.annotation.GodotMember
import godot.annotation.GodotScript
import godot.annotation.IntFlag
import godot.annotation.MultilineText
import godot.annotation.PlaceHolderText
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
import godot.entrygenerator.model.GodotMemberAnnotation
import godot.entrygenerator.model.GodotScriptAnnotation
import godot.entrygenerator.model.IntFlagHintAnnotation
import godot.entrygenerator.model.MultilineTextHintAnnotation
import godot.entrygenerator.model.PlaceHolderTextHintAnnotation
import godot.entrygenerator.model.Range
import godot.entrygenerator.model.RangeHintAnnotation
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

internal fun KSAnnotation.mapToAnnotation(parentDeclaration: KSDeclaration): List<GodotAnnotation> {
    return when (fqNameUnsafe) {
        GodotScript::class.qualifiedName -> listOf(
            GodotScriptAnnotation(
                customName = arguments.first().value as? String,
                symbolProcessorSource = this
            )
        )
        GodotMember::class.qualifiedName -> listOf(
            GodotMemberAnnotation(this)
        )
        Tool::class.qualifiedName -> listOf(
            ToolAnnotation(this)
        )
        Export::class.qualifiedName -> listOf(
            ExportAnnotation(this),
            GodotMemberAnnotation(this),
        )
        Rpc::class.qualifiedName -> listOf(
            RpcAnnotation(
                rpcMode = rpcModeEnum,
                sync = rpcSyncEnum,
                transferMode = rpcTransferModeEnum,
                transferChannel = rpcChannel,
                symbolProcessorSource = this
            ),
            GodotMemberAnnotation(this),
        )
        "godot.annotation.GodotBaseType" -> listOf(
            GodotBaseTypeAnnotation(this) //is internal
        )
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

            listOf(
                EnumFlagHintStringAnnotation(enumValueNames = enumValueNames, source = this),
                ExportAnnotation(this),
                GodotMemberAnnotation(this),
            )
        }
        IntFlag::class.qualifiedName -> listOf(
            IntFlagHintAnnotation(
                @Suppress("UNCHECKED_CAST")
                (arguments.firstOrNull()?.value as? ArrayList<String>)?.toList() ?: emptyList(),
                this
            ),
            ExportAnnotation(this),
            GodotMemberAnnotation(this),
        )
        MultilineText::class.qualifiedName -> listOf(
            MultilineTextHintAnnotation(this),
            ExportAnnotation(this),
            GodotMemberAnnotation(this),
        )
        PlaceHolderText::class.qualifiedName -> listOf(
            PlaceHolderTextHintAnnotation(this),
            ExportAnnotation(this),
            GodotMemberAnnotation(this),
        )
        ColorNoAlpha::class.qualifiedName -> listOf(
            ColorNoAlphaHintAnnotation(this),
            ExportAnnotation(this),
            GodotMemberAnnotation(this),
        )
        godot.annotation.IntRange::class.qualifiedName -> listOf(
            provideRangeHintAnnotation(-1),
            ExportAnnotation(this),
            GodotMemberAnnotation(this),
        )
        godot.annotation.LongRange::class.qualifiedName -> listOf(
            provideRangeHintAnnotation(-1L),
            ExportAnnotation(this),
            GodotMemberAnnotation(this),
        )
        godot.annotation.FloatRange::class.qualifiedName -> listOf(
            provideRangeHintAnnotation(-1f),
            ExportAnnotation(this),
            GodotMemberAnnotation(this),
        )
        godot.annotation.DoubleRange::class.qualifiedName -> listOf(
            provideRangeHintAnnotation(-1.0),
            ExportAnnotation(this),
            GodotMemberAnnotation(this),
        )
        EnumTypeHint::class.qualifiedName -> emptyList()
        ExpEasing::class.qualifiedName -> {
            val attenuation = ((arguments.firstOrNull { it.name?.asString() == "attenuation" }?.value ?: arguments.firstOrNull()?.value) as? Boolean) ?: false
            val isPositiveOnly = ((arguments.firstOrNull { it.name?.asString() == "isPositiveOnly" }?.value ?: arguments[1].value) as? Boolean) ?: false

            listOf(
                ExpEasingHintAnnotation(
                    attenuation = attenuation,
                    isPositiveOnly = isPositiveOnly,
                    source = this
                ),
                ExportAnnotation(this),
                GodotMemberAnnotation(this),
            )
        }
        godot.annotation.File::class.qualifiedName -> {
            @Suppress("UNCHECKED_CAST")
            val extensions = ((arguments.firstOrNull { it.name?.asString() == "extensions" }?.value ?: arguments.firstOrNull()?.value) as? ArrayList<String>)?.toList() ?: emptyList()
            val global = ((arguments.firstOrNull { it.name?.asString() == "global" }?.value ?: arguments[1].value) as? Boolean) ?: false

            listOf(
                FileHintAnnotation(
                    extensions = extensions,
                    global = global,
                    source = this
                ),
                ExportAnnotation(this),
                GodotMemberAnnotation(this),
            )
        }
        Dir::class.qualifiedName -> {
            val global =
                ((arguments.firstOrNull { it.name?.asString() == "global" }?.value ?: arguments.firstOrNull()?.value) as? Boolean) ?: false

            listOf(
                DirHintAnnotation(
                    global = global,
                    source = this
                ),
                ExportAnnotation(this),
                GodotMemberAnnotation(this),
            )
        }
        else -> emptyList()
    }
}

@Suppress("UNCHECKED_CAST")
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
        suffix = suffix,
        symbolProcessorSource = this
    )
}
