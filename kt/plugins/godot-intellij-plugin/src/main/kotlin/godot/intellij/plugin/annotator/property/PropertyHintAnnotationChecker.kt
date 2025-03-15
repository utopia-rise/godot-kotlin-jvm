package godot.intellij.plugin.annotator.property

import com.intellij.lang.annotation.AnnotationHolder
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.model.EXPORT_ANNOTATION
import godot.intellij.plugin.data.model.REGISTER_PROPERTY_ANNOTATION
import godot.intellij.plugin.extension.asClassId
import godot.intellij.plugin.extension.fqName
import godot.intellij.plugin.extension.registerProblem
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

class PropertyHintAnnotationChecker {
    private val propertyNotRegisteredQuickFix by lazy { PropertyNotRegisteredQuickFix() }
    private val propertyNotExportedQuickFix by lazy { PropertyNotExportedQuickFix() }

    fun checkPropertyHintAnnotations(ktProperty: KtProperty, holder: AnnotationHolder) {
        when {
            ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.intRange}")) != null -> checkIntRange(ktProperty, holder)
            ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.longRange}")) != null -> checkLongRange(ktProperty, holder)
            ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.floatRange}")) != null -> checkFloatRange(ktProperty, holder)
            ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.doubleRange}")) != null -> checkDoubleRange(ktProperty, holder)
            ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.expRange}")) != null -> checkExpRange(ktProperty, holder)
            ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.expEasing}")) != null -> checkExpEasing(ktProperty, holder)
            ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.enumTypeHint}")) != null -> checkEnumTypeHint(ktProperty, holder)
            ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.enumFlag}")) != null -> checkEnumFlag(ktProperty, holder)
            ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.intFlag}")) != null -> checkIntFlag(ktProperty, holder)
            ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.file}")) != null -> checkFile(ktProperty, holder)
            ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.dir}")) != null -> checkDir(ktProperty, holder)
            ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.multilineText}")) != null -> checkMultilineText(ktProperty, holder)
            ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.placeHolderText}")) != null -> checkPlaceholderText(ktProperty, holder)
            ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.colorNoAlpha}")) != null -> checkColorNoAlpha(ktProperty, holder)
        }
    }

    private fun checkColorNoAlpha(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        if (ktProperty.fqName() != "$godotCorePackage.${GodotTypes.color}") {
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", "$godotCorePackage.${GodotTypes.color}"),
                ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.colorNoAlpha}"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkPlaceholderText(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        if (ktProperty.fqName() != String::class.qualifiedName) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", String::class.qualifiedName.toString()),
                ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.placeHolderText}"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkMultilineText(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        if (ktProperty.fqName() != String::class.qualifiedName) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", String::class.qualifiedName.toString()),
                ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.multilineText}"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkDir(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        if (ktProperty.fqName() != String::class.qualifiedName) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", String::class.qualifiedName.toString()),
                ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.dir}"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkFile(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        if (ktProperty.fqName() != String::class.qualifiedName) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", String::class.qualifiedName.toString()),
                ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.file}"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkIntFlag(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        val isInt = analyze(ktProperty) {
            ktProperty.returnType.isIntType
        }
        if (isInt) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", Int::class.qualifiedName.toString()),
                ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.intFlag}"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkEnumFlag(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        if (ktProperty.fqName()?.matches(Regex("^kotlin\\.collections\\..*Set\$")) == false) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", "kotlin.collections.Set or kotlin.collections.MutableSet"),
                ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.enumFlag}"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        } else {
            val numberOfEnumEntriesInEnum = analyze(ktProperty) {
                ktProperty
                    .returnType
                    .symbol
                    ?.psi
                    ?.let { it as? KtClass }
                    ?.declarations
                    ?.filterIsInstance<KtEnumEntry>()
                    ?.size ?: 0
            }

            if (numberOfEnumEntriesInEnum > MAX_ENUM_ENTRIES_FOR_ENUM_FLAGS) {
                holder.registerProblem(
                    GodotPluginBundle.message("problem.property.hint.toManyEnumEntries"),
                    ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.enumFlag}"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
                )
            }
        }
    }

    private fun checkEnumTypeHint(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        val isEnum = analyze(ktProperty) {
            ktProperty.returnType.isEnum()
        }
        if (!isEnum) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", Enum::class.qualifiedName.toString()),
                ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.enumTypeHint}"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkExpEasing(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        val isRealType = analyze(ktProperty) {
            val type = ktProperty.returnType
            type.isFloatType || type.isDoubleType
        }
        if (!isRealType) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", "${Float::class.qualifiedName} or ${Double::class.qualifiedName}"),
                ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.expEasing}"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkExpRange(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        val isRealType = analyze(ktProperty) {
            val type = ktProperty.returnType
            type.isFloatType || type.isDoubleType
        }
        if (!isRealType) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", "${Float::class.qualifiedName} or ${Double::class.qualifiedName}"),
                ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.expRange}"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkDoubleRange(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        val isDouble = analyze(ktProperty) {
            ktProperty.returnType.isDoubleType
        }
        if (!isDouble) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", Double::class.qualifiedName.toString()),
                ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.doubleRange}"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkFloatRange(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        val isFloat = analyze(ktProperty) {
            ktProperty.returnType.isFloatType
        }
        if (!isFloat) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", Float::class.qualifiedName.toString()),
                ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.floatRange}"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkLongRange(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        val isLong = analyze(ktProperty) {
            ktProperty.returnType.isLongType
        }
        if (!isLong) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", Long::class.qualifiedName.toString()),
                ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.longRange}"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkIntRange(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        val isInt = analyze(ktProperty) {
            ktProperty.returnType.isIntType
        }
        if (!isInt) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.hint.wrongType", Int::class.qualifiedName.toString()),
                ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.intRange}"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkForRegistrationAnnotation(ktProperty: KtProperty, holder: AnnotationHolder) {
        if (ktProperty.findAnnotation(asClassId(REGISTER_PROPERTY_ANNOTATION)) == null) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.hint.notRegistered"),
                ktProperty.nameIdentifier ?: ktProperty.navigationElement,
                propertyNotRegisteredQuickFix
            )
        }
        if (ktProperty.findAnnotation(asClassId(EXPORT_ANNOTATION)) == null) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.hint.notExported"),
                ktProperty.nameIdentifier ?: ktProperty.navigationElement,
                propertyNotExportedQuickFix
            )
        }
    }
}
