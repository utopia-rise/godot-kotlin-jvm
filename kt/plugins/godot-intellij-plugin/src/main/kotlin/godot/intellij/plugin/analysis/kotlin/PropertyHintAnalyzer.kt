package godot.intellij.plugin.analysis.kotlin

import com.squareup.kotlinpoet.DOUBLE
import com.squareup.kotlinpoet.FLOAT
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.ClassName
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.analysis.GodotProblem
import godot.intellij.plugin.project.asClassId
import godot.intellij.plugin.project.fqName
import godot.intellij.plugin.quickfix.PropertyNotExportedQuickFix
import godot.intellij.plugin.quickfix.PropertyNotRegisteredQuickFix
import godot.tools.common.names.Annotation
import godot.tools.common.names.CoreType
import godot.tools.common.names.Kotlin
import godot.tools.common.names.qualifiedName
import org.jetbrains.kotlin.analysis.api.analyze
import org.jetbrains.kotlin.analysis.api.types.KaClassType
import org.jetbrains.kotlin.analysis.api.types.symbol
import org.jetbrains.kotlin.idea.codeinsight.utils.isEnum
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtEnumEntry
import org.jetbrains.kotlin.psi.KtProperty

private const val MAX_ENUM_ENTRIES_FOR_ENUM_FLAGS = 32

object PropertyHintAnalyzer {
    private val propertyNotRegisteredQuickFix by lazy { PropertyNotRegisteredQuickFix() }
    private val propertyNotExportedQuickFix by lazy { PropertyNotExportedQuickFix() }

    fun analyze(property: KtProperty): List<GodotProblem> {
        return when {
            property.findAnnotation(Annotation.intRange.asClassId()) != null -> {
                checkForRegistrationAnnotations(property) + checkIntRange(property)
            }

            property.findAnnotation(Annotation.longRange.asClassId()) != null -> {
                checkForRegistrationAnnotations(property) + checkLongRange(property)
            }

            property.findAnnotation(Annotation.floatRange.asClassId()) != null -> {
                checkForRegistrationAnnotations(property) + checkFloatRange(property)
            }

            property.findAnnotation(Annotation.doubleRange.asClassId()) != null -> {
                checkForRegistrationAnnotations(property) + checkDoubleRange(property)
            }

            property.findAnnotation(Annotation.expRange.asClassId()) != null -> {
                checkForRegistrationAnnotations(property) + checkExpRange(property)
            }

            property.findAnnotation(Annotation.expEasing.asClassId()) != null -> {
                checkForRegistrationAnnotations(property) + checkExpEasing(property)
            }

            property.findAnnotation(Annotation.enumTypeHint.asClassId()) != null -> {
                checkForRegistrationAnnotations(property) + checkEnumTypeHint(property)
            }

            property.findAnnotation(Annotation.enumFlag.asClassId()) != null -> {
                checkForRegistrationAnnotations(property) + checkEnumFlag(property)
            }

            property.findAnnotation(Annotation.intFlag.asClassId()) != null -> {
                checkForRegistrationAnnotations(property) + checkIntFlag(property)
            }

            property.findAnnotation(Annotation.file.asClassId()) != null -> {
                checkForRegistrationAnnotations(property) + checkFile(property)
            }

            property.findAnnotation(Annotation.dir.asClassId()) != null -> {
                checkForRegistrationAnnotations(property) + checkDir(property)
            }

            property.findAnnotation(Annotation.multilineText.asClassId()) != null -> {
                checkForRegistrationAnnotations(property) + checkMultilineText(property)
            }

            property.findAnnotation(Annotation.placeHolderText.asClassId()) != null -> {
                checkForRegistrationAnnotations(property) + checkPlaceholderText(property)
            }

            property.findAnnotation(Annotation.colorNoAlpha.asClassId()) != null -> {
                checkForRegistrationAnnotations(property) + checkColorNoAlpha(property)
            }

            else -> emptyList()
        }
    }

