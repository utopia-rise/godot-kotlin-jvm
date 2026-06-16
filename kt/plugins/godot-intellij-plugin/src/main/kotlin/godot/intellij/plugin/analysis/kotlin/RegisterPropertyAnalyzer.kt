package godot.intellij.plugin.analysis.kotlin

import godot.annotation.ColorNoAlpha
import godot.annotation.Dir
import godot.annotation.DoubleRange
import godot.annotation.EnumTypeHint
import godot.annotation.ExpEasing
import godot.annotation.Export
import godot.annotation.File
import godot.annotation.FloatRange
import godot.annotation.IntFlag
import godot.annotation.IntRange
import godot.annotation.LongRange
import godot.annotation.MultilineText
import godot.annotation.PlaceHolderText
import godot.annotation.Visible
import godot.core.KtObject
import godot.core.VariantArray
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.analysis.GodotProblem
import godot.intellij.plugin.analysis.jvm.GenericRegistrationAnalyzer
import org.jetbrains.kotlin.scripting.resolve.classId
import godot.intellij.plugin.project.isBitField
import godot.intellij.plugin.project.isCoreType
import godot.intellij.plugin.project.isGodotPrimitive
import godot.intellij.plugin.project.isNullable
import godot.intellij.plugin.project.isOrInheritsType
import godot.intellij.plugin.project.isSupportedJvmType
import godot.intellij.plugin.project.withType
import godot.intellij.plugin.quickfix.PropertyNotRegisteredQuickFix
import org.jetbrains.kotlin.analysis.api.KaExperimentalApi
import org.jetbrains.kotlin.analysis.api.analyze
import org.jetbrains.kotlin.analysis.api.symbols.typeParameters
import org.jetbrains.kotlin.analysis.api.types.KaClassType
import org.jetbrains.kotlin.analysis.api.types.symbol
import org.jetbrains.kotlin.asJava.toLightElements
import org.jetbrains.kotlin.idea.codeinsight.utils.isEnum
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtEnumEntry
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.utils.addToStdlib.firstIsInstance

object VisibleAnalyzer {
    private const val MAX_ENUM_ENTRIES_FOR_BIT_FLAG = 32

    fun analyze(property: KtProperty): List<GodotProblem> {
        return buildList {
            if (property.isRegisteredPropertyLike()) {
                addAll(GenericRegistrationAnalyzer.analyze(property.toLightElements().firstIsInstance()))
                addAll(checkRegisteredType(property))
                if (property.hasModifier(org.jetbrains.kotlin.lexer.KtTokens.LATEINIT_KEYWORD) && (property.isCoreType() || property.isGodotPrimitive())) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.property.lateinit.coreType"),
                            property.nameIdentifier ?: property.navigationElement
                        )
                    )
                }
                if (property.isNullable() && (property.isCoreType() == true || property.isGodotPrimitive() == true)) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.property.nullable"),
                            property.nameIdentifier ?: property.navigationElement
                        )
                    )
                }
            }
        }
    }

    private fun KtProperty.isRegisteredPropertyLike(): Boolean =
        findAnnotation(Visible::class.classId) != null ||
            findAnnotation(Export::class.classId) != null ||
            findAnnotation(IntRange::class.classId) != null ||
            findAnnotation(LongRange::class.classId) != null ||
            findAnnotation(FloatRange::class.classId) != null ||
            findAnnotation(DoubleRange::class.classId) != null ||
            findAnnotation(EnumTypeHint::class.classId) != null ||
            findAnnotation(ExpEasing::class.classId) != null ||
            findAnnotation(IntFlag::class.classId) != null ||
            findAnnotation(File::class.classId) != null ||
            findAnnotation(Dir::class.classId) != null ||
            findAnnotation(MultilineText::class.classId) != null ||
            findAnnotation(PlaceHolderText::class.classId) != null ||
            findAnnotation(ColorNoAlpha::class.classId) != null

    @OptIn(KaExperimentalApi::class)
    private fun checkRegisteredType(property: KtProperty): List<GodotProblem> {
        val problems = mutableListOf<GodotProblem>()

        val isEnumVariantArray = property.withType { propertyType ->
            propertyType.symbol?.classId?.asFqNameString()?.startsWith(VariantArray::class.qualifiedName!!) == true
                && propertyType.symbol?.typeParameters?.firstOrNull()?.defaultType?.isEnum() == true
        }
        if (isEnumVariantArray) {
            problems += GodotProblem(
                GodotPluginBundle.message("problem.property.registeredEnumListWithVariantArray"),
                property.initializer?.psiOrParent ?: property.nameIdentifier ?: property.navigationElement
            )
        }

        val isInheritingObject = property.isOrInheritsType(KtObject::class.classId)
        if (!isInheritingObject && !property.isCoreType() && !property.isSupportedJvmType()) {
            problems += GodotProblem(
                GodotPluginBundle.message("problem.property.export.triedToExportUnsupportedType"),
                property.nameIdentifier ?: property.navigationElement
            )
        }

        if (property.isBitField()) {
            val enumEntryCount = property.withType { propertyType ->
                (propertyType as? KaClassType)
                    ?.typeArguments
                    ?.firstOrNull()
                    ?.type
                    ?.symbol
                    ?.psi
                    ?.let { it as? KtClass }
                    ?.declarations
                    ?.filterIsInstance<KtEnumEntry>()
                    ?.size ?: 0
            }
            if (enumEntryCount > MAX_ENUM_ENTRIES_FOR_BIT_FLAG) {
                problems += GodotProblem(
                    GodotPluginBundle.message("problem.property.hint.toManyEnumEntries"),
                    property.initializer?.psiOrParent ?: property.nameIdentifier ?: property.navigationElement
                )
            }
        }

        return problems
    }
}

