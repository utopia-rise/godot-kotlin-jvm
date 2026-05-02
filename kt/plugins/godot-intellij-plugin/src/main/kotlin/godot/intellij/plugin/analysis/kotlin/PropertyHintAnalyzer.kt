package godot.intellij.plugin.analysis.kotlin

import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.analysis.EXPORT_ANNOTATION
import godot.intellij.plugin.analysis.GodotProblem
import godot.intellij.plugin.analysis.REGISTER_PROPERTY_ANNOTATION
import godot.intellij.plugin.project.asClassId
import godot.intellij.plugin.project.fqName
import godot.intellij.plugin.quickfix.PropertyNotExportedQuickFix
import godot.intellij.plugin.quickfix.PropertyNotRegisteredQuickFix
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.godotAnnotationPackage
import godot.tools.common.constants.godotCorePackage
import org.jetbrains.kotlin.analysis.api.analyze
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
            property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.intRange}")) != null -> {
                checkForRegistrationAnnotations(property) + checkIntRange(property)
            }

            property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.longRange}")) != null -> {
                checkForRegistrationAnnotations(property) + checkLongRange(property)
            }

            property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.floatRange}")) != null -> {
                checkForRegistrationAnnotations(property) + checkFloatRange(property)
            }

            property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.doubleRange}")) != null -> {
                checkForRegistrationAnnotations(property) + checkDoubleRange(property)
            }

            property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.expRange}")) != null -> {
                checkForRegistrationAnnotations(property) + checkExpRange(property)
            }

            property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.expEasing}")) != null -> {
                checkForRegistrationAnnotations(property) + checkExpEasing(property)
            }

            property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.enumTypeHint}")) != null -> {
                checkForRegistrationAnnotations(property) + checkEnumTypeHint(property)
            }

            property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.enumFlag}")) != null -> {
                checkForRegistrationAnnotations(property) + checkEnumFlag(property)
            }

            property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.intFlag}")) != null -> {
                checkForRegistrationAnnotations(property) + checkIntFlag(property)
            }

            property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.file}")) != null -> {
                checkForRegistrationAnnotations(property) + checkFile(property)
            }

            property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.dir}")) != null -> {
                checkForRegistrationAnnotations(property) + checkDir(property)
            }

            property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.multilineText}")) != null -> {
                checkForRegistrationAnnotations(property) + checkMultilineText(property)
            }

            property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.placeHolderText}")) != null -> {
                checkForRegistrationAnnotations(property) + checkPlaceholderText(property)
            }

            property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.colorNoAlpha}")) != null -> {
                checkForRegistrationAnnotations(property) + checkColorNoAlpha(property)
            }

            else -> emptyList()
        }
    }

    private fun checkColorNoAlpha(property: KtProperty): List<GodotProblem> {
        if (property.fqName() == "$godotCorePackage.${GodotTypes.color}") return emptyList()
        return listOf(
            GodotProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", "$godotCorePackage.${GodotTypes.color}"),
                property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.colorNoAlpha}"))?.psiOrParent
                    ?: property.nameIdentifier
                    ?: property.navigationElement
            )
        )
    }

    private fun checkPlaceholderText(property: KtProperty): List<GodotProblem> {
        return checkStringPropertyType(property, GodotKotlinJvmTypes.Annotations.placeHolderText)
    }

    private fun checkMultilineText(property: KtProperty): List<GodotProblem> {
        return checkStringPropertyType(property, GodotKotlinJvmTypes.Annotations.multilineText)
    }

    private fun checkDir(property: KtProperty): List<GodotProblem> {
        return checkStringPropertyType(property, GodotKotlinJvmTypes.Annotations.dir)
    }

    private fun checkFile(property: KtProperty): List<GodotProblem> {
        return checkStringPropertyType(property, GodotKotlinJvmTypes.Annotations.file)
    }

    private fun checkStringPropertyType(property: KtProperty, annotationName: String): List<GodotProblem> {
        if (property.fqName() == String::class.qualifiedName) return emptyList()
        return listOf(
            GodotProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", String::class.qualifiedName.toString()),
                property.findAnnotation(asClassId("$godotAnnotationPackage.$annotationName"))?.psiOrParent
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
                GodotPluginBundle.message("problem.property.hint.wrongType", Int::class.qualifiedName.toString()),
                property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.intFlag}"))?.psiOrParent
                    ?: property.nameIdentifier
                    ?: property.navigationElement
            )
        )
    }

    private fun checkEnumFlag(property: KtProperty): List<GodotProblem> {
        if (property.fqName()?.matches(Regex("^kotlin\\.collections\\..*Set$")) == false) {
            return listOf(
                GodotProblem(
                    GodotPluginBundle.message("problem.property.hint.wrongType", "kotlin.collections.Set or kotlin.collections.MutableSet"),
                    property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.enumFlag}"))?.psiOrParent
                        ?: property.nameIdentifier
                        ?: property.navigationElement
                )
            )
        }

        val numberOfEnumEntriesInEnum = analyze(property) {
            property.returnType.symbol?.psi
                ?.let { it as? KtClass }
                ?.declarations
                ?.filterIsInstance<KtEnumEntry>()
                ?.size ?: 0
        }

        if (numberOfEnumEntriesInEnum <= MAX_ENUM_ENTRIES_FOR_ENUM_FLAGS) return emptyList()
        return listOf(
            GodotProblem(
                GodotPluginBundle.message("problem.property.hint.toManyEnumEntries"),
                property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.enumFlag}"))?.psiOrParent
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
                GodotPluginBundle.message("problem.property.hint.wrongType", Enum::class.qualifiedName.toString()),
                property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.enumTypeHint}"))?.psiOrParent
                    ?: property.nameIdentifier
                    ?: property.navigationElement
            )
        )
    }

    private fun checkExpEasing(property: KtProperty): List<GodotProblem> {
        return checkRealTypeProperty(property, GodotKotlinJvmTypes.Annotations.expEasing)
    }

    private fun checkExpRange(property: KtProperty): List<GodotProblem> {
        return checkRealTypeProperty(property, GodotKotlinJvmTypes.Annotations.expRange)
    }

    private fun checkRealTypeProperty(property: KtProperty, annotationName: String): List<GodotProblem> {
        val isRealType = analyze(property) {
            val type = property.returnType
            type.isFloatType || type.isDoubleType
        }
        if (isRealType) return emptyList()
        return listOf(
            GodotProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", "${Float::class.qualifiedName} or ${Double::class.qualifiedName}"),
                property.findAnnotation(asClassId("$godotAnnotationPackage.$annotationName"))?.psiOrParent
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
                GodotPluginBundle.message("problem.property.hint.wrongType", Double::class.qualifiedName.toString()),
                property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.doubleRange}"))?.psiOrParent
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
                GodotPluginBundle.message("problem.property.hint.wrongType", Float::class.qualifiedName.toString()),
                property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.floatRange}"))?.psiOrParent
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
                GodotPluginBundle.message("problem.property.hint.wrongType", Long::class.qualifiedName.toString()),
                property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.longRange}"))?.psiOrParent
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
                GodotPluginBundle.message("problem.property.hint.wrongType", Int::class.qualifiedName.toString()),
                property.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.intRange}"))?.psiOrParent
                    ?: property.nameIdentifier
                    ?: property.navigationElement
            )
        )
    }

    private fun checkForRegistrationAnnotations(property: KtProperty): List<GodotProblem> {
        return buildList {
            if (property.findAnnotation(asClassId(REGISTER_PROPERTY_ANNOTATION)) == null) {
                add(
                    GodotProblem(
                        GodotPluginBundle.message("problem.property.hint.notRegistered"),
                        property.nameIdentifier ?: property.navigationElement,
                        arrayOf(propertyNotRegisteredQuickFix)
                    )
                )
            }
            if (property.findAnnotation(asClassId(EXPORT_ANNOTATION)) == null) {
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