    private fun checkColorNoAlpha(property: KtProperty): List<GodotProblem> {
        if (property.fqName() == CoreType.color.qualifiedName) return emptyList()
        return listOf(
            GodotProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", CoreType.color.qualifiedName),
                property.findAnnotation(Annotation.colorNoAlpha.asClassId())?.psiOrParent
                    ?: property.nameIdentifier
                    ?: property.navigationElement
            )
        )
    }

    private fun checkPlaceholderText(property: KtProperty): List<GodotProblem> {
        return checkStringPropertyType(property, Annotation.placeHolderText)
    }

    private fun checkMultilineText(property: KtProperty): List<GodotProblem> {
        return checkStringPropertyType(property, Annotation.multilineText)
    }

    private fun checkDir(property: KtProperty): List<GodotProblem> {
        return checkStringPropertyType(property, Annotation.dir)
    }

    private fun checkFile(property: KtProperty): List<GodotProblem> {
        return checkStringPropertyType(property, Annotation.file)
    }

    private fun checkStringPropertyType(property: KtProperty, annotation: ClassName): List<GodotProblem> {
        if (property.fqName() == STRING.toString()) return emptyList()
        return listOf(
            GodotProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", STRING.toString()),
                property.findAnnotation(annotation.asClassId())?.psiOrParent
                    ?: property.nameIdentifier
                    ?: property.navigationElement
            )
        )
    }

    private fun checkIntFlag(property: KtProperty): List<GodotProblem> {
        val isInt = analyze(property) { property.returnType.isIntType }
        if (isInt) return emptyList()
        return listOf(
            GodotProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", INT.toString()),
                property.findAnnotation(Annotation.intFlag.asClassId())?.psiOrParent
                    ?: property.nameIdentifier
                    ?: property.navigationElement
            )
        )
    }

    private fun checkEnumFlag(property: KtProperty): List<GodotProblem> {
        if (property.fqName()?.let { it == Kotlin.set.qualifiedName || it == Kotlin.mutableSet.qualifiedName } == false) {
            return listOf(
                GodotProblem(
                    GodotPluginBundle.message("problem.property.hint.wrongType", "${Kotlin.set.qualifiedName} or ${Kotlin.mutableSet.qualifiedName}"),
                    property.findAnnotation(Annotation.enumFlag.asClassId())?.psiOrParent
                        ?: property.nameIdentifier
                        ?: property.navigationElement
                )
            )
        }

        val numberOfEnumEntriesInEnum = analyze(property) {
            ((property.returnType as? KaClassType)
                ?.typeArguments
                ?.firstOrNull()
                ?.type
                ?: property.returnType)
                .symbol
                ?.psi
                ?.let { it as? KtClass }
                ?.declarations
                ?.filterIsInstance<KtEnumEntry>()
                ?.size ?: 0
        }

        if (numberOfEnumEntriesInEnum <= MAX_ENUM_ENTRIES_FOR_ENUM_FLAGS) return emptyList()
        return listOf(
            GodotProblem(
                GodotPluginBundle.message("problem.property.hint.toManyEnumEntries"),
                property.findAnnotation(Annotation.enumFlag.asClassId())?.psiOrParent
                    ?: property.nameIdentifier
                    ?: property.navigationElement
            )
        )
    }

    private fun checkEnumTypeHint(property: KtProperty): List<GodotProblem> {
        val isEnum = analyze(property) { property.returnType.isEnum() }
        if (isEnum) return emptyList()
        return listOf(
            GodotProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", Kotlin.enum.qualifiedName),
                property.findAnnotation(Annotation.enumTypeHint.asClassId())?.psiOrParent
                    ?: property.nameIdentifier
                    ?: property.navigationElement
            )
        )
    }

    private fun checkExpEasing(property: KtProperty): List<GodotProblem> {
        return checkRealTypeProperty(property, Annotation.expEasing)
    }

    private fun checkExpRange(property: KtProperty): List<GodotProblem> {
        return checkRealTypeProperty(property, Annotation.expRange)
    }

    private fun checkRealTypeProperty(property: KtProperty, annotation: ClassName): List<GodotProblem> {
        val isRealType = analyze(property) {
            val type = property.returnType
            type.isFloatType || type.isDoubleType
        }
        if (isRealType) return emptyList()
        return listOf(
            GodotProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", "${FLOAT} or ${DOUBLE}"),
                property.findAnnotation(annotation.asClassId())?.psiOrParent
                    ?: property.nameIdentifier
                    ?: property.navigationElement
            )
        )
    }

    private fun checkDoubleRange(property: KtProperty): List<GodotProblem> {
        val isDouble = analyze(property) { property.returnType.isDoubleType }
        if (isDouble) return emptyList()
        return listOf(
            GodotProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", DOUBLE.toString()),
                property.findAnnotation(Annotation.doubleRange.asClassId())?.psiOrParent
                    ?: property.nameIdentifier
                    ?: property.navigationElement
            )
        )
    }

    private fun checkFloatRange(property: KtProperty): List<GodotProblem> {
        val isFloat = analyze(property) { property.returnType.isFloatType }
        if (isFloat) return emptyList()
        return listOf(
            GodotProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", FLOAT.toString()),
                property.findAnnotation(Annotation.floatRange.asClassId())?.psiOrParent
                    ?: property.nameIdentifier
                    ?: property.navigationElement
            )
        )
    }

    private fun checkLongRange(property: KtProperty): List<GodotProblem> {
        val isLong = analyze(property) { property.returnType.isLongType }
        if (isLong) return emptyList()
        return listOf(
            GodotProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", LONG.toString()),
                property.findAnnotation(Annotation.longRange.asClassId())?.psiOrParent
                    ?: property.nameIdentifier
                    ?: property.navigationElement
            )
        )
    }

    private fun checkIntRange(property: KtProperty): List<GodotProblem> {
        val isInt = analyze(property) { property.returnType.isIntType }
        if (isInt) return emptyList()
        return listOf(
            GodotProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", INT.toString()),
                property.findAnnotation(Annotation.intRange.asClassId())?.psiOrParent
                    ?: property.nameIdentifier
                    ?: property.navigationElement
            )
        )
    }

    private fun checkForRegistrationAnnotations(property: KtProperty): List<GodotProblem> {
        return buildList {
            if (property.findAnnotation(Annotation.registerProperty.asClassId()) == null) {
                add(
                    GodotProblem(
                        GodotPluginBundle.message("problem.property.hint.notRegistered"),
                        property.nameIdentifier ?: property.navigationElement,
                        arrayOf(propertyNotRegisteredQuickFix)
                    )
                )
            }
            if (property.findAnnotation(Annotation.export.asClassId()) == null) {
                add(
                    GodotProblem(
                        GodotPluginBundle.message("problem.property.hint.notExported"),
                        property.nameIdentifier ?: property.navigationElement,
                        arrayOf(propertyNotExportedQuickFix)
                    )
                )
            }
        }
    }
}
