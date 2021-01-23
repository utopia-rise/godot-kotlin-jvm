package godot.intellij.plugin.inspections.registration.inspector.property

import com.intellij.lang.annotation.AnnotationHolder
import godot.intellij.plugin.extension.registerProblem
import org.jetbrains.kotlin.idea.refactoring.fqName.fqName
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.js.resolve.diagnostics.findPsi
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.nj2k.postProcessing.type
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtEnumEntry
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.types.typeUtil.isDouble
import org.jetbrains.kotlin.types.typeUtil.isEnum
import org.jetbrains.kotlin.types.typeUtil.isFloat
import org.jetbrains.kotlin.types.typeUtil.isInt
import org.jetbrains.kotlin.types.typeUtil.isLong

private const val MAX_ENUM_ENTRIES_FOR_ENUM_FLAGS = 32

class PropertyHintAnnotationChecker {
    fun checkPropertyHintAnnotations(ktProperty: KtProperty, holder: AnnotationHolder) {
        when {
            ktProperty.findAnnotation(FqName("godot.annotation.IntRange")) != null -> checkIntRange(ktProperty, holder)
            ktProperty.findAnnotation(FqName("godot.annotation.LongRange")) != null -> checkLongRange(ktProperty, holder)
            ktProperty.findAnnotation(FqName("godot.annotation.FloatRange")) != null -> checkFloatRange(ktProperty, holder)
            ktProperty.findAnnotation(FqName("godot.annotation.DoubleRange")) != null -> checkDoubleRange(ktProperty, holder)
            ktProperty.findAnnotation(FqName("godot.annotation.ExpRange")) != null -> checkExpRange(ktProperty, holder)
            ktProperty.findAnnotation(FqName("godot.annotation.ExpEasing")) != null -> checkExpEasing(ktProperty, holder)
            ktProperty.findAnnotation(FqName("godot.annotation.EnumTypeHint")) != null -> checkEnumTypeHint(ktProperty, holder)
            ktProperty.findAnnotation(FqName("godot.annotation.EnumFlag")) != null -> checkEnumFlag(ktProperty, holder)
            ktProperty.findAnnotation(FqName("godot.annotation.IntFlag")) != null -> checkIntFlag(ktProperty, holder)
            ktProperty.findAnnotation(FqName("godot.annotation.File")) != null -> checkFile(ktProperty, holder)
            ktProperty.findAnnotation(FqName("godot.annotation.Dir")) != null -> checkDir(ktProperty, holder)
            ktProperty.findAnnotation(FqName("godot.annotation.MultilineText")) != null -> checkMultilineText(ktProperty, holder)
            ktProperty.findAnnotation(FqName("godot.annotation.PlaceHolderText")) != null -> checkPlaceholderText(ktProperty, holder)
            ktProperty.findAnnotation(FqName("godot.annotation.ColorNoAlpha")) != null -> checkColorNoAlpha(ktProperty, holder)
        }
    }

