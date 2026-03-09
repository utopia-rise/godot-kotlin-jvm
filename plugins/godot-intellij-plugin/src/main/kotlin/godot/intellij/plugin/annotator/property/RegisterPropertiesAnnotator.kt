package godot.intellij.plugin.annotator.property

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.annotator.general.checkNotGeneric
import godot.intellij.plugin.data.model.EXPORT_ANNOTATION
import godot.intellij.plugin.data.model.REGISTER_PROPERTY_ANNOTATION
import godot.intellij.plugin.extension.asClassId
import godot.intellij.plugin.extension.isCoreType
import godot.intellij.plugin.extension.isGodotPrimitive
import godot.intellij.plugin.extension.isInGodotRoot
import godot.intellij.plugin.extension.isNullable
import godot.intellij.plugin.extension.isOrInheritsType
import godot.intellij.plugin.extension.isSupportedJvmType
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.quickfix.PropertyNotRegisteredQuickFix
import godot.intellij.plugin.quickfix.RegisterPropertyMutabilityQuickFix
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.godotAnnotationPackage
import godot.tools.common.constants.godotApiPackage
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.kotlinCollectionsPackage
import org.jetbrains.kotlin.analysis.api.KaExperimentalApi
import org.jetbrains.kotlin.analysis.api.analyze
import org.jetbrains.kotlin.analysis.api.symbols.typeParameters
import org.jetbrains.kotlin.analysis.api.types.symbol
import org.jetbrains.kotlin.asJava.toLightElements
import org.jetbrains.kotlin.idea.codeinsight.utils.isEnum
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.utils.addToStdlib.firstIsInstance

class RegisterPropertiesAnnotator : Annotator {
    private val mutabilityQuickFix by lazy { RegisterPropertyMutabilityQuickFix() }
    private val propertyNotRegisteredQuickFix by lazy { PropertyNotRegisteredQuickFix() }
    private val propertyHintAnnotationChecker by lazy { PropertyHintAnnotationChecker() }

    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (!element.isInGodotRoot()) return

        if (element is KtProperty) {
            if (element.findAnnotation(asClassId(REGISTER_PROPERTY_ANNOTATION)) != null) {
                checkNotGeneric(element.toLightElements().firstIsInstance(), holder)
                checkMutability(element, holder)
                checkRegisteredType(element, holder)
                lateinitChecks(element, holder)
                nullableChecks(element, holder)
            }
            // outside to check if the property is also registered
            propertyHintAnnotationChecker.checkPropertyHintAnnotations(element, holder)
            checkExportAnnotation(element, holder)
        }
    }

    private fun checkMutability(ktProperty: KtProperty, holder: AnnotationHolder) {
        if (!ktProperty.isVar) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.mutability"),
                ktProperty.valOrVarKeyword,
                mutabilityQuickFix
            )
        }
    }

    private fun checkExportAnnotation(ktProperty: KtProperty, holder: AnnotationHolder) {
        if (ktProperty.findAnnotation(asClassId(EXPORT_ANNOTATION)) != null) {
            if (ktProperty.findAnnotation(asClassId(REGISTER_PROPERTY_ANNOTATION)) == null) {
                holder.registerProblem(
                    GodotPluginBundle.message("problem.property.export.notRegistered"),
                    ktProperty.nameIdentifier ?: ktProperty.navigationElement,
                    propertyNotRegisteredQuickFix
                )
            }
        }
    }

    @OptIn(KaExperimentalApi::class)
    private fun checkRegisteredType(ktProperty: KtProperty, holder: AnnotationHolder) {
        val isEnumCollection = analyze(ktProperty) {
            ktProperty.returnType.symbol?.classId?.asFqNameString()?.startsWith(kotlinCollectionsPackage) == true
                && ktProperty.returnType.symbol?.typeParameters?.firstOrNull()?.defaultType?.isEnum() == true
        }
        // enum flag is the only case where registering a kotlin collection is allowed
        if (
            isEnumCollection &&
            ktProperty.findAnnotation(asClassId("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.enumFlag}")) == null
        ) {
            // TODO: add quick fix
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.registeredKotlinCollection"),
                getInitializerProblemLocation(ktProperty)
            )
        }

        val isEnumVariantArray = analyze(ktProperty) {
            ktProperty.returnType.symbol?.classId?.asFqNameString()?.startsWith("$godotCorePackage.${GodotKotlinJvmTypes.variantArray}") == true
                && ktProperty.returnType.symbol?.typeParameters?.firstOrNull()?.defaultType?.isEnum() == true
        }
        if (isEnumVariantArray) {
            // TODO: add quick fix
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.registeredEnumListWithVariantArray"),
                getInitializerProblemLocation(ktProperty)
            )
        }

        val isInheritingObject = ktProperty.isOrInheritsType(asClassId("$godotApiPackage.${GodotKotlinJvmTypes.obj}"))
        val isCoreType = ktProperty.isCoreType()
        val isSupportedJvmType = ktProperty.isSupportedJvmType()

        if (
            !isInheritingObject
            && !isCoreType
            && !isSupportedJvmType
        ) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.export.triedToExportUnsupportedType"),
                ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun lateinitChecks(ktProperty: KtProperty, holder: AnnotationHolder) {
        if (
            ktProperty.hasModifier(org.jetbrains.kotlin.lexer.KtTokens.LATEINIT_KEYWORD)
            && (ktProperty.isCoreType() || ktProperty.isGodotPrimitive())
        ) {
            holder.registerProblem(
                message = GodotPluginBundle.message("problem.property.lateinit.coreType"),
                errorLocation = ktProperty.nameIdentifier ?: ktProperty.navigationElement,
            )
        }
    }

    private fun nullableChecks(ktProperty: KtProperty, holder: AnnotationHolder) {
        if (
            ktProperty.isNullable()
            && (ktProperty.isCoreType() == true || ktProperty.isGodotPrimitive() == true)
        ) {
            holder.registerProblem(
                message = GodotPluginBundle.message("problem.property.nullable"),
                errorLocation = ktProperty.nameIdentifier ?: ktProperty.navigationElement,
            )
        }
    }

    private fun getInitializerProblemLocation(ktProperty: KtProperty) =
        ktProperty.initializer?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
}