    private fun checkColorNoAlpha(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        if (ktProperty.type()?.getJetTypeFqName(false) != "godot.core.Color") {
            holder.registerProblem(
                "Property must be of type godot.core.Color",
                ktProperty.findAnnotation(FqName("godot.annotation.ColorNoAlpha"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkPlaceholderText(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        if (ktProperty.type()?.getJetTypeFqName(false) != "kotlin.String") {
            holder.registerProblem(
                "Property must be of type ${String::class.qualifiedName}",
                ktProperty.findAnnotation(FqName("godot.annotation.PlaceHolderText"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkMultilineText(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        if (ktProperty.type()?.getJetTypeFqName(false) != "kotlin.String") {
            holder.registerProblem(
                "Property must be of type ${String::class.qualifiedName}",
                ktProperty.findAnnotation(FqName("godot.annotation.MultilineText"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkDir(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        if (ktProperty.type()?.getJetTypeFqName(false) != "kotlin.String") {
            holder.registerProblem(
                "Property must be of type ${String::class.qualifiedName}",
                ktProperty.findAnnotation(FqName("godot.annotation.Dir"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkFile(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        if (ktProperty.type()?.getJetTypeFqName(false) != "kotlin.String") {
            holder.registerProblem(
                "Property must be of type ${String::class.qualifiedName}",
                ktProperty.findAnnotation(FqName("godot.annotation.File"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkIntFlag(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        if (ktProperty.type()?.isInt() == false) {
            holder.registerProblem(
                "Property must be of type ${Int::class.qualifiedName}",
                ktProperty.findAnnotation(FqName("godot.annotation.IntFlag"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkEnumFlag(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        if (ktProperty.type()?.fqName?.asString()?.matches(Regex("^kotlin\\.collections\\..*Set\$")) == false) {
            holder.registerProblem(
                "Property must be of type ${Set::class.qualifiedName} or ${MutableSet::class.qualifiedName}",
                ktProperty.findAnnotation(FqName("godot.annotation.EnumFlag"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        } else {
            val numberOfEnumEntriesInEnum = ktProperty
                .type()
                ?.constructor
                ?.declarationDescriptor
                ?.findPsi()
                ?.let { it as? KtClass }
                ?.declarations
                ?.filterIsInstance<KtEnumEntry>()
                ?.size ?: 0

            if (numberOfEnumEntriesInEnum > MAX_ENUM_ENTRIES_FOR_ENUM_FLAGS) {
                holder.registerProblem(
                    "Enums used as EnumFlags can only have a maximum of 32 entries",
                    ktProperty.findAnnotation(FqName("godot.annotation.EnumFlag"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
                )
            }
        }
    }

    private fun checkEnumTypeHint(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        if (ktProperty.type()?.isEnum() == false) {
            holder.registerProblem(
                "Property must be of type ${Enum::class.qualifiedName}",
                ktProperty.findAnnotation(FqName("godot.annotation.EnumTypeHint"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkExpEasing(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        if (ktProperty.type()?.isFloat() == false && ktProperty.type()?.isDouble() == false) {
            holder.registerProblem(
                "Property must be of type ${Float::class.qualifiedName} or ${Double::class.qualifiedName}",
                ktProperty.findAnnotation(FqName("godot.annotation.ExpEasing"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkExpRange(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        if (ktProperty.type()?.isFloat() == false && ktProperty.type()?.isDouble() == false) {
            holder.registerProblem(
                "Property must be of type ${Float::class.qualifiedName} or ${Double::class.qualifiedName}",
                ktProperty.findAnnotation(FqName("godot.annotation.ExpRange"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkDoubleRange(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        if (ktProperty.type()?.isDouble() == false) {
            holder.registerProblem(
                "Property must be of type ${Double::class.qualifiedName}",
                ktProperty.findAnnotation(FqName("godot.annotation.DoubleRange"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkFloatRange(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        if (ktProperty.type()?.isFloat() == false) {
            holder.registerProblem(
                "Property must be of type ${Float::class.qualifiedName}",
                ktProperty.findAnnotation(FqName("godot.annotation.FloatRange"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkLongRange(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        if (ktProperty.type()?.isLong() == false) {
            holder.registerProblem(
                "Property must be of type ${Long::class.qualifiedName}",
                ktProperty.findAnnotation(FqName("godot.annotation.LongRange"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkIntRange(ktProperty: KtProperty, holder: AnnotationHolder) {
        checkForRegistrationAnnotation(ktProperty, holder)
        if (ktProperty.type()?.isInt() == false) {
            holder.registerProblem(
                "Property must be of type ${Int::class.qualifiedName}",
                ktProperty.findAnnotation(FqName("godot.annotation.IntRange"))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun checkForRegistrationAnnotation(ktProperty: KtProperty, holder: AnnotationHolder) {
        if (ktProperty.findAnnotation(FqName("godot.annotation.RegisterProperty")) == null) {
            holder.registerProblem(
                "Property has a type hint but is not registered",
                ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }
}
